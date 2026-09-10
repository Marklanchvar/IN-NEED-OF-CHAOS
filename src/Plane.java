import java.awt.RenderingHints;
import java.awt.Graphics2D;
import java.awt.Color;

public class Plane
{
    Medium m;
    Trackers t;
    float[] ox;
    float[] oy;
    float[] oz;
    int n;
    int[] c = new int[3];
    int[] oc = new int[3];
    float[] hsb = new float[3];
    int glass;
    int gr;
    int fs;
    int disline;
    boolean road;
    boolean solo;
    int light;
    int master;
    float wx;
    float wz;
    float wy;
    float deltaf;
    float projf;
    int av;
    int bfase;
    boolean nocol;
    int chip;
    float ctmag;
    float cxz;
    float cxy;
    float czy;
    float[] cox = new float[3];
    float[] coz = new float[3];
    float[] coy = new float[3];
    float dx;
    float dy;
    float dz;
    float vx;
    float vy;
    float vz;
    int embos;
    int typ;
    int pa;
    int pb;
    int flx;
    int colnum;
	final static Color spazColor = new Color(230, 230, 230);
	static Color[] fireColor = new Color[2];
    static Color shadowColor;
    static Color[] finalPlaneColor = new Color[2];
    static Color[] chipColor;

	private float[] polygon3DX = new float[100];
	private float[] polygon3DY = new float[100];
	private float[] polygon3DZ = new float[100];
	private int[] polygon2DX = new int[100];
	private int[] polygon2DY = new int[100];
	private int[] fire2DX= new int[3];
	private int[] fire2DY= new int[3];
	private int[] chip2DX= new int[3];
	private int[] chip2DY= new int[3];
    
    public Plane(final Medium m, final Trackers t, final float[] polygonX, final float[] polygonY, final float[] polygonZ, final int polygonPoints, final int[] polygonColor, final int glass, final int gr, final int fs, final float wheelX, final float wheelY, final float wheelZ, final int disline, final int bfase, final boolean road, final int light, final boolean hasNoOutline) {
        
        this.glass = 0;
        this.gr = 0;
        this.fs = 0;
        this.disline = 7;
        this.road = false;
        this.solo = false;
        this.light = 0;
        this.master = 0;
        this.wx = 0;
        this.wz = 0;
        this.wy = 0;
        this.deltaf = 1.0f;
        this.projf = 1.0f;
        this.av = 0;
        this.bfase = 0;
        this.nocol = false;
        this.chip = 0;
        this.ctmag = 0.0f;
        this.cxz = 0;
        this.cxy = 0;
        this.czy = 0;
        this.dx = 0;
        this.dy = 0;
        this.dz = 0;
        this.vx = 0;
        this.vy = 0;
        this.vz = 0;
        this.embos = 0;
        this.typ = 0;
        this.pa = 0;
        this.pb = 0;
        this.flx = 0;
        this.colnum = 0;
        this.m = m;
        this.t = t;
        this.n = polygonPoints;
        this.ox = new float[this.n];
        this.oz = new float[this.n];
        this.oy = new float[this.n];
        for (int i = 0; i < this.n; ++i) {
            this.ox[i] = polygonX[i];
            this.oy[i] = polygonZ[i];
            this.oz[i] = polygonY[i];
        }
        for (int j = 0; j < 3; ++j) {
            this.oc[j] = polygonColor[j];
        }
        if (gr == -15) {
            if (polygonColor[0] == 211) {
                final int n2 = (int)(Math.random() * 40.0 - 20.0);
                final int n3 = (int)(Math.random() * 40.0 - 20.0);
                for (int k = 0; k < this.n; ++k) {
                    final float[] ox = this.ox;
                    final int n4 = k;
                    ox[n4] += n2;
                    final float[] oz = this.oz;
                    final int n5 = k;
                    oz[n5] += n3;
                }
            }
            final int n6 = (int)(185.0 + Math.random() * 20.0);
            polygonColor[0] = (217 + n6) / 2;
            if (polygonColor[0] == 211) {
                polygonColor[0] = 210;
            }
            polygonColor[1] = (189 + n6) / 2;
            polygonColor[2] = (132 + n6) / 2;
            for (int l = 0; l < this.n; ++l) {
                if (Math.random() > Math.random()) {
                    final float[] ox2 = this.ox;
                    final int n7 = l;
                    ox2[n7] += (int)(8.0 * Math.random() - 4.0);
                }
                if (Math.random() > Math.random()) {
                    final float[] oy = this.oy;
                    final int n8 = l;
                    oy[n8] += (int)(8.0 * Math.random() - 4.0);
                }
                if (Math.random() > Math.random()) {
                    final float[] oz2 = this.oz;
                    final int n9 = l;
                    oz2[n9] += (int)(8.0 * Math.random() - 4.0);
                }
            }
        }
        if (polygonColor[0] == polygonColor[1] && polygonColor[1] == polygonColor[2]) {
            this.nocol = true;
        }
        if (glass == 0) {
            for (int n10 = 0; n10 < 3; ++n10) {
                this.c[n10] = (int)(polygonColor[n10] + polygonColor[n10] * (this.m.snap[n10] / 100.0f));
                if (this.c[n10] > 255) {
                    this.c[n10] = 255;
                }
                if (this.c[n10] < 0) {
                    this.c[n10] = 0;
                }
            }
        }
        if (glass == 1) {
            for (int n11 = 0; n11 < 3; ++n11) {
                this.c[n11] = (this.m.csky[n11] * this.m.fade[0] * 2 + this.m.cfade[n11] * 3000) / (this.m.fade[0] * 2 + 3000);
            }
        }
        if (glass == 2) {
            for (int n12 = 0; n12 < 3; ++n12) {
                this.c[n12] = (int)(this.m.crgrnd[n12] * 0.925f);
            }
        }
        if (glass == 3) {
            for (int n13 = 0; n13 < 3; ++n13) {
                this.c[n13] = polygonColor[n13];
            }
        }
        this.disline = disline;
        this.bfase = bfase;
        this.glass = glass;
        Color.RGBtoHSB(this.c[0], this.c[1], this.c[2], this.hsb);
        if (glass == 3 && this.m.trk != 2) {
            final float[] hsb = this.hsb;
            final int n14 = 1;
            hsb[n14] += 0.05f;
            if (this.hsb[1] > 1.0f) {
                this.hsb[1] = 1.0f;
            }
        }
        if (!this.nocol && this.glass != 1) {
            if (this.bfase > 20 && this.hsb[1] > 0.25) {
                this.hsb[1] = 0.25f;
            }
            if (this.bfase > 25 && this.hsb[2] > 0.7) {
                this.hsb[2] = 0.7f;
            }
            if (this.bfase > 30 && this.hsb[1] > 0.15) {
                this.hsb[1] = 0.15f;
            }
            if (this.bfase > 35 && this.hsb[2] > 0.6) {
                this.hsb[2] = 0.6f;
            }
            if (this.bfase > 40) {
                this.hsb[0] = 0.075f;
            }
            if (this.bfase > 50 && this.hsb[2] > 0.5) {
                this.hsb[2] = 0.5f;
            }
            if (this.bfase > 60) {
                this.hsb[0] = 0.05f;
            }
        }
        this.road = road;
        this.light = light;
        this.solo = hasNoOutline;
        this.gr = gr;
        this.fs = fs;
        this.wx = wheelX;
        this.wy = wheelY;
        this.wz = wheelZ;
        this.deltafntyp();
        
        Plane.chipColor = new Color[3];
    }
    
