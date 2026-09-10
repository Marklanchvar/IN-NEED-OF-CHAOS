public class Wheels
{
    float ground;
    int mast;
    int sparkat;
    int[] rc;
    float size;
    float depth;
    
    public Wheels() {
        this.ground = 0;
        this.mast = 0;
        this.sparkat = 0;
        this.rc = new int[] { 120, 120, 120 };
        this.size = 2.0f;
        this.depth = 3.0f;
        this.sparkat = 0;
        this.ground = 0;
    }
    
    public void setrims(final int n, final int n2, final int n3, final int n4, final int n5) {
        this.rc[0] = n;
        this.rc[1] = n2;
        this.rc[2] = n3;
        this.size = n4 / 10.0f;
        if (this.size < 0.0f) {
            this.size = 0.0f;
        }
        this.depth = n5 / 10.0f;
        if (this.depth / this.size > 41.0f) {
            this.depth = this.size * 41.0f;
        }
        if (this.depth / this.size < -25.0f) {
            this.depth = -(this.size * 25.0f);
        }
    }
    
    public void make(final Medium medium, final Trackers trackers, final Plane[] planeArray, int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final float[] planeX = new float[20];
        final float[] planeY = new float[20];
        final float[] planeZ = new float[20];
        final int[] planeColor = { 45, 45, 45 };
        float n9 = 0;
        final float n10 = n6 / 10.0f;
        final float n11 = n7 / 10.0f;
        if (n5 == 11) {
            n9 = (n2 + 4.0f * n10);
        }
        this.sparkat = (int)(n11 * 24.0f);
        this.ground = (n3 + 13.0f * n11);
        int n12 = -1;
        if (n2 < 0) {
            n12 = 1;
        }
        for (int i = 0; i < 20; ++i) {
            planeX[i] = (n2 - 4.0f * n10);
        }
        planeY[0] = (n3 - 9.1923f * n11);
        planeZ[0] = (n4 + 9.1923f * n11);
        planeY[1] = (n3 - 12.557f * n11);
        planeZ[1] = (n4 + 3.3646f * n11);
        planeY[2] = (n3 - 12.557f * n11);
        planeZ[2] = (n4 - 3.3646f * n11);
        planeY[3] = (n3 - 9.1923f * n11);
        planeZ[3] = (n4 - 9.1923f * n11);
        planeY[4] = (n3 - 3.3646f * n11);
        planeZ[4] = (n4 - 12.557f * n11);
        planeY[5] = (n3 + 3.3646f * n11);
        planeZ[5] = (n4 - 12.557f * n11);
        planeY[6] = (n3 + 9.1923f * n11);
        planeZ[6] = (n4 - 9.1923f * n11);
        planeY[7] = (n3 + 12.557f * n11);
        planeZ[7] = (n4 - 3.3646f * n11);
        planeY[8] = (n3 + 12.557f * n11);
        planeZ[8] = (n4 + 3.3646f * n11);
        planeY[9] = (n3 + 9.1923f * n11);
        planeZ[9] = (n4 + 9.1923f * n11);
        planeY[10] = (n3 + 3.3646f * n11);
        planeZ[10] = (n4 + 12.557f * n11);
        planeY[11] = (n3 - 3.3646f * n11);
        planeZ[11] = (n4 + 12.557f * n11);
        planeY[12] = n3;
        planeZ[12] = (n4 + 10.0f * this.size);
        planeY[13] = (n3 + 8.66f * this.size);
        planeZ[13] = (n4 + 5.0f * this.size);
        planeY[14] = (n3 + 8.66f * this.size);
        planeZ[14] = (n4 - 5.0f * this.size);
        planeY[15] = n3;
        planeZ[15] = (n4 - 10.0f * this.size);
        planeY[16] = (n3 - 8.66f * this.size);
        planeZ[16] = (n4 - 5.0f * this.size);
        planeY[17] = (n3 - 8.66f * this.size);
        planeZ[17] = (n4 + 5.0f * this.size);
        planeY[18] = n3;
        planeZ[18] = (n4 + 10.0f * this.size);
        planeY[19] = (n3 - 3.3646f * n11);
        planeZ[19] = (n4 + 12.557f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 20, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, false);
        planeArray[n].master = 1;
        ++n;
        planeX[2] = (n2 - this.depth * n10);
        planeY[2] = n3;
        planeZ[2] = n4;
        int n13 = (int)(n8 - this.depth / this.size * 4.0f);
        if (n13 < -16) {
            n13 = -16;
        }
        planeY[0] = n3;
        planeZ[0] = (n4 + 10.0f * this.size);
        planeY[1] = (n3 + 8.66f * this.size);
        planeZ[1] = (n4 + 5.0f * this.size);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 3, this.rc, 0, n13, 0, n9, n3, n4, 7, 0, false, 0, false);
        if (this.depth / this.size < 7.0f) {
            planeArray[n].master = 2;
        }
        ++n;
        planeY[0] = (n3 + 8.66f * this.size);
        planeZ[0] = (n4 + 5.0f * this.size);
        planeY[1] = (n3 + 8.66f * this.size);
        planeZ[1] = (n4 - 5.0f * this.size);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 3, this.rc, 0, n13, 0, n9, n3, n4, 7, 0, false, 0, false);
        if (this.depth / this.size < 7.0f) {
            planeArray[n].master = 2;
        }
        ++n;
        planeY[0] = (n3 + 8.66f * this.size);
        planeZ[0] = (n4 - 5.0f * this.size);
        planeY[1] = n3;
        planeZ[1] = (n4 - 10.0f * this.size);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 3, this.rc, 0, n13, 0, n9, n3, n4, 7, 0, false, 0, false);
        if (this.depth / this.size < 7.0f) {
            planeArray[n].master = 2;
        }
        ++n;
        planeY[0] = n3;
        planeZ[0] = (n4 - 10.0f * this.size);
        planeY[1] = (n3 - 8.66f * this.size);
        planeZ[1] = (n4 - 5.0f * this.size);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 3, this.rc, 0, n13, 0, n9, n3, n4, 7, 0, false, 0, false);
        if (this.depth / this.size < 7.0f) {
            planeArray[n].master = 2;
        }
        ++n;
        planeY[0] = (n3 - 8.66f * this.size);
        planeZ[0] = (n4 - 5.0f * this.size);
        planeY[1] = (n3 - 8.66f * this.size);
        planeZ[1] = (n4 + 5.0f * this.size);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 3, this.rc, 0, n13, 0, n9, n3, n4, 7, 0, false, 0, false);
        if (this.depth / this.size < 7.0f) {
            planeArray[n].master = 2;
        }
        ++n;
        planeY[0] = (n3 - 8.66f * this.size);
        planeZ[0] = (n4 + 5.0f * this.size);
        planeY[1] = n3;
        planeZ[1] = (n4 + 10.0f * this.size);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 3, this.rc, 0, n13, 0, n9, n3, n4, 7, 0, false, 0, false);
        if (this.depth / this.size < 7.0f) {
            planeArray[n].master = 2;
        }
        ++n;
        planeX[0] = (n2 - 4.0f * n10);
        planeY[0] = (n3 - 12.557f * n11);
        planeZ[0] = (n4 + 3.3646f * n11);
        planeX[1] = (n2 - 4.0f * n10);
        planeY[1] = (n3 - 12.557f * n11);
        planeZ[1] = (n4 - 3.3646f * n11);
        planeX[2] = (n2 + 4.0f * n10);
        planeY[2] = (n3 - 12.557f * n11);
        planeZ[2] = (n4 - 3.3646f * n11);
        planeX[3] = (n2 + 4.0f * n10);
        planeY[3] = (n3 - 12.557f * n11);
        planeZ[3] = (n4 + 3.3646f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 4, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, true);
        ++n;
        planeX[0] = (n2 - 4.0f * n10);
        planeY[0] = (n3 - 9.1923f * n11);
        planeZ[0] = (n4 - 9.1923f * n11);
        planeX[1] = (n2 - 4.0f * n10);
        planeY[1] = (n3 - 12.557f * n11);
        planeZ[1] = (n4 - 3.3646f * n11);
        planeX[2] = (n2 + 4.0f * n10);
        planeY[2] = (n3 - 12.557f * n11);
        planeZ[2] = (n4 - 3.3646f * n11);
        planeX[3] = (n2 + 4.0f * n10);
        planeY[3] = (n3 - 9.1923f * n11);
        planeZ[3] = (n4 - 9.1923f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 4, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, true);
        ++n;
        planeX[0] = (n2 - 4.0f * n10);
        planeY[0] = (n3 - 9.1923f * n11);
        planeZ[0] = (n4 - 9.1923f * n11);
        planeX[1] = (n2 - 4.0f * n10);
        planeY[1] = (n3 - 3.3646f * n11);
        planeZ[1] = (n4 - 12.557f * n11);
        planeX[2] = (n2 + 4.0f * n10);
        planeY[2] = (n3 - 3.3646f * n11);
        planeZ[2] = (n4 - 12.557f * n11);
        planeX[3] = (n2 + 4.0f * n10);
        planeY[3] = (n3 - 9.1923f * n11);
        planeZ[3] = (n4 - 9.1923f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 4, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, true);
        ++n;
        planeX[0] = (n2 - 4.0f * n10);
        planeY[0] = (n3 - 3.3646f * n11);
        planeZ[0] = (n4 - 12.557f * n11);
        planeX[1] = (n2 - 4.0f * n10);
        planeY[1] = (n3 + 3.3646f * n11);
        planeZ[1] = (n4 - 12.557f * n11);
        planeX[2] = (n2 + 4.0f * n10);
        planeY[2] = (n3 + 3.3646f * n11);
        planeZ[2] = (n4 - 12.557f * n11);
        planeX[3] = (n2 + 4.0f * n10);
        planeY[3] = (n3 - 3.3646f * n11);
        planeZ[3] = (n4 - 12.557f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 4, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, true);
        ++n;
        planeX[0] = (n2 - 4.0f * n10);
        planeY[0] = (n3 + 9.1923f * n11);
        planeZ[0] = (n4 - 9.1923f * n11);
        planeX[1] = (n2 - 4.0f * n10);
        planeY[1] = (n3 + 3.3646f * n11);
        planeZ[1] = (n4 - 12.557f * n11);
        planeX[2] = (n2 + 4.0f * n10);
        planeY[2] = (n3 + 3.3646f * n11);
        planeZ[2] = (n4 - 12.557f * n11);
        planeX[3] = (n2 + 4.0f * n10);
        planeY[3] = (n3 + 9.1923f * n11);
        planeZ[3] = (n4 - 9.1923f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 4, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, true);
        ++n;
        planeX[0] = (n2 - 4.0f * n10);
        planeY[0] = (n3 + 9.1923f * n11);
        planeZ[0] = (n4 - 9.1923f * n11);
        planeX[1] = (n2 - 4.0f * n10);
        planeY[1] = (n3 + 12.557f * n11);
        planeZ[1] = (n4 - 3.3646f * n11);
        planeX[2] = (n2 + 4.0f * n10);
        planeY[2] = (n3 + 12.557f * n11);
        planeZ[2] = (n4 - 3.3646f * n11);
        planeX[3] = (n2 + 4.0f * n10);
        planeY[3] = (n3 + 9.1923f * n11);
        planeZ[3] = (n4 - 9.1923f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 4, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, true);
        ++n;
        planeX[0] = (n2 - 4.0f * n10);
        planeY[0] = (n3 + 12.557f * n11);
        planeZ[0] = (n4 - 3.3646f * n11);
        planeX[1] = (n2 - 4.0f * n10);
        planeY[1] = (n3 + 12.557f * n11);
        planeZ[1] = (n4 + 3.3646f * n11);
        planeX[2] = (n2 + 4.0f * n10);
        planeY[2] = (n3 + 12.557f * n11);
        planeZ[2] = (n4 + 3.3646f * n11);
        planeX[3] = (n2 + 4.0f * n10);
        planeY[3] = (n3 + 12.557f * n11);
        planeZ[3] = (n4 - 3.3646f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 4, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, true);
        ++n;
        planeX[0] = (n2 - 4.0f * n10);
        planeY[0] = (n3 + 9.1923f * n11);
        planeZ[0] = (n4 + 9.1923f * n11);
        planeX[1] = (n2 - 4.0f * n10);
        planeY[1] = (n3 + 12.557f * n11);
        planeZ[1] = (n4 + 3.3646f * n11);
        planeX[2] = (n2 + 4.0f * n10);
        planeY[2] = (n3 + 12.557f * n11);
        planeZ[2] = (n4 + 3.3646f * n11);
        planeX[3] = (n2 + 4.0f * n10);
        planeY[3] = (n3 + 9.1923f * n11);
        planeZ[3] = (n4 + 9.1923f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 4, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, true);
        ++n;
        planeX[0] = (n2 - 4.0f * n10);
        planeY[0] = (n3 + 9.1923f * n11);
        planeZ[0] = (n4 + 9.1923f * n11);
        planeX[1] = (n2 - 4.0f * n10);
        planeY[1] = (n3 + 3.3646f * n11);
        planeZ[1] = (n4 + 12.557f * n11);
        planeX[2] = (n2 + 4.0f * n10);
        planeY[2] = (n3 + 3.3646f * n11);
        planeZ[2] = (n4 + 12.557f * n11);
        planeX[3] = (n2 + 4.0f * n10);
        planeY[3] = (n3 + 9.1923f * n11);
        planeZ[3] = (n4 + 9.1923f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 4, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, true);
        ++n;
        planeX[0] = (n2 - 4.0f * n10);
        planeY[0] = (n3 + 3.3646f * n11);
        planeZ[0] = (n4 + 12.557f * n11);
        planeX[1] = (n2 - 4.0f * n10);
        planeY[1] = (n3 - 3.3646f * n11);
        planeZ[1] = (n4 + 12.557f * n11);
        planeX[2] = (n2 + 4.0f * n10);
        planeY[2] = (n3 - 3.3646f * n11);
        planeZ[2] = (n4 + 12.557f * n11);
        planeX[3] = (n2 + 4.0f * n10);
        planeY[3] = (n3 + 3.3646f * n11);
        planeZ[3] = (n4 + 12.557f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 4, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, true);
        ++n;
        planeX[0] = (n2 - 4.0f * n10);
        planeY[0] = (n3 - 9.1923f * n11);
        planeZ[0] = (n4 + 9.1923f * n11);
        planeX[1] = (n2 - 4.0f * n10);
        planeY[1] = (n3 - 3.3646f * n11);
        planeZ[1] = (n4 + 12.557f * n11);
        planeX[2] = (n2 + 4.0f * n10);
        planeY[2] = (n3 - 3.3646f * n11);
        planeZ[2] = (n4 + 12.557f * n11);
        planeX[3] = (n2 + 4.0f * n10);
        planeY[3] = (n3 - 9.1923f * n11);
        planeZ[3] = (n4 + 9.1923f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 4, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, true);
        ++n;
        planeX[0] = (n2 - 4.0f * n10);
        planeY[0] = (n3 - 9.1923f * n11);
        planeZ[0] = (n4 + 9.1923f * n11);
        planeX[1] = (n2 - 4.0f * n10);
        planeY[1] = (n3 - 12.557f * n11);
        planeZ[1] = (n4 + 3.3646f * n11);
        planeX[2] = (n2 + 4.0f * n10);
        planeY[2] = (n3 - 12.557f * n11);
        planeZ[2] = (n4 + 3.3646f * n11);
        planeX[3] = (n2 + 4.0f * n10);
        planeY[3] = (n3 - 9.1923f * n11);
        planeZ[3] = (n4 + 9.1923f * n11);
        planeArray[n] = new Plane(medium, trackers, planeX, planeZ, planeY, 4, planeColor, 0, n8, 0, n9, n3, n4, 7, 0, false, 0, true);
        ++n;
    }
}
