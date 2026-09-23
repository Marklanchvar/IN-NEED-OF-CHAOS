import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import jouvieje.bass.Bass;
import jouvieje.bass.BassInit;
import jouvieje.bass.exceptions.BassException;
import jouvieje.bass.defines.BASS_ATTRIB;
import jouvieje.bass.defines.BASS_MUSIC;
import jouvieje.bass.defines.BASS_POS;
import jouvieje.bass.structures.HMUSIC;

public class RadicalMod {
    private static final int SAMPLE_RATE = 44100;
    private static final int MUSIC_FLAGS = BASS_MUSIC.BASS_MUSIC_RAMPS | BASS_MUSIC.BASS_MUSIC_LOOP;
    private static boolean bassReady;
    private static boolean bassAttempted;

    private HMUSIC music;
    private boolean playing;
    private int loaded;
    int rvol;
    String imod;
    String pmod;

    public RadicalMod() {
        playing = false;
        loaded = 0;
        rvol = 0;
        imod = "";
        pmod = "";
    }

    public RadicalMod(final String replace, final int volume, final int ignoredRate,
            final int bpm, final boolean ignoredCalVolume, final boolean remote) {
        this();
        try {
            ensureBass();
            final File moduleFile = remote
                    ? extractModule(new URL("http://multiplayer.needformadness.com/tracks/music/"
                            + replace.replace(' ', '_') + ".zip").openStream())
                    : extractModule(new FileInputStream(new File(Madness.fpath + replace)));
            load(moduleFile, volume, bpm);
            moduleFile.delete();
        } catch (final Exception ex) {
            System.out.println("Error loading NativeBass module: " + ex);
            unload();
        }
    }

    public RadicalMod(final String str) {
        this();
        loaded = 1;
        imod = Madness.fpath + str;
    }

    public RadicalMod(final String pmod, final boolean ignoredRemote) {
        this();
        loaded = 1;
        this.pmod = pmod;
        loadpmod(true);
    }

    private static File nativeDirectory() {
        final String os = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
        final String arch = System.getProperty("os.arch", "").toLowerCase(Locale.ROOT);
        final String platform;
        if (os.contains("win")) platform = arch.contains("64") ? "win64" : "win32";
        else if (os.contains("mac")) platform = "mac";
        else if (os.contains("linux")) platform = arch.contains("64") ? "linux64" : "linux32";
        else throw new IllegalStateException("Unsupported operating system: " + os);

        File root = new File(Madness.fpath == null ? "" : Madness.fpath);
        if (!root.isDirectory()) root = new File(System.getProperty("user.dir", "."));
        File dir = new File(root, "lib" + File.separator + platform);
        if (!dir.isDirectory()) dir = new File(System.getProperty("user.dir", "."), "lib" + File.separator + platform);
        if (!dir.isDirectory()) throw new IllegalStateException("Missing native directory: " + dir.getAbsolutePath());
        return dir;
    }

    private static void loadNative(final File dir, final String... names) {
        for (final String name : names) {
            final File file = new File(dir, name);
            if (file.isFile()) {
                System.load(file.getAbsolutePath());
                return;
            }
        }
        throw new IllegalStateException("Native library not found in " + dir.getAbsolutePath());
    }

    private static synchronized void ensureBass() throws BassException {
        if (bassReady) return;
        if (bassAttempted) throw new BassException("NativeBass initialization previously failed");
        bassAttempted = true;
        final File dir = nativeDirectory();
        final String os = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
        final String arch = System.getProperty("os.arch", "").toLowerCase(Locale.ROOT);
        try {
            if (os.contains("win")) {
                loadNative(dir, "bass.dll");
                loadNative(dir, arch.contains("64") ? "NativeBass64.dll" : "NativeBass.dll");
            } else if (os.contains("mac")) {
                loadNative(dir, "libbass.dylib");
                loadNative(dir, "libNativeBass.jnilib");
            } else {
                loadNative(dir, "libbass.so");
                loadNative(dir, arch.contains("64") ? "libNativeBass64.so" : "libNativeBass.so");
                loadNative(dir, arch.contains("64") ? "libLibLoader64.so" : "libLibLoader.so");
            }
            BassInit.loadLibraries();
            if (!Bass.BASS_Init(-1, SAMPLE_RATE, 0, null, null)) {
                throw new BassException("BASS_Init failed, error " + Bass.BASS_ErrorGetCode());
            }
            bassReady = true;
        } catch (final UnsatisfiedLinkError ex) {
            throw new BassException("NativeBass dependency load failed: " + ex.getMessage());
        }
    }

