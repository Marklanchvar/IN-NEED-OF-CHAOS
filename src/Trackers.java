public class Trackers
{
    float[] x;
    float[] y;
    float[] z;
    float[] xy;
    float[] zy;
    int[] skd;
    int[] dam;
    boolean[] notwall;
    boolean[] decor;
    int[][] c;
    float[] radx;
    float[] radz;
    float[] rady;
    int nt;
    float sx;
    float sz;
    float ncx;
    float ncz;
    int[][][] sect;
    
    public Trackers() {
        this.x = new float[6700];
        this.y = new float[6700];
        this.z = new float[6700];
        this.xy = new float[6700];
        this.zy = new float[6700];
        this.skd = new int[6700];
        this.dam = new int[6700];
        this.notwall = new boolean[6700];
        this.decor = new boolean[6700];
        this.c = new int[6700][3];
        this.radx = new float[6700];
        this.radz = new float[6700];
        this.rady = new float[6700];
        this.nt = 0;
        this.sx = 0;
        this.sz = 0;
        this.ncx = 0;
        this.ncz = 0;
        this.sect = null;
    }
    
    public void devidetrackers(final int sx, final int n, final int sz, final int n2) {
        this.sect = null;
        this.sx = sx;
        this.sz = sz;
        this.ncx = n / 3000;
        if (this.ncx <= 0) {
            this.ncx = 1;
        }
        this.ncz = n2 / 3000;
        if (this.ncz <= 0) {
            this.ncz = 1;
        }
        this.sect = new int[(int) this.ncx][(int) this.ncz][];
        for (int i = 0; i < this.ncx; ++i) {
            for (int j = 0; j < this.ncz; ++j) {
                final float n3 = this.sx + i * 3000 + 1500;
                final float n4 = this.sz + j * 3000 + 1500;
                final int[] array = new int[6700];
                int n5 = 0;
                for (int k = 0; k < this.nt; ++k) {
                    final float py = this.py(n3, this.x[k], n4, this.z[k]);
                    if (py < 20250000 && py > 0 && this.dam[k] != 167) {
                        array[n5] = k;
                        ++n5;
                    }
                }
                if (i == 0 || j == 0 || i == this.ncx - 1 || j == this.ncz - 1) {
                    for (int l = 0; l < this.nt; ++l) {
                        if (this.dam[l] == 167) {
                            array[n5] = l;
                            ++n5;
                        }
                    }
                }
                if (n5 == 0) {
                    array[n5] = 0;
                    ++n5;
                }
                this.sect[i][j] = new int[n5];
                for (int n6 = 0; n6 < n5; ++n6) {
                    this.sect[i][j][n6] = array[n6];
                }
            }
        }
        for (int n7 = 0; n7 < this.nt; ++n7) {
            if (this.dam[n7] == 167) {
                this.dam[n7] = 1;
            }
        }
        --this.ncx;
        --this.ncz;
    }
    
    public float py(final float n3, final float x2, final float n4, final float z2) {
        return (n3 - x2) * (n3 - x2) + (n4 - z2) * (n4 - z2);
    }
}