    public void deltafntyp() {
        final float abs = Math.abs(this.ox[2] - this.ox[1]);
        final float abs2 = Math.abs(this.oy[2] - this.oy[1]);
        final float abs3 = Math.abs(this.oz[2] - this.oz[1]);
        if (abs2 <= abs && abs2 <= abs3) {
            this.typ = 2;
        }
        if (abs <= abs2 && abs <= abs3) {
            this.typ = 1;
        }
        if (abs3 <= abs && abs3 <= abs2) {
            this.typ = 3;
        }
        this.deltaf = 1.0f;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (j != i) {
                    this.deltaf *= (float)(Math.sqrt((this.ox[j] - this.ox[i]) * (this.ox[j] - this.ox[i]) + (this.oy[j] - this.oy[i]) * (this.oy[j] - this.oy[i]) + (this.oz[j] - this.oz[i]) * (this.oz[j] - this.oz[i])) / 100.0);
                }
            }
        }
        this.deltaf /= 3.0f;
    }
    
    public void loadprojf() {
        this.projf = 1.0f;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (j != i) {
                    this.projf *= (float)(Math.sqrt((this.ox[i] - this.ox[j]) * (this.ox[i] - this.ox[j]) + (this.oz[i] - this.oz[j]) * (this.oz[i] - this.oz[j])) / 100.0);
                }
            }
        }
        this.projf /= 3.0f;
    }
    
    public void d(final Graphics2D planegraphics2D, final float f, final float h, final float o, final float xz, final float xy, final float zy, final float wxz, final float wzy, boolean b, final int n8) {
    	if (this.master == 1) {
            if (this.av > 1500 && !this.m.crs) {
                this.n = 12;
            }
            else {
                this.n = 20;
            }
        }
        if (this.embos == 0) {
            for (int i = 0; i < this.n; ++i) {
                polygon3DX[i] = this.ox[i] + f;
                polygon3DZ[i] = this.oy[i] + h;
                polygon3DY[i] = this.oz[i] + o;
            }
            if ((this.gr == -11 || this.gr == -12 || this.gr == -13) && this.m.lastmaf == 1) {
                for (int j = 0; j < this.n; ++j) {
                    polygon3DX[j] = -this.ox[j] + f;
                    polygon3DZ[j] = this.oy[j] + h;
                    polygon3DY[j] = -this.oz[j] + o;
                }
            }
        }
        else {
            if (this.embos <= 11 && this.m.random() > 0.5 && this.glass != 1) {
                for (int k = 0; k < this.n; ++k) {
                    polygon3DX[k] = (int)(this.ox[k] + f + (15.0f - this.m.random() * 30.0f));
                    polygon3DZ[k] = (int)(this.oy[k] + h + (15.0f - this.m.random() * 30.0f));
                    polygon3DY[k] = (int)(this.oz[k] + o + (15.0f - this.m.random() * 30.0f));
                }
                this.rot(polygon3DX, polygon3DZ, f, h, xy, this.n);
                this.rot(polygon3DZ, polygon3DY, h, o, zy, this.n);
                this.rot(polygon3DX, polygon3DY, f, o, xz, this.n);
                this.rot(polygon3DX, polygon3DY, this.m.cx, this.m.cz, this.m.xz, this.n);
                this.rot(polygon3DZ, polygon3DY, this.m.cy, this.m.cz, this.m.zy, this.n);
                for (int l = 0; l < this.n; ++l) {
                    polygon2DX[l] = this.xs(polygon3DX[l], polygon3DY[l]);
                    polygon2DY[l] = this.ys(polygon3DZ[l], polygon3DY[l]);
                }
                planegraphics2D.setColor(spazColor);
                planegraphics2D.fillPolygon(polygon2DX, polygon2DY, this.n);
            }
            float n9 = 1.0f;
            if (this.embos <= 4) {
                n9 = 1.0f + this.m.random() / 5.0f;
            }
            if (this.embos > 4 && this.embos <= 7) {
                n9 = 1.0f + this.m.random() / 4.0f;
            }
            if (this.embos > 7 && this.embos <= 9) {
                n9 = 1.0f + this.m.random() / 3.0f;
                if (this.hsb[2] > 0.7) {
                    this.hsb[2] = 0.7f;
                }
            }
            if (this.embos > 9 && this.embos <= 10) {
                n9 = 1.0f + this.m.random() / 2.0f;
                if (this.hsb[2] > 0.6) {
                    this.hsb[2] = 0.6f;
                }
            }
            if (this.embos > 10 && this.embos <= 12) {
                n9 = 1.0f + this.m.random() / 1.0f;
                if (this.hsb[2] > 0.5) {
                    this.hsb[2] = 0.5f;
                }
            }
            if (this.embos == 12) {
                this.chip = 1;
                this.ctmag = 2.0f;
                this.bfase = -7;
            }
            if (this.embos == 13) {
                this.hsb[1] = 0.2f;
                this.hsb[2] = 0.4f;
            }
            if (this.embos == 16) {
                this.pa = (int)(this.m.random() * this.n);
                this.pb = (int)(this.m.random() * this.n);
                while (this.pa == this.pb) {
                    this.pb = (int)(this.m.random() * this.n);
                }
            }
            if (this.embos >= 16) {
                int n10 = 1;
                int n11 = 1;
                float abs;
                for (abs = Math.abs(zy); abs > 270; abs -= 360) {}
                if (Math.abs(abs) > 90) {
                    n10 = -1;
                }
                float abs2;
                for (abs2 = Math.abs(xy); abs2 > 270; abs2 -= 360) {}
                if (Math.abs(abs2) > 90) {
                    n11 = -1;
                }
                polygon3DX[0] = this.ox[this.pa] + f;
                polygon3DZ[0] = this.oy[this.pa] + h;
                polygon3DY[0] = this.oz[this.pa] + o;
                polygon3DX[1] = this.ox[this.pb] + f;
                polygon3DZ[1] = this.oy[this.pb] + h;
                polygon3DY[1] = this.oz[this.pb] + o;
                while (Math.abs(polygon3DX[0] - polygon3DX[1]) > 100) {
                    if (polygon3DX[1] > polygon3DX[0]) {
                        final float[] array8 = polygon3DX;
                        final int n12 = 1;
                        array8[n12] -= 30;
                    }
                    else {
                        final float[] array9 = polygon3DX;
                        final int n13 = 1;
                        array9[n13] += 30;
                    }
                }
                while (Math.abs(polygon3DY[0] - polygon3DY[1]) > 100) {
                    if (polygon3DY[1] > polygon3DY[0]) {
                        final float[] array10 = polygon3DY;
                        final int n14 = 1;
                        array10[n14] -= 30;
                    }
                    else {
                        final float[] array11 = polygon3DY;
                        final int n15 = 1;
                        array11[n15] += 30;
                    }
                }
                final int n16 = (int)(Math.abs(polygon3DX[0] - polygon3DX[1]) / 3 * (0.5 - this.m.random()));
                final int n17 = (int)(Math.abs(polygon3DY[0] - polygon3DY[1]) / 3 * (0.5 - this.m.random()));
                polygon3DX[2] = (polygon3DX[0] + polygon3DX[1]) / 2 + n16;
                polygon3DY[2] = (polygon3DY[0] + polygon3DY[1]) / 2 + n17;
                final int n18 = (int)((Math.abs(polygon3DX[0] - polygon3DX[1]) + Math.abs(polygon3DY[0] - polygon3DY[1])) / 1.5 * (this.m.random() / 2.0f + 0.5));
                polygon3DZ[2] = (polygon3DZ[0] + polygon3DZ[1]) / 2 - n10 * n11 * n18;
                this.rot(polygon3DX, polygon3DZ, f, h, xy, 3);
                this.rot(polygon3DZ, polygon3DY, h, o, zy, 3);
                this.rot(polygon3DX, polygon3DY, f, o, xz, 3);
                this.rot(polygon3DX, polygon3DY, this.m.cx, this.m.cz, this.m.xz, 3);
                this.rot(polygon3DZ, polygon3DY, this.m.cy, this.m.cz, this.m.zy, 3);
                for (int n19 = 0; n19 < 3; ++n19) {
                    fire2DX[n19] = this.xs(polygon3DX[n19], polygon3DY[n19]);
                    fire2DY[n19] = this.ys(polygon3DZ[n19], polygon3DY[n19]);
                }
                int outerFireRed = (int)(255.0f + 255.0f * (this.m.snap[0] / 400.0f));
                if (outerFireRed > 255) {
                    outerFireRed = 255;
                }
                if (outerFireRed < 0) {
                    outerFireRed = 0;
                }
                int outerFireGreen = (int)(169.0f + 169.0f * (this.m.snap[1] / 300.0f));
                if (outerFireGreen > 255) {
                    outerFireGreen = 255;
                }
                if (outerFireGreen < 0) {
                    outerFireGreen = 0;
                }
                int outerFireBlue = (int)(89.0f + 89.0f * (this.m.snap[2] / 200.0f));
                if (outerFireBlue > 255) {
                    outerFireBlue = 255;
                }
                if (outerFireBlue < 0) {
                    outerFireBlue = 0;
                }
                fireColor[1] = new Color(outerFireRed, outerFireGreen, outerFireBlue);
                planegraphics2D.setColor(fireColor[1]);
                planegraphics2D.fillPolygon(fire2DX, fire2DY, 3);
                polygon3DX[0] = this.ox[this.pa] + f;
                polygon3DZ[0] = this.oy[this.pa] + h;
                polygon3DY[0] = this.oz[this.pa] + o;
                polygon3DX[1] = this.ox[this.pb] + f;
                polygon3DZ[1] = this.oy[this.pb] + h;
                polygon3DY[1] = this.oz[this.pb] + o;
                while (Math.abs(polygon3DX[0] - polygon3DX[1]) > 100) {
                    if (polygon3DX[1] > polygon3DX[0]) {
                        final float[] array12 = polygon3DX;
                        final int n20 = 1;
                        array12[n20] -= 30;
                    }
                    else {
                        final float[] array13 = polygon3DX;
                        final int n21 = 1;
                        array13[n21] += 30;
                    }
                }
                while (Math.abs(polygon3DY[0] - polygon3DY[1]) > 100) {
                    if (polygon3DY[1] > polygon3DY[0]) {
                        final float[] array14 = polygon3DY;
                        final int n22 = 1;
                        array14[n22] -= 30;
                    }
                    else {
                        final float[] array15 = polygon3DY;
                        final int n23 = 1;
                        array15[n23] += 30;
                    }
                }
                polygon3DX[2] = (polygon3DX[0] + polygon3DX[1]) / 2 + n16;
                polygon3DY[2] = (polygon3DY[0] + polygon3DY[1]) / 2 + n17;
                polygon3DZ[2] = (polygon3DZ[0] + polygon3DZ[1]) / 2 - n10 * n11 * (int)(n18 * 0.8);
                this.rot(polygon3DX, polygon3DZ, f, h, xy, 3);
                this.rot(polygon3DZ, polygon3DY, h, o, zy, 3);
                this.rot(polygon3DX, polygon3DY, f, o, xz, 3);
                this.rot(polygon3DX, polygon3DY, this.m.cx, this.m.cz, this.m.xz, 3);
                this.rot(polygon3DZ, polygon3DY, this.m.cy, this.m.cz, this.m.zy, 3);
                for (int n24 = 0; n24 < 3; ++n24) {
                    fire2DX[n24] = this.xs(polygon3DX[n24], polygon3DY[n24]);
                    fire2DY[n24] = this.ys(polygon3DZ[n24], polygon3DY[n24]);
                }
                int innerFireRed = (int)(255.0f + 255.0f * (this.m.snap[0] / 400.0f));
                if (innerFireRed > 255) {
                    innerFireRed = 255;
                }
                if (innerFireRed < 0) {
                    innerFireRed = 0;
                }
                int innerFireGreen = (int)(207.0f + 207.0f * (this.m.snap[1] / 300.0f));
                if (innerFireGreen > 255) {
                    innerFireGreen = 255;
                }
                if (innerFireGreen < 0) {
                    innerFireGreen = 0;
                }
                int innerFireBlue = (int)(136.0f + 136.0f * (this.m.snap[2] / 200.0f));
                if (innerFireBlue > 255) {
                    innerFireBlue = 255;
                }
                if (innerFireBlue < 0) {
                    innerFireBlue = 0;
                }
                fireColor[0] = new Color(innerFireRed, innerFireGreen, innerFireBlue);
                planegraphics2D.setColor(fireColor[0]);
                planegraphics2D.fillPolygon(fire2DX, fire2DY, 3);
            }
            for (int n25 = 0; n25 < this.n; ++n25) {
                if (this.typ == 1) {
                    polygon3DX[n25] = (int)(this.ox[n25] * n9 + f);
                }
                else {
                    polygon3DX[n25] = this.ox[n25] + f;
                }
                if (this.typ == 2) {
                    polygon3DZ[n25] = (int)(this.oy[n25] * n9 + h);
                }
                else {
                    polygon3DZ[n25] = this.oy[n25] + h;
                }
                if (this.typ == 3) {
                    polygon3DY[n25] = (int)(this.oz[n25] * n9 + o);
                }
                else {
                    polygon3DY[n25] = this.oz[n25] + o;
                }
            }
            if (this.embos != 70) {
                ++this.embos;
            }
            else {
                this.embos = 16;
            }
        }
        if (this.wz != 0) {
            this.rot(polygon3DZ, polygon3DY, this.wy + h, this.wz + o, wzy, this.n);
        }
        if (this.wx != 0) {
            this.rot(polygon3DX, polygon3DY, this.wx + f, this.wz + o, wxz, this.n);
        }
        if (this.chip == 1 && (this.m.random() > 0.6 || this.bfase == 0)) {
            this.chip = 0;
            if (this.bfase == 0 && this.nocol) {
                this.bfase = 1;
            }
        }
        if (this.chip != 0) {
            if (this.chip == 1) {
                this.cxz = xz;
                this.cxy = xy;
                this.czy = zy;
                final int n26 = (int)(this.m.random() * this.n);
                this.cox[0] = this.ox[n26];
                this.coz[0] = this.oz[n26];
                this.coy[0] = this.oy[n26];
                if (this.ctmag > 3.0f) {
                    this.ctmag = 3.0f;
                }
                if (this.ctmag < -3.0f) {
                    this.ctmag = -3.0f;
                }
                this.cox[1] = (int)(this.cox[0] + this.ctmag * (10.0f - this.m.random() * 20.0f));
                this.cox[2] = (int)(this.cox[0] + this.ctmag * (10.0f - this.m.random() * 20.0f));
                this.coy[1] = (int)(this.coy[0] + this.ctmag * (10.0f - this.m.random() * 20.0f));
                this.coy[2] = (int)(this.coy[0] + this.ctmag * (10.0f - this.m.random() * 20.0f));
                this.coz[1] = (int)(this.coz[0] + this.ctmag * (10.0f - this.m.random() * 20.0f));
                this.coz[2] = (int)(this.coz[0] + this.ctmag * (10.0f - this.m.random() * 20.0f));
                this.dx = 0;
                this.dy = 0;
                this.dz = 0;
                if (this.bfase != -7) {
                    this.vx = (int)(this.ctmag * (30.0f - this.m.random() * 60.0f));
                    this.vz = (int)(this.ctmag * (30.0f - this.m.random() * 60.0f));
                    this.vy = (int)(this.ctmag * (30.0f - this.m.random() * 60.0f));
                }
                else {
                    this.vx = (int)(this.ctmag * (10.0f - this.m.random() * 20.0f));
                    this.vz = (int)(this.ctmag * (10.0f - this.m.random() * 20.0f));
                    this.vy = (int)(this.ctmag * (10.0f - this.m.random() * 20.0f));
                }
                this.chip = 2;
            }
            final float[] chip3DX = new float[3];
            final float[] chip3DY = new float[3];
            final float[] chip3DZ = new float[3];
            for (int n27 = 0; n27 < 3; ++n27) {
                chip3DX[n27] = this.cox[n27] + f;
                chip3DZ[n27] = this.coy[n27] + h;
                chip3DY[n27] = this.coz[n27] + o;
            }
            this.rot(chip3DX, chip3DZ, f, h, this.cxy, 3);
            this.rot(chip3DZ, chip3DY, h, o, this.czy, 3);
            this.rot(chip3DX, chip3DY, f, o, this.cxz, 3);
            for (int n28 = 0; n28 < 3; ++n28) {
                final float[] array19 = chip3DX;
                final int n29 = n28;
                array19[n29] += this.dx;
                final float[] array20 = chip3DZ;
                final int n30 = n28;
                array20[n30] += this.dy;
                final float[] array21 = chip3DY;
                final int n31 = n28;
                array21[n31] += this.dz;
            }
            this.dx += this.vx;
            this.dz += this.vz;
            this.dy += this.vy;
            this.vy += 7;
            if (chip3DZ[0] > this.m.ground) {
                this.chip = 19;
            }
            this.rot(chip3DX, chip3DY, this.m.cx, this.m.cz, this.m.xz, 3);
            this.rot(chip3DZ, chip3DY, this.m.cy, this.m.cz, this.m.zy, 3);
            for (int n32 = 0; n32 < 3; ++n32) {
                chip2DX[n32] = this.xs(chip3DX[n32], chip3DY[n32]);
                chip2DY[n32] = this.ys(chip3DZ[n32], chip3DY[n32]);
            }
            final int n33 = (int)(this.m.random() * 3.0f);
            chipColor[1] = new Color(this.c[0], this.c[1], this.c[2]);
            chipColor[0] = chipColor[1].darker();
            chipColor[2] = chipColor[1].brighter();
            if (this.bfase != -7) {
            	planegraphics2D.setColor(chipColor[n33]);
            }
            else {
                planegraphics2D.setColor(Color.getHSBColor(this.hsb[0], this.hsb[1], this.hsb[2]));
            }
            planegraphics2D.fillPolygon(chip2DX, chip2DY, 3);
            ++this.chip;
            if (this.chip == 20) {
                this.chip = 0;
            }
        }
        this.rot(polygon3DX, polygon3DZ, f, h, xy, this.n);
        this.rot(polygon3DZ, polygon3DY, h, o, zy, this.n);
        this.rot(polygon3DX, polygon3DY, f, o, xz, this.n);
        if ((xy != 0 || zy != 0 || xz != 0) && this.m.trk != 2) {
            this.projf = 1.0f;
            for (int n34 = 0; n34 < 3; ++n34) {
                for (int n35 = 0; n35 < 3; ++n35) {
                    if (n35 != n34) {
                        this.projf *= (float)(Math.sqrt((polygon3DX[n34] - polygon3DX[n35]) * (polygon3DX[n34] - polygon3DX[n35]) + (polygon3DY[n34] - polygon3DY[n35]) * (polygon3DY[n34] - polygon3DY[n35])) / 100.0);
                    }
                }
            }
            this.projf /= 3.0f;
        }
        this.rot(polygon3DX, polygon3DY, this.m.cx, this.m.cz, this.m.xz, this.n);
        boolean b4 = false;
        final int[] array24 = new int[this.n];
        final int[] array25 = new int[this.n];
        int n36 = 500;
        for (int n37 = 0; n37 < this.n; ++n37) {
            array24[n37] = this.xs(polygon3DX[n37], polygon3DY[n37]);
            array25[n37] = this.ys(polygon3DZ[n37], polygon3DY[n37]);
        }
        int n38 = 0;
        int n39 = 1;
        for (int n40 = 0; n40 < this.n; ++n40) {
            for (int n41 = n40; n41 < this.n; ++n41) {
                if (n40 != n41 && Math.abs(array24[n40] - array24[n41]) - Math.abs(array25[n40] - array25[n41]) < n36) {
                    n39 = n40;
                    n38 = n41;
                    n36 = Math.abs(array24[n40] - array24[n41]) - Math.abs(array25[n40] - array25[n41]);
                }
            }
        }
        if (array25[n38] < array25[n39]) {
            final int n42 = n38;
            n38 = n39;
            n39 = n42;
        }
        if (this.spy(polygon3DX[n38], polygon3DY[n38]) > this.spy(polygon3DX[n39], polygon3DY[n39])) {
            b4 = true;
            int n43 = 0;
            for (int n44 = 0; n44 < this.n; ++n44) {
                if (polygon3DY[n44] < 50 && polygon3DZ[n44] > this.m.cy) {
                    b4 = false;
                }
                else if (polygon3DZ[n44] == polygon3DZ[0]) {
                    ++n43;
                }
            }
            if (n43 == this.n && polygon3DZ[0] > this.m.cy) {
                b4 = false;
            }
        }
        this.rot(polygon3DZ, polygon3DY, this.m.cy, this.m.cz, this.m.zy, this.n);
        int n45 = 1;
        int n46 = 0;
        int n47 = 0;
        int n48 = 0;
        int n49 = 0;
        int n50 = 0;
        for (int n51 = 0; n51 < this.n; ++n51) {
            polygon2DX[n51] = this.xs(polygon3DX[n51], polygon3DY[n51]);
            polygon2DY[n51] = this.ys(polygon3DZ[n51], polygon3DY[n51]);
            if (polygon2DY[n51] < this.m.ih || polygon3DY[n51] < 10) {
                ++n46;
            }
            if (polygon2DY[n51] > this.m.h || polygon3DY[n51] < 10) {
                ++n47;
            }
            if (polygon2DX[n51] < this.m.iw || polygon3DY[n51] < 10) {
                ++n48;
            }
            if (polygon2DX[n51] > this.m.w || polygon3DY[n51] < 10) {
                ++n49;
            }
            if (polygon3DY[n51] < 10) {
                ++n50;
            }
        }
        if (n48 == this.n || n46 == this.n || n47 == this.n || n49 == this.n) {
            n45 = 0;
        }
        if ((this.m.trk == 1 || this.m.trk == 4) && (n48 != 0 || n46 != 0 || n47 != 0 || n49 != 0)) {
            n45 = 0;
        }
        if (this.m.trk == 3 && n50 != 0) {
            n45 = 0;
        }
        if (n50 != 0) {
            b = true;
        }
        if (n45 != 0 && n8 != -1) {
            int abs3 = 0;
            int abs4 = 0;
            for (int n52 = 0; n52 < this.n; ++n52) {
                for (int n53 = n52; n53 < this.n; ++n53) {
                    if (n52 != n53) {
                        if (Math.abs(polygon2DX[n52] - polygon2DX[n53]) > abs3) {
                            abs3 = Math.abs(polygon2DX[n52] - polygon2DX[n53]);
                        }
                        if (Math.abs(polygon2DY[n52] - polygon2DY[n53]) > abs4) {
                            abs4 = Math.abs(polygon2DY[n52] - polygon2DY[n53]);
                        }
                    }
                }
            }
            if (abs3 == 0 || abs4 == 0) {
                n45 = 0;
            }
            else if (abs3 < 3 && abs4 < 3 && ((n8 / abs3 > 15 && n8 / abs4 > 15) || b) && (!this.m.lightson || this.light == 0)) {
                n45 = 0;
            }
        }
        if (n45 != 0) {
            int lastmaf = 1;
            int gr = this.gr;
            if (gr < 0 && gr >= -15) {
                gr = 0;
            }
            if (this.gr == -11) {
                gr = -90;
            }
            if (this.gr == -12) {
                gr = -75;
            }
            if (this.gr == -14 || this.gr == -15) {
                gr = -50;
            }
            if (this.glass == 2) {
                gr = 200;
            }
            if (this.fs != 0) {
                int n54;
                int n55;
                if (Math.abs(polygon2DY[0] - polygon2DY[1]) > Math.abs(polygon2DY[2] - polygon2DY[1])) {
                    n54 = 0;
                    n55 = 2;
                }
                else {
                    n54 = 2;
                    n55 = 0;
                    lastmaf *= -1;
                }
                if (polygon2DY[1] > polygon2DY[n54]) {
                    lastmaf *= -1;
                }
                if (polygon2DX[1] > polygon2DX[n55]) {
                    lastmaf *= -1;
                }
                if (this.fs != 22) {
                    lastmaf *= this.fs;
                    if (lastmaf == -1) {
                        gr += 40;
                        lastmaf = -111;
                    }
                }
            }
            if (this.m.lightson && this.light == 2) {
                gr -= 40;
            }
            float n56 = polygon3DZ[0];
            float n57 = polygon3DZ[0];
            float n58 = polygon3DX[0];
            float n59 = polygon3DX[0];
            float n60 = polygon3DY[0];
            float n61 = polygon3DY[0];
            for (int n62 = 0; n62 < this.n; ++n62) {
                if (polygon3DZ[n62] > n56) {
                    n56 = polygon3DZ[n62];
                }
                if (polygon3DZ[n62] < n57) {
                    n57 = polygon3DZ[n62];
                }
                if (polygon3DX[n62] > n58) {
                    n58 = polygon3DX[n62];
                }
                if (polygon3DX[n62] < n59) {
                    n59 = polygon3DX[n62];
                }
                if (polygon3DY[n62] > n60) {
                    n60 = polygon3DY[n62];
                }
                if (polygon3DY[n62] < n61) {
                    n61 = polygon3DY[n62];
                }
            }
            final float n63 = (n56 + n57) / 2;
            final float n64 = (n58 + n59) / 2;
            final float n65 = (n60 + n61) / 2;
            this.av = (int)Math.sqrt((this.m.cy - n63) * (this.m.cy - n63) + (this.m.cx - n64) * (this.m.cx - n64) + n65 * n65 + gr * gr * gr);
            if (this.m.trk == 0 && (this.av > this.m.fade[this.disline] || this.av == 0)) {
                n45 = 0;
            }
            if (lastmaf == -111 && this.av > 4500 && !this.road) {
                n45 = 0;
            }
            if (lastmaf == -111 && this.av > 1500) {
                b = true;
            }
            if (this.av > 3000 && this.m.adv <= 900) {
                b = true;
            }
            if (this.fs == 22 && this.av < 11200) {
                this.m.lastmaf = lastmaf;
            }
            if (this.gr == -13 && (!this.m.lastcheck || n8 != -1)) {
                n45 = 0;
            }
            if (this.master == 2 && this.av > 1500 && !this.m.crs) {
                n45 = 0;
            }
            if ((this.gr == -14 || this.gr == -15 || this.gr == -12) && (this.av > 11000 || b4 || lastmaf == -111 || this.m.resdown == 2) && this.m.trk != 2 && this.m.trk != 3) {
                n45 = 0;
            }
            if (this.gr == -11 && this.av > 11000 && this.m.trk != 2 && this.m.trk != 3) {
                n45 = 0;
            }
            if (this.glass == 2 && (this.m.trk != 0 || this.av > 6700)) {
                n45 = 0;
            }
            if (this.flx != 0 && this.m.random() > 0.3 && this.flx != 77) {
                n45 = 0;
            }
        }
        if (n45 != 0) {
            float n66 = (float)(this.projf / this.deltaf + 0.3);
            if (b && !this.solo) {
                boolean b5 = false;
                if (n66 > 1.0f) {
                    if (n66 >= 1.27F) {
                        b5 = true;
                    }
                    n66 = 1.0f;
                }
                if (b5) {
                    n66 *= 0.89F;
                }
                else {
                    n66 *= 0.86F;
                }
                if (n66 < 0.37F) {
                    n66 = 0.37F;
                }
                if (this.gr == -9) {
                    n66 = 0.7F;
                }
                if (this.gr == -4) {
                    n66 = 0.74F;
                }
                if (this.gr != -7 && this.m.trk == 0 && b4) {
                    n66 = 0.32F;
                }
                if (this.gr == -8 || this.gr == -14 || this.gr == -15) {
                    n66 = 1.0F;
                }
                if (this.gr == -11 || this.gr == -12) {
                    n66 = 0.6F;
                    if (n8 == -1) {
                        if (this.m.cpflik || (this.m.nochekflk && !this.m.lastcheck)) {
                            n66 = 1.0f;
                        }
                        else {
                            n66 = 0.76f;
                        }
                    }
                }
                if (this.gr == -13 && n8 == -1) {
                    if (this.m.cpflik) {
                        n66 = 0.0f;
                    }
                    else {
                        n66 = 0.76f;
                    }
                }
                if (this.gr == -6) {
                    n66 = 0.62f;
                }
                if (this.gr == -5) {
                    n66 = 0.55f;
                }
            }
            else {
                if (n66 > 1.0f) {
                    n66 = 1.0f;
                }
                if (n66 < 0.6 || b4) {
                    n66 = 0.6f;
                }
            }
            Color color = Color.getHSBColor(this.hsb[0], this.hsb[1], this.hsb[2] * n66);
            if (this.m.trk == 1) {
                final float[] hsbvals = new float[3];
                Color.RGBtoHSB(this.oc[0], this.oc[1], this.oc[2], hsbvals);
                hsbvals[0] = 0.15f;
                hsbvals[1] = 0.3f;
                color = Color.getHSBColor(hsbvals[0], hsbvals[1], hsbvals[2] * n66 + 0.0f);
            }
            if (this.m.trk == 3) {
                final float[] hsbvals2 = new float[3];
                Color.RGBtoHSB(this.oc[0], this.oc[1], this.oc[2], hsbvals2);
                hsbvals2[0] = 0.6f;
                hsbvals2[1] = 0.14f;
                color = Color.getHSBColor(hsbvals2[0], hsbvals2[1], hsbvals2[2] * n66 + 0.0f);
            }
            int planeRed = color.getRed();
            int planeGreen = color.getGreen();
            int planeBlue = color.getBlue();
            if (this.m.lightson && (this.light != 0 || ((this.gr == -11 || this.gr == -12) && n8 == -1))) {
                planeRed = this.oc[0];
                if (planeRed > 255) {
                    planeRed = 255;
                }
                if (planeRed < 0) {
                    planeRed = 0;
                }
                planeGreen = this.oc[1];
                if (planeGreen > 255) {
                    planeGreen = 255;
                }
                if (planeGreen < 0) {
                    planeGreen = 0;
                }
                planeBlue = this.oc[2];
                if (planeBlue > 255) {
                    planeBlue = 255;
                }
                if (planeBlue < 0) {
                    planeBlue = 0;
                }
            }
            if (this.m.trk == 0) {
            	float minFade = this.m.fade[0];
                float maxFade = this.m.fade[15];
                if (this.av > minFade) {
                    float fogFactor = (this.av - minFade) / (maxFade - minFade);
                    planeRed = lerp(planeRed, this.m.cfade[0], fogFactor);
                    planeGreen = lerp(planeGreen, this.m.cfade[1], fogFactor);
                    planeBlue = lerp(planeBlue, this.m.cfade[2], fogFactor);
                }
            }
            finalPlaneColor[0] = new Color(planeRed, planeGreen, planeBlue);
            planegraphics2D.setColor(finalPlaneColor[0]);
            if (Madness.anti == 1) {
            	planegraphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            }
            planegraphics2D.fillPolygon(polygon2DX, polygon2DY, this.n);
            if (Madness.anti == 1) {
            	planegraphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
            }
            if (this.m.trk != 0 && this.gr == -10) {
            	b = false;
            }

            boolean drawOutline = false;
            Color outlineColor = null;

            if (this.gr == -10) {
                if (this.m.trk == 0) {
                    int r6 = this.c[0];
                    int g6 = this.c[1];
                    int b9 = this.c[2];
                    if (n8 == -1 && this.m.cpflik) {
                        r6 *= 1.6F;
                        if (r6 > 255) {
                            r6 = 255;
                        }
                        g6 *= 1.6F;
                        if (g6 > 255) {
                            g6 = 255;
                        }
                        b9 *= 1.6F;
                        if (b9 > 255) {
                            b9 = 255;
                        }
                    }
                    float minFade = this.m.fade[0];
                    float maxFade = this.m.fade[15];
                    if (this.av > minFade) {
                        float fogFactor = (this.av - minFade) / (maxFade - minFade);
                        r6 = lerp(r6, this.m.cfade[0], fogFactor);
                        g6 = lerp(g6, this.m.cfade[1], fogFactor);
                        b9 = lerp(b9, this.m.cfade[2], fogFactor);
                    }
                    outlineColor = new Color(r6, g6, b9);
                    drawOutline = true;
                }
                else if (this.m.cpflik && this.m.hit == 5000) {
                    int g7 = (int) (Math.random() * 115F);
                    int r7 = g7 * 2 - 54;
                    if (r7 < 0) {
                        r7 = 0;
                    }
                    if (r7 > 255) {
                        r7 = 255;
                    }
                    int b10 = 202 + g7 * 2;
                    if (b10 < 0) {
                        b10 = 0;
                    }
                    if (b10 > 255) {
                        b10 = 255;
                    }
                    g7 += 101;
                    if (g7 < 0) {
                        g7 = 0;
                    }
                    if (g7 > 255) {
                        g7 = 255;
                    }
                    outlineColor = new Color(r7, g7, b10);
                    drawOutline = true;
                }
            }
            else if (this.gr == -18 && this.m.trk == 0) {
                int r8 = this.c[0];
                int g8 = this.c[1];
                int b11 = this.c[2];
                if (this.m.cpflik && this.m.elecr >= 0.0f) {
                    r8 = (int)(25.5f * this.m.elecr);
                    if (r8 > 255) {
                        r8 = 255;
                    }
                    g8 = (int)(128.0f + 12.8f * this.m.elecr);
                    if (g8 > 255) {
                        g8 = 255;
                    }
                    b11 = 255;
                }
                float minFade = this.m.fade[0];
                float maxFade = this.m.fade[15];
                if (this.av > minFade) {
                    float fogFactor = (this.av - minFade) / (maxFade - minFade);
                    r8 = lerp(r8, this.m.cfade[0], fogFactor);
                    g8 = lerp(g8, this.m.cfade[1], fogFactor);
                    b11 = lerp(b11, this.m.cfade[2], fogFactor);
                }
                outlineColor = new Color(r8, g8, b11);
                drawOutline = true;
            }
            else if (!b) {
                if (this.flx == 0) {
                    if (!this.solo) {
                        int edgeRed = 0;
                        int edgeGreen = 0;
                        int edgeBlue = 0;
                        if (this.m.lightson && this.light != 0) {
                            edgeRed = this.oc[0] / 2;
                            if (edgeRed > 255) {
                                edgeRed = 255;
                            }
                            if (edgeRed < 0) {
                                edgeRed = 0;
                            }
                            edgeGreen = this.oc[1] / 2;
                            if (edgeGreen > 255) {
                                edgeGreen = 255;
                            }
                            if (edgeGreen < 0) {
                                edgeGreen = 0;
                            }
                            edgeBlue = this.oc[2] / 2;
                            if (edgeBlue > 255) {
                                edgeBlue = 255;
                            }
                            if (edgeBlue < 0) {
                                edgeBlue = 0;
                            }
                        }
                        outlineColor = new Color(edgeRed, edgeGreen, edgeBlue);
                        drawOutline = true;
                    }
                }
                else {
                    if (this.flx == 2) {
                        outlineColor = Color.BLACK;
                        drawOutline = true;
                    }
                    else if (this.flx == 1) {
                        final int r4 = 0;
                        int g4 = (int)(223.0f + 223.0f * (this.m.snap[1] / 100.0f));
                        if (g4 > 255) {
                            g4 = 255;
                        }
                        if (g4 < 0) {
                            g4 = 0;
                        }
                        int b7 = (int)(255.0f + 255.0f * (this.m.snap[2] / 100.0f));
                        if (b7 > 255) {
                            b7 = 255;
                        }
                        if (b7 < 0) {
                            b7 = 0;
                        }
                        outlineColor = new Color(r4, g4, b7);
                        drawOutline = true;
                        this.flx = 2;
                    }
                    else if (this.flx == 3) {
                        final int r5 = 0;
                        int g5 = (int)(255.0f + 255.0f * (this.m.snap[1] / 100.0f));
                        if (g5 > 255) {
                            g5 = 255;
                        }
                        if (g5 < 0) {
                            g5 = 0;
                        }
                        int b8 = (int)(223.0f + 223.0f * (this.m.snap[2] / 100.0f));
                        if (b8 > 255) {
                            b8 = 255;
                        }
                        if (b8 < 0) {
                            b8 = 0;
                        }
                        outlineColor = new Color(r5, g5, b8);
                        drawOutline = true;
                        this.flx = 2;
                    }
                    else if (this.flx == 77) {
                        outlineColor = new Color(16, 198, 255);
                        drawOutline = true;
                        this.flx = 0;
                    }
                }
            }
            else if (this.road && this.av <= 3000 && this.m.trk == 0 && this.m.fade[0] > 4000) {
                planeRed -= 10;
                if (planeRed < 0) {
                    planeRed = 0;
                }
                planeGreen -= 10;
                if (planeGreen < 0) {
                    planeGreen = 0;
                }
                planeBlue -= 10;
                if (planeBlue < 0) {
                    planeBlue = 0;
                }
                outlineColor = new Color(planeRed, planeGreen, planeBlue);
                drawOutline = true;
            }

            if (drawOutline && outlineColor != null) {
                finalPlaneColor[1] = outlineColor;
                planegraphics2D.setColor(finalPlaneColor[1]);
                if (Madness.anti == 1) {
                    planegraphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                }
                planegraphics2D.drawPolygon(polygon2DX, polygon2DY, this.n);
                if (Madness.anti == 1) {
                    planegraphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
                }
            }
        }
    }
    
    public void s(final Graphics2D shadowgraphics2D, final float f, final float h, final float o, final float xz, final float xy, final float zy, final int n7) {
        final float[] array = new float[this.n];
        final float[] array2 = new float[this.n];
        final float[] array3 = new float[this.n];
        for (int i = 0; i < this.n; ++i) {
            array[i] = this.ox[i] + f;
            array3[i] = this.oy[i] + h;
            array2[i] = this.oz[i] + o;
        }
        this.rot(array, array3, f, h, xy, this.n);
        this.rot(array3, array2, h, o, zy, this.n);
        this.rot(array, array2, f, o, xz, this.n);
        int r = (int)(this.m.crgrnd[0] / 1.5F);
        int g = (int)(this.m.crgrnd[1] / 1.5F);
        int b = (int)(this.m.crgrnd[2] / 1.5F);
        for (int j = 0; j < this.n; ++j) {
            array3[j] = this.m.ground;
        }
        if (n7 == 0) {
            float n8 = 0;
            float n9 = 0;
            float n10 = 0;
            float n11 = 0;
            for (int k = 0; k < this.n; ++k) {
                int n12 = 0;
                int n13 = 0;
                int n14 = 0;
                int n15 = 0;
                for (int l = 0; l < this.n; ++l) {
                    if (array[k] >= array[l]) {
                        ++n12;
                    }
                    if (array[k] <= array[l]) {
                        ++n13;
                    }
                    if (array2[k] >= array2[l]) {
                        ++n14;
                    }
                    if (array2[k] <= array2[l]) {
                        ++n15;
                    }
                }
                if (n12 == this.n) {
                    n8 = array[k];
                }
                if (n13 == this.n) {
                    n9 = array[k];
                }
                if (n14 == this.n) {
                    n10 = array2[k];
                }
                if (n15 == this.n) {
                    n11 = array2[k];
                }
            }
            final float n16 = (n8 + n9) * 0.5F;
            final float n17 = (n10 + n11) * 0.5F;
            int ncx = (int) ((n16 - this.t.sx + this.m.x) / 3000);
            if (ncx > this.t.ncx) {
                ncx = (int) this.t.ncx;
            }
            if (ncx < 0) {
                ncx = 0;
            }
            int ncz = (int) ((n17 - this.t.sz + this.m.z) / 3000);
            if (ncz > this.t.ncz) {
                ncz = (int) this.t.ncz;
            }
            if (ncz < 0) {
                ncz = 0;
            }
            for (int n18 = this.t.sect[ncx][ncz].length - 1; n18 >= 0; --n18) {
                final int n19 = this.t.sect[ncx][ncz][n18];
                int n20 = 0;
                if (Math.abs(this.t.zy[n19]) != 90 && Math.abs(this.t.xy[n19]) != 90 && this.t.rady[n19] != 801 && Math.abs(n16 - (this.t.x[n19] - this.m.x)) < this.t.radx[n19] && Math.abs(n17 - (this.t.z[n19] - this.m.z)) < this.t.radz[n19] && (!this.t.decor[n19] || this.m.resdown != 2)) {
                    ++n20;
                }
                if (n20 != 0) {
                    for (int n21 = 0; n21 < this.n; ++n21) {
                        array3[n21] = this.t.y[n19] - this.m.y;
                        if (this.t.zy[n19] != 0) {
                            final float[] array4 = array3;
                            final int n22 = n21;
                            array4[n22] += (int)((array2[n21] - (this.t.z[n19] - this.m.z - this.t.radz[n19])) * this.m.sin(this.t.zy[n19]) / this.m.sin(90 - this.t.zy[n19]) - this.t.radz[n19] * this.m.sin(this.t.zy[n19]) / this.m.sin(90 - this.t.zy[n19]));
                        }
                        if (this.t.xy[n19] != 0) {
                            final float[] array5 = array3;
                            final int n23 = n21;
                            array5[n23] += (int)((array[n21] - (this.t.x[n19] - this.m.x - this.t.radx[n19])) * this.m.sin(this.t.xy[n19]) / this.m.sin(90 - this.t.xy[n19]) - this.t.radx[n19] * this.m.sin(this.t.xy[n19]) / this.m.sin(90 - this.t.xy[n19]));
                        }
                    }
                    r = (int)(this.t.c[n19][0] / 1.5F);
                    g = (int)(this.t.c[n19][1] / 1.5F);
                    b = (int)(this.t.c[n19][2] / 1.5F);
                    break;
                }
            }
        }
        int n24 = 1;
        if (n7 == 2) {
            r = 87;
            g = 85;
            b = 57;
        }
        else {
            for (int n25 = 0; n25 < this.m.nsp; ++n25) {
                for (int n26 = 0; n26 < this.n; ++n26) {
                    if (Math.abs(array[n26] - this.m.spx[n25]) < this.m.sprad[n25] && Math.abs(array2[n26] - this.m.spz[n25]) < this.m.sprad[n25]) {
                        n24 = 0;
                    }
                }
            }
        }
        if (n24 != 0) {
            this.rot(array, array2, this.m.cx, this.m.cz, this.m.xz, this.n);
            this.rot(array3, array2, this.m.cy, this.m.cz, this.m.zy, this.n);
            int n27 = 0;
            int n28 = 0;
            int n29 = 0;
            int n30 = 0;
            for (int n31 = 0; n31 < this.n; ++n31) {
                polygon2DX[n31] = this.xs(array[n31], array2[n31]);
                polygon2DY[n31] = this.ys(array3[n31], array2[n31]);
                if (polygon2DY[n31] < this.m.ih || array2[n31] < 10) {
                    ++n27;
                }
                if (polygon2DY[n31] > this.m.h || array2[n31] < 10) {
                    ++n28;
                }
                if (polygon2DX[n31] < this.m.iw || array2[n31] < 10) {
                    ++n29;
                }
                if (polygon2DX[n31] > this.m.w || array2[n31] < 10) {
                    ++n30;
                }
            }
            if (n29 == this.n || n27 == this.n || n28 == this.n || n30 == this.n) {
                n24 = 0;
            }
        }
        if (n24 != 0) {
        	float minFade = this.m.fade[0];
            float maxFade = this.m.fade[15];
            if (this.av > minFade) {
                float fogFactor = (this.av - minFade) / (maxFade - minFade);
                r = lerp(r, this.m.cfade[0], fogFactor);
                g = lerp(g, this.m.cfade[1], fogFactor);
                b = lerp(b, this.m.cfade[2], fogFactor);
            }
            shadowColor = new Color(r, g, b);
            shadowgraphics2D.setColor(shadowColor);
            shadowgraphics2D.fillPolygon(polygon2DX, polygon2DY, this.n);
        }
    }
    
    public int xs(final float array, float cz) {
        if (cz < this.m.cz) {
            cz = this.m.cz;
        }
        return (int) ((cz - this.m.focus_point) * (this.m.cx - array) / cz + array);
    }
    
    public int ys(final float array3, float cz) {
        if (cz < this.m.cz) {
            cz = this.m.cz;
        }
        return (int) ((cz - this.m.focus_point) * (this.m.cy - array3) / cz + array3);
    }
    
    public void rot(final float[] array, final float[] array3, final float f, final float h, final float xy, final int n4) {
        if (xy != 0) {
            for (int i = 0; i < n4; ++i) {
                final float n5 = array[i];
                final float n6 = array3[i];
                array[i] = f + ((n5 - f) * this.m.cos(xy) - (n6 - h) * this.m.sin(xy));
                array3[i] = h + ((n5 - f) * this.m.sin(xy) + (n6 - h) * this.m.cos(xy));
            }
        }
    }
    
    public int spy(final float array, final float array2) {
        return (int)Math.sqrt((array - this.m.cx) * (array - this.m.cx) + array2 * array2);
    }

    /**
     * Smoothly interpolates a single color channel towards the fog color based on distance.
     */
    public int lerp(int start, int end, float t) {
        if (t <= 0.0f) return start;
        if (t >= 1.0f) return end;
        return Math.round(start + t * (end - start));
    }
    
    /**
     * Clamps a value between 0 and 255 range.
     */
    public static int clampRGB(int val) {
        return val < 0 ? 0 : (val > 255 ? 255 : val);
    }

}