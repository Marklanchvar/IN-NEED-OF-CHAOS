import static jouvieje.bass.Bass.*;
import static jouvieje.bass.defines.BASS_MUSIC.BASS_MUSIC_RAMPS;
import static jouvieje.bass.defines.BASS_SAMPLE.BASS_SAMPLE_LOOP;
import jouvieje.bass.BassInit;
import jouvieje.bass.structures.HMUSIC;
import jouvieje.bass.utils.BufferUtils;
import static jouvieje.bass.defines.BASS_POS.BASS_POS_BYTE;

import java.io.*;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.nio.ByteBuffer;

public class RadicalMod {
    private static boolean bassReady = false;
    HMUSIC music;
    boolean playing;
    int loaded;
    int rvol;
    String imod, pmod;

    public int length() {
        if (music == null || loaded != 2) return 0;
        return (int) BASS_ChannelGetLength(music.asInt(), BASS_POS_BYTE);
    }

    public void seek(int bytes) {
        if (music == null || loaded != 2) return;
        BASS_ChannelSetPosition(music.asInt(), bytes, BASS_POS_BYTE);
    }
    
    public int available() {
        if (music == null || loaded != 2) return 0;
        long len = BASS_ChannelGetLength(music.asInt(), BASS_POS_BYTE);
        long pos = BASS_ChannelGetPosition(music.asInt(), BASS_POS_BYTE);
        return (int) Math.max(0, len - pos);
    }
    
    private static byte[] unzipMod(InputStream in) throws IOException {
        ZipInputStream z = new ZipInputStream(in);
        ZipEntry e = z.getNextEntry();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[8192];
        int n;
        while ((n = z.read(buf)) != -1) out.write(buf, 0, n);
        z.close();
        return out.toByteArray();
    }

    private void loadFromBytes(byte[] data) {
        ByteBuffer bb = BufferUtils.newByteBuffer(data.length);
        bb.put(data).flip();
        music = BASS_MusicLoad(true, BufferUtils.asPointer(bb), 0L, data.length,
                BASS_SAMPLE_LOOP | BASS_MUSIC_RAMPS, 0);
        loaded = (music != null && music.asInt() != 0) ? 2 : 0;
    }

    public RadicalMod() {
        playing = false; loaded = 0; rvol = 0; imod = pmod = "";
    }

    public RadicalMod(String path, int n, int n2, int n3, boolean b, boolean b2) {
        this();
        try {
            byte[] data = b2
                ? unzipMod(new URL("http://multiplayer.needformadness.com/tracks/music/" + path.replace(' ', '_') + ".zip").openStream())
                : unzipMod(new FileInputStream(Madness.fpath + path));
            loadFromBytes(data);
        } catch (Exception e) {
            System.out.println("Error loading Mod: " + e);
            loaded = 0;
        }
    }

    public RadicalMod(String str) {
        this();
        loaded = 1;
        imod = Madness.fpath + str;
    }

    public RadicalMod(String pmod, boolean b) {
        this();
        loaded = 1;
        this.pmod = pmod;
        loadpmod(true);
    }

    public void loadimod(boolean b) {
        if (loaded != 1) return;
        try {
            loadFromBytes(unzipMod(new FileInputStream(imod)));
        } catch (Exception e) {
            System.out.println("Error making imod: " + e);
            loaded = 0;
        }
    }

    public void loadpmod(boolean b) {
        if (loaded != 1) return;
        try {
            loadFromBytes(unzipMod(new FileInputStream(pmod)));
        } catch (Exception e) {
            System.out.println("Error making pmod: " + e);
            loaded = 0;
        }
    }

    public void play() {
        if (!playing && loaded == 2 && music != null) {
            BASS_ChannelPlay(music.asInt(), true);
            playing = true;
        }
    }

    public void resume() {
        if (!playing && loaded == 2 && music != null) {
            BASS_ChannelPlay(music.asInt(), false);
            playing = true;
        }
    }

    public void stop() {
        if (playing && loaded == 2 && music != null) {
            BASS_ChannelPause(music.asInt());
            playing = false;
        }
    }

    protected void unloadimod() {
        if (loaded == 2) {
            if (playing) { BASS_ChannelStop(music.asInt()); playing = false; }
            if (music != null) { BASS_MusicFree(music); music = null; }
            loaded = 1;
        }
    }

    protected void unload() {
        if (loaded == 2) {
            if (playing) { BASS_ChannelStop(music.asInt()); playing = false; }
            if (music != null) { BASS_MusicFree(music); music = null; }
        }
        imod = null;
        loaded = 0;
    }
}