    private void load(final File file, final int volume, final int bpm) throws BassException {
        freeMusic();
        music = Bass.BASS_MusicLoad(false, file.getAbsolutePath(), 0, 0, MUSIC_FLAGS, SAMPLE_RATE);
        if (music == null) throw new BassException("BASS_MusicLoad failed, error " + Bass.BASS_ErrorGetCode());
        Bass.BASS_ChannelSetAttribute(music.asInt(), BASS_ATTRIB.BASS_ATTRIB_VOL,
                Math.max(0.0f, Math.min(1.0f, volume / 300.0f)));
        if (bpm > 0) Bass.BASS_ChannelSetAttribute(music.asInt(), BASS_ATTRIB.BASS_ATTRIB_MUSIC_BPM, bpm);
        loaded = 2;
    }

    private static File extractModule(final InputStream source) throws Exception {
        final File result = File.createTempFile("nfm-nativebass-", ".mod");
        boolean found = false;
        try (InputStream in = source; ZipInputStream zip = new ZipInputStream(in);
                FileOutputStream out = new FileOutputStream(result)) {
            ZipEntry entry;
            while ((entry = zip.getNextEntry()) != null) {
                if (entry.isDirectory()) continue;
                final String name = entry.getName().toLowerCase(Locale.ROOT);
                if (name.endsWith(".mod") || name.endsWith(".xm") || name.endsWith(".s3m")
                        || name.endsWith(".it") || name.endsWith(".mtm") || name.endsWith(".umx")) {
                    final byte[] buffer = new byte[8192];
                    int read;
                    while ((read = zip.read(buffer)) != -1) out.write(buffer, 0, read);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            result.delete();
            throw new IllegalArgumentException("Archive contains no supported tracker module");
        }
        return result;
    }

    public void loadimod(final boolean loud) {
        if (loaded != 1) return;
        try {
            ensureBass();
            final File file = new File(imod);
            if (file.getName().toLowerCase(Locale.ROOT).endsWith(".zip")) {
                final File extracted = extractModule(new FileInputStream(file));
                load(extracted, loud ? 300 : 160, 125);
                extracted.delete();
            } else load(file, loud ? 300 : 160, 125);
        } catch (final Exception ex) {
            System.out.println("Error loading module: " + ex);
            loaded = 0;
        }
    }

    public void loadpmod(final boolean loud) {
        if (loaded != 1) return;
        try {
            ensureBass();
            final File file = new File(pmod);
            if (file.getName().toLowerCase(Locale.ROOT).endsWith(".zip")) {
                final File extracted = extractModule(new FileInputStream(file));
                load(extracted, loud ? 300 : 160, 125);
                extracted.delete();
            } else load(file, loud ? 300 : 160, 125);
        } catch (final Exception ex) {
            System.out.println("Error loading module: " + ex);
            loaded = 0;
        }
    }

    public void play() {
        if (loaded == 2 && music != null && Bass.BASS_ChannelPlay(music.asInt(), true)) playing = true;
    }

    public void resume() {
        if (loaded == 2 && music != null && Bass.BASS_ChannelPlay(music.asInt(), false)) playing = true;
    }

    public void stop() {
        if (music != null) Bass.BASS_ChannelStop(music.asInt());
        playing = false;
    }

    protected void unloadimod() {
        stop();
        freeMusic();
        loaded = 1;
    }

    protected void unload() {
        stop();
        freeMusic();
        imod = null;
        pmod = null;
        loaded = 0;
    }

    private void freeMusic() {
        if (music != null) {
            Bass.BASS_MusicFree(music);
            music = null;
        }
    }

    int availableBytes() {
        if (music == null) return 0;
        final long length = Bass.BASS_ChannelGetLength(music.asInt(), BASS_POS.BASS_POS_BYTE);
        final long position = Bass.BASS_ChannelGetPosition(music.asInt(), BASS_POS.BASS_POS_BYTE);
        return (int)Math.max(0L, Math.min(Integer.MAX_VALUE, length - position));
    }

    public static synchronized void shutdownAudio() {
        if (bassReady) {
            Bass.BASS_Free();
            bassReady = false;
        }
    }
}
