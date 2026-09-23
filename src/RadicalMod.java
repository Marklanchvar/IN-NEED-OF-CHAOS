import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import un4seen.bass.BASS;

/**
 * Module music player backed by BASS.
 *
 * <p>Modules are loaded into BASS as native music channels.  The old
 * implementation decoded the complete module through ds.nfm/ibxm and then
 * sent the generated PCM to JavaSound; this class deliberately does not use
 * either decoder.</p>
 */
public class RadicalMod {
    /* Kept for source compatibility with older callers. Playback is BASS. */
    SuperClip sClip;
    boolean playing;
    int loaded;
    int rvol;
    String imod;
    String pmod;

    private static final int OUTPUT_RATE = 22000;
    private static final int MUSIC_FLAGS = BASS.BASS_MUSIC_LOOP
            | BASS.BASS_MUSIC_RAMP
            | BASS.BASS_MUSIC_SINCINTER
            | BASS.BASS_MUSIC_PRESCAN;
    private int channel;
    private static boolean bassReady;

    private static synchronized boolean initBass() {
        if (bassReady) {
            return true;
        }
        try {
            if (!BASS.BASS_Init(-1, 44100, 0)) {
                final int error = BASS.BASS_ErrorGetCode();
                if (error != BASS.BASS_ERROR_ALREADY) {
                    System.out.println("Unable to initialise BASS. Error: " + error);
                    return false;
                }
            }
            bassReady = true;
            return true;
        } catch (final UnsatisfiedLinkError ex) {
            System.out.println("Unable to load BASS native library: " + ex);
            return false;
        }
    }

    public RadicalMod() {
        playing = false;
        loaded = 0;
        rvol = 3750;
        imod = "";
        pmod = "";
        channel = 0;
    }

    public RadicalMod(final String replace, final int n, final int n2, final int n3,
                      final boolean b, final boolean b2) {
        this();
        try {
            final InputStream input;
            if (b2) {
                input = new URL("http://multiplayer.needformadness.com/tracks/music/"
                        + replace.replace(' ', '_') + ".zip").openStream();
            } else {
                input = new FileInputStream(new File(Madness.fpath + replace));
            }
            loadBytes(readModule(input, replace));
        } catch (final Exception ex) {
            System.out.println("Error loading module with BASS: " + ex);
            unload();
        }
    }

    public RadicalMod(final String str) {
        this();
        loaded = 1;
        imod = Madness.fpath + str;
    }

    public void loadimod(final boolean b) {
        if (loaded == 1) {
            try {
                loadBytes(readModule(new FileInputStream(new File(imod)), imod));
            } catch (final Exception ex) {
                System.out.println("Error loading module with BASS: " + ex);
                loaded = 0;
            }
        }
    }

    public void loadpmod(final boolean b) {
        if (loaded == 1 && pmod != null && !pmod.isEmpty()) {
            try {
                loadBytes(readModule(new FileInputStream(new File(pmod)), pmod));
            } catch (final Exception ex) {
                System.out.println("Error loading module with BASS: " + ex);
                loaded = 0;
            }
        }
    }

    public RadicalMod(final String pmod, final boolean b) {
        this();
        loaded = 1;
        this.pmod = pmod;
        loadpmod(b);
    }

    private void loadBytes(final byte[] bytes) {
        stop();
        freeChannel();
        if (bytes == null || bytes.length == 0 || !initBass()) {
            loaded = 0;
            return;
        }

        final ByteBuffer buffer = ByteBuffer.allocateDirect(bytes.length);
        buffer.put(bytes).flip();
        channel = BASS.BASS_MusicLoad(buffer, 0, bytes.length, MUSIC_FLAGS, OUTPUT_RATE);
        if (channel == 0) {
            System.out.println("BASS could not load module. Error: " + BASS.BASS_ErrorGetCode());
            loaded = 0;
            return;
        }
        loaded = 2;
    }

    private static byte[] readModule(final InputStream input, final String name) throws Exception {
        try (InputStream in = input) {
            final byte[] file = readAll(in);
            if (!name.toLowerCase(Locale.ROOT).endsWith(".zip")) {
                return file;
            }
            try (ZipInputStream zip = new ZipInputStream(new java.io.ByteArrayInputStream(file))) {
                ZipEntry entry;
                while ((entry = zip.getNextEntry()) != null) {
                    if (!entry.isDirectory() && isModuleName(entry.getName())) {
                        return readAll(zip);
                    }
                }
            }
            throw new java.io.IOException("ZIP contains no MOD/XM/S3M/IT module: " + name);
        }
    }

    private static boolean isModuleName(final String name) {
        final String lower = name.toLowerCase(Locale.ROOT);
        return lower.endsWith(".mod") || lower.endsWith(".xm")
                || lower.endsWith(".s3m") || lower.endsWith(".it")
                || lower.endsWith(".mtm") || lower.endsWith(".mo3");
    }

    private static byte[] readAll(final InputStream input) throws Exception {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final byte[] buf = new byte[8192];
        int count;
        while ((count = input.read(buf)) != -1) {
            out.write(buf, 0, count);
        }
        return out.toByteArray();
    }

    public void play() {
        if (!playing && loaded == 2 && channel != 0 && BASS.BASS_ChannelPlay(channel, true)) {
            playing = true;
        }
    }

    public void resume() {
        if (!playing && loaded == 2 && channel != 0 && BASS.BASS_ChannelPlay(channel, false)) {
            playing = true;
        }
    }

    public void stop() {
        if (channel != 0) {
            BASS.BASS_ChannelStop(channel);
        }
        playing = false;
    }

    protected void unloadimod() {
        stop();
        freeChannel();
        loaded = 1;
    }

    protected void unload() {
        stop();
        freeChannel();
        imod = null;
        pmod = null;
        loaded = 0;
    }

    private void freeChannel() {
        if (channel != 0) {
            BASS.BASS_MusicFree(channel);
            channel = 0;
        }
        sClip = null;
    }
}
