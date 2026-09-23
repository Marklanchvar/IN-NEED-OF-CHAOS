import java.net.URL;

/**
 * Loads tracker music through NativeBass and keeps the existing SuperClip API.
 * NativeBass handles MOD, XM and S3M decoding; the old ds.nfm/ibxm decoders are
 * no longer used by the game.
 */
public class RadicalMod {
    private static final int OUTPUT_RATE = 22000;

    SuperClip sClip;
    boolean playing;
    int loaded;
    int rvol;
    String imod;
    String pmod;

    public RadicalMod() {
        this.playing = false;
        this.loaded = 0;
        this.rvol = 0;
        this.imod = "";
        this.pmod = "";
    }

    public RadicalMod(String replace, int n, int n2, final int n3,
                      final boolean calculateVolume, final boolean remote) {
        this();
        try {
            final byte[] archive;
            if (remote) {
                replace = replace.replace(' ', '_');
                archive = NativeBassModuleRenderer.read(new URL(
                    "http://multiplayer.needformadness.com/tracks/music/"
                    + replace + ".zip"));
            } else {
                archive = NativeBassModuleRenderer.read(Madness.fpath + replace);
            }
            loadArchive(archive, n, calculateVolume);
        } catch (final Exception ex) {
            System.out.println("Error downloading and making Mod: " + ex);
            this.loaded = 0;
        }
    }

    public RadicalMod(final String str) {
        this();
        this.loaded = 1;
        this.imod = Madness.fpath + str;
    }

    public void loadimod(final boolean calculateVolume) {
        if (this.loaded != 1) {
            return;
        }
        try {
            loadArchive(NativeBassModuleRenderer.read(this.imod), 44000,
                        calculateVolume);
        } catch (final Exception ex) {
            System.out.println("Error making a imod: " + ex);
            this.loaded = 0;
        }
    }

    public void loadpmod(final boolean calculateVolume) {
        if (this.loaded != 1) {
            return;
        }
        try {
            loadArchive(NativeBassModuleRenderer.read(this.pmod), 44000,
                        calculateVolume);
        } catch (final Exception ex) {
            System.out.println("Error making a pmod: " + ex);
            this.loaded = 0;
        }
    }

    private void loadArchive(final byte[] archive, final int gain,
                             final boolean calculateVolume) throws Exception {
        final NativeBassModuleRenderer.RenderedAudio audio =
            NativeBassModuleRenderer.renderZip(archive, OUTPUT_RATE, gain);
        if (calculateVolume) {
            this.rvol = audio.averageVolume;
        }
        this.sClip = new SuperClip(audio.pcm, audio.length, OUTPUT_RATE);
        this.sClip.rollBackPos = 0;
        this.sClip.rollBackTrig = 0;
        this.loaded = 2;
    }

    public RadicalMod(final String pmod, final boolean ignored) {
        this();
        this.loaded = 1;
        this.pmod = pmod;
        this.loadpmod(true);
    }

    public void play() {
        if (!this.playing && this.loaded == 2) {
            this.sClip.play();
            if (this.sClip.stoped == 0) this.playing = true;
        }
    }

    public void resume() {
        if (!this.playing && this.loaded == 2) {
            this.sClip.resume();
            if (this.sClip.stoped == 0) this.playing = true;
        }
    }

    public void stop() {
        if (this.playing && this.loaded == 2) {
            this.sClip.stop();
            this.playing = false;
        }
    }

    protected void unloadimod() {
        closeClip();
        this.loaded = 1;
    }

    protected void unload() {
        closeClip();
        this.imod = null;
        this.pmod = null;
        this.loaded = 0;
    }

    private void closeClip() {
        if (this.sClip != null) {
            if (this.playing) this.sClip.stop();
            try { this.sClip.close(); } catch (final Exception ignored) { }
            this.sClip = null;
        }
        this.playing = false;
    }
}
