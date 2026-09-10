import java.awt.Toolkit;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.net.URL;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Composite;
import java.awt.AlphaComposite;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.RenderingHints;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.net.Socket;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.MediaTracker;

public class Globe implements Runnable
{
    MediaTracker mt;
    Graphics2D rd;
    xtGraphics xt;
    FontMetrics ftm;
    ImageObserver ob;
    GameSparker gs;
    Login lg;
    CarDefine cd;
    Medium m;
    Graphics2D rdo;
    Image gImage;
    Thread connector;
    boolean domon;
    Socket socket;
    BufferedReader din;
    PrintWriter dout;
    int fase;
    int open;
    boolean upo;
    int tab;
    boolean onp;
    int ptab;
    int spos;
    int lspos;
    int mscro;
    int spos2;
    int lspos2;
    int mscro2;
    int spos3;
    int lspos3;
    int mscro3;
    int spos4;
    int lspos4;
    int mscro4;
    int spos5;
    int lspos5;
    int mscro5;
    int overit;
    int flk;
    int flko;
    boolean flg;
    int curs;
    int waitlink;
    int addstage;
    boolean darker;
    int npo;
    String[] pname;
    int[] proom;
    int[] pserver;
    int[][] roomf;
    int npf;
    String[] fname;
    String[] cnfname;
    int ncnf;
    int freq;
    int sfreq;
    String freqname;
    String sfreqname;
    int cntf;
    String[] cnames;
    String[] sentn;
    String[] ctime;
    long[] nctime;
    int updatec;
    String proname;
    boolean loadedp;
    int edit;
    int upload;
    int perc;
    int playt;
    int uploadt;
    String filename;
    String msg;
    String trackname;
    boolean refresh;
    boolean logol;
    boolean avatarl;
    int sentchange;
    boolean badlang;
    String[] aboutxt;
    int nab;
    Image clanlogo;
    Image avatar;
    int racing;
    int wasting;
    String themesong;
    String sentance;
    int trackvol;
    int comesoon;
    String proclan;
    int protab;
    int loadpst;
    String loadpstage;
    boolean loadedpstage;
    int nlg;
    String[] logos;
    boolean[] logon;
    Image[] logoi;
    int loadmsgs;
    String hasmsgs;
    String lastsub;
    int nm;
    String[] mname;
    String[] mconvo;
    String[] msub;
    int[] mtyp;
    String[] mtime;
    long[] mctime;
    int openc;
    int opy;
    int addopy;
    int oph;
    int itemsel;
    int loaditem;
    String[] mline;
    int[] mlinetyp;
    long[] mctimes;
    String[] mtimes;
    int nml;
    int readmsg;
    String opname;
    String blockname;
    String unblockname;
    int sendmsg;
    String[] wday;
    String[] month;
    int itab;
    int litab;
    int cadmin;
    String[] cmline;
    int[] cmlinetyp;
    long[] cmctimes;
    String[] cmtimes;
    int cnml;
    int readclan;
    int sendcmsg;
    int loadinter;
    int ni;
    String[] iclan;
    String[] iconvo;
    String[] isub;
    String[] icheck;
    String[] itime;
    long[] ictime;
    String[] istat;
    String[] itcar;
    String[] igcar;
    String[] iwarn;
    int openi;
    int readint;
    String intclan;
    String lastint;
    int dispi;
    String dwarn;
    String dtcar;
    String dgcar;
    int nil;
    String[] iline;
    int[] ilinetyp;
    long[] ictimes;
    String[] itimes;
    int intsel;
    int isel;
    int ifas;
    int leader;
    int sendint;
    boolean inishsel;
    boolean redif;
    String imsg;
    int wag;
    int iflk;
    String itake;
    String igive;
    String viewcar;
    String warnum;
    boolean sendwarnum;
    String[] wstages;
    int[] wlaps;
    int[] wcars;
    int[] wclass;
    int[] wfix;
    int nvgames1;
    int nvgames2;
    int viewgame1;
    int viewgame2;
    String viewwar1;
    String viewwar2;
    String xclan;
    String sendwar;
    boolean ichlng;
    String[] vwstages1;
    int[] vwlaps1;
    int[] vwcars1;
    int[] vwclass1;
    int[] vwfix1;
    String[] vwstages2;
    int[] vwlaps2;
    int[] vwcars2;
    int[] vwclass2;
    int[] vwfix2;
    String[] vwinner;
    int vwscorex;
    int vwscorei;
    Image intclanbg;
    String intclanlo;
    boolean intclanbgloaded;
    Image myclanbg;
    int loadedmyclanbg;
    int cfase;
    boolean notclan;
    String claname;
    boolean loadedc;
    boolean clanbgl;
    Image clanbg;
    int editc;
    int em;
    int ctab;
    int nmb;
    String lccnam;
    String[] member;
    int[] mlevel;
    String[] mrank;
    int nrmb;
    String[] rmember;
    boolean showreqs;
    int blocknote;
    int blockb;
    boolean loadedcm;
    int ncln;
    String[] clname;
    String smsg;
    String sltit;
    boolean attachetoclan;
    boolean loadedlink;
    int loadedcars;
    int loadedcar;
    String ltit;
    String ldes;
    String lurl;
    boolean forcsel;
    String selcar;
    String selstage;
    String perry;
    int mrot;
    int loadedstages;
    int loadedstage;
    CheckPoints cp;
    ContO[] bco;
    ContO[] co;
    int mouson;
    int nclns;
    String[] clanlo;
    int ntab;
    int loadednews;
    int spos6;
    int lspos6;
    String[] newplayers;
    int[] nwarbs;
    String[] nwclan;
    String[] nlclan;
    String[] nwinob;
    int[] nwinp;
    int[] nlosp;
    String[] nwtime;
    int il;
    String[] nttime;
    String[] text;
    int[] nln;
    String[][][] link;
    int maxclans;
    int loadwstat;
    int ncc;
    int champ;
    int leadsby;
    String[] conclan;
    int[] totp;
    int[] ord;
    int[] nvc;
    int[][] points;
    String[][] verclan;
    int eng;
    int engo;
    boolean frkl;
    int underc;
    float bgf;
    boolean bgup;
    int[] bgx;
    int flkn;
    int cur;
    int sdist;
    int scro;
    boolean donewc;
    boolean dosrch;
    boolean dorank;
    boolean doweb1;
    boolean doweb2;
    boolean dommsg;
    boolean donemsg;
    int doi;
    int ados;
    int lspos6w;
    long ntime;
    int loadwbgames;
    int warb;
    int gameturn;
    String warbnum;
    String vclan;
    String[] wbstages;
    int[] wbstage;
    int[] wblaps;
    int[] wbcars;
    int[] wbclass;
    int[] wbfix;
    String gameturndisp;
    int ascore;
    int vscore;
    String lwbwinner;
    boolean canredo;
    
    public Globe(final Graphics2D rd, final xtGraphics xt, final Medium m, final Login lg, final CarDefine cd, final CheckPoints cp, final ContO[] bco, final ContO[] co, final GameSparker gs) {
        this.domon = false;
        this.fase = 0;
        this.open = 0;
        this.upo = false;
        this.tab = 3;
        this.onp = false;
        this.ptab = 0;
        this.spos = 0;
        this.lspos = 0;
        this.mscro = 825;
        this.spos2 = 0;
        this.lspos2 = 0;
        this.mscro2 = 825;
        this.spos3 = 0;
        this.lspos3 = 0;
        this.mscro3 = 825;
        this.spos4 = 208;
        this.lspos4 = 0;
        this.mscro4 = 825;
        this.spos5 = 0;
        this.lspos5 = 0;
        this.mscro5 = 825;
        this.overit = 0;
        this.flk = 0;
        this.flko = 0;
        this.flg = false;
        this.curs = 0;
        this.waitlink = 0;
        this.addstage = 0;
        this.darker = false;
        this.npo = -1;
        this.pname = new String[900];
        this.proom = new int[900];
        this.pserver = new int[900];
        this.roomf = new int[3][5];
        this.npf = -1;
        this.fname = new String[900];
        this.cnfname = new String[10];
        this.ncnf = 0;
        this.freq = 0;
        this.sfreq = 0;
        this.freqname = "";
        this.sfreqname = "";
        this.cntf = 0;
        this.cnames = new String[21];
        this.sentn = new String[21];
        this.ctime = new String[21];
        this.nctime = new long[21];
        this.updatec = -1;
        this.proname = "";
        this.loadedp = false;
        this.edit = 0;
        this.upload = 0;
        this.perc = 0;
        this.playt = 0;
        this.uploadt = 0;
        this.filename = "";
        this.msg = "";
        this.trackname = "";
        this.refresh = false;
        this.logol = false;
        this.avatarl = false;
        this.sentchange = 0;
        this.badlang = false;
        this.aboutxt = new String[3];
        this.nab = 0;
        this.racing = 50;
        this.wasting = 150;
        this.themesong = "";
        this.sentance = "";
        this.trackvol = 0;
        this.comesoon = 0;
        this.proclan = "";
        this.protab = 0;
        this.loadpst = 0;
        this.loadpstage = "";
        this.loadedpstage = false;
        this.nlg = 0;
        this.logos = new String[200];
        this.logon = new boolean[200];
        this.logoi = new Image[200];
        this.loadmsgs = -1;
        this.hasmsgs = "";
        this.lastsub = "";
        this.nm = 0;
        this.mname = new String[200];
        this.mconvo = new String[200];
        this.msub = new String[200];
        this.mtyp = new int[200];
        this.mtime = new String[200];
        this.mctime = new long[200];
        this.openc = 0;
        this.opy = 0;
        this.addopy = 0;
        this.oph = 0;
        this.itemsel = 0;
        this.loaditem = 0;
        this.mline = new String[1000];
        this.mlinetyp = new int[1000];
        this.mctimes = new long[1000];
        this.mtimes = new String[1000];
        this.nml = 0;
        this.readmsg = 0;
        this.opname = "";
        this.blockname = "";
        this.unblockname = "";
        this.sendmsg = 0;
        this.wday = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        this.month = new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        this.itab = 0;
        this.litab = -1;
        this.cadmin = 0;
        this.cmline = new String[1000];
        this.cmlinetyp = new int[1000];
        this.cmctimes = new long[1000];
        this.cmtimes = new String[1000];
        this.cnml = 0;
        this.readclan = 0;
        this.sendcmsg = 0;
        this.loadinter = -1;
        this.ni = 0;
        this.iclan = new String[200];
        this.iconvo = new String[200];
        this.isub = new String[200];
        this.icheck = new String[200];
        this.itime = new String[200];
        this.ictime = new long[200];
        this.istat = new String[200];
        this.itcar = new String[200];
        this.igcar = new String[200];
        this.iwarn = new String[200];
        this.openi = 0;
        this.readint = 0;
        this.intclan = "";
        this.lastint = "";
        this.dispi = 0;
        this.dwarn = "";
        this.dtcar = "";
        this.dgcar = "";
        this.nil = 0;
        this.iline = new String[1000];
        this.ilinetyp = new int[1000];
        this.ictimes = new long[1000];
        this.itimes = new String[1000];
        this.intsel = 0;
        this.isel = 0;
        this.ifas = 0;
        this.leader = -1;
        this.sendint = 0;
        this.inishsel = false;
        this.redif = false;
        this.imsg = "";
        this.wag = 0;
        this.iflk = 0;
        this.itake = "";
        this.igive = "";
        this.viewcar = "";
        this.warnum = "";
        this.sendwarnum = false;
        this.wstages = new String[5];
        this.wlaps = new int[5];
        this.wcars = new int[5];
        this.wclass = new int[5];
        this.wfix = new int[5];
        this.nvgames1 = 0;
        this.nvgames2 = 0;
        this.viewgame1 = 0;
        this.viewgame2 = 0;
        this.viewwar1 = "";
        this.viewwar2 = "";
        this.xclan = "";
        this.sendwar = "";
        this.ichlng = false;
        this.vwstages1 = new String[10];
        this.vwlaps1 = new int[10];
        this.vwcars1 = new int[10];
        this.vwclass1 = new int[10];
        this.vwfix1 = new int[10];
        this.vwstages2 = new String[10];
        this.vwlaps2 = new int[10];
        this.vwcars2 = new int[10];
        this.vwclass2 = new int[10];
        this.vwfix2 = new int[10];
        this.vwinner = new String[10];
        this.vwscorex = 0;
        this.vwscorei = 0;
        this.intclanbg = null;
        this.intclanlo = "";
        this.intclanbgloaded = false;
        this.myclanbg = null;
        this.loadedmyclanbg = 0;
        this.cfase = 0;
        this.notclan = false;
        this.claname = "EvilOnes";
        this.loadedc = false;
        this.clanbgl = false;
        this.editc = 0;
        this.em = 0;
        this.ctab = 0;
        this.nmb = 0;
        this.lccnam = "";
        this.member = new String[20];
        this.mlevel = new int[20];
        this.mrank = new String[20];
        this.nrmb = 0;
        this.rmember = new String[100];
        this.showreqs = false;
        this.blocknote = 0;
        this.blockb = 0;
        this.loadedcm = false;
        this.ncln = 0;
        this.clname = new String[20];
        this.smsg = "";
        this.sltit = "";
        this.attachetoclan = false;
        this.loadedlink = false;
        this.loadedcars = -1;
        this.loadedcar = 0;
        this.ltit = "";
        this.ldes = "";
        this.lurl = "";
        this.forcsel = false;
        this.selcar = "";
        this.selstage = "";
        this.perry = "";
        this.mrot = 0;
        this.loadedstages = -1;
        this.loadedstage = 0;
        this.mouson = -1;
        this.nclns = 0;
        this.clanlo = new String[20];
        this.ntab = 0;
        this.loadednews = 0;
        this.spos6 = 0;
        this.lspos6 = 0;
        this.newplayers = new String[] { "", "", "", "", "" };
        this.nwarbs = new int[] { -1, -1, -1, -1, -1 };
        this.nwclan = new String[5];
        this.nlclan = new String[5];
        this.nwinob = new String[5];
        this.nwinp = new int[5];
        this.nlosp = new int[5];
        this.nwtime = new String[5];
        this.il = 0;
        this.nttime = new String[300];
        this.text = new String[300];
        this.nln = new int[300];
        this.link = new String[300][4][2];
        this.maxclans = 1000;
        this.loadwstat = 0;
        this.ncc = 0;
        this.champ = -1;
        this.leadsby = 0;
        this.eng = -1;
        this.engo = 0;
        this.frkl = false;
        this.underc = 0;
        this.bgf = 0.0f;
        this.bgup = false;
        this.bgx = new int[] { 0, 670, 1340 };
        this.flkn = 0;
        this.cur = 0;
        this.sdist = 0;
        this.scro = 0;
        this.donewc = false;
        this.dosrch = false;
        this.dorank = false;
        this.doweb1 = false;
        this.doweb2 = false;
        this.dommsg = false;
        this.donemsg = false;
        this.doi = 0;
        this.ados = 0;
        this.lspos6w = 0;
        this.ntime = 0L;
        this.loadwbgames = 0;
        this.warb = 0;
        this.gameturn = -1;
        this.warbnum = "";
        this.vclan = "";
        this.wbstages = new String[10];
        this.wbstage = new int[10];
        this.wblaps = new int[10];
        this.wbcars = new int[10];
        this.wbclass = new int[10];
        this.wbfix = new int[10];
        this.gameturndisp = "";
        this.ascore = 0;
        this.vscore = 0;
        this.lwbwinner = "";
        this.canredo = false;
        this.rd = rd;
        this.xt = xt;
        this.m = m;
        this.gs = gs;
        this.lg = lg;
        this.cd = cd;
        this.cp = cp;
        this.bco = bco;
        this.co = co;
        this.gImage = this.gs.createImage(560, 300);
        (this.rdo = (Graphics2D)this.gImage.getGraphics()).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        this.rdo.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        for (int i = 0; i < 21; ++i) {
            this.ctime[i] = "";
            this.cnames[i] = "";
            this.sentn[i] = "";
            this.nctime[i] = 0L;
        }
        for (int j = 0; j < 900; ++j) {
            this.pname[j] = "";
        }
        for (int k = 0; k < 200; ++k) {
            this.logos[k] = "";
            this.logon[k] = false;
        }
        this.mt = new MediaTracker(this.gs);
        this.gs.sendtyp.setBackground(this.colorb2k(false, 210, 210, 210));
        this.gs.sendtyp.setForeground(new Color(0, 0, 0));
        this.gs.sendtyp.removeAll();
        this.gs.sendtyp.add(this.rd, "Write a Message");
        this.gs.sendtyp.add(this.rd, "Share a Custom Car");
        this.gs.sendtyp.add(this.rd, "Share a Custom Stage");
        this.gs.sendtyp.add(this.rd, "Send a Clan Invitation");
        this.gs.sendtyp.add(this.rd, "Share a Relative Date");
        this.gs.senditem.setBackground(this.colorb2k(false, 230, 230, 230));
        this.gs.senditem.setForeground(new Color(0, 0, 0));
        this.gs.proitem.setBackground(new Color(206, 171, 98));
        this.gs.proitem.setForeground(new Color(0, 0, 0));
        this.gs.datat.setBackground(this.colorb2k(false, 230, 230, 230));
        this.gs.datat.setForeground(new Color(0, 0, 0));
        this.gs.mmsg.setBackground(this.colorb2k(false, 240, 240, 240));
        this.gs.mmsg.setForeground(new Color(0, 0, 0));
        this.gs.clanlev.setBackground(this.colorb2k(false, 230, 230, 230));
        this.gs.clanlev.setForeground(new Color(0, 0, 0));
        this.gs.clcars.setBackground(new Color(0, 0, 0));
        this.gs.clcars.setForeground(new Color(255, 255, 255));
        this.gs.ilaps.setBackground(this.colorb2k(false, 220, 220, 220));
        this.gs.ilaps.setForeground(new Color(0, 0, 0));
        this.gs.icars.setBackground(this.colorb2k(false, 220, 220, 220));
        this.gs.icars.setForeground(new Color(0, 0, 0));
        if (!this.xt.clan.equals("")) {
            this.itab = 2;
        }
    }
    
    public void dome(int n, final int n2, final int n3, final boolean b, final Control control) {
        boolean b2 = false;
        boolean b3 = false;
        this.dommsg = false;
        this.dorank = false;
        this.donewc = false;
        this.dosrch = false;
        this.doweb1 = false;
        this.doweb2 = false;
        if (this.open == 0) {
            int n4 = 0;
            if (this.lg.nmsgs == 0 && this.lg.nfreq == 0 && this.lg.nconf == 0 && this.lg.ncreq == 0 && this.lg.clanapv.equals("")) {
                if (n3 > 425 && n3 < 450 && n2 < 568 && n2 > 232) {
                    n4 = 1;
                }
                final int[] array = { 0, 9, 232, 250, 550, 568, 791, 800 };
                final int[] array2 = { 452, 443, 443, 425, 425, 443, 443, 452 };
                if (n4 != 0) {
                    this.rd.setColor(this.color2k(255, 255, 255));
                }
                else {
                    this.rd.setColor(new Color(207, 177, 110));
                }
                this.rd.fillPolygon(array, array2, 8);
                this.rd.setColor(new Color(103, 88, 55));
                this.rd.drawPolygon(array, array2, 8);
                this.rd.drawImage(this.xt.dome, 311, 430, null);
            }
            else {
                String s = "You have ";
                if (!this.lg.clanapv.equals("")) {
                    s += "been approved for a clan membership";
                    if (this.lg.nmsgs != 0 || this.lg.nfreq != 0 || this.lg.nconf != 0) {
                        s += "! + You have ";
                    }
                }
                if (this.lg.ncreq != 0) {
                    s = s + "" + this.lg.ncreq + " clan membership requests";
                    if (this.lg.nmsgs != 0 || this.lg.nfreq != 0 || this.lg.nconf != 0) {
                        s += "! + You have ";
                    }
                }
                if (this.lg.nmsgs != 0) {
                    s += "new interactions";
                    if (this.lg.fclan > 0 && this.lg.fplayer > 0) {
                        String str = "";
                        String str2 = "";
                        if (this.lg.fplayer > 1) {
                            str = "s";
                        }
                        if (this.lg.fclan > 1) {
                            str2 = "s";
                        }
                        s = s + " from " + this.lg.fplayer + " player" + str + " & " + this.lg.fclan + " clan" + str2 + "";
                    }
                    else {
                        if (this.lg.fclan == 1) {
                            s += " from 1 clan";
                        }
                        if (this.lg.fclan > 1) {
                            s = s + " from " + this.lg.fclan + " clans";
                        }
                        if (this.lg.fplayer == 1) {
                            s += " from 1 player";
                        }
                        if (this.lg.fplayer > 1) {
                            s = s + " from " + this.lg.fplayer + " players";
                        }
                        if (this.lg.fclan == 0 && this.lg.fplayer == 0) {
                            s += " from your clan's discussion";
                        }
                    }
                    if (this.lg.nfreq != 0 && this.lg.nconf != 0) {
                        s += ", ";
                    }
                    else {
                        if (this.lg.nfreq != 0) {
                            s += " and ";
                        }
                        if (this.lg.nconf != 0) {
                            s += " and ";
                        }
                    }
                }
                if (this.lg.nfreq != 0) {
                    s = s + "" + this.lg.nfreq + " friend request";
                    if (this.lg.nfreq > 1) {
                        s += "s";
                    }
                    if (this.lg.nconf != 0) {
                        s += " and ";
                    }
                }
                if (this.lg.nconf != 0) {
                    s = s + "" + this.lg.nconf + " friend confirmation";
                    if (this.lg.nconf > 1) {
                        s += "s";
                    }
                }
                final String string = s + "!";
                this.rd.setFont(new Font("Arial", 1, 12));
                this.ftm = this.rd.getFontMetrics();
                int n5 = 0;
                if (this.ftm.stringWidth(string) > 280) {
                    n5 = (this.ftm.stringWidth(string) - 280) / 2;
                }
                if (n3 > 425 && n3 < 450 && n2 < 568 + n5 && n2 > 232 - n5) {
                    n4 = 1;
                }
                final int[] array3 = { 0, 9, 232 - n5, 250 - n5, 550 + n5, 568 + n5, 791, 800 };
                final int[] array4 = { 452, 443, 443, 425, 425, 443, 443, 452 };
                if (n4 != 0) {
                    this.rd.setColor(this.color2k(255, 255, 255));
                }
                else {
                    this.rd.setColor(new Color(207, 177, 110));
                }
                this.rd.fillPolygon(array3, array4, 8);
                this.rd.setColor(new Color(103, 88, 55));
                this.rd.drawPolygon(array3, array4, 8);
                if (this.flkn % 3 == 0) {
                    this.rd.setColor(new Color(60, 30, 0));
                }
                else {
                    this.rd.setColor(new Color(0, 100, 0));
                }
                this.rd.drawString(string, 400 - this.ftm.stringWidth(string) / 2, 442);
                if (this.flkn < 33) {
                    ++this.flkn;
                }
            }
            if (n4 != 0 && b && n < 2) {
                this.open = 2;
                this.upo = true;
                if (this.lg.nmsgs != 0) {
                    this.tab = 2;
                    if (this.lg.fplayer > 0) {
                        this.itab = 0;
                    }
                    else if (this.lg.fclan > 0) {
                        this.itab = 1;
                    }
                    else {
                        this.itab = 2;
                    }
                    this.litab = -1;
                }
                if (!this.lg.clanapv.equals("")) {
                    this.claname = this.lg.clanapv;
                    this.loadedc = false;
                    this.spos5 = 0;
                    this.lspos5 = 0;
                    this.cfase = 3;
                    this.tab = 3;
                    this.ctab = 0;
                }
                if (this.lg.ncreq != 0) {
                    this.claname = this.xt.clan;
                    this.loadedc = false;
                    this.spos5 = 0;
                    this.lspos5 = 0;
                    this.cfase = 3;
                    this.tab = 3;
                    this.ctab = 0;
                }
                if (this.lg.nfreq != 0 || this.lg.nconf != 0) {
                    this.ptab = 1;
                }
            }
            if (this.xt.onviewpro) {
                this.proname = this.cd.viewname;
                this.open = 2;
                this.upo = true;
                this.tab = 1;
                this.xt.onviewpro = false;
            }
        }
        else if (this.flkn != 0) {
            this.flkn = 0;
        }
        if (this.open >= 2 && this.open < 452) {
            final int[] array5 = { 0, 0, 9, 232, 250, 550, 568, 791, 800, 800 };
            final int[] array6 = { 902 - this.open, 452 - this.open, 443 - this.open, 443 - this.open, 425 - this.open, 425 - this.open, 443 - this.open, 443 - this.open, 452 - this.open, 902 - this.open };
            final float n6 = (this.open - 2.0f) / 450.0f;
            int r = (int)(255.0f * (1.0f - n6) + 216.0f * n6);
            if (r > 255) {
                r = 255;
            }
            if (r < 0) {
                r = 0;
            }
            int g = (int)(243.0f * (1.0f - n6) + 179.0f * n6);
            if (g > 255) {
                g = 255;
            }
            if (g < 0) {
                g = 0;
            }
            int b4 = (int)(179.0f * (1.0f - n6) + 100.0f * n6);
            if (b4 > 255) {
                b4 = 255;
            }
            if (b4 < 0) {
                b4 = 0;
            }
            this.rd.setColor(new Color(r, g, b4));
            this.rd.fillPolygon(array5, array6, 10);
            this.rd.drawImage(this.xt.dome, 311, 430 - this.open, null);
            if (this.upo) {
                this.open += 45;
            }
            else {
                this.open -= 45;
            }
            this.gs.hidefields();
            if (this.open == 452) {
                this.gs.setCursor(new Cursor(0));
                this.npo = -1;
                this.updatec = -1;
                this.domon = true;
                (this.connector = new Thread(this)).start();
            }
        }
        if (this.open == 452) {
            if (this.xt.warning == 0 || this.xt.warning == 210) {
                this.cur = 0;
                final int r2 = (int)(255.0f * this.bgf + 191.0f * (1.0f - this.bgf));
                final int g2 = (int)(176.0f * this.bgf + 184.0f * (1.0f - this.bgf));
                final int b5 = (int)(67.0f * this.bgf + 124.0f * (1.0f - this.bgf));
                if (!this.bgup) {
                    this.bgf += 0.02f;
                    if (this.bgf > 0.9f) {
                        this.bgf = 0.9f;
                        this.bgup = true;
                    }
                }
                else {
                    this.bgf -= 0.02f;
                    if (this.bgf < 0.2f) {
                        this.bgf = 0.2f;
                        this.bgup = false;
                    }
                }
                this.rd.setColor(new Color(r2, g2, b5));
                this.rd.fillRect(0, 0, 800, 450);
                this.rd.setComposite(AlphaComposite.getInstance(3, 0.6f));
                this.rd.drawImage(this.xt.bgmain, this.bgx[0], 0, null);
                this.rd.drawImage(this.xt.bgmain, this.bgx[1], 0, null);
                this.rd.drawImage(this.xt.bgmain, this.bgx[2], 0, null);
                this.rd.drawImage(this.xt.bgmain, this.bgx[0], 400, null);
                this.rd.drawImage(this.xt.bgmain, this.bgx[1], 400, null);
                this.rd.drawImage(this.xt.bgmain, this.bgx[2], 400, null);
                this.rd.setComposite(AlphaComposite.getInstance(3, 0.1f));
                this.rd.drawImage(this.xt.bggo, 0, 0, null);
                this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                for (int i = 0; i < 3; ++i) {
                    final int[] bgx = this.bgx;
                    final int n7 = i;
                    bgx[n7] -= 5;
                    if (this.bgx[i] <= -670) {
                        this.bgx[i] = 1340;
                    }
                }
                if (this.drawbutton(this.xt.exit, 755, 17, n2, n3, b) || n >= 2) {
                    this.open = 450;
                    this.upo = false;
                    this.domon = false;
                    this.onexit();
                }
                this.sdist = 0;
                this.scro = 0;
                if (this.domon) {
                    if (this.tab == 0) {
                        this.rd.setColor(this.color2k(230, 230, 230));
                        this.rd.fillRoundRect(197, 40, 597, 404, 20, 20);
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawRoundRect(197, 40, 597, 404, 20, 20);
                        if (this.updatec != -1) {
                            final String[] array7 = new String[42];
                            final String[] array8 = new String[42];
                            final String[] array9 = new String[42];
                            final boolean[] array10 = new boolean[42];
                            for (int j = 0; j < 42; ++j) {
                                array7[j] = "";
                                array9[j] = (array8[j] = "");
                                array10[j] = false;
                            }
                            int n8 = 0;
                            this.rd.setFont(new Font("Tahoma", 0, 11));
                            this.ftm = this.rd.getFontMetrics();
                            for (int k = 0; k < 21; ++k) {
                                array7[n8] = "";
                                array8[n8] = this.cnames[k];
                                array9[n8] = this.ctime[k];
                                int l = 0;
                                int endIndex = 0;
                                int n9 = 0;
                                int n10 = 0;
                                int n11 = 0;
                                while (l < this.sentn[k].length()) {
                                    final String string2 = "" + this.sentn[k].charAt(l);
                                    if (string2.equals(" ")) {
                                        endIndex = n9;
                                        n10 = l;
                                        ++n11;
                                    }
                                    else {
                                        n11 = 0;
                                    }
                                    if (n11 <= 1) {
                                        final StringBuilder sb = new StringBuilder();
                                        final String[] array11 = array7;
                                        final int n12 = n8;
                                        array11[n12] = sb.append(array11[n12]).append(string2).toString();
                                        ++n9;
                                        if (this.ftm.stringWidth(array7[n8]) > 469) {
                                            if (endIndex != 0) {
                                                array7[n8] = array7[n8].substring(0, endIndex);
                                                if (n8 == 41) {
                                                    for (int n13 = 0; n13 < 41; ++n13) {
                                                        array7[n13] = array7[n13 + 1];
                                                        array8[n13] = array8[n13 + 1];
                                                        array9[n13] = array9[n13 + 1];
                                                        array10[n13] = array10[n13 + 1];
                                                    }
                                                    array7[n8] = "";
                                                    array10[n8] = true;
                                                }
                                                else {
                                                    ++n8;
                                                    array8[n8] = this.cnames[k];
                                                    array9[n8] = this.ctime[k];
                                                }
                                                l = n10;
                                                n9 = 0;
                                                endIndex = 0;
                                            }
                                            else {
                                                array7[n8] = "";
                                                n9 = 0;
                                            }
                                        }
                                    }
                                    ++l;
                                }
                                if (n8 == 41 && k != 20) {
                                    for (int n14 = 0; n14 < 41; ++n14) {
                                        array7[n14] = array7[n14 + 1];
                                        array8[n14] = array8[n14 + 1];
                                        array9[n14] = array9[n14 + 1];
                                        array10[n14] = array10[n14 + 1];
                                    }
                                }
                                else {
                                    ++n8;
                                }
                            }
                            String s2 = "";
                            int n15 = n8;
                            for (int n16 = 0; n16 < n8; ++n16) {
                                if (!s2.equals(array8[n16])) {
                                    if (n16 != 0) {
                                        ++n15;
                                    }
                                    s2 = array8[n16];
                                }
                            }
                            this.sdist = (int)((n15 - 21.5f) * 15.0f);
                            if (this.sdist < 0) {
                                this.sdist = 0;
                            }
                            this.scro = (int)(this.spos2 / 275.0f * this.sdist);
                            int n17 = 0;
                            String s3 = "";
                            for (int n18 = 0; n18 <= n8; ++n18) {
                                if (n18 != n8) {
                                    if (!s3.equals(array8[n18])) {
                                        if (n18 != 0) {
                                            if (n17 * 15 - this.scro > -20 && n17 * 15 - this.scro < 345) {
                                                this.rd.setFont(new Font("Tahoma", 0, 11));
                                                this.rd.setColor(this.color2k(125, 125, 125));
                                                this.rd.drawString(array9[n18 - 1], 297, 82 + n17 * 15 - this.scro);
                                            }
                                            ++n17;
                                        }
                                        if (n17 * 15 - this.scro > -20 && n17 * 15 - this.scro < 345) {
                                            this.rd.setFont(new Font("Tahoma", 1, 11));
                                            this.ftm = this.rd.getFontMetrics();
                                            this.rd.setColor(new Color(0, 0, 0));
                                            this.rd.drawString(array8[n18] + ":", 292 - this.ftm.stringWidth(array8[n18] + ":"), 82 + n17 * 15 - this.scro);
                                        }
                                        s3 = array8[n18];
                                    }
                                    if (array10[n18] && n18 == 0 && array7[n18].indexOf(" ") != -1) {
                                        array7[n18] = "..." + array7[n18].substring(array7[n18].indexOf(" "), array7[n18].length()) + "";
                                    }
                                    if (n17 * 15 - this.scro > -20 && n17 * 15 - this.scro < 345) {
                                        this.rd.setFont(new Font("Tahoma", 0, 11));
                                        this.rd.setColor(new Color(0, 0, 0));
                                        this.rd.drawString(array7[n18], 297, 82 + n17 * 15 - this.scro);
                                    }
                                    ++n17;
                                }
                                else if (n17 * 15 - this.scro > -20 && n17 * 15 - this.scro < 345) {
                                    this.rd.setFont(new Font("Tahoma", 0, 11));
                                    this.rd.setColor(this.color2k(125, 125, 125));
                                    this.rd.drawString(array9[n18 - 1], 297, 82 + n17 * 15 - this.scro);
                                }
                            }
                        }
                        else {
                            this.sdist = 0;
                            this.scro = 0;
                            this.spos2 = 275;
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.setFont(new Font("Tahoma", 1, 11));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.drawString("Loading chat...", 498 - this.ftm.stringWidth("Loading chat...") / 2, 220);
                        }
                        this.rd.setColor(this.color2k(205, 205, 205));
                        this.rd.fillRect(207, 46, 582, 25);
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.rd.setColor(this.color2k(40, 40, 40));
                        this.rd.drawString("Global Chat", 213, 62);
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawLine(207, 68, 770, 68);
                        this.rd.setColor(this.color2k(205, 205, 205));
                        this.rd.fillRect(207, 411, 582, 28);
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawLine(207, 413, 770, 413);
                        this.rd.setColor(this.color2k(205, 205, 205));
                        this.rd.fillRect(772, 88, 17, 306);
                        this.rd.setColor(this.color2k(205, 205, 205));
                        this.rd.fillRect(203, 46, 4, 393);
                        b2 = true;
                        if ((this.stringbutton(this.rd, "Send Message", 731, 430, 3, n2, n3, b, 0, 0) || control.enter) && !this.gs.cmsg.getText().equals("Type here...") && !this.gs.cmsg.getText().equals("") && this.xt.acexp != -3) {
                            String replace = this.gs.cmsg.getText().replace('|', ':');
                            if (replace.toLowerCase().indexOf(this.gs.tpass.getText().toLowerCase()) != -1) {
                                replace = " ";
                            }
                            if (!this.xt.msgcheck(replace) && this.updatec > -12) {
                                for (int n19 = 0; n19 < 20; ++n19) {
                                    this.sentn[n19] = this.sentn[n19 + 1];
                                    this.cnames[n19] = this.cnames[n19 + 1];
                                    this.ctime[n19] = this.ctime[n19 + 1];
                                }
                                this.sentn[20] = replace;
                                this.cnames[20] = this.xt.nickname;
                                this.ctime[20] = "- just now";
                                if (this.updatec > -11) {
                                    this.updatec = -11;
                                }
                                else {
                                    --this.updatec;
                                }
                                this.spos2 = 275;
                            }
                            else {
                                final xtGraphics xt = this.xt;
                                ++xt.warning;
                            }
                            this.gs.cmsg.setText("");
                            control.enter = false;
                        }
                        if (this.mscro2 == 831 || this.sdist == 0) {
                            if (this.sdist == 0) {
                                this.rd.setColor(this.color2k(205, 205, 205));
                            }
                            else {
                                this.rd.setColor(this.color2k(215, 215, 215));
                            }
                            this.rd.fillRect(772, 71, 17, 17);
                        }
                        else {
                            this.rd.setColor(this.color2k(220, 220, 220));
                            this.rd.fill3DRect(772, 71, 17, 17, true);
                        }
                        if (this.sdist != 0) {
                            this.rd.drawImage(this.xt.asu, 777, 77, null);
                        }
                        if (this.mscro2 == 832 || this.sdist == 0) {
                            if (this.sdist == 0) {
                                this.rd.setColor(this.color2k(205, 205, 205));
                            }
                            else {
                                this.rd.setColor(this.color2k(215, 215, 215));
                            }
                            this.rd.fillRect(772, 394, 17, 17);
                        }
                        else {
                            this.rd.setColor(this.color2k(220, 220, 220));
                            this.rd.fill3DRect(772, 394, 17, 17, true);
                        }
                        if (this.sdist != 0) {
                            this.rd.drawImage(this.xt.asd, 777, 401, null);
                        }
                        if (this.sdist != 0) {
                            if (this.lspos2 != this.spos2) {
                                this.rd.setColor(this.color2k(215, 215, 215));
                                this.rd.fillRect(772, 88 + this.spos2, 17, 31);
                            }
                            else {
                                if (this.mscro2 == 831) {
                                    this.rd.setColor(this.color2k(215, 215, 215));
                                }
                                this.rd.fill3DRect(772, 88 + this.spos2, 17, 31, true);
                            }
                            this.rd.setColor(this.color2k(150, 150, 150));
                            this.rd.drawLine(777, 101 + this.spos2, 783, 101 + this.spos2);
                            this.rd.drawLine(777, 103 + this.spos2, 783, 103 + this.spos2);
                            this.rd.drawLine(777, 105 + this.spos2, 783, 105 + this.spos2);
                            if (this.mscro2 > 800 && this.lspos2 != this.spos2) {
                                this.lspos2 = this.spos2;
                            }
                            if (b) {
                                if (this.mscro2 == 825 && n2 > 772 && n2 < 789 && n3 > 88 + this.spos2 && n3 < this.spos2 + 119) {
                                    this.mscro2 = n3 - this.spos2;
                                }
                                if (this.mscro2 == 825 && n2 > 770 && n2 < 791 && n3 > 69 && n3 < 90) {
                                    this.mscro2 = 831;
                                }
                                if (this.mscro2 == 825 && n2 > 770 && n2 < 791 && n3 > 392 && n3 < 413) {
                                    this.mscro2 = 832;
                                }
                                if (this.mscro2 == 825 && n2 > 772 && n2 < 789 && n3 > 88 && n3 < 394) {
                                    this.mscro2 = 103;
                                    this.spos2 = n3 - this.mscro2;
                                }
                                int n20 = 2670 / this.sdist;
                                if (n20 < 1) {
                                    n20 = 1;
                                }
                                if (this.mscro2 == 831) {
                                    this.spos2 -= n20;
                                    if (this.spos2 > 275) {
                                        this.spos2 = 275;
                                    }
                                    if (this.spos2 < 0) {
                                        this.spos2 = 0;
                                    }
                                    this.lspos2 = this.spos2;
                                }
                                if (this.mscro2 == 832) {
                                    this.spos2 += n20;
                                    if (this.spos2 > 275) {
                                        this.spos2 = 275;
                                    }
                                    if (this.spos2 < 0) {
                                        this.spos2 = 0;
                                    }
                                    this.lspos2 = this.spos2;
                                }
                                if (this.mscro2 < 800) {
                                    this.spos2 = n3 - this.mscro2;
                                    if (this.spos2 > 275) {
                                        this.spos2 = 275;
                                    }
                                    if (this.spos2 < 0) {
                                        this.spos2 = 0;
                                    }
                                }
                                if (this.mscro2 == 825) {
                                    this.mscro2 = 925;
                                }
                            }
                            else if (this.mscro2 != 825) {
                                this.mscro2 = 825;
                            }
                        }
                    }
                    if (this.tab == 1) {
                        this.rd.setComposite(AlphaComposite.getInstance(3, 0.4f));
                        this.rd.setColor(new Color(255, 255, 255));
                        this.rd.fillRoundRect(207, 45, 577, 394, 20, 20);
                        this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawRoundRect(207, 45, 577, 394, 20, 20);
                        if (!this.flg) {
                            this.flk += 5;
                        }
                        else {
                            this.flk -= 5;
                        }
                        if (this.flk >= 100) {
                            this.flk = 100;
                            this.flg = true;
                        }
                        if (this.flk <= 60) {
                            this.flk = 60;
                            this.flg = false;
                        }
                        this.rd.setFont(new Font("Arial", 1, 13));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.setComposite(AlphaComposite.getInstance(3, this.flk / 100.0f));
                        boolean b6 = false;
                        if (this.protab == 2) {
                            if (this.proname.equals(this.xt.nickname)) {
                                this.rd.drawString("Your Stages", 227, 67);
                                b6 = true;
                            }
                            else {
                                this.rd.drawString("" + this.proname + "'s", 227, 67);
                                this.rd.drawString("Stages", 227, 84);
                            }
                            this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                            this.gs.proitem.move(496 - this.gs.proitem.getWidth() / 2, 60);
                            this.gs.proitem.show = true;
                            if (this.stringbutton(this.rd, "< Back to Profile", 715, 76, 1, n2, n3, b, 0, 0)) {
                                this.protab = 0;
                                this.gs.proitem.show = false;
                                this.addstage = 0;
                            }
                            if (this.gs.proitem.sel != 0) {
                                if (this.gs.proitem.getSelectedItem().equals(this.loadpstage)) {
                                    if (this.loadedpstage) {
                                        this.m.trk = 4;
                                        this.m.ih = -10;
                                        this.m.iw = -10;
                                        this.m.h = 320;
                                        this.m.w = 580;
                                        this.m.cx = 280;
                                        this.m.cy = 150;
                                        this.m.aroundtrack(this.cp);
                                        this.rdo.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
                                        this.m.d(this.rdo);
                                        int n21 = 0;
                                        final int[] array12 = new int[1000];
                                        for (int n22 = 0; n22 < this.gs.nob; ++n22) {
                                            if (this.co[n22].dist != 0) {
                                                array12[n21] = n22;
                                                ++n21;
                                            }
                                            else {
                                                this.co[n22].d(this.rdo);
                                            }
                                        }
                                        final int[] array13 = new int[n21];
                                        for (int n23 = 0; n23 < n21; ++n23) {
                                            array13[n23] = 0;
                                        }
                                        for (int n24 = 0; n24 < n21; ++n24) {
                                            for (int n25 = n24 + 1; n25 < n21; ++n25) {
                                                if (this.co[array12[n24]].dist != this.co[array12[n25]].dist) {
                                                    if (this.co[array12[n24]].dist < this.co[array12[n25]].dist) {
                                                        final int[] array14 = array13;
                                                        final int n26 = n24;
                                                        ++array14[n26];
                                                    }
                                                    else {
                                                        final int[] array15 = array13;
                                                        final int n27 = n25;
                                                        ++array15[n27];
                                                    }
                                                }
                                                else if (n25 > n24) {
                                                    final int[] array16 = array13;
                                                    final int n28 = n24;
                                                    ++array16[n28];
                                                }
                                                else {
                                                    final int[] array17 = array13;
                                                    final int n29 = n25;
                                                    ++array17[n29];
                                                }
                                            }
                                        }
                                        for (int n30 = 0; n30 < n21; ++n30) {
                                            for (int n31 = 0; n31 < n21; ++n31) {
                                                if (array13[n31] == n30) {
                                                    this.co[array12[n31]].d(this.rdo);
                                                }
                                            }
                                        }
                                        this.rdo.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                                        this.m.trk = 0;
                                        this.m.h = 450;
                                        this.m.w = 800;
                                        this.m.cx = 400;
                                        this.m.cy = 225;
                                        this.rdo.setComposite(AlphaComposite.getInstance(3, 0.5f));
                                        this.rdo.setColor(new Color(255, 255, 255));
                                        this.rdo.fillRoundRect(9, 44, 136, 39, 20, 20);
                                        this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                                        this.rdo.setFont(new Font("Arial", 1, 12));
                                        this.ftm = this.rdo.getFontMetrics();
                                        this.rdo.setColor(new Color(0, 0, 0));
                                        this.rdo.drawString("Created/Published by", 17, 59);
                                        final int n32 = 17 + this.ftm.stringWidth("Created/Published by") / 2 - this.ftm.stringWidth(this.cp.maker) / 2;
                                        final int n33 = n32 + this.ftm.stringWidth(this.cp.maker);
                                        this.rdo.drawString(this.cp.maker, n32, 74);
                                        this.rdo.drawLine(n32, 76, n33, 76);
                                        if (n2 > n32 + 216 && n2 < n33 + 216 && n3 > 154 && n3 < 168) {
                                            this.cur = 12;
                                            if (b) {
                                                this.tab = 1;
                                                if (!this.proname.equals(this.cp.maker)) {
                                                    this.proname = this.cp.maker;
                                                    this.loadedp = false;
                                                    this.onexitpro();
                                                }
                                            }
                                        }
                                        if (this.gs.proitem.getSelectedIndex() != this.gs.proitem.no - 1 && this.stringbutton(this.rdo, " Next > ", 510, 200, -3, n2, n3, b && !this.gs.openm, 216, 92)) {
                                            final Smenu proitem = this.gs.proitem;
                                            ++proitem.sel;
                                        }
                                        if (this.gs.proitem.getSelectedIndex() != 1 && this.stringbutton(this.rdo, " < Prev ", 50, 200, -3, n2, n3, b && !this.gs.openm, 216, 92)) {
                                            final Smenu proitem2 = this.gs.proitem;
                                            --proitem2.sel;
                                        }
                                        if (this.cp.pubt > 0) {
                                            this.rd.setFont(new Font("Arial", 1, 12));
                                            this.ftm = this.rd.getFontMetrics();
                                            this.rd.setColor(new Color(0, 0, 0));
                                            if (this.addstage == 2) {
                                                this.rd.drawString("Adding Stage...", 496 - this.ftm.stringWidth("Adding Stage...") / 2, 419);
                                                if (this.cd.staction == 0) {
                                                    this.addstage = 3;
                                                }
                                                if (this.cd.staction == -2) {
                                                    this.addstage = 4;
                                                }
                                                if (this.cd.staction == -3) {
                                                    this.addstage = 5;
                                                }
                                                if (this.cd.staction == -1) {
                                                    this.addstage = 6;
                                                }
                                            }
                                            if (this.addstage == 3) {
                                                this.rd.drawString("[" + this.cd.onstage + "] has been added to your stages!", 496 - this.ftm.stringWidth("[" + this.cd.onstage + "] has been added to your stages!") / 2, 419);
                                            }
                                            if (this.addstage == 4) {
                                                this.rd.drawString("You already have this stage.", 496 - this.ftm.stringWidth("You already have this stage.") / 2, 419);
                                            }
                                            if (this.addstage == 5) {
                                                this.rd.drawString("Cannot add more then 20 stages to your account!", 496 - this.ftm.stringWidth("Cannot add more then 20 stages to your account!") / 2, 419);
                                            }
                                            if (this.addstage == 6) {
                                                this.rd.drawString("Failed to add stage!  Unknown error, please try again later.", 496 - this.ftm.stringWidth("Failed to add stage!  Unknown error, please try again later.") / 2, 419);
                                            }
                                            if (this.addstage == 1) {
                                                final String s4 = "Upgrade to a full account to add custom stages!";
                                                final int n34 = 496 - this.ftm.stringWidth(s4) / 2;
                                                final int n35 = n34 + this.ftm.stringWidth(s4);
                                                this.rd.drawString(s4, n34, 419);
                                                if (this.waitlink != -1) {
                                                    this.rd.drawLine(n34, 435, n35, 435);
                                                }
                                                if (n2 > n34 && n2 < n35 && n3 > 421 && n3 < 435) {
                                                    if (this.waitlink != -1) {
                                                        this.cur = 12;
                                                    }
                                                    if (b && this.waitlink == 0) {
                                                        this.gs.editlink(this.xt.nickname, true);
                                                        this.waitlink = -1;
                                                    }
                                                }
                                                if (this.waitlink > 0) {
                                                    --this.waitlink;
                                                }
                                            }
                                            if (this.addstage == 0 && this.xt.drawcarb(true, null, " Add to My Stages ", 437, 401, n2, n3, b && this.blocknote == 0)) {
                                                if (this.xt.logged) {
                                                    this.cd.onstage = this.loadpstage;
                                                    this.cd.staction = 2;
                                                    this.cd.sparkstageaction();
                                                    this.addstage = 2;
                                                }
                                                else {
                                                    this.addstage = 1;
                                                    this.waitlink = 20;
                                                }
                                            }
                                        }
                                        else {
                                            this.rd.setFont(new Font("Arial", 1, 12));
                                            this.ftm = this.rd.getFontMetrics();
                                            this.rd.setColor(new Color(0, 0, 0));
                                            this.rd.drawString("Private Stage", 496 - this.ftm.stringWidth("Private Stage") / 2, 419);
                                        }
                                    }
                                    else {
                                        this.rdo.setColor(new Color(206, 171, 98));
                                        this.rdo.fillRect(0, 0, 560, 300);
                                        this.rdo.setColor(new Color(0, 0, 0));
                                        this.rdo.setFont(new Font("Arial", 1, 12));
                                        this.ftm = this.rdo.getFontMetrics();
                                        this.rdo.drawString("Failed to load stage, try again later or try another stage...", 280 - this.ftm.stringWidth("Failed to load stage, try again later or try another stage...") / 2, 140);
                                    }
                                }
                                else {
                                    this.rdo.setColor(new Color(206, 171, 98));
                                    this.rdo.fillRect(0, 0, 560, 300);
                                    this.rdo.setColor(new Color(0, 0, 0));
                                    this.rdo.setFont(new Font("Arial", 1, 12));
                                    this.ftm = this.rdo.getFontMetrics();
                                    this.rdo.drawString("Loading stage, please wait...", 280 - this.ftm.stringWidth("Loading stage, please wait...") / 2, 140);
                                }
                            }
                            else {
                                this.rdo.setColor(new Color(206, 171, 98));
                                this.rdo.fillRect(0, 0, 560, 300);
                            }
                            this.rd.drawImage(this.gImage, 216, 92, null);
                        }
                        if (this.protab == 0) {
                            if (this.proname.equals(this.xt.nickname)) {
                                this.rd.drawString("Your Profile", 232, 67);
                                b6 = true;
                            }
                            else {
                                this.rd.drawString("" + this.proname + "'s Profile", 232, 67);
                            }
                            this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                            if (this.loadedp) {
                                if (!b6 && this.stringbutton(this.rd, "   My Profile   ", 715, 73, 1, n2, n3, b, 0, 0)) {
                                    this.proname = this.xt.nickname;
                                    this.loadedp = false;
                                    this.onexitpro();
                                }
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.setFont(new Font("Arial", 0, 11));
                                this.ftm = this.rd.getFontMetrics();
                                if (this.logol) {
                                    this.drawl(this.rd, this.proname, 236, 101, true);
                                }
                                else {
                                    this.rd.drawString("No logo available", 296 - this.ftm.stringWidth("No logo available") / 2, 121);
                                }
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                String s5 = "Logo";
                                if (n2 > 232 && n2 < 359 && n3 > 84 && n3 < 134 && this.edit == 0 && b6) {
                                    s5 = "Edit Logo";
                                    this.rd.drawLine(238, 98, 238 + this.ftm.stringWidth(s5), 98);
                                    if (n2 > 238 && n2 < 238 + this.ftm.stringWidth(s5) && n3 > 85 && n3 < 100) {
                                        this.cur = 12;
                                        if (b) {
                                            if (this.xt.logged) {
                                                this.edit = 1;
                                                this.msg = "Edit your Nickname's logo";
                                                this.flko = 0;
                                            }
                                            else {
                                                this.edit = 5;
                                            }
                                        }
                                    }
                                }
                                this.rd.drawString(s5, 238, 97);
                                this.rd.drawLine(232, 84, 232, 134);
                                this.rd.drawLine(232, 84, 238 + this.ftm.stringWidth(s5) + 2, 84);
                                this.rd.drawLine(238 + this.ftm.stringWidth(s5) + 2, 84, 238 + this.ftm.stringWidth(s5) + 15, 97);
                                this.rd.drawLine(238 + this.ftm.stringWidth(s5) + 15, 97, 359, 97);
                                this.rd.drawLine(359, 97, 359, 134);
                                this.rd.drawLine(232, 134, 359, 134);
                                if (b6 && !this.xt.clan.equals(this.proclan)) {
                                    this.proclan = this.xt.clan;
                                }
                                if (!this.proclan.equals("")) {
                                    if (!this.drawl(this.rd, "#" + this.proclan + "#", 406, 101, true)) {
                                        this.rd.setFont(new Font("Arial", 1, 13));
                                        this.ftm = this.rd.getFontMetrics();
                                        this.rd.drawString("" + this.proclan + "", 581 - this.ftm.stringWidth("" + this.proclan + "") / 2, 121);
                                    }
                                }
                                else {
                                    this.rd.setFont(new Font("Arial", 0, 11));
                                    this.ftm = this.rd.getFontMetrics();
                                    if (b6) {
                                        this.rd.drawString("You have not joined a clan yet!", 416, 121);
                                        if (this.stringbutton(this.rd, "   Find a clan to join   ", 663, 121, 1, n2, n3, b, 0, 0)) {
                                            this.tab = 3;
                                            this.cfase = 2;
                                            this.em = 1;
                                            this.msg = "Clan Search";
                                            this.smsg = "Listing clans with recent activity...";
                                            this.nclns = 0;
                                            this.spos5 = 0;
                                            this.lspos5 = 0;
                                            this.flko = 0;
                                        }
                                    }
                                    else if (this.xt.clan.equals("")) {
                                        this.rd.drawString("Has not joined a clan yet", 581 - this.ftm.stringWidth("Has not joined a clan yet") / 2, 121);
                                    }
                                    else {
                                        this.rd.drawString("Has not joined a clan yet", 430, 121);
                                        if (this.stringbutton(this.rd, " Invite to join your clan ", 657, 121, 1, n2, n3, b, 0, 0)) {
                                            this.tab = 2;
                                            this.itab = 0;
                                            this.litab = -1;
                                            this.openc = 10;
                                            if (!this.opname.equals(this.proname)) {
                                                this.opname = this.proname;
                                                this.lastsub = "";
                                                this.readmsg = 1;
                                            }
                                            this.itemsel = 3;
                                            this.forcsel = true;
                                        }
                                    }
                                }
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                String string3 = "Clan";
                                if (n2 > 402 && n2 < 759 && n3 > 84 && n3 < 134 && !this.proclan.equals("") && this.edit == 0) {
                                    string3 = "Clan :  " + this.proclan + "";
                                    this.rd.drawLine(408, 98, 408 + this.ftm.stringWidth(string3), 98);
                                    if ((n2 > 408 && n2 < 408 + this.ftm.stringWidth(string3) && n3 > 85 && n3 < 100) || (n2 > 406 && n2 < 756 && n3 > 101 && n3 < 131)) {
                                        this.cur = 12;
                                        if (b) {
                                            if (!this.claname.equals(this.proclan)) {
                                                this.claname = this.proclan;
                                                this.loadedc = false;
                                            }
                                            this.spos5 = 0;
                                            this.lspos5 = 0;
                                            this.cfase = 3;
                                            this.tab = 3;
                                            this.ctab = 0;
                                        }
                                    }
                                }
                                this.rd.drawString(string3, 408, 97);
                                this.rd.drawLine(402, 84, 402, 134);
                                this.rd.drawLine(402, 84, 408 + this.ftm.stringWidth(string3) + 2, 84);
                                this.rd.drawLine(408 + this.ftm.stringWidth(string3) + 2, 84, 408 + this.ftm.stringWidth(string3) + 15, 97);
                                this.rd.drawLine(408 + this.ftm.stringWidth(string3) + 15, 97, 759, 97);
                                this.rd.drawLine(759, 97, 759, 134);
                                this.rd.drawLine(402, 134, 759, 134);
                                this.rd.setFont(new Font("Arial", 0, 11));
                                this.ftm = this.rd.getFontMetrics();
                                if (this.avatarl) {
                                    this.rd.drawImage(this.avatar, 236, 161, null);
                                }
                                else {
                                    this.rd.drawString("No avatar available", 336 - this.ftm.stringWidth("No avatar available") / 2, 255);
                                }
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                String s6 = "Avatar";
                                if (n2 > 232 && n2 < 439 && n3 > 144 && n3 < 364 && this.edit == 0 && b6) {
                                    s6 = "Edit Avatar";
                                    this.rd.drawLine(238, 158, 238 + this.ftm.stringWidth(s6), 158);
                                    if (n2 > 238 && n2 < 238 + this.ftm.stringWidth(s6) && n3 > 145 && n3 < 160) {
                                        this.cur = 12;
                                        if (b) {
                                            if (this.xt.logged) {
                                                this.edit = 2;
                                                this.msg = "Edit your proflie avatar";
                                                this.flko = 0;
                                            }
                                            else {
                                                this.edit = 5;
                                            }
                                        }
                                    }
                                }
                                this.rd.drawString(s6, 238, 157);
                                this.rd.drawLine(232, 144, 232, 364);
                                this.rd.drawLine(232, 144, 238 + this.ftm.stringWidth(s6) + 2, 144);
                                this.rd.drawLine(238 + this.ftm.stringWidth(s6) + 2, 144, 238 + this.ftm.stringWidth(s6) + 15, 157);
                                this.rd.drawLine(238 + this.ftm.stringWidth(s6) + 15, 157, 439, 157);
                                this.rd.drawLine(439, 157, 439, 364);
                                this.rd.drawLine(232, 364, 439, 364);
                                String s7 = "About";
                                if (n2 > 459 && n2 < 759 && n3 > 144 && n3 < 364 && this.edit == 0 && b6) {
                                    s7 = "Edit About";
                                    this.rd.drawLine(465, 158, 465 + this.ftm.stringWidth(s7), 158);
                                    if (n2 > 465 && n2 < 465 + this.ftm.stringWidth(s7) && n3 > 145 && n3 < 160) {
                                        this.cur = 12;
                                        if (b) {
                                            if (this.xt.logged) {
                                                this.edit = 3;
                                                this.msg = "";
                                                this.flko = 0;
                                                this.sentchange = 0;
                                                this.badlang = false;
                                            }
                                            else {
                                                this.edit = 5;
                                            }
                                        }
                                    }
                                }
                                this.rd.drawString(s7, 465, 157);
                                this.rd.drawLine(459, 144, 459, 364);
                                this.rd.drawLine(459, 144, 465 + this.ftm.stringWidth(s7) + 2, 144);
                                this.rd.drawLine(465 + this.ftm.stringWidth(s7) + 2, 144, 465 + this.ftm.stringWidth(s7) + 15, 157);
                                this.rd.drawLine(465 + this.ftm.stringWidth(s7) + 15, 157, 759, 157);
                                this.rd.drawLine(759, 157, 759, 364);
                                this.rd.drawLine(459, 364, 759, 364);
                                if (this.nab != 0) {
                                    this.rd.setFont(new Font("Tahoma", 1, 11));
                                    int n36 = 200;
                                    if (this.nab == 2) {
                                        n36 = 192;
                                    }
                                    if (this.nab == 3) {
                                        n36 = 185;
                                    }
                                    for (int n37 = 0; n37 < this.nab; ++n37) {
                                        this.rd.drawString(this.aboutxt[n37], 469, n36 + n37 * 15);
                                    }
                                }
                                else {
                                    this.rd.setFont(new Font("Arial", 0, 11));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.drawString("No description available", 609 - this.ftm.stringWidth("No description available") / 2, 200);
                                }
                                this.rd.drawLine(489, 230, 729, 230);
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.drawString("Racing", 532 - this.ftm.stringWidth("Racing") / 2, 253);
                                this.rd.drawString("VS", 532 - this.ftm.stringWidth("VS") / 2, 270);
                                this.rd.drawString("Wasting", 532 - this.ftm.stringWidth("Wasting") / 2, 287);
                                float n38 = (float)this.racing;
                                float n39 = (float)this.wasting;
                                if (this.racing > 10 && this.racing > this.wasting) {
                                    n38 = 10.0f;
                                    n39 = this.wasting / (this.racing / 10.0f);
                                }
                                if (this.wasting > 10 && this.wasting >= this.racing) {
                                    n39 = 10.0f;
                                    n38 = this.racing / (this.wasting / 10.0f);
                                }
                                final float n40 = n38 * 14.0f;
                                final float n41 = n39 * 14.0f;
                                for (int n42 = 0; n42 < 5; ++n42) {
                                    if (n40 != 0.0f) {
                                        this.rd.setColor(new Color(0, n42 * 50, 255));
                                        this.rd.drawLine(569, 245 + n42, (int)(569.0f + n40), 245 + n42);
                                        this.rd.drawLine(569, 254 - n42, (int)(569.0f + n40), 254 - n42);
                                    }
                                    if (n41 != 0.0f) {
                                        this.rd.setColor(new Color(255, n42 * 50, 0));
                                        this.rd.drawLine(569, 279 + n42, (int)(569.0f + n41), 279 + n42);
                                        this.rd.drawLine(569, 288 - n42, (int)(569.0f + n41), 288 - n42);
                                    }
                                }
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.drawRect(569, 244, 140, 11);
                                this.rd.drawRect(569, 278, 140, 11);
                                this.rd.drawLine(489, 304, 729, 304);
                                if (!this.themesong.equals("") && this.trackvol != 0) {
                                    if (this.playt == 1) {
                                        this.rd.drawString("Loading theme song, please wait...", 609 - this.ftm.stringWidth("Loading theme song, please wait...") / 2, 340);
                                    }
                                    if (this.playt == 0 && this.stringbutton(this.rd, " Play Theme Song ", 609, 340, 1, n2, n3, b, 0, 0) && this.edit == 0) {
                                        this.playt = 1;
                                    }
                                    if (this.playt == 2) {
                                        this.rd.drawString("Theme song playing...", 609 - this.ftm.stringWidth("Theme song playing...") / 2, 325);
                                        if (this.stringbutton(this.rd, " Stop ", 609, 350, 2, n2, n3, b, 0, 0)) {
                                            this.xt.strack.unload();
                                            this.playt = 0;
                                        }
                                    }
                                }
                                else {
                                    this.rd.setFont(new Font("Arial", 0, 11));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.drawString("No theme song available", 609 - this.ftm.stringWidth("No theme song available") / 2, 340);
                                }
                                if (!b6) {
                                    if (this.sfreq == 0) {
                                        this.rd.drawRect(232, 378, 527, 50);
                                        boolean b7 = false;
                                        for (int n43 = 0; n43 < this.npf; ++n43) {
                                            if (this.proname.toLowerCase().equals(this.fname[n43].toLowerCase())) {
                                                b7 = true;
                                                break;
                                            }
                                        }
                                        if (b7) {
                                            if (this.stringbutton(this.rd, "    Un-friend    ", 313, 408, 1, n2, n3, b, 0, 0)) {
                                                this.sfreq = 4;
                                            }
                                        }
                                        else if (this.stringbutton(this.rd, "   Add Friend   ", 313, 408, 1, n2, n3, b, 0, 0)) {
                                            this.sfreq = 1;
                                        }
                                        if (this.stringbutton(this.rd, "   Send Message   ", 436, 408, 1, n2, n3, b, 0, 0)) {
                                            this.tab = 2;
                                            this.openc = 10;
                                            this.itab = 0;
                                            this.litab = -1;
                                            if (!this.opname.equals(this.proname)) {
                                                this.opname = this.proname;
                                                this.lastsub = "";
                                                this.readmsg = 1;
                                            }
                                        }
                                        if (this.stringbutton(this.rd, "   View Cars   ", 558, 408, 1, n2, n3, b, 0, 0)) {
                                            this.cd.viewname = this.proname;
                                            this.onexitpro();
                                            this.cd.action = 100;
                                            this.xt.cfase = 100;
                                            this.xt.onviewpro = true;
                                            this.xt.fase = 23;
                                        }
                                        if (this.stringbutton(this.rd, "   View Stages   ", 673, 408, 1, n2, n3, b, 0, 0)) {
                                            this.protab = 2;
                                            this.loadpst = 0;
                                            this.gs.proitem.removeAll();
                                            this.gs.proitem.add(this.gs.rd, "Loading stages, please wait...");
                                        }
                                    }
                                    else {
                                        this.rd.setColor(new Color(236, 215, 140));
                                        this.rd.fillRect(232, 378, 527, 50);
                                        this.rd.setColor(new Color(0, 0, 0));
                                        this.rd.drawRect(232, 378, 527, 50);
                                        this.rd.setFont(new Font("Arial", 1, 12));
                                        this.ftm = this.rd.getFontMetrics();
                                        if (this.sfreq == 1) {
                                            this.rd.drawString("Sending a friend request to " + this.proname + ", please wait...", 495 - this.ftm.stringWidth("Sending a friend request to " + this.proname + ", please wait...") / 2, 408);
                                        }
                                        if (this.sfreq == 2) {
                                            this.rd.drawString("Friend request sent, waiting for " + this.proname + "'s approval.", 495 - this.ftm.stringWidth("Friend request sent, waiting for " + this.proname + "'s approval.") / 2, 408);
                                            if (this.stringbutton(this.rd, "  OK  ", 690, 408, 1, n2, n3, b, 0, 0)) {
                                                this.sfreq = 0;
                                            }
                                        }
                                        if (this.sfreq == 3) {
                                            this.rd.drawString("Failed to send friend request, please try again later.", 495 - this.ftm.stringWidth("Failed to send friend request, please try again later.") / 2, 408);
                                            if (this.stringbutton(this.rd, "  OK  ", 690, 408, 1, n2, n3, b, 0, 0)) {
                                                this.sfreq = 0;
                                            }
                                        }
                                        if (this.sfreq == 4) {
                                            this.rd.drawString("Removing " + this.proname + " from firends, please wait...", 495 - this.ftm.stringWidth("Removing " + this.proname + " from firends, please wait...") / 2, 408);
                                        }
                                        if (this.sfreq == 5) {
                                            this.rd.drawString("You are no longer friends with " + this.proname + ".", 495 - this.ftm.stringWidth("You are no longer friends with " + this.proname + ".") / 2, 408);
                                            if (this.stringbutton(this.rd, "  OK  ", 690, 408, 1, n2, n3, b, 0, 0)) {
                                                this.sfreq = 0;
                                            }
                                        }
                                        if (this.sfreq == 6) {
                                            this.rd.drawString("Failed to remove friend, please try again later.", 495 - this.ftm.stringWidth("Failed to remove friend, please try again later.") / 2, 408);
                                            if (this.stringbutton(this.rd, "  OK  ", 690, 408, 1, n2, n3, b, 0, 0)) {
                                                this.sfreq = 0;
                                            }
                                        }
                                    }
                                }
                                if (this.edit == 1 || this.edit == 2) {
                                    this.rd.setColor(new Color(244, 232, 204));
                                    this.rd.fillRoundRect(265, 92, 460, 220, 20, 20);
                                    this.rd.setColor(new Color(0, 0, 0));
                                    this.rd.drawRoundRect(265, 92, 460, 220, 20, 20);
                                    final String[] array18 = { "logo", "120x30", "4 : 1" };
                                    if (this.edit == 2) {
                                        array18[0] = "avatar";
                                        array18[1] = "200x200";
                                        array18[2] = "1 : 1";
                                    }
                                    this.rd.setFont(new Font("Arial", 1, 12));
                                    this.ftm = this.rd.getFontMetrics();
                                    if (this.flko % 4 != 0 || this.flko == 0) {
                                        this.rd.drawString(this.msg, 495 - this.ftm.stringWidth(this.msg) / 2, 115);
                                    }
                                    if (this.flko != 0) {
                                        --this.flko;
                                    }
                                    this.rd.setFont(new Font("Arial", 0, 12));
                                    this.rd.drawString("The " + array18[0] + " image is " + array18[1] + " pixels.", 275, 140);
                                    this.rd.drawString("Any image uploaded will be resized to that width and height. For the best results", 275, 160);
                                    this.rd.drawString("try to upload an image that is bigger or equal to " + array18[1] + " and has the scale of", 275, 180);
                                    this.rd.drawString("[ " + array18[2] + " ]  in  [ Width : Height ].", 275, 200);
                                    this.rd.drawString("Image uploaded must be less than 1MB and in the format of JPEG, GIF or PNG.", 275, 220);
                                    if (this.upload == 0) {
                                        if (this.stringbutton(this.rd, "  Upload Image  ", 495, 250, 0, n2, n3, b, 0, 0)) {
                                            final FileDialog fileDialog = new FileDialog(new Frame(), "Upload Image");
                                            fileDialog.setMode(0);
                                            fileDialog.setVisible(true);
                                            this.filename = "" + fileDialog.getDirectory() + "" + fileDialog.getFile() + "";
                                            if (!this.filename.equals("nullnull")) {
                                                this.upload = 1;
                                            }
                                        }
                                    }
                                    else {
                                        this.rd.setFont(new Font("Arial", 1, 12));
                                        this.ftm = this.rd.getFontMetrics();
                                        if (this.upload == 1) {
                                            this.rd.drawString("Checking image...", 495 - this.ftm.stringWidth("Checking image...") / 2, 250);
                                        }
                                        if (this.upload == 2) {
                                            this.rd.drawString("Authenticating...", 495 - this.ftm.stringWidth("Authenticating...") / 2, 250);
                                        }
                                        if (this.upload == 3) {
                                            this.rd.drawString("Uploading image :  " + this.perc + " %", 495 - this.ftm.stringWidth("Uploading image :  80 %") / 2, 250);
                                        }
                                        if (this.upload == 4) {
                                            this.rd.drawString("Creating image online...", 495 - this.ftm.stringWidth("Creating image online...") / 2, 250);
                                        }
                                        if (this.upload == 5) {
                                            this.rd.drawString("Done", 495 - this.ftm.stringWidth("Done") / 2, 250);
                                        }
                                    }
                                    if (this.stringbutton(this.rd, " Cancel ", 495, 290, 2, n2, n3, b, 0, 0)) {
                                        if (this.upload == 0) {
                                            this.edit = 0;
                                        }
                                        else {
                                            this.upload = 0;
                                        }
                                    }
                                }
                                if (this.edit == 3) {
                                    this.rd.setColor(new Color(244, 232, 204));
                                    this.rd.fillRoundRect(265, 38, 460, 390, 20, 20);
                                    this.rd.setColor(new Color(0, 0, 0));
                                    this.rd.drawRoundRect(265, 38, 460, 390, 20, 20);
                                    this.rd.setFont(new Font("Arial", 1, 12));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.drawString("Edit your about section", 495 - this.ftm.stringWidth("Edit your about section") / 2, 61);
                                    this.rd.setFont(new Font("Arial", 0, 12));
                                    if (!this.badlang) {
                                        this.rd.drawString("Type in a sentence that best describes you and your playing style in the game :", 275, 86);
                                    }
                                    else {
                                        this.rd.setFont(new Font("Arial", 1, 12));
                                        this.rd.drawString("The sentence must not contain bad language!", 275, 86);
                                        this.rd.setFont(new Font("Arial", 0, 12));
                                    }
                                    b3 = true;
                                    this.rd.drawLine(315, 123, 675, 123);
                                    this.rd.drawString("The ( Racing VS Wasting ) is comparison between your multiplayer wins by", 275, 146);
                                    this.rd.drawString("racing versus wasting.", 275, 166);
                                    this.rd.drawString("It does not in anyway signify if you are better or worse than another player!", 275, 186);
                                    this.rd.drawString("It simply shows whether you have a tendency to win games by racing or by", 275, 206);
                                    this.rd.drawString("wasting, it shows what you are better at.", 275, 226);
                                    this.rd.drawLine(315, 241, 675, 241);
                                    this.rd.drawString("Upload your very own theme song!", 275, 264);
                                    this.rd.drawString("The theme song must be a Module Track that is in a zip file and less than 700KB.", 275, 284);
                                    this.rd.drawString("You can find lots of Module Tracks at modarchive.org.", 275, 304);
                                    this.rd.setFont(new Font("Arial", 1, 12));
                                    this.ftm = this.rd.getFontMetrics();
                                    if (this.uploadt == 0) {
                                        if (this.msg.equals("")) {
                                            if (!this.themesong.equals("") && this.trackvol != 0) {
                                                this.rd.drawString("Current Track : " + this.themesong + "", 495 - this.ftm.stringWidth("Current Track : " + this.themesong + "") / 2, 324);
                                            }
                                            else {
                                                this.rd.setFont(new Font("Arial", 0, 12));
                                                this.rd.drawString("[ No theme song uploaded... ]", 495 - this.ftm.stringWidth("[ No theme song uploaded... ]") / 2, 324);
                                            }
                                        }
                                        else {
                                            if (this.flko % 4 != 0 || this.flko == 0) {
                                                this.rd.drawString(this.msg, 495 - this.ftm.stringWidth(this.msg) / 2, 324);
                                            }
                                            if (this.flko != 0) {
                                                --this.flko;
                                            }
                                        }
                                        if (this.stringbutton(this.rd, "  Upload Track  ", 495, 354, 0, n2, n3, b, 0, 0)) {
                                            final FileDialog fileDialog2 = new FileDialog(new Frame(), "Upload Track");
                                            fileDialog2.setMode(0);
                                            fileDialog2.setFile("*.zip");
                                            fileDialog2.setVisible(true);
                                            this.filename = "" + fileDialog2.getDirectory() + "" + fileDialog2.getFile() + "";
                                            if (!this.filename.equals("nullnull")) {
                                                this.trackname = fileDialog2.getFile().substring(0, fileDialog2.getFile().length() - 4);
                                                this.uploadt = 1;
                                            }
                                        }
                                    }
                                    else {
                                        if (this.uploadt == 1) {
                                            this.rd.drawString("Checking MOD Track...", 495 - this.ftm.stringWidth("Checking MOD Track...") / 2, 354);
                                        }
                                        if (this.uploadt == 2) {
                                            this.rd.drawString("Authenticating...", 495 - this.ftm.stringWidth("Authenticating...") / 2, 354);
                                        }
                                        if (this.uploadt == 3) {
                                            this.rd.drawString("Uploading track, please wait...", 495 - this.ftm.stringWidth("Uploading track, please wait...") / 2, 354);
                                        }
                                        if (this.uploadt == 4) {
                                            this.rd.drawString("Adding track to your profile...", 495 - this.ftm.stringWidth("Adding track to your profile...") / 2, 354);
                                        }
                                        if (this.uploadt == 5) {
                                            this.rd.drawString("Done", 495 - this.ftm.stringWidth("Done") / 2, 354);
                                        }
                                    }
                                    this.rd.drawLine(315, 376, 675, 376);
                                    if (this.stringbutton(this.rd, "        Done        ", 495, 407, 1, n2, n3, b, 0, 0)) {
                                        this.edit = 0;
                                        if (this.sentchange == 1) {
                                            if (this.xt.msgcheck(this.sentance) || this.sentance.toLowerCase().indexOf(this.gs.tpass.getText().toLowerCase()) != -1 || this.xt.acexp == -3) {
                                                this.edit = 3;
                                                this.sentchange = 0;
                                                this.sentance = "";
                                                this.gs.cmsg.setText(this.sentance);
                                                this.badlang = true;
                                            }
                                            else {
                                                this.sentchange = 2;
                                            }
                                            this.trunsent();
                                        }
                                    }
                                }
                                if (this.edit == 5) {
                                    this.rd.setColor(new Color(244, 232, 204));
                                    this.rd.fillRoundRect(265, 187, 460, 125, 20, 20);
                                    this.rd.setColor(new Color(0, 0, 0));
                                    this.rd.drawRoundRect(265, 187, 460, 125, 20, 20);
                                    this.rd.setFont(new Font("Arial", 1, 12));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.drawString("You need to upgrade your account to a full account to have a profile!", 495 - this.ftm.stringWidth("You need to upgrade your account to a full account to have a profile!") / 2, 209);
                                    this.rd.setColor(new Color(206, 171, 98));
                                    this.rd.fillRoundRect(405, 222, 180, 50, 20, 20);
                                    if (this.drawbutton(this.xt.upgrade, 495, 247, n2, n3, b)) {
                                        this.gs.editlink(this.xt.nickname, true);
                                    }
                                    if (this.stringbutton(this.rd, "  Cancel  ", 495, 297, 2, n2, n3, b, 0, 0)) {
                                        this.edit = 0;
                                    }
                                }
                            }
                            else {
                                this.rd.drawString("Loading profile, please wait...", 495 - this.ftm.stringWidth("Loading profile, please wait...") / 2, 222);
                            }
                        }
                    }
                    else {
                        this.edit = 0;
                        this.uploadt = 0;
                        this.sentchange = 0;
                        this.underc = 0;
                        this.protab = 0;
                        if (this.gs.proitem.show) {
                            this.gs.proitem.show = false;
                            this.addstage = 0;
                        }
                    }
                    if (this.tab == 2) {
                        this.dotab2(n2, n3, b);
                    }
                    else {
                        if (this.gs.sendtyp.isShowing()) {
                            this.gs.sendtyp.hide();
                        }
                        if (this.gs.senditem.isShowing()) {
                            this.gs.senditem.hide();
                        }
                        if (this.gs.datat.isShowing()) {
                            this.gs.datat.hide();
                        }
                        this.gs.ilaps.hide();
                        this.gs.icars.hide();
                        this.gs.sclass.hide();
                        this.gs.sfix.hide();
                    }
                    if (this.tab == 3) {
                        this.dotab3(n2, n3, b);
                    }
                    else {
                        if (this.gs.clcars.isShowing()) {
                            this.gs.clcars.hide();
                        }
                        if (this.editc != 0) {
                            this.editc = 0;
                            if (this.gs.clanlev.isShowing()) {
                                this.gs.clanlev.hide();
                            }
                        }
                        if (this.cfase == 1) {
                            this.cfase = 0;
                        }
                    }
                    if (this.ptab == 0) {
                        if (this.npo != -1) {
                            this.sdist = (this.npo - 7) * 50;
                            if (this.sdist < 0) {
                                this.sdist = 0;
                            }
                            this.scro = (int)(this.spos / 345.0f * this.sdist);
                            for (int n44 = 0; n44 < this.npo; ++n44) {
                                if (57 + 50 * n44 - this.scro > 0 && 57 + 50 * (n44 - 1) - this.scro < 438) {
                                    boolean b8 = false;
                                    if (n2 > 26 && n2 < 146 && n3 > 38 + 50 * n44 - this.scro && n3 < 68 + 50 * n44 - this.scro && !this.onp && this.overit == 0) {
                                        b8 = true;
                                        this.cur = 12;
                                        if (b) {
                                            this.tab = 1;
                                            if (!this.proname.equals(this.pname[n44])) {
                                                this.proname = this.pname[n44];
                                                this.loadedp = false;
                                                this.onexitpro();
                                            }
                                        }
                                    }
                                    final boolean drawl = this.drawl(this.rd, this.pname[n44], 26, 38 + 50 * n44 - this.scro, b8);
                                    if (!b8 || !drawl) {
                                        this.rd.setFont(new Font("Arial", 1, 12));
                                        this.ftm = this.rd.getFontMetrics();
                                        this.rd.setColor(new Color(0, 0, 0));
                                        this.rd.drawString(this.pname[n44], 86 - this.ftm.stringWidth(this.pname[n44]) / 2, 49 + 50 * n44 - this.scro);
                                        this.rd.setFont(new Font("Arial", 1, 11));
                                        this.ftm = this.rd.getFontMetrics();
                                        String string4 = "Not in any room...";
                                        if (this.pserver[n44] >= 0 && this.pserver[n44] <= 2 && this.proom[n44] >= 0 && this.proom[n44] <= 4) {
                                            string4 = "" + this.lg.snames[this.pserver[n44]] + " :: Room " + (this.proom[n44] + 1) + "";
                                            this.rd.setColor(new Color(49, 79, 0));
                                        }
                                        this.rd.drawString(string4, 86 - this.ftm.stringWidth(string4) / 2, 65 + 50 * n44 - this.scro);
                                    }
                                    this.rd.setColor(this.color2k(150, 150, 150));
                                    this.rd.drawLine(5, 77 + 50 * n44 - this.scro, 167, 77 + 50 * n44 - this.scro);
                                }
                            }
                        }
                        else {
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.drawString("Loading players...", 86 - this.ftm.stringWidth("Loading players...") / 2, 200);
                        }
                    }
                    if (this.ptab == 1) {
                        if (this.npf >= 0) {
                            this.sdist = (this.npf - 7) * 50;
                            if (this.sdist < 0) {
                                this.sdist = 0;
                            }
                            this.scro = (int)(this.spos / 345.0f * this.sdist);
                            int n45 = 0;
                            if (this.npf != 0) {
                                for (int n46 = 0; n46 < this.npf; ++n46) {
                                    int n47 = -1;
                                    for (int n48 = 0; n48 < this.npo; ++n48) {
                                        if (this.pname[n48].toLowerCase().equals(this.fname[n46].toLowerCase())) {
                                            n47 = n48;
                                            break;
                                        }
                                    }
                                    if (n47 != -1) {
                                        if (57 + 50 * n45 - this.scro > 0 && 57 + 50 * (n45 - 1) - this.scro < 438) {
                                            boolean b9 = false;
                                            if (n2 > 26 && n2 < 146 && n3 > 38 + 50 * n45 - this.scro && n3 < 68 + 50 * n45 - this.scro && !this.onp && this.overit == 0 && this.freq <= 0) {
                                                b9 = true;
                                                this.cur = 12;
                                                if (b) {
                                                    this.tab = 1;
                                                    if (!this.proname.equals(this.fname[n46])) {
                                                        this.proname = this.fname[n46];
                                                        this.loadedp = false;
                                                        this.onexitpro();
                                                    }
                                                }
                                            }
                                            final boolean drawl2 = this.drawl(this.rd, this.fname[n46], 26, 38 + 50 * n45 - this.scro, b9);
                                            if (!b9 || !drawl2) {
                                                this.rd.setFont(new Font("Arial", 1, 12));
                                                this.ftm = this.rd.getFontMetrics();
                                                this.rd.setColor(new Color(0, 0, 0));
                                                this.rd.drawString(this.fname[n46], 86 - this.ftm.stringWidth(this.fname[n46]) / 2, 49 + 50 * n45 - this.scro);
                                                this.rd.setFont(new Font("Arial", 1, 11));
                                                this.ftm = this.rd.getFontMetrics();
                                                String string5 = "Not in any room...";
                                                if (this.pserver[n47] >= 0 && this.pserver[n47] <= 2 && this.proom[n47] >= 0 && this.proom[n47] <= 4) {
                                                    string5 = "" + this.lg.snames[this.pserver[n47]] + " :: Room " + (this.proom[n47] + 1) + "";
                                                    this.rd.setColor(new Color(49, 79, 0));
                                                }
                                                this.rd.drawString(string5, 86 - this.ftm.stringWidth(string5) / 2, 65 + 50 * n45 - this.scro);
                                            }
                                            this.rd.setColor(this.color2k(150, 150, 150));
                                            this.rd.drawLine(5, 77 + 50 * n45 - this.scro, 167, 77 + 50 * n45 - this.scro);
                                        }
                                        ++n45;
                                    }
                                }
                                for (int n49 = 0; n49 < this.npf; ++n49) {
                                    int n50 = -1;
                                    for (int n51 = 0; n51 < this.npo; ++n51) {
                                        if (this.pname[n51].toLowerCase().equals(this.fname[n49].toLowerCase())) {
                                            n50 = n51;
                                            break;
                                        }
                                    }
                                    if (n50 == -1) {
                                        if (57 + 50 * n45 - this.scro > 0 && 57 + 50 * (n45 - 1) - this.scro < 438) {
                                            boolean b10 = false;
                                            if (n2 > 26 && n2 < 146 && n3 > 38 + 50 * n45 - this.scro && n3 < 68 + 50 * n45 - this.scro && !this.onp && this.overit == 0 && this.freq <= 0) {
                                                b10 = true;
                                                this.cur = 12;
                                                if (b) {
                                                    this.tab = 1;
                                                    if (!this.proname.equals(this.fname[n49])) {
                                                        this.proname = this.fname[n49];
                                                        this.loadedp = false;
                                                        this.onexitpro();
                                                    }
                                                }
                                            }
                                            final boolean drawl3 = this.drawl(this.rd, this.fname[n49], 26, 38 + 50 * n45 - this.scro, b10);
                                            if (!b10 || !drawl3) {
                                                this.rd.setFont(new Font("Arial", 1, 12));
                                                this.ftm = this.rd.getFontMetrics();
                                                this.rd.setColor(new Color(0, 0, 0));
                                                this.rd.drawString(this.fname[n49], 86 - this.ftm.stringWidth(this.fname[n49]) / 2, 49 + 50 * n45 - this.scro);
                                                this.rd.setFont(new Font("Arial", 0, 11));
                                                this.ftm = this.rd.getFontMetrics();
                                                final String str3 = "Player Offline";
                                                this.rd.drawString(str3, 86 - this.ftm.stringWidth(str3) / 2, 65 + 50 * n45 - this.scro);
                                            }
                                            this.rd.setColor(this.color2k(150, 150, 150));
                                            this.rd.drawLine(5, 77 + 50 * n45 - this.scro, 167, 77 + 50 * n45 - this.scro);
                                        }
                                        ++n45;
                                    }
                                }
                            }
                            else {
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.drawString("No friends added yet.", 86 - this.ftm.stringWidth("No friends added yet.") / 2, 200);
                            }
                            if (this.freq == 1) {
                                this.rd.setColor(new Color(236, 215, 140));
                                this.rd.fillRect(-10, 28, 200, 130);
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.drawRect(-10, 28, 200, 130);
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.drawString("Friend request from:", 86 - this.ftm.stringWidth("Friend request from:") / 2, 45);
                                this.rd.setColor(new Color(240, 222, 164));
                                this.rd.fillRect(26, 51, 119, 29);
                                if (!this.drawl(this.rd, this.freqname, 26, 51, true)) {
                                    this.rd.setColor(new Color(0, 0, 0));
                                    this.rd.drawString(this.freqname, 86 - this.ftm.stringWidth(this.freqname) / 2, 70);
                                    this.rd.setColor(this.color2k(150, 150, 150));
                                    this.rd.drawRect(26, 51, 119, 29);
                                }
                                if (n2 > 26 && n2 < 146 && n3 > 51 && n3 < 81) {
                                    this.cur = 12;
                                    if (b) {
                                        this.tab = 1;
                                        if (!this.proname.equals(this.freqname)) {
                                            this.proname = this.freqname;
                                            this.loadedp = false;
                                            this.onexitpro();
                                        }
                                    }
                                }
                                if (this.stringbutton(this.rd, "    Confirm    ", 86, 107, 0, n2, n3, b, 0, 0)) {
                                    this.freq = 2;
                                }
                                if (this.stringbutton(this.rd, "Cancel", 86, 140, 2, n2, n3, b, 0, 0)) {
                                    this.freq = 3;
                                }
                            }
                            if (this.freq == -1) {
                                this.rd.setColor(new Color(236, 215, 140));
                                this.rd.fillRect(-10, 28, 200, 25);
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.drawRect(-10, 28, 200, 25);
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.drawString("Failed to confirm friend!", 86 - this.ftm.stringWidth("Failed to confirm friend!") / 2, 45);
                                --this.cntf;
                                if (this.cntf <= 0) {
                                    this.freq = 0;
                                }
                            }
                            if (this.freq == -2) {
                                this.rd.setColor(new Color(236, 215, 140));
                                this.rd.fillRect(-10, 28, 200, 25);
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.drawRect(-10, 28, 200, 25);
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.drawString("Failed to cancel request!", 86 - this.ftm.stringWidth("Failed to cancel request!") / 2, 45);
                                --this.cntf;
                                if (this.cntf <= 0) {
                                    this.freq = 0;
                                }
                            }
                            if (this.freq == 2) {
                                this.rd.setColor(new Color(236, 215, 140));
                                this.rd.fillRect(-10, 28, 200, 25);
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.drawRect(-10, 28, 200, 25);
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.drawString("Confirming friend...", 86 - this.ftm.stringWidth("Confirming friend...") / 2, 45);
                            }
                            if (this.freq == 3) {
                                this.rd.setColor(new Color(236, 215, 140));
                                this.rd.fillRect(-10, 28, 200, 25);
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.drawRect(-10, 28, 200, 25);
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.drawString("Canceling...", 86 - this.ftm.stringWidth("Canceling...") / 2, 45);
                            }
                            if (this.freq == 6) {
                                this.rd.setColor(new Color(236, 215, 140));
                                this.rd.fillRect(-10, 28, 200, 61 + this.ncnf * 35);
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.drawRect(-10, 28, 200, 61 + this.ncnf * 35);
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.drawString("Friend Confirmation(s):", 86 - this.ftm.stringWidth("Friend Confirmation(s):") / 2, 45);
                                for (int n52 = 0; n52 < this.ncnf; ++n52) {
                                    this.rd.setColor(new Color(240, 222, 164));
                                    this.rd.fillRect(26, 51 + 35 * n52, 119, 29);
                                    if (!this.drawl(this.rd, this.cnfname[n52], 26, 51 + 35 * n52, true)) {
                                        this.rd.setColor(new Color(0, 0, 0));
                                        this.rd.drawString(this.cnfname[n52], 86 - this.ftm.stringWidth(this.cnfname[n52]) / 2, 70 + 35 * n52);
                                        this.rd.setColor(this.color2k(150, 150, 150));
                                        this.rd.drawRect(26, 51 + 35 * n52, 119, 29);
                                    }
                                    if (n2 > 26 && n2 < 146 && n3 > 51 + 35 * n52 && n3 < 81 + 35 * n52) {
                                        this.cur = 12;
                                        if (b) {
                                            this.tab = 1;
                                            if (!this.proname.equals(this.cnfname[n52])) {
                                                this.proname = this.cnfname[n52];
                                                this.loadedp = false;
                                                this.onexitpro();
                                            }
                                        }
                                    }
                                }
                                if (this.stringbutton(this.rd, "  OK  ", 86, 107 + 35 * (this.ncnf - 1), 0, n2, n3, b, 0, 0)) {
                                    this.freq = -6;
                                }
                            }
                        }
                        else {
                            if (this.npf == -1) {
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.drawString("Loading friends...", 86 - this.ftm.stringWidth("Loading friends...") / 2, 200);
                            }
                            if (this.npf == -2) {
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.drawString("Failed to load friends!", 86 - this.ftm.stringWidth("Failed to load friends!") / 2, 200);
                            }
                        }
                    }
                    if (this.ptab == 2) {
                        if (this.xt.clan.equals("")) {
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.drawString("Not in a Clan", 86 - this.ftm.stringWidth("Not in a Clan") / 2, 200);
                            this.rd.setFont(new Font("Arial", 0, 11));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.drawString("You haven't joined and clan yet.", 86 - this.ftm.stringWidth("You haven't joined and clan yet.") / 2, 220);
                        }
                        else if (this.loadedcm) {
                            this.sdist = (this.ncln - 7) * 50;
                            if (this.sdist < 0) {
                                this.sdist = 0;
                            }
                            this.scro = (int)(this.spos / 345.0f * this.sdist);
                            int n53 = 0;
                            for (int n54 = 0; n54 < this.ncln; ++n54) {
                                int n55 = -1;
                                for (int n56 = 0; n56 < this.npo; ++n56) {
                                    if (this.pname[n56].toLowerCase().equals(this.clname[n54].toLowerCase())) {
                                        n55 = n56;
                                        break;
                                    }
                                }
                                if (n55 != -1) {
                                    if (57 + 50 * n53 - this.scro > 0 && 57 + 50 * (n53 - 1) - this.scro < 438) {
                                        boolean b11 = false;
                                        if (n2 > 26 && n2 < 146 && n3 > 38 + 50 * n53 - this.scro && n3 < 68 + 50 * n53 - this.scro && !this.onp && this.overit == 0 && this.freq <= 0) {
                                            b11 = true;
                                            this.cur = 12;
                                            if (b) {
                                                this.tab = 1;
                                                if (!this.proname.equals(this.clname[n54])) {
                                                    this.proname = this.clname[n54];
                                                    this.loadedp = false;
                                                    this.onexitpro();
                                                }
                                            }
                                        }
                                        final boolean drawl4 = this.drawl(this.rd, this.clname[n54], 26, 38 + 50 * n53 - this.scro, b11);
                                        if (!b11 || !drawl4) {
                                            this.rd.setFont(new Font("Arial", 1, 12));
                                            this.ftm = this.rd.getFontMetrics();
                                            this.rd.setColor(new Color(0, 0, 0));
                                            this.rd.drawString(this.clname[n54], 86 - this.ftm.stringWidth(this.clname[n54]) / 2, 49 + 50 * n53 - this.scro);
                                            this.rd.setFont(new Font("Arial", 1, 11));
                                            this.ftm = this.rd.getFontMetrics();
                                            String string6 = "Not in any room...";
                                            if (this.pserver[n55] >= 0 && this.pserver[n55] <= 2 && this.proom[n55] >= 0 && this.proom[n55] <= 4) {
                                                string6 = "" + this.lg.snames[this.pserver[n55]] + " :: Room " + (this.proom[n55] + 1) + "";
                                                this.rd.setColor(new Color(49, 79, 0));
                                            }
                                            this.rd.drawString(string6, 86 - this.ftm.stringWidth(string6) / 2, 65 + 50 * n53 - this.scro);
                                        }
                                        this.rd.setColor(this.color2k(150, 150, 150));
                                        this.rd.drawLine(5, 77 + 50 * n53 - this.scro, 167, 77 + 50 * n53 - this.scro);
                                    }
                                    ++n53;
                                }
                            }
                            for (int n57 = 0; n57 < this.ncln; ++n57) {
                                int n58 = -1;
                                for (int n59 = 0; n59 < this.npo; ++n59) {
                                    if (this.pname[n59].toLowerCase().equals(this.clname[n57].toLowerCase())) {
                                        n58 = n59;
                                        break;
                                    }
                                }
                                if (n58 == -1) {
                                    if (57 + 50 * n53 - this.scro > 0 && 57 + 50 * (n53 - 1) - this.scro < 438) {
                                        boolean b12 = false;
                                        if (n2 > 26 && n2 < 146 && n3 > 38 + 50 * n53 - this.scro && n3 < 68 + 50 * n53 - this.scro && !this.onp && this.overit == 0 && this.freq <= 0) {
                                            b12 = true;
                                            this.cur = 12;
                                            if (b) {
                                                this.tab = 1;
                                                if (!this.proname.equals(this.clname[n57])) {
                                                    this.proname = this.clname[n57];
                                                    this.loadedp = false;
                                                    this.onexitpro();
                                                }
                                            }
                                        }
                                        final boolean drawl5 = this.drawl(this.rd, this.clname[n57], 26, 38 + 50 * n53 - this.scro, b12);
                                        if (!b12 || !drawl5) {
                                            this.rd.setFont(new Font("Arial", 1, 12));
                                            this.ftm = this.rd.getFontMetrics();
                                            this.rd.setColor(new Color(0, 0, 0));
                                            this.rd.drawString(this.clname[n57], 86 - this.ftm.stringWidth(this.clname[n57]) / 2, 49 + 50 * n53 - this.scro);
                                            this.rd.setFont(new Font("Arial", 0, 11));
                                            this.ftm = this.rd.getFontMetrics();
                                            final String str4 = "Player Offline";
                                            this.rd.drawString(str4, 86 - this.ftm.stringWidth(str4) / 2, 65 + 50 * n53 - this.scro);
                                        }
                                        this.rd.setColor(this.color2k(150, 150, 150));
                                        this.rd.drawLine(5, 77 + 50 * n53 - this.scro, 167, 77 + 50 * n53 - this.scro);
                                    }
                                    ++n53;
                                }
                            }
                        }
                        else {
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.drawString("Loading clan mates...", 86 - this.ftm.stringWidth("Loading clan mates...") / 2, 200);
                        }
                    }
                }
                else if (this.open == 452) {
                    this.rd.setColor(this.color2k(230, 230, 230));
                    this.rd.fillRoundRect(240, 170, 511, 90, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(240, 170, 511, 90, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.setFont(new Font("Arial", 1, 13));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("Failed to connect to server at this time, please exit and try again later.", 495 - this.ftm.stringWidth("Failed to connect to server at this time, please exit and try again later.") / 2, 200);
                    if (this.stringbutton(this.rd, "  Exit  ", 495, 230, 1, n2, n3, b, 0, 0)) {
                        this.open = 450;
                        this.upo = false;
                        this.domon = false;
                    }
                }
                final int[] array19 = { 193, 193, 295, 318 };
                final int[] array20 = { 33, 10, 10, 33 };
                for (int tab = 0; tab < 4; ++tab) {
                    boolean b13 = false;
                    if (this.tab == 3 && tab == 0) {
                        b13 = true;
                    }
                    if (this.tab == 1 && tab == 1) {
                        b13 = true;
                    }
                    if (this.tab == 2 && tab == 2) {
                        b13 = true;
                    }
                    if (this.tab == 0 && tab == 3) {
                        b13 = true;
                    }
                    this.rd.setColor(new Color(255, 255, 255));
                    if (b13) {
                        this.rd.setComposite(AlphaComposite.getInstance(3, 0.6f));
                    }
                    else {
                        this.rd.setComposite(AlphaComposite.getInstance(3, 0.2f));
                    }
                    if (n3 >= 12 && n3 <= 32 && n2 > array19[0] && n2 < array19[3]) {
                        this.rd.setComposite(AlphaComposite.getInstance(3, 0.4f));
                        if (b && !this.gs.openm) {
                            if (tab == 0) {
                                this.tab = 3;
                            }
                            if (tab == 1 || tab == 2) {
                                this.tab = tab;
                            }
                            if (tab == 3) {
                                this.tab = 0;
                            }
                            if (this.tab == 1 && this.proname.equals("")) {
                                this.proname = this.xt.nickname;
                                this.loadedp = false;
                                this.onexitpro();
                            }
                        }
                    }
                    this.rd.fillPolygon(array19, array20, 4);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawPolygon(array19, array20, 4);
                    this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                    if (tab == 0) {
                        array20[2] = (array20[1] = 13);
                        array19[2] = 298;
                    }
                    for (int n60 = 0; n60 < 4; ++n60) {
                        final int[] array21 = array19;
                        final int n61 = n60;
                        array21[n61] += 125;
                    }
                }
                this.rd.drawImage(this.xt.cnmc, 224, 15, null);
                this.rd.setColor(new Color(0, 0, 0));
                this.rd.drawLine(191, 34, 800, 34);
                this.rd.setColor(this.color2k(200, 200, 200));
                this.rd.fillRect(0, 0, 190, 28);
                this.rd.setColor(this.color2k(150, 150, 150));
                this.rd.drawLine(0, 25, 170, 25);
                this.rd.setColor(this.color2k(200, 200, 200));
                this.rd.fillRect(0, 438, 190, 12);
                this.rd.setColor(this.color2k(150, 150, 150));
                this.rd.drawLine(0, 440, 170, 440);
                this.rd.setColor(this.color2k(200, 200, 200));
                this.rd.fillRect(173, 28, 17, 410);
                this.rd.setColor(new Color(0, 0, 0));
                this.rd.drawLine(191, 0, 191, 450);
                if (n2 > 0 && n2 < 171 && n3 > 2 && n3 < 23) {
                    if (!this.onp) {
                        this.rd.setColor(this.color2k(220, 220, 220));
                        this.rd.fillRect(2, 2, 146, 21);
                    }
                    this.rd.setColor(this.color2k(255, 255, 255));
                    if (b && this.overit == 0 && !this.onp) {
                        this.onp = true;
                        this.overit = 5;
                    }
                }
                else {
                    this.rd.setColor(this.color2k(235, 235, 235));
                }
                if (this.overit < 0) {
                    ++this.overit;
                }
                this.rd.fillRect(150, 2, 20, 20);
                this.rd.setColor(this.color2k(150, 150, 150));
                this.rd.drawRect(150, 2, 20, 20);
                this.rd.setColor(new Color(0, 0, 0));
                this.rd.drawLine(157, 10, 157, 11);
                this.rd.drawLine(158, 11, 158, 12);
                this.rd.drawLine(159, 12, 159, 13);
                this.rd.drawLine(160, 13, 160, 14);
                this.rd.drawLine(161, 12, 161, 13);
                this.rd.drawLine(162, 11, 162, 12);
                this.rd.drawLine(163, 10, 163, 11);
                if (this.ptab == 0) {
                    this.rd.drawImage(this.xt.players, 7, 5, null);
                }
                if (this.ptab == 1) {
                    this.rd.drawImage(this.xt.myfr, 21, 4, null);
                }
                if (this.ptab == 2) {
                    this.rd.drawImage(this.xt.mycl, 34, 4, null);
                }
                if (this.onp) {
                    this.rd.setColor(this.color2k(200, 200, 200));
                    this.rd.fillRect(0, 25, 170, 67);
                    this.rd.setColor(this.color2k(150, 150, 150));
                    this.rd.drawRect(0, 25, 170, 67);
                    if (n2 > 0 && n2 < 171 && n3 >= 26 && n3 < 48) {
                        this.rd.setColor(this.color2k(235, 235, 235));
                        this.rd.fillRect(1, 26, 169, 22);
                        if (b) {
                            this.ptab = 0;
                        }
                    }
                    if (n2 > 0 && n2 < 171 && n3 >= 48 && n3 < 70) {
                        this.rd.setColor(this.color2k(235, 235, 235));
                        this.rd.fillRect(1, 48, 169, 22);
                        if (b) {
                            this.ptab = 1;
                            this.npf = -1;
                        }
                    }
                    if (n2 > 0 && n2 < 171 && n3 >= 70 && n3 < 92) {
                        this.rd.setColor(this.color2k(235, 235, 235));
                        this.rd.fillRect(1, 70, 169, 22);
                        if (b) {
                            this.ptab = 2;
                        }
                    }
                    this.rd.drawImage(this.xt.players, 7, 30, null);
                    this.rd.drawImage(this.xt.myfr, 21, 51, null);
                    this.rd.drawImage(this.xt.mycl, 34, 73, null);
                    if (b && this.overit == 0) {
                        this.onp = false;
                        this.overit = -5;
                    }
                    if (this.overit > 0) {
                        --this.overit;
                    }
                }
                if (this.mscro == 831 || this.sdist == 0) {
                    if (this.sdist == 0) {
                        this.rd.setColor(this.color2k(205, 205, 205));
                    }
                    else {
                        this.rd.setColor(this.color2k(215, 215, 215));
                    }
                    this.rd.fillRect(173, 28, 17, 17);
                }
                else {
                    this.rd.setColor(this.color2k(220, 220, 220));
                    this.rd.fill3DRect(173, 28, 17, 17, true);
                }
                if (this.sdist != 0) {
                    this.rd.drawImage(this.xt.asu, 178, 34, null);
                }
                if (this.mscro == 832 || this.sdist == 0) {
                    if (this.sdist == 0) {
                        this.rd.setColor(this.color2k(205, 205, 205));
                    }
                    else {
                        this.rd.setColor(this.color2k(215, 215, 215));
                    }
                    this.rd.fillRect(173, 421, 17, 17);
                }
                else {
                    this.rd.setColor(this.color2k(220, 220, 220));
                    this.rd.fill3DRect(173, 421, 17, 17, true);
                }
                if (this.sdist != 0) {
                    this.rd.drawImage(this.xt.asd, 178, 428, null);
                }
                if (this.sdist != 0) {
                    if (this.lspos != this.spos) {
                        this.rd.setColor(this.color2k(215, 215, 215));
                        this.rd.fillRect(173, 45 + this.spos, 17, 31);
                    }
                    else {
                        if (this.mscro == 831) {
                            this.rd.setColor(this.color2k(215, 215, 215));
                        }
                        this.rd.fill3DRect(173, 45 + this.spos, 17, 31, true);
                    }
                    this.rd.setColor(this.color2k(150, 150, 150));
                    this.rd.drawLine(178, 58 + this.spos, 184, 58 + this.spos);
                    this.rd.drawLine(178, 60 + this.spos, 184, 60 + this.spos);
                    this.rd.drawLine(178, 62 + this.spos, 184, 62 + this.spos);
                    if (this.mscro > 800 && this.lspos != this.spos) {
                        this.lspos = this.spos;
                    }
                    if (b) {
                        if (this.mscro == 825 && n2 > 173 && n2 < 190 && n3 > 45 + this.spos && n3 < this.spos + 76) {
                            this.mscro = n3 - this.spos;
                        }
                        if (this.mscro == 825 && n2 > 171 && n2 < 192 && n3 > 26 && n3 < 47) {
                            this.mscro = 831;
                        }
                        if (this.mscro == 825 && n2 > 171 && n2 < 192 && n3 > 419 && n3 < 440) {
                            this.mscro = 832;
                        }
                        if (this.mscro == 825 && n2 > 173 && n2 < 190 && n3 > 45 && n3 < 421) {
                            this.mscro = 60;
                            this.spos = n3 - this.mscro;
                        }
                        int n62 = 2670 / this.sdist;
                        if (n62 < 1) {
                            n62 = 1;
                        }
                        if (this.mscro == 831) {
                            this.spos -= n62;
                            if (this.spos > 345) {
                                this.spos = 345;
                            }
                            if (this.spos < 0) {
                                this.spos = 0;
                            }
                            this.lspos = this.spos;
                        }
                        if (this.mscro == 832) {
                            this.spos += n62;
                            if (this.spos > 345) {
                                this.spos = 345;
                            }
                            if (this.spos < 0) {
                                this.spos = 0;
                            }
                            this.lspos = this.spos;
                        }
                        if (this.mscro < 800) {
                            this.spos = n3 - this.mscro;
                            if (this.spos > 345) {
                                this.spos = 345;
                            }
                            if (this.spos < 0) {
                                this.spos = 0;
                            }
                        }
                        if (this.mscro == 825) {
                            this.mscro = 925;
                        }
                    }
                    else if (this.mscro != 825) {
                        this.mscro = 825;
                    }
                }
                if (this.cur != this.curs) {
                    this.gs.setCursor(new Cursor(this.cur));
                    this.curs = this.cur;
                }
            }
            else {
                this.xt.drawWarning();
                if (this.gs.cmsg.isShowing()) {
                    this.gs.cmsg.hide();
                    this.gs.requestFocus();
                }
                if (this.xt.warning > 220) {
                    n = 0;
                    try {
                        this.socket.close();
                        this.socket = null;
                        this.din.close();
                        this.din = null;
                        this.dout.close();
                        this.dout = null;
                    }
                    catch (final Exception ex) {}
                }
                final xtGraphics xt2 = this.xt;
                ++xt2.warning;
            }
        }
        if (b2) {
            this.gs.movefieldd(this.gs.cmsg, 207, 414, 462, 22, true);
            if (this.gs.cmsg.getText().equals("Type here...") && n2 > 197 && n2 < 679 && n3 > 404 && n3 < 446) {
                this.gs.cmsg.setText("");
            }
            if (this.gs.cmsg.getText().length() > 200) {
                this.gs.cmsg.setText(this.gs.cmsg.getText().substring(0, 200));
                this.gs.cmsg.select(200, 200);
            }
        }
        if (b3) {
            if (!this.gs.cmsg.isShowing()) {
                this.gs.cmsg.show();
                this.gs.cmsg.setText(this.sentance);
                this.gs.cmsg.requestFocus();
            }
            this.gs.movefield(this.gs.cmsg, 275, 91, 440, 22);
            if (!this.sentance.equals(this.gs.cmsg.getText())) {
                this.sentchange = 1;
                this.rd.setFont(new Font("Tahoma", 1, 11));
                this.ftm = this.rd.getFontMetrics();
                if (this.ftm.stringWidth(this.gs.cmsg.getText()) > 800) {
                    this.gs.cmsg.setText(this.sentance);
                }
                else {
                    this.sentance = this.gs.cmsg.getText();
                }
            }
        }
        if (this.dorank) {
            if (!this.gs.cmsg.isShowing()) {
                this.gs.cmsg.show();
                this.gs.cmsg.setText(this.mrank[this.em]);
                this.gs.cmsg.requestFocus();
            }
            this.gs.movefield(this.gs.cmsg, 402, 131, 300, 22);
            this.rd.setFont(new Font("Arial", 1, 11));
            this.ftm = this.rd.getFontMetrics();
            if (this.ftm.stringWidth(this.gs.cmsg.getText()) > 270) {
                int n63 = this.gs.cmsg.getText().length() - 1;
                if (n63 < 0) {
                    n63 = 0;
                }
                this.gs.cmsg.setText(this.gs.cmsg.getText().substring(0, n63));
                this.gs.cmsg.select(n63, n63);
            }
        }
        if (this.donewc) {
            if (!this.gs.temail.isShowing()) {
                this.gs.temail.show();
                this.gs.temail.setText("");
                this.gs.temail.requestFocus();
            }
            this.gs.movefield(this.gs.temail, 473, 141, 150, 22);
            this.rd.setFont(new Font("Arial", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            if (this.ftm.stringWidth(this.gs.temail.getText()) > 150) {
                int n64 = this.gs.temail.getText().length() - 1;
                if (n64 < 0) {
                    n64 = 0;
                }
                this.gs.temail.setText(this.gs.temail.getText().substring(0, n64));
                this.gs.temail.select(n64, n64);
            }
            if (!this.gs.temail.getText().equals(this.lccnam)) {
                this.lg.fixtext(this.gs.temail);
                this.lccnam = this.gs.temail.getText();
            }
            if (this.xt.msgcheck(this.gs.temail.getText())) {
                this.gs.temail.setText("");
            }
        }
        if (this.dosrch) {
            if (!this.gs.temail.isShowing()) {
                this.gs.temail.show();
                this.gs.temail.setText("");
                this.gs.temail.requestFocus();
            }
            this.gs.movefield(this.gs.temail, 371, 88, 150, 22);
            this.rd.setFont(new Font("Arial", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            if (this.ftm.stringWidth(this.gs.temail.getText()) > 150) {
                int n65 = this.gs.temail.getText().length() - 1;
                if (n65 < 0) {
                    n65 = 0;
                }
                this.gs.temail.setText(this.gs.temail.getText().substring(0, n65));
                this.gs.temail.select(n65, n65);
            }
            if (!this.gs.temail.getText().equals(this.lccnam)) {
                this.lg.fixtext(this.gs.temail);
                this.lccnam = this.gs.temail.getText();
            }
            if (this.xt.msgcheck(this.gs.temail.getText())) {
                this.gs.temail.setText("");
            }
        }
        if (this.doweb1) {
            if (!this.gs.temail.isShowing()) {
                this.gs.temail.show();
                this.gs.temail.setText(this.ltit);
                this.gs.temail.requestFocus();
            }
            this.gs.movefield(this.gs.temail, 411, 174, 150, 22);
            this.rd.setFont(new Font("Arial", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            if (this.ftm.stringWidth(this.gs.temail.getText()) > 200) {
                int n66 = this.gs.temail.getText().length() - 1;
                if (n66 < 0) {
                    n66 = 0;
                }
                this.gs.temail.setText(this.gs.temail.getText().substring(0, n66));
                this.gs.temail.select(n66, n66);
            }
            if (this.xt.msgcheck(this.gs.temail.getText())) {
                this.gs.temail.setText("");
            }
            if (!this.gs.cmsg.isShowing()) {
                this.gs.cmsg.show();
                this.gs.cmsg.setText(this.ldes);
            }
            this.gs.movefield(this.gs.cmsg, 411, 204, 300, 22);
            this.rd.setFont(new Font("Arial", 0, 12));
            this.ftm = this.rd.getFontMetrics();
            if (this.ftm.stringWidth(this.gs.cmsg.getText()) > 400) {
                int n67 = this.gs.cmsg.getText().length() - 1;
                if (n67 < 0) {
                    n67 = 0;
                }
                this.gs.cmsg.setText(this.gs.cmsg.getText().substring(0, n67));
                this.gs.cmsg.select(n67, n67);
            }
            if (this.xt.msgcheck(this.gs.cmsg.getText())) {
                this.gs.cmsg.setText("");
            }
        }
        if (this.doweb2) {
            if (!this.gs.temail.isShowing()) {
                this.gs.temail.show();
                this.gs.temail.requestFocus();
            }
            this.gs.movefield(this.gs.temail, 354, 134, 350, 22);
        }
        if (this.dommsg) {
            if (!this.donemsg) {
                this.gs.mmsg.setText(" ");
                if (!this.gs.applejava) {
                    this.gs.mmsg.show();
                    this.gs.mmsg.requestFocus();
                }
                this.donemsg = true;
            }
            this.gs.movefielda(this.gs.mmsg, 207, 389, 450, 50);
        }
        else {
            if (this.gs.mmsg.isShowing()) {
                this.gs.mmsg.hide();
            }
            if (this.donemsg) {
                this.donemsg = false;
            }
        }
        if (!this.dosrch && !this.donewc && !this.doweb1 && !this.doweb2 && this.gs.temail.isShowing()) {
            this.gs.temail.hide();
        }
        if (!b2 && !b3 && !this.dorank && !this.doweb1 && this.open == 452 && this.gs.cmsg.isShowing()) {
            this.gs.cmsg.hide();
        }
    }
    
    public void dotab3(final int n, final int n2, boolean b) {
        if (this.cfase == 0) {
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.drawRect(214, 44, 160, 50);
            this.rd.setFont(new Font("Arial", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            final int n3 = 239;
            final int stringWidth = this.ftm.stringWidth("Search for a clan");
            this.rd.fillRect(225, 57, 4, 4);
            this.rd.drawString("Search for a clan", n3, 63);
            if (n > n3 && n < n3 + stringWidth && n2 > 46 && n2 < 65 && this.editc == 0) {
                this.rd.drawLine(n3, 65, n3 + stringWidth, 65);
                this.cur = 12;
                if (b) {
                    this.cfase = 2;
                    this.em = 1;
                    this.msg = "Clan Search";
                    this.smsg = "Listing clans with recent activity...";
                    this.nclns = 0;
                    this.spos5 = 0;
                    this.lspos5 = 0;
                    this.flko = 0;
                }
            }
            final int n4 = 239;
            final int stringWidth2 = this.ftm.stringWidth("Create a new clan");
            this.rd.fillRect(225, 77, 4, 4);
            this.rd.drawString("Create a new clan", n4, 83);
            if (n > n4 && n < n4 + stringWidth2 && n2 > 66 && n2 < 85 && this.editc == 0) {
                this.rd.drawLine(n4, 85, n4 + stringWidth2, 85);
                this.cur = 12;
                if (b) {
                    this.cfase = 1;
                    this.em = 0;
                    this.msg = "Start a new Need for Madness clan,";
                    this.flko = 0;
                }
            }
            if (!this.xt.clan.equals("")) {
                final int n5 = -40;
                final int n6 = 19;
                if (!this.drawl(this.rd, "#" + this.xt.clan + "#", 406 + n6, 101 + n5, true)) {
                    this.rd.setFont(new Font("Arial", 1, 13));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("" + this.xt.clan + "", 581 + n6 - this.ftm.stringWidth("" + this.xt.clan + "") / 2, 121 + n5);
                }
                this.rd.setFont(new Font("Arial", 1, 12));
                this.ftm = this.rd.getFontMetrics();
                String string = "Your Clan";
                if (n > 402 + n6 && n < 759 + n6 && n2 > 84 + n5 && n2 < 134 + n5) {
                    string = "Clan :  " + this.xt.clan + "";
                    this.rd.drawLine(408 + n6, 98 + n5, 408 + n6 + this.ftm.stringWidth(string), 98 + n5);
                    if ((n > 408 + n6 && n < 408 + n6 + this.ftm.stringWidth(string) && n2 > 85 + n5 && n2 < 100 + n5) || (n > 406 + n6 && n < 756 + n6 && n2 > 101 + n5 && n2 < 131 + n5)) {
                        this.cur = 12;
                        if (b) {
                            if (!this.claname.equals(this.xt.clan)) {
                                this.claname = this.xt.clan;
                                this.loadedc = false;
                            }
                            this.spos5 = 0;
                            this.lspos5 = 0;
                            this.cfase = 3;
                            this.ctab = 0;
                            this.blocknote = 10;
                        }
                    }
                }
                this.rd.drawString(string, 408 + n6, 97 + n5);
                this.rd.drawLine(402 + n6, 84 + n5, 402 + n6, 134 + n5);
                this.rd.drawLine(402 + n6, 84 + n5, 408 + n6 + this.ftm.stringWidth(string) + 2, 84 + n5);
                this.rd.drawLine(408 + n6 + this.ftm.stringWidth(string) + 2, 84 + n5, 408 + n6 + this.ftm.stringWidth(string) + 15, 97 + n5);
                this.rd.drawLine(408 + n6 + this.ftm.stringWidth(string) + 15, 97 + n5, 759 + n6, 97 + n5);
                this.rd.drawLine(759 + n6, 97 + n5, 759 + n6, 134 + n5);
                this.rd.drawLine(402 + n6, 134 + n5, 759 + n6, 134 + n5);
            }
            this.rd.setFont(new Font("Arial", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            if (this.ntab == 0) {
                final int[] array = { 214, 225 + this.ftm.stringWidth("Game News"), 225 + this.ftm.stringWidth("Game News") + 23, 778, 778, 214 };
                final int[] array2 = { 112, 112, 135, 135, 443, 443 };
                this.rd.setColor(new Color(206, 171, 98));
                this.rd.fillPolygon(array, array2, 6);
                this.rd.setColor(new Color(0, 0, 0));
                this.rd.drawPolygon(array, array2, 6);
            }
            if (this.ntab == 1) {
                final int[] array3 = { 214, 225 + this.ftm.stringWidth("Game News") + 23, 225 + this.ftm.stringWidth("Game News") + 23, 236 + this.ftm.stringWidth("Game News") + 23 + this.ftm.stringWidth("Wars World Championship"), 236 + this.ftm.stringWidth("Game News") + 23 + this.ftm.stringWidth("Wars World Championship") + 23, 778, 778, 214 };
                final int[] array4 = { 135, 135, 112, 112, 135, 135, 443, 443 };
                this.rd.setColor(new Color(206, 171, 98));
                this.rd.fillPolygon(array3, array4, 8);
                this.rd.setColor(new Color(0, 0, 0));
                this.rd.drawPolygon(array3, array4, 8);
            }
            final int n7 = 223;
            final int stringWidth3 = this.ftm.stringWidth("Game News");
            final int n8 = 23;
            this.rd.drawString("Game News", n7, 107 + n8);
            if (n > n7 && n < n7 + stringWidth3 && n2 > 90 + n8 && n2 < 109 + n8) {
                this.rd.drawLine(n7, 109 + n8, n7 + stringWidth3, 109 + n8);
                this.cur = 12;
                if (b) {
                    this.ntab = 0;
                    this.spos6 = 0;
                }
            }
            final int n9 = n7 + (stringWidth3 + 35);
            final int stringWidth4 = this.ftm.stringWidth("Wars World Championship");
            this.rd.drawString("Wars World Championship", n9, 107 + n8);
            if (n > n9 && n < n9 + stringWidth4 && n2 > 90 + n8 && n2 < 109 + n8) {
                this.rd.drawLine(n9, 109 + n8, n9 + stringWidth4, 109 + n8);
                this.cur = 12;
                if (b) {
                    this.ntab = 1;
                    this.spos6 = 0;
                }
            }
            this.rdo.setColor(new Color(206, 171, 98));
            this.rdo.fillRect(0, 0, 560, 300);
            this.darker = true;
            if (this.stringbutton(this.rd, "  Refresh  ", 738, 125, 3, n, n2, b, 0, 0)) {
                if (this.ntab == 0) {
                    this.loadednews = 0;
                }
                if (this.ntab == 1) {
                    this.loadwstat = 0;
                }
            }
            this.darker = false;
            if (this.ntab == 0) {
                if (this.loadednews == 1) {
                    int n10 = 0;
                    for (int i = 0; i < 5; ++i) {
                        if (this.nwarbs[i] > 0) {
                            ++n10;
                        }
                    }
                    if (n10 == 0) {
                        n10 = 1;
                    }
                    this.sdist = 100 + 35 * n10 + this.doi * 16 - 200;
                    if (this.sdist < 0) {
                        this.sdist = 0;
                    }
                    this.scro = (int)(this.spos6 / 229.0f * this.sdist);
                    if (this.scro < 55) {
                        this.rdo.setFont(new Font("Tahoma", 1, 11));
                        this.rdo.setColor(new Color(0, 0, 0));
                        this.rdo.drawString("A big welcome to the latest players to join the game with full accounts!", 18, 15 - this.scro);
                        for (int j = 0; j < 4; ++j) {
                            boolean drawl = false;
                            boolean b2 = false;
                            if (n > 234 + 128 * j && n < 354 + 128 * j && n2 > 159 - this.scro && n2 < 189 - this.scro && n2 > 139 && n2 < 439) {
                                b2 = true;
                                this.cur = 12;
                                if (b) {
                                    this.tab = 1;
                                    if (!this.proname.equals(this.newplayers[j])) {
                                        this.proname = this.newplayers[j];
                                        this.loadedp = false;
                                        this.onexitpro();
                                    }
                                }
                            }
                            if (!b2) {
                                drawl = this.drawl(this.rdo, this.newplayers[j], 18 + 128 * j, 20 - this.scro, true);
                            }
                            else {
                                this.drawl(this.rdo, this.newplayers[j], 18 + 128 * j, 20 - this.scro, false);
                            }
                            if (!drawl) {
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 0.2f));
                                this.rdo.setColor(new Color(255, 255, 255));
                                this.rdo.fillRect(18 + 128 * j, 20 - this.scro, 119, 29);
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rdo.getFontMetrics();
                                this.rdo.drawRect(18 + 128 * j, 20 - this.scro, 119, 29);
                                this.rdo.drawString(this.newplayers[j], 78 + 128 * j - this.ftm.stringWidth(this.newplayers[j]) / 2, 39 - this.scro);
                            }
                        }
                    }
                    if (75 + 35 * n10 - this.scro > 0) {
                        this.rdo.setFont(new Font("Tahoma", 1, 11));
                        this.rdo.setColor(new Color(0, 0, 0));
                        this.rdo.drawString("Recent clan wars & battles:", 18, 70 - this.scro);
                        n10 = 0;
                        for (int k = 0; k < 5; ++k) {
                            if (this.nwarbs[k] > 0) {
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 0.2f));
                                if (!this.drawl(this.rdo, "#" + this.nwclan[k] + "#", 18, 75 - this.scro + 35 * n10, true)) {
                                    this.rdo.setColor(new Color(255, 255, 255));
                                    this.rdo.fillRect(18, 75 - this.scro + 35 * n10, 350, 30);
                                }
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 0.1f));
                                this.rdo.setColor(new Color(255, 255, 255));
                                this.rdo.fillRect(368, 75 - this.scro + 35 * n10, 154, 30);
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.setFont(new Font("Tahoma", 1, 11));
                                String str = "war";
                                if (this.nwarbs[k] == 2) {
                                    str = "car battle";
                                }
                                if (this.nwarbs[k] == 3) {
                                    str = "stage battle";
                                }
                                final String string2 = "" + this.nwclan[k] + " defeated " + this.nlclan[k] + " in a " + str + "!";
                                this.rdo.drawString(string2, 22, 87 - this.scro + 35 * n10);
                                this.tlink(this.rdo, 22, 87 - this.scro + 35 * n10, string2, this.nwclan[k], n, n2, b, 216, 139, 1, this.nwclan[k], "");
                                this.tlink(this.rdo, 22, 87 - this.scro + 35 * n10, string2, this.nlclan[k], n, n2, b, 216, 139, 1, this.nlclan[k], "");
                                if (this.nwarbs[k] == 1 && this.nwinp[k] != -1 && this.nlosp[k] != -1) {
                                    if (this.nwinob[k].equals("champ")) {
                                        final String string3 = "" + this.nwclan[k] + " has taken the clan wars world championship title!";
                                        this.rdo.setFont(new Font("Tahoma", 0, 11));
                                        this.rdo.drawString(string3, 22, 100 - this.scro + 35 * n10);
                                        this.tlink(this.rdo, 22, 100 - this.scro + 35 * n10, string3, "clan wars world championship title", n, n2, b, 216, 139, 5, "", "");
                                    }
                                    else if (this.nwinob[k].equals("re-champ")) {
                                        final String string4 = "" + this.nwclan[k] + " has defended and re-claimed the clan wars world championship title!";
                                        this.rdo.setFont(new Font("Tahoma", 0, 11));
                                        this.rdo.drawString(string4, 22, 100 - this.scro + 35 * n10);
                                        this.tlink(this.rdo, 22, 100 - this.scro + 35 * n10, string4, "clan wars world championship title", n, n2, b, 216, 139, 5, "", "");
                                    }
                                    else {
                                        final String string5 = "" + this.nwclan[k] + " won: [ " + this.nwinp[k] + " points ]  & " + this.nlclan[k] + " lost: [ " + this.nlosp[k] + " points ]";
                                        this.rdo.setFont(new Font("Tahoma", 0, 11));
                                        this.rdo.drawString(string5, 22, 100 - this.scro + 35 * n10);
                                        this.tlink(this.rdo, 22, 100 - this.scro + 35 * n10, string5, "" + this.nwinp[k] + " points", n, n2, b, 216, 139, 5, "", "");
                                        this.tlink(this.rdo, 22, 100 - this.scro + 35 * n10, string5, "" + this.nlosp[k] + " points", n, n2, b, 216, 139, 5, "", "");
                                    }
                                }
                                if (this.nwarbs[k] == 2) {
                                    final String string6 = "" + this.nwclan[k] + " took car [" + this.nwinob[k] + "] from " + this.nlclan[k] + ".";
                                    this.rdo.setFont(new Font("Tahoma", 0, 11));
                                    this.rdo.drawString(string6, 22, 100 - this.scro + 35 * n10);
                                    this.tlink(this.rdo, 22, 100 - this.scro + 35 * n10, string6, this.nwinob[k], n, n2, b, 216, 139, 3, this.nwinob[k], this.nwclan[k]);
                                }
                                if (this.nwarbs[k] == 3) {
                                    String string7 = this.nwinob[k];
                                    if (string7.length() > 20) {
                                        string7 = "" + string7.substring(0, 20) + "...";
                                    }
                                    final String string8 = "" + this.nwclan[k] + " took stage [" + string7 + "] from " + this.nlclan[k] + ".";
                                    this.rdo.setFont(new Font("Tahoma", 0, 11));
                                    this.rdo.drawString(string8, 22, 100 - this.scro + 35 * n10);
                                    this.tlink(this.rdo, 22, 100 - this.scro + 35 * n10, string8, string7, n, n2, b, 216, 139, 4, this.nwinob[k], this.nwclan[k]);
                                }
                                this.rdo.setColor(new Color(98, 76, 29));
                                this.rdo.setFont(new Font("Tahoma", 0, 11));
                                this.ftm = this.rdo.getFontMetrics();
                                this.rdo.drawString(this.nwtime[k], 518 - this.ftm.stringWidth(this.nwtime[k]), 87 - this.scro + 35 * n10);
                                ++n10;
                            }
                        }
                        if (n10 == 0) {
                            this.rdo.setColor(new Color(0, 0, 0));
                            this.rdo.setFont(new Font("Tahoma", 0, 11));
                            this.ftm = this.rdo.getFontMetrics();
                            this.rdo.drawString("(No recent clan wars or battles have been played yet...)", 280 - this.ftm.stringWidth("(No recent clan wars or battles have been played yet...)") / 2, 91 - this.scro);
                            n10 = 1;
                        }
                    }
                    final int n11 = 70 + 35 * n10 - this.scro;
                    if (n11 + 25 > 0) {
                        this.rdo.setFont(new Font("Tahoma", 1, 11));
                        this.rdo.setColor(new Color(0, 0, 0));
                        this.rdo.drawString("Recent clan activity:", 18, n11 + 20);
                    }
                    int n12 = 0;
                    String anObject = "";
                    this.doi = 0;
                    for (int l = 0; l < this.il; ++l) {
                        if (!this.text[l].equals(anObject)) {
                            if (n12 == 0) {
                                n12 = 1;
                            }
                            else {
                                n12 = 0;
                            }
                            if (n11 + this.doi * 16 + 38 > 0 && n11 + this.doi * 16 + 18 < 300) {
                                if (n12 != 0) {
                                    this.rdo.setComposite(AlphaComposite.getInstance(3, 0.1f));
                                    this.rdo.setColor(new Color(255, 255, 255));
                                    this.rdo.fillRect(18, n11 + this.doi * 16 + 24, 504, 16);
                                    this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                                }
                                this.rdo.setFont(new Font("Tahoma", 0, 11));
                                this.ftm = this.rdo.getFontMetrics();
                                if (this.text[l].startsWith("Battle")) {
                                    this.rdo.setFont(new Font("Tahoma", 1, 11));
                                }
                                else {
                                    this.rdo.setColor(new Color(98, 76, 29));
                                    this.rdo.drawString(this.nttime[l], 518 - this.ftm.stringWidth(this.nttime[l]), n11 + this.doi * 16 + 36);
                                }
                                if (this.text[l].indexOf("started") != -1) {
                                    this.rdo.setFont(new Font("Tahoma", 1, 11));
                                    if (this.text[l].indexOf("war") == -1) {
                                        if (n12 == 0) {
                                            n12 = 1;
                                        }
                                        else {
                                            n12 = 0;
                                        }
                                    }
                                }
                                if (this.text[l].indexOf("clan wars world champion") != -1) {
                                    this.rdo.setFont(new Font("Tahoma", 1, 11));
                                    if (n12 == 0) {
                                        n12 = 1;
                                    }
                                    else {
                                        n12 = 0;
                                    }
                                }
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.drawString(this.text[l], 22, n11 + this.doi * 16 + 36);
                                for (int n13 = 0; n13 < this.nln[l]; ++n13) {
                                    this.tlink(this.rdo, 22, n11 + this.doi * 16 + 36, this.text[l], this.link[l][n13][0], n, n2, b, 216, 139, this.getvalue(this.link[l][n13][1], 0), this.getSvalue(this.link[l][n13][1], 1), this.getSvalue(this.link[l][n13][1], 2));
                                }
                            }
                            anObject = this.text[l];
                            ++this.doi;
                        }
                    }
                }
                else {
                    this.sdist = 0;
                }
                if (this.loadednews == 0) {
                    this.rdo.setFont(new Font("Tahoma", 1, 11));
                    this.ftm = this.rdo.getFontMetrics();
                    this.rdo.setColor(new Color(0, 0, 0));
                    this.rdo.drawString("Loading game news, please wait...", 280 - this.ftm.stringWidth("Loading game news, please wait...") / 2, 140);
                }
                if (this.loadednews == -1) {
                    this.rdo.setFont(new Font("Tahoma", 1, 11));
                    this.ftm = this.rdo.getFontMetrics();
                    this.rdo.setColor(new Color(0, 0, 0));
                    this.rdo.drawString("Failed to load game news, please try again later...", 280 - this.ftm.stringWidth("Failed to load game news, please try again later...") / 2, 140);
                }
            }
            if (this.ntab == 1) {
                this.darker = true;
                if (this.stringbutton(this.rd, "  About Championship  ", 617, 125, 3, n, n2, b, 0, 0)) {
                    this.ntab = 2;
                }
                this.darker = false;
                if (this.loadwstat == 1) {
                    if (this.eng == -1) {
                        int ncc = this.ncc;
                        if (this.champ >= 0) {
                            --ncc;
                        }
                        if (ncc < 0) {
                            ncc = 0;
                        }
                        this.sdist = 154 + ncc * 45 - 260;
                        if (this.sdist < 0) {
                            this.sdist = 0;
                        }
                        this.scro = (int)(this.spos6 / 229.0f * this.sdist);
                        this.rdo.setFont(new Font("Tahoma", 1, 11));
                        this.ftm = this.rdo.getFontMetrics();
                        final int stringWidth5 = this.ftm.stringWidth("Engagement Stats");
                        this.rdo.setColor(new Color(0, 0, 0));
                        this.rdo.drawString("Current World Champion", 10, 20 - this.scro);
                        this.rdo.setColor(new Color(228, 177, 31));
                        this.rdo.fillRoundRect(10, 28 - this.scro, 520, 70, 20, 20);
                        this.rdo.setColor(new Color(199, 154, 63));
                        this.rdo.fillRoundRect(13, 33 - this.scro, 514, 60, 20, 20);
                        this.rdo.setColor(new Color(255, 198, 0));
                        this.rdo.drawRoundRect(13, 33 - this.scro, 514, 60, 20, 20);
                        this.rdo.setColor(new Color(0, 0, 0));
                        this.rdo.drawRoundRect(10, 28 - this.scro, 520, 70, 20, 20);
                        if (this.champ == -1) {
                            this.rdo.setFont(new Font("Tahoma", 0, 11));
                            this.ftm = this.rdo.getFontMetrics();
                            this.rdo.drawString("No current world champion because no contender has attained or surpassed 3 points yet!", 270 - this.ftm.stringWidth("No current world champion because no contender has attained or surpassed 3 points yet!") / 2, 65 - this.scro);
                        }
                        if (this.champ == -2) {
                            this.rdo.setFont(new Font("Tahoma", 0, 11));
                            this.ftm = this.rdo.getFontMetrics();
                            this.rdo.drawString("No current world champion at this moment because the top contenders are tied in points!", 270 - this.ftm.stringWidth("No current world champion at this moment because the top contenders are tied in points!") / 2, 65 - this.scro);
                        }
                        if (this.champ >= 0) {
                            if (!this.drawl(this.rdo, "#" + this.conclan[this.champ] + "#", 21, 40 - this.scro, true)) {
                                this.rdo.setColor(new Color(100, 77, 31));
                                this.rdo.drawRect(21, 40 - this.scro, 349, 29);
                                this.rdo.setFont(new Font("Arial", 1, 13));
                                this.ftm = this.rdo.getFontMetrics();
                                this.rdo.drawString(this.conclan[this.champ], 196 - this.ftm.stringWidth(this.conclan[this.champ]) / 2, 59 - this.scro);
                            }
                            if (n > 237 && n < 587 && n2 > 179 - this.scro && n2 < 209 - this.scro && n2 > 139 && n2 < 439) {
                                this.cur = 12;
                                if (b) {
                                    if (!this.claname.equals(this.conclan[this.champ])) {
                                        this.claname = this.conclan[this.champ];
                                        this.loadedc = false;
                                    }
                                    this.spos5 = 0;
                                    this.lspos5 = 0;
                                    this.cfase = 3;
                                    this.ctab = 0;
                                }
                            }
                            this.rdo.setFont(new Font("Tahoma", 0, 11));
                            this.rdo.setColor(new Color(0, 0, 0));
                            this.rdo.drawString("" + this.conclan[this.champ] + " is leading the championship by " + this.leadsby + " points difference from the first contender!", 22, 85 - this.scro);
                            this.rdo.setFont(new Font("Tahoma", 1, 11));
                            this.rdo.drawString("Attained points:  [ " + this.totp[this.champ] + " ]", 383, 51 - this.scro);
                            this.rdo.drawString("Engagement Stats", 383, 66 - this.scro);
                            this.rdo.drawLine(383, 68 - this.scro, 383 + stringWidth5, 68 - this.scro);
                            if (n > 599 && n < 383 + stringWidth5 + 216 && n2 > 195 - this.scro && n2 < 208 - this.scro && n2 > 139 && n2 < 439) {
                                this.cur = 12;
                                if (b) {
                                    this.eng = this.champ;
                                    this.engo = 40 - this.scro;
                                    this.lspos6w = this.spos6;
                                    this.spos6 = 0;
                                }
                            }
                        }
                        this.rdo.setColor(new Color(0, 0, 0));
                        this.rdo.setFont(new Font("Tahoma", 1, 11));
                        this.ftm = this.rdo.getFontMetrics();
                        this.rdo.drawString("Contenders", 10, 125 - this.scro);
                        int n14;
                        if (ncc > 3) {
                            n14 = 160 + 45 * (ncc - 3);
                        }
                        else {
                            n14 = 160;
                        }
                        this.rdo.drawRoundRect(10, 133 - this.scro, 520, n14, 20, 20);
                        if (this.ncc == 0 || (this.ncc == 1 && this.champ == 0)) {
                            this.rdo.drawString("No contenders...", 270 - this.ftm.stringWidth("No contenders...") / 2, 160 - this.scro);
                            this.rdo.setFont(new Font("Tahoma", 0, 11));
                            this.ftm = this.rdo.getFontMetrics();
                            this.rdo.setColor(new Color(0, 0, 0));
                            this.rdo.drawString("To become a contender, a clan must get points by winning a war against any other clan.", 270 - this.ftm.stringWidth("To become a contender, a clan must get points by winning a war against any other clan.") / 2, 185 - this.scro);
                        }
                        else {
                            this.rdo.setFont(new Font("Tahoma", 0, 11));
                            this.ftm = this.rdo.getFontMetrics();
                            this.rdo.setColor(new Color(0, 0, 0));
                            this.rdo.drawString("To become a contender, a clan must get points by winning a war against any other clan.", 270 - this.ftm.stringWidth("To become a contender, a clan must get points by winning a war against any other clan.") / 2, 147 - this.scro);
                            int n15 = 0;
                            for (int n16 = 0; n16 < this.ncc; ++n16) {
                                if (this.ord[n16] != this.champ) {
                                    this.rdo.setColor(new Color(199, 154, 63));
                                    this.rdo.fillRect(11, 154 + n15 * 45 - this.scro, 519, 40);
                                    if (!this.drawl(this.rdo, "#" + this.conclan[this.ord[n16]] + "#", 21, 159 + n15 * 45 - this.scro, true)) {
                                        this.rdo.setColor(new Color(100, 77, 31));
                                        this.rdo.drawRect(21, 159 + n15 * 45 - this.scro, 349, 29);
                                        this.rdo.setFont(new Font("Arial", 1, 13));
                                        this.ftm = this.rdo.getFontMetrics();
                                        this.rdo.drawString(this.conclan[this.ord[n16]], 196 - this.ftm.stringWidth(this.conclan[this.ord[n16]]) / 2, 178 + n15 * 45 - this.scro);
                                    }
                                    if (n > 237 && n < 587 && n2 > 159 + n15 * 45 + 139 - this.scro && n2 < 189 + n15 * 45 + 139 - this.scro && n2 > 139 && n2 < 439) {
                                        this.cur = 12;
                                        if (b) {
                                            if (!this.claname.equals(this.conclan[this.ord[n16]])) {
                                                this.claname = this.conclan[this.ord[n16]];
                                                this.loadedc = false;
                                            }
                                            this.spos5 = 0;
                                            this.lspos5 = 0;
                                            this.cfase = 3;
                                            this.ctab = 0;
                                        }
                                    }
                                    this.rdo.setColor(new Color(0, 0, 0));
                                    this.rdo.setFont(new Font("Tahoma", 1, 11));
                                    this.rdo.drawString("Attained points:  [ " + this.totp[this.ord[n16]] + " ]", 383, 170 + n15 * 45 - this.scro);
                                    this.rdo.drawString("Engagement Stats", 383, 185 + n15 * 45 - this.scro);
                                    this.rdo.drawLine(383, 187 + n15 * 45 - this.scro, 383 + stringWidth5, 187 + n15 * 45 - this.scro);
                                    if (n > 599 && n < 383 + stringWidth5 + 216 && n2 > 175 + n15 * 45 + 139 - this.scro && n2 < 188 + n15 * 45 + 139 - this.scro && n2 > 139 && n2 < 439) {
                                        this.cur = 12;
                                        if (b) {
                                            this.eng = this.ord[n16];
                                            this.engo = 159 + n15 * 45 - this.scro;
                                            this.lspos6w = this.spos6;
                                            this.spos6 = 0;
                                        }
                                    }
                                    ++n15;
                                }
                            }
                        }
                    }
                    else {
                        if (this.engo == 15) {
                            this.sdist = 87 + this.ados + this.nvc[this.eng] * 17 - 260;
                            if (this.sdist < 0) {
                                this.sdist = 0;
                            }
                            this.scro = (int)(this.spos6 / 229.0f * this.sdist);
                            this.ados = 0;
                            this.rdo.setFont(new Font("Tahoma", 1, 11));
                            this.rdo.setColor(new Color(0, 0, 0));
                            this.rdo.drawString("Engagement Stats", 385, 40 - this.scro);
                            if (!this.xt.clan.equals("") && !this.xt.clan.toLowerCase().equals(this.conclan[this.eng].toLowerCase())) {
                                this.ados = 116;
                                int n17 = -1;
                                int n18 = 0;
                                for (int n19 = 0; n19 < this.ncc; ++n19) {
                                    if (this.xt.clan.toLowerCase().equals(this.conclan[n19].toLowerCase())) {
                                        n18 = this.totp[n19];
                                        n17 = n19;
                                        break;
                                    }
                                }
                                int m = this.totp[this.eng] + 1;
                                int i2 = n18 + 1;
                                if (i2 > this.totp[this.eng]) {
                                    i2 = this.totp[this.eng];
                                }
                                if (n17 != -1) {
                                    int n20 = 0;
                                    while (n20 < this.nvc[n17]) {
                                        if (this.conclan[this.eng].toLowerCase().equals(this.verclan[n17][n20].toLowerCase())) {
                                            m -= this.points[n17][n20];
                                            if (m < 0) {
                                                m = 0;
                                                break;
                                            }
                                            break;
                                        }
                                        else {
                                            ++n20;
                                        }
                                    }
                                }
                                this.rdo.setFont(new Font("Tahoma", 1, 11));
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.drawString("If your clan " + this.xt.clan + " engages & defeats " + this.conclan[this.eng] + " in a war:", 27, 70 - this.scro);
                                this.rdo.setFont(new Font("Tahoma", 0, 11));
                                String str2 = "s";
                                if (m == 1) {
                                    str2 = "";
                                }
                                this.rdo.drawString("- Your clan will get:  [ " + m + " point" + str2 + " ]", 47, 87 - this.scro);
                                String str3 = "s";
                                if (i2 == 1) {
                                    str3 = "";
                                }
                                this.rdo.drawString("- " + this.conclan[this.eng] + " will lose:  [ " + i2 + " point" + str3 + " ]", 47, 104 - this.scro);
                                if (m + n18 > 3 && m + n18 > this.totp[this.ord[0]] && !this.xt.clan.toLowerCase().equals(this.conclan[this.ord[0]].toLowerCase())) {
                                    if (this.frkl) {
                                        this.rdo.setColor(new Color(0, 0, 0));
                                        this.frkl = false;
                                    }
                                    else {
                                        this.rdo.setColor(new Color(106, 80, 0));
                                        this.frkl = true;
                                    }
                                    if (this.champ >= 0) {
                                        this.rdo.drawString("- Your clan would take the championship title from " + this.conclan[this.champ] + " !", 47, 121 - this.scro);
                                    }
                                    else {
                                        this.rdo.drawString("- Your clan would take the champion ship title!", 42, 121 - this.scro);
                                    }
                                    this.ados += 17;
                                }
                                this.rdo.setColor(new Color(0, 0, 0));
                                int i3 = n18 + 1;
                                int i4 = this.totp[this.eng] + 1;
                                if (i4 > n18) {
                                    i4 = n18;
                                }
                                int n21 = 0;
                                while (n21 < this.nvc[this.eng]) {
                                    if (this.xt.clan.toLowerCase().equals(this.verclan[this.eng][n21].toLowerCase())) {
                                        i3 -= this.points[this.eng][n21];
                                        if (i3 < 0) {
                                            i3 = 0;
                                            break;
                                        }
                                        break;
                                    }
                                    else {
                                        ++n21;
                                    }
                                }
                                this.rdo.setFont(new Font("Tahoma", 1, 11));
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.drawString("If your clan loses a war against " + this.conclan[this.eng] + ":", 27, 12 + this.ados - this.scro);
                                this.rdo.setFont(new Font("Tahoma", 0, 11));
                                String str4 = "s";
                                if (i4 == 1) {
                                    str4 = "";
                                }
                                this.rdo.drawString("- Your clan will lose:  [ " + i4 + " point" + str4 + " ]", 47, 29 + this.ados - this.scro);
                                String str5 = "s";
                                if (i3 == 1) {
                                    str5 = "";
                                }
                                this.rdo.drawString("- " + this.conclan[this.eng] + " will get:  [ " + i3 + " point" + str5 + " ]", 47, 46 + this.ados - this.scro);
                            }
                            this.rdo.setFont(new Font("Tahoma", 1, 11));
                            this.rdo.setColor(new Color(0, 0, 0));
                            this.rdo.drawString("" + this.conclan[this.eng] + " has attained its points from clan wars:", 27, 70 + this.ados - this.scro);
                            this.rdo.setFont(new Font("Tahoma", 0, 11));
                            for (int n22 = 0; n22 < this.nvc[this.eng]; ++n22) {
                                String str6 = "s";
                                if (this.points[this.eng][n22] == 1) {
                                    str6 = "";
                                }
                                this.rdo.drawString("Versus clan " + this.verclan[this.eng][n22] + ":  [ " + this.points[this.eng][n22] + " point" + str6 + " ]", 47, 87 + this.ados + n22 * 17 - this.scro);
                            }
                            this.rdo.setFont(new Font("Tahoma", 1, 11));
                            this.rdo.setColor(new Color(0, 0, 0));
                            this.rdo.drawString("Total attained points:  [ " + this.totp[this.eng] + " ]", 47, 87 + this.ados + this.nvc[this.eng] * 17 - this.scro);
                        }
                        else if (Math.abs(this.engo - 15) < 20) {
                            this.engo = 15;
                        }
                        else if (this.engo < 15) {
                            this.engo += 20;
                        }
                        else {
                            this.engo -= 20;
                        }
                        if (!this.drawl(this.rdo, "#" + this.conclan[this.eng] + "#", 21, this.engo - this.scro, true)) {
                            this.rdo.setColor(new Color(100, 77, 31));
                            this.rdo.drawRect(21, this.engo - this.scro, 349, 29);
                            this.rdo.setFont(new Font("Arial", 1, 13));
                            this.ftm = this.rdo.getFontMetrics();
                            this.rdo.drawString(this.conclan[this.champ], 196 - this.ftm.stringWidth(this.conclan[this.champ]) / 2, this.engo + 19 - this.scro);
                        }
                        if (this.engo == 15) {
                            this.darker = true;
                            if (!this.xt.clan.equals("") && !this.xt.clan.toLowerCase().equals(this.conclan[this.eng].toLowerCase()) && this.stringbutton(this.rdo, "   Declare War  >   ", 459, 176, 1, n, n2, b, 216, 139)) {
                                this.tab = 2;
                                this.itab = 1;
                                this.litab = -1;
                                this.openi = 10;
                                this.viewgame2 = 0;
                                if (!this.intclan.equals(this.conclan[this.eng])) {
                                    this.intclan = this.conclan[this.eng];
                                    this.dispi = 0;
                                    this.nil = 0;
                                    this.lastint = "";
                                    this.readint = 1;
                                }
                                this.redif = true;
                                this.intsel = 4;
                                this.eng = -1;
                                this.spos6 = this.lspos6w;
                            }
                            if (this.stringbutton(this.rdo, "   <  Back   ", 480, 110, 1, n, n2, b, 216, 139)) {
                                this.eng = -1;
                                this.spos6 = this.lspos6w;
                            }
                            this.darker = false;
                        }
                    }
                }
                else {
                    this.sdist = 0;
                }
                if (this.loadwstat == 0) {
                    this.rdo.setFont(new Font("Tahoma", 1, 11));
                    this.ftm = this.rdo.getFontMetrics();
                    this.rdo.setColor(new Color(0, 0, 0));
                    this.rdo.drawString("Loading championship, please wait...", 280 - this.ftm.stringWidth("Loading championship, please wait...") / 2, 140);
                }
                if (this.loadwstat == -1) {
                    this.rdo.setFont(new Font("Tahoma", 1, 11));
                    this.ftm = this.rdo.getFontMetrics();
                    this.rdo.setColor(new Color(0, 0, 0));
                    this.rdo.drawString("Failed to load championship, please try again later...", 280 - this.ftm.stringWidth("Failed to load championship, please try again later...") / 2, 140);
                }
            }
            if (this.ntab == 2) {
                this.rdo.setFont(new Font("Tahoma", 1, 11));
                this.ftm = this.rdo.getFontMetrics();
                this.rdo.setColor(new Color(0, 0, 0));
                this.rdo.drawString("About the Championship", 280 - this.ftm.stringWidth("About the Championship") / 2, 40);
                this.rdo.setFont(new Font("Tahoma", 0, 11));
                this.rdo.drawString("The clan wars world championship is ongoing championship that does not end!", 7, 70);
                this.rdo.drawString("Every clan always has a chance to claim & re-claim the championship title from the current winner.", 7, 85);
                this.rdo.drawString("The champion clan is the clan that is at the current moment attaining the most points.", 7, 115);
                this.rdo.drawString("Clans get points by defeating other clans in wars, but not every clan you defeat earns you the same amount of", 7, 130);
                this.rdo.drawString("points. It depends on how much points that clan has and from which wars where these points attained.", 7, 145);
                this.rdo.drawString("The points system is designed to deliver a fair & balanced championship that is also fun, exiting and never ending!", 7, 160);
                this.rdo.setFont(new Font("Tahoma", 1, 11));
                this.rdo.drawString("Currently there are no rewards in the game for claiming or re-claiming the championship title, but", 7, 190);
                this.rdo.drawString("in the coming updates there will be rewards that can be used to 'super power' clan cars!", 7, 205);
                this.rdo.setFont(new Font("Tahoma", 0, 11));
                this.rdo.drawString("Stay tuned for the rewards system to come!", 7, 220);
                this.rdo.setFont(new Font("Tahoma", 1, 11));
                this.ftm = this.rdo.getFontMetrics();
                this.rdo.drawString("Good Luck!", 280 - this.ftm.stringWidth("Good Luck!") / 2, 250);
                this.darker = true;
                if (this.stringbutton(this.rdo, "   <  Back   ", 280, 280, 1, n, n2, b, 216, 139)) {
                    this.ntab = 1;
                }
                this.darker = false;
            }
            if (this.sdist != 0) {
                final int n23 = 27;
                this.rdo.setColor(this.color2k(200, 200, 200));
                this.rdo.fillRect(540, 20, 17, 260);
                if (this.mscro5 == 831) {
                    this.rdo.setColor(this.color2k(215, 215, 215));
                    this.rdo.fillRect(540, 3, 17, 17);
                }
                else {
                    this.rdo.setColor(this.color2k(220, 220, 220));
                    this.rdo.fill3DRect(540, 3, 17, 17, true);
                }
                this.rdo.drawImage(this.xt.asu, 545, 9, null);
                if (this.mscro5 == 832) {
                    this.rdo.setColor(this.color2k(215, 215, 215));
                    this.rdo.fillRect(540, 280, 17, 17);
                }
                else {
                    this.rdo.setColor(this.color2k(220, 220, 220));
                    this.rdo.fill3DRect(540, 280, 17, 17, true);
                }
                this.rdo.drawImage(this.xt.asd, 545, 287, null);
                if (this.lspos6 != this.spos6) {
                    this.rdo.setColor(this.color2k(215, 215, 215));
                    this.rdo.fillRect(540, 20 + this.spos6, 17, 31);
                }
                else {
                    if (this.mscro5 == 831) {
                        this.rdo.setColor(this.color2k(215, 215, 215));
                    }
                    this.rdo.fill3DRect(540, 20 + this.spos6, 17, 31, true);
                }
                this.rdo.setColor(this.color2k(150, 150, 150));
                this.rdo.drawLine(545, 33 + this.spos6, 551, 33 + this.spos6);
                this.rdo.drawLine(545, 35 + this.spos6, 551, 35 + this.spos6);
                this.rdo.drawLine(545, 37 + this.spos6, 551, 37 + this.spos6);
                if (this.mscro5 > 800 && this.lspos6 != this.spos6) {
                    this.lspos6 = this.spos6;
                }
                if (b) {
                    if (this.mscro5 == 825 && n > 756 && n < 773 && n2 > 132 + n23 + this.spos6 && n2 < this.spos6 + n23 + 163) {
                        this.mscro5 = n2 - this.spos6;
                    }
                    if (this.mscro5 == 825 && n > 754 && n < 775 && n2 > 26 + n23 && n2 < 134 + n23) {
                        this.mscro5 = 831;
                    }
                    if (this.mscro5 == 825 && n > 754 && n < 775 && n2 > 390 + n23 && n2 < 411 + n23) {
                        this.mscro5 = 832;
                    }
                    if (this.mscro5 == 825 && n > 756 && n < 773 && n2 > 132 + n23 && n2 < 392 + n23) {
                        this.mscro5 = 152 + n23;
                        this.spos6 = n2 - this.mscro5;
                    }
                    int n24 = 2670 / this.sdist;
                    if (n24 < 1) {
                        n24 = 1;
                    }
                    if (this.mscro5 == 831) {
                        this.spos6 -= n24;
                        if (this.spos6 > 229) {
                            this.spos6 = 229;
                        }
                        if (this.spos6 < 0) {
                            this.spos6 = 0;
                        }
                        this.lspos6 = this.spos6;
                    }
                    if (this.mscro5 == 832) {
                        this.spos6 += n24;
                        if (this.spos6 > 229) {
                            this.spos6 = 229;
                        }
                        if (this.spos6 < 0) {
                            this.spos6 = 0;
                        }
                        this.lspos6 = this.spos6;
                    }
                    if (this.mscro5 < 800) {
                        this.spos6 = n2 - this.mscro5;
                        if (this.spos6 > 229) {
                            this.spos6 = 229;
                        }
                        if (this.spos6 < 0) {
                            this.spos6 = 0;
                        }
                    }
                    if (this.mscro5 == 825) {
                        this.mscro5 = 925;
                    }
                }
                else if (this.mscro5 != 825) {
                    this.mscro5 = 825;
                }
            }
            this.rd.drawImage(this.gImage, 216, 139, null);
        }
        if (this.cfase == 1) {
            if (this.xt.logged) {
                if (this.xt.clan.equals("")) {
                    this.rd.setComposite(AlphaComposite.getInstance(3, 0.4f));
                    this.rd.setColor(new Color(255, 255, 255));
                    this.rd.fillRoundRect(232, 90, 527, 176, 20, 20);
                    this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(232, 90, 527, 176, 20, 20);
                    this.rd.setFont(new Font("Arial", 1, 13));
                    this.ftm = this.rd.getFontMetrics();
                    if (this.flko % 4 != 0 || this.flko == 0) {
                        this.rd.drawString(this.msg, 495 - this.ftm.stringWidth(this.msg) / 2, 120);
                    }
                    if (this.flko != 0) {
                        --this.flko;
                    }
                    this.rd.drawString("Clan name :", 462 - this.ftm.stringWidth("Clan name :"), 156);
                    this.donewc = true;
                    if (this.em != 1) {
                        if (this.stringbutton(this.rd, "     Create     ", 495, 204, 0, n, n2, b, 0, 0)) {
                            if (!this.gs.temail.getText().equals("")) {
                                this.em = 1;
                            }
                            else {
                                this.msg = "Please enter a clan name!";
                                this.flko = 45;
                            }
                        }
                        if (this.stringbutton(this.rd, " Cancel ", 495, 244, 2, n, n2, b, 0, 0)) {
                            this.cfase = 0;
                        }
                    }
                    else {
                        this.rd.drawString("Creating, please wait...", 495 - this.ftm.stringWidth("Creating, please wait...") / 2, 224);
                    }
                }
                else {
                    this.rd.setComposite(AlphaComposite.getInstance(3, 0.4f));
                    this.rd.setColor(new Color(255, 255, 255));
                    this.rd.fillRoundRect(232, 90, 527, 136, 20, 20);
                    this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(232, 90, 527, 136, 20, 20);
                    this.rd.setFont(new Font("Arial", 1, 13));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("You are already a member of a clan (" + this.xt.clan + ").", 495 - this.ftm.stringWidth("You are already a member of a clan (" + this.xt.clan + ").") / 2, 120);
                    this.rd.drawString("You need to leave your clan first in order to create a new one.", 495 - this.ftm.stringWidth("You need to leave your clan first in order to create a new one.") / 2, 140);
                    if (this.stringbutton(this.rd, "   OK   ", 495, 204, 0, n, n2, b, 0, 0)) {
                        this.cfase = 0;
                    }
                }
            }
            else {
                this.rd.setComposite(AlphaComposite.getInstance(3, 0.4f));
                this.rd.setColor(new Color(255, 255, 255));
                this.rd.fillRoundRect(232, 90, 527, 176, 20, 20);
                this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                this.rd.setColor(new Color(0, 0, 0));
                this.rd.drawRoundRect(232, 90, 527, 176, 20, 20);
                this.rd.setFont(new Font("Arial", 1, 13));
                this.ftm = this.rd.getFontMetrics();
                this.rd.drawString("You are currently using a trial account.", 495 - this.ftm.stringWidth("You are currently using a trial account.") / 2, 120);
                this.rd.drawString("You need to upgrade to be able participate in any NFM clan activity.", 495 - this.ftm.stringWidth("You need to upgrade to be able participate in any NFM clan activity.") / 2, 140);
                this.rd.setColor(new Color(206, 171, 98));
                this.rd.fillRoundRect(405, 163, 180, 50, 20, 20);
                if (this.drawbutton(this.xt.upgrade, 495, 188, n, n2, b)) {
                    this.gs.editlink(this.xt.nickname, true);
                }
                if (this.stringbutton(this.rd, " Cancel ", 495, 244, 2, n, n2, b, 0, 0)) {
                    this.cfase = 0;
                }
            }
        }
        if (this.cfase == 2) {
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.setFont(new Font("Arial", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            if (this.flko % 4 != 0 || this.flko == 0) {
                this.rd.drawString(this.msg, 495 - this.ftm.stringWidth(this.msg) / 2, 60);
            }
            if (this.flko != 0) {
                --this.flko;
            }
            this.rd.setComposite(AlphaComposite.getInstance(3, 0.2f));
            this.rd.setColor(new Color(255, 255, 255));
            this.rd.fillRoundRect(197, 73, 597, 371, 20, 20);
            this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.drawRoundRect(197, 73, 597, 371, 20, 20);
            this.dosrch = true;
            this.darker = true;
            if (this.stringbutton(this.rd, "   Search   ", 579, 104, 2, n, n2, b, 0, 0)) {
                if (!this.gs.temail.getText().equals("")) {
                    this.em = 2;
                    this.smsg = "Searching for '" + this.gs.temail.getText() + "' in clans...";
                    this.nclns = 0;
                    this.spos5 = 0;
                    this.lspos5 = 0;
                }
                else {
                    this.msg = "Please enter a search phrase!";
                    this.flko = 45;
                }
            }
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.setFont(new Font("Arial", 1, 13));
            this.rd.drawString(this.smsg, 218, 135);
            if (this.stringbutton(this.rd, " <   Back to Main  ", 725, 60, 2, n, n2, b, 0, 0)) {
                this.cfase = 0;
            }
            this.darker = false;
            this.rdo.setColor(new Color(206, 171, 98));
            this.rdo.fillRect(0, 0, 560, 300);
            this.sdist = (int)((this.nclns - 4.5f) * 55.0f);
            if (this.sdist < 0 || this.nclns == 0) {
                this.sdist = 0;
            }
            this.scro = (int)(this.spos5 / 229.0f * this.sdist);
            this.rdo.setFont(new Font("Arial", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            for (int n25 = 0; n25 < this.nclns; ++n25) {
                if (60 + n25 * 55 - this.scro > 0 && 20 + n25 * 55 - this.scro < 300) {
                    boolean b3 = true;
                    if (n > 308 && n < 683 && n2 > 159 + n25 * 55 - this.scro && n2 < 199 + n25 * 55 - this.scro) {
                        this.cur = 12;
                        b3 = false;
                        if (b) {
                            if (!this.claname.equals(this.clanlo[n25])) {
                                this.claname = this.clanlo[n25];
                                this.loadedc = false;
                            }
                            this.spos5 = 0;
                            this.lspos5 = 0;
                            this.cfase = 3;
                            this.ctab = 0;
                        }
                    }
                    this.rdo.setColor(new Color(0, 0, 0));
                    this.rdo.drawRoundRect(92, 20 + n25 * 55 - this.scro, 375, 40, 20, 20);
                    if (!this.drawl(this.rdo, "#" + this.clanlo[n25] + "#", 105, 25 + n25 * 55 - this.scro, b3) || !b3) {
                        this.rdo.drawString("" + this.clanlo[n25] + "", 280 - this.ftm.stringWidth("" + this.clanlo[n25] + "") / 2, 45 + n25 * 55 - this.scro);
                    }
                }
            }
            if (this.sdist != 0) {
                final int n26 = 27;
                this.rdo.setColor(this.color2k(200, 200, 200));
                this.rdo.fillRect(540, 20, 17, 260);
                if (this.mscro5 == 831) {
                    this.rdo.setColor(this.color2k(215, 215, 215));
                    this.rdo.fillRect(540, 3, 17, 17);
                }
                else {
                    this.rdo.setColor(this.color2k(220, 220, 220));
                    this.rdo.fill3DRect(540, 3, 17, 17, true);
                }
                this.rdo.drawImage(this.xt.asu, 545, 9, null);
                if (this.mscro5 == 832) {
                    this.rdo.setColor(this.color2k(215, 215, 215));
                    this.rdo.fillRect(540, 280, 17, 17);
                }
                else {
                    this.rdo.setColor(this.color2k(220, 220, 220));
                    this.rdo.fill3DRect(540, 280, 17, 17, true);
                }
                this.rdo.drawImage(this.xt.asd, 545, 287, null);
                if (this.lspos5 != this.spos5) {
                    this.rdo.setColor(this.color2k(215, 215, 215));
                    this.rdo.fillRect(540, 20 + this.spos5, 17, 31);
                }
                else {
                    if (this.mscro5 == 831) {
                        this.rdo.setColor(this.color2k(215, 215, 215));
                    }
                    this.rdo.fill3DRect(540, 20 + this.spos5, 17, 31, true);
                }
                this.rdo.setColor(this.color2k(150, 150, 150));
                this.rdo.drawLine(545, 33 + this.spos5, 551, 33 + this.spos5);
                this.rdo.drawLine(545, 35 + this.spos5, 551, 35 + this.spos5);
                this.rdo.drawLine(545, 37 + this.spos5, 551, 37 + this.spos5);
                if (this.mscro5 > 800 && this.lspos5 != this.spos5) {
                    this.lspos5 = this.spos5;
                }
                if (b) {
                    if (this.mscro5 == 825 && n > 756 && n < 773 && n2 > 132 + n26 + this.spos5 && n2 < this.spos5 + n26 + 163) {
                        this.mscro5 = n2 - this.spos5;
                    }
                    if (this.mscro5 == 825 && n > 754 && n < 775 && n2 > 26 + n26 && n2 < 134 + n26) {
                        this.mscro5 = 831;
                    }
                    if (this.mscro5 == 825 && n > 754 && n < 775 && n2 > 390 + n26 && n2 < 411 + n26) {
                        this.mscro5 = 832;
                    }
                    if (this.mscro5 == 825 && n > 756 && n < 773 && n2 > 132 + n26 && n2 < 392 + n26) {
                        this.mscro5 = 152 + n26;
                        this.spos5 = n2 - this.mscro5;
                    }
                    int n27 = 2670 / this.sdist;
                    if (n27 < 1) {
                        n27 = 1;
                    }
                    if (this.mscro5 == 831) {
                        this.spos5 -= n27;
                        if (this.spos5 > 229) {
                            this.spos5 = 229;
                        }
                        if (this.spos5 < 0) {
                            this.spos5 = 0;
                        }
                        this.lspos5 = this.spos5;
                    }
                    if (this.mscro5 == 832) {
                        this.spos5 += n27;
                        if (this.spos5 > 229) {
                            this.spos5 = 229;
                        }
                        if (this.spos5 < 0) {
                            this.spos5 = 0;
                        }
                        this.lspos5 = this.spos5;
                    }
                    if (this.mscro5 < 800) {
                        this.spos5 = n2 - this.mscro5;
                        if (this.spos5 > 229) {
                            this.spos5 = 229;
                        }
                        if (this.spos5 < 0) {
                            this.spos5 = 0;
                        }
                    }
                    if (this.mscro5 == 825) {
                        this.mscro5 = 925;
                    }
                }
                else if (this.mscro5 != 825) {
                    this.mscro5 = 825;
                }
            }
            this.rd.drawImage(this.gImage, 216, 139, null);
        }
        if (this.cfase == 3) {
            this.rd.setComposite(AlphaComposite.getInstance(3, 0.4f));
            this.rd.setColor(new Color(255, 255, 255));
            this.rd.fillRoundRect(197, 40, 597, 404, 20, 20);
            this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.drawRoundRect(197, 40, 597, 404, 20, 20);
            this.rd.setFont(new Font("Arial", 1, 13));
            this.ftm = this.rd.getFontMetrics();
            if (this.loadedc) {
                int n28 = -1;
                for (int n29 = 0; n29 < this.nmb; ++n29) {
                    if (this.member[n29].toLowerCase().equals(this.xt.nickname.toLowerCase()) && (this.mlevel[n29] == 7 || n29 == 0)) {
                        n28 = n29;
                    }
                }
                boolean b4 = false;
                if (n > 197 && n < 563 && n2 > 40 && n2 < 83 && this.editc == 0) {
                    b4 = true;
                }
                if (!this.drawl(this.rd, "#" + this.claname + "#", 206, 47, !b4) || b4) {
                    this.rd.drawString("Clan :  " + this.claname + "", 381 - this.ftm.stringWidth("Clan :  " + this.claname + "") / 2, 67);
                    if (n28 != -1) {
                        this.rd.setFont(new Font("Arial", 1, 11));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.drawString("Edit Logo", 505, 74);
                        this.rd.drawLine(505, 76, 505 + this.ftm.stringWidth("Edit Logo"), 76);
                        if (n > 505 && n < 505 + this.ftm.stringWidth("Edit Logo") && n2 > 62 && n2 < 77 && this.editc == 0) {
                            this.cur = 12;
                            if (b) {
                                this.editc = 1;
                                this.msg = "Edit Clan's Logo Image";
                                this.flko = 0;
                            }
                        }
                    }
                }
                this.rd.drawLine(563, 40, 563, 83);
                this.rd.drawLine(563, 83, 197, 83);
                if (this.stringbutton(this.rd, "   <   Back to Main  ", 688, 69, 1, n, n2, b, 0, 0)) {
                    this.cfase = 0;
                }
                this.rd.setFont(new Font("Arial", 1, 13));
                this.ftm = this.rd.getFontMetrics();
                final int n30 = 220;
                final int stringWidth6 = this.ftm.stringWidth("Members");
                if (this.ctab != 0) {
                    this.rd.setComposite(AlphaComposite.getInstance(3, 0.6f));
                }
                this.rd.drawString("Members", n30, 107);
                if (this.ctab != 0) {
                    this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                }
                if (n > n30 && n < n30 + stringWidth6 && n2 > 90 && n2 < 109 && this.editc == 0) {
                    this.rd.drawLine(n30, 109, n30 + stringWidth6, 109);
                    this.cur = 12;
                    if (b) {
                        this.ctab = 0;
                    }
                }
                final int n31 = n30 + (stringWidth6 + 20);
                final int stringWidth7 = this.ftm.stringWidth("Cars");
                if (this.ctab != 2) {
                    this.rd.setComposite(AlphaComposite.getInstance(3, 0.6f));
                }
                this.rd.drawString("Cars", n31, 107);
                if (this.ctab != 2) {
                    this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                }
                if (n > n31 && n < n31 + stringWidth7 && n2 > 90 && n2 < 109 && this.editc == 0 && !this.notclan) {
                    this.rd.drawLine(n31, 109, n31 + stringWidth7, 109);
                    this.cur = 12;
                    if (b) {
                        this.ctab = 2;
                        this.loadedcars = -1;
                    }
                }
                final int n32 = n31 + (stringWidth7 + 20);
                final int stringWidth8 = this.ftm.stringWidth("Stages");
                if (this.ctab != 3) {
                    this.rd.setComposite(AlphaComposite.getInstance(3, 0.6f));
                }
                this.rd.drawString("Stages", n32, 107);
                if (this.ctab != 3) {
                    this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                }
                if (n > n32 && n < n32 + stringWidth8 && n2 > 90 && n2 < 109 && this.editc == 0 && !this.notclan) {
                    this.rd.drawLine(n32, 109, n32 + stringWidth8, 109);
                    this.cur = 12;
                    if (b) {
                        this.ctab = 3;
                        this.loadedstages = -1;
                    }
                }
                final int n33 = n32 + (stringWidth8 + 20);
                final int stringWidth9 = this.ftm.stringWidth("Interact");
                if (this.ctab != 1) {
                    this.rd.setComposite(AlphaComposite.getInstance(3, 0.6f));
                }
                this.rd.drawString("Interact", n33, 107);
                if (this.ctab != 1) {
                    this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                }
                if (n > n33 && n < n33 + stringWidth9 && n2 > 90 && n2 < 109 && this.editc == 0 && !this.notclan) {
                    this.rd.drawLine(n33, 109, n33 + stringWidth9, 109);
                    this.cur = 12;
                    if (b) {
                        this.ctab = 1;
                    }
                }
                final int n34 = n33 + (stringWidth9 + 20);
                final int stringWidth10 = this.ftm.stringWidth("Web Presence");
                if (this.ctab != 4) {
                    this.rd.setComposite(AlphaComposite.getInstance(3, 0.6f));
                }
                this.rd.drawString("Web Presence", n34, 107);
                if (this.ctab != 4) {
                    this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                }
                if (n > n34 && n < n34 + stringWidth10 && n2 > 90 && n2 < 109 && this.editc == 0 && !this.notclan) {
                    this.rd.drawLine(n34, 109, n34 + stringWidth10, 109);
                    this.cur = 12;
                    if (b) {
                        this.ctab = 4;
                        this.loadedlink = false;
                    }
                }
                this.rdo.setColor(new Color(206, 171, 98));
                this.rdo.fillRect(0, 0, 560, 300);
                if (this.clanbgl) {
                    this.rdo.drawImage(this.clanbg, 0, 0, null);
                }
                if (this.notclan) {
                    this.rdo.setColor(new Color(0, 0, 0));
                    this.rdo.setFont(new Font("Arial", 1, 13));
                    this.ftm = this.rdo.getFontMetrics();
                    this.rdo.drawString("[  Clan Removed  ]", 280 - this.ftm.stringWidth("[  Clan Removed  ]") / 2, 40);
                    this.rdo.drawString("This clan has been abandoned by its members and no longer exists...", 280 - this.ftm.stringWidth("This clan has been abandoned by its members and no longer exists...") / 2, 140);
                }
                if (n28 != -1 && n > 216 && n < 776 && n2 > 92 && n2 < 412 && this.editc == 0) {
                    this.rd.setFont(new Font("Arial", 1, 11));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("Edit Background", 688, 107);
                    this.rd.drawLine(688, 109, 688 + this.ftm.stringWidth("Edit Background"), 109);
                    if (n > 688 && n < 688 + this.ftm.stringWidth("Edit Background") && n2 > 95 && n2 < 110 && this.editc == 0) {
                        this.cur = 12;
                        if (b) {
                            this.editc = 2;
                            this.msg = "Edit Clan's Background Display Image";
                            this.flko = 0;
                        }
                    }
                }
                if (this.ctab == 0) {
                    if (!this.showreqs) {
                        this.sdist = (int)((this.nmb - 4.0f) * 55.0f);
                        if (this.sdist < 0 || this.nmb < 5) {
                            this.sdist = 0;
                        }
                    }
                    else {
                        this.sdist = (int)((this.nrmb - 4.0f) * 40.0f);
                        if (this.sdist < 0) {
                            this.sdist = 0;
                        }
                    }
                }
                if (this.ctab == 1 || this.ctab == 2 || this.ctab == 3 || this.ctab == 4) {
                    this.sdist = 0;
                    if (this.sdist < 0) {
                        this.sdist = 0;
                    }
                }
                this.scro = (int)(this.spos5 / 229.0f * this.sdist);
                if (this.ctab == 0) {
                    if (!this.showreqs) {
                        int n35 = 0;
                        for (int n36 = 0; n36 < this.nmb; ++n36) {
                            boolean b5 = false;
                            for (int n37 = 0; n37 < this.npo; ++n37) {
                                if (this.member[n36].toLowerCase().equals(this.pname[n37].toLowerCase())) {
                                    b5 = true;
                                    ++n35;
                                }
                            }
                            if (60 + n36 * 55 - this.scro > 0 && 20 + n36 * 55 - this.scro < 300) {
                                int n38 = 0;
                                float alpha = 0.5f;
                                if (n > 266 && n < 726 && n2 > 132 + n36 * 55 - this.scro && n2 < 172 + n36 * 55 - this.scro && this.editc == 0) {
                                    alpha = 0.8f;
                                    if (n36 >= n28 && n28 != -1) {
                                        n38 = 1;
                                    }
                                    if (this.xt.nickname.toLowerCase().equals(this.member[n36].toLowerCase()) && n38 == 0) {
                                        n38 = 2;
                                    }
                                }
                                this.rdo.setComposite(AlphaComposite.getInstance(3, alpha));
                                this.rdo.setColor(new Color(255, 255, 255));
                                this.rdo.fillRoundRect(50, 20 + n36 * 55 - this.scro, 460, 40, 20, 20);
                                this.rdo.setColor(new Color(0, 0, 0));
                                if (b5) {
                                    this.rdo.setColor(new Color(123, 200, 0));
                                }
                                this.rdo.drawRoundRect(50, 20 + n36 * 55 - this.scro, 460, 40, 20, 20);
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                                boolean drawl2 = false;
                                boolean b6 = false;
                                if (n > 276 && n < 396 && n2 > 137 + n36 * 55 - this.scro && n2 < 167 + n36 * 55 - this.scro && n2 > 112 && n2 < 412 && this.editc == 0) {
                                    b6 = true;
                                    this.cur = 12;
                                    if (b) {
                                        this.tab = 1;
                                        if (!this.proname.equals(this.member[n36])) {
                                            this.proname = this.member[n36];
                                            this.loadedp = false;
                                            this.onexitpro();
                                        }
                                    }
                                }
                                if (!b6) {
                                    drawl2 = this.drawl(this.rdo, this.member[n36], 60, 25 + n36 * 55 - this.scro, true);
                                }
                                else {
                                    this.drawl(this.rdo, this.member[n36], 60, 25 + n36 * 55 - this.scro, false);
                                }
                                if (!drawl2) {
                                    this.rdo.setComposite(AlphaComposite.getInstance(3, 0.5f));
                                    this.rdo.setColor(new Color(255, 255, 255));
                                    this.rdo.fillRect(60, 25 + n36 * 55 - this.scro, 119, 29);
                                    this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                                    this.rdo.setColor(new Color(0, 0, 0));
                                    this.rdo.setFont(new Font("Arial", 1, 12));
                                    this.ftm = this.rdo.getFontMetrics();
                                    this.rdo.drawRect(60, 25 + n36 * 55 - this.scro, 119, 29);
                                    this.rdo.drawString(this.member[n36], 120 - this.ftm.stringWidth(this.member[n36]) / 2, 44 + n36 * 55 - this.scro);
                                }
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.setFont(new Font("Arial", 1, 11));
                                this.ftm = this.rdo.getFontMetrics();
                                String str7 = "";
                                if (n36 == 0) {
                                    str7 = "  ( Clan Leader / Admin )";
                                }
                                else if (this.mlevel[n36] == 7) {
                                    str7 = "  ( Admin )";
                                }
                                this.rdo.drawString("Level :  " + this.mlevel[n36] + "" + str7 + "", 190, 36 + n36 * 55 - this.scro);
                                this.rdo.drawString("Rank :  " + this.mrank[n36] + "", 190, 52 + n36 * 55 - this.scro);
                                if (n38 != 0) {
                                    if (n38 == 1) {
                                        this.rdo.drawString("Edit", 424, 36 + n36 * 55 - this.scro);
                                        this.rdo.drawLine(424, 38 + n36 * 55 - this.scro, 424 + this.ftm.stringWidth("Edit"), 38 + n36 * 55 - this.scro);
                                        if (n > 640 && n < 640 + this.ftm.stringWidth("Edit") && n2 > 136 + n36 * 55 - this.scro && n2 < 151 + n36 * 55 - this.scro && this.editc == 0) {
                                            this.cur = 12;
                                            if (b) {
                                                this.em = n36;
                                                this.editc = 3;
                                            }
                                        }
                                    }
                                    String s = "Remove";
                                    if (this.xt.nickname.toLowerCase().equals(this.member[n36].toLowerCase())) {
                                        s = "Leave";
                                    }
                                    this.rdo.drawString(s, 454, 36 + n36 * 55 - this.scro);
                                    this.rdo.drawLine(454, 38 + n36 * 55 - this.scro, 454 + this.ftm.stringWidth(s), 38 + n36 * 55 - this.scro);
                                    if (n > 670 && n < 670 + this.ftm.stringWidth(s) && n2 > 136 + n36 * 55 - this.scro && n2 < 151 + n36 * 55 - this.scro && this.editc == 0) {
                                        this.cur = 12;
                                        if (b) {
                                            this.em = n36;
                                            this.editc = 4;
                                        }
                                    }
                                }
                                else if (b5) {
                                    this.rdo.setColor(new Color(49, 79, 0));
                                    this.rdo.drawString("Online", 454, 36 + n36 * 55 - this.scro);
                                }
                            }
                        }
                        if (this.nmb == 1 && n28 != -1) {
                            float alpha2 = 0.5f;
                            if (n > 266 && n < 726 && n2 > 187 - this.scro && n2 < 287 - this.scro && this.editc == 0) {
                                alpha2 = 0.8f;
                            }
                            this.rdo.setComposite(AlphaComposite.getInstance(3, alpha2));
                            this.rdo.setColor(new Color(255, 255, 255));
                            this.rdo.fillRoundRect(50, 75 - this.scro, 460, 100, 20, 20);
                            this.rdo.setColor(new Color(0, 0, 0));
                            this.rdo.drawRoundRect(50, 75 - this.scro, 460, 100, 20, 20);
                            this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                            this.rdo.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rdo.getFontMetrics();
                            this.rdo.drawString("Welcome to your clan " + this.claname + "!", 60, 91 - this.scro);
                            this.rdo.drawString("Now you will need to invite other players to join this clan.", 60, 121 - this.scro);
                            this.rdo.drawString("To invite, visit a player's profile and in the clan area click 'Invite to Join...'.", 60, 136 - this.scro);
                            this.rdo.drawString("(That is if the player is not already a member of another clan).", 60, 151 - this.scro);
                            this.rdo.drawString("The maximum number of members a clan can have is 20.", 60, 166 - this.scro);
                        }
                        else if (this.nmb > 1) {
                            this.rdo.setComposite(AlphaComposite.getInstance(3, 0.8f));
                            this.rdo.setColor(new Color(255, 255, 255));
                            this.rdo.fillRoundRect(212, 20 + this.nmb * 55 - this.scro, 136, 27, 20, 20);
                            this.rdo.setColor(new Color(0, 0, 0));
                            this.rdo.drawRoundRect(212, 20 + this.nmb * 55 - this.scro, 136, 27, 20, 20);
                            this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                            this.rdo.setFont(new Font("Arial", 1, 11));
                            this.ftm = this.rdo.getFontMetrics();
                            this.rdo.drawString("" + n35 + " player(s) online", 280 - this.ftm.stringWidth("" + n35 + " player(s) online") / 2, 37 + this.nmb * 55 - this.scro);
                        }
                    }
                    else {
                        this.rdo.setComposite(AlphaComposite.getInstance(3, 0.8f));
                        this.rdo.setColor(new Color(244, 232, 204));
                        this.rdo.fillRoundRect(70, 20 - this.scro, 420, 80 + this.nrmb * 40, 20, 20);
                        this.rdo.setColor(new Color(0, 0, 0));
                        this.rdo.drawRoundRect(70, 20 - this.scro, 420, 80 + this.nrmb * 40, 20, 20);
                        this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                        this.rdo.setFont(new Font("Arial", 1, 13));
                        this.ftm = this.rdo.getFontMetrics();
                        this.rdo.drawString("Membership Requests", 280 - this.ftm.stringWidth("Membership Requests") / 2, 45 - this.scro);
                        this.darker = true;
                        for (int n39 = 0; n39 < this.nrmb; ++n39) {
                            boolean drawl3 = false;
                            boolean b7 = false;
                            if (n > 356 && n < 476 && n2 > 172 + n39 * 40 - this.scro && n2 < 202 + n39 * 55 - this.scro && n2 > 112 && n2 < 412 && this.editc == 0) {
                                b7 = true;
                                this.cur = 12;
                                if (b) {
                                    this.tab = 1;
                                    if (!this.proname.equals(this.rmember[n39])) {
                                        this.proname = this.rmember[n39];
                                        this.loadedp = false;
                                        this.onexitpro();
                                    }
                                }
                            }
                            if (!b7) {
                                drawl3 = this.drawl(this.rdo, this.rmember[n39], 140, 60 + n39 * 40 - this.scro, true);
                            }
                            else {
                                this.drawl(this.rdo, this.rmember[n39], 140, 60 + n39 * 40 - this.scro, false);
                            }
                            if (!drawl3) {
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 0.5f));
                                this.rdo.setColor(new Color(255, 255, 255));
                                this.rdo.fillRect(140, 60 + n39 * 40 - this.scro, 119, 29);
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rdo.getFontMetrics();
                                this.rdo.drawRect(140, 60 + n39 * 40 - this.scro, 119, 29);
                                this.rdo.drawString(this.rmember[n39], 200 - this.ftm.stringWidth(this.rmember[n39]) / 2, 79 + n39 * 40 - this.scro);
                            }
                            if (this.stringbutton(this.rdo, "  Approve  ", 310, 79 + n39 * 40 - this.scro, 3, n, n2, b && this.editc == 0, 216, 112)) {
                                this.em = n39;
                                this.editc = 66;
                            }
                            if (this.stringbutton(this.rdo, "  Deny  ", 391, 79 + n39 * 40 - this.scro, 3, n, n2, b && this.editc == 0, 216, 112)) {
                                this.em = n39;
                                this.editc = 77;
                            }
                        }
                        if (this.stringbutton(this.rdo, "    Decide Later    ", 280, 80 + this.nrmb * 40 - this.scro, 1, n, n2, b && this.editc == 0, 216, 112)) {
                            this.spos5 = 0;
                            this.lspos5 = 0;
                            this.showreqs = false;
                        }
                        this.darker = false;
                    }
                }
                if (this.ctab == 1) {
                    this.rdo.setComposite(AlphaComposite.getInstance(3, 0.25f));
                    this.rdo.setColor(new Color(255, 255, 255));
                    this.rdo.fillRoundRect(20, 246, 520, 39, 20, 20);
                    this.rdo.setColor(new Color(0, 0, 0));
                    this.rdo.drawRoundRect(20, 246, 520, 39, 20, 20);
                    this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                    if (this.xt.clan.toLowerCase().equals(this.claname.toLowerCase())) {
                        if (this.stringbutton(this.rdo, "       Open your clan's discussion       ", 280, 270, -1, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.tab = 2;
                            this.itab = 2;
                            this.litab = -1;
                        }
                    }
                    else {
                        if (this.stringbutton(this.rdo, "       Declare war on " + this.claname + "       ", 162, 270, -1, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.tab = 2;
                            this.itab = 1;
                            this.litab = -1;
                            this.openi = 10;
                            this.viewgame2 = 0;
                            if (!this.intclan.equals(this.claname)) {
                                this.intclan = this.claname;
                                this.dispi = 0;
                                this.nil = 0;
                                this.lastint = "";
                                this.readint = 1;
                            }
                            this.redif = true;
                            this.intsel = 4;
                        }
                        if (this.stringbutton(this.rdo, "    Talk with " + this.claname + "    ", 422, 270, -1, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.tab = 2;
                            this.itab = 1;
                            this.litab = -1;
                            this.openi = 10;
                            this.viewgame2 = 0;
                            if (!this.intclan.equals(this.claname)) {
                                this.intclan = this.claname;
                                this.dispi = 0;
                                this.nil = 0;
                                this.lastint = "";
                                this.readint = 1;
                            }
                        }
                    }
                }
                if (this.ctab == 3) {
                    if (this.loadedstages != 1 && this.loadedstages != 5) {
                        this.rdo.setComposite(AlphaComposite.getInstance(3, 0.7f));
                        this.rdo.setColor(new Color(255, 255, 255));
                        this.rdo.fillRoundRect(60, 70, 440, 100, 20, 20);
                        this.rdo.setColor(new Color(0, 0, 0));
                        this.rdo.drawRoundRect(60, 70, 440, 100, 20, 20);
                        this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                    }
                    this.rdo.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rdo.getFontMetrics();
                    if (this.loadedstages == -2) {
                        this.rdo.drawString("Failed to load clan stages, connection error, try again later...", 280 - this.ftm.stringWidth("Failed to load clan stages, connection error, try again later...") / 2, 125);
                    }
                    if (this.loadedstages == -1) {
                        this.rdo.drawString("Loading clan stages, please wait...", 280 - this.ftm.stringWidth("Loading clan stages, please wait...") / 2, 125);
                    }
                    if (this.loadedstages == 0) {
                        this.rdo.drawString("No custom clan stages have been added yet!", 280 - this.ftm.stringWidth("No custom clan stages have been added yet!") / 2, 125);
                    }
                    if (this.loadedstages == 2) {
                        this.rdo.drawString("Searching for and loading stages created by you,  " + this.perry + "  ...", 280 - this.ftm.stringWidth("Searching for and loading stages created by you,  " + this.perry + "  ...") / 2, 125);
                    }
                    if (this.loadedstages == 3) {
                        this.rdo.drawString("Found no stages that can be added!", 280 - this.ftm.stringWidth("Found no stages that can be added!") / 2, 95);
                        this.rdo.drawString("Found no stages created by you that also do not already belong to a clan.", 280 - this.ftm.stringWidth("Found no stages created by you that also do not already belong to a clan.") / 2, 115);
                        if (this.stringbutton(this.rdo, " OK ", 280, 155, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedstages = -1;
                        }
                    }
                    if (this.loadedstages == 4) {
                        this.rdo.drawString("Failed to load stages created by you, connection error, try again later...", 280 - this.ftm.stringWidth("Failed to load stages created by you, connection error, try again later...") / 2, 110);
                        if (this.stringbutton(this.rdo, " OK ", 280, 140, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedstages = -1;
                        }
                    }
                    if (this.loadedstages == 6) {
                        this.rdo.drawString("Adding stage to your clan's stages, please wait...", 280 - this.ftm.stringWidth("Adding stage to your clan's stages, please wait...") / 2, 125);
                    }
                    if (this.loadedstages == 7) {
                        this.rdo.drawString("Failed to add stage, server error, try again later...", 280 - this.ftm.stringWidth("Failed to add stage, server error, try again later...") / 2, 110);
                        if (this.stringbutton(this.rdo, " OK ", 280, 140, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedstages = -1;
                        }
                    }
                    if (this.loadedstages == 8) {
                        this.rdo.drawString("Removing stage from your clan's cars, please wait...", 280 - this.ftm.stringWidth("Removing stage from your clan's cars, please wait...") / 2, 125);
                    }
                    if (this.loadedstages == 9) {
                        this.rdo.drawString("Failed to remove stage, server error, try again later...", 280 - this.ftm.stringWidth("Failed to remove stage, server error, try again later...") / 2, 110);
                        if (this.stringbutton(this.rdo, " OK ", 280, 140, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedstages = -1;
                        }
                    }
                    if (this.loadedstages == 10) {
                        this.rdo.drawString("Are you sure you want to remove this stage from your clan's stages?", 280 - this.ftm.stringWidth("Are you sure you want to remove this stage from your clan's stages?") / 2, 93);
                        if (this.stringbutton(this.rdo, "    Yes    ", 280, 128, -2, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedstages = 8;
                        }
                        if (this.stringbutton(this.rdo, "  No  ", 280, 158, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedstages = 1;
                        }
                    }
                    if (this.loadedstages == 5) {
                        this.rdo.setComposite(AlphaComposite.getInstance(3, 0.7f));
                        this.rdo.setColor(new Color(255, 255, 255));
                        this.rdo.fillRoundRect(60, 58, 440, 162, 20, 20);
                        this.rdo.setColor(new Color(0, 0, 0));
                        this.rdo.drawRoundRect(60, 58, 440, 162, 20, 20);
                        this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                        this.rdo.drawString("Select a stage to add.", 280 - this.ftm.stringWidth("Select a stage to add.") / 2, 80);
                        this.gs.clcars.move(496 - this.gs.clcars.getWidth() / 2, 206);
                        if (this.editc == 0) {
                            if (!this.gs.clcars.isShowing()) {
                                this.gs.clcars.show();
                                this.gs.clcars.select(0);
                            }
                        }
                        else {
                            this.gs.clcars.hide();
                        }
                        if (!this.gs.clcars.getSelectedItem().equals(this.selstage)) {
                            this.selstage = this.gs.clcars.getSelectedItem();
                        }
                        if (this.gs.clcars.open) {
                            this.blocknote = 20;
                        }
                        if (this.stringbutton(this.rdo, "     Add Stage     ", 280, 150, -2, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedstages = 6;
                        }
                        if (this.stringbutton(this.rdo, "  Cancel  ", 280, 200, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedstages = -1;
                        }
                    }
                    if (this.loadedstages == 1) {
                        if (this.editc == 0) {
                            if (!this.gs.clcars.isShowing()) {
                                this.gs.clcars.show();
                                this.selstage = this.gs.clcars.getSelectedItem();
                            }
                        }
                        else {
                            this.gs.clcars.hide();
                        }
                        this.gs.clcars.move(496 - this.gs.clcars.getWidth() / 2, 122);
                        if (!this.gs.clcars.getSelectedItem().equals(this.selstage)) {
                            this.selstage = this.gs.clcars.getSelectedItem();
                            this.loadedstage = 0;
                            this.addstage = 0;
                        }
                        if (this.gs.clcars.open) {
                            this.blocknote = 20;
                        }
                        if (!this.selstage.equals("Select Stage")) {
                            if (this.loadedstage > 0) {
                                this.m.trk = 3;
                                this.m.ih = 0;
                                this.m.iw = 0;
                                this.m.h = 300;
                                this.m.w = 560;
                                this.m.cx = 280;
                                this.m.cy = 150;
                                this.m.aroundtrack(this.cp);
                                this.rdo.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
                                int n40 = 0;
                                final int[] array5 = new int[200];
                                for (int n41 = 0; n41 < this.gs.nob; ++n41) {
                                    if (this.co[n41].dist != 0) {
                                        array5[n40] = n41;
                                        ++n40;
                                    }
                                    else {
                                        this.co[n41].d(this.rdo);
                                    }
                                }
                                final int[] array6 = new int[n40];
                                for (int n42 = 0; n42 < n40; ++n42) {
                                    array6[n42] = 0;
                                }
                                for (int n43 = 0; n43 < n40; ++n43) {
                                    for (int n44 = n43 + 1; n44 < n40; ++n44) {
                                        if (this.co[array5[n43]].dist != this.co[array5[n44]].dist) {
                                            if (this.co[array5[n43]].dist < this.co[array5[n44]].dist) {
                                                final int[] array7 = array6;
                                                final int n45 = n43;
                                                ++array7[n45];
                                            }
                                            else {
                                                final int[] array8 = array6;
                                                final int n46 = n44;
                                                ++array8[n46];
                                            }
                                        }
                                        else if (n44 > n43) {
                                            final int[] array9 = array6;
                                            final int n47 = n43;
                                            ++array9[n47];
                                        }
                                        else {
                                            final int[] array10 = array6;
                                            final int n48 = n44;
                                            ++array10[n48];
                                        }
                                    }
                                }
                                for (int n49 = 0; n49 < n40; ++n49) {
                                    for (int n50 = 0; n50 < n40; ++n50) {
                                        if (array6[n50] == n49) {
                                            this.co[array5[n50]].d(this.rdo);
                                        }
                                    }
                                }
                                this.rdo.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                                this.m.trk = 0;
                                this.m.h = 450;
                                this.m.w = 800;
                                this.m.cx = 400;
                                this.m.cy = 225;
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 0.5f));
                                this.rdo.setColor(new Color(255, 255, 255));
                                this.rdo.fillRoundRect(9, 44, 136, 39, 20, 20);
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                                this.rdo.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rdo.getFontMetrics();
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.drawString("Created/Published by", 17, 59);
                                final int n51 = 17 + this.ftm.stringWidth("Created/Published by") / 2 - this.ftm.stringWidth(this.cp.maker) / 2;
                                final int n52 = n51 + this.ftm.stringWidth(this.cp.maker);
                                this.rdo.drawString(this.cp.maker, n51, 74);
                                this.rdo.drawLine(n51, 76, n52, 76);
                                if (n > n51 + 216 && n < n52 + 216 && n2 > 174 && n2 < 188) {
                                    this.cur = 12;
                                    if (b) {
                                        this.tab = 1;
                                        if (!this.proname.equals(this.cp.maker)) {
                                            this.proname = this.cp.maker;
                                            this.loadedp = false;
                                            this.onexitpro();
                                        }
                                    }
                                }
                                if ((n28 != -1 || this.cp.maker.toLowerCase().equals(this.xt.nickname.toLowerCase())) && this.stringbutton(this.rdo, " Remove X ", 510, 27, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                                    this.loadedstages = 10;
                                }
                                if (this.gs.clcars.getSelectedIndex() != this.gs.clcars.no - 1 && this.stringbutton(this.rdo, " Next > ", 520, 137, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                                    final Smenu clcars = this.gs.clcars;
                                    ++clcars.sel;
                                }
                                if (this.gs.clcars.getSelectedIndex() != 1 && this.stringbutton(this.rdo, " < Prev ", 40, 137, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                                    final Smenu clcars2 = this.gs.clcars;
                                    --clcars2.sel;
                                }
                                if (this.cp.pubt > 0) {
                                    this.rd.setFont(new Font("Arial", 1, 12));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.setColor(new Color(0, 0, 0));
                                    if (this.addstage == 2) {
                                        this.rd.drawString("Adding Stage...", 496 - this.ftm.stringWidth("Adding Stage...") / 2, 432);
                                        if (this.cd.staction == 0) {
                                            this.addstage = 3;
                                        }
                                        if (this.cd.staction == -2) {
                                            this.addstage = 4;
                                        }
                                        if (this.cd.staction == -3) {
                                            this.addstage = 5;
                                        }
                                        if (this.cd.staction == -1) {
                                            this.addstage = 6;
                                        }
                                    }
                                    if (this.addstage == 3) {
                                        this.rd.drawString("[" + this.cd.onstage + "] has been added to your stages!", 496 - this.ftm.stringWidth("[" + this.cd.onstage + "] has been added to your stages!") / 2, 432);
                                    }
                                    if (this.addstage == 4) {
                                        this.rd.drawString("You already have this stage.", 496 - this.ftm.stringWidth("You already have this stage.") / 2, 432);
                                    }
                                    if (this.addstage == 5) {
                                        this.rd.drawString("Cannot add more then 20 stages to your account!", 496 - this.ftm.stringWidth("Cannot add more then 20 stages to your account!") / 2, 432);
                                    }
                                    if (this.addstage == 6) {
                                        this.rd.drawString("Failed to add stage!  Unknown error, please try again later.", 496 - this.ftm.stringWidth("Failed to add stage!  Unknown error, please try again later.") / 2, 432);
                                    }
                                    if (this.addstage == 1) {
                                        final String s2 = "Upgrade to a full account to add custom stages!";
                                        final int n53 = 496 - this.ftm.stringWidth(s2) / 2;
                                        final int n54 = n53 + this.ftm.stringWidth(s2);
                                        this.rd.drawString(s2, n53, 432);
                                        if (this.waitlink != -1) {
                                            this.rd.drawLine(n53, 435, n54, 435);
                                        }
                                        if (n > n53 && n < n54 && n2 > 421 && n2 < 435) {
                                            if (this.waitlink != -1) {
                                                this.cur = 12;
                                            }
                                            if (b && this.waitlink == 0) {
                                                this.gs.editlink(this.xt.nickname, true);
                                                this.waitlink = -1;
                                            }
                                        }
                                        if (this.waitlink > 0) {
                                            --this.waitlink;
                                        }
                                    }
                                    if (this.addstage == 0 && this.xt.drawcarb(true, null, " Add to My Stages ", 437, 414, n, n2, b && this.blocknote == 0)) {
                                        if (this.xt.logged) {
                                            this.cd.onstage = this.selstage;
                                            this.cd.staction = 2;
                                            this.cd.sparkstageaction();
                                            this.addstage = 2;
                                        }
                                        else {
                                            this.addstage = 1;
                                            this.waitlink = 20;
                                        }
                                    }
                                }
                                else {
                                    this.rd.setFont(new Font("Arial", 1, 12));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.setColor(new Color(0, 0, 0));
                                    this.rd.drawString("Private Stage", 496 - this.ftm.stringWidth("Private Stage") / 2, 432);
                                }
                            }
                            if (this.loadedstage == 0) {
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 0.7f));
                                this.rdo.setColor(new Color(255, 255, 255));
                                this.rdo.fillRoundRect(150, 100, 260, 40, 20, 20);
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.drawRoundRect(150, 100, 260, 40, 20, 20);
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                                this.rdo.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rdo.getFontMetrics();
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.drawString("Loading...", 280 - this.ftm.stringWidth("Loading...") / 2, 125);
                            }
                            if (this.loadedstage == -1) {
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 0.7f));
                                this.rdo.setColor(new Color(255, 255, 255));
                                this.rdo.fillRoundRect(50, 100, 460, 40, 20, 20);
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.drawRoundRect(50, 100, 460, 40, 20, 20);
                                this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                                this.rdo.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rdo.getFontMetrics();
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.drawString("Error loading stage, try again later...", 280 - this.ftm.stringWidth("Error loading stage, try again later...") / 2, 125);
                            }
                        }
                    }
                    if (this.loadedstages != 1 && this.loadedstages != 5 && this.gs.clcars.isShowing()) {
                        this.gs.clcars.hide();
                    }
                    if (this.xt.clan.toLowerCase().equals(this.claname.toLowerCase())) {
                        if (this.loadedstages >= 0 && this.loadedstages < 2 && this.stringbutton(this.rdo, "     Add a stage of yours to the clan's stages     ", 280, 286, -2, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedstages = 2;
                            this.perry = "0 %";
                        }
                    }
                    else if (this.loadedstages == 1 && !this.selstage.equals("Select Stage") && this.loadedstage > 0 && this.stringbutton(this.rdo, "     Battle with clan over this stage!     ", 280, 286, -2, n, n2, b && !this.gs.openm, 216, 112)) {
                        this.tab = 2;
                        this.itab = 1;
                        this.litab = -1;
                        this.openi = 10;
                        if (!this.intclan.equals(this.claname)) {
                            this.intclan = this.claname;
                            this.dispi = 0;
                            this.nil = 0;
                            this.lastint = "";
                            this.readint = 1;
                        }
                        this.redif = true;
                        this.intsel = 2;
                    }
                }
                if (this.ctab == 2) {
                    float alpha3 = 0.7f;
                    if (this.loadedcars == 1) {
                        alpha3 = 0.5f;
                    }
                    this.rdo.setComposite(AlphaComposite.getInstance(3, alpha3));
                    this.rdo.setColor(new Color(255, 255, 255));
                    this.rdo.fillRoundRect(40, 20, 480, 245, 20, 20);
                    this.rdo.setColor(new Color(0, 0, 0));
                    this.rdo.drawRoundRect(40, 20, 480, 245, 20, 20);
                    this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                    this.rdo.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rdo.getFontMetrics();
                    if (this.loadedcars == -2) {
                        this.rdo.drawString("Failed to load clan cars, connection error, try again later...", 280 - this.ftm.stringWidth("Failed to load clan cars, connection error, try again later...") / 2, 125);
                    }
                    if (this.loadedcars == -1) {
                        this.rdo.drawString("Loading clan cars, please wait...", 280 - this.ftm.stringWidth("Loading clan cars, please wait...") / 2, 125);
                    }
                    if (this.loadedcars == 0) {
                        this.rdo.drawString("No custom clan cars have been added yet!", 280 - this.ftm.stringWidth("No custom clan cars have been added yet!") / 2, 125);
                    }
                    if (this.loadedcars == 2) {
                        this.rdo.drawString("Searching for and loading cars created by you,  " + this.perry + "  ...", 280 - this.ftm.stringWidth("Searching for and loading cars created by you,  " + this.perry + "  ...") / 2, 125);
                    }
                    if (this.loadedcars == 3) {
                        this.rdo.drawString("Found no cars that can be added!", 280 - this.ftm.stringWidth("Found no cars that can be added!") / 2, 105);
                        this.rdo.drawString("Found no cars created by you that also do not already belong to a clan.", 280 - this.ftm.stringWidth("Found no cars created by you that also do not already belong to a clan.") / 2, 125);
                        if (this.stringbutton(this.rdo, " OK ", 280, 155, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedcars = -1;
                        }
                    }
                    if (this.loadedcars == 4) {
                        this.rdo.drawString("Failed to load cars created by you, connection error, try again later...", 280 - this.ftm.stringWidth("Failed to load cars created by you, connection error, try again later...") / 2, 125);
                        if (this.stringbutton(this.rdo, " OK ", 280, 155, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedcars = -1;
                        }
                    }
                    if (this.loadedcars == 6) {
                        this.rdo.drawString("Adding " + this.selcar + " to your clan's cars, please wait...", 280 - this.ftm.stringWidth("Adding " + this.selcar + " to your clan's cars, please wait...") / 2, 125);
                    }
                    if (this.loadedcars == 7) {
                        this.rdo.drawString("Failed to add car, server error, try again later...", 280 - this.ftm.stringWidth("Failed to add car, server error, try again later...") / 2, 125);
                        if (this.stringbutton(this.rdo, " OK ", 280, 155, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedcars = -1;
                        }
                    }
                    if (this.loadedcars == 8) {
                        this.rdo.drawString("Removing " + this.selcar + " from your clan's cars, please wait...", 280 - this.ftm.stringWidth("Removing " + this.selcar + " from your clan's cars, please wait...") / 2, 125);
                    }
                    if (this.loadedcars == 9) {
                        this.rdo.drawString("Failed to remove car, server error, try again later...", 280 - this.ftm.stringWidth("Failed to remove car, server error, try again later...") / 2, 125);
                        if (this.stringbutton(this.rdo, " OK ", 280, 155, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedcars = -1;
                        }
                    }
                    if (this.loadedcars == 10) {
                        this.rdo.drawString("Are you sure you want to remove " + this.selcar + " from your clan's cars?", 280 - this.ftm.stringWidth("Are you sure you want to remove " + this.selcar + " from your clan's cars?") / 2, 100);
                        if (this.stringbutton(this.rdo, "    Yes    ", 280, 135, -2, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedcars = 8;
                        }
                        if (this.stringbutton(this.rdo, "  No  ", 280, 165, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedcars = 1;
                        }
                    }
                    if (this.loadedcars == 5) {
                        this.rdo.drawString("Select a car to add.", 280 - this.ftm.stringWidth("Select a car to add.") / 2, 80);
                        this.gs.clcars.move(496 - this.gs.clcars.getWidth() / 2, 206);
                        if (this.editc == 0) {
                            if (!this.gs.clcars.isShowing()) {
                                this.gs.clcars.show();
                                this.gs.clcars.select(0);
                            }
                        }
                        else {
                            this.gs.clcars.hide();
                        }
                        if (!this.gs.clcars.getSelectedItem().equals(this.selcar)) {
                            this.selcar = this.gs.clcars.getSelectedItem();
                        }
                        if (this.gs.clcars.open) {
                            this.blocknote = 20;
                        }
                        if (this.stringbutton(this.rdo, "     Add Car     ", 280, 150, -2, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedcars = 6;
                        }
                        if (this.stringbutton(this.rdo, "  Cancel  ", 280, 200, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedcars = -1;
                        }
                    }
                    if (this.loadedcars == 1) {
                        if (this.editc == 0) {
                            if (!this.gs.clcars.isShowing()) {
                                this.gs.clcars.show();
                                this.selcar = this.gs.clcars.getSelectedItem();
                            }
                        }
                        else {
                            this.gs.clcars.hide();
                        }
                        this.gs.clcars.move(496 - this.gs.clcars.getWidth() / 2, 140);
                        if (!this.gs.clcars.getSelectedItem().equals(this.selcar)) {
                            this.selcar = this.gs.clcars.getSelectedItem();
                            this.loadedcar = 0;
                            this.cd.action = 0;
                        }
                        if (this.gs.clcars.open) {
                            this.blocknote = 20;
                        }
                        if (!this.selcar.equals("Select Car")) {
                            if (this.loadedcar > 0) {
                                this.rdo.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rdo.getFontMetrics();
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.drawString("Created/Published by", 63, 37);
                                final int n55 = 63 + this.ftm.stringWidth("Created/Published by") / 2 - this.ftm.stringWidth(this.cd.createdby[19 + this.cd.haltload]) / 2;
                                final int n56 = n55 + this.ftm.stringWidth(this.cd.createdby[19 + this.cd.haltload]);
                                this.rdo.drawString(this.cd.createdby[19 + this.cd.haltload], n55, 52);
                                this.rdo.drawLine(n55, 54, n56, 54);
                                if (n > n55 + 216 && n < n56 + 216 && n2 > 152 && n2 < 166) {
                                    this.cur = 12;
                                    if (b) {
                                        this.tab = 1;
                                        if (!this.proname.equals(this.cd.createdby[19 + this.cd.haltload])) {
                                            this.proname = this.cd.createdby[19 + this.cd.haltload];
                                            this.loadedp = false;
                                            this.onexitpro();
                                        }
                                    }
                                }
                                String str8 = "Class C";
                                if (this.cd.cclass[35 + this.cd.haltload] == 1) {
                                    str8 = "Class B&C";
                                }
                                if (this.cd.cclass[35 + this.cd.haltload] == 2) {
                                    str8 = "Class B";
                                }
                                if (this.cd.cclass[35 + this.cd.haltload] == 3) {
                                    str8 = "Class A&B";
                                }
                                if (this.cd.cclass[35 + this.cd.haltload] == 4) {
                                    str8 = "Class A";
                                }
                                this.rdo.drawString(str8, 389 - this.ftm.stringWidth(str8) / 2, 45);
                                if ((n28 != -1 || this.cd.createdby[19 + this.cd.haltload].toLowerCase().equals(this.xt.nickname.toLowerCase())) && this.stringbutton(this.rdo, " Remove X ", 466, 45, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                                    this.loadedcars = 10;
                                }
                                this.m.crs = true;
                                this.m.focus_point = 400;
                                this.m.x = -335;
                                this.m.y = 0;
                                this.m.z = -50;
                                this.m.xz = 0;
                                this.m.zy = 20;
                                this.m.ground = -2000;
                                this.m.cx = 280;
                                this.m.cy = 150;
                                this.bco[35 + this.cd.haltload].z = 1000;
                                this.bco[35 + this.cd.haltload].y = 480 - this.bco[35 + this.cd.haltload].grat;
                                this.bco[35 + this.cd.haltload].x = -52;
                                this.bco[35 + this.cd.haltload].zy = 0;
                                this.bco[35 + this.cd.haltload].xz = this.mrot;
                                this.mrot -= 5;
                                if (this.mrot < -360) {
                                    this.mrot += 360;
                                }
                                this.bco[35 + this.cd.haltload].xy = 0;
                                final ContO contO = this.bco[35 + this.cd.haltload];
                                contO.wzy -= 10;
                                if (this.bco[35 + this.cd.haltload].wzy < -45) {
                                    final ContO contO2 = this.bco[35 + this.cd.haltload];
                                    contO2.wzy += 45;
                                }
                                this.rdo.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
                                this.bco[35 + this.cd.haltload].d(this.rdo);
                                this.rdo.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                                this.m.cx = 400;
                                this.m.cy = 225;
                                int n57 = 137;
                                if (this.xt.sc[0] == 35 + this.cd.haltload) {
                                    n57 = 255;
                                }
                                if (this.gs.clcars.getSelectedIndex() != this.gs.clcars.no - 1 && this.stringbutton(this.rdo, " Next > ", 476, n57, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                                    final Smenu clcars3 = this.gs.clcars;
                                    ++clcars3.sel;
                                }
                                if (this.gs.clcars.getSelectedIndex() != 1 && this.stringbutton(this.rdo, " < Prev ", 84, n57, -3, n, n2, b && !this.gs.openm, 216, 112)) {
                                    final Smenu clcars4 = this.gs.clcars;
                                    --clcars4.sel;
                                }
                                if (this.xt.sc[0] != 35 + this.cd.haltload || n < 256 || n > 736 || n2 < 132 || n2 > 377) {
                                    this.rdo.setFont(new Font("Arial", 1, 11));
                                    this.ftm = this.rdo.getFontMetrics();
                                    this.rdo.setColor(new Color(0, 0, 0));
                                    final int n58 = -36;
                                    final int n59 = -181;
                                    final int n60 = -155;
                                    this.rdo.drawString("Top Speed:", 98 + n58, 343 + n60);
                                    this.rdo.drawImage(this.xt.statb, 162 + n58, 337 + n60, null);
                                    this.rdo.drawString("Acceleration:", 88 + n58, 358 + n60);
                                    this.rdo.drawImage(this.xt.statb, 162 + n58, 352 + n60, null);
                                    this.rdo.drawString("Handling:", 110 + n58, 373 + n60);
                                    this.rdo.drawImage(this.xt.statb, 162 + n58, 367 + n60, null);
                                    this.rdo.drawString("Stunts:", 495 + n59, 343 + n60);
                                    this.rdo.drawImage(this.xt.statb, 536 + n59, 337 + n60, null);
                                    this.rdo.drawString("Strength:", 483 + n59, 358 + n60);
                                    this.rdo.drawImage(this.xt.statb, 536 + n59, 352 + n60, null);
                                    this.rdo.drawString("Endurance:", 473 + n59, 373 + n60);
                                    this.rdo.drawImage(this.xt.statb, 536 + n59, 367 + n60, null);
                                    this.rdo.setColor(new Color(0, 0, 0));
                                    float n61 = (this.cd.swits[35 + this.cd.haltload][2] - 220) / 90.0f;
                                    if (n61 < 0.2) {
                                        n61 = 0.2f;
                                    }
                                    this.rdo.fillRect((int)(162.0f + 156.0f * n61) + n58, 337 + n60, (int)(156.0f * (1.0f - n61) + 1.0f), 7);
                                    float n62 = this.cd.acelf[35 + this.cd.haltload][1] * this.cd.acelf[35 + this.cd.haltload][0] * this.cd.acelf[35 + this.cd.haltload][2] * this.cd.grip[35 + this.cd.haltload] / 7700.0f;
                                    if (n62 > 1.0f) {
                                        n62 = 1.0f;
                                    }
                                    this.rdo.fillRect((int)(162.0f + 156.0f * n62) + n58, 352 + n60, (int)(156.0f * (1.0f - n62) + 1.0f), 7);
                                    final float n63 = this.cd.dishandle[35 + this.cd.haltload];
                                    this.rdo.fillRect((int)(162.0f + 156.0f * n63) + n58, 367 + n60, (int)(156.0f * (1.0f - n63) + 1.0f), 7);
                                    float n64 = (this.cd.airc[35 + this.cd.haltload] * this.cd.airs[35 + this.cd.haltload] * this.cd.bounce[35 + this.cd.haltload] + 28.0f) / 139.0f;
                                    if (n64 > 1.0f) {
                                        n64 = 1.0f;
                                    }
                                    this.rdo.fillRect((int)(536.0f + 156.0f * n64) + n59, 337 + n60, (int)(156.0f * (1.0f - n64) + 1.0f), 7);
                                    float n65 = (this.cd.moment[35 + this.cd.haltload] + 0.5f) / 2.6f;
                                    if (n65 > 1.0f) {
                                        n65 = 1.0f;
                                    }
                                    this.rdo.fillRect((int)(536.0f + 156.0f * n65) + n59, 352 + n60, (int)(156.0f * (1.0f - n65) + 1.0f), 7);
                                    final float n66 = this.cd.outdam[35 + this.cd.haltload];
                                    this.rdo.fillRect((int)(536.0f + 156.0f * n66) + n59, 367 + n60, (int)(156.0f * (1.0f - n66) + 1.0f), 7);
                                    this.rdo.drawImage(this.xt.statbo, 162 + n58, 337 + n60, null);
                                    this.rdo.drawImage(this.xt.statbo, 162 + n58, 352 + n60, null);
                                    this.rdo.drawImage(this.xt.statbo, 162 + n58, 367 + n60, null);
                                    this.rdo.drawImage(this.xt.statbo, 536 + n59, 337 + n60, null);
                                    this.rdo.drawImage(this.xt.statbo, 536 + n59, 352 + n60, null);
                                    this.rdo.drawImage(this.xt.statbo, 536 + n59, 367 + n60, null);
                                }
                                else {
                                    final int n67 = -20;
                                    final int n68 = -220;
                                    this.rdo.setFont(new Font("Arial", 1, 10));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rdo.drawString("Hue  | ", 97 + n67, 70);
                                    this.rdo.drawImage(this.xt.brt, 137 + n67, 63, null);
                                    this.rdo.drawString("Intensity", 121 + n67, 219);
                                    this.rdo.drawString("Hue  | ", 647 + n68, 70);
                                    this.rdo.drawImage(this.xt.brt, 687 + n68, 63, null);
                                    this.rdo.drawString("Intensity", 671 + n68, 219);
                                    for (int n69 = 0; n69 < 161; ++n69) {
                                        this.rdo.setColor(Color.getHSBColor((float)((float)n69 * 0.00625), 1.0f, 1.0f));
                                        this.rdo.drawLine(102 + n67, 75 + n69, 110 + n67, 75 + n69);
                                        if (n69 <= 128) {
                                            this.rdo.setColor(Color.getHSBColor(1.0f, 0.0f, (float)(1.0 - (float)n69 * 0.00625)));
                                            this.rdo.drawLine(137 + n67, 75 + n69, 145 + n67, 75 + n69);
                                        }
                                        this.rdo.setColor(Color.getHSBColor((float)((float)n69 * 0.00625), 1.0f, 1.0f));
                                        this.rdo.drawLine(652 + n68, 75 + n69, 660 + n68, 75 + n69);
                                        if (n69 <= 128) {
                                            this.rdo.setColor(Color.getHSBColor(1.0f, 0.0f, (float)(1.0 - (float)n69 * 0.00625)));
                                            this.rdo.drawLine(687 + n68, 75 + n69, 695 + n68, 75 + n69);
                                        }
                                    }
                                    for (int n70 = 0; n70 < 40; ++n70) {
                                        this.rdo.setColor(Color.getHSBColor(this.xt.arnp[0], (float)((float)n70 * 0.025), 1.0f - this.xt.arnp[2]));
                                        this.rdo.drawLine(121 + n70 + n67, 224, 121 + n70 + n67, 230);
                                        this.rdo.setColor(Color.getHSBColor(this.xt.arnp[3], (float)((float)n70 * 0.025), 1.0f - this.xt.arnp[5]));
                                        this.rdo.drawLine(671 + n70 + n68, 224, 671 + n70 + n68, 230);
                                    }
                                    this.rdo.drawImage(this.xt.arn, 110 + n67, 71 + (int)(this.xt.arnp[0] * 160.0f), null);
                                    this.rdo.drawImage(this.xt.arn, 145 + n67, 71 + (int)(this.xt.arnp[2] * 160.0f), null);
                                    this.rdo.drawImage(this.xt.arn, 660 + n68, 71 + (int)(this.xt.arnp[3] * 160.0f), null);
                                    this.rdo.drawImage(this.xt.arn, 695 + n68, 71 + (int)(this.xt.arnp[5] * 160.0f), null);
                                    this.rdo.setColor(new Color(0, 0, 0));
                                    this.rdo.fillRect(120 + n67 + (int)(this.xt.arnp[1] * 40.0f), 222, 3, 3);
                                    this.rdo.drawLine(121 + n67 + (int)(this.xt.arnp[1] * 40.0f), 224, 121 + n67 + (int)(this.xt.arnp[1] * 40.0f), 230);
                                    this.rdo.fillRect(120 + n67 + (int)(this.xt.arnp[1] * 40.0f), 230, 3, 3);
                                    this.rdo.fillRect(670 + n68 + (int)(this.xt.arnp[4] * 40.0f), 222, 3, 3);
                                    this.rdo.drawLine(671 + n68 + (int)(this.xt.arnp[4] * 40.0f), 224, 671 + n68 + (int)(this.xt.arnp[4] * 40.0f), 230);
                                    this.rdo.fillRect(670 + n68 + (int)(this.xt.arnp[4] * 40.0f), 230, 3, 3);
                                    if (b) {
                                        if (this.mouson == -1) {
                                            this.mouson = -2;
                                            if (n > 335 + n67 && n < 379 + n67 && n2 > 334 && n2 < 344) {
                                                this.mouson = 1;
                                            }
                                            if (n > 885 + n68 && n < 929 + n68 && n2 > 334 && n2 < 344) {
                                                this.mouson = 4;
                                            }
                                            if (n > 314 + n67 && n < 338 + n67 && n2 > 181 && n2 < 353 && this.mouson == -2) {
                                                this.mouson = 0;
                                            }
                                            if (n > 349 + n67 && n < 373 + n67 && n2 > 181 && n2 < 321 && this.mouson == -2) {
                                                this.mouson = 2;
                                            }
                                            if (n > 864 + n68 && n < 888 + n68 && n2 > 181 && n2 < 353 && this.mouson == -2) {
                                                this.mouson = 3;
                                            }
                                            if (n > 899 + n68 && n < 923 + n68 && n2 > 181 && n2 < 321 && this.mouson == -2) {
                                                this.mouson = 5;
                                            }
                                        }
                                    }
                                    else if (this.mouson != -1) {
                                        this.mouson = -1;
                                    }
                                    if (this.mouson >= 0 && this.mouson <= 5) {
                                        this.blocknote = 20;
                                    }
                                    if (this.mouson == 0 || this.mouson == 2 || this.mouson == 3 || this.mouson == 5) {
                                        this.xt.arnp[this.mouson] = (float)((n2 - 187.0f) * 0.00625);
                                        if (this.mouson == 2 || this.mouson == 5) {
                                            if (this.xt.arnp[this.mouson] > 0.8) {
                                                this.xt.arnp[this.mouson] = 0.8f;
                                            }
                                        }
                                        else if (this.xt.arnp[this.mouson] > 1.0f) {
                                            this.xt.arnp[this.mouson] = 1.0f;
                                        }
                                        if (this.xt.arnp[this.mouson] < 0.0f) {
                                            this.xt.arnp[this.mouson] = 0.0f;
                                        }
                                    }
                                    if (this.mouson == 1) {
                                        this.xt.arnp[this.mouson] = (float)((n - (float)(337 + n67)) * 0.025);
                                        if (this.xt.arnp[this.mouson] > 1.0f) {
                                            this.xt.arnp[this.mouson] = 1.0f;
                                        }
                                        if (this.xt.arnp[this.mouson] < 0.0f) {
                                            this.xt.arnp[this.mouson] = 0.0f;
                                        }
                                    }
                                    if (this.mouson == 4) {
                                        this.xt.arnp[this.mouson] = (float)((n - (float)(887 + n68)) * 0.025);
                                        if (this.xt.arnp[this.mouson] > 1.0f) {
                                            this.xt.arnp[this.mouson] = 1.0f;
                                        }
                                        if (this.xt.arnp[this.mouson] < 0.0f) {
                                            this.xt.arnp[this.mouson] = 0.0f;
                                        }
                                    }
                                    final Color hsbColor = Color.getHSBColor(this.xt.arnp[0], this.xt.arnp[1], 1.0f - this.xt.arnp[2]);
                                    final Color hsbColor2 = Color.getHSBColor(this.xt.arnp[3], this.xt.arnp[4], 1.0f - this.xt.arnp[5]);
                                    for (int n71 = 0; n71 < this.bco[36].npl; ++n71) {
                                        if (this.bco[36].p[n71].colnum == 1) {
                                            this.bco[36].p[n71].hsb[0] = this.xt.arnp[0];
                                            this.bco[36].p[n71].hsb[1] = this.xt.arnp[1];
                                            this.bco[36].p[n71].hsb[2] = 1.0f - this.xt.arnp[2];
                                            this.bco[36].p[n71].c[0] = hsbColor.getRed();
                                            this.bco[36].p[n71].c[1] = hsbColor.getGreen();
                                            this.bco[36].p[n71].c[2] = hsbColor.getBlue();
                                            this.bco[36].p[n71].oc[0] = hsbColor.getRed();
                                            this.bco[36].p[n71].oc[1] = hsbColor.getGreen();
                                            this.bco[36].p[n71].oc[2] = hsbColor.getBlue();
                                        }
                                        if (this.bco[36].p[n71].colnum == 2) {
                                            this.bco[36].p[n71].hsb[0] = this.xt.arnp[3];
                                            this.bco[36].p[n71].hsb[1] = this.xt.arnp[4];
                                            this.bco[36].p[n71].hsb[2] = 1.0f - this.xt.arnp[5];
                                            this.bco[36].p[n71].c[0] = hsbColor2.getRed();
                                            this.bco[36].p[n71].c[1] = hsbColor2.getGreen();
                                            this.bco[36].p[n71].c[2] = hsbColor2.getBlue();
                                            this.bco[36].p[n71].oc[0] = hsbColor2.getRed();
                                            this.bco[36].p[n71].oc[1] = hsbColor2.getGreen();
                                            this.bco[36].p[n71].oc[2] = hsbColor2.getBlue();
                                        }
                                    }
                                    if (this.stringbutton(this.rdo, "    Play >    ", 280, 220, -1, n, n2, b && !this.gs.openm, 216, 112)) {
                                        this.open = 450;
                                        this.upo = false;
                                        this.domon = false;
                                        this.onexit();
                                    }
                                }
                                if (this.xt.clan.toLowerCase().equals(this.claname.toLowerCase())) {
                                    if (this.xt.sc[0] != 36) {
                                        if (this.stringbutton(this.rdo, "     Switch to using clan cars     ", 280, 250, -2, n, n2, b && !this.gs.openm, 216, 112)) {
                                            this.xt.sc[0] = 36;
                                            for (int n72 = 0, n73 = 0; n73 < this.bco[36].npl && n72 == 0; ++n73) {
                                                if (this.bco[36].p[n73].colnum == 1) {
                                                    final float[] hsbvals = new float[3];
                                                    Color.RGBtoHSB(this.bco[36].p[n73].c[0], this.bco[36].p[n73].c[1], this.bco[36].p[n73].c[2], hsbvals);
                                                    this.xt.arnp[0] = hsbvals[0];
                                                    this.xt.arnp[1] = hsbvals[1];
                                                    this.xt.arnp[2] = 1.0f - hsbvals[2];
                                                    n72 = 1;
                                                }
                                            }
                                            for (int n74 = 0, n75 = 0; n75 < this.bco[36].npl && n74 == 0; ++n75) {
                                                if (this.bco[36].p[n75].colnum == 2) {
                                                    final float[] hsbvals2 = new float[3];
                                                    Color.RGBtoHSB(this.bco[36].p[n75].c[0], this.bco[36].p[n75].c[1], this.bco[36].p[n75].c[2], hsbvals2);
                                                    this.xt.arnp[3] = hsbvals2[0];
                                                    this.xt.arnp[4] = hsbvals2[1];
                                                    this.xt.arnp[5] = 1.0f - hsbvals2[2];
                                                    n74 = 1;
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        this.rdo.setFont(new Font("Arial", 1, 12));
                                        this.ftm = this.rdo.getFontMetrics();
                                        this.rdo.setColor(new Color(0, 0, 0));
                                        this.rdo.drawString("You are currently using your clan's cars.", 280 - this.ftm.stringWidth("You are currently using your clan's cars.") / 2, 250);
                                    }
                                }
                                if (this.cd.publish[19 + this.cd.haltload] > 0) {
                                    this.rd.setFont(new Font("Arial", 1, 12));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.setColor(new Color(0, 0, 0));
                                    if (this.cd.action == -9) {
                                        this.rd.drawString("Failed to add car!  Unknown error, please try again later.", 496 - this.ftm.stringWidth("Failed to add car!  Unknown error, please try again later.") / 2, 432);
                                    }
                                    if (this.cd.action == -8) {
                                        this.rd.drawString("Cannot add more then 20 cars to your account!", 496 - this.ftm.stringWidth("Cannot add more then 20 cars to your account!") / 2, 432);
                                    }
                                    if (this.cd.action == 7) {
                                        this.rd.drawString("[" + this.cd.acname + "] has been added to your cars!", 496 - this.ftm.stringWidth("[" + this.cd.acname + "] has been added to your cars!") / 2, 432);
                                    }
                                    if (this.cd.action == -7) {
                                        this.rd.drawString("You already have this car.", 496 - this.ftm.stringWidth("You already have this car.") / 2, 432);
                                    }
                                    if (this.cd.action == 6) {
                                        this.rd.drawString("Adding Car...", 496 - this.ftm.stringWidth("Adding Car...") / 2, 432);
                                    }
                                    if (this.cd.action == -6) {
                                        final String s3 = "Upgrade to a full account to add custom cars!";
                                        final int n76 = 496 - this.ftm.stringWidth(s3) / 2;
                                        final int n77 = n76 + this.ftm.stringWidth(s3);
                                        this.rd.drawString(s3, n76, 432);
                                        if (this.waitlink != -1) {
                                            this.rd.drawLine(n76, 435, n77, 435);
                                        }
                                        if (n > n76 && n < n77 && n2 > 421 && n2 < 435) {
                                            if (this.waitlink != -1) {
                                                this.cur = 12;
                                            }
                                            if (b && this.waitlink == 0) {
                                                this.gs.editlink(this.xt.nickname, true);
                                                this.waitlink = -1;
                                            }
                                        }
                                        if (this.waitlink > 0) {
                                            --this.waitlink;
                                        }
                                    }
                                    if (this.cd.action == 0 && this.xt.drawcarb(true, null, " Add to My Cars ", 437, 414, n, n2, b && this.blocknote == 0)) {
                                        if (this.xt.logged) {
                                            this.cd.action = 6;
                                            this.cd.ac = -1;
                                            this.cd.acname = this.selcar;
                                            this.cd.sparkactionloader();
                                        }
                                        else {
                                            this.cd.action = -6;
                                            this.waitlink = 20;
                                        }
                                    }
                                }
                                else {
                                    this.rd.setFont(new Font("Arial", 1, 12));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.setColor(new Color(0, 0, 0));
                                    this.rd.drawString("Private Car", 496 - this.ftm.stringWidth("Private Car") / 2, 432);
                                }
                            }
                            if (this.loadedcar == 0) {
                                this.rdo.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rdo.getFontMetrics();
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.drawString("Loading...", 280 - this.ftm.stringWidth("Loading...") / 2, 125);
                            }
                            if (this.loadedcar == -1) {
                                this.rdo.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rdo.getFontMetrics();
                                this.rdo.setColor(new Color(0, 0, 0));
                                this.rdo.drawString("Error loading car, try again later...", 280 - this.ftm.stringWidth("Error loading car, try again later...") / 2, 125);
                            }
                        }
                    }
                    if (this.loadedcars != 1 && this.loadedcars != 5 && this.gs.clcars.isShowing()) {
                        this.gs.clcars.hide();
                    }
                    if (this.xt.clan.toLowerCase().equals(this.claname.toLowerCase())) {
                        if (this.loadedcars >= 0 && this.loadedcars < 2 && this.stringbutton(this.rdo, "     Add a car of yours to the clan's cars     ", 280, 286, -2, n, n2, b && !this.gs.openm, 216, 112)) {
                            this.loadedcars = 2;
                            this.perry = "0 %";
                        }
                    }
                    else if (this.loadedcars == 1 && !this.selcar.equals("Select Car") && this.loadedcar > 0 && this.stringbutton(this.rdo, "     Battle with clan over this car!     ", 280, 286, -2, n, n2, b && !this.gs.openm, 216, 112)) {
                        this.tab = 2;
                        this.itab = 1;
                        this.litab = -1;
                        this.openi = 10;
                        if (!this.intclan.equals(this.claname)) {
                            this.intclan = this.claname;
                            this.dispi = 0;
                            this.nil = 0;
                            this.lastint = "";
                            this.readint = 1;
                        }
                        this.redif = true;
                        this.intsel = 3;
                    }
                }
                if (this.ctab != 2 && this.ctab != 3 && this.gs.clcars.isShowing()) {
                    this.gs.clcars.hide();
                }
                if (this.ctab == 4) {
                    boolean b8 = false;
                    if (n > 266 && n < 726 && n2 > 162 && n2 < 223 && this.editc == 0) {
                        b8 = true;
                    }
                    this.rdo.setComposite(AlphaComposite.getInstance(3, 0.7f));
                    this.rdo.setColor(new Color(255, 255, 255));
                    this.rdo.fillRoundRect(50, 50, 460, 61, 20, 20);
                    this.rdo.setColor(new Color(0, 0, 0));
                    this.rdo.drawRoundRect(50, 50, 460, 61, 20, 20);
                    this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
                    if (this.loadedlink) {
                        if (n28 != -1 && b8) {
                            this.rdo.setFont(new Font("Arial", 1, 11));
                            this.ftm = this.rdo.getFontMetrics();
                            this.rdo.drawString("Edit", 480, 66);
                            this.rdo.drawLine(480, 68, 480 + this.ftm.stringWidth("Edit"), 68);
                            if (n > 696 && n < 696 + this.ftm.stringWidth("Edit") && n2 > 166 && n2 < 181 && this.editc == 0) {
                                this.cur = 12;
                                if (b) {
                                    this.editc = 6;
                                    this.msg = "Edit Clan's Web Presence";
                                    this.flko = 0;
                                    b = false;
                                }
                            }
                        }
                        if (!this.ltit.equals("") && !this.lurl.equals("")) {
                            this.rdo.setFont(new Font("Arial", 1, 13));
                            this.ftm = this.rdo.getFontMetrics();
                            this.rdo.drawString(this.ltit, 70, 74);
                            if (b8) {
                                this.rdo.drawLine(70, 76, 70 + this.ftm.stringWidth(this.ltit), 76);
                            }
                            this.rdo.setFont(new Font("Arial", 0, 12));
                            this.ftm = this.rdo.getFontMetrics();
                            this.rdo.drawString(this.ldes, 70, 94);
                            if (b8 && this.editc == 0) {
                                this.cur = 12;
                                if (b) {
                                    this.gs.openurl(this.lurl);
                                }
                            }
                        }
                        else {
                            this.rdo.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rdo.getFontMetrics();
                            this.rdo.drawString("" + this.claname + " has no external online presence.", 280 - this.ftm.stringWidth("" + this.claname + " has no external online presence.") / 2, 85);
                        }
                    }
                    else {
                        this.rdo.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rdo.getFontMetrics();
                        this.rdo.drawString("Loading...", 280 - this.ftm.stringWidth("Loading...") / 2, 85);
                    }
                }
                if (this.sdist != 0) {
                    this.rdo.setColor(this.color2k(200, 200, 200));
                    this.rdo.fillRect(540, 20, 17, 260);
                    if (this.mscro5 == 831) {
                        this.rdo.setColor(this.color2k(215, 215, 215));
                        this.rdo.fillRect(540, 3, 17, 17);
                    }
                    else {
                        this.rdo.setColor(this.color2k(220, 220, 220));
                        this.rdo.fill3DRect(540, 3, 17, 17, true);
                    }
                    this.rdo.drawImage(this.xt.asu, 545, 9, null);
                    if (this.mscro5 == 832) {
                        this.rdo.setColor(this.color2k(215, 215, 215));
                        this.rdo.fillRect(540, 280, 17, 17);
                    }
                    else {
                        this.rdo.setColor(this.color2k(220, 220, 220));
                        this.rdo.fill3DRect(540, 280, 17, 17, true);
                    }
                    this.rdo.drawImage(this.xt.asd, 545, 287, null);
                    if (this.lspos5 != this.spos5) {
                        this.rdo.setColor(this.color2k(215, 215, 215));
                        this.rdo.fillRect(540, 20 + this.spos5, 17, 31);
                    }
                    else {
                        if (this.mscro5 == 831) {
                            this.rdo.setColor(this.color2k(215, 215, 215));
                        }
                        this.rdo.fill3DRect(540, 20 + this.spos5, 17, 31, true);
                    }
                    this.rdo.setColor(this.color2k(150, 150, 150));
                    this.rdo.drawLine(545, 33 + this.spos5, 551, 33 + this.spos5);
                    this.rdo.drawLine(545, 35 + this.spos5, 551, 35 + this.spos5);
                    this.rdo.drawLine(545, 37 + this.spos5, 551, 37 + this.spos5);
                    if (this.mscro5 > 800 && this.lspos5 != this.spos5) {
                        this.lspos5 = this.spos5;
                    }
                    if (b) {
                        if (this.mscro5 == 825 && n > 756 && n < 773 && n2 > 132 + this.spos5 && n2 < this.spos5 + 163) {
                            this.mscro5 = n2 - this.spos5;
                        }
                        if (this.mscro5 == 825 && n > 754 && n < 775 && n2 > 26 && n2 < 134) {
                            this.mscro5 = 831;
                        }
                        if (this.mscro5 == 825 && n > 754 && n < 775 && n2 > 390 && n2 < 411) {
                            this.mscro5 = 832;
                        }
                        if (this.mscro5 == 825 && n > 756 && n < 773 && n2 > 132 && n2 < 392) {
                            this.mscro5 = 152;
                            this.spos5 = n2 - this.mscro5;
                        }
                        int n78 = 2670 / this.sdist;
                        if (n78 < 1) {
                            n78 = 1;
                        }
                        if (this.mscro5 == 831) {
                            this.spos5 -= n78;
                            if (this.spos5 > 229) {
                                this.spos5 = 229;
                            }
                            if (this.spos5 < 0) {
                                this.spos5 = 0;
                            }
                            this.lspos5 = this.spos5;
                        }
                        if (this.mscro5 == 832) {
                            this.spos5 += n78;
                            if (this.spos5 > 229) {
                                this.spos5 = 229;
                            }
                            if (this.spos5 < 0) {
                                this.spos5 = 0;
                            }
                            this.lspos5 = this.spos5;
                        }
                        if (this.mscro5 < 800) {
                            this.spos5 = n2 - this.mscro5;
                            if (this.spos5 > 229) {
                                this.spos5 = 229;
                            }
                            if (this.spos5 < 0) {
                                this.spos5 = 0;
                            }
                        }
                        if (this.mscro5 == 825) {
                            this.mscro5 = 925;
                        }
                    }
                    else if (this.mscro5 != 825) {
                        this.mscro5 = 825;
                    }
                }
                this.rd.drawImage(this.gImage, 216, 112, null);
                if (this.ctab != 2 && this.ctab != 3 && this.xt.clan.equals("")) {
                    boolean b9 = false;
                    for (int n79 = 0; n79 < this.nmb; ++n79) {
                        if (this.xt.nickname.toLowerCase().equals(this.member[n79].toLowerCase())) {
                            b9 = true;
                            break;
                        }
                    }
                    if (!b9) {
                        boolean b10 = false;
                        for (int n80 = 0; n80 < this.nrmb; ++n80) {
                            if (this.xt.nickname.toLowerCase().equals(this.rmember[n80].toLowerCase())) {
                                b10 = true;
                                break;
                            }
                        }
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        if (!b10) {
                            if (this.stringbutton(this.rd, "      Request to Join this Clan      ", 496, 432, 3, n, n2, b && !this.gs.openm, 0, 0)) {
                                if (this.xt.logged) {
                                    this.editc = 99;
                                }
                                else {
                                    this.editc = 101;
                                }
                            }
                            final int stringWidth11 = this.ftm.stringWidth("      Request to Join this Clan      ");
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.drawRoundRect(496 - stringWidth11 / 2 - 20, 415, stringWidth11 + 40, 24, 20, 20);
                        }
                        else {
                            final int stringWidth12 = this.ftm.stringWidth("You have requested to join this clan, waiting for admin to approve your membership.");
                            this.rd.drawString("You have requested to join this clan, waiting for admin to approve your membership.", 496 - stringWidth12 / 2, 432);
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.drawRoundRect(496 - stringWidth12 / 2 - 20, 415, stringWidth12 + 40, 24, 20, 20);
                        }
                    }
                }
                if (this.editc == 1 || this.editc == 2) {
                    this.rd.setColor(new Color(244, 232, 204));
                    this.rd.fillRoundRect(265, 92, 460, 220, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(265, 92, 460, 220, 20, 20);
                    final String[] array11 = { "logo", "350x30", "35 : 3" };
                    if (this.editc == 2) {
                        array11[0] = "background";
                        array11[1] = "560x300";
                        array11[2] = "56 : 30";
                    }
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    if (this.flko % 4 != 0 || this.flko == 0) {
                        this.rd.drawString(this.msg, 495 - this.ftm.stringWidth(this.msg) / 2, 115);
                    }
                    if (this.flko != 0) {
                        --this.flko;
                    }
                    this.rd.setFont(new Font("Arial", 0, 12));
                    this.rd.drawString("The " + array11[0] + " image is " + array11[1] + " pixels.", 275, 140);
                    this.rd.drawString("Any image uploaded will be resized to that width and height. For the best results", 275, 160);
                    this.rd.drawString("try to upload an image that is bigger or equal to " + array11[1] + " and has the scale of", 275, 180);
                    this.rd.drawString("[ " + array11[2] + " ]  in  [ Width : Height ].", 275, 200);
                    this.rd.drawString("Image uploaded must be less than 1MB and in the format of JPEG, GIF or PNG.", 275, 220);
                    if (this.upload == 0) {
                        if (this.stringbutton(this.rd, "  Upload Image  ", 495, 250, 0, n, n2, b, 0, 0)) {
                            final FileDialog fileDialog = new FileDialog(new Frame(), "Upload Image");
                            fileDialog.setMode(0);
                            fileDialog.setVisible(true);
                            this.filename = "" + fileDialog.getDirectory() + "" + fileDialog.getFile() + "";
                            if (!this.filename.equals("nullnull")) {
                                this.upload = 1;
                            }
                        }
                    }
                    else {
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        if (this.upload == 1) {
                            this.rd.drawString("Checking image...", 495 - this.ftm.stringWidth("Checking image...") / 2, 250);
                        }
                        if (this.upload == 2) {
                            this.rd.drawString("Authenticating...", 495 - this.ftm.stringWidth("Authenticating...") / 2, 250);
                        }
                        if (this.upload == 3) {
                            this.rd.drawString("Uploading image :  " + this.perc + " %", 495 - this.ftm.stringWidth("Uploading image :  80 %") / 2, 250);
                        }
                        if (this.upload == 4) {
                            this.rd.drawString("Creating image online...", 495 - this.ftm.stringWidth("Creating image online...") / 2, 250);
                        }
                        if (this.upload == 5) {
                            this.rd.drawString("Done", 495 - this.ftm.stringWidth("Done") / 2, 250);
                        }
                    }
                    if (this.stringbutton(this.rd, " Cancel ", 495, 290, 2, n, n2, b, 0, 0)) {
                        if (this.upload == 0) {
                            this.editc = 0;
                        }
                        else {
                            this.upload = 0;
                        }
                    }
                }
                if (this.editc == 3) {
                    this.rd.setColor(new Color(244, 232, 204));
                    this.rd.fillRoundRect(245, 92, 500, 190, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(245, 92, 500, 190, 20, 20);
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    String string9 = "" + this.member[this.em] + "'s";
                    if (this.xt.nickname.toLowerCase().equals(this.member[this.em].toLowerCase())) {
                        string9 = "Your";
                    }
                    this.rd.drawString("Edit " + string9 + " Clan Membership", 495 - this.ftm.stringWidth("Edit " + string9 + "'s Clan Membership") / 2, 115);
                    this.rd.drawString("Rank Description :", 399 - this.ftm.stringWidth("Membership Level :"), 146);
                    this.dorank = true;
                    this.rd.drawString("Membership Level :", 503 - this.ftm.stringWidth("Membership Level :"), 176);
                    this.gs.clanlev.move(513, 159);
                    if (!this.gs.clanlev.isShowing()) {
                        this.gs.clanlev.select(this.mlevel[this.em] - 1);
                        if (this.em == 0 && this.mlevel[this.em] == 7) {
                            this.gs.clanlev.disable();
                        }
                        else {
                            this.gs.clanlev.enable();
                        }
                        this.gs.clanlev.show();
                    }
                    if (this.stringbutton(this.rd, "     Save     ", 495, 220, 0, n, n2, b, 0, 0)) {
                        this.gs.clanlev.hide();
                        this.editc = 33;
                    }
                    if (this.stringbutton(this.rd, " Cancel ", 495, 260, 2, n, n2, b, 0, 0)) {
                        this.editc = 0;
                        this.gs.clanlev.hide();
                    }
                }
                if (this.editc == 4) {
                    this.rd.setColor(new Color(244, 232, 204));
                    this.rd.fillRoundRect(220, 92, 550, 155, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(220, 92, 550, 155, 20, 20);
                    this.rd.setFont(new Font("Arial", 1, 13));
                    this.ftm = this.rd.getFontMetrics();
                    String string10 = "" + this.member[this.em] + "";
                    if (this.xt.nickname.toLowerCase().equals(this.member[this.em].toLowerCase())) {
                        string10 = "yourself";
                    }
                    this.rd.drawString("Are you sure you want to remove " + string10 + " from the clan?", 495 - this.ftm.stringWidth("Are you sure you want to remove " + string10 + " from the clan?") / 2, 120);
                    if (this.xt.nickname.toLowerCase().equals(this.member[this.em].toLowerCase()) && this.em == 0) {
                        this.rd.setFont(new Font("Arial", 0, 12));
                        this.ftm = this.rd.getFontMetrics();
                        if (this.nmb > 1) {
                            this.rd.drawString("Note: This will result in the second high ranking player (" + this.member[1] + ") becoming the new Clan Leader!", 495 - this.ftm.stringWidth("Note: This will result in the second high ranking player (" + this.member[1] + ") becoming the new Clan Leader!") / 2, 140);
                        }
                        else {
                            this.rd.drawString("Note: This will result in the deletion of this clan since you are the only player in it.", 495 - this.ftm.stringWidth("Note: This will result in the deletion of this clan since you are the only player in it.") / 2, 140);
                        }
                    }
                    if (this.stringbutton(this.rd, "     Yes     ", 495, 185, 0, n, n2, b, 0, 0)) {
                        this.editc = 44;
                    }
                    if (this.stringbutton(this.rd, " No, Cancel ", 495, 225, 2, n, n2, b, 0, 0)) {
                        this.editc = 0;
                    }
                }
                if (this.editc == 6) {
                    this.rd.setColor(new Color(244, 232, 204));
                    this.rd.fillRoundRect(245, 92, 500, 225, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(245, 92, 500, 225, 20, 20);
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    if (this.flko % 4 != 0 || this.flko == 0) {
                        this.rd.drawString(this.msg, 495 - this.ftm.stringWidth(this.msg) / 2, 115);
                    }
                    if (this.flko != 0) {
                        --this.flko;
                    }
                    this.rd.setFont(new Font("Arial", 0, 12));
                    this.rd.drawString("Does your clan have an online forum, a Facebook group, a website or any online", 255, 140);
                    this.rd.drawString("presence at all beyond the game?  If so, you can link to it from here!", 255, 160);
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("Link Title :", 400 - this.ftm.stringWidth("Link Title :"), 190);
                    this.rd.drawString("Link Description :", 400 - this.ftm.stringWidth("Link Description :"), 220);
                    this.doweb1 = true;
                    if (this.stringbutton(this.rd, "     Next >     ", 495, 255, 0, n, n2, b, 0, 0)) {
                        if (this.gs.temail.getText().equals("") || this.gs.cmsg.getText().equals("")) {
                            this.msg = "Please enter a link title and a link description!";
                            this.flko = 45;
                        }
                        else {
                            this.sltit = this.gs.temail.getText();
                            if (!this.lurl.equals("") && this.lurl.toLowerCase().startsWith("http")) {
                                this.gs.temail.setText(this.lurl);
                            }
                            else {
                                this.gs.temail.setText("http://");
                            }
                            this.msg = "Edit Clan's Web Presence";
                            this.flko = 0;
                            this.editc = 7;
                        }
                    }
                    if (this.stringbutton(this.rd, " Cancel ", 495, 295, 2, n, n2, b, 0, 0)) {
                        this.editc = 0;
                    }
                }
                if (this.editc == 7) {
                    this.rd.setColor(new Color(244, 232, 204));
                    this.rd.fillRoundRect(245, 92, 500, 225, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(245, 92, 500, 225, 20, 20);
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    if (this.flko % 4 != 0 || this.flko == 0) {
                        this.rd.drawString(this.msg, 495 - this.ftm.stringWidth(this.msg) / 2, 115);
                    }
                    if (this.flko != 0) {
                        --this.flko;
                    }
                    this.rd.drawString("Link URL :", 343 - this.ftm.stringWidth("Link URL :"), 150);
                    this.doweb2 = true;
                    this.rd.drawString("WARNING :", 255, 180);
                    this.rd.setFont(new Font("Arial", 0, 12));
                    this.rd.drawString("Any link placed that contains inappropriate, spam or unrelated content will result in", 255, 200);
                    this.rd.drawString("instant clan deletion and permanent account banning!", 255, 220);
                    if (this.stringbutton(this.rd, "     Save     ", 495, 255, 0, n, n2, b, 0, 0)) {
                        if (this.gs.temail.getText().equals("") || this.gs.temail.getText().equals("http://")) {
                            this.msg = "Please enter a link URL!";
                            this.flko = 45;
                        }
                        else {
                            this.editc = 55;
                        }
                    }
                    if (this.stringbutton(this.rd, " Cancel ", 495, 295, 2, n, n2, b, 0, 0)) {
                        this.editc = 0;
                    }
                }
                if (this.editc == 33 || this.editc == 44 || this.editc == 66 || this.editc == 77 || this.editc == 99 || this.editc == 55) {
                    this.rd.setColor(new Color(244, 232, 204));
                    this.rd.fillRoundRect(345, 92, 300, 40, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(345, 92, 300, 40, 20, 20);
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("One moment...", 495 - this.ftm.stringWidth("One moment...") / 2, 117);
                }
                if (this.editc == 5) {
                    this.rd.setColor(new Color(244, 232, 204));
                    this.rd.fillRoundRect(265, 92, 460, 115, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(265, 92, 460, 115, 20, 20);
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("Server error occurred or was unable to authorize this action.", 495 - this.ftm.stringWidth("Server error occurred or was unable to authorize this action.") / 2, 120);
                    this.rd.drawString("Please try again later.", 495 - this.ftm.stringWidth("Please try again later.") / 2, 150);
                    if (this.stringbutton(this.rd, "     OK     ", 495, 185, 2, n, n2, b, 0, 0)) {
                        this.editc = 0;
                    }
                }
                if (this.editc == 101) {
                    this.rd.setColor(new Color(244, 232, 204));
                    this.rd.fillRoundRect(232, 90, 527, 176, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(232, 90, 527, 176, 20, 20);
                    this.rd.setFont(new Font("Arial", 1, 13));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("You are currently using a trial account.", 495 - this.ftm.stringWidth("You are currently using a trial account.") / 2, 120);
                    this.rd.drawString("You need to upgrade to be able participate in any NFM clan activity.", 495 - this.ftm.stringWidth("You need to upgrade to be able participate in any NFM clan activity.") / 2, 140);
                    this.rd.setColor(new Color(206, 171, 98));
                    this.rd.fillRoundRect(405, 163, 180, 50, 20, 20);
                    if (this.drawbutton(this.xt.upgrade, 495, 188, n, n2, b)) {
                        this.gs.editlink(this.xt.nickname, true);
                    }
                    if (this.stringbutton(this.rd, " Cancel ", 495, 244, 2, n, n2, b, 0, 0)) {
                        this.editc = 0;
                    }
                }
            }
            else {
                this.rd.drawString("Loading clan: " + this.claname + ", please wait...", 495 - this.ftm.stringWidth("Loading clan: " + this.claname + ", please wait...") / 2, 222);
            }
        }
        else {
            if (this.gs.clcars.isShowing()) {
                this.gs.clcars.hide();
            }
            if (this.editc != 0) {
                this.editc = 0;
                if (this.gs.clanlev.isShowing()) {
                    this.gs.clanlev.hide();
                }
            }
        }
    }
    
    public void dotab2(final int n, final int n2, final boolean b) {
        if (this.itab == 0) {
            if (this.litab != this.itab) {
                this.spos3 = 0;
                this.gs.senditem.hide();
                this.gs.datat.hide();
                this.gs.sendtyp.removeAll();
                this.gs.sendtyp.add(this.rd, "Write a Message");
                this.gs.sendtyp.add(this.rd, "Share a Custom Car");
                this.gs.sendtyp.add(this.rd, "Share a Custom Stage");
                this.gs.sendtyp.add(this.rd, "Send a Clan Invitation");
                this.gs.sendtyp.add(this.rd, "Share a Relative Date");
                if (!this.forcsel) {
                    this.gs.sendtyp.select(0);
                }
                else {
                    this.gs.sendtyp.select(this.itemsel);
                }
                this.forcsel = false;
                this.flko = 0;
                this.itemsel = 0;
                this.flko = 0;
                this.litab = this.itab;
            }
            if (this.openc != 10) {
                this.rd.setColor(this.color2k(230, 230, 230));
                this.rd.fillRoundRect(197, 40, 597, 404, 20, 20);
                this.rd.setColor(new Color(0, 0, 0));
                this.rd.drawRoundRect(197, 40, 597, 404, 20, 20);
                if (this.loadmsgs != 0 && this.loadmsgs != -2 && this.loadmsgs != -1) {
                    this.sdist = (this.nm - 10) * 31;
                    if (this.sdist < 0) {
                        this.sdist = 0;
                    }
                    this.scro = (int)(this.spos3 / 268.0f * this.sdist);
                    int n3 = 0;
                    for (int i = 0; i < this.nm; ++i) {
                        if (this.mtyp[i] != 3) {
                            if (76 + 31 * n3 - this.scro < 408 && 107 + 31 * n3 - this.scro > 76) {
                                boolean b2 = false;
                                if (n > 207 && n < 770 && n2 > 76 + 31 * n3 - this.scro && n2 < 106 + 31 * n3 - this.scro) {
                                    b2 = true;
                                    this.cur = 12;
                                    if (b && this.openc == 0) {
                                        this.opy = 70 + 31 * n3 - this.scro;
                                        this.addopy = (40 - this.opy) / 10;
                                        this.oph = 44;
                                        this.openc = 1;
                                        if (!this.opname.equals(this.mname[i])) {
                                            this.opname = this.mname[i];
                                            this.lastsub = "";
                                            this.readmsg = 1;
                                        }
                                    }
                                }
                                if (this.mtyp[i] == 1) {
                                    this.rd.setColor(this.color2k(240, 240, 240));
                                    this.rd.fillRect(207, 77 + 31 * n3 - this.scro, 564, 30);
                                }
                                if (b2) {
                                    this.rd.setColor(this.color2k(250, 250, 250));
                                    this.rd.fillRect(207, 77 + 31 * n3 - this.scro, 564, 30);
                                }
                                final boolean drawl = this.drawl(this.rd, this.mname[i], 207, 77 + 31 * n3 - this.scro, b2);
                                if (!b2 || !drawl) {
                                    this.rd.setFont(new Font("Arial", 1, 12));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.setColor(new Color(0, 0, 0));
                                    this.rd.drawString(this.mname[i], 267 - this.ftm.stringWidth(this.mname[i]) / 2, 96 + 31 * n3 - this.scro);
                                }
                                final int[] array = { 0, 5, 5, 14, 14, 5, 5 };
                                final int[] array2 = { 0, -5, -2, -2, 3, 3, 5 };
                                if (this.mtyp[i] != 2) {
                                    for (int j = 0; j < 7; ++j) {
                                        final int[] array3 = array;
                                        final int n4 = j;
                                        array3[n4] += 335;
                                        final int[] array4 = array2;
                                        final int n5 = j;
                                        array4[n5] += 98 + 31 * n3 - this.scro;
                                    }
                                    this.rd.setColor(new Color(0, 128, 0));
                                }
                                else {
                                    for (int k = 0; k < 7; ++k) {
                                        array[k] = 349 - array[k];
                                        final int[] array5 = array2;
                                        final int n6 = k;
                                        array5[n6] += 98 + 31 * n3 - this.scro;
                                    }
                                    this.rd.setColor(new Color(0, 0, 128));
                                }
                                this.rd.fillPolygon(array, array2, 7);
                                this.rd.setFont(new Font("Tahoma", 0, 11));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.setColor(this.color2k(125, 125, 125));
                                this.rd.drawString(this.mtime[i], 760 - this.ftm.stringWidth(this.mtime[i]), 102 + 31 * n3 - this.scro);
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.drawString(this.msub[i], 335, 89 + 31 * n3 - this.scro);
                                this.rd.setColor(this.color2k(150, 150, 150));
                                this.rd.drawLine(207, 107 + 31 * n3 - this.scro, 770, 107 + 31 * n3 - this.scro);
                            }
                            ++n3;
                        }
                    }
                    for (int l = 0; l < this.nm; ++l) {
                        if (this.mtyp[l] == 3) {
                            if (76 + 31 * n3 - this.scro < 408 && 107 + 31 * n3 - this.scro > 76) {
                                this.rd.setFont(new Font("Arial", 1, 12));
                                this.ftm = this.rd.getFontMetrics();
                                boolean b3 = false;
                                if (n > 207 && n < 770 && n2 > 76 + 31 * n3 - this.scro && n2 < 106 + 31 * n3 - this.scro) {
                                    b3 = true;
                                }
                                final boolean drawl2 = this.drawl(this.rd, this.mname[l], 207, 77 + 31 * n3 - this.scro, b3);
                                if (!b3 || !drawl2) {
                                    this.rd.setColor(new Color(0, 0, 0));
                                    this.rd.drawString(this.mname[l], 267 - this.ftm.stringWidth(this.mname[l]) / 2, 96 + 31 * n3 - this.scro);
                                }
                                this.rd.setColor(this.color2k(100, 100, 100));
                                this.rd.fillRect(327, 77 + 31 * n3 - this.scro, 444, 30);
                                this.rd.setColor(this.color2k(200, 200, 200));
                                if (this.unblockname.equals("")) {
                                    this.rd.drawString("Blocked", 337, 96 + 31 * n3 - this.scro);
                                }
                                else {
                                    this.rd.drawString("Unblocking...", 337, 96 + 31 * n3 - this.scro);
                                }
                                if (b3 && this.stringbutton(this.rd, "   Unblock  ", 724, 96 + 31 * n3 - this.scro, 3, n, n2, b, 0, 0) && this.unblockname.equals("")) {
                                    this.unblockname = this.mname[l];
                                }
                                this.rd.setColor(this.color2k(150, 150, 150));
                                this.rd.drawLine(207, 107 + 31 * n3 - this.scro, 770, 107 + 31 * n3 - this.scro);
                            }
                            ++n3;
                        }
                    }
                    this.rd.setColor(this.color2k(205, 205, 205));
                    this.rd.fillRect(207, 46, 582, 30);
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    final String[] array6 = { "Player Interaction", "Clan Interaction", "Your Clan's Discussion" };
                    final int[] array7 = { 207, 390, 368, 207 };
                    final int[] array8 = { 73, 73, 51, 51 };
                    for (int itab = 0; itab < 3; ++itab) {
                        if (this.itab == itab) {
                            this.rd.setColor(this.color2k(230, 230, 230));
                            this.rd.fillPolygon(array7, array8, 4);
                        }
                        else if (n > array7[0] && n < array7[2] && n2 > 51 && n2 < 73) {
                            this.rd.setColor(this.color2k(217, 217, 217));
                            this.rd.fillPolygon(array7, array8, 4);
                            if (b) {
                                this.itab = itab;
                            }
                        }
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawPolygon(array7, array8, 4);
                        this.rd.setColor(this.color2k(40, 40, 40));
                        this.rd.drawString(array6[itab], array7[0] + 80 - this.ftm.stringWidth(array6[itab]) / 2, 67);
                        for (int n7 = 0; n7 < 4; ++n7) {
                            final int[] array9 = array7;
                            final int n8 = n7;
                            array9[n8] += 183;
                        }
                    }
                    this.rd.setColor(this.color2k(150, 150, 150));
                    this.rd.drawLine(207, 73, 770, 73);
                    this.rd.setColor(this.color2k(205, 205, 205));
                    this.rd.fillRect(207, 409, 582, 30);
                    this.rd.setColor(this.color2k(150, 150, 150));
                    this.rd.drawLine(207, 411, 770, 411);
                    this.rd.setColor(this.color2k(205, 205, 205));
                    this.rd.fillRect(772, 93, 17, 299);
                    this.rd.setColor(this.color2k(205, 205, 205));
                    this.rd.fillRect(203, 46, 4, 393);
                    if (this.mscro3 == 831 || this.sdist == 0) {
                        if (this.sdist == 0) {
                            this.rd.setColor(this.color2k(205, 205, 205));
                        }
                        else {
                            this.rd.setColor(this.color2k(215, 215, 215));
                        }
                        this.rd.fillRect(772, 76, 17, 17);
                    }
                    else {
                        this.rd.setColor(this.color2k(220, 220, 220));
                        this.rd.fill3DRect(772, 76, 17, 17, true);
                    }
                    if (this.sdist != 0) {
                        this.rd.drawImage(this.xt.asu, 777, 82, null);
                    }
                    if (this.mscro3 == 832 || this.sdist == 0) {
                        if (this.sdist == 0) {
                            this.rd.setColor(this.color2k(205, 205, 205));
                        }
                        else {
                            this.rd.setColor(this.color2k(215, 215, 215));
                        }
                        this.rd.fillRect(772, 392, 17, 17);
                    }
                    else {
                        this.rd.setColor(this.color2k(220, 220, 220));
                        this.rd.fill3DRect(772, 392, 17, 17, true);
                    }
                    if (this.sdist != 0) {
                        this.rd.drawImage(this.xt.asd, 777, 399, null);
                    }
                    if (this.sdist != 0) {
                        if (this.lspos3 != this.spos3) {
                            this.rd.setColor(this.color2k(215, 215, 215));
                            this.rd.fillRect(772, 93 + this.spos3, 17, 31);
                        }
                        else {
                            if (this.mscro3 == 831) {
                                this.rd.setColor(this.color2k(215, 215, 215));
                            }
                            this.rd.fill3DRect(772, 93 + this.spos3, 17, 31, true);
                        }
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawLine(777, 106 + this.spos3, 783, 106 + this.spos3);
                        this.rd.drawLine(777, 108 + this.spos3, 783, 108 + this.spos3);
                        this.rd.drawLine(777, 110 + this.spos3, 783, 110 + this.spos3);
                        if (this.mscro3 > 800 && this.lspos3 != this.spos3) {
                            this.lspos3 = this.spos3;
                        }
                        if (b && this.openc == 0) {
                            if (this.mscro3 == 825 && n > 772 && n < 789 && n2 > 93 + this.spos3 && n2 < this.spos3 + 124) {
                                this.mscro3 = n2 - this.spos3;
                            }
                            if (this.mscro3 == 825 && n > 770 && n < 791 && n2 > 74 && n2 < 95) {
                                this.mscro3 = 831;
                            }
                            if (this.mscro3 == 825 && n > 770 && n < 791 && n2 > 390 && n2 < 411) {
                                this.mscro3 = 832;
                            }
                            if (this.mscro3 == 825 && n > 772 && n < 789 && n2 > 93 && n2 < 392) {
                                this.mscro3 = 108;
                                this.spos3 = n2 - this.mscro3;
                            }
                            int n9 = 2670 / this.sdist;
                            if (n9 < 1) {
                                n9 = 1;
                            }
                            if (this.mscro3 == 831) {
                                this.spos3 -= n9;
                                if (this.spos3 > 268) {
                                    this.spos3 = 268;
                                }
                                if (this.spos3 < 0) {
                                    this.spos3 = 0;
                                }
                                this.lspos3 = this.spos3;
                            }
                            if (this.mscro3 == 832) {
                                this.spos3 += n9;
                                if (this.spos3 > 268) {
                                    this.spos3 = 268;
                                }
                                if (this.spos3 < 0) {
                                    this.spos3 = 0;
                                }
                                this.lspos3 = this.spos3;
                            }
                            if (this.mscro3 < 800) {
                                this.spos3 = n2 - this.mscro3;
                                if (this.spos3 > 268) {
                                    this.spos3 = 268;
                                }
                                if (this.spos3 < 0) {
                                    this.spos3 = 0;
                                }
                            }
                            if (this.mscro3 == 825) {
                                this.mscro3 = 925;
                            }
                        }
                        else if (this.mscro3 != 825) {
                            this.mscro3 = 825;
                        }
                    }
                }
                else {
                    this.rd.setColor(this.color2k(205, 205, 205));
                    this.rd.fillRect(207, 46, 582, 30);
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    final String[] array10 = { "Player Interaction", "Clan Interaction", "Your Clan's Discussion" };
                    final int[] array11 = { 207, 390, 368, 207 };
                    final int[] array12 = { 73, 73, 51, 51 };
                    for (int itab2 = 0; itab2 < 3; ++itab2) {
                        if (this.itab == itab2) {
                            this.rd.setColor(this.color2k(230, 230, 230));
                            this.rd.fillPolygon(array11, array12, 4);
                        }
                        else if (n > array11[0] && n < array11[2] && n2 > 51 && n2 < 73) {
                            this.rd.setColor(this.color2k(217, 217, 217));
                            this.rd.fillPolygon(array11, array12, 4);
                            if (b) {
                                this.itab = itab2;
                            }
                        }
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawPolygon(array11, array12, 4);
                        this.rd.setColor(this.color2k(40, 40, 40));
                        this.rd.drawString(array10[itab2], array11[0] + 80 - this.ftm.stringWidth(array10[itab2]) / 2, 67);
                        for (int n10 = 0; n10 < 4; ++n10) {
                            final int[] array13 = array11;
                            final int n11 = n10;
                            array13[n11] += 183;
                        }
                    }
                    this.rd.setColor(this.color2k(150, 150, 150));
                    this.rd.drawLine(207, 73, 770, 73);
                    this.rd.setColor(this.color2k(205, 205, 205));
                    this.rd.fillRect(207, 409, 582, 30);
                    this.rd.setColor(this.color2k(150, 150, 150));
                    this.rd.drawLine(207, 411, 770, 411);
                    this.rd.setColor(this.color2k(205, 205, 205));
                    this.rd.fillRect(772, 76, 17, 333);
                    this.rd.setColor(this.color2k(205, 205, 205));
                    this.rd.fillRect(203, 46, 4, 393);
                    if (this.loadmsgs == 0) {
                        this.rd.setFont(new Font("Arial", 1, 11));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawString("You have not started any conversations yet.", 487 - this.ftm.stringWidth("You have not started any conversations yet.") / 2, 200);
                    }
                    if (this.loadmsgs == -2) {
                        this.rd.setFont(new Font("Arial", 1, 11));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawString("Failed to load conversations, will try again now...", 487 - this.ftm.stringWidth("Failed to load conversations, will try again now...") / 2, 200);
                    }
                    if (this.loadmsgs == -1) {
                        this.rd.setFont(new Font("Arial", 1, 11));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawString("Loading conversations, please wait...", 487 - this.ftm.stringWidth("Loading conversation, please wait...") / 2, 200);
                    }
                }
                if (this.gs.sendtyp.isShowing()) {
                    this.gs.sendtyp.hide();
                    this.gs.sendtyp.select(0);
                    this.flko = 0;
                }
                if (this.gs.senditem.isShowing()) {
                    this.gs.senditem.hide();
                }
                if (this.gs.datat.isShowing()) {
                    this.gs.datat.hide();
                }
            }
            else {
                this.rd.setColor(this.color2k(240, 240, 240));
                this.rd.fillRoundRect(197, 40, 597, 404, 20, 20);
                this.rd.setColor(new Color(0, 0, 0));
                this.rd.drawRoundRect(197, 40, 597, 404, 20, 20);
                this.rd.setColor(this.color2k(250, 250, 250));
                this.rd.fillRect(207, 86, 577, 274);
                this.sdist = (int)((this.nml - 14.75f) * 17.0f);
                if (this.sdist < 0) {
                    this.sdist = 0;
                }
                this.scro = (int)(this.spos4 / 208.0f * this.sdist);
                if (this.readmsg == 2) {
                    if (this.gs.openm) {
                        this.blockb = 10;
                    }
                    else if (this.blockb != 0) {
                        --this.blockb;
                    }
                    for (int n12 = 0; n12 < this.nml; ++n12) {
                        if (86 + 17 * n12 - this.scro < 360 && 125 + 17 * n12 - this.scro > 86 && this.mlinetyp[n12] != 167) {
                            this.rd.setColor(new Color(0, 0, 0));
                            if (this.mlinetyp[n12] != 10 && this.mlinetyp[n12] != 20 && this.mlinetyp[n12] != 30) {
                                if (this.mlinetyp[n12] == 0 || this.mlinetyp[n12] == 1 || this.mlinetyp[n12] == 2 || this.mlinetyp[n12] == 3 || this.mlinetyp[n12] == 4) {
                                    this.rd.setFont(new Font("Tahoma", 1, 11));
                                }
                                else {
                                    this.rd.setFont(new Font("Tahoma", 0, 11));
                                }
                                this.rd.drawString(this.mline[n12], 217, 103 + 17 * n12 - this.scro);
                                if (this.mlinetyp[n12] == 0 || this.mlinetyp[n12] == 1 || this.mlinetyp[n12] == 2 || this.mlinetyp[n12] == 3 || this.mlinetyp[n12] == 4) {
                                    this.rd.setFont(new Font("Tahoma", 0, 11));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.setColor(this.color2k(125, 125, 125));
                                    this.rd.drawString(this.mtimes[n12], 757 - this.ftm.stringWidth(this.mtimes[n12]), 103 + 17 * n12 - this.scro);
                                }
                            }
                            else {
                                if (this.mlinetyp[n12] == 30) {
                                    boolean b4 = true;
                                    if (n > 217 && n < 567 && n2 > 93 + n12 * 17 - this.scro && n2 < 123 + n12 * 17 - this.scro && this.blockb == 0) {
                                        this.cur = 12;
                                        b4 = false;
                                        if (b) {
                                            if (!this.claname.equals(this.mline[n12])) {
                                                this.claname = this.mline[n12];
                                                this.loadedc = false;
                                            }
                                            this.tab = 3;
                                            this.spos5 = 0;
                                            this.lspos5 = 0;
                                            this.cfase = 3;
                                            this.ctab = 0;
                                        }
                                    }
                                    if (!this.drawl(this.rd, "#" + this.mline[n12] + "#", 217, 93 + n12 * 17 - this.scro, b4) || !b4) {
                                        this.rd.setColor(new Color(0, 0, 0));
                                        this.rd.drawRect(217, 93 + n12 * 17 - this.scro, 349, 29);
                                        this.rd.setFont(new Font("Arial", 1, 13));
                                        this.ftm = this.rd.getFontMetrics();
                                        this.rd.drawString("" + this.mline[n12] + "", 392 - this.ftm.stringWidth("" + this.mline[n12] + "") / 2, 113 + n12 * 17 - this.scro);
                                    }
                                }
                                if (this.mlinetyp[n12] == 10) {
                                    if (this.cd.acname.equals(this.mline[n12])) {
                                        this.rd.setFont(new Font("Arial", 1, 12));
                                        this.ftm = this.rd.getFontMetrics();
                                        if (this.cd.action == -9) {
                                            this.rd.drawString("Failed to add car!  Unknown error, please try again later.", 217, 109 + 17 * n12 - this.scro);
                                        }
                                        if (this.cd.action == -8) {
                                            this.rd.drawString("Cannot add more then 20 cars to your account!", 217, 109 + 17 * n12 - this.scro);
                                        }
                                        if (this.cd.action == 7) {
                                            this.rd.setColor(new Color(94, 170, 0));
                                            this.rd.drawString("[" + this.mline[n12] + "] has been added to your cars!", 217, 109 + 17 * n12 - this.scro);
                                        }
                                        if (this.cd.action == -7) {
                                            this.rd.drawString("You already have this car.", 217, 109 + 17 * n12 - this.scro);
                                        }
                                        if (this.cd.action == 6) {
                                            this.rd.drawString("Adding Car...", 217, 109 + 17 * n12 - this.scro);
                                        }
                                        if (this.cd.action == -6) {
                                            this.rd.setColor(new Color(193, 106, 0));
                                            final String str = "Upgrade to a full account to add custom cars!";
                                            final int n13 = 217;
                                            final int n14 = n13 + this.ftm.stringWidth(str);
                                            this.rd.drawString(str, n13, 109 + 17 * n12 - this.scro);
                                            if (this.waitlink != -1) {
                                                this.rd.drawLine(n13, 111 + 17 * n12 - this.scro, n14, 111 + 17 * n12 - this.scro);
                                            }
                                            if (n > n13 && n < n14 && n2 > 98 + 17 * n12 - this.scro && n2 < 111 + 17 * n12 - this.scro) {
                                                if (this.waitlink != -1) {
                                                    this.cur = 12;
                                                }
                                                if (b && this.waitlink == 0) {
                                                    this.gs.editlink(this.xt.nickname, true);
                                                    this.waitlink = -1;
                                                }
                                            }
                                            if (this.waitlink > 0) {
                                                --this.waitlink;
                                            }
                                        }
                                    }
                                    if (this.cd.action == 0 || !this.cd.acname.equals(this.mline[n12])) {
                                        this.rd.setFont(new Font("Arial", 1, 12));
                                        this.rd.drawString("[  " + this.mline[n12] + "  ]", 340, 109 + 17 * n12 - this.scro);
                                        if (this.xt.drawcarb(true, null, " Add to My Cars ", 217, 90 + 17 * n12 - this.scro, n, n2, b && this.blockb == 0)) {
                                            if (this.xt.logged) {
                                                this.cd.action = 6;
                                                this.cd.ac = -1;
                                                this.cd.acname = this.mline[n12];
                                                this.cd.sparkactionloader();
                                            }
                                            else {
                                                this.cd.acname = this.mline[n12];
                                                this.cd.action = -6;
                                                this.waitlink = 20;
                                            }
                                        }
                                    }
                                }
                                if (this.mlinetyp[n12] == 20) {
                                    if (this.cd.onstage.equals(this.mline[n12])) {
                                        this.rd.setFont(new Font("Arial", 1, 12));
                                        this.ftm = this.rd.getFontMetrics();
                                        if (this.addstage == 2) {
                                            this.rd.drawString("Adding stage...", 217, 109 + 17 * n12 - this.scro);
                                            if (this.cd.staction == 0) {
                                                this.addstage = 3;
                                            }
                                            if (this.cd.staction == -2) {
                                                this.addstage = 4;
                                            }
                                            if (this.cd.staction == -3) {
                                                this.addstage = 5;
                                            }
                                            if (this.cd.staction == -1) {
                                                this.addstage = 6;
                                            }
                                        }
                                        if (this.addstage == 3) {
                                            this.rd.setColor(new Color(94, 170, 0));
                                            this.rd.drawString("[" + this.mline[n12] + "] has been added to your stages!", 217, 109 + 17 * n12 - this.scro);
                                        }
                                        if (this.addstage == 4) {
                                            this.rd.drawString("You already have this stage.", 217, 109 + 17 * n12 - this.scro);
                                        }
                                        if (this.addstage == 5) {
                                            this.rd.drawString("Cannot add more then 20 stages to your account!", 217, 109 + 17 * n12 - this.scro);
                                        }
                                        if (this.addstage == 6) {
                                            this.rd.drawString("Failed to add stage!  Unknown error, please try again later.", 217, 109 + 17 * n12 - this.scro);
                                        }
                                        if (this.addstage == 1) {
                                            this.rd.setColor(new Color(193, 106, 0));
                                            final String str2 = "Upgrade to a full account to add custom stages!";
                                            final int n15 = 217;
                                            final int n16 = n15 + this.ftm.stringWidth(str2);
                                            this.rd.drawString(str2, n15, 109 + 17 * n12 - this.scro);
                                            if (this.waitlink != -1) {
                                                this.rd.drawLine(n15, 111 + 17 * n12 - this.scro, n16, 111 + 17 * n12 - this.scro);
                                            }
                                            if (n > n15 && n < n16 && n2 > 98 + 17 * n12 - this.scro && n2 < 111 + 17 * n12 - this.scro) {
                                                if (this.waitlink != -1) {
                                                    this.cur = 12;
                                                }
                                                if (b && this.waitlink == 0) {
                                                    this.gs.editlink(this.xt.nickname, true);
                                                    this.waitlink = -1;
                                                }
                                            }
                                            if (this.waitlink > 0) {
                                                --this.waitlink;
                                            }
                                        }
                                    }
                                    if (this.addstage == 0 || !this.cd.onstage.equals(this.mline[n12])) {
                                        this.rd.setFont(new Font("Arial", 1, 12));
                                        this.rd.drawString("[  " + this.mline[n12] + "  ]", 355, 109 + 17 * n12 - this.scro);
                                        if (this.xt.drawcarb(true, null, " Add to My Stages ", 217, 90 + 17 * n12 - this.scro, n, n2, b && this.blockb == 0)) {
                                            if (this.xt.logged) {
                                                this.cd.onstage = this.mline[n12];
                                                this.cd.staction = 2;
                                                this.cd.sparkstageaction();
                                                this.addstage = 2;
                                            }
                                            else {
                                                this.cd.onstage = this.mline[n12];
                                                this.addstage = 1;
                                                this.waitlink = 20;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (this.readmsg == 1) {
                    this.rd.setFont(new Font("Tahoma", 1, 11));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawString("Reading...", 487 - this.ftm.stringWidth("Reading...") / 2, 200);
                }
                if (this.readmsg == 3) {
                    this.rd.setFont(new Font("Tahoma", 1, 11));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawString("Failed to fetch and load conversation.", 487 - this.ftm.stringWidth("Failed to fetch and load conversation.") / 2, 200);
                }
                if (this.readmsg == 4) {
                    this.rd.setFont(new Font("Tahoma", 1, 11));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawString("Failed to load conversation, server error, please try again later.", 487 - this.ftm.stringWidth("Failed to load conversation, please try again later.") / 2, 200);
                }
                if (this.readmsg == 5) {
                    this.rd.setFont(new Font("Tahoma", 1, 11));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawString("Failed to send message, server error, please try again later.", 487 - this.ftm.stringWidth("Failed to send message, server error, please try again later.") / 2, 200);
                }
                this.rd.setColor(this.color2k(240, 240, 240));
                this.rd.fillRect(207, 47, 577, 39);
                this.rd.fillRect(207, 360, 577, 39);
                this.rd.setColor(this.color2k(205, 205, 205));
                this.rd.drawLine(207, 86, 783, 86);
                this.rd.drawLine(207, 86, 207, 360);
                this.rd.drawLine(207, 360, 783, 360);
                this.rd.fillRect(767, 104, 17, 239);
                if (this.mscro4 == 831 || this.sdist == 0) {
                    if (this.sdist == 0) {
                        this.rd.setColor(this.color2k(205, 205, 205));
                    }
                    else {
                        this.rd.setColor(this.color2k(215, 215, 215));
                    }
                    this.rd.fillRect(767, 87, 17, 17);
                }
                else {
                    this.rd.setColor(this.color2k(220, 220, 220));
                    this.rd.fill3DRect(767, 87, 17, 17, true);
                }
                if (this.sdist != 0) {
                    this.rd.drawImage(this.xt.asu, 772, 93, null);
                }
                if (this.mscro4 == 832 || this.sdist == 0) {
                    if (this.sdist == 0) {
                        this.rd.setColor(this.color2k(205, 205, 205));
                    }
                    else {
                        this.rd.setColor(this.color2k(215, 215, 215));
                    }
                    this.rd.fillRect(767, 343, 17, 17);
                }
                else {
                    this.rd.setColor(this.color2k(220, 220, 220));
                    this.rd.fill3DRect(767, 343, 17, 17, true);
                }
                if (this.sdist != 0) {
                    this.rd.drawImage(this.xt.asd, 772, 350, null);
                }
                if (this.sdist != 0) {
                    if (this.lspos4 != this.spos4) {
                        this.rd.setColor(this.color2k(215, 215, 215));
                        this.rd.fillRect(767, 104 + this.spos4, 17, 31);
                    }
                    else {
                        if (this.mscro4 == 831) {
                            this.rd.setColor(this.color2k(215, 215, 215));
                        }
                        this.rd.fill3DRect(767, 104 + this.spos4, 17, 31, true);
                    }
                    this.rd.setColor(this.color2k(150, 150, 150));
                    this.rd.drawLine(772, 117 + this.spos4, 778, 117 + this.spos4);
                    this.rd.drawLine(772, 119 + this.spos4, 778, 119 + this.spos4);
                    this.rd.drawLine(772, 121 + this.spos4, 778, 121 + this.spos4);
                    if (this.mscro4 > 800 && this.lspos4 != this.spos4) {
                        this.lspos4 = this.spos4;
                    }
                    if (b) {
                        if (this.mscro4 == 825 && n > 767 && n < 784 && n2 > 104 + this.spos4 && n2 < this.spos4 + 135) {
                            this.mscro4 = n2 - this.spos4;
                        }
                        if (this.mscro4 == 825 && n > 765 && n < 786 && n2 > 85 && n2 < 106) {
                            this.mscro4 = 831;
                        }
                        if (this.mscro4 == 825 && n > 765 && n < 786 && n2 > 341 && n2 < 362) {
                            this.mscro4 = 832;
                        }
                        if (this.mscro4 == 825 && n > 767 && n < 784 && n2 > 104 && n2 < 343) {
                            this.mscro4 = 119;
                            this.spos4 = n2 - this.mscro4;
                        }
                        int n17 = 2670 / this.sdist;
                        if (n17 < 1) {
                            n17 = 1;
                        }
                        if (this.mscro4 == 831) {
                            this.spos4 -= n17;
                            if (this.spos4 > 208) {
                                this.spos4 = 208;
                            }
                            if (this.spos4 < 0) {
                                this.spos4 = 0;
                            }
                            this.lspos4 = this.spos4;
                        }
                        if (this.mscro4 == 832) {
                            this.spos4 += n17;
                            if (this.spos4 > 208) {
                                this.spos4 = 208;
                            }
                            if (this.spos4 < 0) {
                                this.spos4 = 0;
                            }
                            this.lspos4 = this.spos4;
                        }
                        if (this.mscro4 < 800) {
                            this.spos4 = n2 - this.mscro4;
                            if (this.spos4 > 208) {
                                this.spos4 = 208;
                            }
                            if (this.spos4 < 0) {
                                this.spos4 = 0;
                            }
                        }
                        if (this.mscro4 == 825) {
                            this.mscro4 = 925;
                        }
                    }
                    else if (this.mscro4 != 825) {
                        this.mscro4 = 825;
                    }
                }
                this.rd.setFont(new Font("Arial", 1, 12));
                this.ftm = this.rd.getFontMetrics();
                if (!this.drawl(this.rd, this.opname, 207, 47, true)) {
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawString(this.opname, 267 - this.ftm.stringWidth(this.opname) / 2, 66);
                    this.rd.setColor(this.color2k(150, 150, 150));
                    this.rd.drawRect(207, 47, 119, 29);
                }
                this.rd.setColor(new Color(0, 0, 0));
                this.rd.drawString("::  Conversation with " + this.opname + "", 336, 72);
                if (n > 207 && n < 327 && n2 > 47 && n2 < 77) {
                    this.cur = 12;
                    if (b) {
                        this.tab = 1;
                        if (!this.proname.equals(this.opname)) {
                            this.proname = this.opname;
                            this.loadedp = false;
                            this.onexitpro();
                        }
                    }
                }
                if (this.stringbutton(this.rd, "Block / Ignore", 665, 66, 0, n, n2, b, 0, 0)) {
                    this.openc = 0;
                    this.blockname = this.opname;
                }
                if (this.stringbutton(this.rd, "Close X", 752, 66, 0, n, n2, b, 0, 0)) {
                    this.openc = 0;
                    this.readmsg = 0;
                }
                if (!this.gs.sendtyp.isShowing()) {
                    this.gs.sendtyp.show();
                }
                this.gs.sendtyp.move(207, 365);
                if (this.sendmsg != 0) {
                    this.gs.sendtyp.disable();
                }
                else {
                    this.gs.sendtyp.enable();
                }
                String s = "";
                if (this.gs.sendtyp.getSelectedIndex() == 0) {
                    this.dommsg = true;
                    if (this.loaditem != 0) {
                        this.loaditem = 0;
                    }
                }
                if (this.gs.sendtyp.getSelectedIndex() == 1) {
                    s = "car";
                    this.rd.setFont(new Font("Arial", 0, 12));
                    this.rd.drawString("Send a public car you have or a private car that belongs to you.", 376, 382);
                }
                if (this.gs.sendtyp.getSelectedIndex() == 2) {
                    s = "stage";
                    this.rd.setFont(new Font("Arial", 0, 12));
                    this.rd.drawString("Send a public stage you have or a private stage that belongs to you.", 376, 382);
                }
                if (this.gs.sendtyp.getSelectedIndex() == 3) {
                    this.rd.setFont(new Font("Arial", 0, 12));
                    this.rd.drawString("Send an invitation to " + this.opname + " to join your clan.", 376, 382);
                }
                if (this.gs.sendtyp.getSelectedIndex() == 4) {
                    this.rd.setFont(new Font("Arial", 0, 12));
                    this.rd.drawString("A date that gets converted to the local time of the person previewing it.", 376, 382);
                }
                if (this.itemsel != this.gs.sendtyp.getSelectedIndex()) {
                    this.gs.senditem.hide();
                    this.gs.datat.hide();
                    this.itemsel = this.gs.sendtyp.getSelectedIndex();
                }
                if (this.gs.sendtyp.getSelectedIndex() == 0) {
                    if (this.sendmsg == 0) {
                        if (this.stringbutton(this.rd, "   Send  >  ", 723, 408, 0, n, n2, b, 0, 0) && !this.gs.mmsg.getText().trim().equals("") && this.gs.mmsg.getText().toLowerCase().indexOf(this.gs.tpass.getText().toLowerCase()) == -1 && this.xt.acexp != -3) {
                            if (!this.xt.msgcheck(this.gs.mmsg.getText())) {
                                this.sendmsg = 1;
                            }
                            else {
                                this.gs.sendtyp.hide();
                                final xtGraphics xt = this.xt;
                                ++xt.warning;
                            }
                        }
                    }
                    else {
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.drawString("Sending...", 723 - this.ftm.stringWidth("Sending...") / 2, 408);
                    }
                }
                if (this.gs.sendtyp.getSelectedIndex() == 1 || this.gs.sendtyp.getSelectedIndex() == 2) {
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("Select " + s + " to share:", 207, 420);
                    if (!this.gs.senditem.isShowing()) {
                        this.gs.senditem.removeAll();
                        if (this.xt.logged) {
                            this.gs.senditem.add(this.rd, "Loading your " + s + " list, please wait...");
                            this.loaditem = this.gs.sendtyp.getSelectedIndex();
                        }
                        else {
                            this.gs.senditem.add(this.rd, "You need to upgrade to have custom " + s + "s!");
                        }
                        this.gs.senditem.select(0);
                        this.gs.senditem.show();
                    }
                    this.gs.senditem.move(207 + this.ftm.stringWidth("Select " + s + " to share:") + 11, 403);
                    if ((this.loaditem == 10 && this.gs.sendtyp.getSelectedIndex() == 1) || (this.loaditem == 20 && this.gs.sendtyp.getSelectedIndex() == 2) || !this.xt.logged) {
                        if (this.xt.logged) {
                            if (this.sendmsg == 0) {
                                if (this.stringbutton(this.rd, "   Send  >  ", 723, 420, 0, n, n2, b, 0, 0)) {
                                    this.sendmsg = 1;
                                }
                            }
                            else {
                                this.rd.drawString("Sending...", 723 - this.ftm.stringWidth("Sending...") / 2, 420);
                            }
                        }
                        else {
                            this.rd.setColor(new Color(206, 171, 98));
                            this.rd.fillRoundRect(651, 391, 136, 46, 20, 20);
                            if (this.drawbutton(this.xt.upgrade, 719, 414, n, n2, b)) {
                                this.gs.editlink(this.xt.nickname, true);
                            }
                        }
                    }
                }
                if (this.gs.sendtyp.getSelectedIndex() == 3) {
                    if (!this.xt.clan.equals("")) {
                        final int n18 = 306;
                        final int n19 = -195;
                        if (!this.drawl(this.rd, "#" + this.xt.clan + "#", 406 + n19, 101 + n18, true)) {
                            this.rd.setFont(new Font("Arial", 1, 13));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.drawString("" + this.xt.clan + "", 581 + n19 - this.ftm.stringWidth("" + this.xt.clan + "") / 2, 121 + n18);
                        }
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        String string = "Your Clan";
                        if (n > 402 + n19 && n < 759 + n19 && n2 > 84 + n18 && n2 < 134 + n18) {
                            string = "Clan :  " + this.xt.clan + "";
                            this.rd.drawLine(408 + n19, 98 + n18, 408 + n19 + this.ftm.stringWidth(string), 98 + n18);
                            if ((n > 408 + n19 && n < 408 + n19 + this.ftm.stringWidth(string) && n2 > 85 + n18 && n2 < 100 + n18) || (n > 406 + n19 && n < 756 + n19 && n2 > 101 + n18 && n2 < 131 + n18)) {
                                this.cur = 12;
                                if (b && this.sendmsg == 0) {
                                    if (!this.claname.equals(this.xt.clan)) {
                                        this.claname = this.xt.clan;
                                        this.loadedc = false;
                                    }
                                    this.tab = 3;
                                    this.spos5 = 0;
                                    this.lspos5 = 0;
                                    this.cfase = 3;
                                    this.ctab = 0;
                                }
                            }
                        }
                        this.rd.drawString(string, 408 + n19, 97 + n18);
                        this.rd.drawLine(402 + n19, 84 + n18, 402 + n19, 134 + n18);
                        this.rd.drawLine(402 + n19, 84 + n18, 408 + n19 + this.ftm.stringWidth(string) + 2, 84 + n18);
                        this.rd.drawLine(408 + n19 + this.ftm.stringWidth(string) + 2, 84 + n18, 408 + n19 + this.ftm.stringWidth(string) + 15, 97 + n18);
                        this.rd.drawLine(408 + n19 + this.ftm.stringWidth(string) + 15, 97 + n18, 759 + n19, 97 + n18);
                        this.rd.drawLine(759 + n19, 97 + n18, 759 + n19, 134 + n18);
                        this.rd.drawLine(402 + n19, 134 + n18, 759 + n19, 134 + n18);
                    }
                    else if (this.xt.logged) {
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        if (this.flko % 4 != 0 || this.flko == 0) {
                            this.rd.drawString("You are not a member of any clan yet!", 376 - this.ftm.stringWidth("You are not a member of any clan yet!") / 2, 417);
                        }
                        if (this.flko != 0) {
                            --this.flko;
                        }
                    }
                    else {
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.drawString("You need to upgrade to a full account to participate in NFM clan's activities.", 207, 420);
                        this.rd.setColor(new Color(206, 171, 98));
                        this.rd.fillRoundRect(651, 391, 136, 46, 20, 20);
                        if (this.drawbutton(this.xt.upgrade, 719, 414, n, n2, b)) {
                            this.gs.editlink(this.xt.nickname, true);
                        }
                    }
                    if (this.xt.logged) {
                        if (this.sendmsg == 0) {
                            if (this.stringbutton(this.rd, "   Send  >  ", 723, 408, 0, n, n2, b, 0, 0)) {
                                if (!this.xt.clan.equals("")) {
                                    this.sendmsg = 1;
                                }
                                else {
                                    this.flko = 45;
                                }
                            }
                        }
                        else {
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.drawString("Sending...", 723 - this.ftm.stringWidth("Sending...") / 2, 408);
                        }
                    }
                }
                if (this.gs.sendtyp.getSelectedIndex() == 4) {
                    if (!this.gs.senditem.isShowing()) {
                        this.gs.senditem.removeAll();
                        final Calendar instance = Calendar.getInstance();
                        int n20 = 0;
                        for (int n21 = 0; n21 < 20; ++n21) {
                            String str3 = this.wday[instance.get(7) - 1];
                            if (n20 == 0) {
                                str3 = "Today";
                                n20 = 1;
                            }
                            this.gs.senditem.add(this.rd, "" + str3 + "  -  " + this.month[instance.get(2)] + " " + instance.get(5) + "");
                            instance.roll(5, true);
                        }
                        this.gs.senditem.select(0);
                        this.gs.senditem.show();
                    }
                    if (!this.gs.datat.isShowing()) {
                        this.gs.datat.removeAll();
                        int m = 12;
                        String str4 = "PM";
                        for (int n22 = 0; n22 < 24; ++n22) {
                            this.gs.datat.add(this.rd, "" + m + " " + str4 + "");
                            if (++m == 12) {
                                str4 = "AM";
                            }
                            if (m == 13) {
                                m = 1;
                            }
                        }
                        this.gs.datat.select(0);
                        this.gs.datat.show();
                    }
                    this.gs.senditem.move(300, 395);
                    this.gs.datat.move(491, 395);
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("Date is displayed based on your computer calendar's date/time, please make sure it is correct.", 207, 435);
                    if (this.sendmsg == 0) {
                        if (this.stringbutton(this.rd, "   Send  >  ", 723, 408, 0, n, n2, b, 0, 0)) {
                            this.sendmsg = 1;
                        }
                    }
                    else {
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.drawString("Sending...", 723 - this.ftm.stringWidth("Sending...") / 2, 408);
                    }
                }
            }
            if (this.openc >= 1 && this.openc < 10) {
                this.rd.setColor(this.color2k(240, 240, 230));
                this.rd.fillRoundRect(197, this.opy, 597, this.oph, 20, 20);
                this.rd.setColor(new Color(0, 0, 0));
                this.rd.drawRoundRect(197, this.opy, 597, this.oph, 20, 20);
                if (!this.drawl(this.rd, this.opname, 207, this.opy + 7, true)) {
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawString(this.opname, 267 - this.ftm.stringWidth(this.opname) / 2, this.opy + 26);
                    this.rd.setColor(this.color2k(150, 150, 150));
                    this.rd.drawRect(207, this.opy + 7, 119, 29);
                }
                this.opy += this.addopy;
                this.oph += 36;
                ++this.openc;
            }
        }
        if (this.itab == 1) {
            if (this.litab != this.itab) {
                this.spos3 = 0;
                this.gs.senditem.hide();
                this.gs.datat.hide();
                this.gs.sendtyp.removeAll();
                this.gs.sendtyp.add(this.rd, "Write a Message");
                this.gs.sendtyp.add(this.rd, "Share a Relative Date");
                this.gs.sendtyp.add(this.rd, "Battle over Stage");
                this.gs.sendtyp.add(this.rd, "Battle over Car");
                this.gs.sendtyp.add(this.rd, "Declare War");
                if (!this.redif) {
                    this.gs.sendtyp.select(0);
                }
                else {
                    this.gs.sendtyp.select(this.intsel);
                    if (this.intsel == 4) {
                        this.redif = false;
                    }
                }
                if (this.sendwarnum) {
                    this.gs.sendtyp.sel = this.intsel;
                }
                this.intsel = 0;
                this.litab = this.itab;
            }
            if (!this.xt.clan.equals("")) {
                if (this.openi != 10) {
                    this.rd.setColor(this.color2k(230, 230, 230));
                    this.rd.fillRoundRect(197, 40, 597, 404, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(197, 40, 597, 404, 20, 20);
                    if (this.loadinter != 0 && this.loadinter != -2 && this.loadinter != -1) {
                        this.sdist = (this.ni - 10) * 31;
                        if (this.sdist < 0) {
                            this.sdist = 0;
                        }
                        this.scro = (int)(this.spos3 / 268.0f * this.sdist);
                        int n23 = 0;
                        for (int n24 = 0; n24 < this.ni; ++n24) {
                            if (76 + 31 * n23 - this.scro < 408 && 107 + 31 * n23 - this.scro > 76) {
                                boolean b5 = false;
                                if (n > 207 && n < 770 && n2 > 76 + 31 * n23 - this.scro && n2 < 106 + 31 * n23 - this.scro) {
                                    b5 = true;
                                    this.cur = 12;
                                    if (b && this.openc == 0) {
                                        this.opy = 70 + 31 * n23 - this.scro;
                                        this.addopy = (40 - this.opy) / 10;
                                        this.oph = 44;
                                        this.openi = 1;
                                        if (!this.intclan.equals(this.iclan[n24])) {
                                            this.intclan = this.iclan[n24];
                                            this.dispi = 0;
                                            this.nil = 0;
                                            this.lastint = "";
                                            this.readint = 1;
                                        }
                                    }
                                }
                                if (this.icheck[n24].toLowerCase().indexOf(this.xt.nickname.toLowerCase()) == -1) {
                                    this.rd.setColor(this.color2k(240, 240, 240));
                                    this.rd.fillRect(207, 77 + 31 * n23 - this.scro, 564, 30);
                                }
                                if (b5) {
                                    this.rd.setColor(this.color2k(250, 250, 250));
                                    this.rd.fillRect(207, 77 + 31 * n23 - this.scro, 564, 30);
                                }
                                final boolean drawl3 = this.drawl(this.rd, "#" + this.iclan[n24] + "#", 207, 77 + 31 * n23 - this.scro, b5);
                                if (!b5 || !drawl3) {
                                    this.rd.setFont(new Font("Arial", 1, 12));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.setColor(new Color(0, 0, 0));
                                    this.rd.drawString(this.iclan[n24], 382 - this.ftm.stringWidth(this.iclan[n24]) / 2, 96 + 31 * n23 - this.scro);
                                }
                                this.rd.setFont(new Font("Tahoma", 0, 11));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.setColor(this.color2k(125, 125, 125));
                                this.rd.drawString(this.itime[n24], 760 - this.ftm.stringWidth(this.itime[n24]), 102 + 31 * n23 - this.scro);
                                this.rd.setColor(new Color(0, 0, 0));
                                this.rd.drawString(this.isub[n24], 565, 89 + 31 * n23 - this.scro);
                                this.rd.setFont(new Font("Arial", 1, 11));
                                this.rd.setColor(new Color(117, 67, 0));
                                this.rd.drawString(this.istat[n24], 565, 102 + 31 * n23 - this.scro);
                                this.rd.setColor(this.color2k(150, 150, 150));
                                this.rd.drawLine(207, 107 + 31 * n23 - this.scro, 770, 107 + 31 * n23 - this.scro);
                            }
                            ++n23;
                        }
                        this.rd.setColor(this.color2k(205, 205, 205));
                        this.rd.fillRect(207, 46, 582, 30);
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        final String[] array14 = { "Player Interaction", "Clan Interaction", "Your Clan's Discussion" };
                        final int[] array15 = { 207, 390, 368, 207 };
                        final int[] array16 = { 73, 73, 51, 51 };
                        for (int itab3 = 0; itab3 < 3; ++itab3) {
                            if (this.itab == itab3) {
                                this.rd.setColor(this.color2k(230, 230, 230));
                                this.rd.fillPolygon(array15, array16, 4);
                            }
                            else if (n > array15[0] && n < array15[2] && n2 > 51 && n2 < 73) {
                                this.rd.setColor(this.color2k(217, 217, 217));
                                this.rd.fillPolygon(array15, array16, 4);
                                if (b) {
                                    this.itab = itab3;
                                }
                            }
                            this.rd.setColor(this.color2k(150, 150, 150));
                            this.rd.drawPolygon(array15, array16, 4);
                            this.rd.setColor(this.color2k(40, 40, 40));
                            this.rd.drawString(array14[itab3], array15[0] + 80 - this.ftm.stringWidth(array14[itab3]) / 2, 67);
                            for (int n25 = 0; n25 < 4; ++n25) {
                                final int[] array17 = array15;
                                final int n26 = n25;
                                array17[n26] += 183;
                            }
                        }
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawLine(207, 73, 770, 73);
                        this.rd.setColor(this.color2k(205, 205, 205));
                        this.rd.fillRect(207, 409, 582, 30);
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawLine(207, 411, 770, 411);
                        this.rd.setColor(this.color2k(205, 205, 205));
                        this.rd.fillRect(772, 93, 17, 299);
                        this.rd.setColor(this.color2k(205, 205, 205));
                        this.rd.fillRect(203, 46, 4, 393);
                        if (this.mscro3 == 831 || this.sdist == 0) {
                            if (this.sdist == 0) {
                                this.rd.setColor(this.color2k(205, 205, 205));
                            }
                            else {
                                this.rd.setColor(this.color2k(215, 215, 215));
                            }
                            this.rd.fillRect(772, 76, 17, 17);
                        }
                        else {
                            this.rd.setColor(this.color2k(220, 220, 220));
                            this.rd.fill3DRect(772, 76, 17, 17, true);
                        }
                        if (this.sdist != 0) {
                            this.rd.drawImage(this.xt.asu, 777, 82, null);
                        }
                        if (this.mscro3 == 832 || this.sdist == 0) {
                            if (this.sdist == 0) {
                                this.rd.setColor(this.color2k(205, 205, 205));
                            }
                            else {
                                this.rd.setColor(this.color2k(215, 215, 215));
                            }
                            this.rd.fillRect(772, 392, 17, 17);
                        }
                        else {
                            this.rd.setColor(this.color2k(220, 220, 220));
                            this.rd.fill3DRect(772, 392, 17, 17, true);
                        }
                        if (this.sdist != 0) {
                            this.rd.drawImage(this.xt.asd, 777, 399, null);
                        }
                        if (this.sdist != 0) {
                            if (this.lspos3 != this.spos3) {
                                this.rd.setColor(this.color2k(215, 215, 215));
                                this.rd.fillRect(772, 93 + this.spos3, 17, 31);
                            }
                            else {
                                if (this.mscro3 == 831) {
                                    this.rd.setColor(this.color2k(215, 215, 215));
                                }
                                this.rd.fill3DRect(772, 93 + this.spos3, 17, 31, true);
                            }
                            this.rd.setColor(this.color2k(150, 150, 150));
                            this.rd.drawLine(777, 106 + this.spos3, 783, 106 + this.spos3);
                            this.rd.drawLine(777, 108 + this.spos3, 783, 108 + this.spos3);
                            this.rd.drawLine(777, 110 + this.spos3, 783, 110 + this.spos3);
                            if (this.mscro3 > 800 && this.lspos3 != this.spos3) {
                                this.lspos3 = this.spos3;
                            }
                            if (b && this.openc == 0) {
                                if (this.mscro3 == 825 && n > 772 && n < 789 && n2 > 93 + this.spos3 && n2 < this.spos3 + 124) {
                                    this.mscro3 = n2 - this.spos3;
                                }
                                if (this.mscro3 == 825 && n > 770 && n < 791 && n2 > 74 && n2 < 95) {
                                    this.mscro3 = 831;
                                }
                                if (this.mscro3 == 825 && n > 770 && n < 791 && n2 > 390 && n2 < 411) {
                                    this.mscro3 = 832;
                                }
                                if (this.mscro3 == 825 && n > 772 && n < 789 && n2 > 93 && n2 < 392) {
                                    this.mscro3 = 108;
                                    this.spos3 = n2 - this.mscro3;
                                }
                                int n27 = 2670 / this.sdist;
                                if (n27 < 1) {
                                    n27 = 1;
                                }
                                if (this.mscro3 == 831) {
                                    this.spos3 -= n27;
                                    if (this.spos3 > 268) {
                                        this.spos3 = 268;
                                    }
                                    if (this.spos3 < 0) {
                                        this.spos3 = 0;
                                    }
                                    this.lspos3 = this.spos3;
                                }
                                if (this.mscro3 == 832) {
                                    this.spos3 += n27;
                                    if (this.spos3 > 268) {
                                        this.spos3 = 268;
                                    }
                                    if (this.spos3 < 0) {
                                        this.spos3 = 0;
                                    }
                                    this.lspos3 = this.spos3;
                                }
                                if (this.mscro3 < 800) {
                                    this.spos3 = n2 - this.mscro3;
                                    if (this.spos3 > 268) {
                                        this.spos3 = 268;
                                    }
                                    if (this.spos3 < 0) {
                                        this.spos3 = 0;
                                    }
                                }
                                if (this.mscro3 == 825) {
                                    this.mscro3 = 925;
                                }
                            }
                            else if (this.mscro3 != 825) {
                                this.mscro3 = 825;
                            }
                        }
                    }
                    else {
                        this.rd.setColor(this.color2k(205, 205, 205));
                        this.rd.fillRect(207, 46, 582, 30);
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        final String[] array18 = { "Player Interaction", "Clan Interaction", "Your Clan's Discussion" };
                        final int[] array19 = { 207, 390, 368, 207 };
                        final int[] array20 = { 73, 73, 51, 51 };
                        for (int itab4 = 0; itab4 < 3; ++itab4) {
                            if (this.itab == itab4) {
                                this.rd.setColor(this.color2k(230, 230, 230));
                                this.rd.fillPolygon(array19, array20, 4);
                            }
                            else if (n > array19[0] && n < array19[2] && n2 > 51 && n2 < 73) {
                                this.rd.setColor(this.color2k(217, 217, 217));
                                this.rd.fillPolygon(array19, array20, 4);
                                if (b) {
                                    this.itab = itab4;
                                }
                            }
                            this.rd.setColor(this.color2k(150, 150, 150));
                            this.rd.drawPolygon(array19, array20, 4);
                            this.rd.setColor(this.color2k(40, 40, 40));
                            this.rd.drawString(array18[itab4], array19[0] + 80 - this.ftm.stringWidth(array18[itab4]) / 2, 67);
                            for (int n28 = 0; n28 < 4; ++n28) {
                                final int[] array21 = array19;
                                final int n29 = n28;
                                array21[n29] += 183;
                            }
                        }
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawLine(207, 73, 770, 73);
                        this.rd.setColor(this.color2k(205, 205, 205));
                        this.rd.fillRect(207, 409, 582, 30);
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawLine(207, 411, 770, 411);
                        this.rd.setColor(this.color2k(205, 205, 205));
                        this.rd.fillRect(772, 76, 17, 333);
                        this.rd.setColor(this.color2k(205, 205, 205));
                        this.rd.fillRect(203, 46, 4, 393);
                        if (this.loadinter == 0) {
                            this.rd.setFont(new Font("Arial", 1, 11));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.drawString("You have not started any interactions with other clans yet.", 487 - this.ftm.stringWidth("You have not started any interactions with other clans yet.") / 2, 200);
                        }
                        if (this.loadinter == -2) {
                            this.rd.setFont(new Font("Arial", 1, 11));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.drawString("Failed to load interactions, will try again now...", 487 - this.ftm.stringWidth("Failed to load interactions, will try again now...") / 2, 200);
                        }
                        if (this.loadinter == -1) {
                            this.rd.setFont(new Font("Arial", 1, 11));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.drawString("Loading interactions, please wait...", 487 - this.ftm.stringWidth("Loading interactions, please wait...") / 2, 200);
                        }
                    }
                    if (this.gs.sendtyp.isShowing()) {
                        this.gs.sendtyp.hide();
                    }
                    if (this.gs.senditem.isShowing()) {
                        this.gs.senditem.hide();
                    }
                    if (this.gs.datat.isShowing()) {
                        this.gs.datat.hide();
                    }
                    this.gs.ilaps.hide();
                    this.gs.icars.hide();
                    this.gs.sclass.hide();
                    this.gs.sfix.hide();
                    if (this.gs.sendtyp.getSelectedIndex() != 0) {
                        this.gs.sendtyp.select(0);
                        this.intsel = 0;
                    }
                }
                else {
                    this.rd.setColor(this.color2k(240, 240, 240));
                    this.rd.fillRoundRect(197, 40, 597, 404, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(197, 40, 597, 404, 20, 20);
                    this.rd.setColor(this.color2k(250, 250, 250));
                    this.rd.fillRect(207, 86, 577, 274);
                    if (this.intclanlo.equals(this.intclan) && this.intclanbgloaded) {
                        this.rd.setComposite(AlphaComposite.getInstance(3, 0.1f));
                        this.rd.drawImage(this.intclanbg, 207, 86, null);
                        this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
                    }
                    this.sdist = 0;
                    if ((this.readint == 2 || this.readint == 1) && this.viewgame2 == 0) {
                        this.sdist = (int)((this.nil - 14.75f) * 17.0f);
                        if (this.sdist < 0) {
                            this.sdist = 0;
                        }
                        this.scro = (int)(this.spos4 / 208.0f * this.sdist);
                        if (this.gs.openm) {
                            this.blockb = 10;
                        }
                        else if (this.blockb != 0) {
                            --this.blockb;
                        }
                        for (int n30 = 0; n30 < this.nil; ++n30) {
                            if (86 + 17 * n30 - this.scro < 360 && 125 + 17 * n30 - this.scro > 86 && this.ilinetyp[n30] != 167) {
                                this.rd.setColor(new Color(0, 0, 0));
                                if (this.ilinetyp[n30] != 20 && this.ilinetyp[n30] != 30 && this.ilinetyp[n30] != 40 && this.ilinetyp[n30] != 80 && this.ilinetyp[n30] != 90 && this.ilinetyp[n30] != 100) {
                                    if (this.ilinetyp[n30] >= 0) {
                                        this.rd.setFont(new Font("Tahoma", 1, 11));
                                    }
                                    else {
                                        this.rd.setFont(new Font("Tahoma", 0, 11));
                                    }
                                    this.rd.drawString(this.iline[n30], 217, 103 + 17 * n30 - this.scro);
                                    if (this.ilinetyp[n30] >= 0) {
                                        this.rd.setFont(new Font("Tahoma", 0, 11));
                                        this.ftm = this.rd.getFontMetrics();
                                        this.rd.setColor(this.color2k(125, 125, 125));
                                        this.rd.drawString(this.itimes[n30], 757 - this.ftm.stringWidth(this.itimes[n30]), 103 + 17 * n30 - this.scro);
                                    }
                                }
                                else {
                                    if (this.ilinetyp[n30] == 40) {
                                        if (this.stringbutton(this.rd, "  View War Declaration  ", 300, 112 + 17 * n30 - this.scro, 0, n, n2, b, 0, 0)) {
                                            this.viewgame2 = 1;
                                            this.nvgames2 = 4;
                                            this.viewwar2 = this.getSvalue(this.iline[n30], 1);
                                            if (this.iline[n30].startsWith("I|")) {
                                                this.ichlng = true;
                                            }
                                            else {
                                                this.ichlng = false;
                                            }
                                        }
                                        if (!this.iline[n30].endsWith("|out|")) {
                                            if (this.iline[n30].startsWith("Y|") && this.stringbutton(this.rd, "  Accept War  ", 441, 112 + 17 * n30 - this.scro, 0, n, n2, b, 0, 0)) {
                                                this.gs.sendtyp.sel = 7;
                                                this.sendwar = this.getSvalue(this.iline[n30], 1);
                                            }
                                        }
                                        else {
                                            this.rd.setColor(this.color2k(170, 170, 170));
                                            this.rd.drawString("[ Accepted or interaction replaced. ]", 490 - this.ftm.stringWidth("[ Accepted or interaction replaced. ]") / 2, 112 + 17 * n30 - this.scro);
                                        }
                                    }
                                    if (this.ilinetyp[n30] == 30) {
                                        if (this.stringbutton(this.rd, "  View Car Battle  ", 282, 112 + 17 * n30 - this.scro, 0, n, n2, b, 0, 0)) {
                                            this.viewgame2 = 1;
                                            this.nvgames2 = 2;
                                            this.viewwar2 = this.getSvalue(this.iline[n30], 3);
                                            if (this.iline[n30].startsWith("I|")) {
                                                this.ichlng = true;
                                            }
                                            else {
                                                this.ichlng = false;
                                            }
                                        }
                                        if (!this.iline[n30].endsWith("|out|")) {
                                            if (this.iline[n30].startsWith("Y|") && this.stringbutton(this.rd, "  Accept Battle  ", 410, 112 + 17 * n30 - this.scro, 0, n, n2, b, 0, 0)) {
                                                this.gs.sendtyp.sel = 6;
                                                this.itake = this.getSvalue(this.iline[n30], 1);
                                                this.igive = this.getSvalue(this.iline[n30], 2);
                                                this.sendwar = this.getSvalue(this.iline[n30], 3);
                                            }
                                        }
                                        else {
                                            this.rd.setColor(this.color2k(170, 170, 170));
                                            this.rd.drawString("[ Accepted or interaction replaced. ]", 454 - this.ftm.stringWidth("[ Accepted or interaction replaced. ]") / 2, 112 + 17 * n30 - this.scro);
                                        }
                                        this.rd.setFont(new Font("Tahoma", 0, 11));
                                        this.ftm = this.rd.getFontMetrics();
                                        if (this.stringbutton(this.rd, "  View Car  ", 217 + this.ftm.stringWidth(this.iline[n30 + 2]) + 47, 137 + 17 * n30 - this.scro, 6, n, n2, b, 0, 0)) {
                                            this.viewcar = this.getSvalue(this.iline[n30], 1);
                                            if (!this.claname.equals(this.intclan)) {
                                                this.claname = this.intclan;
                                                this.loadedc = false;
                                            }
                                            this.spos5 = 0;
                                            this.lspos5 = 0;
                                            this.cfase = 3;
                                            this.loadedcars = -1;
                                            this.loadedcar = 0;
                                            this.ctab = 2;
                                            this.tab = 3;
                                        }
                                        this.rd.setFont(new Font("Tahoma", 0, 11));
                                        this.ftm = this.rd.getFontMetrics();
                                        if (this.stringbutton(this.rd, "  View Car  ", 217 + this.ftm.stringWidth(this.iline[n30 + 3]) + 47, 154 + 17 * n30 - this.scro, 6, n, n2, b, 0, 0)) {
                                            this.viewcar = this.getSvalue(this.iline[n30], 2);
                                            if (!this.claname.equals(this.xt.clan)) {
                                                this.claname = this.xt.clan;
                                                this.loadedc = false;
                                            }
                                            this.spos5 = 0;
                                            this.lspos5 = 0;
                                            this.cfase = 3;
                                            this.loadedcars = -1;
                                            this.loadedcar = 0;
                                            this.ctab = 2;
                                            this.tab = 3;
                                        }
                                    }
                                    if (this.ilinetyp[n30] == 20) {
                                        if (this.stringbutton(this.rd, "  View Stage Battle  ", 289, 112 + 17 * n30 - this.scro, 0, n, n2, b, 0, 0)) {
                                            this.viewgame2 = 1;
                                            this.nvgames2 = 2;
                                            this.viewwar2 = this.getSvalue(this.iline[n30], 3);
                                            if (this.iline[n30].startsWith("I|")) {
                                                this.ichlng = true;
                                            }
                                            else {
                                                this.ichlng = false;
                                            }
                                        }
                                        if (!this.iline[n30].endsWith("|out|")) {
                                            if (this.iline[n30].startsWith("Y|") && this.stringbutton(this.rd, "  Accept Battle  ", 424, 112 + 17 * n30 - this.scro, 0, n, n2, b, 0, 0)) {
                                                this.gs.sendtyp.sel = 5;
                                                this.itake = this.getSvalue(this.iline[n30], 1);
                                                this.igive = this.getSvalue(this.iline[n30], 2);
                                                this.sendwar = this.getSvalue(this.iline[n30], 3);
                                            }
                                        }
                                        else {
                                            this.rd.setColor(this.color2k(170, 170, 170));
                                            this.rd.drawString("[ Accepted or interaction replaced. ]", 468 - this.ftm.stringWidth("[ Accepted or interaction replaced. ]") / 2, 112 + 17 * n30 - this.scro);
                                        }
                                        this.rd.setFont(new Font("Tahoma", 0, 11));
                                        this.ftm = this.rd.getFontMetrics();
                                        if (this.stringbutton(this.rd, "  View Stage  ", 217 + this.ftm.stringWidth(this.iline[n30 + 2]) + 54, 137 + 17 * n30 - this.scro, 6, n, n2, b, 0, 0)) {
                                            this.viewcar = this.getSvalue(this.iline[n30], 1);
                                            if (!this.claname.equals(this.intclan)) {
                                                this.claname = this.intclan;
                                                this.loadedc = false;
                                            }
                                            this.spos5 = 0;
                                            this.lspos5 = 0;
                                            this.cfase = 3;
                                            this.loadedstages = -1;
                                            this.loadedstage = 0;
                                            this.ctab = 3;
                                            this.tab = 3;
                                        }
                                        this.rd.setFont(new Font("Tahoma", 0, 11));
                                        this.ftm = this.rd.getFontMetrics();
                                        if (this.stringbutton(this.rd, "  View Stage  ", 217 + this.ftm.stringWidth(this.iline[n30 + 3]) + 54, 154 + 17 * n30 - this.scro, 6, n, n2, b, 0, 0)) {
                                            this.viewcar = this.getSvalue(this.iline[n30], 2);
                                            if (!this.claname.equals(this.xt.clan)) {
                                                this.claname = this.xt.clan;
                                                this.loadedc = false;
                                            }
                                            this.spos5 = 0;
                                            this.lspos5 = 0;
                                            this.cfase = 3;
                                            this.loadedstages = -1;
                                            this.loadedstage = 0;
                                            this.ctab = 3;
                                            this.tab = 3;
                                        }
                                    }
                                    if (this.ilinetyp[n30] == 80) {
                                        if (this.stringbutton(this.rd, "        View War        ", 284, 112 + 17 * n30 - this.scro, 0, n, n2, b, 0, 0)) {
                                            this.viewgame2 = 1;
                                            this.nvgames2 = 9;
                                            this.viewwar2 = this.getSvalue(this.iline[n30], 0);
                                        }
                                        if (this.stringbutton(this.rd, "  View Championship  ", 432, 112 + 17 * n30 - this.scro, 0, n, n2, b, 0, 0)) {
                                            this.cfase = 0;
                                            this.ntab = 1;
                                            this.loadwstat = 0;
                                            this.tab = 3;
                                        }
                                    }
                                    if (this.ilinetyp[n30] == 90) {
                                        if (this.stringbutton(this.rd, "        View Battle        ", 284, 112 + 17 * n30 - this.scro, 0, n, n2, b, 0, 0)) {
                                            this.viewgame2 = 1;
                                            this.nvgames2 = 5;
                                            this.viewwar2 = this.getSvalue(this.iline[n30], 0);
                                        }
                                        if (this.stringbutton(this.rd, "        View Car        ", 424, 112 + 17 * n30 - this.scro, 0, n, n2, b, 0, 0)) {
                                            this.viewcar = this.getSvalue(this.iline[n30], 1);
                                            final String svalue = this.getSvalue(this.iline[n30], 2);
                                            if (!this.claname.equals(svalue)) {
                                                this.claname = svalue;
                                                this.loadedc = false;
                                            }
                                            this.spos5 = 0;
                                            this.lspos5 = 0;
                                            this.cfase = 3;
                                            this.loadedcars = -1;
                                            this.loadedcar = 0;
                                            this.ctab = 2;
                                            this.tab = 3;
                                        }
                                    }
                                    if (this.ilinetyp[n30] == 100) {
                                        if (this.stringbutton(this.rd, "        View Battle        ", 284, 112 + 17 * n30 - this.scro, 0, n, n2, b, 0, 0)) {
                                            this.viewgame2 = 1;
                                            this.nvgames2 = 5;
                                            this.viewwar2 = this.getSvalue(this.iline[n30], 0);
                                        }
                                        if (this.stringbutton(this.rd, "        View Stage        ", 431, 112 + 17 * n30 - this.scro, 0, n, n2, b, 0, 0)) {
                                            this.viewcar = this.getSvalue(this.iline[n30], 1);
                                            final String svalue2 = this.getSvalue(this.iline[n30], 2);
                                            if (!this.claname.equals(svalue2)) {
                                                this.claname = svalue2;
                                                this.loadedc = false;
                                            }
                                            this.spos5 = 0;
                                            this.lspos5 = 0;
                                            this.cfase = 3;
                                            this.loadedstages = -1;
                                            this.loadedstage = 0;
                                            this.ctab = 3;
                                            this.tab = 3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.readint == 1) {
                        this.rd.setColor(this.color2k(240, 240, 240));
                        this.rd.fillRoundRect(387, 140, 200, 30, 20, 20);
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawRoundRect(387, 140, 200, 30, 20, 20);
                        this.rd.setFont(new Font("Tahoma", 1, 11));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.drawString("Reading...", 487 - this.ftm.stringWidth("Reading...") / 2, 160);
                    }
                    if (this.readint == 3) {
                        this.rd.setFont(new Font("Tahoma", 1, 11));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawString("Failed to fetch and load interaction.", 487 - this.ftm.stringWidth("Failed to fetch and load interaction.") / 2, 200);
                    }
                    if (this.readint == 4) {
                        this.rd.setFont(new Font("Tahoma", 1, 11));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawString("Failed to load interaction, server error, please try again later.", 487 - this.ftm.stringWidth("Failed to load interaction, server error, please try again later.") / 2, 200);
                    }
                    if (this.readint == 5) {
                        this.rd.setFont(new Font("Tahoma", 1, 11));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawString("Failed to send interaction, please try again later.", 487 - this.ftm.stringWidth("Failed to send interaction, please try again later.") / 2, 200);
                    }
                    if (this.readint == 6) {
                        this.rd.setFont(new Font("Tahoma", 1, 11));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawString("The war or battle you are trying to engage has expired or was not found...", 487 - this.ftm.stringWidth("The war or battle you are trying to engage has expired or was not found...") / 2, 200);
                    }
                    this.rd.setColor(this.color2k(240, 240, 240));
                    this.rd.fillRect(207, 47, 577, 39);
                    this.rd.fillRect(207, 360, 577, 70);
                    this.rd.setColor(this.color2k(205, 205, 205));
                    this.rd.drawLine(207, 86, 783, 86);
                    this.rd.drawLine(207, 86, 207, 360);
                    this.rd.drawLine(207, 360, 783, 360);
                    this.rd.fillRect(767, 104, 17, 239);
                    if (this.mscro4 == 831 || this.sdist == 0) {
                        if (this.sdist == 0) {
                            this.rd.setColor(this.color2k(205, 205, 205));
                        }
                        else {
                            this.rd.setColor(this.color2k(215, 215, 215));
                        }
                        this.rd.fillRect(767, 87, 17, 17);
                    }
                    else {
                        this.rd.setColor(this.color2k(220, 220, 220));
                        this.rd.fill3DRect(767, 87, 17, 17, true);
                    }
                    if (this.sdist != 0) {
                        this.rd.drawImage(this.xt.asu, 772, 93, null);
                    }
                    if (this.mscro4 == 832 || this.sdist == 0) {
                        if (this.sdist == 0) {
                            this.rd.setColor(this.color2k(205, 205, 205));
                        }
                        else {
                            this.rd.setColor(this.color2k(215, 215, 215));
                        }
                        this.rd.fillRect(767, 343, 17, 17);
                    }
                    else {
                        this.rd.setColor(this.color2k(220, 220, 220));
                        this.rd.fill3DRect(767, 343, 17, 17, true);
                    }
                    if (this.sdist != 0) {
                        this.rd.drawImage(this.xt.asd, 772, 350, null);
                    }
                    if (this.sdist != 0) {
                        if (this.lspos4 != this.spos4) {
                            this.rd.setColor(this.color2k(215, 215, 215));
                            this.rd.fillRect(767, 104 + this.spos4, 17, 31);
                        }
                        else {
                            if (this.mscro4 == 831) {
                                this.rd.setColor(this.color2k(215, 215, 215));
                            }
                            this.rd.fill3DRect(767, 104 + this.spos4, 17, 31, true);
                        }
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawLine(772, 117 + this.spos4, 778, 117 + this.spos4);
                        this.rd.drawLine(772, 119 + this.spos4, 778, 119 + this.spos4);
                        this.rd.drawLine(772, 121 + this.spos4, 778, 121 + this.spos4);
                        if (this.mscro4 > 800 && this.lspos4 != this.spos4) {
                            this.lspos4 = this.spos4;
                        }
                        if (b) {
                            if (this.mscro4 == 825 && n > 767 && n < 784 && n2 > 104 + this.spos4 && n2 < this.spos4 + 135) {
                                this.mscro4 = n2 - this.spos4;
                            }
                            if (this.mscro4 == 825 && n > 765 && n < 786 && n2 > 85 && n2 < 106) {
                                this.mscro4 = 831;
                            }
                            if (this.mscro4 == 825 && n > 765 && n < 786 && n2 > 341 && n2 < 362) {
                                this.mscro4 = 832;
                            }
                            if (this.mscro4 == 825 && n > 767 && n < 784 && n2 > 104 && n2 < 343) {
                                this.mscro4 = 119;
                                this.spos4 = n2 - this.mscro4;
                            }
                            int n31 = 2670 / this.sdist;
                            if (n31 < 1) {
                                n31 = 1;
                            }
                            if (this.mscro4 == 831) {
                                this.spos4 -= n31;
                                if (this.spos4 > 208) {
                                    this.spos4 = 208;
                                }
                                if (this.spos4 < 0) {
                                    this.spos4 = 0;
                                }
                                this.lspos4 = this.spos4;
                            }
                            if (this.mscro4 == 832) {
                                this.spos4 += n31;
                                if (this.spos4 > 208) {
                                    this.spos4 = 208;
                                }
                                if (this.spos4 < 0) {
                                    this.spos4 = 0;
                                }
                                this.lspos4 = this.spos4;
                            }
                            if (this.mscro4 < 800) {
                                this.spos4 = n2 - this.mscro4;
                                if (this.spos4 > 208) {
                                    this.spos4 = 208;
                                }
                                if (this.spos4 < 0) {
                                    this.spos4 = 0;
                                }
                            }
                            if (this.mscro4 == 825) {
                                this.mscro4 = 925;
                            }
                        }
                        else if (this.mscro4 != 825) {
                            this.mscro4 = 825;
                        }
                    }
                    if (this.dispi != 0) {
                        int width = 558;
                        if (this.viewgame2 != 0) {
                            width = 577;
                        }
                        this.rd.setColor(this.color2k(220, 220, 220));
                        this.rd.fillRect(207, 86, width, 41);
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawRect(207, 86, width, 41);
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.rd.setColor(new Color(0, 0, 0));
                        if (this.dispi == 1) {
                            this.rd.drawString("Car battle with " + this.intclan + " is on!", 215, 101);
                            this.rd.setFont(new Font("Arial", 0, 11));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.drawString("You win: [ " + this.dtcar + " ]", 215, 118);
                            int n32 = 215 + this.ftm.stringWidth("You win: [ " + this.dtcar + " ]") + 44;
                            if (this.stringbutton(this.rd, "View Car", n32, 119, 6, n, n2, b, 0, 0)) {
                                this.viewcar = this.dtcar;
                                if (!this.claname.equals(this.intclan)) {
                                    this.claname = this.intclan;
                                    this.loadedc = false;
                                }
                                this.spos5 = 0;
                                this.lspos5 = 0;
                                this.cfase = 3;
                                this.loadedcars = -1;
                                this.loadedcar = 0;
                                this.ctab = 2;
                                this.tab = 3;
                            }
                            n32 += 44;
                            this.rd.setFont(new Font("Arial", 0, 11));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.drawString("You lose: [ " + this.dgcar + " ]", n32, 118);
                            if (this.stringbutton(this.rd, "View Car", n32 + (this.ftm.stringWidth("You lose: [ " + this.dgcar + " ]") + 44), 119, 6, n, n2, b, 0, 0)) {
                                this.viewcar = this.dgcar;
                                if (!this.claname.equals(this.xt.clan)) {
                                    this.claname = this.xt.clan;
                                    this.loadedc = false;
                                }
                                this.spos5 = 0;
                                this.lspos5 = 0;
                                this.cfase = 3;
                                this.loadedcars = -1;
                                this.loadedcar = 0;
                                this.ctab = 2;
                                this.tab = 3;
                            }
                            if (this.stringbutton(this.rd, "View Battle", 714, 111, 0, n, n2, b, 0, 0)) {
                                this.viewgame2 = 1;
                                this.nvgames2 = 5;
                                this.viewwar2 = this.dwarn;
                            }
                        }
                        if (this.dispi == 2) {
                            this.rd.drawString("Stage battle with " + this.intclan + " is on!", 215, 101);
                            this.rd.setFont(new Font("Arial", 0, 11));
                            this.ftm = this.rd.getFontMetrics();
                            String s2 = this.dtcar;
                            if (s2.length() > 10) {
                                s2 = "" + s2.substring(0, 10) + "...";
                            }
                            this.rd.drawString("You win: [ " + s2 + " ]", 215, 118);
                            int n33 = 215 + this.ftm.stringWidth("You win: [ " + s2 + " ]") + 51;
                            if (this.stringbutton(this.rd, "View Stage", n33, 119, 6, n, n2, b, 0, 0)) {
                                this.viewcar = this.dtcar;
                                if (!this.claname.equals(this.intclan)) {
                                    this.claname = this.intclan;
                                    this.loadedc = false;
                                }
                                this.spos5 = 0;
                                this.lspos5 = 0;
                                this.cfase = 3;
                                this.loadedstages = -1;
                                this.loadedstage = 0;
                                this.ctab = 3;
                                this.tab = 3;
                            }
                            n33 += 51;
                            this.rd.setFont(new Font("Arial", 0, 11));
                            this.ftm = this.rd.getFontMetrics();
                            String s3 = this.dgcar;
                            if (s3.length() > 10) {
                                s3 = "" + s3.substring(0, 10) + "...";
                            }
                            this.rd.drawString("You lose: [ " + s3 + " ]", n33, 118);
                            if (this.stringbutton(this.rd, "View Stage", n33 + (this.ftm.stringWidth("You lose: [ " + s3 + " ]") + 51), 119, 6, n, n2, b, 0, 0)) {
                                this.viewcar = this.dgcar;
                                if (!this.claname.equals(this.xt.clan)) {
                                    this.claname = this.xt.clan;
                                    this.loadedc = false;
                                }
                                this.spos5 = 0;
                                this.lspos5 = 0;
                                this.cfase = 3;
                                this.loadedstages = -1;
                                this.loadedstage = 0;
                                this.ctab = 3;
                                this.tab = 3;
                            }
                            if (this.stringbutton(this.rd, "View Battle", 714, 111, 0, n, n2, b, 0, 0)) {
                                this.viewgame2 = 1;
                                this.nvgames2 = 5;
                                this.viewwar2 = this.dwarn;
                            }
                        }
                        if (this.dispi == 3) {
                            this.rd.drawString("War between your clan and " + this.intclan + " has started!", 227, 111);
                            if (this.stringbutton(this.rd, "         View War         ", 670, 111, 0, n, n2, b, 0, 0)) {
                                this.viewgame2 = 1;
                                this.nvgames2 = 9;
                                this.viewwar2 = this.dwarn;
                            }
                        }
                    }
                    if (this.viewgame2 != 0) {
                        this.rd.setColor(this.color2k(210, 210, 210));
                        this.rd.fillRoundRect(204, 127, 583, 230, 20, 20);
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawRoundRect(204, 127, 583, 230, 20, 20);
                        this.rd.setFont(new Font("Tahoma", 1, 11));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.setColor(new Color(0, 0, 0));
                        if (this.nvgames2 == 4) {
                            this.rd.drawString("War declaration, your clan " + this.xt.clan + " versus " + this.intclan + ".", 215, 145);
                            if (this.viewgame2 == 2) {
                                if (this.ichlng) {
                                    this.rd.drawString("" + this.intclan + " would create 5 more games and the first clan to win 5 games wins the war!", 215, 210 + this.nvgames2 * 18);
                                }
                                else {
                                    this.rd.drawString("Your clan would create 5 more games and the first clan to win 5 games wins the war!", 215, 210 + this.nvgames2 * 18);
                                }
                            }
                        }
                        if (this.nvgames2 == 2) {
                            this.rd.drawString("Battle, your clan " + this.xt.clan + " versus " + this.intclan + ".", 215, 145);
                            if (this.viewgame2 == 2) {
                                if (this.ichlng) {
                                    this.rd.drawString("" + this.intclan + " would create 3 more games and the first clan to win 3 games wins the battle!", 215, 210 + this.nvgames2 * 18);
                                }
                                else {
                                    this.rd.drawString("Your clan would create 3 more games and the first clan to win 3 games wins the battle!", 215, 210 + this.nvgames2 * 18);
                                }
                            }
                        }
                        if ((this.nvgames2 == 9 || this.nvgames2 == 5) && this.viewgame2 == 2) {
                            this.rd.drawString("" + this.xt.clan + "  " + this.vwscorex + "           |           " + this.intclan + "  " + this.vwscorei + "", 505 - this.ftm.stringWidth("" + this.xt.clan + "  " + this.vwscorex + "           |           " + this.intclan + "  " + this.vwscorei + "") / 2, 145);
                            this.rd.drawRect(320, 131, 370, 19);
                        }
                        if (this.stringbutton(this.rd, "Close X", 749, 148, 3, n, n2, b, 0, 0)) {
                            this.viewgame2 = 0;
                        }
                        this.rd.setFont(new Font("Tahoma", 1, 11));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.setColor(new Color(0, 0, 0));
                        if (this.viewgame2 == 2) {
                            this.rd.drawString("Game", 246 - this.ftm.stringWidth("Game") / 2, 175);
                            this.rd.drawString("Stage", 412 - this.ftm.stringWidth("Stage") / 2, 175);
                            this.rd.drawString("Laps", 564 - this.ftm.stringWidth("Laps") / 2, 175);
                            this.rd.drawString("Type of Cars", 653 - this.ftm.stringWidth("Type of Cars") / 2, 175);
                            this.rd.drawString("Fixing", 751 - this.ftm.stringWidth("Fixing") / 2, 175);
                            int n34 = 1;
                            int n35 = 1;
                            if (this.nvgames2 == 4 || this.nvgames2 == 2) {
                                n34 = 2;
                                n35 = 2;
                            }
                            for (int n36 = 0; n36 < this.nvgames2; ++n36) {
                                if (!this.vwinner[n36].equals("")) {
                                    this.rd.setColor(this.color2k(220, 220, 220));
                                    this.rd.fillRect(213, 180 + n36 * 18, 565, 18);
                                    this.rd.setColor(new Color(0, 0, 0));
                                }
                                this.rd.setFont(new Font("Tahoma", 0, 11));
                                this.ftm = this.rd.getFontMetrics();
                                this.rd.drawString("# " + n34 + "", 246 - this.ftm.stringWidth("# " + n34 + "") / 2, 193 + n36 * 18);
                                n34 += n35;
                                this.rd.drawString(this.vwstages2[n36], 412 - this.ftm.stringWidth(this.vwstages2[n36]) / 2, 193 + n36 * 18);
                                this.rd.drawString("" + this.vwlaps2[n36] + "", 564 - this.ftm.stringWidth("" + this.vwlaps2[n36] + "") / 2, 193 + n36 * 18);
                                String str5 = "All Cars";
                                if (this.vwcars2[n36] == 2) {
                                    str5 = "Clan Cars";
                                }
                                if (this.vwcars2[n36] == 3) {
                                    str5 = "Game Cars";
                                }
                                if (this.vwclass2[n36] == 0) {
                                    str5 += ", All Classes";
                                }
                                if (this.vwclass2[n36] == 1) {
                                    str5 += ", Class C";
                                }
                                if (this.vwclass2[n36] == 2) {
                                    str5 += ", Class B & C";
                                }
                                if (this.vwclass2[n36] == 3) {
                                    str5 += ", Class B";
                                }
                                if (this.vwclass2[n36] == 4) {
                                    str5 += ", Class A & B";
                                }
                                if (this.vwclass2[n36] == 5) {
                                    str5 += ", Class A";
                                }
                                this.rd.drawString(str5, 653 - this.ftm.stringWidth(str5) / 2, 193 + n36 * 18);
                                String str6 = "Infinite";
                                if (this.vwfix2[n36] == 1) {
                                    str6 = "4 Fixes";
                                }
                                if (this.vwfix2[n36] == 2) {
                                    str6 = "3 Fixes";
                                }
                                if (this.vwfix2[n36] == 3) {
                                    str6 = "2 Fixes";
                                }
                                if (this.vwfix2[n36] == 4) {
                                    str6 = "1 Fix";
                                }
                                if (this.vwfix2[n36] == 5) {
                                    str6 = "No Fixing";
                                }
                                this.rd.drawString(str6, 751 - this.ftm.stringWidth(str6) / 2, 193 + n36 * 18);
                                this.rd.drawRect(213, 180 + n36 * 18, 565, 18);
                            }
                            this.rd.drawLine(213, 162, 213, 180 + this.nvgames2 * 18);
                            this.rd.drawLine(279, 162, 279, 180 + this.nvgames2 * 18);
                            this.rd.drawLine(546, 162, 546, 180 + this.nvgames2 * 18);
                            this.rd.drawLine(583, 162, 583, 180 + this.nvgames2 * 18);
                            this.rd.drawLine(723, 162, 723, 180 + this.nvgames2 * 18);
                            this.rd.drawLine(778, 162, 778, 180 + this.nvgames2 * 18);
                            for (int n37 = 0; n37 < this.nvgames2; ++n37) {
                                if (n > 213 && n < 778 && n2 > 180 + n37 * 18 && n2 < 198 + n37 * 18 && !this.vwinner[n37].equals("")) {
                                    this.rd.setColor(this.color2k(230, 230, 230));
                                    this.rd.fillRect(213, 180 + n37 * 18, 565, 18);
                                    this.rd.setColor(new Color(0, 0, 0));
                                    this.rd.setFont(new Font("Tahoma", 1, 11));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.drawString("" + this.vwinner[n37] + "  Wins!", 495 - this.ftm.stringWidth("" + this.vwinner[n37] + "  Wins!") / 2, 193 + n37 * 18);
                                    this.rd.drawRect(213, 180 + n37 * 18, 565, 18);
                                }
                            }
                        }
                        if (this.viewgame2 == 1) {
                            this.rd.drawString("Loading...", 495 - this.ftm.stringWidth("Loading...") / 2, 242);
                        }
                        if (this.viewgame2 == 3) {
                            if (this.nvgames2 == 4 || this.nvgames2 == 9) {
                                this.rd.drawString("This war has expired and no longer exists.", 495 - this.ftm.stringWidth("This war has expired and no longer exists.") / 2, 232);
                            }
                            if (this.nvgames2 == 2 || this.nvgames2 == 5) {
                                this.rd.drawString("This battle has expired and no longer exists.", 495 - this.ftm.stringWidth("This battle has expired and no longer exists.") / 2, 232);
                            }
                            if (this.nvgames2 == 9 || this.nvgames2 == 5) {
                                this.rd.drawString("(Started/finished wars and battles expire after 180 days.)", 495 - this.ftm.stringWidth("(Started/finished wars and battles expire after 180 days.)") / 2, 252);
                            }
                            else {
                                this.rd.drawString("(Suggestions expire after 90 days.)", 495 - this.ftm.stringWidth("(Suggestions expire after 90 days.)") / 2, 252);
                            }
                        }
                        if (this.viewgame2 == 4) {
                            this.rd.drawString("Error loading games, please try again later...", 495 - this.ftm.stringWidth("Error loading games, please try again later...") / 2, 242);
                        }
                    }
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    if (!this.drawl(this.rd, "#" + this.intclan + "#", 207, 47, true)) {
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawString(this.intclan, 382 - this.ftm.stringWidth(this.intclan) / 2, 66);
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawRect(207, 47, 349, 29);
                    }
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawString("::  Versus your clan", 566, 72);
                    if (n > 207 && n < 557 && n2 > 47 && n2 < 77) {
                        this.cur = 12;
                        if (b) {
                            if (!this.claname.equals(this.intclan)) {
                                this.claname = this.intclan;
                                this.loadedc = false;
                            }
                            this.spos5 = 0;
                            this.lspos5 = 0;
                            this.cfase = 3;
                            this.ctab = 0;
                            this.tab = 3;
                        }
                    }
                    if (this.stringbutton(this.rd, "Close X", 752, 66, 0, n, n2, b, 0, 0)) {
                        this.openi = 0;
                        this.readint = 0;
                        this.viewgame2 = 0;
                    }
                    if (this.gs.sendtyp.getSelectedIndex() < 5) {
                        if (!this.gs.sendtyp.isShowing()) {
                            this.gs.sendtyp.show();
                        }
                        this.gs.sendtyp.move(207, 365);
                    }
                    else {
                        this.gs.sendtyp.hide();
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.rd.setColor(new Color(0, 0, 0));
                        if (this.gs.sendtyp.getSelectedIndex() == 5) {
                            this.rd.drawString("::  Accept Stage Battle", 207, 382);
                        }
                        if (this.gs.sendtyp.getSelectedIndex() == 6) {
                            this.rd.drawString("::  Accept Car Battle", 207, 382);
                        }
                        if (this.gs.sendtyp.getSelectedIndex() == 7) {
                            this.rd.drawString("::  Accept War", 207, 382);
                        }
                        if (this.stringbutton(this.rd, "  Cancel  ", 742, 382, 3, n, n2, b, 0, 0)) {
                            this.gs.sendtyp.select(0);
                        }
                    }
                    if (this.sendint != 0) {
                        this.gs.sendtyp.disable();
                    }
                    else {
                        this.gs.sendtyp.enable();
                    }
                    if (this.intsel != this.gs.sendtyp.getSelectedIndex()) {
                        this.gs.senditem.hide();
                        this.gs.datat.hide();
                        this.gs.ilaps.hide();
                        this.gs.icars.hide();
                        this.gs.sclass.hide();
                        this.gs.sfix.hide();
                        this.gs.senditem.enable();
                        this.gs.datat.enable();
                        this.gs.ilaps.enable();
                        this.gs.icars.enable();
                        this.gs.sclass.enable();
                        this.gs.sfix.enable();
                        this.intsel = this.gs.sendtyp.getSelectedIndex();
                        this.inishsel = true;
                    }
                    if (this.gs.sendtyp.getSelectedIndex() == 0) {
                        this.dommsg = true;
                        if (this.sendint == 0) {
                            if (this.stringbutton(this.rd, "   Send  >  ", 723, 408, 0, n, n2, b, 0, 0) && !this.gs.mmsg.getText().trim().equals("") && this.gs.mmsg.getText().toLowerCase().indexOf(this.gs.tpass.getText().toLowerCase()) == -1 && this.xt.acexp != -3) {
                                if (!this.xt.msgcheck(this.gs.mmsg.getText())) {
                                    this.sendint = 1;
                                }
                                else {
                                    this.gs.sendtyp.hide();
                                    final xtGraphics xt2 = this.xt;
                                    ++xt2.warning;
                                }
                            }
                        }
                        else {
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.drawString("Sending...", 723 - this.ftm.stringWidth("Sending...") / 2, 408);
                        }
                    }
                    if (this.gs.sendtyp.getSelectedIndex() == 1) {
                        this.rd.setFont(new Font("Arial", 0, 12));
                        this.rd.drawString("A date that gets converted to the local time of any person previewing it.", 376, 382);
                        if (!this.gs.senditem.isShowing()) {
                            this.gs.senditem.removeAll();
                            final Calendar instance2 = Calendar.getInstance();
                            int n38 = 0;
                            for (int n39 = 0; n39 < 20; ++n39) {
                                String str7 = this.wday[instance2.get(7) - 1];
                                if (n38 == 0) {
                                    str7 = "Today";
                                    n38 = 1;
                                }
                                this.gs.senditem.add(this.rd, "" + str7 + "  -  " + this.month[instance2.get(2)] + " " + instance2.get(5) + "");
                                instance2.roll(5, true);
                            }
                            this.gs.senditem.select(0);
                            this.gs.senditem.show();
                        }
                        if (!this.gs.datat.isShowing()) {
                            this.gs.datat.removeAll();
                            int i2 = 12;
                            String str8 = "PM";
                            for (int n40 = 0; n40 < 24; ++n40) {
                                this.gs.datat.add(this.rd, "" + i2 + " " + str8 + "");
                                if (++i2 == 12) {
                                    str8 = "AM";
                                }
                                if (i2 == 13) {
                                    i2 = 1;
                                }
                            }
                            this.gs.datat.select(0);
                            this.gs.datat.show();
                        }
                        this.gs.senditem.move(300, 395);
                        this.gs.datat.move(491, 395);
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.drawString("Date is displayed based on your computer calendar's date/time, please make sure it is correct.", 207, 435);
                        if (this.sendint == 0) {
                            if (this.stringbutton(this.rd, "   Send  >  ", 723, 408, 0, n, n2, b, 0, 0)) {
                                this.sendint = 1;
                            }
                        }
                        else {
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.drawString("Sending...", 723 - this.ftm.stringWidth("Sending...") / 2, 408);
                        }
                    }
                    if (this.gs.sendtyp.getSelectedIndex() == 2) {
                        if (this.inishsel) {
                            if (this.redif) {
                                this.ifas = 1;
                                this.gs.datat.removeAll();
                                for (int n41 = 0; n41 < this.gs.clcars.getItemCount(); ++n41) {
                                    this.gs.datat.add(this.rd, this.gs.clcars.getItem(n41));
                                }
                                this.gs.datat.select(this.gs.clcars.getSelectedIndex());
                                this.redif = false;
                            }
                            else {
                                this.ifas = 0;
                                this.gs.datat.removeAll();
                                this.gs.datat.add(this.rd, "Loading " + this.intclan + "'s stages, please wait...");
                            }
                            this.imsg = "Battle over a stage that belongs to " + this.intclan + " to take it.";
                            this.iflk = 0;
                            if (this.sendwarnum) {
                                this.ifas = 4;
                                this.sendint = 1;
                                this.gs.senditem.disable();
                                this.gs.datat.disable();
                                this.gs.ilaps.disable();
                                this.gs.icars.disable();
                                this.gs.sclass.disable();
                                this.gs.sfix.disable();
                            }
                        }
                        this.rd.setFont(new Font("Arial", 0, 12));
                        if (this.iflk % 3 != 0 || this.iflk == 0) {
                            this.rd.drawString(this.imsg, 376, 382);
                        }
                        if (this.iflk != 0) {
                            --this.iflk;
                        }
                        if (this.ifas == 0 || this.ifas == 1) {
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.rd.drawString("Choose the stage of " + this.intclan + " you want to take to your clan, if you win!", 207, 402);
                            if (!this.gs.datat.isShowing()) {
                                this.gs.datat.show();
                            }
                            this.gs.datat.move(495 - this.gs.datat.getWidth() / 2, 410);
                        }
                        if (this.ifas == 2 || this.ifas == 3) {
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.rd.drawString("Choose a stage of your clan that you would give to " + this.intclan + ", if you lose!", 207, 402);
                            if (!this.gs.datat.isShowing()) {
                                this.gs.datat.show();
                            }
                            this.gs.datat.move(495 - this.gs.datat.getWidth() / 2, 410);
                        }
                        if (this.ifas == 4 || this.ifas == 5) {
                            if (this.ifas == 4) {
                                this.isel = 0;
                                this.gs.senditem.removeAll();
                                this.gs.senditem.add(this.rd, " NFM Multiplayer ");
                                this.gs.senditem.add(this.rd, " NFM 2     ");
                                this.gs.senditem.add(this.rd, " NFM 1     ");
                                this.gs.senditem.add(this.rd, " Clan Stages ");
                                this.gs.senditem.select(0);
                                this.gs.datat.removeAll();
                                this.gs.datat.add(this.rd, "Select Stage");
                                for (int n42 = 0; n42 < 5; ++n42) {
                                    this.gs.datat.add(this.rd, " Stage " + (n42 + 1) + "");
                                }
                                this.gs.datat.select(0);
                                this.gs.ilaps.hide();
                                this.gs.icars.hide();
                                this.gs.sclass.hide();
                                this.gs.sfix.hide();
                                this.ifas = 5;
                            }
                            this.rd.setFont(new Font("Arial", 0, 12));
                            if (this.iflk % 3 != 0 || this.iflk == 0) {
                                this.rd.drawString(this.imsg, 376, 382);
                            }
                            if (this.iflk != 0) {
                                --this.iflk;
                            }
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.rd.drawString("Game #" + (this.wag * 2 + 2) + " :", 207, 407);
                            if (!this.gs.senditem.isShowing()) {
                                this.gs.senditem.show();
                            }
                            this.gs.senditem.move(280, 390);
                            if (!this.gs.datat.isShowing()) {
                                this.gs.datat.show();
                            }
                            this.gs.datat.move(286 + this.gs.senditem.getWidth(), 390);
                            final int n43 = 207;
                            if (!this.gs.ilaps.isShowing()) {
                                this.gs.ilaps.show();
                                this.gs.ilaps.select(0);
                            }
                            this.gs.ilaps.move(n43, 415);
                            final int n44 = n43 + (6 + this.gs.ilaps.getWidth());
                            if (!this.gs.icars.isShowing()) {
                                this.gs.icars.show();
                                this.gs.icars.select(0);
                            }
                            this.gs.icars.move(n44, 415);
                            final int n45 = n44 + (6 + this.gs.icars.getWidth());
                            if (!this.gs.sclass.isShowing()) {
                                this.gs.sclass.show();
                                this.gs.sclass.select(0);
                            }
                            this.gs.sclass.move(n45, 415);
                            this.gs.sclass.revup = true;
                            final int n46 = n45 + (6 + this.gs.sclass.getWidth());
                            if (!this.gs.sfix.isShowing()) {
                                this.gs.sfix.show();
                                this.gs.sfix.select(0);
                            }
                            this.gs.sfix.move(n46, 415);
                            this.gs.sfix.revup = true;
                            this.gs.datat.setSize(n46 + this.gs.sfix.getWidth() - 286 - this.gs.senditem.getWidth(), 22);
                            if (this.gs.senditem.getSelectedIndex() == 0 && this.isel != 0) {
                                this.gs.datat.removeAll();
                                this.gs.datat.add(this.rd, "Select Stage");
                                for (int n47 = 0; n47 < 5; ++n47) {
                                    this.gs.datat.add(this.rd, " Stage " + (n47 + 1) + "");
                                }
                                this.gs.datat.select(0);
                                this.isel = 0;
                            }
                            if (this.gs.senditem.getSelectedIndex() == 1 && this.isel != 1) {
                                this.gs.datat.removeAll();
                                this.gs.datat.add(this.rd, "Select Stage");
                                for (int n48 = 0; n48 < 17; ++n48) {
                                    this.gs.datat.add(this.rd, " Stage " + (n48 + 1) + "");
                                }
                                this.gs.datat.select(0);
                                this.isel = 1;
                            }
                            if (this.gs.senditem.getSelectedIndex() == 2 && this.isel != 2) {
                                this.gs.datat.removeAll();
                                this.gs.datat.add(this.rd, "Select Stage");
                                for (int n49 = 0; n49 < 10; ++n49) {
                                    this.gs.datat.add(this.rd, " Stage " + (n49 + 1) + "");
                                }
                                this.gs.datat.select(0);
                                this.isel = 2;
                            }
                            if (this.gs.senditem.getSelectedIndex() == 3 && this.isel < 3) {
                                this.gs.datat.removeAll();
                                this.gs.datat.add(this.rd, "Loading stages, please wait...");
                                this.gs.datat.select(0);
                                this.isel = 3;
                            }
                        }
                        if (this.sendint == 0) {
                            String s4 = "  Next >  ";
                            if (this.ifas == 5 && this.wag == 1) {
                                s4 = "   Done   ";
                            }
                            if (this.stringbutton(this.rd, s4, 742, 417, 0, n, n2, b, 0, 0)) {
                                if (this.ifas == 4 || this.ifas == 5) {
                                    if (this.gs.datat.getSelectedIndex() != 0) {
                                        if (this.gs.ilaps.getSelectedIndex() != 0) {
                                            if (this.gs.icars.getSelectedIndex() != 0) {
                                                if (this.gs.senditem.getSelectedIndex() == 0) {
                                                    this.wstages[this.wag] = "#" + (this.gs.datat.getSelectedIndex() + 27) + "";
                                                }
                                                if (this.gs.senditem.getSelectedIndex() == 1) {
                                                    this.wstages[this.wag] = "#" + (this.gs.datat.getSelectedIndex() + 10) + "";
                                                }
                                                if (this.gs.senditem.getSelectedIndex() == 2) {
                                                    this.wstages[this.wag] = "#" + this.gs.datat.getSelectedIndex() + "";
                                                }
                                                if (this.gs.senditem.getSelectedIndex() == 3) {
                                                    this.wstages[this.wag] = "" + this.gs.datat.getSelectedItem() + "";
                                                }
                                                this.wlaps[this.wag] = this.gs.ilaps.getSelectedIndex();
                                                this.wcars[this.wag] = this.gs.icars.getSelectedIndex();
                                                this.wclass[this.wag] = this.gs.sclass.getSelectedIndex();
                                                this.wfix[this.wag] = this.gs.sfix.getSelectedIndex();
                                                ++this.wag;
                                                if (this.wag < 2) {
                                                    this.ifas = 4;
                                                    this.imsg = "Create second game.";
                                                }
                                                else {
                                                    --this.wag;
                                                    this.sendint = 1;
                                                    this.gs.senditem.disable();
                                                    this.gs.datat.disable();
                                                    this.gs.ilaps.disable();
                                                    this.gs.icars.disable();
                                                    this.gs.sclass.disable();
                                                    this.gs.sfix.disable();
                                                }
                                            }
                                            else {
                                                this.imsg = "Please choose a type of cars for this game!";
                                                this.iflk = 40;
                                            }
                                        }
                                        else {
                                            this.imsg = "Please select a number of laps!";
                                            this.iflk = 40;
                                        }
                                    }
                                    else {
                                        this.imsg = "Please select a stage!";
                                        this.iflk = 40;
                                    }
                                }
                                if (this.ifas == 2 || this.ifas == 3) {
                                    if (this.gs.datat.getSelectedIndex() == 0) {
                                        this.imsg = "Please choose a stage to give to " + this.intclan + " if you lose!";
                                        this.iflk = 40;
                                    }
                                    else {
                                        this.imsg = "Create 2 games and " + this.intclan + " will create another 3.";
                                        this.iflk = 0;
                                        this.igive = this.gs.datat.getSelectedItem();
                                        this.ifas = 4;
                                        this.wag = 0;
                                    }
                                }
                                if (this.ifas == 0 || this.ifas == 1) {
                                    if (this.gs.datat.getSelectedIndex() == 0) {
                                        this.imsg = "Please choose a stage to battle over!";
                                        this.iflk = 40;
                                    }
                                    else {
                                        this.imsg = "Battle over a stage that belongs to " + this.intclan + " to take it.";
                                        this.iflk = 0;
                                        this.itake = this.gs.datat.getSelectedItem();
                                        this.gs.datat.removeAll();
                                        this.gs.datat.add(this.rd, "Loading your clan's stages, please wait...");
                                        this.ifas = 2;
                                    }
                                }
                            }
                        }
                        else {
                            this.imsg = "Sending stage battle, pleas wait...";
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.drawString("Sending...", 742 - this.ftm.stringWidth("Sending...") / 2, 417);
                        }
                    }
                    if (this.gs.sendtyp.getSelectedIndex() == 3) {
                        if (this.inishsel) {
                            if (this.redif) {
                                this.ifas = 1;
                                this.gs.datat.removeAll();
                                for (int n50 = 0; n50 < this.gs.clcars.getItemCount(); ++n50) {
                                    this.gs.datat.add(this.rd, this.gs.clcars.getItem(n50));
                                }
                                this.gs.datat.select(this.gs.clcars.getSelectedIndex());
                                this.redif = false;
                            }
                            else {
                                this.ifas = 0;
                                this.gs.datat.removeAll();
                                this.gs.datat.add(this.rd, "Loading " + this.intclan + "'s cars, please wait...");
                            }
                            this.imsg = "Battle over a car that belongs to " + this.intclan + " to take it.";
                            this.iflk = 0;
                            if (this.sendwarnum) {
                                this.ifas = 4;
                                this.sendint = 1;
                                this.gs.senditem.disable();
                                this.gs.datat.disable();
                                this.gs.ilaps.disable();
                                this.gs.icars.disable();
                                this.gs.sclass.disable();
                                this.gs.sfix.disable();
                            }
                        }
                        this.rd.setFont(new Font("Arial", 0, 12));
                        if (this.iflk % 3 != 0 || this.iflk == 0) {
                            this.rd.drawString(this.imsg, 376, 382);
                        }
                        if (this.iflk != 0) {
                            --this.iflk;
                        }
                        if (this.ifas == 0 || this.ifas == 1) {
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.rd.drawString("Choose the car of " + this.intclan + " you want to take to your clan, if you win!", 207, 402);
                            if (!this.gs.datat.isShowing()) {
                                this.gs.datat.show();
                            }
                            this.gs.datat.move(495 - this.gs.datat.getWidth() / 2, 410);
                        }
                        if (this.ifas == 2 || this.ifas == 3) {
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.rd.drawString("Choose a car of your clan that you would give to " + this.intclan + ", if you lose!", 207, 402);
                            if (!this.gs.datat.isShowing()) {
                                this.gs.datat.show();
                            }
                            this.gs.datat.move(495 - this.gs.datat.getWidth() / 2, 410);
                        }
                        if (this.ifas == 4 || this.ifas == 5) {
                            if (this.ifas == 4) {
                                this.isel = 0;
                                this.gs.senditem.removeAll();
                                this.gs.senditem.add(this.rd, " NFM Multiplayer ");
                                this.gs.senditem.add(this.rd, " NFM 2     ");
                                this.gs.senditem.add(this.rd, " NFM 1     ");
                                this.gs.senditem.add(this.rd, " Clan Stages ");
                                this.gs.senditem.select(0);
                                this.gs.datat.removeAll();
                                this.gs.datat.add(this.rd, "Select Stage");
                                for (int n51 = 0; n51 < 5; ++n51) {
                                    this.gs.datat.add(this.rd, " Stage " + (n51 + 1) + "");
                                }
                                this.gs.datat.select(0);
                                this.gs.ilaps.hide();
                                this.gs.icars.hide();
                                this.gs.sclass.hide();
                                this.gs.sfix.hide();
                                this.ifas = 5;
                            }
                            this.rd.setFont(new Font("Arial", 0, 12));
                            if (this.iflk % 3 != 0 || this.iflk == 0) {
                                this.rd.drawString(this.imsg, 376, 382);
                            }
                            if (this.iflk != 0) {
                                --this.iflk;
                            }
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.rd.drawString("Game #" + (this.wag * 2 + 2) + " :", 207, 407);
                            if (!this.gs.senditem.isShowing()) {
                                this.gs.senditem.show();
                            }
                            this.gs.senditem.move(280, 390);
                            if (!this.gs.datat.isShowing()) {
                                this.gs.datat.show();
                            }
                            this.gs.datat.move(286 + this.gs.senditem.getWidth(), 390);
                            final int n52 = 207;
                            if (!this.gs.ilaps.isShowing()) {
                                this.gs.ilaps.show();
                                this.gs.ilaps.select(0);
                            }
                            this.gs.ilaps.move(n52, 415);
                            final int n53 = n52 + (6 + this.gs.ilaps.getWidth());
                            if (!this.gs.icars.isShowing()) {
                                this.gs.icars.show();
                                this.gs.icars.select(0);
                            }
                            this.gs.icars.move(n53, 415);
                            final int n54 = n53 + (6 + this.gs.icars.getWidth());
                            if (!this.gs.sclass.isShowing()) {
                                this.gs.sclass.show();
                                this.gs.sclass.select(0);
                            }
                            this.gs.sclass.move(n54, 415);
                            this.gs.sclass.revup = true;
                            final int n55 = n54 + (6 + this.gs.sclass.getWidth());
                            if (!this.gs.sfix.isShowing()) {
                                this.gs.sfix.show();
                                this.gs.sfix.select(0);
                            }
                            this.gs.sfix.move(n55, 415);
                            this.gs.sfix.revup = true;
                            this.gs.datat.setSize(n55 + this.gs.sfix.getWidth() - 286 - this.gs.senditem.getWidth(), 22);
                            if (this.gs.senditem.getSelectedIndex() == 0 && this.isel != 0) {
                                this.gs.datat.removeAll();
                                this.gs.datat.add(this.rd, "Select Stage");
                                for (int n56 = 0; n56 < 5; ++n56) {
                                    this.gs.datat.add(this.rd, " Stage " + (n56 + 1) + "");
                                }
                                this.gs.datat.select(0);
                                this.isel = 0;
                            }
                            if (this.gs.senditem.getSelectedIndex() == 1 && this.isel != 1) {
                                this.gs.datat.removeAll();
                                this.gs.datat.add(this.rd, "Select Stage");
                                for (int n57 = 0; n57 < 17; ++n57) {
                                    this.gs.datat.add(this.rd, " Stage " + (n57 + 1) + "");
                                }
                                this.gs.datat.select(0);
                                this.isel = 1;
                            }
                            if (this.gs.senditem.getSelectedIndex() == 2 && this.isel != 2) {
                                this.gs.datat.removeAll();
                                this.gs.datat.add(this.rd, "Select Stage");
                                for (int n58 = 0; n58 < 10; ++n58) {
                                    this.gs.datat.add(this.rd, " Stage " + (n58 + 1) + "");
                                }
                                this.gs.datat.select(0);
                                this.isel = 2;
                            }
                            if (this.gs.senditem.getSelectedIndex() == 3 && this.isel < 3) {
                                this.gs.datat.removeAll();
                                this.gs.datat.add(this.rd, "Loading stages, please wait...");
                                this.gs.datat.select(0);
                                this.isel = 3;
                            }
                        }
                        if (this.sendint == 0) {
                            String s5 = "  Next >  ";
                            if (this.ifas == 5 && this.wag == 1) {
                                s5 = "   Done   ";
                            }
                            if (this.stringbutton(this.rd, s5, 742, 417, 0, n, n2, b, 0, 0)) {
                                if (this.ifas == 4 || this.ifas == 5) {
                                    if (this.gs.datat.getSelectedIndex() != 0) {
                                        if (this.gs.ilaps.getSelectedIndex() != 0) {
                                            if (this.gs.icars.getSelectedIndex() != 0) {
                                                if (this.gs.senditem.getSelectedIndex() == 0) {
                                                    this.wstages[this.wag] = "#" + (this.gs.datat.getSelectedIndex() + 27) + "";
                                                }
                                                if (this.gs.senditem.getSelectedIndex() == 1) {
                                                    this.wstages[this.wag] = "#" + (this.gs.datat.getSelectedIndex() + 10) + "";
                                                }
                                                if (this.gs.senditem.getSelectedIndex() == 2) {
                                                    this.wstages[this.wag] = "#" + this.gs.datat.getSelectedIndex() + "";
                                                }
                                                if (this.gs.senditem.getSelectedIndex() == 3) {
                                                    this.wstages[this.wag] = "" + this.gs.datat.getSelectedItem() + "";
                                                }
                                                this.wlaps[this.wag] = this.gs.ilaps.getSelectedIndex();
                                                this.wcars[this.wag] = this.gs.icars.getSelectedIndex();
                                                this.wclass[this.wag] = this.gs.sclass.getSelectedIndex();
                                                this.wfix[this.wag] = this.gs.sfix.getSelectedIndex();
                                                ++this.wag;
                                                if (this.wag < 2) {
                                                    this.ifas = 4;
                                                    this.imsg = "Create second game.";
                                                }
                                                else {
                                                    --this.wag;
                                                    this.sendint = 1;
                                                    this.gs.senditem.disable();
                                                    this.gs.datat.disable();
                                                    this.gs.ilaps.disable();
                                                    this.gs.icars.disable();
                                                    this.gs.sclass.disable();
                                                    this.gs.sfix.disable();
                                                }
                                            }
                                            else {
                                                this.imsg = "Please choose a type of cars for this game!";
                                                this.iflk = 40;
                                            }
                                        }
                                        else {
                                            this.imsg = "Please select a number of laps!";
                                            this.iflk = 40;
                                        }
                                    }
                                    else {
                                        this.imsg = "Please select a stage!";
                                        this.iflk = 40;
                                    }
                                }
                                if (this.ifas == 2 || this.ifas == 3) {
                                    if (this.gs.datat.getSelectedIndex() == 0) {
                                        this.imsg = "Please choose a car to give to " + this.intclan + " if you lose!";
                                        this.iflk = 40;
                                    }
                                    else {
                                        this.imsg = "Create 2 games and " + this.intclan + " will create another 3.";
                                        this.iflk = 0;
                                        this.igive = this.gs.datat.getSelectedItem();
                                        this.ifas = 4;
                                        this.wag = 0;
                                    }
                                }
                                if (this.ifas == 0 || this.ifas == 1) {
                                    if (this.gs.datat.getSelectedIndex() == 0) {
                                        this.imsg = "Please choose a car to battle over!";
                                        this.iflk = 40;
                                    }
                                    else {
                                        this.imsg = "Battle over a car that belongs to " + this.intclan + " to take it.";
                                        this.iflk = 0;
                                        this.itake = this.gs.datat.getSelectedItem();
                                        this.gs.datat.removeAll();
                                        this.gs.datat.add(this.rd, "Loading your clan's cars, please wait...");
                                        this.ifas = 2;
                                    }
                                }
                            }
                        }
                        else {
                            this.imsg = "Sending car battle, pleas wait...";
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.drawString("Sending...", 742 - this.ftm.stringWidth("Sending...") / 2, 417);
                        }
                    }
                    if (this.gs.sendtyp.getSelectedIndex() == 4) {
                        if (this.inishsel || this.redif) {
                            this.isel = 0;
                            this.gs.senditem.removeAll();
                            this.gs.senditem.add(this.rd, " NFM Multiplayer ");
                            this.gs.senditem.add(this.rd, " NFM 2     ");
                            this.gs.senditem.add(this.rd, " NFM 1     ");
                            this.gs.senditem.add(this.rd, " Clan Stages ");
                            this.gs.senditem.select(0);
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Select Stage");
                            for (int n59 = 0; n59 < 5; ++n59) {
                                this.gs.datat.add(this.rd, " Stage " + (n59 + 1) + "");
                            }
                            this.gs.datat.select(0);
                            if (!this.redif) {
                                this.wag = 0;
                                this.imsg = "Create 4 games and " + this.intclan + " will create another 5.";
                                this.iflk = 0;
                            }
                            else {
                                this.imsg = "Create next game.";
                                if (this.wag == 3) {
                                    this.imsg = "Create last game.";
                                }
                                this.iflk = 0;
                                this.gs.ilaps.hide();
                                this.gs.icars.hide();
                                this.gs.sclass.hide();
                                this.gs.sfix.hide();
                            }
                            if (this.sendwarnum) {
                                this.sendint = 1;
                                this.gs.senditem.disable();
                                this.gs.datat.disable();
                                this.gs.ilaps.disable();
                                this.gs.icars.disable();
                                this.gs.sclass.disable();
                                this.gs.sfix.disable();
                            }
                            this.redif = false;
                        }
                        this.rd.setFont(new Font("Arial", 0, 12));
                        if (this.iflk % 3 != 0 || this.iflk == 0) {
                            this.rd.drawString(this.imsg, 376, 382);
                        }
                        if (this.iflk != 0) {
                            --this.iflk;
                        }
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.rd.drawString("Game #" + (this.wag * 2 + 2) + " :", 207, 407);
                        if (!this.gs.senditem.isShowing()) {
                            this.gs.senditem.show();
                        }
                        this.gs.senditem.move(280, 390);
                        if (!this.gs.datat.isShowing()) {
                            this.gs.datat.show();
                        }
                        this.gs.datat.move(286 + this.gs.senditem.getWidth(), 390);
                        final int n60 = 207;
                        if (!this.gs.ilaps.isShowing()) {
                            this.gs.ilaps.show();
                            this.gs.ilaps.select(0);
                        }
                        this.gs.ilaps.move(n60, 415);
                        final int n61 = n60 + (6 + this.gs.ilaps.getWidth());
                        if (!this.gs.icars.isShowing()) {
                            this.gs.icars.show();
                            this.gs.icars.select(0);
                        }
                        this.gs.icars.move(n61, 415);
                        final int n62 = n61 + (6 + this.gs.icars.getWidth());
                        if (!this.gs.sclass.isShowing()) {
                            this.gs.sclass.show();
                            this.gs.sclass.select(0);
                        }
                        this.gs.sclass.move(n62, 415);
                        this.gs.sclass.revup = true;
                        final int n63 = n62 + (6 + this.gs.sclass.getWidth());
                        if (!this.gs.sfix.isShowing()) {
                            this.gs.sfix.show();
                            this.gs.sfix.select(0);
                        }
                        this.gs.sfix.move(n63, 415);
                        this.gs.sfix.revup = true;
                        this.gs.datat.setSize(n63 + this.gs.sfix.getWidth() - 286 - this.gs.senditem.getWidth(), 22);
                        if (this.gs.senditem.getSelectedIndex() == 0 && this.isel != 0) {
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Select Stage");
                            for (int n64 = 0; n64 < 5; ++n64) {
                                this.gs.datat.add(this.rd, " Stage " + (n64 + 1) + "");
                            }
                            this.gs.datat.select(0);
                            this.isel = 0;
                        }
                        if (this.gs.senditem.getSelectedIndex() == 1 && this.isel != 1) {
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Select Stage");
                            for (int n65 = 0; n65 < 17; ++n65) {
                                this.gs.datat.add(this.rd, " Stage " + (n65 + 1) + "");
                            }
                            this.gs.datat.select(0);
                            this.isel = 1;
                        }
                        if (this.gs.senditem.getSelectedIndex() == 2 && this.isel != 2) {
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Select Stage");
                            for (int n66 = 0; n66 < 10; ++n66) {
                                this.gs.datat.add(this.rd, " Stage " + (n66 + 1) + "");
                            }
                            this.gs.datat.select(0);
                            this.isel = 2;
                        }
                        if (this.gs.senditem.getSelectedIndex() == 3 && this.isel < 3) {
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Loading stages, please wait...");
                            this.gs.datat.select(0);
                            this.isel = 3;
                        }
                        if (this.sendint == 0) {
                            String s6 = "  Next >  ";
                            if (this.wag == 3) {
                                s6 = "   Done   ";
                            }
                            if (this.stringbutton(this.rd, s6, 742, 417, 0, n, n2, b, 0, 0)) {
                                if (this.gs.datat.getSelectedIndex() != 0) {
                                    if (this.gs.ilaps.getSelectedIndex() != 0) {
                                        if (this.gs.icars.getSelectedIndex() != 0) {
                                            if (this.gs.senditem.getSelectedIndex() == 0) {
                                                this.wstages[this.wag] = "#" + (this.gs.datat.getSelectedIndex() + 27) + "";
                                            }
                                            if (this.gs.senditem.getSelectedIndex() == 1) {
                                                this.wstages[this.wag] = "#" + (this.gs.datat.getSelectedIndex() + 10) + "";
                                            }
                                            if (this.gs.senditem.getSelectedIndex() == 2) {
                                                this.wstages[this.wag] = "#" + this.gs.datat.getSelectedIndex() + "";
                                            }
                                            if (this.gs.senditem.getSelectedIndex() == 3) {
                                                this.wstages[this.wag] = "" + this.gs.datat.getSelectedItem() + "";
                                            }
                                            this.wlaps[this.wag] = this.gs.ilaps.getSelectedIndex();
                                            this.wcars[this.wag] = this.gs.icars.getSelectedIndex();
                                            this.wclass[this.wag] = this.gs.sclass.getSelectedIndex();
                                            this.wfix[this.wag] = this.gs.sfix.getSelectedIndex();
                                            ++this.wag;
                                            if (this.wag < 4) {
                                                this.redif = true;
                                            }
                                            else {
                                                --this.wag;
                                                this.sendint = 1;
                                                this.gs.senditem.disable();
                                                this.gs.datat.disable();
                                                this.gs.ilaps.disable();
                                                this.gs.icars.disable();
                                                this.gs.sclass.disable();
                                                this.gs.sfix.disable();
                                            }
                                        }
                                        else {
                                            this.imsg = "Please choose a type of cars for this game!";
                                            this.iflk = 40;
                                        }
                                    }
                                    else {
                                        this.imsg = "Please select a number of laps!";
                                        this.iflk = 40;
                                    }
                                }
                                else {
                                    this.imsg = "Please select a stage!";
                                    this.iflk = 40;
                                }
                            }
                        }
                        else {
                            this.imsg = "Sending war declaration, pleas wait...";
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.drawString("Sending...", 742 - this.ftm.stringWidth("Sending...") / 2, 417);
                        }
                    }
                    if (this.gs.sendtyp.getSelectedIndex() == 5 || this.gs.sendtyp.getSelectedIndex() == 6) {
                        if (this.inishsel || this.redif) {
                            this.isel = 0;
                            this.gs.senditem.removeAll();
                            this.gs.senditem.add(this.rd, " NFM Multiplayer ");
                            this.gs.senditem.add(this.rd, " NFM 2     ");
                            this.gs.senditem.add(this.rd, " NFM 1     ");
                            this.gs.senditem.add(this.rd, " Clan Stages ");
                            this.gs.senditem.select(0);
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Select Stage");
                            for (int n67 = 0; n67 < 5; ++n67) {
                                this.gs.datat.add(this.rd, " Stage " + (n67 + 1) + "");
                            }
                            this.gs.datat.select(0);
                            if (!this.redif) {
                                this.wag = 0;
                                this.imsg = "Create 3 games to be added to the battle.";
                                this.iflk = 0;
                            }
                            else {
                                this.imsg = "Create next game.";
                                if (this.wag == 2) {
                                    this.imsg = "Create last game.";
                                }
                                this.iflk = 0;
                                this.gs.ilaps.hide();
                                this.gs.icars.hide();
                                this.gs.sclass.hide();
                                this.gs.sfix.hide();
                            }
                            if (this.sendwarnum) {
                                this.sendint = 1;
                                this.gs.senditem.disable();
                                this.gs.datat.disable();
                                this.gs.ilaps.disable();
                                this.gs.icars.disable();
                                this.gs.sclass.disable();
                                this.gs.sfix.disable();
                            }
                            this.redif = false;
                        }
                        this.rd.setFont(new Font("Arial", 0, 12));
                        if (this.iflk % 3 != 0 || this.iflk == 0) {
                            this.rd.drawString(this.imsg, 350, 382);
                        }
                        if (this.iflk != 0) {
                            --this.iflk;
                        }
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.rd.drawString("Game #" + (this.wag * 2 + 1) + " :", 207, 407);
                        if (!this.gs.senditem.isShowing()) {
                            this.gs.senditem.show();
                        }
                        this.gs.senditem.move(280, 390);
                        if (!this.gs.datat.isShowing()) {
                            this.gs.datat.show();
                        }
                        this.gs.datat.move(286 + this.gs.senditem.getWidth(), 390);
                        final int n68 = 207;
                        if (!this.gs.ilaps.isShowing()) {
                            this.gs.ilaps.show();
                            this.gs.ilaps.select(0);
                        }
                        this.gs.ilaps.move(n68, 415);
                        final int n69 = n68 + (6 + this.gs.ilaps.getWidth());
                        if (!this.gs.icars.isShowing()) {
                            this.gs.icars.show();
                            this.gs.icars.select(0);
                        }
                        this.gs.icars.move(n69, 415);
                        final int n70 = n69 + (6 + this.gs.icars.getWidth());
                        if (!this.gs.sclass.isShowing()) {
                            this.gs.sclass.show();
                            this.gs.sclass.select(0);
                        }
                        this.gs.sclass.move(n70, 415);
                        this.gs.sclass.revup = true;
                        final int n71 = n70 + (6 + this.gs.sclass.getWidth());
                        if (!this.gs.sfix.isShowing()) {
                            this.gs.sfix.show();
                            this.gs.sfix.select(0);
                        }
                        this.gs.sfix.move(n71, 415);
                        this.gs.sfix.revup = true;
                        this.gs.datat.setSize(n71 + this.gs.sfix.getWidth() - 286 - this.gs.senditem.getWidth(), 22);
                        if (this.gs.senditem.getSelectedIndex() == 0 && this.isel != 0) {
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Select Stage");
                            for (int n72 = 0; n72 < 5; ++n72) {
                                this.gs.datat.add(this.rd, " Stage " + (n72 + 1) + "");
                            }
                            this.gs.datat.select(0);
                            this.isel = 0;
                        }
                        if (this.gs.senditem.getSelectedIndex() == 1 && this.isel != 1) {
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Select Stage");
                            for (int n73 = 0; n73 < 17; ++n73) {
                                this.gs.datat.add(this.rd, " Stage " + (n73 + 1) + "");
                            }
                            this.gs.datat.select(0);
                            this.isel = 1;
                        }
                        if (this.gs.senditem.getSelectedIndex() == 2 && this.isel != 2) {
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Select Stage");
                            for (int n74 = 0; n74 < 10; ++n74) {
                                this.gs.datat.add(this.rd, " Stage " + (n74 + 1) + "");
                            }
                            this.gs.datat.select(0);
                            this.isel = 2;
                        }
                        if (this.gs.senditem.getSelectedIndex() == 3 && this.isel < 3) {
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Loading stages, please wait...");
                            this.gs.datat.select(0);
                            this.isel = 3;
                        }
                        if (this.sendint == 0) {
                            String s7 = "  Next >  ";
                            if (this.wag == 2) {
                                s7 = "   Done   ";
                            }
                            if (this.stringbutton(this.rd, s7, 742, 417, 0, n, n2, b, 0, 0)) {
                                if (this.gs.datat.getSelectedIndex() != 0) {
                                    if (this.gs.ilaps.getSelectedIndex() != 0) {
                                        if (this.gs.icars.getSelectedIndex() != 0) {
                                            if (this.gs.senditem.getSelectedIndex() == 0) {
                                                this.wstages[this.wag] = "#" + (this.gs.datat.getSelectedIndex() + 27) + "";
                                            }
                                            if (this.gs.senditem.getSelectedIndex() == 1) {
                                                this.wstages[this.wag] = "#" + (this.gs.datat.getSelectedIndex() + 10) + "";
                                            }
                                            if (this.gs.senditem.getSelectedIndex() == 2) {
                                                this.wstages[this.wag] = "#" + this.gs.datat.getSelectedIndex() + "";
                                            }
                                            if (this.gs.senditem.getSelectedIndex() == 3) {
                                                this.wstages[this.wag] = "" + this.gs.datat.getSelectedItem() + "";
                                            }
                                            this.wlaps[this.wag] = this.gs.ilaps.getSelectedIndex();
                                            this.wcars[this.wag] = this.gs.icars.getSelectedIndex();
                                            this.wclass[this.wag] = this.gs.sclass.getSelectedIndex();
                                            this.wfix[this.wag] = this.gs.sfix.getSelectedIndex();
                                            ++this.wag;
                                            if (this.wag < 3) {
                                                this.redif = true;
                                            }
                                            else {
                                                --this.wag;
                                                this.sendint = 1;
                                                this.gs.senditem.disable();
                                                this.gs.datat.disable();
                                                this.gs.ilaps.disable();
                                                this.gs.icars.disable();
                                                this.gs.sclass.disable();
                                                this.gs.sfix.disable();
                                            }
                                        }
                                        else {
                                            this.imsg = "Please choose a type of cars for this game!";
                                            this.iflk = 40;
                                        }
                                    }
                                    else {
                                        this.imsg = "Please select a number of laps!";
                                        this.iflk = 40;
                                    }
                                }
                                else {
                                    this.imsg = "Please select a stage!";
                                    this.iflk = 40;
                                }
                            }
                        }
                        else {
                            this.imsg = "Sending war declaration, pleas wait...";
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.drawString("Sending...", 742 - this.ftm.stringWidth("Sending...") / 2, 417);
                        }
                    }
                    if (this.gs.sendtyp.getSelectedIndex() == 7) {
                        if (this.inishsel || this.redif) {
                            this.isel = 0;
                            this.gs.senditem.removeAll();
                            this.gs.senditem.add(this.rd, " NFM Multiplayer ");
                            this.gs.senditem.add(this.rd, " NFM 2     ");
                            this.gs.senditem.add(this.rd, " NFM 1     ");
                            this.gs.senditem.add(this.rd, " Clan Stages ");
                            this.gs.senditem.select(0);
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Select Stage");
                            for (int n75 = 0; n75 < 5; ++n75) {
                                this.gs.datat.add(this.rd, " Stage " + (n75 + 1) + "");
                            }
                            this.gs.datat.select(0);
                            if (!this.redif) {
                                this.wag = 0;
                                this.imsg = "Create 5 games to be added to the war.";
                                this.iflk = 0;
                            }
                            else {
                                this.imsg = "Create next game.";
                                if (this.wag == 4) {
                                    this.imsg = "Create last game.";
                                }
                                this.iflk = 0;
                                this.gs.ilaps.hide();
                                this.gs.icars.hide();
                                this.gs.sclass.hide();
                                this.gs.sfix.hide();
                            }
                            if (this.sendwarnum) {
                                this.sendint = 1;
                                this.gs.senditem.disable();
                                this.gs.datat.disable();
                                this.gs.ilaps.disable();
                                this.gs.icars.disable();
                                this.gs.sclass.disable();
                                this.gs.sfix.disable();
                            }
                            this.redif = false;
                        }
                        this.rd.setFont(new Font("Arial", 0, 12));
                        if (this.iflk % 3 != 0 || this.iflk == 0) {
                            this.rd.drawString(this.imsg, 350, 382);
                        }
                        if (this.iflk != 0) {
                            --this.iflk;
                        }
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.rd.drawString("Game #" + (this.wag * 2 + 1) + " :", 207, 407);
                        if (!this.gs.senditem.isShowing()) {
                            this.gs.senditem.show();
                        }
                        this.gs.senditem.move(280, 390);
                        if (!this.gs.datat.isShowing()) {
                            this.gs.datat.show();
                        }
                        this.gs.datat.move(286 + this.gs.senditem.getWidth(), 390);
                        final int n76 = 207;
                        if (!this.gs.ilaps.isShowing()) {
                            this.gs.ilaps.show();
                            this.gs.ilaps.select(0);
                        }
                        this.gs.ilaps.move(n76, 415);
                        final int n77 = n76 + (6 + this.gs.ilaps.getWidth());
                        if (!this.gs.icars.isShowing()) {
                            this.gs.icars.show();
                            this.gs.icars.select(0);
                        }
                        this.gs.icars.move(n77, 415);
                        final int n78 = n77 + (6 + this.gs.icars.getWidth());
                        if (!this.gs.sclass.isShowing()) {
                            this.gs.sclass.show();
                            this.gs.sclass.select(0);
                        }
                        this.gs.sclass.move(n78, 415);
                        this.gs.sclass.revup = true;
                        final int n79 = n78 + (6 + this.gs.sclass.getWidth());
                        if (!this.gs.sfix.isShowing()) {
                            this.gs.sfix.show();
                            this.gs.sfix.select(0);
                        }
                        this.gs.sfix.move(n79, 415);
                        this.gs.sfix.revup = true;
                        this.gs.datat.setSize(n79 + this.gs.sfix.getWidth() - 286 - this.gs.senditem.getWidth(), 22);
                        if (this.gs.senditem.getSelectedIndex() == 0 && this.isel != 0) {
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Select Stage");
                            for (int n80 = 0; n80 < 5; ++n80) {
                                this.gs.datat.add(this.rd, " Stage " + (n80 + 1) + "");
                            }
                            this.gs.datat.select(0);
                            this.isel = 0;
                        }
                        if (this.gs.senditem.getSelectedIndex() == 1 && this.isel != 1) {
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Select Stage");
                            for (int n81 = 0; n81 < 17; ++n81) {
                                this.gs.datat.add(this.rd, " Stage " + (n81 + 1) + "");
                            }
                            this.gs.datat.select(0);
                            this.isel = 1;
                        }
                        if (this.gs.senditem.getSelectedIndex() == 2 && this.isel != 2) {
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Select Stage");
                            for (int n82 = 0; n82 < 10; ++n82) {
                                this.gs.datat.add(this.rd, " Stage " + (n82 + 1) + "");
                            }
                            this.gs.datat.select(0);
                            this.isel = 2;
                        }
                        if (this.gs.senditem.getSelectedIndex() == 3 && this.isel < 3) {
                            this.gs.datat.removeAll();
                            this.gs.datat.add(this.rd, "Loading stages, please wait...");
                            this.gs.datat.select(0);
                            this.isel = 3;
                        }
                        if (this.sendint == 0) {
                            String s8 = "  Next >  ";
                            if (this.wag == 4) {
                                s8 = "   Done   ";
                            }
                            if (this.stringbutton(this.rd, s8, 742, 417, 0, n, n2, b, 0, 0)) {
                                if (this.gs.datat.getSelectedIndex() != 0) {
                                    if (this.gs.ilaps.getSelectedIndex() != 0) {
                                        if (this.gs.icars.getSelectedIndex() != 0) {
                                            if (this.gs.senditem.getSelectedIndex() == 0) {
                                                this.wstages[this.wag] = "#" + (this.gs.datat.getSelectedIndex() + 27) + "";
                                            }
                                            if (this.gs.senditem.getSelectedIndex() == 1) {
                                                this.wstages[this.wag] = "#" + (this.gs.datat.getSelectedIndex() + 10) + "";
                                            }
                                            if (this.gs.senditem.getSelectedIndex() == 2) {
                                                this.wstages[this.wag] = "#" + this.gs.datat.getSelectedIndex() + "";
                                            }
                                            if (this.gs.senditem.getSelectedIndex() == 3) {
                                                this.wstages[this.wag] = "" + this.gs.datat.getSelectedItem() + "";
                                            }
                                            this.wlaps[this.wag] = this.gs.ilaps.getSelectedIndex();
                                            this.wcars[this.wag] = this.gs.icars.getSelectedIndex();
                                            this.wclass[this.wag] = this.gs.sclass.getSelectedIndex();
                                            this.wfix[this.wag] = this.gs.sfix.getSelectedIndex();
                                            ++this.wag;
                                            if (this.wag < 5) {
                                                this.redif = true;
                                            }
                                            else {
                                                --this.wag;
                                                this.sendint = 1;
                                                this.gs.senditem.disable();
                                                this.gs.datat.disable();
                                                this.gs.ilaps.disable();
                                                this.gs.icars.disable();
                                                this.gs.sclass.disable();
                                                this.gs.sfix.disable();
                                            }
                                        }
                                        else {
                                            this.imsg = "Please choose a type of cars for this game!";
                                            this.iflk = 40;
                                        }
                                    }
                                    else {
                                        this.imsg = "Please select a number of laps!";
                                        this.iflk = 40;
                                    }
                                }
                                else {
                                    this.imsg = "Please select a stage!";
                                    this.iflk = 40;
                                }
                            }
                        }
                        else {
                            this.imsg = "Sending war declaration, pleas wait...";
                            this.rd.setFont(new Font("Arial", 1, 12));
                            this.ftm = this.rd.getFontMetrics();
                            this.rd.setColor(new Color(0, 0, 0));
                            this.rd.drawString("Sending...", 742 - this.ftm.stringWidth("Sending...") / 2, 417);
                        }
                    }
                    if (this.inishsel) {
                        this.inishsel = false;
                    }
                }
                if (this.openi >= 1 && this.openi < 10) {
                    this.rd.setColor(this.color2k(240, 240, 230));
                    this.rd.fillRoundRect(197, this.opy, 597, this.oph, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(197, this.opy, 597, this.oph, 20, 20);
                    if (!this.drawl(this.rd, "#" + this.intclan + "#", 207, this.opy + 7, true)) {
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawString(this.intclan, 382 - this.ftm.stringWidth(this.intclan) / 2, this.opy + 26);
                        this.rd.setColor(this.color2k(150, 150, 150));
                        this.rd.drawRect(207, this.opy + 7, 349, 29);
                    }
                    this.opy += this.addopy;
                    this.oph += 36;
                    ++this.openi;
                }
            }
            else {
                this.rd.setColor(this.color2k(230, 230, 230));
                this.rd.fillRoundRect(197, 40, 597, 404, 20, 20);
                this.rd.setColor(new Color(0, 0, 0));
                this.rd.drawRoundRect(197, 40, 597, 404, 20, 20);
                if (this.xt.logged) {
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawString("You are not a member of any clan.  You need to join a clan first to have access to this.", 487 - this.ftm.stringWidth("You are not a member of any clan.  You need to join a clan first to have access to this.") / 2, 200);
                    if (this.stringbutton(this.rd, "   Find a clan to join   ", 487, 230, 1, n, n2, b, 0, 0)) {
                        this.tab = 3;
                        this.cfase = 2;
                        this.em = 1;
                        this.msg = "Clan Search";
                        this.smsg = "Listing clans with recent activity...";
                        this.nclns = 0;
                        this.spos5 = 0;
                        this.lspos5 = 0;
                        this.flko = 0;
                    }
                }
                else {
                    this.rd.setFont(new Font("Arial", 1, 13));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("You are currently using a trial account.", 495 - this.ftm.stringWidth("You are currently using a trial account.") / 2, 180);
                    this.rd.drawString("You need to upgrade to be able participate in NFM clan's activities.", 495 - this.ftm.stringWidth("You need to upgrade to be able participate in NFM clan's activities.") / 2, 200);
                    this.rd.setColor(new Color(206, 171, 98));
                    this.rd.fillRoundRect(405, 223, 180, 50, 20, 20);
                    if (this.drawbutton(this.xt.upgrade, 495, 248, n, n2, b)) {
                        this.gs.editlink(this.xt.nickname, true);
                    }
                }
                this.rd.setColor(this.color2k(205, 205, 205));
                this.rd.fillRect(207, 46, 582, 30);
                this.rd.setFont(new Font("Arial", 1, 12));
                this.ftm = this.rd.getFontMetrics();
                final String[] array22 = { "Player Interaction", "Clan Interaction", "Your Clan's Discussion" };
                final int[] array23 = { 207, 390, 368, 207 };
                final int[] array24 = { 73, 73, 51, 51 };
                for (int itab5 = 0; itab5 < 3; ++itab5) {
                    if (this.itab == itab5) {
                        this.rd.setColor(this.color2k(230, 230, 230));
                        this.rd.fillPolygon(array23, array24, 4);
                    }
                    else if (n > array23[0] && n < array23[2] && n2 > 51 && n2 < 73) {
                        this.rd.setColor(this.color2k(217, 217, 217));
                        this.rd.fillPolygon(array23, array24, 4);
                        if (b) {
                            this.itab = itab5;
                        }
                    }
                    this.rd.setColor(this.color2k(150, 150, 150));
                    this.rd.drawPolygon(array23, array24, 4);
                    this.rd.setColor(this.color2k(40, 40, 40));
                    this.rd.drawString(array22[itab5], array23[0] + 80 - this.ftm.stringWidth(array22[itab5]) / 2, 67);
                    for (int n83 = 0; n83 < 4; ++n83) {
                        final int[] array25 = array23;
                        final int n84 = n83;
                        array25[n84] += 183;
                    }
                }
                this.rd.setColor(this.color2k(150, 150, 150));
                this.rd.drawLine(207, 73, 770, 73);
                this.rd.setColor(this.color2k(205, 205, 205));
                this.rd.fillRect(207, 409, 582, 30);
                this.rd.setColor(this.color2k(150, 150, 150));
                this.rd.drawLine(207, 411, 770, 411);
                this.rd.setColor(this.color2k(205, 205, 205));
                this.rd.fillRect(772, 76, 17, 333);
                this.rd.setColor(this.color2k(205, 205, 205));
                this.rd.fillRect(203, 46, 4, 393);
            }
        }
        if (this.itab == 2) {
            if (this.litab != this.itab) {
                if (this.readclan > 0) {
                    this.spos3 = 219;
                }
                this.gs.senditem.hide();
                this.gs.datat.hide();
                this.gs.ilaps.hide();
                this.gs.icars.hide();
                this.gs.sclass.hide();
                this.gs.sfix.hide();
                this.gs.senditem.enable();
                this.gs.datat.enable();
                this.gs.ilaps.enable();
                this.gs.icars.enable();
                this.gs.sclass.enable();
                this.gs.sfix.enable();
                this.gs.sendtyp.removeAll();
                this.gs.sendtyp.add(this.rd, "Write a Message");
                this.gs.sendtyp.add(this.rd, "Share a Relative Date");
                this.gs.sendtyp.select(0);
                this.litab = this.itab;
            }
            this.rd.setColor(this.color2k(230, 230, 230));
            this.rd.fillRoundRect(197, 40, 597, 404, 20, 20);
            this.rd.setColor(new Color(0, 0, 0));
            this.rd.drawRoundRect(197, 40, 597, 404, 20, 20);
            if (!this.xt.clan.equals("")) {
                this.rd.setColor(this.color2k(250, 250, 250));
                this.rd.fillRect(207, 76, 565, 300);
            }
            if (this.loadedmyclanbg == 1) {
                this.rd.setComposite(AlphaComposite.getInstance(3, 0.1f));
                this.rd.drawImage(this.myclanbg, 207, 76, 565, 300, null);
                this.rd.setComposite(AlphaComposite.getInstance(3, 1.0f));
            }
            this.rd.setColor(new Color(0, 0, 0));
            this.sdist = 0;
            if (!this.xt.clan.equals("")) {
                if (this.gs.openm) {
                    this.blockb = 10;
                }
                else if (this.blockb != 0) {
                    --this.blockb;
                }
                if ((this.readclan > 0 || this.readclan == -3) && this.viewgame1 == 0) {
                    this.sdist = (int)((this.cnml - 14.75f) * 17.0f);
                    if (this.sdist < 0) {
                        this.sdist = 0;
                    }
                    this.scro = (int)(this.spos3 / 219.0f * this.sdist);
                    for (int n85 = 0; n85 < this.cnml; ++n85) {
                        if (86 + 17 * n85 - this.scro < 360 && 125 + 17 * n85 - this.scro > 76 && this.cmlinetyp[n85] != 167) {
                            if (this.cmlinetyp[n85] != 20 && this.cmlinetyp[n85] != 30 && this.cmlinetyp[n85] != 40 && this.cmlinetyp[n85] != 50 && this.cmlinetyp[n85] != 60 && this.cmlinetyp[n85] != 70 && this.cmlinetyp[n85] != 80) {
                                this.rd.setColor(new Color(0, 0, 0));
                                if (this.cmlinetyp[n85] >= 0) {
                                    this.rd.setFont(new Font("Tahoma", 1, 11));
                                }
                                else {
                                    this.rd.setFont(new Font("Tahoma", 0, 11));
                                }
                                this.rd.drawString(this.cmline[n85], 217, 103 + 17 * n85 - this.scro);
                                if (this.cmlinetyp[n85] >= 0) {
                                    this.rd.setFont(new Font("Tahoma", 0, 11));
                                    this.ftm = this.rd.getFontMetrics();
                                    this.rd.setColor(this.color2k(125, 125, 125));
                                    this.rd.drawString(this.cmtimes[n85], 757 - this.ftm.stringWidth(this.cmtimes[n85]), 103 + 17 * n85 - this.scro);
                                }
                            }
                            else {
                                if (this.cmlinetyp[n85] == 20 || this.cmlinetyp[n85] == 50) {
                                    if (this.stringbutton(this.rd, "  View Clan  ", 267, 112 + 17 * n85 - this.scro, 0, n, n2, b, 0, 0)) {
                                        final String svalue3 = this.getSvalue(this.cmline[n85], 0);
                                        if (!this.claname.equals(svalue3)) {
                                            this.claname = svalue3;
                                            this.loadedc = false;
                                        }
                                        this.spos5 = 0;
                                        this.lspos5 = 0;
                                        this.cfase = 3;
                                        this.ctab = 0;
                                        this.tab = 3;
                                    }
                                    if (this.stringbutton(this.rd, "  View War Suggestion  ", 403, 112 + 17 * n85 - this.scro, 0, n, n2, b, 0, 0)) {
                                        this.viewgame1 = 1;
                                        if (this.cmlinetyp[n85] == 20) {
                                            this.nvgames1 = 4;
                                        }
                                        else {
                                            this.nvgames1 = 9;
                                        }
                                        this.xclan = this.getSvalue(this.cmline[n85], 0);
                                        this.viewwar1 = this.getSvalue(this.cmline[n85], 1);
                                    }
                                    if (!this.cmline[n85].endsWith("|out|")) {
                                        if (this.cadmin == 1 && this.stringbutton(this.rd, "  Approve War  ", 548, 112 + 17 * n85 - this.scro, 0, n, n2, b, 0, 0)) {
                                            this.tab = 2;
                                            this.itab = 1;
                                            this.litab = -1;
                                            this.openi = 10;
                                            final String svalue4 = this.getSvalue(this.cmline[n85], 0);
                                            if (!this.intclan.equals(svalue4)) {
                                                this.intclan = svalue4;
                                                this.dispi = 0;
                                                this.nil = 0;
                                                this.lastint = "";
                                                this.readint = 1;
                                            }
                                            this.warnum = this.getSvalue(this.cmline[n85], 1);
                                            this.sendwarnum = true;
                                            if (this.cmlinetyp[n85] == 20) {
                                                this.intsel = 4;
                                            }
                                            else {
                                                this.intsel = 7;
                                            }
                                        }
                                    }
                                    else {
                                        this.rd.setColor(this.color2k(170, 170, 170));
                                        this.rd.drawString("[ Approved or interaction replaced. ]", 597 - this.ftm.stringWidth("[ Approved or interaction replaced. ]") / 2, 112 + 17 * n85 - this.scro);
                                    }
                                }
                                if (this.cmlinetyp[n85] == 30 || this.cmlinetyp[n85] == 60) {
                                    if (this.stringbutton(this.rd, "  View Clan  ", 267, 112 + 17 * n85 - this.scro, 0, n, n2, b, 0, 0)) {
                                        final String svalue5 = this.getSvalue(this.cmline[n85], 0);
                                        if (!this.claname.equals(svalue5)) {
                                            this.claname = svalue5;
                                            this.loadedc = false;
                                        }
                                        this.spos5 = 0;
                                        this.lspos5 = 0;
                                        this.cfase = 3;
                                        this.ctab = 0;
                                        this.tab = 3;
                                    }
                                    if (this.stringbutton(this.rd, "  View Battle Suggestion  ", 407, 112 + 17 * n85 - this.scro, 0, n, n2, b, 0, 0)) {
                                        this.viewgame1 = 1;
                                        if (this.cmlinetyp[n85] == 30) {
                                            this.nvgames1 = 2;
                                        }
                                        else {
                                            this.nvgames1 = 5;
                                        }
                                        this.xclan = this.getSvalue(this.cmline[n85], 0);
                                        this.viewwar1 = this.getSvalue(this.cmline[n85], 3);
                                    }
                                    if (!this.cmline[n85].endsWith("|out|")) {
                                        if (this.cadmin == 1 && this.stringbutton(this.rd, "  Approve Battle  ", 560, 112 + 17 * n85 - this.scro, 0, n, n2, b, 0, 0)) {
                                            this.tab = 2;
                                            this.itab = 1;
                                            this.litab = -1;
                                            this.openi = 10;
                                            final String svalue6 = this.getSvalue(this.cmline[n85], 0);
                                            if (!this.intclan.equals(svalue6)) {
                                                this.intclan = svalue6;
                                                this.dispi = 0;
                                                this.nil = 0;
                                                this.lastint = "";
                                                this.readint = 1;
                                            }
                                            this.itake = this.getSvalue(this.cmline[n85], 1);
                                            this.igive = this.getSvalue(this.cmline[n85], 2);
                                            this.warnum = this.getSvalue(this.cmline[n85], 3);
                                            this.sendwarnum = true;
                                            if (this.cmlinetyp[n85] == 30) {
                                                this.intsel = 3;
                                            }
                                            else {
                                                this.intsel = 6;
                                            }
                                        }
                                    }
                                    else {
                                        this.rd.setColor(this.color2k(170, 170, 170));
                                        this.rd.drawString("[ Approved or interaction replaced. ]", 604 - this.ftm.stringWidth("[ Approved or interaction replaced. ]") / 2, 112 + 17 * n85 - this.scro);
                                    }
                                    this.rd.setFont(new Font("Tahoma", 0, 11));
                                    this.ftm = this.rd.getFontMetrics();
                                    if (this.stringbutton(this.rd, "  View Car  ", 217 + this.ftm.stringWidth(this.cmline[n85 + 2]) + 47, 137 + 17 * n85 - this.scro, 6, n, n2, b, 0, 0)) {
                                        this.viewcar = this.getSvalue(this.cmline[n85], 1);
                                        final String svalue7 = this.getSvalue(this.cmline[n85], 0);
                                        if (!this.claname.equals(svalue7)) {
                                            this.claname = svalue7;
                                            this.loadedc = false;
                                        }
                                        this.spos5 = 0;
                                        this.lspos5 = 0;
                                        this.cfase = 3;
                                        this.loadedcars = -1;
                                        this.loadedcar = 0;
                                        this.ctab = 2;
                                        this.tab = 3;
                                    }
                                    this.rd.setFont(new Font("Tahoma", 0, 11));
                                    this.ftm = this.rd.getFontMetrics();
                                    if (this.stringbutton(this.rd, "  View Car  ", 217 + this.ftm.stringWidth(this.cmline[n85 + 3]) + 47, 154 + 17 * n85 - this.scro, 6, n, n2, b, 0, 0)) {
                                        this.viewcar = this.getSvalue(this.cmline[n85], 2);
                                        if (!this.claname.equals(this.xt.clan)) {
                                            this.claname = this.xt.clan;
                                            this.loadedc = false;
                                        }
                                        this.spos5 = 0;
                                        this.lspos5 = 0;
                                        this.cfase = 3;
                                        this.loadedcars = -1;
                                        this.loadedcar = 0;
                                        this.ctab = 2;
                                        this.tab = 3;
                                    }
                                }
                                if (this.cmlinetyp[n85] == 40 || this.cmlinetyp[n85] == 70) {
                                    if (this.stringbutton(this.rd, "  View Clan  ", 267, 112 + 17 * n85 - this.scro, 0, n, n2, b, 0, 0)) {
                                        final String svalue8 = this.getSvalue(this.cmline[n85], 0);
                                        if (!this.claname.equals(svalue8)) {
                                            this.claname = svalue8;
                                            this.loadedc = false;
                                        }
                                        this.spos5 = 0;
                                        this.lspos5 = 0;
                                        this.cfase = 3;
                                        this.ctab = 0;
                                        this.tab = 3;
                                    }
                                    if (this.stringbutton(this.rd, "  View Battle Suggestion  ", 407, 112 + 17 * n85 - this.scro, 0, n, n2, b, 0, 0)) {
                                        this.viewgame1 = 1;
                                        if (this.cmlinetyp[n85] == 40) {
                                            this.nvgames1 = 2;
                                        }
                                        else {
                                            this.nvgames1 = 5;
                                        }
                                        this.xclan = this.getSvalue(this.cmline[n85], 0);
                                        this.viewwar1 = this.getSvalue(this.cmline[n85], 3);
                                    }
                                    if (!this.cmline[n85].endsWith("|out|")) {
                                        if (this.cadmin == 1 && this.stringbutton(this.rd, "  Approve Battle  ", 560, 112 + 17 * n85 - this.scro, 0, n, n2, b, 0, 0)) {
                                            this.tab = 2;
                                            this.itab = 1;
                                            this.litab = -1;
                                            this.openi = 10;
                                            final String svalue9 = this.getSvalue(this.cmline[n85], 0);
                                            if (!this.intclan.equals(svalue9)) {
                                                this.intclan = svalue9;
                                                this.dispi = 0;
                                                this.nil = 0;
                                                this.lastint = "";
                                                this.readint = 1;
                                            }
                                            this.itake = this.getSvalue(this.cmline[n85], 1);
                                            this.igive = this.getSvalue(this.cmline[n85], 2);
                                            this.warnum = this.getSvalue(this.cmline[n85], 3);
                                            this.sendwarnum = true;
                                            if (this.cmlinetyp[n85] == 40) {
                                                this.intsel = 2;
                                            }
                                            else {
                                                this.intsel = 5;
                                            }
                                        }
                                    }
                                    else {
                                        this.rd.setColor(this.color2k(170, 170, 170));
                                        this.rd.drawString("[ Approved or interaction replaced. ]", 604 - this.ftm.stringWidth("[ Approved or interaction replaced. ]") / 2, 112 + 17 * n85 - this.scro);
                                    }
                                    this.rd.setFont(new Font("Tahoma", 0, 11));
                                    this.ftm = this.rd.getFontMetrics();
                                    if (this.stringbutton(this.rd, "  View Stage  ", 217 + this.ftm.stringWidth(this.cmline[n85 + 2]) + 54, 137 + 17 * n85 - this.scro, 6, n, n2, b, 0, 0)) {
                                        this.viewcar = this.getSvalue(this.cmline[n85], 1);
                                        final String svalue10 = this.getSvalue(this.cmline[n85], 0);
                                        if (!this.claname.equals(svalue10)) {
                                            this.claname = svalue10;
                                            this.loadedc = false;
                                        }
                                        this.spos5 = 0;
                                        this.lspos5 = 0;
                                        this.cfase = 3;
                                        this.loadedstages = -1;
                                        this.loadedstage = 0;
                                        this.ctab = 3;
                                        this.tab = 3;
                                    }
                                    this.rd.setFont(new Font("Tahoma", 0, 11));
                                    this.ftm = this.rd.getFontMetrics();
                                    if (this.stringbutton(this.rd, "  View Stage  ", 217 + this.ftm.stringWidth(this.cmline[n85 + 3]) + 54, 154 + 17 * n85 - this.scro, 6, n, n2, b, 0, 0)) {
                                        this.viewcar = this.getSvalue(this.cmline[n85], 2);
                                        if (!this.claname.equals(this.xt.clan)) {
                                            this.claname = this.xt.clan;
                                            this.loadedc = false;
                                        }
                                        this.spos5 = 0;
                                        this.lspos5 = 0;
                                        this.cfase = 3;
                                        this.loadedstages = -1;
                                        this.loadedstage = 0;
                                        this.ctab = 3;
                                        this.tab = 3;
                                    }
                                }
                                if (this.cmlinetyp[n85] == 80 && this.stringbutton(this.rd, "  View Championship  ", 295, 112 + 17 * n85 - this.scro, 0, n, n2, b, 0, 0)) {
                                    this.cfase = 0;
                                    this.ntab = 1;
                                    this.loadwstat = 0;
                                    this.tab = 3;
                                }
                            }
                        }
                    }
                }
                if (this.readclan == -3) {
                    this.rd.setColor(this.color2k(240, 240, 240));
                    this.rd.fillRoundRect(387, 140, 200, 30, 20, 20);
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawRoundRect(387, 140, 200, 30, 20, 20);
                    this.rd.setFont(new Font("Tahoma", 1, 11));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("Reading...", 487 - this.ftm.stringWidth("Reading...") / 2, 160);
                }
                if (this.readclan == -1) {
                    this.rd.setFont(new Font("Arial", 1, 11));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawString("Failed to load clan's conversation, please try again later...", 487 - this.ftm.stringWidth("Failed to load clan's conversation, please try again later...") / 2, 200);
                }
                if (this.readclan == -2) {
                    this.rd.setFont(new Font("Arial", 1, 11));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawString("Failed to send data, please try again later...", 487 - this.ftm.stringWidth("Failed to send data, please try again later...") / 2, 200);
                }
                this.rd.setColor(this.color2k(205, 205, 205));
                this.rd.fillRect(207, 76, 357, 36);
                if (!this.drawl(this.rd, "#" + this.xt.clan + "#", 209, 78, true)) {
                    this.rd.drawRect(209, 78, 349, 29);
                    this.rd.setFont(new Font("Arial", 1, 13));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("" + this.xt.clan + "", 384 - this.ftm.stringWidth("" + this.xt.clan + "") / 2, 98);
                }
                if (n > 209 && n < 559 && n2 > 78 && n2 < 108 && this.blockb == 0) {
                    this.cur = 12;
                    if (b) {
                        if (!this.claname.equals(this.xt.clan)) {
                            this.claname = this.xt.clan;
                            this.loadedc = false;
                        }
                        this.spos5 = 0;
                        this.lspos5 = 0;
                        this.cfase = 3;
                        this.ctab = 0;
                        this.tab = 3;
                    }
                }
            }
            else if (this.xt.logged) {
                this.rd.setFont(new Font("Arial", 1, 12));
                this.ftm = this.rd.getFontMetrics();
                this.rd.setColor(new Color(0, 0, 0));
                this.rd.drawString("You are not a member of any clan.  You need to join a clan first to have access to this.", 487 - this.ftm.stringWidth("You are not a member of any clan.  You need to join a clan first to have access to this.") / 2, 170);
                if (this.stringbutton(this.rd, "   Find a clan to join   ", 487, 200, 1, n, n2, b, 0, 0)) {
                    this.tab = 3;
                    this.cfase = 2;
                    this.em = 1;
                    this.msg = "Clan Search";
                    this.smsg = "Listing clans with recent activity...";
                    this.nclns = 0;
                    this.spos5 = 0;
                    this.lspos5 = 0;
                    this.flko = 0;
                }
            }
            else {
                this.rd.setFont(new Font("Arial", 1, 13));
                this.ftm = this.rd.getFontMetrics();
                this.rd.drawString("You are currently using a trial account.", 495 - this.ftm.stringWidth("You are currently using a trial account.") / 2, 150);
                this.rd.drawString("You need to upgrade to be able participate in NFM clan's activities.", 495 - this.ftm.stringWidth("You need to upgrade to be able participate in NFM clan's activities.") / 2, 170);
                this.rd.setColor(new Color(206, 171, 98));
                this.rd.fillRoundRect(405, 193, 180, 50, 20, 20);
                if (this.drawbutton(this.xt.upgrade, 495, 218, n, n2, b)) {
                    this.gs.editlink(this.xt.nickname, true);
                }
            }
            this.rd.setColor(this.color2k(205, 205, 205));
            this.rd.fillRect(207, 46, 582, 30);
            this.rd.setFont(new Font("Arial", 1, 12));
            this.ftm = this.rd.getFontMetrics();
            final String[] array26 = { "Player Interaction", "Clan Interaction", "Your Clan's Discussion" };
            final int[] array27 = { 207, 390, 368, 207 };
            final int[] array28 = { 73, 73, 51, 51 };
            for (int itab6 = 0; itab6 < 3; ++itab6) {
                if (this.itab == itab6) {
                    this.rd.setColor(this.color2k(230, 230, 230));
                    this.rd.fillPolygon(array27, array28, 4);
                }
                else if (n > array27[0] && n < array27[2] && n2 > 51 && n2 < 73) {
                    this.rd.setColor(this.color2k(217, 217, 217));
                    this.rd.fillPolygon(array27, array28, 4);
                    if (b) {
                        this.itab = itab6;
                    }
                }
                this.rd.setColor(this.color2k(150, 150, 150));
                this.rd.drawPolygon(array27, array28, 4);
                this.rd.setColor(this.color2k(40, 40, 40));
                this.rd.drawString(array26[itab6], array27[0] + 80 - this.ftm.stringWidth(array26[itab6]) / 2, 67);
                for (int n86 = 0; n86 < 4; ++n86) {
                    final int[] array29 = array27;
                    final int n87 = n86;
                    array29[n87] += 183;
                }
            }
            this.rd.setColor(this.color2k(150, 150, 150));
            this.rd.drawLine(207, 73, 770, 73);
            this.rd.setColor(this.color2k(205, 205, 205));
            this.rd.fillRect(207, 360, 582, 79);
            this.rd.setColor(this.color2k(150, 150, 150));
            this.rd.drawLine(207, 362, 770, 362);
            this.rd.setColor(this.color2k(205, 205, 205));
            this.rd.fillRect(772, 76, 17, 333);
            this.rd.setColor(this.color2k(205, 205, 205));
            this.rd.fillRect(203, 46, 4, 393);
            if (this.mscro3 == 831 || this.sdist == 0) {
                if (this.sdist == 0) {
                    this.rd.setColor(this.color2k(205, 205, 205));
                }
                else {
                    this.rd.setColor(this.color2k(215, 215, 215));
                }
                this.rd.fillRect(772, 76, 17, 17);
            }
            else {
                this.rd.setColor(this.color2k(220, 220, 220));
                this.rd.fill3DRect(772, 76, 17, 17, true);
            }
            if (this.sdist != 0) {
                this.rd.drawImage(this.xt.asu, 777, 82, null);
            }
            if (this.mscro3 == 832 || this.sdist == 0) {
                if (this.sdist == 0) {
                    this.rd.setColor(this.color2k(205, 205, 205));
                }
                else {
                    this.rd.setColor(this.color2k(215, 215, 215));
                }
                this.rd.fillRect(772, 343, 17, 17);
            }
            else {
                this.rd.setColor(this.color2k(220, 220, 220));
                this.rd.fill3DRect(772, 343, 17, 17, true);
            }
            if (this.sdist != 0) {
                this.rd.drawImage(this.xt.asd, 777, 350, null);
            }
            if (this.sdist != 0) {
                if (this.lspos3 != this.spos3) {
                    this.rd.setColor(this.color2k(215, 215, 215));
                    this.rd.fillRect(772, 93 + this.spos3, 17, 31);
                }
                else {
                    if (this.mscro3 == 831) {
                        this.rd.setColor(this.color2k(215, 215, 215));
                    }
                    this.rd.fill3DRect(772, 93 + this.spos3, 17, 31, true);
                }
                this.rd.setColor(this.color2k(150, 150, 150));
                this.rd.drawLine(777, 106 + this.spos3, 783, 106 + this.spos3);
                this.rd.drawLine(777, 108 + this.spos3, 783, 108 + this.spos3);
                this.rd.drawLine(777, 110 + this.spos3, 783, 110 + this.spos3);
                if (this.mscro3 > 800 && this.lspos3 != this.spos3) {
                    this.lspos3 = this.spos3;
                }
                if (b && this.openc == 0) {
                    if (this.mscro3 == 825 && n > 772 && n < 789 && n2 > 93 + this.spos3 && n2 < this.spos3 + 124) {
                        this.mscro3 = n2 - this.spos3;
                    }
                    if (this.mscro3 == 825 && n > 770 && n < 791 && n2 > 74 && n2 < 95) {
                        this.mscro3 = 831;
                    }
                    if (this.mscro3 == 825 && n > 770 && n < 791 && n2 > 341 && n2 < 362) {
                        this.mscro3 = 832;
                    }
                    if (this.mscro3 == 825 && n > 772 && n < 789 && n2 > 93 && n2 < 343) {
                        this.mscro3 = 108;
                        this.spos3 = n2 - this.mscro3;
                    }
                    int n88 = 2670 / this.sdist;
                    if (n88 < 1) {
                        n88 = 1;
                    }
                    if (this.mscro3 == 831) {
                        this.spos3 -= n88;
                        if (this.spos3 > 219) {
                            this.spos3 = 219;
                        }
                        if (this.spos3 < 0) {
                            this.spos3 = 0;
                        }
                        this.lspos3 = this.spos3;
                    }
                    if (this.mscro3 == 832) {
                        this.spos3 += n88;
                        if (this.spos3 > 219) {
                            this.spos3 = 219;
                        }
                        if (this.spos3 < 0) {
                            this.spos3 = 0;
                        }
                        this.lspos3 = this.spos3;
                    }
                    if (this.mscro3 < 800) {
                        this.spos3 = n2 - this.mscro3;
                        if (this.spos3 > 219) {
                            this.spos3 = 219;
                        }
                        if (this.spos3 < 0) {
                            this.spos3 = 0;
                        }
                    }
                    if (this.mscro3 == 825) {
                        this.mscro3 = 925;
                    }
                }
                else if (this.mscro3 != 825) {
                    this.mscro3 = 825;
                }
            }
            if (this.viewgame1 != 0) {
                this.rd.setColor(this.color2k(210, 210, 210));
                this.rd.fillRoundRect(204, 127, 583, 230, 20, 20);
                this.rd.setColor(this.color2k(150, 150, 150));
                this.rd.drawRoundRect(204, 127, 583, 230, 20, 20);
                this.rd.setFont(new Font("Tahoma", 1, 11));
                this.ftm = this.rd.getFontMetrics();
                this.rd.setColor(new Color(0, 0, 0));
                if (this.nvgames1 == 4) {
                    this.rd.drawString("War declaration, your clan " + this.xt.clan + " versus " + this.xclan + ".", 215, 145);
                    if (this.viewgame1 == 2) {
                        this.rd.drawString("" + this.xclan + " would create 5 more games and the first clan to win 5 games wins the war!", 215, 210 + this.nvgames1 * 18);
                    }
                }
                if (this.nvgames1 == 2) {
                    this.rd.drawString("Battle, your clan " + this.xt.clan + " versus " + this.xclan + ".", 215, 145);
                    if (this.viewgame1 == 2) {
                        this.rd.drawString("" + this.xclan + " would create 3 more games and the first clan to win 3 games wins the battle!", 215, 210 + this.nvgames1 * 18);
                    }
                }
                if (this.nvgames1 == 9) {
                    this.rd.drawString("Suggestion to accept war, your clan " + this.xt.clan + " versus " + this.xclan + ".", 215, 145);
                }
                if (this.nvgames1 == 5) {
                    this.rd.drawString("Suggestion to accept to battle, your clan " + this.xt.clan + " versus " + this.xclan + ".", 215, 145);
                }
                if (this.stringbutton(this.rd, "Close X", 749, 148, 3, n, n2, b, 0, 0)) {
                    this.viewgame1 = 0;
                }
                this.rd.setFont(new Font("Tahoma", 1, 11));
                this.ftm = this.rd.getFontMetrics();
                this.rd.setColor(new Color(0, 0, 0));
                if (this.viewgame1 == 2) {
                    this.rd.drawString("Game", 246 - this.ftm.stringWidth("Game") / 2, 175);
                    this.rd.drawString("Stage", 412 - this.ftm.stringWidth("Stage") / 2, 175);
                    this.rd.drawString("Laps", 564 - this.ftm.stringWidth("Laps") / 2, 175);
                    this.rd.drawString("Type of Cars", 653 - this.ftm.stringWidth("Type of Cars") / 2, 175);
                    this.rd.drawString("Fixing", 751 - this.ftm.stringWidth("Fixing") / 2, 175);
                    int n89 = 1;
                    int n90 = 1;
                    if (this.nvgames1 == 4 || this.nvgames1 == 2) {
                        n89 = 2;
                        n90 = 2;
                    }
                    for (int n91 = 0; n91 < this.nvgames1; ++n91) {
                        this.rd.setFont(new Font("Tahoma", 0, 11));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.drawString("# " + n89 + "", 246 - this.ftm.stringWidth("# " + n89 + "") / 2, 193 + n91 * 18);
                        n89 += n90;
                        this.rd.drawString(this.vwstages1[n91], 412 - this.ftm.stringWidth(this.vwstages1[n91]) / 2, 193 + n91 * 18);
                        this.rd.drawString("" + this.vwlaps1[n91] + "", 564 - this.ftm.stringWidth("" + this.vwlaps1[n91] + "") / 2, 193 + n91 * 18);
                        String str9 = "All Cars";
                        if (this.vwcars1[n91] == 2) {
                            str9 = "Clan Cars";
                        }
                        if (this.vwcars1[n91] == 3) {
                            str9 = "Game Cars";
                        }
                        if (this.vwclass1[n91] == 0) {
                            str9 += ", All Classes";
                        }
                        if (this.vwclass1[n91] == 1) {
                            str9 += ", Class C";
                        }
                        if (this.vwclass1[n91] == 2) {
                            str9 += ", Class B & C";
                        }
                        if (this.vwclass1[n91] == 3) {
                            str9 += ", Class B";
                        }
                        if (this.vwclass1[n91] == 4) {
                            str9 += ", Class A & B";
                        }
                        if (this.vwclass1[n91] == 5) {
                            str9 += ", Class A";
                        }
                        this.rd.drawString(str9, 653 - this.ftm.stringWidth(str9) / 2, 193 + n91 * 18);
                        String str10 = "Infinite";
                        if (this.vwfix1[n91] == 1) {
                            str10 = "4 Fixes";
                        }
                        if (this.vwfix1[n91] == 2) {
                            str10 = "3 Fixes";
                        }
                        if (this.vwfix1[n91] == 3) {
                            str10 = "2 Fixes";
                        }
                        if (this.vwfix1[n91] == 4) {
                            str10 = "1 Fix";
                        }
                        if (this.vwfix1[n91] == 5) {
                            str10 = "No Fixing";
                        }
                        this.rd.drawString(str10, 751 - this.ftm.stringWidth(str10) / 2, 193 + n91 * 18);
                        this.rd.drawRect(213, 180 + n91 * 18, 565, 18);
                    }
                    this.rd.drawLine(213, 162, 213, 180 + this.nvgames1 * 18);
                    this.rd.drawLine(279, 162, 279, 180 + this.nvgames1 * 18);
                    this.rd.drawLine(546, 162, 546, 180 + this.nvgames1 * 18);
                    this.rd.drawLine(583, 162, 583, 180 + this.nvgames1 * 18);
                    this.rd.drawLine(723, 162, 723, 180 + this.nvgames1 * 18);
                    this.rd.drawLine(778, 162, 778, 180 + this.nvgames1 * 18);
                }
                if (this.viewgame1 == 1) {
                    this.rd.drawString("Loading...", 495 - this.ftm.stringWidth("Loading...") / 2, 242);
                }
                if (this.viewgame1 == 3) {
                    if (this.nvgames1 == 4 || this.nvgames1 == 9) {
                        this.rd.drawString("This war suggestion has expired and no longer exists.", 495 - this.ftm.stringWidth("This war suggestion has expired and no longer exists.") / 2, 232);
                    }
                    if (this.nvgames1 == 2 || this.nvgames1 == 5) {
                        this.rd.drawString("This battle suggestion has expired and no longer exists.", 495 - this.ftm.stringWidth("This battle suggestion has expired and no longer exists.") / 2, 232);
                    }
                    this.rd.drawString("(Suggestions expire after 90 days.)", 495 - this.ftm.stringWidth("(Suggestions expire after 90 days.)") / 2, 252);
                }
                if (this.viewgame1 == 4) {
                    this.rd.drawString("Error loading suggestion, please try again later...", 495 - this.ftm.stringWidth("Error loading suggestion, please try again later...") / 2, 242);
                }
            }
            if (!this.xt.clan.equals("")) {
                if (!this.gs.sendtyp.isShowing()) {
                    this.gs.sendtyp.show();
                    this.gs.sendtyp.select(0);
                }
                this.gs.sendtyp.move(207, 365);
                if (this.sendcmsg != 0) {
                    this.gs.sendtyp.disable();
                }
                else {
                    this.gs.sendtyp.enable();
                }
                this.darker = true;
                if (this.gs.sendtyp.getSelectedIndex() == 0) {
                    this.dommsg = true;
                    if (this.sendcmsg == 0) {
                        if (this.stringbutton(this.rd, "   Send  >  ", 723, 408, 0, n, n2, b, 0, 0) && !this.gs.mmsg.getText().trim().equals("") && this.gs.mmsg.getText().toLowerCase().indexOf(this.gs.tpass.getText().toLowerCase()) == -1 && this.xt.acexp != -3) {
                            if (!this.xt.msgcheck(this.gs.mmsg.getText())) {
                                this.sendcmsg = 1;
                                this.viewgame1 = 0;
                            }
                            else {
                                this.gs.sendtyp.hide();
                                final xtGraphics xt3 = this.xt;
                                ++xt3.warning;
                            }
                        }
                    }
                    else {
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.setColor(new Color(0, 0, 0));
                        this.rd.drawString("Sending...", 723 - this.ftm.stringWidth("Sending...") / 2, 408);
                    }
                }
                if (this.gs.sendtyp.getSelectedIndex() == 1) {
                    this.rd.setFont(new Font("Arial", 0, 12));
                    this.rd.setColor(new Color(0, 0, 0));
                    this.rd.drawString("A date that gets converted to the local time of any person previewing it.", 376, 382);
                    if (!this.gs.senditem.isShowing()) {
                        this.gs.senditem.removeAll();
                        final Calendar instance3 = Calendar.getInstance();
                        int n92 = 0;
                        for (int n93 = 0; n93 < 20; ++n93) {
                            String str11 = this.wday[instance3.get(7) - 1];
                            if (n92 == 0) {
                                str11 = "Today";
                                n92 = 1;
                            }
                            this.gs.senditem.add(this.rd, "" + str11 + "  -  " + this.month[instance3.get(2)] + " " + instance3.get(5) + "");
                            instance3.roll(5, true);
                        }
                        this.gs.senditem.select(0);
                        this.gs.senditem.show();
                    }
                    if (!this.gs.datat.isShowing()) {
                        this.gs.datat.removeAll();
                        int i3 = 12;
                        String str12 = "PM";
                        for (int n94 = 0; n94 < 24; ++n94) {
                            this.gs.datat.add(this.rd, "" + i3 + " " + str12 + "");
                            if (++i3 == 12) {
                                str12 = "AM";
                            }
                            if (i3 == 13) {
                                i3 = 1;
                            }
                        }
                        this.gs.datat.select(0);
                        this.gs.datat.show();
                    }
                    this.gs.senditem.move(300, 395);
                    this.gs.datat.move(491, 395);
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    this.rd.drawString("Date is displayed based on your computer calendar's date/time, please make sure it is correct.", 207, 435);
                    if (this.sendcmsg == 0) {
                        if (this.stringbutton(this.rd, "   Send  >  ", 723, 408, 0, n, n2, b, 0, 0)) {
                            this.sendcmsg = 1;
                            this.viewgame1 = 0;
                        }
                    }
                    else {
                        this.rd.setFont(new Font("Arial", 1, 12));
                        this.ftm = this.rd.getFontMetrics();
                        this.rd.drawString("Sending...", 723 - this.ftm.stringWidth("Sending...") / 2, 408);
                    }
                }
                else {
                    if (this.gs.senditem.isShowing()) {
                        this.gs.senditem.hide();
                    }
                    if (this.gs.datat.isShowing()) {
                        this.gs.datat.hide();
                    }
                }
                this.darker = false;
            }
        }
    }
    
    @Override
    public void run() {
        try {
            this.socket = new Socket(this.lg.servers[0], 7061);
            this.din = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            this.dout = new PrintWriter(this.socket.getOutputStream(), true);
        }
        catch (final Exception ex) {
            this.domon = false;
        }
        while (this.domon) {
            String s = "";
            final String string = "101|0|" + this.xt.nickname + ":" + this.xt.nickey + "|";
            try {
                this.dout.println(string);
                s = this.din.readLine();
                if (s == null) {
                    this.domon = false;
                }
            }
            catch (final Exception ex2) {
                this.domon = false;
            }
            if (this.domon) {
                this.ntime = this.getLvalue(s, 0);
                this.maxclans = this.getvalue(s, 1);
                for (int i = 0; i < 3; ++i) {
                    for (int j = 0; j < 5; ++j) {
                        this.roomf[i][j] = 0;
                    }
                }
                int npo = 0;
                int n = 2;
                int k = 0;
                while (k == 0) {
                    final String svalue = this.getSvalue(s, n);
                    if (!svalue.equals("")) {
                        final int getvalue = this.getvalue(s, n + 1);
                        final int getvalue2 = this.getvalue(s, n + 2);
                        if ((getvalue == -1 || getvalue2 == -1) && npo < 900) {
                            this.pname[npo] = svalue;
                            this.proom[npo] = getvalue;
                            this.pserver[npo] = getvalue2;
                            ++npo;
                        }
                    }
                    else {
                        k = 1;
                    }
                    n += 3;
                }
                int n2 = 2;
                int l = 0;
                while (l == 0) {
                    final String svalue2 = this.getSvalue(s, n2);
                    if (!svalue2.equals("")) {
                        final int getvalue3 = this.getvalue(s, n2 + 1);
                        final int getvalue4 = this.getvalue(s, n2 + 2);
                        if (getvalue3 >= 0 && getvalue3 <= 4 && getvalue4 >= 0 && getvalue4 <= 2) {
                            final int[] array = this.roomf[getvalue4];
                            final int n3 = getvalue3;
                            ++array[n3];
                            if (npo < 900) {
                                this.pname[npo] = svalue2;
                                this.proom[npo] = getvalue3;
                                this.pserver[npo] = getvalue4;
                                ++npo;
                            }
                        }
                    }
                    else {
                        l = 1;
                    }
                    n2 += 3;
                }
                this.npo = npo;
            }
            if (this.ptab == 1) {
                if (this.freq == 2) {
                    final String string2 = "101|14|" + this.xt.nickname + "|" + this.xt.nickey + "|" + this.freqname + "|";
                    try {
                        this.dout.println(string2);
                        s = this.din.readLine();
                    }
                    catch (final Exception ex3) {}
                    if (s.equals("OK")) {
                        this.freq = 0;
                        this.npf = -1;
                    }
                    else {
                        this.freq = -1;
                        this.cntf = 40;
                    }
                }
                if (this.freq == 3) {
                    final String string3 = "101|15|" + this.xt.nickname + "|" + this.xt.nickey + "|" + this.freqname + "|";
                    try {
                        this.dout.println(string3);
                        s = this.din.readLine();
                    }
                    catch (final Exception ex4) {}
                    if (s.equals("OK")) {
                        this.freq = 0;
                        this.npf = -1;
                    }
                    else {
                        this.freq = -2;
                        this.cntf = 40;
                    }
                }
                if (this.freq == -6) {
                    final String string4 = "101|18|" + this.xt.nickname + "|" + this.xt.nickey + "|";
                    try {
                        this.dout.println(string4);
                        s = this.din.readLine();
                    }
                    catch (final Exception ex5) {}
                    this.freq = 0;
                }
                this.loadfriends();
            }
            if (this.sfreq == 1) {
                final String string5 = "101|16|" + this.xt.nickname + "|" + this.xt.nickey + "|" + this.proname + "|";
                try {
                    this.dout.println(string5);
                    s = this.din.readLine();
                }
                catch (final Exception ex6) {}
                if (s.equals("OK")) {
                    this.sfreq = 2;
                }
                else {
                    this.sfreq = 3;
                }
            }
            if (this.sfreq == 4) {
                final String string6 = "101|17|" + this.xt.nickname + "|" + this.xt.nickey + "|" + this.proname + "|";
                try {
                    this.dout.println(string6);
                    s = this.din.readLine();
                }
                catch (final Exception ex7) {}
                if (s.equals("OK")) {
                    this.sfreq = 5;
                    this.npf = -1;
                }
                else {
                    this.sfreq = 6;
                }
            }
            if (this.sentchange == 2 && this.domon) {
                final String string7 = "101|5|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.sentance + "|";
                try {
                    this.dout.println(string7);
                    s = this.din.readLine();
                }
                catch (final Exception ex8) {}
                this.sentchange = 0;
            }
            if (this.tab == 2 && this.domon) {
                if (this.itab == 0) {
                    if (!this.blockname.equals("")) {
                        for (int n4 = 0; n4 < this.nm; ++n4) {
                            if (this.mname[n4].equals(this.blockname)) {
                                this.mtyp[n4] = 3;
                                break;
                            }
                        }
                        try {
                            this.dout.println("101|11|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.blockname + "|");
                            s = this.din.readLine();
                        }
                        catch (final Exception ex9) {}
                        this.blockname = "";
                    }
                    if (!this.unblockname.equals("")) {
                        for (int n5 = 0; n5 < this.nm; ++n5) {
                            if (this.mname[n5].equals(this.unblockname)) {
                                this.mtyp[n5] = 0;
                                break;
                            }
                        }
                        try {
                            this.dout.println("101|12|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.unblockname + "|");
                            s = this.din.readLine();
                        }
                        catch (final Exception ex10) {}
                        this.unblockname = "";
                    }
                    try {
                        this.dout.println("101|13|" + this.xt.nickname + "|" + this.xt.nickey + "|" + this.loadmsgs + "|");
                        s = this.din.readLine();
                        if (s.startsWith("MSGS")) {
                            this.loadmsgs = this.getvalue(s, 1);
                            final DataInputStream dataInputStream = new DataInputStream(this.socket.getInputStream());
                            final byte[] array2 = new byte[this.loadmsgs];
                            dataInputStream.readFully(array2);
                            s = this.din.readLine();
                            final DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(array2));
                            this.nm = 0;
                            String line;
                            while ((line = dataInputStream2.readLine()) != null && this.nm < 200) {
                                this.mname[this.nm] = this.getSvalue(line, 0);
                                this.mtyp[this.nm] = this.getvalue(line, 1);
                                this.mconvo[this.nm] = this.getSvalue(line, 2);
                                this.msub[this.nm] = this.getSvalue(line, 3);
                                this.mctime[this.nm] = this.getLvalue(line, 4);
                                this.mtime[this.nm] = "";
                                ++this.nm;
                            }
                        }
                        else if (s.equals("NOMSGS")) {
                            this.loadmsgs = 0;
                        }
                    }
                    catch (final Exception ex11) {
                        this.loadmsgs = -2;
                    }
                    if (this.loadmsgs > 0) {
                        for (int n6 = 0; n6 < this.nm; ++n6) {
                            if (this.mctime[n6] > 0L) {
                                try {
                                    final long n7 = this.ntime - this.mctime[n6];
                                    String s2 = "Received";
                                    if (this.mtyp[n6] == 2) {
                                        s2 = "Sent";
                                    }
                                    if (n7 >= 1000L && n7 < 60000L) {
                                        this.mtime[n6] = "" + s2 + " seconds ago";
                                    }
                                    if (n7 >= 60000L && n7 < 3600000L) {
                                        final int m = (int)(n7 / 60000L);
                                        String str = "s";
                                        if (m == 1) {
                                            str = "";
                                        }
                                        this.mtime[n6] = "" + s2 + " " + m + " minute" + str + " ago";
                                    }
                                    if (n7 >= 3600000L && n7 < 86400000L) {
                                        final int i2 = (int)(n7 / 3600000L);
                                        String str2 = "s";
                                        if (i2 == 1) {
                                            str2 = "";
                                        }
                                        this.mtime[n6] = "" + s2 + " " + i2 + " hour" + str2 + " ago";
                                    }
                                    if (n7 >= 86400000L) {
                                        final int i3 = (int)(n7 / 86400000L);
                                        String str3 = "s";
                                        if (i3 == 1) {
                                            str3 = "";
                                        }
                                        this.mtime[n6] = "" + s2 + " " + i3 + " day" + str3 + " ago";
                                    }
                                }
                                catch (final Exception ex12) {
                                    this.mtime[n6] = "";
                                }
                            }
                            else {
                                this.mtime[n6] = "";
                            }
                        }
                    }
                    if (this.openc != 0) {
                        boolean b = false;
                        int n8 = -1;
                        for (int n9 = 0; n9 < this.nm; ++n9) {
                            if (this.mname[n9].equals(this.opname)) {
                                n8 = n9;
                                break;
                            }
                        }
                        if (n8 != -1 && this.readmsg != 3 && this.readmsg != 4 && this.readmsg != 5) {
                            if (!this.lastsub.equals("" + this.mctime[n8])) {
                                b = true;
                                this.readmsg = 1;
                            }
                            else {
                                this.readmsg = 2;
                            }
                        }
                        else {
                            this.lastsub = "";
                            if (this.readmsg == 1) {
                                this.readmsg = 0;
                                this.nml = 0;
                            }
                        }
                        if (b) {
                            try {
                                this.dout.println("101|8|" + this.xt.nickname + "|" + this.xt.nickey + "|" + this.mconvo[n8] + "");
                                s = this.din.readLine();
                                if (s.startsWith("RECIVE")) {
                                    for (int n10 = 0; n10 < this.nml; ++n10) {
                                        this.mline[n10] = null;
                                        this.mlinetyp[n10] = 0;
                                        this.mctimes[n10] = 0L;
                                        this.mtimes[n10] = null;
                                    }
                                    this.nml = 0;
                                    this.cd.acname = "";
                                    this.cd.action = 0;
                                    this.cd.onstage = "";
                                    this.addstage = 0;
                                    this.nclns = 0;
                                    final int getvalue5 = this.getvalue(s, 1);
                                    final DataInputStream dataInputStream3 = new DataInputStream(this.socket.getInputStream());
                                    final byte[] array3 = new byte[getvalue5];
                                    dataInputStream3.readFully(array3);
                                    s = this.din.readLine();
                                    String line2;
                                    while ((line2 = new DataInputStream(new ByteArrayInputStream(array3)).readLine()) != null) {
                                        if (line2.startsWith("|")) {
                                            if (this.nml != 0) {
                                                this.mline[this.nml] = "";
                                                this.mlinetyp[this.nml] = 167;
                                                ++this.nml;
                                            }
                                            String svalue3 = this.getSvalue(line2, 1);
                                            if (svalue3.toLowerCase().equals(this.xt.nickname.toLowerCase())) {
                                                svalue3 = "You";
                                            }
                                            this.mlinetyp[this.nml] = this.getvalue(line2, 2);
                                            final int n11 = this.mlinetyp[this.nml];
                                            if (n11 == 0) {
                                                this.mline[this.nml] = "" + svalue3 + " wrote:";
                                                this.mctimes[this.nml] = this.getLvalue(line2, 3);
                                                this.mtimes[this.nml] = "";
                                                ++this.nml;
                                            }
                                            if (n11 == 1) {
                                                this.mline[this.nml] = "" + svalue3 + " shared a car:";
                                                this.mctimes[this.nml] = this.getLvalue(line2, 3);
                                                this.mtimes[this.nml] = "";
                                                ++this.nml;
                                                this.mline[this.nml] = this.getSvalue(line2, 4);
                                                this.mlinetyp[this.nml] = 10;
                                                ++this.nml;
                                                this.mline[this.nml] = "";
                                                this.mlinetyp[this.nml] = 167;
                                                ++this.nml;
                                            }
                                            if (n11 == 2) {
                                                this.mline[this.nml] = "" + svalue3 + " shared a stage:";
                                                this.mctimes[this.nml] = this.getLvalue(line2, 3);
                                                this.mtimes[this.nml] = "";
                                                ++this.nml;
                                                this.mline[this.nml] = this.getSvalue(line2, 4);
                                                this.mlinetyp[this.nml] = 20;
                                                ++this.nml;
                                                this.mline[this.nml] = "";
                                                this.mlinetyp[this.nml] = 167;
                                                ++this.nml;
                                            }
                                            if (n11 == 3) {
                                                if (svalue3.equals("You")) {
                                                    this.mline[this.nml] = "You have invited " + this.mname[n8] + " to join your clan:";
                                                }
                                                else {
                                                    this.mline[this.nml] = "" + svalue3 + " has invited you to join clan:";
                                                }
                                                this.mctimes[this.nml] = this.getLvalue(line2, 3);
                                                this.mtimes[this.nml] = "";
                                                ++this.nml;
                                                this.mline[this.nml] = this.getSvalue(line2, 4);
                                                if (this.nclns < 20) {
                                                    this.clanlo[this.nclns] = this.mline[this.nml];
                                                    ++this.nclns;
                                                }
                                                this.mlinetyp[this.nml] = 30;
                                                ++this.nml;
                                                this.mline[this.nml] = "";
                                                this.mlinetyp[this.nml] = 167;
                                                ++this.nml;
                                                if (!svalue3.equals("You")) {
                                                    if (this.xt.clan.equals("")) {
                                                        this.mline[this.nml] = "(If you would like join this clan, visit that clan's page and click 'Request to Join..'.)";
                                                    }
                                                    else {
                                                        this.mline[this.nml] = "(You will need to leave your clan " + this.xt.clan + " first before being able to join...)";
                                                    }
                                                    this.mlinetyp[this.nml] = -1;
                                                    ++this.nml;
                                                }
                                            }
                                            if (n11 != 4) {
                                                continue;
                                            }
                                            if (svalue3.equals("You")) {
                                                this.mline[this.nml] = "You have shared the following date:";
                                            }
                                            else {
                                                this.mline[this.nml] = "" + svalue3 + " has shared the following date:";
                                            }
                                            this.mctimes[this.nml] = this.getLvalue(line2, 3);
                                            this.mtimes[this.nml] = "";
                                            final Calendar instance = Calendar.getInstance();
                                            final long timeInMillis = instance.getTimeInMillis() - (this.ntime - this.mctimes[this.nml]) + this.getLvalue(line2, 4);
                                            if (timeInMillis > 0L) {
                                                instance.setTimeInMillis(timeInMillis);
                                            }
                                            ++this.nml;
                                            int value = instance.get(11);
                                            String str4 = "AM";
                                            if (instance.get(12) > 30 && ++value == 24) {
                                                value -= 24;
                                            }
                                            if (value >= 12) {
                                                str4 = "PM";
                                            }
                                            if (value > 12) {
                                                value -= 12;
                                            }
                                            if (value == 0) {
                                                value = 12;
                                            }
                                            try {
                                                this.mline[this.nml] = "[  " + this.wday[instance.get(7) - 1] + "  -  " + this.month[instance.get(2)] + " " + instance.get(5) + ",  " + value + " " + str4 + "  ]";
                                            }
                                            catch (final Exception ex13) {
                                                this.mline[this.nml] = "Error occurred while calculating this date.";
                                            }
                                            this.mlinetyp[this.nml] = -1;
                                            ++this.nml;
                                            this.mline[this.nml] = "(Please make sure your computer's calendar/clock is adjusted correctly, to read this date in your local time.)";
                                            this.mlinetyp[this.nml] = -1;
                                            ++this.nml;
                                        }
                                        else {
                                            this.mline[this.nml] = line2;
                                            try {
                                                this.rd.setFont(new Font("Tahoma", 0, 11));
                                                this.ftm = this.rd.getFontMetrics();
                                                int index = 0;
                                                String s3 = "";
                                                while (index < line2.length()) {
                                                    s3 += line2.charAt(index);
                                                    if (this.ftm.stringWidth(s3) > 540) {
                                                        if (s3.lastIndexOf(" ") != -1) {
                                                            this.mline[this.nml] = s3.substring(0, s3.lastIndexOf(" "));
                                                            s3 = s3.substring(s3.lastIndexOf(" ") + 1, s3.length());
                                                        }
                                                        else {
                                                            this.mline[this.nml] = s3;
                                                            s3 = "";
                                                        }
                                                        this.mlinetyp[this.nml] = -1;
                                                        ++this.nml;
                                                    }
                                                    ++index;
                                                }
                                                this.mline[this.nml] = s3;
                                            }
                                            catch (final Exception ex14) {}
                                            this.mlinetyp[this.nml] = -1;
                                            ++this.nml;
                                        }
                                    }
                                    this.readmsg = 2;
                                    this.lastsub = "" + this.mctime[n8];
                                    if (this.mtyp[n8] == 1) {
                                        this.mtyp[n8] = 0;
                                        try {
                                            this.dout.println("101|10|" + this.xt.nickname + "|" + this.opname + "|");
                                            s = this.din.readLine();
                                        }
                                        catch (final Exception ex15) {}
                                    }
                                    this.spos4 = 208;
                                }
                                else {
                                    this.readmsg = 3;
                                }
                            }
                            catch (final Exception ex16) {
                                this.readmsg = 4;
                            }
                        }
                        if (this.readmsg == 2) {
                            for (int n12 = 0; n12 < this.nml; ++n12) {
                                if ((this.mlinetyp[n12] == 0 || this.mlinetyp[n12] == 1 || this.mlinetyp[n12] == 2 || this.mlinetyp[n12] == 3 || this.mlinetyp[n12] == 4) && this.mctimes[n12] > 0L) {
                                    try {
                                        final long n13 = this.ntime - this.mctimes[n12];
                                        if (n13 >= 1000L && n13 < 60000L) {
                                            this.mtimes[n12] = "seconds ago";
                                        }
                                        if (n13 >= 60000L && n13 < 3600000L) {
                                            final int i4 = (int)(n13 / 60000L);
                                            String str5 = "s";
                                            if (i4 == 1) {
                                                str5 = "";
                                            }
                                            this.mtimes[n12] = "" + i4 + " minute" + str5 + " ago";
                                        }
                                        if (n13 >= 3600000L && n13 < 86400000L) {
                                            final int i5 = (int)(n13 / 3600000L);
                                            String str6 = "s";
                                            if (i5 == 1) {
                                                str6 = "";
                                            }
                                            this.mtimes[n12] = "" + i5 + " hour" + str6 + " ago";
                                        }
                                        if (n13 >= 86400000L) {
                                            final int i6 = (int)(n13 / 86400000L);
                                            String str7 = "s";
                                            if (i6 == 1) {
                                                str7 = "";
                                            }
                                            this.mtimes[n12] = "" + i6 + " day" + str7 + " ago";
                                        }
                                    }
                                    catch (final Exception ex17) {
                                        this.mtimes[n12] = "";
                                    }
                                }
                                else {
                                    this.mtimes[n12] = "";
                                }
                            }
                        }
                    }
                    if (this.sendmsg == 2) {
                        this.gs.mmsg.setText(" ");
                        this.sendmsg = 0;
                    }
                    if (this.openc == 10) {
                        if (this.loaditem == 1) {
                            int n14 = 0;
                            final String[] array4 = new String[700];
                            try {
                                final URL url = new URL("http://multiplayer.needformadness.com/cars/lists/" + this.gs.tnick.getText() + ".txt?reqlo=" + (int)(Math.random() * 1000.0) + "");
                                url.openConnection().setConnectTimeout(2000);
                                final DataInputStream dataInputStream4 = new DataInputStream(url.openStream());
                                String line3;
                                while ((line3 = dataInputStream4.readLine()) != null) {
                                    final String string8 = "" + line3.trim();
                                    if (string8.startsWith("mycars")) {
                                        int n15 = 1;
                                        while (n15 != 0 && n14 < 700) {
                                            array4[n14] = this.getfuncSvalue("mycars", string8, n14);
                                            if (array4[n14].equals("")) {
                                                n15 = 0;
                                            }
                                            else {
                                                ++n14;
                                            }
                                        }
                                    }
                                }
                                dataInputStream4.close();
                            }
                            catch (final Exception obj) {
                                if (("" + obj).indexOf("FileNotFound") != -1) {
                                    n14 = 0;
                                }
                                else {
                                    n14 = -1;
                                }
                            }
                            if (n14 == -1) {
                                this.gs.senditem.removeAll();
                                this.gs.senditem.add(this.rd, "Failed to load your cars, please try again later.");
                                this.loaditem = 0;
                            }
                            if (n14 == 0) {
                                this.gs.senditem.removeAll();
                                this.gs.senditem.add(this.rd, "You have no added or published cars to load.");
                                this.loaditem = 0;
                            }
                            if (n14 > 0) {
                                final String[] array5 = new String[700];
                                int n16 = 0;
                                for (int n17 = 0; n17 < n14; ++n17) {
                                    this.gs.senditem.removeAll();
                                    this.gs.senditem.add(this.rd, "Loading shareable cars,  " + (int)(n17 / (float)n14 * 100.0f) + " %");
                                    try {
                                        final URL url2 = new URL(("http://multiplayer.needformadness.com/cars/" + array4[n17] + ".txt?reqlo=" + (int)(Math.random() * 1000.0) + "").replace(' ', '_'));
                                        url2.openConnection().setConnectTimeout(2000);
                                        final DataInputStream dataInputStream5 = new DataInputStream(url2.openStream());
                                        String line4;
                                        while ((line4 = dataInputStream5.readLine()) != null) {
                                            final String string9 = "" + line4.trim();
                                            if (string9.startsWith("details")) {
                                                final String getfuncSvalue = this.getfuncSvalue("details", string9, 0);
                                                if (this.getfuncvalue("details", string9, 1) <= 0 && !getfuncSvalue.toLowerCase().equals(this.gs.tnick.getText().toLowerCase())) {
                                                    continue;
                                                }
                                                array5[n16] = array4[n17];
                                                ++n16;
                                            }
                                        }
                                        dataInputStream5.close();
                                    }
                                    catch (final Exception ex18) {}
                                }
                                this.gs.senditem.removeAll();
                                if (n16 > 0) {
                                    for (int n18 = 0; n18 < n16; ++n18) {
                                        this.gs.senditem.add(this.rd, array5[n18]);
                                    }
                                    this.loaditem = 10;
                                }
                                else {
                                    this.gs.senditem.add(this.rd, "You have no cars that can be shared.");
                                    this.loaditem = 0;
                                }
                            }
                        }
                        if (this.loaditem == 2) {
                            int n19 = 0;
                            final String[] array6 = new String[700];
                            try {
                                final URL url3 = new URL("http://multiplayer.needformadness.com/tracks/lists/" + this.gs.tnick.getText() + ".txt?reqlo=" + (int)(Math.random() * 1000.0) + "");
                                url3.openConnection().setConnectTimeout(2000);
                                final DataInputStream dataInputStream6 = new DataInputStream(url3.openStream());
                                String line5;
                                while ((line5 = dataInputStream6.readLine()) != null) {
                                    final String string10 = "" + line5.trim();
                                    if (string10.startsWith("mystages")) {
                                        int n20 = 1;
                                        while (n20 != 0 && n19 < 700) {
                                            array6[n19] = this.getfuncSvalue("mystages", string10, n19);
                                            if (array6[n19].equals("")) {
                                                n20 = 0;
                                            }
                                            else {
                                                ++n19;
                                            }
                                        }
                                    }
                                }
                                dataInputStream6.close();
                            }
                            catch (final Exception obj2) {
                                if (("" + obj2).indexOf("FileNotFound") != -1) {
                                    n19 = 0;
                                }
                                else {
                                    n19 = -1;
                                }
                            }
                            if (n19 == -1) {
                                this.gs.senditem.removeAll();
                                this.gs.senditem.add(this.rd, "Failed to load your stages, please try again later.");
                                this.loaditem = 0;
                            }
                            if (n19 == 0) {
                                this.gs.senditem.removeAll();
                                this.gs.senditem.add(this.rd, "You have no added or published stages to load.");
                                this.loaditem = 0;
                            }
                            if (n19 > 0) {
                                final String[] array7 = new String[700];
                                int n21 = 0;
                                for (int n22 = 0; n22 < n19; ++n22) {
                                    this.gs.senditem.removeAll();
                                    this.gs.senditem.add(this.rd, "Loading shareable stages,  " + (int)(n22 / (float)n19 * 100.0f) + " %");
                                    try {
                                        final URL url4 = new URL(("http://multiplayer.needformadness.com/tracks/" + array6[n22] + ".txt?reqlo=" + (int)(Math.random() * 1000.0) + "").replace(' ', '_'));
                                        url4.openConnection().setConnectTimeout(2000);
                                        final DataInputStream dataInputStream7 = new DataInputStream(url4.openStream());
                                        String line6;
                                        while ((line6 = dataInputStream7.readLine()) != null) {
                                            final String string11 = "" + line6.trim();
                                            if (string11.startsWith("details")) {
                                                final String getfuncSvalue2 = this.getfuncSvalue("details", string11, 0);
                                                if (this.getfuncvalue("details", string11, 1) <= 0 && !getfuncSvalue2.toLowerCase().equals(this.gs.tnick.getText().toLowerCase())) {
                                                    continue;
                                                }
                                                array7[n21] = array6[n22];
                                                ++n21;
                                            }
                                        }
                                        dataInputStream7.close();
                                    }
                                    catch (final Exception ex19) {}
                                }
                                this.gs.senditem.removeAll();
                                if (n21 > 0) {
                                    for (int n23 = 0; n23 < n21; ++n23) {
                                        this.gs.senditem.add(this.rd, array7[n23]);
                                    }
                                    this.loaditem = 20;
                                }
                                else {
                                    this.gs.senditem.add(this.rd, "You have no stages that can be shared.");
                                    this.loaditem = 0;
                                }
                            }
                        }
                        if (this.gs.sendtyp.getSelectedIndex() == 3 && !this.xt.clan.equals("")) {
                            this.clanlogopng(this.xt.clan);
                        }
                        if (this.sendmsg == 1) {
                            try {
                                String str8 = "#nada#";
                                for (int n24 = 0; n24 < this.nm; ++n24) {
                                    if (this.mname[n24].equals(this.opname)) {
                                        str8 = this.mconvo[n24];
                                        break;
                                    }
                                }
                                String x = "101|9|" + this.xt.nickname + "|" + this.xt.nickey + "|" + this.opname + "|" + str8 + "|" + this.gs.sendtyp.getSelectedIndex() + "|";
                                if (this.gs.sendtyp.getSelectedIndex() == 0) {
                                    final String replaceAll = this.gs.mmsg.getText().replace("|", ":").replaceAll("[\\t\\n\\r]", "|");
                                    String string12 = "";
                                    int index2 = 0;
                                    int n25 = 0;
                                    while (index2 < replaceAll.length()) {
                                        final String string13 = "" + replaceAll.charAt(index2);
                                        if (string13.equals("|")) {
                                            ++n25;
                                        }
                                        else {
                                            n25 = 0;
                                        }
                                        if (n25 <= 1) {
                                            string12 += string13;
                                        }
                                        ++index2;
                                    }
                                    x = x + "" + string12 + "||";
                                }
                                if (this.gs.sendtyp.getSelectedIndex() == 1 || this.gs.sendtyp.getSelectedIndex() == 2) {
                                    x = x + "" + this.gs.senditem.getSelectedItem() + "|";
                                }
                                if (this.gs.sendtyp.getSelectedIndex() == 3) {
                                    x = x + "" + this.xt.clan + "|";
                                }
                                if (this.gs.sendtyp.getSelectedIndex() == 4) {
                                    final Calendar instance2 = Calendar.getInstance();
                                    final long timeInMillis2 = instance2.getTimeInMillis();
                                    instance2.roll(5, this.gs.senditem.getSelectedIndex());
                                    int hourOfDay = this.gs.datat.getSelectedIndex() + 12;
                                    if (hourOfDay >= 24) {
                                        hourOfDay -= 24;
                                    }
                                    instance2.set(instance2.get(1), instance2.get(2), instance2.get(5), hourOfDay, 0);
                                    x = x + "" + (instance2.getTimeInMillis() - timeInMillis2) + "|";
                                }
                                this.dout.println(x);
                                s = this.din.readLine();
                                if (s.equals("OK")) {
                                    this.sendmsg = 2;
                                }
                                else {
                                    this.readmsg = 5;
                                    this.sendmsg = 0;
                                }
                            }
                            catch (final Exception ex20) {
                                this.readmsg = 5;
                                this.sendmsg = 0;
                            }
                        }
                    }
                }
                if (this.itab == 1 && !this.xt.clan.equals("")) {
                    try {
                        this.dout.println("101|38|" + this.xt.clan + "|" + this.xt.clankey + "|" + this.loadinter + "|");
                        s = this.din.readLine();
                        if (s.startsWith("INTER")) {
                            this.loadinter = this.getvalue(s, 1);
                            final DataInputStream dataInputStream8 = new DataInputStream(this.socket.getInputStream());
                            final byte[] array8 = new byte[this.loadinter];
                            dataInputStream8.readFully(array8);
                            s = this.din.readLine();
                            final DataInputStream dataInputStream9 = new DataInputStream(new ByteArrayInputStream(array8));
                            this.ni = 0;
                            String line7;
                            while ((line7 = dataInputStream9.readLine()) != null && this.ni < 200) {
                                this.iclan[this.ni] = this.getSvalue(line7, 0);
                                this.icheck[this.ni] = this.getSvalue(line7, 1);
                                this.iconvo[this.ni] = this.getSvalue(line7, 2);
                                this.isub[this.ni] = this.getSvalue(line7, 3);
                                this.ictime[this.ni] = this.getLvalue(line7, 4);
                                this.itime[this.ni] = "";
                                this.istat[this.ni] = this.getSvalue(line7, 5);
                                if (this.istat[this.ni].equals("War")) {
                                    this.iwarn[this.ni] = this.getSvalue(line7, 6);
                                }
                                if (this.istat[this.ni].equals("Car Battle") || this.istat[this.ni].equals("Stage Battle")) {
                                    this.iwarn[this.ni] = this.getSvalue(line7, 6);
                                    this.itcar[this.ni] = this.getSvalue(line7, 7);
                                    this.igcar[this.ni] = this.getSvalue(line7, 8);
                                }
                                ++this.ni;
                            }
                        }
                        else if (s.equals("NOINTER")) {
                            this.loadinter = 0;
                        }
                    }
                    catch (final Exception ex21) {
                        this.loadmsgs = -2;
                    }
                    if (this.loadinter > 0) {
                        for (int n26 = 0; n26 < this.ni; ++n26) {
                            if (this.ictime[n26] > 0L) {
                                try {
                                    final long n27 = this.ntime - this.ictime[n26];
                                    if (n27 >= 1000L && n27 < 60000L) {
                                        this.itime[n26] = "Seconds ago";
                                    }
                                    if (n27 >= 60000L && n27 < 3600000L) {
                                        final int i7 = (int)(n27 / 60000L);
                                        String str9 = "s";
                                        if (i7 == 1) {
                                            str9 = "";
                                        }
                                        this.itime[n26] = "" + i7 + " minute" + str9 + " ago";
                                    }
                                    if (n27 >= 3600000L && n27 < 86400000L) {
                                        final int i8 = (int)(n27 / 3600000L);
                                        String str10 = "s";
                                        if (i8 == 1) {
                                            str10 = "";
                                        }
                                        this.itime[n26] = "" + i8 + " hour" + str10 + " ago";
                                    }
                                    if (n27 >= 86400000L) {
                                        final int i9 = (int)(n27 / 86400000L);
                                        String str11 = "s";
                                        if (i9 == 1) {
                                            str11 = "";
                                        }
                                        this.itime[n26] = "" + i9 + " day" + str11 + " ago";
                                    }
                                }
                                catch (final Exception ex22) {
                                    this.itime[n26] = "";
                                }
                            }
                            else {
                                this.itime[n26] = "";
                            }
                        }
                    }
                    if (this.loadwstat == 0) {
                        this.loadchamps();
                    }
                    if (this.openi != 0) {
                        boolean b2 = false;
                        int n28 = -1;
                        for (int n29 = 0; n29 < this.ni; ++n29) {
                            if (this.iclan[n29].equals(this.intclan)) {
                                n28 = n29;
                                break;
                            }
                        }
                        if (this.readint == 6) {
                            try {
                                final Thread connector = this.connector;
                                Thread.sleep(2000L);
                            }
                            catch (final InterruptedException ex23) {}
                        }
                        if (n28 != -1 && this.readint != 3 && this.readint != 4 && this.readint != 5) {
                            if (!this.lastint.equals("" + this.ictime[n28])) {
                                b2 = true;
                                this.readint = 1;
                            }
                            else {
                                this.readint = 2;
                            }
                        }
                        else {
                            this.lastint = "";
                            if (this.readint == 1) {
                                this.readint = 0;
                                this.nil = 0;
                            }
                        }
                        if (b2 && this.sendint != 1) {
                            try {
                                this.dout.println("101|40|" + this.xt.clan + "|" + this.xt.clankey + "|" + this.iconvo[n28] + "|");
                                s = this.din.readLine();
                                if (s.startsWith("RECIVE")) {
                                    if (this.istat[n28].equals("Car Battle")) {
                                        this.dispi = 1;
                                        this.dwarn = this.iwarn[n28];
                                        this.dtcar = this.itcar[n28];
                                        this.dgcar = this.igcar[n28];
                                    }
                                    if (this.istat[n28].equals("Stage Battle")) {
                                        this.dispi = 2;
                                        this.dwarn = this.iwarn[n28];
                                        this.dtcar = this.itcar[n28];
                                        this.dgcar = this.igcar[n28];
                                    }
                                    if (this.istat[n28].equals("War")) {
                                        this.dispi = 3;
                                        this.dwarn = this.iwarn[n28];
                                    }
                                    int nil = 0;
                                    final String[] array9 = new String[1000];
                                    final int[] array10 = new int[1000];
                                    final long[] array11 = new long[1000];
                                    final String[] array12 = new String[1000];
                                    if (this.dispi != 0) {
                                        array9[nil] = "";
                                        array10[nil] = 167;
                                        ++nil;
                                        array9[nil] = "";
                                        array10[nil] = 167;
                                        ++nil;
                                    }
                                    final int getvalue6 = this.getvalue(s, 1);
                                    final DataInputStream dataInputStream10 = new DataInputStream(this.socket.getInputStream());
                                    final byte[] array13 = new byte[getvalue6];
                                    dataInputStream10.readFully(array13);
                                    s = this.din.readLine();
                                    String line8;
                                    while ((line8 = new DataInputStream(new ByteArrayInputStream(array13)).readLine()) != null) {
                                        if (line8.startsWith("|")) {
                                            if (nil != 0) {
                                                array9[nil] = "";
                                                array10[nil] = 167;
                                                ++nil;
                                            }
                                            String svalue4 = this.getSvalue(line8, 1);
                                            if (svalue4.toLowerCase().equals(this.xt.nickname.toLowerCase())) {
                                                svalue4 = "You";
                                            }
                                            array10[nil] = this.getvalue(line8, 2);
                                            final int n30 = array10[nil];
                                            if (n30 == 0) {
                                                array9[nil] = "" + svalue4 + " wrote:";
                                                array11[nil] = this.getLvalue(line8, 3);
                                                array12[nil] = "";
                                                ++nil;
                                            }
                                            if (n30 == 1) {
                                                if (svalue4.equals("You")) {
                                                    array9[nil] = "You have shared the following date:";
                                                }
                                                else {
                                                    array9[nil] = "" + svalue4 + " has shared the following date:";
                                                }
                                                array11[nil] = this.getLvalue(line8, 3);
                                                array12[nil] = "";
                                                final Calendar instance3 = Calendar.getInstance();
                                                final long timeInMillis3 = instance3.getTimeInMillis() - (this.ntime - array11[nil]) + this.getLvalue(line8, 4);
                                                if (timeInMillis3 > 0L) {
                                                    instance3.setTimeInMillis(timeInMillis3);
                                                }
                                                ++nil;
                                                int value2 = instance3.get(11);
                                                String str12 = "AM";
                                                if (instance3.get(12) > 30 && ++value2 == 24) {
                                                    value2 -= 24;
                                                }
                                                if (value2 >= 12) {
                                                    str12 = "PM";
                                                }
                                                if (value2 > 12) {
                                                    value2 -= 12;
                                                }
                                                if (value2 == 0) {
                                                    value2 = 12;
                                                }
                                                try {
                                                    array9[nil] = "[  " + this.wday[instance3.get(7) - 1] + "  -  " + this.month[instance3.get(2)] + " " + instance3.get(5) + ",  " + value2 + " " + str12 + "  ]";
                                                }
                                                catch (final Exception ex24) {
                                                    array9[nil] = "Error occurred while calculating this date.";
                                                }
                                                array10[nil] = -1;
                                                ++nil;
                                                array9[nil] = "(Please make sure your computer's calendar/clock is adjusted correctly, to read this date in your local time.)";
                                                array10[nil] = -1;
                                                ++nil;
                                            }
                                            if (n30 == 4) {
                                                if (svalue4.toLowerCase().equals(this.xt.clan.toLowerCase())) {
                                                    array9[nil] = "Your clan has declared war on " + this.intclan + ":";
                                                    array11[nil] = this.getLvalue(line8, 3);
                                                    array12[nil] = "";
                                                    ++nil;
                                                    array9[nil] = "I|" + this.getSvalue(line8, 4) + "|" + this.getSvalue(line8, 5) + "|";
                                                    array10[nil] = 40;
                                                    ++nil;
                                                    array9[nil] = "";
                                                    array10[nil] = 167;
                                                    ++nil;
                                                    if (this.loadwstat == 1 && !line8.endsWith("|out|")) {
                                                        int n31 = -1;
                                                        int n32 = 0;
                                                        int n33 = -1;
                                                        int n34 = 0;
                                                        for (int n35 = 0; n35 < this.ncc; ++n35) {
                                                            if (this.xt.clan.toLowerCase().equals(this.conclan[n35].toLowerCase())) {
                                                                n32 = this.totp[n35];
                                                                n31 = n35;
                                                            }
                                                            if (this.intclan.toLowerCase().equals(this.conclan[n35].toLowerCase())) {
                                                                n34 = this.totp[n35];
                                                                n33 = n35;
                                                            }
                                                        }
                                                        int i10 = n34 + 1;
                                                        int i11 = n32 + 1;
                                                        if (i11 > n34) {
                                                            i11 = n34;
                                                        }
                                                        if (n31 != -1) {
                                                            int n36 = 0;
                                                            while (n36 < this.nvc[n31]) {
                                                                if (this.intclan.toLowerCase().equals(this.verclan[n31][n36].toLowerCase())) {
                                                                    i10 -= this.points[n31][n36];
                                                                    if (i10 < 0) {
                                                                        i10 = 0;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                else {
                                                                    ++n36;
                                                                }
                                                            }
                                                        }
                                                        array9[nil] = "If you win this war, your clan would get:  [ " + i10 + " points ]   &  " + this.intclan + " would lose:  [ " + i11 + " points ]";
                                                        array10[nil] = -1;
                                                        ++nil;
                                                        int i12 = n32 + 1;
                                                        int i13 = n34 + 1;
                                                        if (i13 > n32) {
                                                            i13 = n32;
                                                        }
                                                        if (n33 != -1) {
                                                            int n37 = 0;
                                                            while (n37 < this.nvc[n33]) {
                                                                if (this.xt.clan.toLowerCase().equals(this.verclan[n33][n37].toLowerCase())) {
                                                                    i12 -= this.points[n33][n37];
                                                                    if (i12 < 0) {
                                                                        i12 = 0;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                else {
                                                                    ++n37;
                                                                }
                                                            }
                                                        }
                                                        array9[nil] = "If you lose this war, your clan would lose:  [ " + i13 + " points ]   &  " + this.intclan + " would get:  [ " + i12 + " points ]";
                                                        array10[nil] = -1;
                                                        ++nil;
                                                    }
                                                    if (!line8.endsWith("|out|")) {
                                                        array9[nil] = "(Waiting for " + this.intclan + " to accept this war declaration and create 5 more games.)";
                                                        array10[nil] = -1;
                                                        ++nil;
                                                    }
                                                }
                                                else {
                                                    array9[nil] = "" + this.intclan + " has declaring war on your clan:";
                                                    array11[nil] = this.getLvalue(line8, 3);
                                                    array12[nil] = "";
                                                    ++nil;
                                                    array9[nil] = "Y|" + this.getSvalue(line8, 4) + "|" + this.getSvalue(line8, 5) + "|";
                                                    array10[nil] = 40;
                                                    ++nil;
                                                    array9[nil] = "";
                                                    array10[nil] = 167;
                                                    ++nil;
                                                    if (this.loadwstat == 1 && !line8.endsWith("|out|")) {
                                                        int n38 = -1;
                                                        int n39 = 0;
                                                        int n40 = -1;
                                                        int n41 = 0;
                                                        for (int n42 = 0; n42 < this.ncc; ++n42) {
                                                            if (this.xt.clan.toLowerCase().equals(this.conclan[n42].toLowerCase())) {
                                                                n39 = this.totp[n42];
                                                                n38 = n42;
                                                            }
                                                            if (this.intclan.toLowerCase().equals(this.conclan[n42].toLowerCase())) {
                                                                n41 = this.totp[n42];
                                                                n40 = n42;
                                                            }
                                                        }
                                                        int i14 = n41 + 1;
                                                        int i15 = n39 + 1;
                                                        if (i15 > n41) {
                                                            i15 = n41;
                                                        }
                                                        if (n38 != -1) {
                                                            int n43 = 0;
                                                            while (n43 < this.nvc[n38]) {
                                                                if (this.intclan.toLowerCase().equals(this.verclan[n38][n43].toLowerCase())) {
                                                                    i14 -= this.points[n38][n43];
                                                                    if (i14 < 0) {
                                                                        i14 = 0;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                else {
                                                                    ++n43;
                                                                }
                                                            }
                                                        }
                                                        array9[nil] = "If you win this war, your clan would get:  [ " + i14 + " points ]   &  " + this.intclan + " would lose:  [ " + i15 + " points ]";
                                                        array10[nil] = -1;
                                                        ++nil;
                                                        int i16 = n39 + 1;
                                                        int i17 = n41 + 1;
                                                        if (i17 > n39) {
                                                            i17 = n39;
                                                        }
                                                        if (n40 != -1) {
                                                            int n44 = 0;
                                                            while (n44 < this.nvc[n40]) {
                                                                if (this.xt.clan.toLowerCase().equals(this.verclan[n40][n44].toLowerCase())) {
                                                                    i16 -= this.points[n40][n44];
                                                                    if (i16 < 0) {
                                                                        i16 = 0;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
                                                                else {
                                                                    ++n44;
                                                                }
                                                            }
                                                        }
                                                        array9[nil] = "If you lose this war, your clan would lose:  [ " + i17 + " points ]   &  " + this.intclan + " would get:  [ " + i16 + " points ]";
                                                        array10[nil] = -1;
                                                        ++nil;
                                                    }
                                                    if (!line8.endsWith("|out|")) {
                                                        array9[nil] = "(You accept this war declaration by creating 5 more games to be added to it.)";
                                                        array10[nil] = -1;
                                                        ++nil;
                                                    }
                                                }
                                            }
                                            if (n30 == 3) {
                                                if (svalue4.toLowerCase().equals(this.xt.clan.toLowerCase())) {
                                                    array9[nil] = "Your clan has challenged " + this.intclan + " to a car battle:";
                                                    array11[nil] = this.getLvalue(line8, 3);
                                                    array12[nil] = "";
                                                    ++nil;
                                                    array9[nil] = "I|" + this.getSvalue(line8, 4) + "|" + this.getSvalue(line8, 5) + "|" + this.getSvalue(line8, 6) + "|" + this.getSvalue(line8, 7) + "|";
                                                    array10[nil] = 30;
                                                    ++nil;
                                                    array9[nil] = "";
                                                    array10[nil] = 167;
                                                    ++nil;
                                                    array9[nil] = "If you win you will take " + this.intclan + "'s car :  [ " + this.getSvalue(line8, 4) + " ]";
                                                    array10[nil] = -1;
                                                    ++nil;
                                                    array9[nil] = "If you lose you will give " + this.intclan + " your clan's car :  [ " + this.getSvalue(line8, 5) + " ]";
                                                    array10[nil] = -1;
                                                    ++nil;
                                                    if (!line8.endsWith("|out|")) {
                                                        array9[nil] = "(Waiting for " + this.intclan + " to accept this car battle and create 3 more games.)";
                                                        array10[nil] = -1;
                                                        ++nil;
                                                    }
                                                }
                                                else {
                                                    array9[nil] = "" + this.intclan + " has challenged your clan to a car battle:";
                                                    array11[nil] = this.getLvalue(line8, 3);
                                                    array12[nil] = "";
                                                    ++nil;
                                                    array9[nil] = "Y|" + this.getSvalue(line8, 5) + "|" + this.getSvalue(line8, 4) + "|" + this.getSvalue(line8, 6) + "|" + this.getSvalue(line8, 7) + "|";
                                                    array10[nil] = 30;
                                                    ++nil;
                                                    array9[nil] = "";
                                                    array10[nil] = 167;
                                                    ++nil;
                                                    array9[nil] = "If you win you will take " + this.intclan + "'s car :  [ " + this.getSvalue(line8, 5) + " ]";
                                                    array10[nil] = -1;
                                                    ++nil;
                                                    array9[nil] = "If you lose you will give " + this.intclan + " your clan's car :  [ " + this.getSvalue(line8, 4) + " ]";
                                                    array10[nil] = -1;
                                                    ++nil;
                                                    if (!line8.endsWith("|out|")) {
                                                        array9[nil] = "(You accept this car battle by creating 3 more games to be added to it.)";
                                                        array10[nil] = -1;
                                                        ++nil;
                                                    }
                                                }
                                            }
                                            if (n30 == 2) {
                                                if (svalue4.toLowerCase().equals(this.xt.clan.toLowerCase())) {
                                                    array9[nil] = "Your clan has challenged " + this.intclan + " to a stage battle:";
                                                    array11[nil] = this.getLvalue(line8, 3);
                                                    array12[nil] = "";
                                                    ++nil;
                                                    array9[nil] = "I|" + this.getSvalue(line8, 4) + "|" + this.getSvalue(line8, 5) + "|" + this.getSvalue(line8, 6) + "|" + this.getSvalue(line8, 7) + "|";
                                                    array10[nil] = 20;
                                                    ++nil;
                                                    array9[nil] = "";
                                                    array10[nil] = 167;
                                                    ++nil;
                                                    String str13 = this.getSvalue(line8, 4);
                                                    if (str13.length() > 20) {
                                                        str13 = "" + str13.substring(0, 20) + "...";
                                                    }
                                                    array9[nil] = "If you win you will take " + this.intclan + "'s stage :  [ " + str13 + " ]";
                                                    array10[nil] = -1;
                                                    ++nil;
                                                    String str14 = this.getSvalue(line8, 5);
                                                    if (str14.length() > 20) {
                                                        str14 = "" + str14.substring(0, 20) + "...";
                                                    }
                                                    array9[nil] = "If you lose you will give " + this.intclan + " your clan's stage :  [ " + str14 + " ]";
                                                    array10[nil] = -1;
                                                    ++nil;
                                                    if (!line8.endsWith("|out|")) {
                                                        array9[nil] = "(Waiting for " + this.intclan + " to accept this stage battle and create 3 more games.)";
                                                        array10[nil] = -1;
                                                        ++nil;
                                                    }
                                                }
                                                else {
                                                    array9[nil] = "" + this.intclan + " has challenged your clan to a stage battle:";
                                                    array11[nil] = this.getLvalue(line8, 3);
                                                    array12[nil] = "";
                                                    ++nil;
                                                    array9[nil] = "Y|" + this.getSvalue(line8, 5) + "|" + this.getSvalue(line8, 4) + "|" + this.getSvalue(line8, 6) + "|" + this.getSvalue(line8, 7) + "|";
                                                    array10[nil] = 20;
                                                    ++nil;
                                                    array9[nil] = "";
                                                    array10[nil] = 167;
                                                    ++nil;
                                                    String str15 = this.getSvalue(line8, 5);
                                                    if (str15.length() > 20) {
                                                        str15 = "" + str15.substring(0, 20) + "...";
                                                    }
                                                    array9[nil] = "If you win you will take " + this.intclan + "'s stage :  [ " + str15 + " ]";
                                                    array10[nil] = -1;
                                                    ++nil;
                                                    String str16 = this.getSvalue(line8, 4);
                                                    if (str16.length() > 20) {
                                                        str16 = "" + str16.substring(0, 20) + "...";
                                                    }
                                                    array9[nil] = "If you lose you will give " + this.intclan + " your clan's stage :  [ " + str16 + " ]";
                                                    array10[nil] = -1;
                                                    ++nil;
                                                    if (!line8.endsWith("|out|")) {
                                                        array9[nil] = "(You accept this stage battle by creating 3 more games to be added to it.)";
                                                        array10[nil] = -1;
                                                        ++nil;
                                                    }
                                                }
                                            }
                                            if (n30 == 5) {
                                                array9[nil] = "A stage battle has now started between your clan and " + this.intclan + " !";
                                                array11[nil] = this.getLvalue(line8, 3);
                                                array12[nil] = "";
                                                ++nil;
                                                array9[nil] = "(See the bar at the top of the page for more details.)";
                                                array10[nil] = -1;
                                                ++nil;
                                                array9[nil] = "Arrange to meet " + this.intclan + " at a chosen room in a server on a specific date to play the battle.";
                                                array10[nil] = -1;
                                                ++nil;
                                                array9[nil] = "Use the 'Share a Relative Date' option to help you organize a time that is suitable for all.";
                                                array10[nil] = -1;
                                                ++nil;
                                            }
                                            if (n30 == 6) {
                                                array9[nil] = "A car battle has now started between your clan and " + this.intclan + " !";
                                                array11[nil] = this.getLvalue(line8, 3);
                                                array12[nil] = "";
                                                ++nil;
                                                array9[nil] = "(See the bar at the top of the page for more details.)";
                                                array10[nil] = -1;
                                                ++nil;
                                                array9[nil] = "Arrange to meet " + this.intclan + " at a chosen room in a server on a specific date to play the battle.";
                                                array10[nil] = -1;
                                                ++nil;
                                                array9[nil] = "Use the 'Share a Relative Date' option to help you organize a time that is suitable for all.";
                                                array10[nil] = -1;
                                                ++nil;
                                            }
                                            if (n30 == 7) {
                                                array9[nil] = "A war has now started between your clan and " + this.intclan + " !";
                                                array11[nil] = this.getLvalue(line8, 3);
                                                array12[nil] = "";
                                                ++nil;
                                                if (this.loadwstat == 1) {
                                                    int n45 = -1;
                                                    int n46 = 0;
                                                    int n47 = -1;
                                                    int n48 = 0;
                                                    for (int n49 = 0; n49 < this.ncc; ++n49) {
                                                        if (this.xt.clan.toLowerCase().equals(this.conclan[n49].toLowerCase())) {
                                                            n46 = this.totp[n49];
                                                            n45 = n49;
                                                        }
                                                        if (this.intclan.toLowerCase().equals(this.conclan[n49].toLowerCase())) {
                                                            n48 = this.totp[n49];
                                                            n47 = n49;
                                                        }
                                                    }
                                                    int i18 = n48 + 1;
                                                    int i19 = n46 + 1;
                                                    if (i19 > n48) {
                                                        i19 = n48;
                                                    }
                                                    if (n45 != -1) {
                                                        int n50 = 0;
                                                        while (n50 < this.nvc[n45]) {
                                                            if (this.intclan.toLowerCase().equals(this.verclan[n45][n50].toLowerCase())) {
                                                                i18 -= this.points[n45][n50];
                                                                if (i18 < 0) {
                                                                    i18 = 0;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            else {
                                                                ++n50;
                                                            }
                                                        }
                                                    }
                                                    array9[nil] = "If you win this war, your clan would get:  [ " + i18 + " points ]   &  " + this.intclan + " would lose:  [ " + i19 + " points ]";
                                                    array10[nil] = -1;
                                                    ++nil;
                                                    int i20 = n46 + 1;
                                                    int i21 = n48 + 1;
                                                    if (i21 > n46) {
                                                        i21 = n46;
                                                    }
                                                    if (n47 != -1) {
                                                        int n51 = 0;
                                                        while (n51 < this.nvc[n47]) {
                                                            if (this.xt.clan.toLowerCase().equals(this.verclan[n47][n51].toLowerCase())) {
                                                                i20 -= this.points[n47][n51];
                                                                if (i20 < 0) {
                                                                    i20 = 0;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            else {
                                                                ++n51;
                                                            }
                                                        }
                                                    }
                                                    array9[nil] = "If you lose this war, your clan would lose:  [ " + i21 + " points ]   &  " + this.intclan + " would get:  [ " + i20 + " points ]";
                                                    array10[nil] = -1;
                                                    ++nil;
                                                }
                                                array9[nil] = "(See the bar at the top of the page for more details.)";
                                                array10[nil] = -1;
                                                ++nil;
                                                array9[nil] = "Arrange to meet " + this.intclan + " at a chosen room in a server on a specific date to play the war.";
                                                array10[nil] = -1;
                                                ++nil;
                                                array9[nil] = "Use the 'Share a Relative Date' option to help you organize a time that is suitable for all.";
                                                array10[nil] = -1;
                                                ++nil;
                                            }
                                            if (n30 == 8) {
                                                if (svalue4.toLowerCase().equals(this.xt.clan.toLowerCase())) {
                                                    array9[nil] = "Your clan has defeated " + this.intclan + " in the war, congratulations!";
                                                }
                                                else {
                                                    array9[nil] = "Your clan has lost the war against " + this.intclan + ".";
                                                }
                                                array11[nil] = this.getLvalue(line8, 3);
                                                array12[nil] = "";
                                                ++nil;
                                                if (svalue4.toLowerCase().equals(this.xt.clan.toLowerCase())) {
                                                    array9[nil] = "Your clan won:  [ " + this.getSvalue(line8, 5) + " points ]   &  " + this.intclan + " lost:  [ " + this.getSvalue(line8, 6) + " points ]";
                                                }
                                                else {
                                                    array9[nil] = "Your clan lost:  [ " + this.getSvalue(line8, 6) + " points ]   &  " + this.intclan + " won:  [ " + this.getSvalue(line8, 5) + " points ]";
                                                }
                                                array10[nil] = -1;
                                                ++nil;
                                                array9[nil] = "" + this.getSvalue(line8, 4) + "|";
                                                array10[nil] = 80;
                                                ++nil;
                                                array9[nil] = "";
                                                array10[nil] = 167;
                                                ++nil;
                                            }
                                            if (n30 == 9) {
                                                String str17;
                                                if (svalue4.toLowerCase().equals(this.xt.clan.toLowerCase())) {
                                                    array9[nil] = "Your clan has defeated " + this.intclan + " in the car battle, congratulations!";
                                                    array11[nil] = this.getLvalue(line8, 3);
                                                    array12[nil] = "";
                                                    ++nil;
                                                    array9[nil] = "You took " + this.intclan + "'s car :  [ " + this.getSvalue(line8, 5) + " ] !";
                                                    array10[nil] = -1;
                                                    ++nil;
                                                    str17 = this.xt.clan;
                                                }
                                                else {
                                                    array9[nil] = "Your clan has lost the car battle against " + this.intclan + ".";
                                                    array11[nil] = this.getLvalue(line8, 3);
                                                    array12[nil] = "";
                                                    ++nil;
                                                    array9[nil] = "" + this.intclan + " took your car :  [ " + this.getSvalue(line8, 5) + " ] !";
                                                    array10[nil] = -1;
                                                    ++nil;
                                                    str17 = this.intclan;
                                                }
                                                array9[nil] = "" + this.getSvalue(line8, 4) + "|" + this.getSvalue(line8, 5) + "|" + str17 + "|";
                                                array10[nil] = 90;
                                                ++nil;
                                                array9[nil] = "";
                                                array10[nil] = 167;
                                                ++nil;
                                            }
                                            if (n30 != 10) {
                                                continue;
                                            }
                                            String str19;
                                            if (svalue4.toLowerCase().equals(this.xt.clan.toLowerCase())) {
                                                array9[nil] = "Your clan has defeated " + this.intclan + " in the stage battle, congratulations!";
                                                array11[nil] = this.getLvalue(line8, 3);
                                                array12[nil] = "";
                                                ++nil;
                                                String str18 = this.getSvalue(line8, 5);
                                                if (str18.length() > 20) {
                                                    str18 = "" + str18.substring(0, 20) + "...";
                                                }
                                                array9[nil] = "You took " + this.intclan + "'s stage :  [ " + str18 + " ] !";
                                                array10[nil] = -1;
                                                ++nil;
                                                str19 = this.xt.clan;
                                            }
                                            else {
                                                array9[nil] = "Your clan has lost the stage battle against " + this.intclan + ".";
                                                array11[nil] = this.getLvalue(line8, 3);
                                                array12[nil] = "";
                                                ++nil;
                                                String str20 = this.getSvalue(line8, 5);
                                                if (str20.length() > 20) {
                                                    str20 = "" + str20.substring(0, 20) + "...";
                                                }
                                                array9[nil] = "" + this.intclan + " took your stage :  [ " + str20 + " ] !";
                                                array10[nil] = -1;
                                                ++nil;
                                                str19 = this.intclan;
                                            }
                                            array9[nil] = "" + this.getSvalue(line8, 4) + "|" + this.getSvalue(line8, 5) + "|" + str19 + "|";
                                            array10[nil] = 100;
                                            ++nil;
                                            array9[nil] = "";
                                            array10[nil] = 167;
                                            ++nil;
                                        }
                                        else {
                                            array9[nil] = line8;
                                            try {
                                                this.rd.setFont(new Font("Tahoma", 0, 11));
                                                this.ftm = this.rd.getFontMetrics();
                                                int index3 = 0;
                                                String s4 = "";
                                                while (index3 < line8.length()) {
                                                    s4 += line8.charAt(index3);
                                                    if (this.ftm.stringWidth(s4) > 540) {
                                                        if (s4.lastIndexOf(" ") != -1) {
                                                            array9[nil] = s4.substring(0, s4.lastIndexOf(" "));
                                                            s4 = s4.substring(s4.lastIndexOf(" ") + 1, s4.length());
                                                        }
                                                        else {
                                                            array9[nil] = s4;
                                                            s4 = "";
                                                        }
                                                        array10[nil] = -1;
                                                        ++nil;
                                                    }
                                                    ++index3;
                                                }
                                                array9[nil] = s4;
                                            }
                                            catch (final Exception ex25) {}
                                            array10[nil] = -1;
                                            ++nil;
                                        }
                                    }
                                    for (int n52 = 0; n52 < nil; ++n52) {
                                        this.iline[n52] = array9[n52];
                                        this.ilinetyp[n52] = array10[n52];
                                        this.ictimes[n52] = array11[n52];
                                        this.itimes[n52] = array12[n52];
                                    }
                                    this.nil = nil;
                                    this.readint = 2;
                                    this.lastint = "" + this.ictime[n28];
                                    if (this.icheck[n28].toLowerCase().indexOf(this.xt.nickname.toLowerCase()) == -1) {
                                        final StringBuilder sb = new StringBuilder();
                                        final String[] icheck = this.icheck;
                                        final int n53 = n28;
                                        icheck[n53] = sb.append(icheck[n53]).append("#").append(this.xt.nickname).append("#").toString();
                                        try {
                                            this.dout.println("101|41|" + this.xt.nickname + "|" + this.xt.clan + "|" + this.intclan + "|");
                                            s = this.din.readLine();
                                        }
                                        catch (final Exception ex26) {}
                                    }
                                    this.spos4 = 208;
                                }
                                else {
                                    this.readint = 3;
                                }
                            }
                            catch (final Exception ex27) {
                                this.readint = 4;
                            }
                        }
                        if (this.readint == 2) {
                            for (int n54 = 0; n54 < this.nil; ++n54) {
                                if (this.ilinetyp[n54] >= 0 && this.ilinetyp[n54] != 167 && this.ictimes[n54] > 0L) {
                                    try {
                                        final long n55 = this.ntime - this.ictimes[n54];
                                        if (n55 >= 1000L && n55 < 60000L) {
                                            this.itimes[n54] = "seconds ago";
                                        }
                                        if (n55 >= 60000L && n55 < 3600000L) {
                                            final int i22 = (int)(n55 / 60000L);
                                            String str21 = "s";
                                            if (i22 == 1) {
                                                str21 = "";
                                            }
                                            this.itimes[n54] = "" + i22 + " minute" + str21 + " ago";
                                        }
                                        if (n55 >= 3600000L && n55 < 86400000L) {
                                            final int i23 = (int)(n55 / 3600000L);
                                            String str22 = "s";
                                            if (i23 == 1) {
                                                str22 = "";
                                            }
                                            this.itimes[n54] = "" + i23 + " hour" + str22 + " ago";
                                        }
                                        if (n55 >= 86400000L) {
                                            final int i24 = (int)(n55 / 86400000L);
                                            String str23 = "s";
                                            if (i24 == 1) {
                                                str23 = "";
                                            }
                                            this.itimes[n54] = "" + i24 + " day" + str23 + " ago";
                                        }
                                    }
                                    catch (final Exception ex28) {
                                        this.itimes[n54] = "";
                                    }
                                }
                                else {
                                    this.itimes[n54] = "";
                                }
                            }
                        }
                        this.intclanbgpng(this.intclan);
                    }
                    if (this.sendint == 2) {
                        this.gs.mmsg.setText(" ");
                        this.sendint = 0;
                        if (this.gs.sendtyp.getSelectedIndex() > 1) {
                            this.gs.sendtyp.select(0);
                        }
                    }
                    if (this.openi == 10) {
                        if (this.viewgame2 == 1) {
                            this.vwscorex = 0;
                            this.vwscorei = 0;
                            String str24 = "pending_war";
                            if (this.nvgames2 == 2) {
                                str24 = "pending_battle";
                            }
                            if (this.nvgames2 == 9) {
                                str24 = "war";
                            }
                            if (this.nvgames2 == 5) {
                                str24 = "battle";
                            }
                            try {
                                final URL url5 = new URL("http://multiplayer.needformadness.com/interact/" + str24 + "/" + this.viewwar2 + ".txt");
                                url5.openConnection().setConnectTimeout(2000);
                                if (url5.openConnection().getContentType().equals("text/plain")) {
                                    DataInputStream dataInputStream11;
                                    int n56;
                                    String line9;
                                    String s5;
                                    int intValue;
                                    for (dataInputStream11 = new DataInputStream(url5.openStream()), n56 = 0; (line9 = dataInputStream11.readLine()) != null && n56 < this.nvgames2; ++n56) {
                                        s5 = this.getSvalue(line9, 0);
                                        if (s5.startsWith("#")) {
                                            try {
                                                intValue = Integer.valueOf(s5.substring(1));
                                            }
                                            catch (final Exception ex29) {
                                                intValue = 1;
                                            }
                                            s5 = "NFM 1  -  Stage " + intValue + "";
                                            if (intValue > 10) {
                                                s5 = "NFM 2  -  Stage " + (intValue - 10) + "";
                                            }
                                            if (intValue > 27) {
                                                s5 = "NFM Multiplayer  -  Stage " + (intValue - 27) + "";
                                            }
                                        }
                                        this.vwstages2[n56] = s5;
                                        this.vwlaps2[n56] = this.getvalue(line9, 1);
                                        this.vwcars2[n56] = this.getvalue(line9, 2);
                                        this.vwclass2[n56] = this.getvalue(line9, 3);
                                        this.vwfix2[n56] = this.getvalue(line9, 4);
                                        this.vwinner[n56] = this.getSvalue(line9, 5);
                                        if (this.vwinner[n56].toLowerCase().equals(this.xt.clan.toLowerCase())) {
                                            ++this.vwscorex;
                                        }
                                        if (this.vwinner[n56].toLowerCase().equals(this.intclan.toLowerCase())) {
                                            ++this.vwscorei;
                                        }
                                    }
                                    dataInputStream11.close();
                                    if (n56 != 0) {
                                        this.viewgame2 = 2;
                                    }
                                    else {
                                        this.viewgame2 = 4;
                                    }
                                }
                                else {
                                    this.viewgame2 = 3;
                                }
                            }
                            catch (final Exception ex30) {
                                this.viewgame2 = 4;
                            }
                        }
                        if ((this.gs.sendtyp.getSelectedIndex() == 4 || this.gs.sendtyp.getSelectedIndex() == 5 || this.gs.sendtyp.getSelectedIndex() == 6 || this.gs.sendtyp.getSelectedIndex() == 7) && this.gs.senditem.getSelectedIndex() == 3 && this.isel == 3) {
                            this.loadiclanstages(this.xt.clan);
                            this.isel = 4;
                        }
                        if (this.gs.sendtyp.getSelectedIndex() == 3 && this.ifas == 0) {
                            this.loadiclancars(this.intclan);
                            this.ifas = 1;
                        }
                        if (this.gs.sendtyp.getSelectedIndex() == 3 && this.ifas == 2) {
                            this.loadiclancars(this.xt.clan);
                            this.ifas = 3;
                        }
                        if (this.gs.sendtyp.getSelectedIndex() == 3 && this.gs.senditem.getSelectedIndex() == 3 && this.ifas == 5 && this.isel == 3) {
                            this.loadiclanstages(this.xt.clan);
                            this.isel = 4;
                        }
                        if (this.gs.sendtyp.getSelectedIndex() == 2 && this.ifas == 0) {
                            this.loadiclanstages(this.intclan);
                            this.ifas = 1;
                        }
                        if (this.gs.sendtyp.getSelectedIndex() == 2 && this.ifas == 2) {
                            this.loadiclanstages(this.xt.clan);
                            this.ifas = 3;
                        }
                        if (this.gs.sendtyp.getSelectedIndex() == 2 && this.gs.senditem.getSelectedIndex() == 3 && this.ifas == 5 && this.isel == 3) {
                            this.loadiclanstages(this.xt.clan);
                            this.isel = 4;
                        }
                        if (this.sendint == 1) {
                            try {
                                String str25 = "#nada#";
                                for (int n57 = 0; n57 < this.ni; ++n57) {
                                    if (this.iclan[n57].equals(this.intclan)) {
                                        str25 = this.iconvo[n57];
                                        break;
                                    }
                                }
                                String x2 = "101|39|" + this.xt.nickname + "|" + this.xt.nickey + "|" + this.xt.clan + "|" + this.xt.clankey + "|" + this.intclan + "|" + str25 + "|" + this.gs.sendtyp.getSelectedIndex() + "|";
                                if (this.gs.sendtyp.getSelectedIndex() == 0) {
                                    final String replaceAll2 = this.gs.mmsg.getText().replace("|", ":").replaceAll("[\\t\\n\\r]", "|");
                                    String string14 = "";
                                    int index4 = 0;
                                    int n58 = 0;
                                    while (index4 < replaceAll2.length()) {
                                        final String string15 = "" + replaceAll2.charAt(index4);
                                        if (string15.equals("|")) {
                                            ++n58;
                                        }
                                        else {
                                            n58 = 0;
                                        }
                                        if (n58 <= 1) {
                                            string14 += string15;
                                        }
                                        ++index4;
                                    }
                                    x2 = x2 + "" + string14 + "||";
                                }
                                if (this.gs.sendtyp.getSelectedIndex() == 1) {
                                    final Calendar instance4 = Calendar.getInstance();
                                    final long timeInMillis4 = instance4.getTimeInMillis();
                                    instance4.roll(5, this.gs.senditem.getSelectedIndex());
                                    int hourOfDay2 = this.gs.datat.getSelectedIndex() + 12;
                                    if (hourOfDay2 >= 24) {
                                        hourOfDay2 -= 24;
                                    }
                                    instance4.set(instance4.get(1), instance4.get(2), instance4.get(5), hourOfDay2, 0);
                                    x2 = x2 + "" + (instance4.getTimeInMillis() - timeInMillis4) + "|";
                                }
                                if (this.gs.sendtyp.getSelectedIndex() == 2 || this.gs.sendtyp.getSelectedIndex() == 3) {
                                    x2 = x2 + "" + this.itake + "|" + this.igive + "|";
                                    if (!this.sendwarnum) {
                                        for (int n59 = 0; n59 < 2; ++n59) {
                                            x2 = x2 + "" + this.wstages[n59] + "|" + this.wlaps[n59] + "|" + this.wcars[n59] + "|" + this.wclass[n59] + "|" + this.wfix[n59] + "|";
                                        }
                                    }
                                    else {
                                        x2 = x2 + "warnum#|" + this.warnum + "|";
                                        this.sendwarnum = false;
                                    }
                                }
                                if (this.gs.sendtyp.getSelectedIndex() == 4) {
                                    if (!this.sendwarnum) {
                                        for (int n60 = 0; n60 < 4; ++n60) {
                                            x2 = x2 + "" + this.wstages[n60] + "|" + this.wlaps[n60] + "|" + this.wcars[n60] + "|" + this.wclass[n60] + "|" + this.wfix[n60] + "|";
                                        }
                                    }
                                    else {
                                        x2 = x2 + "warnum#|" + this.warnum + "|";
                                        this.sendwarnum = false;
                                    }
                                }
                                if (this.gs.sendtyp.getSelectedIndex() == 5 || this.gs.sendtyp.getSelectedIndex() == 6) {
                                    final String string16 = x2 + "" + this.itake + "|" + this.igive + "|";
                                    if (!this.sendwarnum) {
                                        x2 = string16 + "" + this.sendwar + "|";
                                        for (int n61 = 0; n61 < 3; ++n61) {
                                            x2 = x2 + "" + this.wstages[n61] + "|" + this.wlaps[n61] + "|" + this.wcars[n61] + "|" + this.wclass[n61] + "|" + this.wfix[n61] + "|";
                                        }
                                    }
                                    else {
                                        x2 = string16 + "warnum#|" + this.warnum + "|";
                                        this.sendwarnum = false;
                                    }
                                }
                                if (this.gs.sendtyp.getSelectedIndex() == 7) {
                                    if (!this.sendwarnum) {
                                        x2 = x2 + "" + this.sendwar + "|";
                                        for (int n62 = 0; n62 < 5; ++n62) {
                                            x2 = x2 + "" + this.wstages[n62] + "|" + this.wlaps[n62] + "|" + this.wcars[n62] + "|" + this.wclass[n62] + "|" + this.wfix[n62] + "|";
                                        }
                                    }
                                    else {
                                        x2 = x2 + "warnum#|" + this.warnum + "|";
                                        this.sendwarnum = false;
                                    }
                                }
                                this.dout.println(x2);
                                s = this.din.readLine();
                                if (s.equals("OK")) {
                                    this.sendint = 2;
                                }
                                else if (s.equals("SUJ")) {
                                    this.itab = 2;
                                    this.sendint = 0;
                                    this.openi = 0;
                                    this.readint = 0;
                                }
                                else if (s.equals("failfile")) {
                                    this.readint = 6;
                                    this.sendint = 0;
                                    this.gs.mmsg.setText(" ");
                                    this.gs.sendtyp.select(0);
                                }
                                else {
                                    this.readint = 5;
                                    this.sendint = 0;
                                }
                            }
                            catch (final Exception ex31) {
                                this.readint = 5;
                                this.sendint = 0;
                            }
                        }
                    }
                }
                if (this.itab == 2 && !this.xt.clan.equals("")) {
                    try {
                        this.dout.println("101|36|" + this.xt.clan + "|" + this.xt.clankey + "|" + this.readclan + "|" + this.xt.nickname + "|");
                        s = this.din.readLine();
                        if (s.startsWith("RECIVE")) {
                            this.readclan = -3;
                            if (this.loadwstat == 0) {
                                this.loadchamps();
                            }
                            final int getvalue7 = this.getvalue(s, 1);
                            this.cadmin = this.getvalue(s, 2);
                            int cnml = 0;
                            final String[] array14 = new String[1000];
                            final int[] array15 = new int[1000];
                            final long[] array16 = new long[1000];
                            final String[] array17 = new String[1000];
                            array14[cnml] = "";
                            array15[cnml] = 167;
                            ++cnml;
                            final DataInputStream dataInputStream12 = new DataInputStream(this.socket.getInputStream());
                            final byte[] array18 = new byte[getvalue7];
                            dataInputStream12.readFully(array18);
                            s = this.din.readLine();
                            String line10;
                            while ((line10 = new DataInputStream(new ByteArrayInputStream(array18)).readLine()) != null) {
                                if (line10.startsWith("|")) {
                                    array14[cnml] = "";
                                    array15[cnml] = 167;
                                    ++cnml;
                                    String svalue5 = this.getSvalue(line10, 1);
                                    if (svalue5.toLowerCase().equals(this.xt.nickname.toLowerCase())) {
                                        svalue5 = "You";
                                    }
                                    array15[cnml] = this.getvalue(line10, 2);
                                    final int n63 = array15[cnml];
                                    if (n63 == 0) {
                                        array14[cnml] = "" + svalue5 + " wrote:";
                                        array16[cnml] = this.getLvalue(line10, 3);
                                        array17[cnml] = "";
                                        ++cnml;
                                    }
                                    if (n63 == 1) {
                                        if (svalue5.equals("You")) {
                                            array14[cnml] = "You have shared the following date:";
                                        }
                                        else {
                                            array14[cnml] = "" + svalue5 + " has shared the following date:";
                                        }
                                        array16[cnml] = this.getLvalue(line10, 3);
                                        array17[cnml] = "";
                                        final Calendar instance5 = Calendar.getInstance();
                                        final long timeInMillis5 = instance5.getTimeInMillis() - (this.ntime - array16[cnml]) + this.getLvalue(line10, 4);
                                        if (timeInMillis5 > 0L) {
                                            instance5.setTimeInMillis(timeInMillis5);
                                        }
                                        ++cnml;
                                        int value3 = instance5.get(11);
                                        String str26 = "AM";
                                        if (instance5.get(12) > 30 && ++value3 == 24) {
                                            value3 -= 24;
                                        }
                                        if (value3 >= 12) {
                                            str26 = "PM";
                                        }
                                        if (value3 > 12) {
                                            value3 -= 12;
                                        }
                                        if (value3 == 0) {
                                            value3 = 12;
                                        }
                                        try {
                                            array14[cnml] = "[  " + this.wday[instance5.get(7) - 1] + "  -  " + this.month[instance5.get(2)] + " " + instance5.get(5) + ",  " + value3 + " " + str26 + "  ]";
                                        }
                                        catch (final Exception ex32) {
                                            array14[cnml] = "Error occurred while calculating this date.";
                                        }
                                        array15[cnml] = -1;
                                        ++cnml;
                                        array14[cnml] = "(Please make sure your computer's calendar/clock is adjusted correctly, to read this date in your local time.)";
                                        array15[cnml] = -1;
                                        ++cnml;
                                    }
                                    if (n63 == 2) {
                                        final String svalue6 = this.getSvalue(line10, 4);
                                        if (svalue5.equals("You")) {
                                            array14[cnml] = "You have suggested declaring war on [ " + svalue6 + " ] :";
                                        }
                                        else {
                                            array14[cnml] = "" + svalue5 + " suggested declaring war on [ " + svalue6 + " ] :";
                                        }
                                        array16[cnml] = this.getLvalue(line10, 3);
                                        array17[cnml] = "";
                                        ++cnml;
                                        array14[cnml] = "" + svalue6 + "|" + this.getSvalue(line10, 5) + "|" + this.getSvalue(line10, 6) + "|";
                                        array15[cnml] = 20;
                                        ++cnml;
                                        array14[cnml] = "";
                                        array15[cnml] = 167;
                                        ++cnml;
                                        if (this.loadwstat == 1 && !line10.endsWith("|out|")) {
                                            int n64 = -1;
                                            int n65 = 0;
                                            int n66 = -1;
                                            int n67 = 0;
                                            for (int n68 = 0; n68 < this.ncc; ++n68) {
                                                if (this.xt.clan.toLowerCase().equals(this.conclan[n68].toLowerCase())) {
                                                    n65 = this.totp[n68];
                                                    n64 = n68;
                                                }
                                                if (svalue6.toLowerCase().equals(this.conclan[n68].toLowerCase())) {
                                                    n67 = this.totp[n68];
                                                    n66 = n68;
                                                }
                                            }
                                            int i25 = n67 + 1;
                                            int i26 = n65 + 1;
                                            if (i26 > n67) {
                                                i26 = n67;
                                            }
                                            if (n64 != -1) {
                                                int n69 = 0;
                                                while (n69 < this.nvc[n64]) {
                                                    if (svalue6.toLowerCase().equals(this.verclan[n64][n69].toLowerCase())) {
                                                        i25 -= this.points[n64][n69];
                                                        if (i25 < 0) {
                                                            i25 = 0;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    else {
                                                        ++n69;
                                                    }
                                                }
                                            }
                                            array14[cnml] = "If you win this war, your clan would get:  [ " + i25 + " points ]   &  " + svalue6 + " would lose:  [ " + i26 + " points ]";
                                            array15[cnml] = -1;
                                            ++cnml;
                                            int i27 = n65 + 1;
                                            int i28 = n67 + 1;
                                            if (i28 > n65) {
                                                i28 = n65;
                                            }
                                            if (n66 != -1) {
                                                int n70 = 0;
                                                while (n70 < this.nvc[n66]) {
                                                    if (this.xt.clan.toLowerCase().equals(this.verclan[n66][n70].toLowerCase())) {
                                                        i27 -= this.points[n66][n70];
                                                        if (i27 < 0) {
                                                            i27 = 0;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    else {
                                                        ++n70;
                                                    }
                                                }
                                            }
                                            array14[cnml] = "If you lose this war, your clan would lose:  [ " + i28 + " points ]   &  " + svalue6 + " would get:  [ " + i27 + " points ]";
                                            array15[cnml] = -1;
                                            ++cnml;
                                        }
                                        if (!line10.endsWith("|out|")) {
                                            array14[cnml] = "(This needs to be approved by the Clan Leader or an Admin to be declared on " + svalue6 + ".)";
                                            array15[cnml] = -1;
                                            ++cnml;
                                        }
                                    }
                                    if (n63 == 3) {
                                        final String svalue7 = this.getSvalue(line10, 4);
                                        if (svalue5.equals("You")) {
                                            array14[cnml] = "You have suggested to car battle with [ " + svalue7 + " ] :";
                                        }
                                        else {
                                            array14[cnml] = "" + svalue5 + " suggested to car battle with [ " + svalue7 + " ] :";
                                        }
                                        array16[cnml] = this.getLvalue(line10, 3);
                                        array17[cnml] = "";
                                        ++cnml;
                                        array14[cnml] = "" + svalue7 + "|" + this.getSvalue(line10, 5) + "|" + this.getSvalue(line10, 6) + "|" + this.getSvalue(line10, 7) + "|" + this.getSvalue(line10, 8) + "|";
                                        array15[cnml] = 30;
                                        ++cnml;
                                        array14[cnml] = "";
                                        array15[cnml] = 167;
                                        ++cnml;
                                        array14[cnml] = "If you win you will take " + svalue7 + "'s car :  [ " + this.getSvalue(line10, 5) + " ]";
                                        array15[cnml] = -1;
                                        ++cnml;
                                        array14[cnml] = "If you lose you will give " + svalue7 + " your clan's car :  [ " + this.getSvalue(line10, 6) + " ]";
                                        array15[cnml] = -1;
                                        ++cnml;
                                        if (!line10.endsWith("|out|")) {
                                            array14[cnml] = "(This needs to be approved by the Clan Leader or an Admin to be sent to " + svalue7 + ".)";
                                            array15[cnml] = -1;
                                            ++cnml;
                                        }
                                    }
                                    if (n63 == 4) {
                                        final String svalue8 = this.getSvalue(line10, 4);
                                        if (svalue5.equals("You")) {
                                            array14[cnml] = "You have suggested to stage battle with [ " + svalue8 + " ] :";
                                        }
                                        else {
                                            array14[cnml] = "" + svalue5 + " suggested to stage battle with [ " + svalue8 + " ] :";
                                        }
                                        array16[cnml] = this.getLvalue(line10, 3);
                                        array17[cnml] = "";
                                        ++cnml;
                                        array14[cnml] = "" + svalue8 + "|" + this.getSvalue(line10, 5) + "|" + this.getSvalue(line10, 6) + "|" + this.getSvalue(line10, 7) + "|" + this.getSvalue(line10, 8) + "|";
                                        array15[cnml] = 40;
                                        ++cnml;
                                        array14[cnml] = "";
                                        array15[cnml] = 167;
                                        ++cnml;
                                        String str27 = this.getSvalue(line10, 5);
                                        if (str27.length() > 20) {
                                            str27 = "" + str27.substring(0, 20) + "...";
                                        }
                                        array14[cnml] = "If you win you will take " + svalue8 + "'s stage :  [ " + str27 + " ]";
                                        array15[cnml] = -1;
                                        ++cnml;
                                        String str28 = this.getSvalue(line10, 6);
                                        if (str28.length() > 20) {
                                            str28 = "" + str28.substring(0, 20) + "...";
                                        }
                                        array14[cnml] = "If you lose you will give " + svalue8 + " your clan's stage :  [ " + str28 + " ]";
                                        array15[cnml] = -1;
                                        ++cnml;
                                        if (!line10.endsWith("|out|")) {
                                            array14[cnml] = "(This needs to be approved by the Clan Leader or an Admin to be sent to " + svalue8 + ".)";
                                            array15[cnml] = -1;
                                            ++cnml;
                                        }
                                    }
                                    if (n63 == 5) {
                                        final String svalue9 = this.getSvalue(line10, 4);
                                        if (svalue5.equals("You")) {
                                            array14[cnml] = "You have suggested accepting to go to war with [ " + svalue9 + " ] :";
                                        }
                                        else {
                                            array14[cnml] = "" + svalue5 + " suggested accepting to go to war with [ " + svalue9 + " ] :";
                                        }
                                        array16[cnml] = this.getLvalue(line10, 3);
                                        array17[cnml] = "";
                                        ++cnml;
                                        array14[cnml] = "" + svalue9 + "|" + this.getSvalue(line10, 5) + "|" + this.getSvalue(line10, 6) + "|";
                                        array15[cnml] = 50;
                                        ++cnml;
                                        array14[cnml] = "";
                                        array15[cnml] = 167;
                                        ++cnml;
                                        if (this.loadwstat == 1 && !line10.endsWith("|out|")) {
                                            int n71 = -1;
                                            int n72 = 0;
                                            int n73 = -1;
                                            int n74 = 0;
                                            for (int n75 = 0; n75 < this.ncc; ++n75) {
                                                if (this.xt.clan.toLowerCase().equals(this.conclan[n75].toLowerCase())) {
                                                    n72 = this.totp[n75];
                                                    n71 = n75;
                                                }
                                                if (svalue9.toLowerCase().equals(this.conclan[n75].toLowerCase())) {
                                                    n74 = this.totp[n75];
                                                    n73 = n75;
                                                }
                                            }
                                            int i29 = n74 + 1;
                                            int i30 = n72 + 1;
                                            if (i30 > n74) {
                                                i30 = n74;
                                            }
                                            if (n71 != -1) {
                                                int n76 = 0;
                                                while (n76 < this.nvc[n71]) {
                                                    if (svalue9.toLowerCase().equals(this.verclan[n71][n76].toLowerCase())) {
                                                        i29 -= this.points[n71][n76];
                                                        if (i29 < 0) {
                                                            i29 = 0;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    else {
                                                        ++n76;
                                                    }
                                                }
                                            }
                                            array14[cnml] = "If you win this war, your clan would get:  [ " + i29 + " points ]   &  " + svalue9 + " would lose:  [ " + i30 + " points ]";
                                            array15[cnml] = -1;
                                            ++cnml;
                                            int i31 = n72 + 1;
                                            int i32 = n74 + 1;
                                            if (i32 > n72) {
                                                i32 = n72;
                                            }
                                            if (n73 != -1) {
                                                int n77 = 0;
                                                while (n77 < this.nvc[n73]) {
                                                    if (this.xt.clan.toLowerCase().equals(this.verclan[n73][n77].toLowerCase())) {
                                                        i31 -= this.points[n73][n77];
                                                        if (i31 < 0) {
                                                            i31 = 0;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    else {
                                                        ++n77;
                                                    }
                                                }
                                            }
                                            array14[cnml] = "If you lose this war, your clan would lose:  [ " + i32 + " points ]   &  " + svalue9 + " would get:  [ " + i31 + " points ]";
                                            array15[cnml] = -1;
                                            ++cnml;
                                        }
                                        if (!line10.endsWith("|out|")) {
                                            array14[cnml] = "(This needs to be approved by the Clan Leader or an Admin to be declared on " + svalue9 + ".)";
                                            array15[cnml] = -1;
                                            ++cnml;
                                        }
                                    }
                                    if (n63 == 6) {
                                        final String svalue10 = this.getSvalue(line10, 4);
                                        if (svalue5.equals("You")) {
                                            array14[cnml] = "You have suggested accepting to car battle with [ " + svalue10 + " ] :";
                                        }
                                        else {
                                            array14[cnml] = "" + svalue5 + " suggested accepting to car battle with [ " + svalue10 + " ] :";
                                        }
                                        array16[cnml] = this.getLvalue(line10, 3);
                                        array17[cnml] = "";
                                        ++cnml;
                                        array14[cnml] = "" + svalue10 + "|" + this.getSvalue(line10, 5) + "|" + this.getSvalue(line10, 6) + "|" + this.getSvalue(line10, 7) + "|" + this.getSvalue(line10, 8) + "|";
                                        array15[cnml] = 60;
                                        ++cnml;
                                        array14[cnml] = "";
                                        array15[cnml] = 167;
                                        ++cnml;
                                        array14[cnml] = "If you win you will take " + svalue10 + "'s car :  [ " + this.getSvalue(line10, 5) + " ]";
                                        array15[cnml] = -1;
                                        ++cnml;
                                        array14[cnml] = "If you lose you will give " + svalue10 + " your clan's car :  [ " + this.getSvalue(line10, 6) + " ]";
                                        array15[cnml] = -1;
                                        ++cnml;
                                        if (!line10.endsWith("|out|")) {
                                            array14[cnml] = "(This needs to be approved by the Clan Leader or an Admin to be sent to " + svalue10 + ".)";
                                            array15[cnml] = -1;
                                            ++cnml;
                                        }
                                    }
                                    if (n63 == 7) {
                                        final String svalue11 = this.getSvalue(line10, 4);
                                        if (svalue5.equals("You")) {
                                            array14[cnml] = "You have suggested accepting to stage battle with [ " + svalue11 + " ] :";
                                        }
                                        else {
                                            array14[cnml] = "" + svalue5 + " suggested accepting to stage battle with [ " + svalue11 + " ] :";
                                        }
                                        array16[cnml] = this.getLvalue(line10, 3);
                                        array17[cnml] = "";
                                        ++cnml;
                                        array14[cnml] = "" + svalue11 + "|" + this.getSvalue(line10, 5) + "|" + this.getSvalue(line10, 6) + "|" + this.getSvalue(line10, 7) + "|" + this.getSvalue(line10, 8) + "|";
                                        array15[cnml] = 70;
                                        ++cnml;
                                        array14[cnml] = "";
                                        array15[cnml] = 167;
                                        ++cnml;
                                        String str29 = this.getSvalue(line10, 5);
                                        if (str29.length() > 20) {
                                            str29 = "" + str29.substring(0, 20) + "...";
                                        }
                                        array14[cnml] = "If you win you will take " + svalue11 + "'s stage :  [ " + str29 + " ]";
                                        array15[cnml] = -1;
                                        ++cnml;
                                        String str30 = this.getSvalue(line10, 6);
                                        if (str30.length() > 20) {
                                            str30 = "" + str30.substring(0, 20) + "...";
                                        }
                                        array14[cnml] = "If you lose you will give " + svalue11 + " your clan's stage :  [ " + str30 + " ]";
                                        array15[cnml] = -1;
                                        ++cnml;
                                        if (!line10.endsWith("|out|")) {
                                            array14[cnml] = "(This needs to be approved by the Clan Leader or an Admin to be sent to " + svalue11 + ".)";
                                            array15[cnml] = -1;
                                            ++cnml;
                                        }
                                    }
                                    if (n63 != 8) {
                                        continue;
                                    }
                                    final int getvalue8 = this.getvalue(line10, 4);
                                    String str31 = "taken";
                                    if (getvalue8 == 2) {
                                        str31 = "re-claimed";
                                    }
                                    array14[cnml] = "Congratulations!!  Your clan has " + str31 + " the clan wars world championship title!";
                                    array16[cnml] = this.getLvalue(line10, 3);
                                    array17[cnml] = "";
                                    ++cnml;
                                    if (getvalue8 == 1) {
                                        array14[cnml] = "Your recent win in the war against " + this.getSvalue(line10, 6) + " has given you the championship title!";
                                        array15[cnml] = -1;
                                        ++cnml;
                                    }
                                    if (getvalue8 == 2) {
                                        array14[cnml] = "You have successfully defended your championship title against " + this.getSvalue(line10, 6) + "!";
                                        array15[cnml] = -1;
                                        ++cnml;
                                    }
                                    if (getvalue8 == 3) {
                                        array14[cnml] = "A recent war between " + this.getSvalue(line10, 5) + " and " + this.getSvalue(line10, 6) + " has resulted in a change of points!";
                                        array15[cnml] = -1;
                                        ++cnml;
                                    }
                                    if (getvalue8 == 4) {
                                        array14[cnml] = "Clan " + this.getSvalue(line10, 5) + " removed itself from the game which resulted in a change of points, giving you the title!";
                                        array15[cnml] = -1;
                                        ++cnml;
                                    }
                                    if (getvalue8 != 2) {
                                        array14[cnml] = "" + this.xt.clan + " is now the new champion of the world in Need for Madness!";
                                        array15[cnml] = -1;
                                        ++cnml;
                                    }
                                    else {
                                        array14[cnml] = "" + this.xt.clan + " still remains the champion of the world in Need for Madness!";
                                        array15[cnml] = -1;
                                        ++cnml;
                                    }
                                    array15[cnml] = 80;
                                    ++cnml;
                                    array14[cnml] = "";
                                    array15[cnml] = 167;
                                    ++cnml;
                                }
                                else {
                                    array14[cnml] = line10;
                                    try {
                                        this.rd.setFont(new Font("Tahoma", 0, 11));
                                        this.ftm = this.rd.getFontMetrics();
                                        int index5 = 0;
                                        String s6 = "";
                                        while (index5 < line10.length()) {
                                            s6 += line10.charAt(index5);
                                            if (this.ftm.stringWidth(s6) > 540) {
                                                if (s6.lastIndexOf(" ") != -1) {
                                                    array14[cnml] = s6.substring(0, s6.lastIndexOf(" "));
                                                    s6 = s6.substring(s6.lastIndexOf(" ") + 1, s6.length());
                                                }
                                                else {
                                                    array14[cnml] = s6;
                                                    s6 = "";
                                                }
                                                array15[cnml] = -1;
                                                ++cnml;
                                            }
                                            ++index5;
                                        }
                                        array14[cnml] = s6;
                                    }
                                    catch (final Exception ex33) {}
                                    array15[cnml] = -1;
                                    ++cnml;
                                }
                            }
                            for (int n78 = 0; n78 < cnml; ++n78) {
                                this.cmline[n78] = array14[n78];
                                this.cmlinetyp[n78] = array15[n78];
                                this.cmctimes[n78] = array16[n78];
                                this.cmtimes[n78] = array17[n78];
                            }
                            this.cnml = cnml;
                            this.readclan = getvalue7;
                            this.spos3 = 219;
                        }
                    }
                    catch (final Exception ex34) {
                        this.readclan = -1;
                    }
                    if (this.readclan > 0) {
                        for (int n79 = 0; n79 < this.cnml; ++n79) {
                            if (this.cmlinetyp[n79] >= 0 && this.cmlinetyp[n79] != 167 && this.cmctimes[n79] > 0L) {
                                try {
                                    final long n80 = this.ntime - this.cmctimes[n79];
                                    if (n80 >= 1000L && n80 < 60000L) {
                                        this.cmtimes[n79] = "seconds ago";
                                    }
                                    if (n80 >= 60000L && n80 < 3600000L) {
                                        final int i33 = (int)(n80 / 60000L);
                                        String str32 = "s";
                                        if (i33 == 1) {
                                            str32 = "";
                                        }
                                        this.cmtimes[n79] = "" + i33 + " minute" + str32 + " ago";
                                    }
                                    if (n80 >= 3600000L && n80 < 86400000L) {
                                        final int i34 = (int)(n80 / 3600000L);
                                        String str33 = "s";
                                        if (i34 == 1) {
                                            str33 = "";
                                        }
                                        this.cmtimes[n79] = "" + i34 + " hour" + str33 + " ago";
                                    }
                                    if (n80 >= 86400000L) {
                                        final int i35 = (int)(n80 / 86400000L);
                                        String str34 = "s";
                                        if (i35 == 1) {
                                            str34 = "";
                                        }
                                        this.cmtimes[n79] = "" + i35 + " day" + str34 + " ago";
                                    }
                                }
                                catch (final Exception ex35) {
                                    this.cmtimes[n79] = "";
                                }
                            }
                            else {
                                this.cmtimes[n79] = "";
                            }
                        }
                    }
                    this.clanlogopng(this.xt.clan);
                    if (this.sendcmsg == 2) {
                        this.gs.mmsg.setText(" ");
                        this.sendcmsg = 0;
                    }
                    if (this.viewgame1 == 1) {
                        try {
                            String str35 = "pending_war";
                            if (this.nvgames1 == 2 || this.nvgames1 == 5) {
                                str35 = "pending_battle";
                            }
                            final URL url6 = new URL("http://multiplayer.needformadness.com/interact/" + str35 + "/" + this.viewwar1 + ".txt");
                            url6.openConnection().setConnectTimeout(2000);
                            if (url6.openConnection().getContentType().equals("text/plain")) {
                                DataInputStream dataInputStream13;
                                int n81;
                                String line11;
                                String s7;
                                int intValue2;
                                for (dataInputStream13 = new DataInputStream(url6.openStream()), n81 = 0; (line11 = dataInputStream13.readLine()) != null && n81 < this.nvgames1; ++n81) {
                                    s7 = this.getSvalue(line11, 0);
                                    if (s7.startsWith("#")) {
                                        try {
                                            intValue2 = Integer.valueOf(s7.substring(1));
                                        }
                                        catch (final Exception ex36) {
                                            intValue2 = 1;
                                        }
                                        s7 = "NFM 1  -  Stage " + intValue2 + "";
                                        if (intValue2 > 10) {
                                            s7 = "NFM 2  -  Stage " + (intValue2 - 10) + "";
                                        }
                                        if (intValue2 > 27) {
                                            s7 = "NFM Multiplayer  -  Stage " + (intValue2 - 27) + "";
                                        }
                                    }
                                    this.vwstages1[n81] = s7;
                                    this.vwlaps1[n81] = this.getvalue(line11, 1);
                                    this.vwcars1[n81] = this.getvalue(line11, 2);
                                    this.vwclass1[n81] = this.getvalue(line11, 3);
                                    this.vwfix1[n81] = this.getvalue(line11, 4);
                                }
                                dataInputStream13.close();
                                if (n81 != 0) {
                                    this.viewgame1 = 2;
                                }
                                else {
                                    this.viewgame1 = 4;
                                }
                            }
                            else {
                                this.viewgame1 = 3;
                            }
                        }
                        catch (final Exception ex37) {
                            this.viewgame1 = 4;
                        }
                    }
                    if (this.sendcmsg == 1) {
                        try {
                            String x3 = "101|37|" + this.xt.nickname + "|" + this.xt.nickey + "|" + this.xt.clan + "|" + this.xt.clankey + "|" + this.gs.sendtyp.getSelectedIndex() + "|";
                            if (this.gs.sendtyp.getSelectedIndex() == 0) {
                                final String replaceAll3 = this.gs.mmsg.getText().replace("|", ":").replaceAll("[\\t\\n\\r]", "|");
                                String string17 = "";
                                int index6 = 0;
                                int n82 = 0;
                                while (index6 < replaceAll3.length()) {
                                    final String string18 = "" + replaceAll3.charAt(index6);
                                    if (string18.equals("|")) {
                                        ++n82;
                                    }
                                    else {
                                        n82 = 0;
                                    }
                                    if (n82 <= 1) {
                                        string17 += string18;
                                    }
                                    ++index6;
                                }
                                x3 = x3 + "" + string17 + "||";
                            }
                            if (this.gs.sendtyp.getSelectedIndex() == 1) {
                                final Calendar instance6 = Calendar.getInstance();
                                final long timeInMillis6 = instance6.getTimeInMillis();
                                instance6.roll(5, this.gs.senditem.getSelectedIndex());
                                int hourOfDay3 = this.gs.datat.getSelectedIndex() + 12;
                                if (hourOfDay3 >= 24) {
                                    hourOfDay3 -= 24;
                                }
                                instance6.set(instance6.get(1), instance6.get(2), instance6.get(5), hourOfDay3, 0);
                                x3 = x3 + "" + (instance6.getTimeInMillis() - timeInMillis6) + "|";
                            }
                            this.dout.println(x3);
                            s = this.din.readLine();
                            if (s.equals("OK")) {
                                this.sendcmsg = 2;
                            }
                            else {
                                this.readclan = -2;
                                this.sendcmsg = 0;
                            }
                        }
                        catch (final Exception ex38) {
                            this.readclan = -2;
                            this.sendcmsg = 0;
                        }
                    }
                    this.loadmyclanbg();
                }
            }
            if (this.lg.nmsgs != 0 || this.lg.nfreq != 0 || this.lg.nconf != 0 || this.lg.ncreq != 0 || !this.lg.clanapv.equals("")) {
                final String string19 = "101|19|" + this.xt.nickname + "|" + this.xt.nickey + "|";
                try {
                    this.dout.println(string19);
                    s = this.din.readLine();
                }
                catch (final Exception ex39) {}
                this.lg.nmsgs = 0;
                this.lg.nfreq = 0;
                this.lg.nconf = 0;
                this.lg.ncreq = 0;
                this.lg.clanapv = "";
            }
            if (this.tab == 0 && this.domon) {
                String s8 = "101|101|" + this.updatec + "|";
                if (this.updatec <= -11) {
                    for (int n83 = 0; n83 < -this.updatec - 10; ++n83) {
                        s8 = s8 + "" + this.cnames[20 - n83] + "|" + this.sentn[20 - n83] + "|";
                    }
                    this.updatec = -2;
                }
                try {
                    this.dout.println(s8);
                    s = this.din.readLine();
                    if (s == null) {
                        this.domon = false;
                    }
                }
                catch (final Exception ex40) {
                    this.domon = false;
                }
                if (this.domon) {
                    final int getvalue9 = this.getvalue(s, 0);
                    if (this.updatec != getvalue9 && this.updatec >= -2) {
                        for (int n84 = 0; n84 < 21; ++n84) {
                            this.cnames[n84] = this.getSvalue(s, 1 + n84 * 3);
                            this.sentn[n84] = this.getSvalue(s, 2 + n84 * 3);
                            this.nctime[n84] = this.getLvalue(s, 3 + n84 * 3);
                        }
                        this.updatec = getvalue9;
                    }
                    for (int n85 = 0; n85 < 21; ++n85) {
                        if (this.nctime[n85] > 0L) {
                            final long n86 = this.ntime - this.nctime[n85];
                            if (n86 < 1000L) {
                                this.ctime[n85] = "- just now";
                            }
                            if (n86 >= 1000L && n86 < 60000L) {
                                this.ctime[n85] = "- seconds ago";
                            }
                            if (n86 >= 60000L && n86 < 3600000L) {
                                final int i36 = (int)(n86 / 60000L);
                                String str36 = "s";
                                if (i36 == 1) {
                                    str36 = "";
                                }
                                this.ctime[n85] = "- " + i36 + " minute" + str36 + " ago";
                            }
                            if (n86 >= 3600000L && n86 < 86400000L) {
                                final int i37 = (int)(n86 / 3600000L);
                                String str37 = "s";
                                if (i37 == 1) {
                                    str37 = "";
                                }
                                this.ctime[n85] = "- " + i37 + " hour" + str37 + " ago";
                            }
                            if (n86 >= 86400000L) {
                                final int i38 = (int)(n86 / 86400000L);
                                String str38 = "s";
                                if (i38 == 1) {
                                    str38 = "";
                                }
                                this.ctime[n85] = "- " + i38 + " day" + str38 + " ago";
                            }
                        }
                        else {
                            this.ctime[n85] = "";
                        }
                    }
                }
            }
            if (this.tab == 1) {
                if (this.upload == 5) {
                    this.upload = 0;
                    this.loadedp = false;
                    this.edit = 0;
                    this.refresh = true;
                }
                if (!this.loadedp) {
                    if (!this.refresh) {
                        this.loadproinfo();
                        this.trunsent();
                    }
                    this.logopng();
                    this.avatarpng();
                    this.clanlogopng(this.proclan);
                    this.refresh = false;
                    this.protab = 0;
                    this.loadedp = true;
                }
                if (this.protab == 2) {
                    if (this.loadpst == 0) {
                        this.loadprostages();
                    }
                    if (this.loadpst == 1 && !this.gs.proitem.getSelectedItem().equals(this.loadpstage) && this.gs.proitem.sel != 0) {
                        this.addstage = 0;
                        if (this.gs.loadstagePreview(-2, this.gs.proitem.getSelectedItem(), this.co, this.bco, this.m, this.cp)) {
                            this.loadedpstage = true;
                            this.m.hit = 20000;
                            this.m.fallen = 0;
                        }
                        else {
                            this.loadedpstage = false;
                        }
                        this.loadpstage = this.gs.proitem.getSelectedItem();
                    }
                }
            }
            if (this.ptab == 2 && !this.xt.clan.equals("") && !this.loadedcm) {
                this.loadfclan();
                this.loadedcm = true;
            }
            if (this.tab == 3) {
                if (this.cfase == 0) {
                    if (!this.xt.clan.equals("")) {
                        this.clanlogopng(this.xt.clan);
                    }
                    if (this.ntab == 0 && this.loadednews == 0) {
                        this.loadnews();
                    }
                    if (this.ntab == 1 && this.loadwstat == 0) {
                        this.loadchamps();
                    }
                }
                if (this.cfase == 1 && this.em == 1) {
                    final String text = this.gs.temail.getText();
                    final String string20 = "101|26|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + text + "|";
                    String line12;
                    try {
                        this.dout.println(string20);
                        line12 = this.din.readLine();
                    }
                    catch (final Exception ex41) {
                        line12 = "fail";
                    }
                    if (line12.startsWith("OK")) {
                        this.xt.clan = text;
                        this.xt.clankey = this.getSvalue(line12, 1);
                        this.spos5 = 0;
                        this.lspos5 = 0;
                        this.cfase = 3;
                        this.claname = text;
                        this.loadedc = false;
                        this.ctab = 0;
                        this.em = 0;
                    }
                    else if (line12.equals("FOUND")) {
                        this.msg = "The name '" + text + "' is already used by another clan!";
                        this.flko = 45;
                        this.em = 0;
                    }
                    else {
                        this.msg = "Server error authorizing clan creation, please try again later...";
                        this.flko = 45;
                        this.em = 0;
                    }
                }
                if (this.cfase == 2) {
                    if (this.em == 1) {
                        final String x4 = "101|27|";
                        String line13;
                        try {
                            this.dout.println(x4);
                            line13 = this.din.readLine();
                        }
                        catch (final Exception ex42) {
                            line13 = "";
                        }
                        this.nclns = 0;
                        for (String s9 = this.getSvalue(line13, this.nclns); !s9.equals("") && this.nclns < 20; s9 = this.getSvalue(line13, this.nclns)) {
                            this.clanlo[this.nclns] = s9;
                            ++this.nclns;
                        }
                        if (this.nclns != 0) {
                            this.smsg = "Clans with recent activity:";
                        }
                        else {
                            this.smsg = "Found no clans with recent activity.";
                        }
                        this.em = 0;
                    }
                    if (this.em == 2) {
                        final String string21 = "101|28|" + this.gs.temail.getText() + "";
                        String line14;
                        try {
                            this.dout.println(string21);
                            line14 = this.din.readLine();
                        }
                        catch (final Exception ex43) {
                            line14 = "";
                        }
                        this.nclns = 0;
                        for (String s10 = this.getSvalue(line14, this.nclns); !s10.equals("") && this.nclns < 20; s10 = this.getSvalue(line14, this.nclns)) {
                            this.clanlo[this.nclns] = s10;
                            ++this.nclns;
                        }
                        if (this.nclns != 0) {
                            this.smsg = "Search result for '" + this.gs.temail.getText() + "' in clans:";
                        }
                        else {
                            this.smsg = "Found no clans with the phrase '" + this.gs.temail.getText() + "' in them.";
                        }
                        this.em = 0;
                    }
                }
                if (this.cfase == 3) {
                    if (this.editc == 33) {
                        final String string22 = "101|24|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.claname + "|" + this.member[this.em] + "|" + (this.gs.clanlev.getSelectedIndex() + 1) + "|" + this.gs.cmsg.getText() + "|";
                        String line15;
                        try {
                            this.dout.println(string22);
                            line15 = this.din.readLine();
                        }
                        catch (final Exception ex44) {
                            line15 = "fail";
                        }
                        if (line15.equals("OK")) {
                            this.editc = 0;
                            this.loadedc = false;
                        }
                        else {
                            this.editc = 5;
                        }
                    }
                    if (this.editc == 66) {
                        final String string23 = "101|24|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.claname + "|" + this.rmember[this.em] + "|1|New member - just approved.|";
                        String line16;
                        try {
                            this.dout.println(string23);
                            line16 = this.din.readLine();
                        }
                        catch (final Exception ex45) {
                            line16 = "fail";
                        }
                        if (line16.equals("OK")) {
                            this.editc = 0;
                            if (this.nrmb == 1) {
                                this.spos5 = 0;
                                this.lspos5 = 0;
                            }
                            this.loadedc = false;
                        }
                        else {
                            this.editc = 5;
                        }
                    }
                    if (this.editc == 44) {
                        final String string24 = "101|25|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.claname + "|" + this.member[this.em] + "|";
                        String line17;
                        try {
                            this.dout.println(string24);
                            line17 = this.din.readLine();
                        }
                        catch (final Exception ex46) {
                            line17 = "fail";
                        }
                        if (line17.equals("OK")) {
                            this.editc = 0;
                            this.loadedc = false;
                            if (this.member[this.em].toLowerCase().equals(this.xt.nickname.toLowerCase())) {
                                if (this.proname.equals(this.xt.nickname)) {
                                    this.proclan = "";
                                }
                                this.xt.clan = "";
                                this.xt.clankey = "";
                                if (this.nmb == 1) {
                                    this.cfase = 0;
                                }
                            }
                        }
                        else {
                            this.editc = 5;
                        }
                    }
                    if (this.editc == 77) {
                        final String string25 = "101|25|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.claname + "|" + this.rmember[this.em] + "|";
                        String line18;
                        try {
                            this.dout.println(string25);
                            line18 = this.din.readLine();
                        }
                        catch (final Exception ex47) {
                            line18 = "fail";
                        }
                        if (line18.equals("OK")) {
                            this.editc = 0;
                            if (this.nrmb == 1) {
                                this.spos5 = 0;
                                this.lspos5 = 0;
                            }
                            this.loadedc = false;
                        }
                        else {
                            this.editc = 5;
                        }
                    }
                    if (this.editc == 99) {
                        final String string26 = "101|30|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.claname + "|";
                        String line19;
                        try {
                            this.dout.println(string26);
                            line19 = this.din.readLine();
                        }
                        catch (final Exception ex48) {
                            line19 = "fail";
                        }
                        if (line19.equals("OK")) {
                            this.editc = 0;
                            this.loadedc = false;
                        }
                        else {
                            this.editc = 5;
                        }
                    }
                    if (this.upload == 5) {
                        this.upload = 0;
                        this.loadedc = false;
                        if (this.editc == 2) {
                            this.loadedmyclanbg = -1;
                        }
                        this.editc = 0;
                        this.refresh = true;
                    }
                    if (!this.loadedc) {
                        if (!this.refresh) {
                            this.loadclan();
                        }
                        this.clanlogopng(this.claname);
                        this.clanbgpng();
                        this.refresh = false;
                        this.loadedc = true;
                    }
                    if (this.attachetoclan) {
                        final String string27 = "101|29|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.claname + "|";
                        String line20;
                        try {
                            this.dout.println(string27);
                            line20 = this.din.readLine();
                        }
                        catch (final Exception ex49) {
                            line20 = "fail";
                        }
                        if (line20.indexOf("|") != -1) {
                            this.xt.clan = this.getSvalue(line20, 0);
                            this.xt.clankey = this.getSvalue(line20, 1);
                        }
                        this.attachetoclan = false;
                    }
                    if (this.editc == 55) {
                        final String string28 = "101|31|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.claname + "|" + this.sltit + "|" + this.gs.cmsg.getText() + "|" + this.gs.temail.getText() + "|";
                        String line21;
                        try {
                            this.dout.println(string28);
                            line21 = this.din.readLine();
                        }
                        catch (final Exception ex50) {
                            line21 = "fail";
                        }
                        if (line21.equals("OK")) {
                            this.editc = 0;
                            this.loadedlink = false;
                        }
                        else {
                            this.editc = 5;
                        }
                    }
                    if (this.ctab == 2) {
                        if (this.loadedcars == 6) {
                            final String string29 = "101|32|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.claname + "|" + this.selcar + "|";
                            String line22;
                            try {
                                this.dout.println(string29);
                                line22 = this.din.readLine();
                            }
                            catch (final Exception ex51) {
                                line22 = "fail";
                            }
                            if (line22.equals("OK")) {
                                this.loadedcars = -1;
                            }
                            else {
                                this.loadedcars = 7;
                            }
                        }
                        if (this.loadedcars == 8) {
                            final String string30 = "101|33|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.claname + "|" + this.selcar + "|";
                            String line23;
                            try {
                                this.dout.println(string30);
                                line23 = this.din.readLine();
                            }
                            catch (final Exception ex52) {
                                line23 = "fail";
                            }
                            if (line23.equals("OK")) {
                                this.loadedcars = -1;
                            }
                            else {
                                this.loadedcars = 9;
                            }
                        }
                        if (this.loadedcars == -1) {
                            this.loadedcars = this.loadclancars();
                        }
                        if (this.loadedcars == 1 && !this.selcar.equals("Select Car") && this.loadedcar == 0) {
                            if (this.xt.sc[0] != 36 || this.xt.clan.toLowerCase().equals(this.claname.toLowerCase())) {
                                this.cd.haltload = 1;
                            }
                            else {
                                this.cd.haltload = 2;
                            }
                            while (this.cd.haltload == this.cd.onloadingcar) {}
                            this.loadedcar = this.cd.loadonlinecar(this.selcar, 35 + this.cd.haltload);
                            if (this.xt.sc[0] == 36 && this.cd.haltload == 1 && this.loadedcar > 0) {
                                for (int n87 = 0, n88 = 0; n88 < this.bco[36].npl && n87 == 0; ++n88) {
                                    if (this.bco[36].p[n88].colnum == 1) {
                                        final float[] hsbvals = new float[3];
                                        Color.RGBtoHSB(this.bco[36].p[n88].c[0], this.bco[36].p[n88].c[1], this.bco[36].p[n88].c[2], hsbvals);
                                        this.xt.arnp[0] = hsbvals[0];
                                        this.xt.arnp[1] = hsbvals[1];
                                        this.xt.arnp[2] = 1.0f - hsbvals[2];
                                        n87 = 1;
                                    }
                                }
                                for (int n89 = 0, n90 = 0; n90 < this.bco[36].npl && n89 == 0; ++n90) {
                                    if (this.bco[36].p[n90].colnum == 2) {
                                        final float[] hsbvals2 = new float[3];
                                        Color.RGBtoHSB(this.bco[36].p[n90].c[0], this.bco[36].p[n90].c[1], this.bco[36].p[n90].c[2], hsbvals2);
                                        this.xt.arnp[3] = hsbvals2[0];
                                        this.xt.arnp[4] = hsbvals2[1];
                                        this.xt.arnp[5] = 1.0f - hsbvals2[2];
                                        n89 = 1;
                                    }
                                }
                            }
                        }
                        if (this.loadedcars == 2) {
                            this.loadedcars = this.loadaddcars();
                        }
                    }
                    if (this.ctab == 3) {
                        if (this.loadedstages == 6) {
                            final String string31 = "101|34|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.claname + "|" + this.selstage + "|";
                            String line24;
                            try {
                                this.dout.println(string31);
                                line24 = this.din.readLine();
                            }
                            catch (final Exception ex53) {
                                line24 = "fail";
                            }
                            if (line24.equals("OK")) {
                                this.loadedstages = -1;
                            }
                            else {
                                this.loadedstages = 7;
                            }
                        }
                        if (this.loadedstages == 8) {
                            final String string32 = "101|35|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.claname + "|" + this.selstage + "|";
                            String line25;
                            try {
                                this.dout.println(string32);
                                line25 = this.din.readLine();
                            }
                            catch (final Exception ex54) {
                                line25 = "fail";
                            }
                            if (line25.equals("OK")) {
                                this.loadedstages = -1;
                            }
                            else {
                                this.loadedstages = 9;
                            }
                        }
                        if (this.loadedstages == -1) {
                            this.loadedstages = this.loadclanstages();
                        }
                        if (this.loadedstages == 1 && !this.selstage.equals("Select Stage") && this.loadedstage == 0) {
                            this.cd.t.nt = 0;
                            if (this.gs.loadstagePreview(-2, this.selstage, this.co, this.bco, this.m, this.cp)) {
                                this.loadedstage = 1;
                                this.m.ptr = 0;
                                this.m.ptcnt = -10;
                                this.m.hit = 45000;
                                this.m.fallen = 0;
                                this.m.nrnd = 0;
                            }
                            else {
                                this.loadedstage = -1;
                            }
                        }
                        if (this.loadedstages == 2) {
                            this.loadedstages = this.loadaddstages();
                        }
                    }
                    if (this.ctab == 4 && !this.loadedlink) {
                        this.loadclanlink();
                        this.loadedlink = true;
                    }
                }
            }
            if (this.upload != 0) {
                if (this.filename.toLowerCase().endsWith(".gif") || this.filename.toLowerCase().endsWith(".jpg") || this.filename.toLowerCase().endsWith(".jpeg") || this.filename.toLowerCase().endsWith(".png")) {
                    final File file = new File(this.filename);
                    if (file.exists()) {
                        final int i39 = (int)file.length();
                        if (i39 < 1048576) {
                            if (this.upload != 0) {
                                this.upload = 2;
                                try {
                                    int i40 = 2;
                                    if (this.tab == 1 && this.edit == 2) {
                                        i40 = 3;
                                    }
                                    String string33 = "";
                                    if (this.tab == 3) {
                                        if (this.editc == 1) {
                                            i40 = 22;
                                        }
                                        if (this.editc == 2) {
                                            i40 = 23;
                                        }
                                        string33 = "" + this.claname + "|";
                                    }
                                    this.dout.println("101|" + i40 + "|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + i39 + "|" + string33 + "");
                                    if (this.din.readLine().equals("OK")) {
                                        final FileInputStream fileInputStream = new FileInputStream(file);
                                        final byte[] array19 = new byte[i39];
                                        fileInputStream.read(array19);
                                        fileInputStream.close();
                                        final DataOutputStream dataOutputStream = new DataOutputStream(this.socket.getOutputStream());
                                        if (this.upload != 0) {
                                            this.upload = 3;
                                        }
                                        this.perc = 0;
                                        int len;
                                        for (int off = 0; off < i39 && this.upload != 0; off += len, this.perc = (int)(off / (float)i39 * 100.0f)) {
                                            len = 10240;
                                            if (off + len > i39) {
                                                len = i39 - off;
                                            }
                                            dataOutputStream.write(array19, off, len);
                                        }
                                        if (this.upload != 0) {
                                            if (this.din.readLine().equals("CR")) {
                                                this.upload = 4;
                                            }
                                            else {
                                                this.msg = "Failed to create image online, server error!";
                                                this.flko = 45;
                                                this.upload = 0;
                                            }
                                            if (this.din.readLine().equals("OK")) {
                                                this.upload = 5;
                                            }
                                        }
                                        else {
                                            try {
                                                this.socket.close();
                                                this.socket = null;
                                                this.din.close();
                                                this.din = null;
                                                this.dout.close();
                                                this.dout = null;
                                                this.connector = null;
                                            }
                                            catch (final Exception ex55) {}
                                            try {
                                                this.socket = new Socket(this.lg.servers[0], 7061);
                                                this.din = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
                                                this.dout = new PrintWriter(this.socket.getOutputStream(), true);
                                            }
                                            catch (final Exception ex56) {}
                                        }
                                    }
                                    else {
                                        this.msg = "Failed to authenticate to start an uploading connection!";
                                        this.flko = 45;
                                        this.upload = 0;
                                    }
                                }
                                catch (final Exception ex57) {
                                    this.msg = "Failed to upload image, unknown error!";
                                    this.flko = 45;
                                    this.upload = 0;
                                    try {
                                        this.socket.close();
                                        this.socket = null;
                                        this.din.close();
                                        this.din = null;
                                        this.dout.close();
                                        this.dout = null;
                                        this.connector = null;
                                    }
                                    catch (final Exception ex58) {}
                                    try {
                                        this.socket = new Socket(this.lg.servers[0], 7061);
                                        this.din = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
                                        this.dout = new PrintWriter(this.socket.getOutputStream(), true);
                                    }
                                    catch (final Exception ex59) {}
                                }
                            }
                        }
                        else {
                            this.msg = "Uploaded image must be less than 1MB in size!";
                            this.flko = 45;
                            this.upload = 0;
                        }
                    }
                    else {
                        this.msg = "The file chosen is invalid or does not exist!";
                        this.flko = 45;
                        this.upload = 0;
                    }
                }
                else {
                    this.msg = "Uploaded image must be JPEG, GIF or PNG!";
                    this.flko = 45;
                    this.upload = 0;
                }
            }
            if (this.uploadt == 5) {
                this.uploadt = 0;
                this.msg = "";
            }
            if (this.uploadt != 0) {
                final File file2 = new File(this.filename);
                if (file2.exists()) {
                    final int n91 = (int)file2.length();
                    if (n91 < 716800) {
                        this.xt.strack = new RadicalMod(this.filename, true);
                        if (this.xt.strack.loaded == 2) {
                            this.trackvol = (int)(220.0f / (this.xt.strack.rvol / 3750.0f));
                            this.xt.strack.unload();
                            if (this.uploadt != 0) {
                                this.uploadt = 2;
                                try {
                                    this.dout.println("101|4|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.trackname + "|" + this.trackvol + "|" + n91 + "|");
                                    if (this.din.readLine().equals("OK")) {
                                        String s11 = this.din.readLine();
                                        if (this.uploadt != 0) {
                                            if (s11.equals("UPLOAD")) {
                                                this.uploadt = 3;
                                                final FileInputStream fileInputStream2 = new FileInputStream(file2);
                                                final byte[] array20 = new byte[n91];
                                                fileInputStream2.read(array20);
                                                fileInputStream2.close();
                                                new DataOutputStream(this.socket.getOutputStream()).write(array20, 0, n91);
                                                this.uploadt = 4;
                                                s11 = this.din.readLine();
                                            }
                                            if (s11.equals("FOUND")) {
                                                this.uploadt = 4;
                                                s11 = this.din.readLine();
                                            }
                                            if (s11.equals("OK")) {
                                                this.themesong = this.trackname;
                                                this.uploadt = 5;
                                            }
                                            else if (s11.equals("EXIST")) {
                                                this.msg = "Another track with the same name already exists, please rename you file!";
                                                this.flko = 45;
                                                this.uploadt = 0;
                                            }
                                            else {
                                                this.msg = "Failed to add MOD Track to your profile, unknown error!";
                                                this.flko = 45;
                                                this.uploadt = 0;
                                            }
                                        }
                                        else {
                                            try {
                                                this.socket.close();
                                                this.socket = null;
                                                this.din.close();
                                                this.din = null;
                                                this.dout.close();
                                                this.dout = null;
                                                this.connector = null;
                                            }
                                            catch (final Exception ex60) {}
                                            try {
                                                this.socket = new Socket(this.lg.servers[0], 7061);
                                                this.din = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
                                                this.dout = new PrintWriter(this.socket.getOutputStream(), true);
                                            }
                                            catch (final Exception ex61) {}
                                        }
                                    }
                                    else {
                                        this.msg = "Failed to authenticate to start an uploading connection!";
                                        this.flko = 45;
                                        this.uploadt = 0;
                                    }
                                }
                                catch (final Exception ex62) {
                                    this.msg = "Failed to upload track, unknown error!";
                                    this.flko = 45;
                                    this.uploadt = 0;
                                    try {
                                        this.socket.close();
                                        this.socket = null;
                                        this.din.close();
                                        this.din = null;
                                        this.dout.close();
                                        this.dout = null;
                                        this.connector = null;
                                    }
                                    catch (final Exception ex63) {}
                                    try {
                                        this.socket = new Socket(this.lg.servers[0], 7061);
                                        this.din = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
                                        this.dout = new PrintWriter(this.socket.getOutputStream(), true);
                                    }
                                    catch (final Exception ex64) {}
                                }
                            }
                        }
                        else {
                            this.xt.strack.unload();
                            this.msg = "The file choosen is not a valid MOD Track!";
                            this.flko = 45;
                            this.uploadt = 0;
                        }
                    }
                    else {
                        this.msg = "Uploaded file must be less than 250KB in size!";
                        this.flko = 45;
                        this.uploadt = 0;
                    }
                }
                else {
                    this.msg = "The file chosen is invalid or does not exist!";
                    this.flko = 45;
                    this.uploadt = 0;
                }
            }
            if (this.playt == 1) {
                (this.xt.strack = new RadicalMod(this.themesong, this.trackvol, 8000, 125, false, true)).play();
                this.playt = 2;
            }
            this.domelogos();
            try {
                final Thread connector2 = this.connector;
                Thread.sleep(600L);
            }
            catch (final InterruptedException ex65) {}
        }
        this.onexit();
    }
    
    public void onexit() {
        this.onexitpro();
        this.gs.hidefields();
        this.cd.acname = "";
        this.cd.action = 0;
        this.cd.staction = 0;
        this.cd.onstage = "";
        this.addstage = 0;
        this.npf = -1;
        this.editc = 0;
        this.openc = 0;
        this.readmsg = 0;
        this.loadmsgs = -1;
        this.readclan = 0;
        if (this.cd.haltload == 2) {
            this.cd.haltload = 1;
            this.cd.lcardate[1] = 0;
        }
        if (this.cd.haltload == 1) {
            if (this.xt.sc[0] == 36) {
                if (!this.xt.clan.toLowerCase().equals(this.claname.toLowerCase())) {
                    this.loadedcars = -1;
                }
            }
            else {
                this.cd.haltload = 0;
                this.cd.lcardate[0] = 0;
            }
        }
        this.m.crs = true;
        this.m.focus_point = 400;
        this.m.x = -335;
        this.m.y = 0;
        this.m.z = -50;
        this.m.xz = 0;
        this.m.zy = 20;
        this.m.ground = -2000;
        try {
            this.socket.close();
            this.socket = null;
            this.din.close();
            this.din = null;
            this.dout.close();
            this.dout = null;
            this.connector = null;
        }
        catch (final Exception ex) {}
    }
    
    public void onexitpro() {
        this.edit = 0;
        this.upload = 0;
        this.uploadt = 0;
        this.sfreq = 0;
        if (this.playt == 2) {
            this.xt.strack.unload();
            this.playt = 0;
        }
        this.protab = 0;
        this.gs.proitem.show = false;
        this.addstage = 0;
    }
    
    public void stopallnow() {
        if (this.connector != null) {
            this.connector.stop();
            this.connector = null;
        }
        try {
            this.socket.close();
            this.socket = null;
            this.din.close();
            this.din = null;
            this.dout.close();
            this.dout = null;
            this.connector = null;
        }
        catch (final Exception ex) {}
    }
    
    public void trunsent() {
        for (int i = 0; i < 3; ++i) {
            this.aboutxt[i] = "";
        }
        if (!this.sentance.equals("")) {
            this.rd.setFont(new Font("Tahoma", 1, 11));
            this.ftm = this.rd.getFontMetrics();
            int n = 0;
            int j = 0;
            int endIndex = 0;
            int beginIndex = 0;
            boolean b = false;
            while (j < this.sentance.length()) {
                final String string = "" + this.sentance.charAt(j);
                if (string.equals(" ")) {
                    endIndex = j;
                }
                if (n < 3) {
                    final StringBuilder sb = new StringBuilder();
                    final String[] aboutxt = this.aboutxt;
                    final int n2 = n;
                    aboutxt[n2] = sb.append(aboutxt[n2]).append(string).toString();
                    if (this.ftm.stringWidth(this.aboutxt[n]) > 276) {
                        if (endIndex != beginIndex) {
                            this.aboutxt[n] = this.sentance.substring(beginIndex, endIndex);
                            j = (beginIndex = endIndex);
                        }
                        else if (n == 2) {
                            b = true;
                        }
                        ++n;
                    }
                }
                else {
                    if (b) {
                        this.aboutxt[2] = this.aboutxt[2].substring(0, this.aboutxt[2].length() - 3);
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    final String[] aboutxt2 = this.aboutxt;
                    final int n3 = 2;
                    aboutxt2[n3] = sb2.append(aboutxt2[n3]).append("...").toString();
                    j = this.sentance.length();
                }
                ++j;
            }
        }
        this.nab = 0;
        for (int n4 = 0; n4 < 3 && !this.aboutxt[n4].equals(""); ++n4) {
            this.aboutxt[n4] = this.aboutxt[n4].trim();
            ++this.nab;
        }
    }
    
    public void roomlogos(final String[] array, final int n) {
        for (int i = 0; i < 2; ++i) {
            boolean b = true;
            String lowerCase = "";
            for (int j = 0; j < n; ++j) {
                b = false;
                for (int k = 0; k < this.nlg; ++k) {
                    if (array[j].toLowerCase().equals(this.logos[k].toLowerCase())) {
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    lowerCase = array[j].toLowerCase();
                    break;
                }
            }
            if (b) {
                break;
            }
            this.logos[this.nlg] = lowerCase;
            this.logon[this.nlg] = false;
            try {
                final URL url = new URL("http://multiplayer.needformadness.com/profiles/" + this.logos[this.nlg] + "/logo.png");
                url.openConnection().setConnectTimeout(2000);
                if (url.openConnection().getContentType().equals("image/png")) {
                    this.logoi[this.nlg] = Toolkit.getDefaultToolkit().createImage(url);
                    this.mt.addImage(this.logoi[this.nlg], this.nlg);
                    this.logon[this.nlg] = true;
                }
            }
            catch (final Exception ex) {}
            ++this.nlg;
            if (this.nlg == 200) {
                this.nlg = 0;
            }
        }
    }
    
    public void domelogos() {
        for (int i = 0; i < 5; ++i) {
            int n = 1;
            boolean b = false;
            String s = "";
            String str = "";
            if (this.freq == 1) {
                n = 0;
                for (int j = 0; j < this.nlg; ++j) {
                    if (this.freqname.toLowerCase().equals(this.logos[j].toLowerCase())) {
                        n = 1;
                        break;
                    }
                }
                if (n == 0) {
                    s = this.freqname.toLowerCase();
                }
            }
            if (n != 0 && this.loadednews == 1) {
                for (int k = 0; k < 4; ++k) {
                    if (!this.newplayers[k].equals("")) {
                        n = 0;
                        for (int l = 0; l < this.nlg; ++l) {
                            if (this.newplayers[k].toLowerCase().equals(this.logos[l].toLowerCase())) {
                                n = 1;
                                break;
                            }
                        }
                        if (n == 0) {
                            s = this.newplayers[k].toLowerCase();
                            break;
                        }
                    }
                }
            }
            if (n != 0 && this.loadednews == 1) {
                for (int n2 = 0; n2 < 5; ++n2) {
                    if (this.nwarbs[n2] > 0) {
                        n = 0;
                        final String string = "#" + this.nwclan[n2] + "#";
                        for (int n3 = 0; n3 < this.nlg; ++n3) {
                            if (string.toLowerCase().equals(this.logos[n3].toLowerCase())) {
                                n = 1;
                                break;
                            }
                        }
                        if (n == 0) {
                            s = string.toLowerCase();
                            b = true;
                            str = this.nwclan[n2];
                            break;
                        }
                    }
                }
            }
            if (n != 0 && this.loadwstat == 1) {
                for (int n4 = 0; n4 < 5; ++n4) {
                    if (this.ncc > 0) {
                        n = 0;
                        final String string2 = "#" + this.conclan[n4] + "#";
                        for (int n5 = 0; n5 < this.nlg; ++n5) {
                            if (string2.toLowerCase().equals(this.logos[n5].toLowerCase())) {
                                n = 1;
                                break;
                            }
                        }
                        if (n == 0) {
                            s = string2.toLowerCase();
                            b = true;
                            str = this.conclan[n4];
                            break;
                        }
                    }
                }
            }
            if (n != 0 && this.ni > 0) {
                for (int n6 = 0; n6 < this.ni; ++n6) {
                    n = 0;
                    final String string3 = "#" + this.iclan[n6] + "#";
                    for (int n7 = 0; n7 < this.nlg; ++n7) {
                        if (string3.toLowerCase().equals(this.logos[n7].toLowerCase())) {
                            n = 1;
                            break;
                        }
                    }
                    if (n == 0) {
                        s = string3.toLowerCase();
                        b = true;
                        str = this.iclan[n6];
                        break;
                    }
                }
            }
            if (n != 0 && this.nclns > 0) {
                for (int n8 = 0; n8 < this.nclns; ++n8) {
                    n = 0;
                    final String string4 = "#" + this.clanlo[n8] + "#";
                    for (int n9 = 0; n9 < this.nlg; ++n9) {
                        if (string4.toLowerCase().equals(this.logos[n9].toLowerCase())) {
                            n = 1;
                            break;
                        }
                    }
                    if (n == 0) {
                        s = string4.toLowerCase();
                        b = true;
                        str = this.clanlo[n8];
                        break;
                    }
                }
            }
            if (n != 0 && this.nrmb > 0 && this.showreqs) {
                for (int n10 = 0; n10 < this.nrmb; ++n10) {
                    n = 0;
                    for (int n11 = 0; n11 < this.nlg; ++n11) {
                        if (this.rmember[n10].toLowerCase().equals(this.logos[n11].toLowerCase())) {
                            n = 1;
                            break;
                        }
                    }
                    if (n == 0) {
                        s = this.rmember[n10].toLowerCase();
                        break;
                    }
                }
            }
            if (n != 0 && this.nmb > 0) {
                for (int n12 = 0; n12 < this.nmb; ++n12) {
                    n = 0;
                    for (int n13 = 0; n13 < this.nlg; ++n13) {
                        if (this.member[n12].toLowerCase().equals(this.logos[n13].toLowerCase())) {
                            n = 1;
                            break;
                        }
                    }
                    if (n == 0) {
                        s = this.member[n12].toLowerCase();
                        break;
                    }
                }
            }
            if (n != 0 && this.nclns > 0) {
                for (int n14 = 0; n14 < this.ncln; ++n14) {
                    n = 0;
                    for (int n15 = 0; n15 < this.nlg; ++n15) {
                        if (this.clname[n14].toLowerCase().equals(this.logos[n15].toLowerCase())) {
                            n = 1;
                            break;
                        }
                    }
                    if (n == 0) {
                        s = this.clname[n14].toLowerCase();
                        break;
                    }
                }
            }
            if (n != 0 && this.npf > 0) {
                for (int n16 = 0; n16 < this.npf; ++n16) {
                    n = 0;
                    for (int n17 = 0; n17 < this.nlg; ++n17) {
                        if (this.fname[n16].toLowerCase().equals(this.logos[n17].toLowerCase())) {
                            n = 1;
                            break;
                        }
                    }
                    if (n == 0) {
                        s = this.fname[n16].toLowerCase();
                        break;
                    }
                }
            }
            if (n != 0 && this.nm > 0) {
                for (int n18 = 0; n18 < this.nm; ++n18) {
                    n = 0;
                    for (int n19 = 0; n19 < this.nlg; ++n19) {
                        if (this.mname[n18].toLowerCase().equals(this.logos[n19].toLowerCase())) {
                            n = 1;
                            break;
                        }
                    }
                    if (n == 0) {
                        s = this.mname[n18].toLowerCase();
                        break;
                    }
                }
            }
            if (n != 0) {
                for (int n20 = 0; n20 < this.npo; ++n20) {
                    n = 0;
                    for (int n21 = 0; n21 < this.nlg; ++n21) {
                        if (this.pname[n20].toLowerCase().equals(this.logos[n21].toLowerCase())) {
                            n = 1;
                            break;
                        }
                    }
                    if (n == 0) {
                        s = this.pname[n20].toLowerCase();
                        break;
                    }
                }
            }
            if (n != 0) {
                break;
            }
            this.logos[this.nlg] = s;
            this.logon[this.nlg] = false;
            try {
                String spec = "http://multiplayer.needformadness.com/profiles/" + this.logos[this.nlg] + "/logo.png";
                if (b) {
                    spec = "http://multiplayer.needformadness.com/clans/" + str + "/logo.png";
                }
                final URL url = new URL(spec);
                url.openConnection().setConnectTimeout(2000);
                if (url.openConnection().getContentType().equals("image/png")) {
                    this.logoi[this.nlg] = Toolkit.getDefaultToolkit().createImage(url);
                    this.mt.addImage(this.logoi[this.nlg], this.nlg);
                    this.logon[this.nlg] = true;
                }
            }
            catch (final Exception ex) {}
            ++this.nlg;
            if (this.nlg == 200) {
                this.nlg = 0;
            }
        }
    }
    
    public boolean drawl(final Graphics2D graphics2D, final String s, final int n, final int n2, final boolean b) {
        boolean checkID = false;
        int id = -1;
        for (int i = 0; i < this.nlg; ++i) {
            if (s.toLowerCase().equals(this.logos[i].toLowerCase())) {
                id = i;
                break;
            }
        }
        if (id != -1 && this.logon[id]) {
            if (!b) {
                graphics2D.setComposite(AlphaComposite.getInstance(3, 0.1f));
            }
            graphics2D.drawImage(this.logoi[id], n, n2, null);
            checkID = this.mt.checkID(id);
            if (!b) {
                graphics2D.setComposite(AlphaComposite.getInstance(3, 1.0f));
            }
        }
        return checkID;
    }
    
    public void logopng() {
        int nlg = -1;
        boolean b = false;
        int i = 0;
        while (i < this.nlg) {
            if (this.proname.toLowerCase().equals(this.logos[i].toLowerCase())) {
                nlg = i;
                if (this.logon[nlg] && !this.refresh) {
                    b = true;
                    this.logol = true;
                    break;
                }
                break;
            }
            else {
                ++i;
            }
        }
        if (!b) {
            if (nlg == -1) {
                nlg = this.nlg;
                ++this.nlg;
                if (this.nlg == 200) {
                    this.nlg = 0;
                }
            }
            this.logos[nlg] = this.proname.toLowerCase();
            try {
                String string = "";
                if (this.refresh) {
                    string = "?req=" + (int)(Math.random() * 1000.0) + "";
                }
                final URL url = new URL("http://multiplayer.needformadness.com/profiles/" + this.proname + "/logo.png" + string + "");
                url.openConnection().setConnectTimeout(2000);
                if (url.openConnection().getContentType().equals("image/png")) {
                    this.logoi[nlg] = Toolkit.getDefaultToolkit().createImage(url);
                    this.mt.addImage(this.logoi[nlg], nlg);
                    this.logon[nlg] = true;
                }
                else {
                    this.logon[nlg] = false;
                }
            }
            catch (final Exception ex) {}
            this.logol = this.logon[nlg];
        }
    }
    
    public void clanlogopng(final String str) {
        int nlg = -1;
        boolean b = false;
        final String string = "#" + str.toLowerCase() + "#";
        int i = 0;
        while (i < this.nlg) {
            if (string.equals(this.logos[i])) {
                nlg = i;
                if (this.logon[nlg] && !this.refresh) {
                    b = true;
                    break;
                }
                break;
            }
            else {
                ++i;
            }
        }
        if (!b) {
            if (nlg == -1) {
                nlg = this.nlg;
                ++this.nlg;
                if (this.nlg == 200) {
                    this.nlg = 0;
                }
            }
            this.logos[nlg] = string;
            try {
                String string2 = "";
                if (this.refresh) {
                    string2 = "?req=" + (int)(Math.random() * 1000.0) + "";
                }
                final URL url = new URL("http://multiplayer.needformadness.com/clans/" + str + "/logo.png" + string2 + "");
                url.openConnection().setConnectTimeout(2000);
                if (url.openConnection().getContentType().equals("image/png")) {
                    this.logoi[nlg] = Toolkit.getDefaultToolkit().createImage(url);
                    this.mt.addImage(this.logoi[nlg], nlg);
                    this.logon[nlg] = true;
                }
                else {
                    this.logon[nlg] = false;
                }
            }
            catch (final Exception ex) {}
        }
    }
    
    public void avatarpng() {
        this.avatarl = false;
        String string = "";
        if (this.refresh) {
            string = "?req=" + (int)(Math.random() * 1000.0) + "";
        }
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/profiles/" + this.proname + "/avatar.png" + string + "");
            url.openConnection().setConnectTimeout(2000);
            if (url.openConnection().getContentType().equals("image/png")) {
                this.avatar = Toolkit.getDefaultToolkit().createImage(url);
                this.avatarl = true;
            }
        }
        catch (final Exception ex) {}
    }
    
    public void clanbgpng() {
        this.clanbgl = false;
        String string = "";
        if (this.refresh) {
            string = "?req=" + (int)(Math.random() * 1000.0) + "";
        }
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/clans/" + this.claname + "/bg.jpg" + string + "");
            url.openConnection().setConnectTimeout(2000);
            if (url.openConnection().getContentType().equals("image/jpeg")) {
                this.clanbg = Toolkit.getDefaultToolkit().createImage(url);
                this.clanbgl = true;
            }
        }
        catch (final Exception ex) {}
    }
    
    public void intclanbgpng(final String intclanlo) {
        if (!this.intclanlo.equals(intclanlo)) {
            this.intclanbgloaded = false;
            try {
                final URL url = new URL("http://multiplayer.needformadness.com/clans/" + intclanlo + "/bg.jpg");
                url.openConnection().setConnectTimeout(2000);
                if (url.openConnection().getContentType().equals("image/jpeg")) {
                    this.intclanbg = Toolkit.getDefaultToolkit().createImage(url);
                    this.intclanbgloaded = true;
                }
            }
            catch (final Exception ex) {}
            this.intclanlo = intclanlo;
        }
    }
    
    public void loadmyclanbg() {
        if (this.loadedmyclanbg <= 0) {
            String string = "";
            if (this.loadedmyclanbg == -1) {
                string = "?req=" + (int)(Math.random() * 1000.0) + "";
            }
            this.loadedmyclanbg = 2;
            try {
                final URL url = new URL("http://multiplayer.needformadness.com/clans/" + this.xt.clan + "/bg.jpg" + string + "");
                url.openConnection().setConnectTimeout(2000);
                if (url.openConnection().getContentType().equals("image/jpeg")) {
                    this.myclanbg = Toolkit.getDefaultToolkit().createImage(url);
                    this.loadedmyclanbg = 1;
                }
            }
            catch (final Exception ex) {}
        }
    }
    
    public void loadclan() {
        this.notclan = false;
        int ncln = 0;
        final String[] array = new String[20];
        final int[] array2 = new int[20];
        final String[] array3 = new String[20];
        this.showreqs = false;
        this.nrmb = 0;
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/clans/" + this.claname + "/members.txt?req=" + (int)(Math.random() * 1000.0) + "");
            url.openConnection().setConnectTimeout(2000);
            if (url.openConnection().getContentType().equals("text/plain")) {
                final DataInputStream dataInputStream = new DataInputStream(url.openStream());
                String line;
                while ((line = dataInputStream.readLine()) != null && ncln < 20) {
                    final String trim = line.trim();
                    final String svalue = this.getSvalue(trim, 0);
                    if (!svalue.equals("")) {
                        final int getvalue = this.getvalue(trim, 1);
                        if (getvalue != 0) {
                            array[ncln] = svalue;
                            array2[ncln] = getvalue;
                            array3[ncln] = this.getSvalue(trim, 2);
                            ++ncln;
                        }
                        else {
                            if (this.nrmb >= 100) {
                                continue;
                            }
                            this.rmember[this.nrmb] = svalue;
                            ++this.nrmb;
                        }
                    }
                }
                dataInputStream.close();
            }
            else {
                this.notclan = true;
            }
        }
        catch (final Exception ex) {}
        this.nmb = 0;
        if (!this.notclan) {
            for (int i = 7; i > 0; --i) {
                for (int j = 0; j < ncln; ++j) {
                    if (array2[j] == i) {
                        this.member[this.nmb] = array[j];
                        this.mrank[this.nmb] = array3[j];
                        this.mlevel[this.nmb] = array2[j];
                        ++this.nmb;
                    }
                }
            }
            for (int k = 0; k < this.nmb; ++k) {
                if (this.xt.nickname.toLowerCase().equals(this.member[k].toLowerCase())) {
                    if ((this.mlevel[k] == 7 || k == 0) && this.nrmb != 0) {
                        this.showreqs = true;
                    }
                    if (!this.xt.clan.toLowerCase().equals(this.claname.toLowerCase())) {
                        this.attachetoclan = true;
                    }
                }
            }
            if (this.xt.clan.toLowerCase().equals(this.claname.toLowerCase())) {
                for (int l = 0; l < ncln; ++l) {
                    this.clname[l] = array[l];
                }
                this.ncln = ncln;
                this.loadedcm = true;
            }
        }
    }
    
    public void loadclanlink() {
        this.ltit = "";
        this.ldes = "";
        this.lurl = "";
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/clans/" + this.claname + "/link.txt?req=" + (int)(Math.random() * 1000.0) + "");
            url.openConnection().setConnectTimeout(2000);
            if (url.openConnection().getContentType().equals("text/plain")) {
                final DataInputStream dataInputStream = new DataInputStream(url.openStream());
                String line;
                for (int n = 0; (line = dataInputStream.readLine()) != null && n < 3; ++n) {
                    final String trim = line.trim();
                    if (n == 0) {
                        this.ltit = trim;
                    }
                    if (n == 1) {
                        this.ldes = trim;
                    }
                    if (n == 2) {
                        this.lurl = trim;
                    }
                }
                dataInputStream.close();
            }
        }
        catch (final Exception ex) {
            this.ltit = "";
            this.ldes = "";
            this.lurl = "";
        }
    }
    
    public void loadfclan() {
        this.ncln = 0;
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/clans/" + this.xt.clan + "/members.txt?req=" + (int)(Math.random() * 1000.0) + "");
            url.openConnection().setConnectTimeout(2000);
            final DataInputStream dataInputStream = new DataInputStream(url.openStream());
            String line;
            while ((line = dataInputStream.readLine()) != null && this.ncln < 20) {
                final String trim = line.trim();
                final String svalue = this.getSvalue(trim, 0);
                if (!svalue.equals("") && this.getvalue(trim, 1) != 0) {
                    this.clname[this.ncln] = svalue;
                    ++this.ncln;
                }
            }
            dataInputStream.close();
        }
        catch (final Exception ex) {}
    }
    
    public int loadclancars() {
        this.m.csky[0] = 170;
        this.m.csky[1] = 220;
        this.m.csky[2] = 255;
        this.m.cfade[0] = 255;
        this.m.cfade[1] = 220;
        this.m.cfade[2] = 220;
        this.m.snap[0] = 0;
        this.m.snap[1] = 0;
        this.m.snap[2] = 0;
        int n = 0;
        this.gs.clcars.removeAll();
        this.gs.clcars.add(this.rd, "Select Car");
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/clans/" + this.claname + "/cars.txt?req=" + (int)(Math.random() * 1000.0) + "");
            url.openConnection().setConnectTimeout(2000);
            if (url.openConnection().getContentType().equals("text/plain")) {
                final DataInputStream dataInputStream = new DataInputStream(url.openStream());
                int n2 = 0;
                String line;
                while ((line = dataInputStream.readLine()) != null && n2 < 700) {
                    this.gs.clcars.add(this.rd, line);
                    ++n2;
                    if (n != 1) {
                        n = 1;
                    }
                }
                dataInputStream.close();
            }
        }
        catch (final Exception ex) {
            n = -2;
        }
        if (n == 1) {
            if (this.viewcar.equals("")) {
                this.gs.clcars.select(0);
            }
            else {
                this.gs.clcars.select(this.viewcar);
                this.viewcar = "";
            }
            this.selcar = this.gs.clcars.getSelectedItem();
        }
        return n;
    }
    
    public int loadaddcars() {
        int n = 3;
        int n2 = 0;
        final String[] array = new String[700];
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/cars/lists/" + this.gs.tnick.getText() + ".txt?reqlo=" + (int)(Math.random() * 1000.0) + "");
            url.openConnection().setConnectTimeout(2000);
            final DataInputStream dataInputStream = new DataInputStream(url.openStream());
            String line;
            while ((line = dataInputStream.readLine()) != null) {
                final String string = "" + line.trim();
                if (string.startsWith("mycars")) {
                    int n3 = 1;
                    while (n3 != 0 && n2 < 700) {
                        array[n2] = this.getfuncSvalue("mycars", string, n2);
                        if (array[n2].equals("")) {
                            n3 = 0;
                        }
                        else {
                            ++n2;
                        }
                    }
                }
            }
            dataInputStream.close();
        }
        catch (final Exception obj) {
            if (("" + obj).indexOf("FileNotFound") != -1) {
                n2 = 0;
                n = 3;
            }
            else {
                n2 = -1;
                n = 4;
            }
        }
        if (n2 > 0) {
            final String[] array2 = new String[700];
            int n4 = 0;
            for (int i = 0; i < n2; ++i) {
                this.perry = "" + (int)(i / (float)n2 * 100.0f) + " %";
                try {
                    final URL url2 = new URL(("http://multiplayer.needformadness.com/cars/" + array[i] + ".txt?reqlo=" + (int)(Math.random() * 1000.0) + "").replace(' ', '_'));
                    url2.openConnection().setConnectTimeout(2000);
                    final DataInputStream dataInputStream2 = new DataInputStream(url2.openStream());
                    String line2;
                    while ((line2 = dataInputStream2.readLine()) != null) {
                        final String string2 = "" + line2.trim();
                        if (string2.startsWith("details")) {
                            if (!this.getfuncSvalue("details", string2, 0).toLowerCase().equals(this.gs.tnick.getText().toLowerCase()) || string2.indexOf("Clan#") != -1) {
                                continue;
                            }
                            array2[n4] = array[i];
                            ++n4;
                        }
                    }
                    dataInputStream2.close();
                }
                catch (final Exception ex) {}
            }
            if (n4 > 0) {
                this.gs.clcars.removeAll();
                for (int j = 0; j < n4; ++j) {
                    this.gs.clcars.add(this.rd, array2[j]);
                }
                n = 5;
            }
            else {
                n = 3;
            }
        }
        return n;
    }
    
    public void loadiclancars(final String str) {
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/clans/" + str + "/cars.txt");
            url.openConnection().setConnectTimeout(2000);
            if (url.openConnection().getContentType().equals("text/plain")) {
                this.gs.datat.removeAll();
                this.gs.datat.add(this.rd, "Select Car");
                final DataInputStream dataInputStream = new DataInputStream(url.openStream());
                String line;
                for (int n = 0; (line = dataInputStream.readLine()) != null && n < 700; ++n) {
                    this.gs.datat.add(this.rd, line);
                }
                dataInputStream.close();
            }
            else {
                this.gs.datat.removeAll();
                this.gs.datat.add(this.rd, "No clan cars where found.");
            }
        }
        catch (final Exception ex) {
            this.gs.datat.removeAll();
            this.gs.datat.add(this.rd, "Failed to load cars, try again later...");
        }
        this.gs.datat.select(0);
    }
    
    public int loadclanstages() {
        int n = 0;
        this.gs.clcars.removeAll();
        this.gs.clcars.add(this.rd, "Select Stage");
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/clans/" + this.claname + "/stages.txt?req=" + (int)(Math.random() * 1000.0) + "");
            url.openConnection().setConnectTimeout(2000);
            if (url.openConnection().getContentType().equals("text/plain")) {
                final DataInputStream dataInputStream = new DataInputStream(url.openStream());
                int n2 = 0;
                String line;
                while ((line = dataInputStream.readLine()) != null && n2 < 700) {
                    this.gs.clcars.add(this.rd, line);
                    ++n2;
                    if (n != 1) {
                        n = 1;
                    }
                }
                dataInputStream.close();
            }
        }
        catch (final Exception ex) {
            n = -2;
        }
        if (n == 1) {
            if (this.viewcar.equals("")) {
                this.gs.clcars.select(0);
            }
            else {
                this.gs.clcars.select(this.viewcar);
                this.viewcar = "";
            }
            this.selstage = this.gs.clcars.getSelectedItem();
        }
        return n;
    }
    
    public int loadaddstages() {
        int n = 3;
        int n2 = 0;
        final String[] array = new String[700];
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/tracks/lists/" + this.gs.tnick.getText() + ".txt?reqlo=" + (int)(Math.random() * 1000.0) + "");
            url.openConnection().setConnectTimeout(2000);
            final DataInputStream dataInputStream = new DataInputStream(url.openStream());
            String line;
            while ((line = dataInputStream.readLine()) != null) {
                final String string = "" + line.trim();
                if (string.startsWith("mystages")) {
                    int n3 = 1;
                    while (n3 != 0 && n2 < 700) {
                        array[n2] = this.getfuncSvalue("mystages", string, n2);
                        if (array[n2].equals("")) {
                            n3 = 0;
                        }
                        else {
                            ++n2;
                        }
                    }
                }
            }
            dataInputStream.close();
        }
        catch (final Exception obj) {
            if (("" + obj).indexOf("FileNotFound") != -1) {
                n2 = 0;
                n = 3;
            }
            else {
                n2 = -1;
                n = 4;
            }
        }
        if (n2 > 0) {
            final String[] array2 = new String[700];
            int n4 = 0;
            for (int i = 0; i < n2; ++i) {
                this.perry = "" + (int)(i / (float)n2 * 100.0f) + " %";
                try {
                    final URL url2 = new URL(("http://multiplayer.needformadness.com/tracks/" + array[i] + ".txt?reqlo=" + (int)(Math.random() * 1000.0) + "").replace(' ', '_'));
                    url2.openConnection().setConnectTimeout(2000);
                    final DataInputStream dataInputStream2 = new DataInputStream(url2.openStream());
                    String line2;
                    while ((line2 = dataInputStream2.readLine()) != null) {
                        final String string2 = "" + line2.trim();
                        if (string2.startsWith("details")) {
                            if (!this.getfuncSvalue("details", string2, 0).toLowerCase().equals(this.gs.tnick.getText().toLowerCase()) || string2.indexOf("Clan#") != -1) {
                                continue;
                            }
                            array2[n4] = array[i];
                            ++n4;
                        }
                    }
                    dataInputStream2.close();
                }
                catch (final Exception ex) {}
            }
            if (n4 > 0) {
                this.gs.clcars.removeAll();
                for (int j = 0; j < n4; ++j) {
                    this.gs.clcars.add(this.rd, array2[j]);
                }
                n = 5;
            }
            else {
                n = 3;
            }
        }
        return n;
    }
    
    public void loadiclanstages(final String str) {
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/clans/" + str + "/stages.txt");
            url.openConnection().setConnectTimeout(2000);
            if (url.openConnection().getContentType().equals("text/plain")) {
                this.gs.datat.removeAll();
                this.gs.datat.add(this.rd, "Select Stage");
                final DataInputStream dataInputStream = new DataInputStream(url.openStream());
                String line;
                for (int n = 0; (line = dataInputStream.readLine()) != null && n < 700; ++n) {
                    this.gs.datat.add(this.rd, line);
                }
                dataInputStream.close();
            }
            else {
                this.gs.datat.removeAll();
                this.gs.datat.add(this.rd, "No clan stages where found.");
            }
        }
        catch (final Exception ex) {
            this.gs.datat.removeAll();
            this.gs.datat.add(this.rd, "Failed to load stages, try again later...");
        }
        this.gs.datat.select(0);
    }
    
    public void loadproinfo() {
        if (!this.proname.equals(this.xt.nickname) && this.npf == -1) {
            this.loadfriends();
        }
        this.racing = 0;
        this.wasting = 0;
        this.themesong = "";
        this.trackvol = 0;
        this.sentance = "";
        this.proclan = "";
        try {
            String string = "";
            if (this.proname.equals(this.xt.nickname)) {
                string = "?req=" + (int)(Math.random() * 1000.0) + "";
            }
            final URL url = new URL("http://multiplayer.needformadness.com/profiles/" + this.proname + "/info.txt" + string + "");
            url.openConnection().setConnectTimeout(2000);
            if (url.openConnection().getContentType().equals("text/plain")) {
                final DataInputStream dataInputStream = new DataInputStream(url.openStream());
                String line;
                for (int n = 0; (line = dataInputStream.readLine()) != null && n < 9; ++n) {
                    final String trim = line.trim();
                    if (n == 0) {
                        this.themesong = trim;
                    }
                    if (n == 1) {
                        int intValue;
                        try {
                            intValue = Integer.valueOf(trim);
                        }
                        catch (final Exception ex) {
                            intValue = 0;
                        }
                        this.trackvol = intValue;
                    }
                    if (n == 2) {
                        int intValue2;
                        try {
                            intValue2 = Integer.valueOf(trim);
                        }
                        catch (final Exception ex2) {
                            intValue2 = 0;
                        }
                        this.racing = intValue2;
                    }
                    if (n == 3) {
                        int intValue3;
                        try {
                            intValue3 = Integer.valueOf(trim);
                        }
                        catch (final Exception ex3) {
                            intValue3 = 0;
                        }
                        this.wasting = intValue3;
                    }
                    if (n == 4) {
                        this.proclan = trim;
                    }
                    if (n == 8) {
                        this.sentance = trim;
                    }
                }
                dataInputStream.close();
            }
        }
        catch (final Exception ex4) {
            this.sentance = "Failed to load profile info, server error!";
        }
    }
    
    public void loadprostages() {
        final String[] array = new String[700];
        int n = 0;
        try {
            final DataInputStream dataInputStream = new DataInputStream(new URL("http://multiplayer.needformadness.com/tracks/lists/" + this.proname + ".txt?reqlo=" + (int)(Math.random() * 1000.0) + "").openStream());
            String line;
            while ((line = dataInputStream.readLine()) != null) {
                final String string = "" + line.trim();
                if (string.startsWith("mystages")) {
                    int n2 = 1;
                    while (n2 != 0 && n < 700) {
                        array[n] = this.getfuncSvalue("mystages", string, n);
                        if (array[n].equals("")) {
                            n2 = 0;
                        }
                        else {
                            ++n;
                        }
                    }
                }
            }
            if (n > 0) {
                this.loadpst = 1;
            }
            else {
                this.loadpst = -2;
            }
            dataInputStream.close();
        }
        catch (final Exception obj) {
            if (("" + obj).indexOf("FileNotFound") != -1) {
                this.loadpst = -2;
            }
            else {
                this.loadpst = -1;
            }
        }
        if (this.loadpst == 1) {
            this.gs.proitem.removeAll();
            this.gs.proitem.add(this.gs.rd, "Select Stage");
            for (int i = 0; i < n; ++i) {
                this.gs.proitem.add(this.gs.rd, array[i]);
            }
            this.gs.proitem.select(0);
            this.loadpstage = "Select Stage";
            this.gs.proitem.show();
        }
        if (this.loadpst == -2) {
            this.gs.proitem.removeAll();
            this.gs.proitem.add(this.gs.rd, "No published or added stages found...");
            this.gs.proitem.select(0);
            this.gs.proitem.show();
        }
        if (this.loadpst == -1) {
            this.gs.proitem.removeAll();
            this.gs.proitem.add(this.gs.rd, "Failed to load stages, please try again later.");
            this.gs.proitem.select(0);
            this.gs.proitem.show();
        }
        System.gc();
    }
    
    public void loadfriends() {
        if (this.npf == -1) {
            this.freq = 0;
            try {
                final URL url = new URL("http://multiplayer.needformadness.com/profiles/" + this.xt.nickname + "/friends.txt?req=" + (int)(Math.random() * 1000.0) + "");
                url.openConnection().setConnectTimeout(2000);
                if (url.openConnection().getContentType().equals("text/plain")) {
                    int npf = 0;
                    final DataInputStream dataInputStream = new DataInputStream(url.openStream());
                    String line;
                    for (int n = 0; (line = dataInputStream.readLine()) != null && n < 3; ++n) {
                        final String trim = line.trim();
                        if (n == 0) {
                            for (String s = this.getSvalue(trim, npf); !s.equals("") && this.npf < 900; s = this.getSvalue(trim, npf)) {
                                this.fname[npf] = s;
                                ++npf;
                            }
                        }
                        if (n == 1) {
                            this.freqname = this.getSvalue(trim, 0);
                            if (!this.freqname.equals("")) {
                                this.freq = 1;
                            }
                        }
                        if (n == 2 && this.freq != 1) {
                            this.ncnf = 0;
                            for (String s2 = this.getSvalue(trim, this.ncnf); !s2.equals("") && this.ncnf < 10; s2 = this.getSvalue(trim, this.ncnf)) {
                                this.cnfname[this.ncnf] = s2;
                                ++this.ncnf;
                            }
                            if (this.ncnf != 0) {
                                this.freq = 6;
                            }
                        }
                    }
                    dataInputStream.close();
                    this.npf = npf;
                }
                else {
                    this.npf = 0;
                }
            }
            catch (final Exception ex) {
                this.npf = -2;
            }
        }
    }
    
    public void loadnews() {
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/interact/news.txt?req=" + (int)(Math.random() * 1000.0) + "");
            url.openConnection().setConnectTimeout(2000);
            final DataInputStream dataInputStream = new DataInputStream(url.openStream());
            int n = 0;
            String s = "";
            this.il = 0;
            String line;
            while ((line = dataInputStream.readLine()) != null && n < 300) {
                final String trim = line.trim();
                if (n == 0) {
                    for (int i = 0; i < 4; ++i) {
                        this.newplayers[i] = this.getSvalue(trim, i);
                    }
                }
                if (n >= 1 && n <= 5) {
                    this.nwtime[n - 1] = this.contime(this.getLvalue(trim, 0));
                    this.nwarbs[n - 1] = this.getvalue(trim, 1);
                    this.nwclan[n - 1] = this.getSvalue(trim, 2);
                    this.nlclan[n - 1] = this.getSvalue(trim, 3);
                    this.nwinob[n - 1] = this.getSvalue(trim, 4);
                    this.nwinp[n - 1] = this.getvalue(trim, 5);
                    this.nlosp[n - 1] = this.getvalue(trim, 6);
                }
                if (n >= 6 && this.il < 300) {
                    this.nttime[this.il] = this.contime(this.getLvalue(trim, 0));
                    final int getvalue = this.getvalue(trim, 1);
                    if (getvalue == 4) {
                        final int getvalue2 = this.getvalue(trim, 4);
                        if (getvalue2 <= 0) {
                            this.text[this.il] = "" + this.getSvalue(trim, 2) + " has joined clan " + this.getSvalue(trim, 3) + ".";
                        }
                        else {
                            final int getvalue3 = this.getvalue(trim, 5);
                            if (getvalue3 == getvalue2) {
                                this.text[this.il] = "" + this.getSvalue(trim, 2) + " got a new rank in clan " + this.getSvalue(trim, 3) + ".";
                            }
                            else {
                                String s2 = "promoted";
                                if (getvalue3 - getvalue2 < 0) {
                                    s2 = "demoted";
                                }
                                if (getvalue3 != 7) {
                                    this.text[this.il] = "" + this.getSvalue(trim, 2) + " has been " + s2 + " in clan " + this.getSvalue(trim, 3) + " to a level " + getvalue3 + " member.";
                                }
                                else {
                                    this.text[this.il] = "" + this.getSvalue(trim, 2) + " has been " + s2 + " in clan " + this.getSvalue(trim, 3) + " to Clan Admin!";
                                }
                            }
                        }
                        this.nln[this.il] = 2;
                        this.link[this.il][0][0] = this.getSvalue(trim, 2);
                        this.link[this.il][0][1] = "0|" + this.getSvalue(trim, 2) + "|";
                        this.link[this.il][1][0] = this.getSvalue(trim, 3);
                        this.link[this.il][1][1] = "1|" + this.getSvalue(trim, 3) + "|";
                        ++this.il;
                    }
                    if (getvalue == 5) {
                        final String svalue = this.getSvalue(trim, 2);
                        final String svalue2 = this.getSvalue(trim, 4);
                        String str = "left";
                        if (!svalue.toLowerCase().equals(svalue2.toLowerCase())) {
                            str = "been removed from";
                        }
                        this.text[this.il] = "" + svalue + " has " + str + " clan " + this.getSvalue(trim, 3) + ".";
                        this.nln[this.il] = 2;
                        this.link[this.il][0][0] = this.getSvalue(trim, 2);
                        this.link[this.il][0][1] = "0|" + this.getSvalue(trim, 2) + "|";
                        this.link[this.il][1][0] = this.getSvalue(trim, 3);
                        this.link[this.il][1][1] = "1|" + this.getSvalue(trim, 3) + "|";
                        ++this.il;
                    }
                    if (getvalue == 6) {
                        this.text[this.il] = "" + this.getSvalue(trim, 2) + " has updated clan " + this.getSvalue(trim, 3) + "'s web presence.";
                        this.nln[this.il] = 3;
                        this.link[this.il][0][0] = this.getSvalue(trim, 2);
                        this.link[this.il][0][1] = "0|" + this.getSvalue(trim, 2) + "|";
                        this.link[this.il][1][0] = this.getSvalue(trim, 3);
                        this.link[this.il][1][1] = "1|" + this.getSvalue(trim, 3) + "|";
                        this.link[this.il][2][0] = "web presence";
                        this.link[this.il][2][1] = "2|" + this.getSvalue(trim, 3) + "|";
                        ++this.il;
                    }
                    if (getvalue == 7 && s.indexOf("#" + this.getSvalue(trim, 4) + "#") == -1) {
                        this.text[this.il] = "" + this.getSvalue(trim, 2) + " has added car " + this.getSvalue(trim, 4) + " to clan " + this.getSvalue(trim, 3) + ".";
                        this.nln[this.il] = 3;
                        this.link[this.il][0][0] = this.getSvalue(trim, 2);
                        this.link[this.il][0][1] = "0|" + this.getSvalue(trim, 2) + "|";
                        this.link[this.il][1][0] = this.getSvalue(trim, 3);
                        this.link[this.il][1][1] = "1|" + this.getSvalue(trim, 3) + "|";
                        this.link[this.il][2][0] = this.getSvalue(trim, 4);
                        this.link[this.il][2][1] = "3|" + this.getSvalue(trim, 4) + "|" + this.getSvalue(trim, 3) + "|";
                        s = s + "#" + this.getSvalue(trim, 4) + "#";
                        ++this.il;
                    }
                    if (getvalue == 8 && s.indexOf("#" + this.getSvalue(trim, 4) + "#") == -1) {
                        String str2 = this.getSvalue(trim, 4);
                        if (str2.length() > 20) {
                            str2 = "" + str2.substring(0, 20) + "...";
                        }
                        this.text[this.il] = "" + this.getSvalue(trim, 2) + " has added stage " + str2 + " to clan " + this.getSvalue(trim, 3) + ".";
                        this.nln[this.il] = 3;
                        this.link[this.il][0][0] = this.getSvalue(trim, 2);
                        this.link[this.il][0][1] = "0|" + this.getSvalue(trim, 2) + "|";
                        this.link[this.il][1][0] = this.getSvalue(trim, 3);
                        this.link[this.il][1][1] = "1|" + this.getSvalue(trim, 3) + "|";
                        this.link[this.il][2][0] = str2;
                        this.link[this.il][2][1] = "4|" + this.getSvalue(trim, 4) + "|" + this.getSvalue(trim, 3) + "|";
                        s = s + "#" + this.getSvalue(trim, 4) + "#";
                        ++this.il;
                    }
                    if (getvalue == 9) {
                        final String svalue3 = this.getSvalue(trim, 2);
                        if (svalue3.startsWith("War")) {
                            this.text[this.il] = "Clans " + this.getSvalue(trim, 7) + " & " + this.getSvalue(trim, 8) + " have now started a war!";
                            this.nln[this.il] = 2;
                            this.link[this.il][0][0] = this.getSvalue(trim, 7);
                            this.link[this.il][0][1] = "1|" + this.getSvalue(trim, 7) + "|";
                            this.link[this.il][1][0] = this.getSvalue(trim, 8);
                            this.link[this.il][1][1] = "1|" + this.getSvalue(trim, 8) + "|";
                            ++this.il;
                        }
                        if (svalue3.startsWith("Car")) {
                            this.text[this.il] = "Clans " + this.getSvalue(trim, 7) + " & " + this.getSvalue(trim, 8) + " have started a car battle!";
                            this.nln[this.il] = 2;
                            this.link[this.il][0][0] = this.getSvalue(trim, 7);
                            this.link[this.il][0][1] = "1|" + this.getSvalue(trim, 7) + "|";
                            this.link[this.il][1][0] = this.getSvalue(trim, 8);
                            this.link[this.il][1][1] = "1|" + this.getSvalue(trim, 8) + "|";
                            ++this.il;
                            if (this.il < 300) {
                                this.text[this.il] = "Battle over cars: [" + this.getSvalue(trim, 4) + "] & [" + this.getSvalue(trim, 5) + "]";
                                this.nln[this.il] = 2;
                                this.link[this.il][0][0] = this.getSvalue(trim, 4);
                                this.link[this.il][0][1] = "3|" + this.getSvalue(trim, 4) + "|" + this.getSvalue(trim, 8) + "|";
                                this.link[this.il][1][0] = this.getSvalue(trim, 5);
                                this.link[this.il][1][1] = "3|" + this.getSvalue(trim, 5) + "|" + this.getSvalue(trim, 7) + "|";
                                this.nttime[this.il] = "";
                                ++this.il;
                            }
                        }
                        if (svalue3.startsWith("Stage")) {
                            String str3 = this.getSvalue(trim, 4);
                            if (str3.length() > 20) {
                                str3 = "" + str3.substring(0, 20) + "...";
                            }
                            String str4 = this.getSvalue(trim, 5);
                            if (str4.length() > 20) {
                                str4 = "" + str4.substring(0, 20) + "...";
                            }
                            this.text[this.il] = "Clans " + this.getSvalue(trim, 7) + " & " + this.getSvalue(trim, 8) + " have started a stage battle!";
                            this.nln[this.il] = 2;
                            this.link[this.il][0][0] = this.getSvalue(trim, 7);
                            this.link[this.il][0][1] = "1|" + this.getSvalue(trim, 7) + "|";
                            this.link[this.il][1][0] = this.getSvalue(trim, 8);
                            this.link[this.il][1][1] = "1|" + this.getSvalue(trim, 8) + "|";
                            ++this.il;
                            if (this.il < 300) {
                                this.text[this.il] = "Battle over stages: [" + str3 + "] & [" + str4 + "]";
                                this.nln[this.il] = 2;
                                this.link[this.il][0][0] = str3;
                                this.link[this.il][0][1] = "4|" + this.getSvalue(trim, 4) + "|" + this.getSvalue(trim, 8) + "|";
                                this.link[this.il][1][0] = str4;
                                this.link[this.il][1][1] = "4|" + this.getSvalue(trim, 5) + "|" + this.getSvalue(trim, 7) + "|";
                                this.nttime[this.il] = "";
                                ++this.il;
                            }
                        }
                    }
                    if (getvalue == 10 || getvalue == 11 || getvalue == 12 || getvalue == 13) {
                        if (getvalue == 11) {
                            this.text[this.il] = "" + this.getSvalue(trim, 2) + " has re-claimed its title as clan wars world champion!";
                        }
                        else {
                            this.text[this.il] = "" + this.getSvalue(trim, 2) + " has now become the new clan wars world champion!";
                        }
                        this.nln[this.il] = 2;
                        this.link[this.il][0][0] = this.getSvalue(trim, 2);
                        this.link[this.il][0][1] = "1|" + this.getSvalue(trim, 2) + "|";
                        this.link[this.il][1][0] = "clan wars world champion";
                        this.link[this.il][1][1] = "5|championship|";
                        if (this.getSvalue(trim, 2).equals("")) {
                            this.text[this.il] = "No one is currently the clan wars world champion!";
                            this.nln[this.il] = 1;
                            this.link[this.il][0][0] = "clan wars world champion";
                            this.link[this.il][0][1] = "5|championship|";
                        }
                        ++this.il;
                        if (getvalue == 10) {
                            this.text[this.il] = "" + this.getSvalue(trim, 2) + " recent win against " + this.getSvalue(trim, 4) + " has given it the championship title!";
                        }
                        if (getvalue == 11) {
                            this.text[this.il] = "" + this.getSvalue(trim, 2) + " has successfully defended its championship title against " + this.getSvalue(trim, 4) + "!";
                        }
                        if (getvalue == 12) {
                            this.text[this.il] = "A recent war between " + this.getSvalue(trim, 3) + " and " + this.getSvalue(trim, 4) + " has resulted in a change of points!";
                        }
                        if (getvalue == 13) {
                            this.text[this.il] = "Clan " + this.getSvalue(trim, 3) + " removed itself from the game which resulted in a change of points!";
                        }
                        this.nttime[this.il] = "";
                        this.nln[this.il] = 0;
                        ++this.il;
                    }
                }
                ++n;
            }
            dataInputStream.close();
            this.spos6 = 0;
            this.loadednews = 1;
        }
        catch (final Exception ex) {
            this.loadednews = -1;
        }
    }
    
    public void loadchamps() {
        this.eng = -1;
        this.engo = 0;
        if (this.maxclans <= 0) {
            this.maxclans = 1000;
        }
        this.ncc = 0;
        this.champ = -1;
        int leadsby = 0;
        this.conclan = new String[this.maxclans];
        this.totp = new int[this.maxclans];
        this.nvc = new int[this.maxclans];
        this.points = new int[this.maxclans][this.maxclans];
        this.verclan = new String[this.maxclans][this.maxclans];
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/interact/clanstat.txt?req=" + (int)(Math.random() * 1000.0) + "");
            url.openConnection().setConnectTimeout(2000);
            final DataInputStream dataInputStream = new DataInputStream(url.openStream());
            String line;
            while ((line = dataInputStream.readLine()) != null && this.ncc < this.maxclans) {
                this.conclan[this.ncc] = this.getSvalue(line, 0);
                if (!this.conclan[this.ncc].equals("")) {
                    this.totp[this.ncc] = 0;
                    this.nvc[this.ncc] = 0;
                    for (int n = this.getpvalue(line, 1); n != 0 && this.nvc[this.ncc] < this.maxclans; n = this.getpvalue(line, 1 + this.nvc[this.ncc] * 2)) {
                        final int[] totp = this.totp;
                        final int ncc = this.ncc;
                        totp[ncc] += n;
                        this.points[this.ncc][this.nvc[this.ncc]] = n;
                        this.verclan[this.ncc][this.nvc[this.ncc]] = this.getSvalue(line, 2 + this.nvc[this.ncc] * 2);
                        final int[] nvc = this.nvc;
                        final int ncc2 = this.ncc;
                        ++nvc[ncc2];
                    }
                    if (this.totp[this.ncc] >= leadsby && this.totp[this.ncc] >= 3) {
                        if (this.totp[this.ncc] == leadsby) {
                            this.champ = -2;
                        }
                        else {
                            leadsby = this.totp[this.ncc];
                            this.champ = this.ncc;
                        }
                    }
                    ++this.ncc;
                }
            }
            dataInputStream.close();
            this.ord = new int[this.ncc];
            final int[] array = new int[this.ncc];
            this.leadsby = leadsby;
            for (int i = 0; i < this.ncc; ++i) {
                if (i != this.champ && leadsby - this.totp[i] < this.leadsby) {
                    this.leadsby = leadsby - this.totp[i];
                }
                array[i] = 0;
            }
            for (int j = 0; j < this.ncc; ++j) {
                for (int k = j + 1; k < this.ncc; ++k) {
                    if (this.totp[j] < this.totp[k]) {
                        final int[] array2 = array;
                        final int n2 = j;
                        ++array2[n2];
                    }
                    else {
                        final int[] array3 = array;
                        final int n3 = k;
                        ++array3[n3];
                    }
                }
                this.ord[array[j]] = j;
            }
            this.spos6 = 0;
            this.loadwstat = 1;
        }
        catch (final Exception obj) {
            if (("" + obj).indexOf("java.io.FileNotFoundException") != -1) {
                this.loadwstat = 1;
            }
            else {
                this.loadwstat = -1;
            }
        }
    }
    
    public String contime(final long n) {
        String s = "";
        if (n != -1L) {
            try {
                final long n2 = this.ntime - n;
                if (n2 >= 1000L && n2 < 60000L) {
                    s = "seconds ago";
                }
                if (n2 >= 60000L && n2 < 3600000L) {
                    final int i = (int)(n2 / 60000L);
                    String str = "s";
                    if (i == 1) {
                        str = "";
                    }
                    s = "" + i + " minute" + str + " ago";
                }
                if (n2 >= 3600000L && n2 < 86400000L) {
                    final int j = (int)(n2 / 3600000L);
                    String str2 = "s";
                    if (j == 1) {
                        str2 = "";
                    }
                    s = "" + j + " hour" + str2 + " ago";
                }
                if (n2 >= 86400000L) {
                    final int k = (int)(n2 / 86400000L);
                    String str3 = "s";
                    if (k == 1) {
                        str3 = "";
                    }
                    s = "" + k + " day" + str3 + " ago";
                }
            }
            catch (final Exception ex) {
                s = "";
            }
        }
        return s;
    }
    
    public void tlink(final Graphics2D graphics2D, final int n, final int n2, final String s, final String s2, final int n3, final int n4, final boolean b, final int n5, final int n6, final int n7, final String s3, final String s4) {
        this.ftm = this.rdo.getFontMetrics();
        int n8 = 0;
        int n9 = 0;
        final int index = s.indexOf(s2);
        if (index != -1) {
            n8 = this.ftm.stringWidth(s.substring(0, index)) + n;
            n9 = n8 + this.ftm.stringWidth(s2) - 2;
        }
        this.rdo.drawLine(n8, n2 + 1, n9, n2 + 1);
        if (n3 > n8 + n5 && n3 < n9 + n5 && n4 > n2 - 11 + n6 && n4 < n2 + 1 + n6) {
            this.cur = 12;
            if (b) {
                if (n7 == 0) {
                    this.tab = 1;
                    if (!this.proname.equals(s3)) {
                        this.proname = s3;
                        this.loadedp = false;
                        this.onexitpro();
                    }
                }
                if (n7 == 1) {
                    if (!this.claname.equals(s3)) {
                        this.claname = s3;
                        this.loadedc = false;
                    }
                    this.spos5 = 0;
                    this.lspos5 = 0;
                    this.cfase = 3;
                    this.ctab = 0;
                    this.tab = 3;
                }
                if (n7 == 2) {
                    if (!this.claname.equals(s3)) {
                        this.claname = s3;
                        this.loadedc = false;
                    }
                    this.spos5 = 0;
                    this.lspos5 = 0;
                    this.cfase = 3;
                    this.loadedlink = false;
                    this.ctab = 4;
                    this.tab = 3;
                }
                if (n7 == 3) {
                    this.viewcar = s3;
                    if (!this.claname.equals(s4)) {
                        this.claname = s4;
                        this.loadedc = false;
                    }
                    this.spos5 = 0;
                    this.lspos5 = 0;
                    this.cfase = 3;
                    this.loadedcars = -1;
                    this.loadedcar = 0;
                    this.ctab = 2;
                    this.tab = 3;
                }
                if (n7 == 4) {
                    this.viewcar = s3;
                    if (!this.claname.equals(s4)) {
                        this.claname = s4;
                        this.loadedc = false;
                    }
                    this.spos5 = 0;
                    this.lspos5 = 0;
                    this.cfase = 3;
                    this.loadedstages = -1;
                    this.loadedstage = 0;
                    this.ctab = 3;
                    this.tab = 3;
                }
                if (n7 == 5) {
                    this.loadwstat = 0;
                    this.ntab = 1;
                }
            }
        }
    }
    
    public void loadwarb() {
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/clans/" + this.xt.clan + "/inter.txt?req=" + (int)(Math.random() * 1000.0) + "");
            url.openConnection().setConnectTimeout(2000);
            final String contentType = url.openConnection().getContentType();
            this.gs.warb.removeAll();
            this.gs.warb.add(this.rd, " Select  War / Battle");
            if (contentType.equals("text/plain")) {
                final DataInputStream dataInputStream = new DataInputStream(url.openStream());
                int n = 0;
                boolean b = false;
                String line;
                while ((line = dataInputStream.readLine()) != null && n < 100) {
                    final String trim = line.trim();
                    final String svalue = this.getSvalue(trim, 5);
                    if (svalue.equals("War")) {
                        this.gs.warb.addw(" War with " + this.getSvalue(trim, 0) + "", "" + this.getSvalue(trim, 6) + "|" + this.getSvalue(trim, 0) + "|");
                        b = true;
                    }
                    if (svalue.equals("Car Battle")) {
                        this.gs.warb.addw(" Car battle with " + this.getSvalue(trim, 0) + "", "" + this.getSvalue(trim, 6) + "|" + this.getSvalue(trim, 0) + "|");
                        b = true;
                    }
                    if (svalue.equals("Stage Battle")) {
                        this.gs.warb.addw(" Stage battle with " + this.getSvalue(trim, 0) + "", "" + this.getSvalue(trim, 6) + "|" + this.getSvalue(trim, 0) + "|");
                        b = true;
                    }
                    ++n;
                }
                dataInputStream.close();
                if (!b) {
                    this.gs.warb.removeAll();
                    this.gs.warb.add(this.rd, "Your clan has not started any new wars or battles.");
                }
            }
            else {
                this.gs.warb.removeAll();
                this.gs.warb.add(this.rd, "Your clan has not started any wars or battles yet.");
            }
        }
        catch (final Exception ex) {
            this.gs.warb.removeAll();
            this.gs.warb.add(this.rd, "Error occurred while loading, please try again later.");
        }
        this.gs.warb.select(0);
    }
    
    public void loadwgames() {
        this.canredo = false;
        this.gameturn = -1;
        this.lwbwinner = "";
        this.ascore = 0;
        this.vscore = 0;
        this.gs.pgame.removeAll();
        this.gs.pgame.add(this.rd, " Select Game");
        int n = 5;
        String str = "battle";
        this.warb = 2;
        if (this.gs.warb.sopts[this.gs.warb.sel].startsWith(" War with")) {
            n = 9;
            str = "war";
            this.warb = 1;
        }
        if (this.gs.warb.sopts[this.gs.warb.sel].startsWith(" Stage battle with")) {
            this.warb = 3;
        }
        this.warbnum = this.getSvalue(this.gs.warb.opts[this.gs.warb.sel], 0);
        this.vclan = this.getSvalue(this.gs.warb.opts[this.gs.warb.sel], 1);
        try {
            final URL url = new URL("http://multiplayer.needformadness.com/interact/" + str + "/" + this.warbnum + ".txt?req=" + (int)(Math.random() * 1000.0) + "");
            url.openConnection().setConnectTimeout(2000);
            if (url.openConnection().getContentType().equals("text/plain")) {
                DataInputStream dataInputStream;
                int gameturn;
                String line;
                String s;
                int intValue;
                String svalue;
                String str2;
                String s2;
                String substring;
                String str3;
                for (dataInputStream = new DataInputStream(url.openStream()), gameturn = 0; (line = dataInputStream.readLine()) != null && gameturn < n; ++gameturn) {
                    s = this.getSvalue(line, 0);
                    if (s.startsWith("#")) {
                        try {
                            intValue = Integer.valueOf(s.substring(1));
                        }
                        catch (final Exception ex) {
                            intValue = 1;
                        }
                        this.wbstage[gameturn] = intValue;
                        s = "NFM 1 - Stage " + intValue + "";
                        if (intValue > 10) {
                            s = "NFM 2 - Stage " + (intValue - 10) + "";
                        }
                        if (intValue > 27) {
                            s = "NFM Multiplayer - Stage " + (intValue - 27) + "";
                        }
                    }
                    else {
                        this.wbstage[gameturn] = 101;
                    }
                    this.wbstages[gameturn] = s;
                    this.wblaps[gameturn] = this.getvalue(line, 1);
                    this.wbcars[gameturn] = this.getvalue(line, 2);
                    this.wbclass[gameturn] = this.getvalue(line, 3);
                    this.wbfix[gameturn] = this.getvalue(line, 4);
                    svalue = this.getSvalue(line, 5);
                    str2 = "";
                    if (this.wbcars[gameturn] == 2) {
                        str2 = ",  Clan Cars";
                    }
                    if (this.wbcars[gameturn] == 3) {
                        str2 = ",  Game Cars";
                    }
                    if (this.wbclass[gameturn] == 1) {
                        str2 += ",  Class C";
                    }
                    if (this.wbclass[gameturn] == 2) {
                        str2 += ",  Class B & C";
                    }
                    if (this.wbclass[gameturn] == 3) {
                        str2 += ",  Class B";
                    }
                    if (this.wbclass[gameturn] == 4) {
                        str2 += ",  Class A & B";
                    }
                    if (this.wbclass[gameturn] == 5) {
                        str2 += ",  Class A";
                    }
                    s2 = "";
                    if (this.wbfix[gameturn] == 1) {
                        s2 = ",  4 Fixes";
                    }
                    if (this.wbfix[gameturn] == 2) {
                        s2 = ",  3 Fixes";
                    }
                    if (this.wbfix[gameturn] == 3) {
                        s2 = ",  2 Fixes";
                    }
                    if (this.wbfix[gameturn] == 4) {
                        s2 = ",  1 Fix";
                    }
                    if (this.wbfix[gameturn] == 5) {
                        s2 = ",  No Fixing";
                    }
                    this.rd.setFont(new Font("Arial", 1, 12));
                    this.ftm = this.rd.getFontMetrics();
                    for (substring = this.wbstages[gameturn], str3 = "Game #" + (gameturn + 1) + ":  " + substring + "" + str2 + "" + s2 + ",  " + this.wblaps[gameturn] + " Laps"; this.ftm.stringWidth(str3) > 400; str3 = "Game #" + (gameturn + 1) + ":  " + substring + "..." + str2 + "" + s2 + ",  " + this.wblaps[gameturn] + " Laps") {
                        substring = substring.substring(0, substring.length() - 1);
                    }
                    if (this.gameturn == -1) {
                        if (svalue.equals("") || svalue.equals("#redo#")) {
                            if (!svalue.equals("#redo#") && gameturn > 0) {
                                this.canredo = true;
                            }
                            this.gameturn = gameturn;
                            this.gameturndisp = str3;
                        }
                        else {
                            if (svalue.toLowerCase().equals(this.xt.clan.toLowerCase())) {
                                ++this.ascore;
                            }
                            if (svalue.toLowerCase().equals(this.vclan.toLowerCase())) {
                                ++this.vscore;
                            }
                            this.lwbwinner = svalue;
                        }
                    }
                    this.gs.pgame.add(this.rd, " " + str3 + "");
                }
                dataInputStream.close();
                if (gameturn != 0) {
                    this.loadwbgames = 2;
                }
                else {
                    this.loadwbgames = 3;
                }
            }
            else {
                this.loadwbgames = 4;
            }
        }
        catch (final Exception ex2) {
            this.loadwbgames = 3;
        }
    }
    
    public void redogame() {
        try {
            this.socket = new Socket(this.lg.servers[0], 7061);
            this.din = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            (this.dout = new PrintWriter(this.socket.getOutputStream(), true)).println("101|43|" + this.warb + "|" + this.warbnum + "|");
            if (!this.din.readLine().equals("OK")) {
                this.loadwbgames = 6;
            }
            this.socket.close();
            this.socket = null;
            this.din.close();
            this.din = null;
            this.dout.close();
            this.dout = null;
        }
        catch (final Exception ex) {
            this.loadwbgames = 6;
        }
        if (this.loadwbgames != 6) {
            this.loadwgames();
        }
    }
    
    public boolean drawbutton(final Image image, final int n, final int n2, final int n3, final int n4, final boolean b) {
        boolean b2 = false;
        boolean b3 = false;
        final int width = image.getWidth(this.ob);
        if (Math.abs(n3 - n) < width / 2 + 12 && Math.abs(n4 - n2) < 14 && b) {
            b3 = true;
        }
        if (Math.abs(n3 - n) < width / 2 + 12 && Math.abs(n4 - n2) < 14 && this.gs.mouses <= -1) {
            b2 = true;
            this.gs.mouses = 0;
        }
        if (!b3) {
            this.rd.drawImage(image, n - width / 2, n2 - image.getHeight(this.ob) / 2, null);
            this.rd.drawImage(this.xt.bols, n - width / 2 - 15, n2 - 13, null);
            this.rd.drawImage(this.xt.bors, n + width / 2 + 9, n2 - 13, null);
            this.rd.drawImage(this.xt.bot, n - width / 2 - 9, n2 - 13, width + 18, 3, null);
            this.rd.drawImage(this.xt.bob, n - width / 2 - 9, n2 + 10, width + 18, 3, null);
        }
        else {
            this.rd.drawImage(image, n - width / 2 + 1, n2 - image.getHeight(this.ob) / 2 + 1, null);
            this.rd.drawImage(this.xt.bolps, n - width / 2 - 15, n2 - 13, null);
            this.rd.drawImage(this.xt.borps, n + width / 2 + 9, n2 - 13, null);
            this.rd.drawImage(this.xt.bob, n - width / 2 - 9, n2 - 13, width + 18, 3, null);
            this.rd.drawImage(this.xt.bot, n - width / 2 - 9, n2 + 10, width + 18, 3, null);
        }
        return b2;
    }
    
    public boolean stringbutton(final Graphics2D graphics2D, final String str, final int n, final int n2, int n3, final int n4, final int n5, final boolean b, final int n6, final int n7) {
        boolean b2 = false;
        boolean b3 = false;
        graphics2D.setFont(new Font("Arial", 1, 12));
        this.ftm = graphics2D.getFontMetrics();
        if (n3 == 6) {
            graphics2D.setFont(new Font("Arial", 1, 11));
            this.ftm = graphics2D.getFontMetrics();
        }
        final int stringWidth = this.ftm.stringWidth(str);
        if (Math.abs(n4 - n6 - n) < stringWidth / 2 + 12 && Math.abs(n5 - n7 - n2) < 14 && b) {
            b3 = true;
        }
        if (Math.abs(n4 - n6 - n) < stringWidth / 2 + 12 && Math.abs(n5 - n7 - n2) < 14 && this.gs.mouses <= -1 && this.blocknote == 0 && this.blockb == 0 && !this.gs.openm && (this.editc == 0 || n6 == 0)) {
            b2 = true;
            this.gs.mouses = 0;
        }
        if (this.blocknote != 0) {
            --this.blocknote;
        }
        boolean b4 = false;
        if (n3 < 0) {
            n3 *= -1;
            b4 = true;
        }
        if (b4) {
            this.rdo.setComposite(AlphaComposite.getInstance(3, 0.7f));
        }
        if (!b3) {
            graphics2D.setColor(this.colorb2k(b4, 220, 220, 220));
            graphics2D.fillRect(n - stringWidth / 2 - 10, n2 - (17 - n3), stringWidth + 20, 25 - n3 * 2);
            graphics2D.setColor(this.colorb2k(b4, 240, 240, 240));
            graphics2D.drawLine(n - stringWidth / 2 - 10, n2 - (17 - n3), n + stringWidth / 2 + 10, n2 - (17 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 10, n2 - (18 - n3), n + stringWidth / 2 + 10, n2 - (18 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 9, n2 - (19 - n3), n + stringWidth / 2 + 9, n2 - (19 - n3));
            graphics2D.setColor(this.colorb2k(b4, 200, 200, 200));
            graphics2D.drawLine(n + stringWidth / 2 + 10, n2 - (17 - n3), n + stringWidth / 2 + 10, n2 + (7 - n3));
            graphics2D.drawLine(n + stringWidth / 2 + 11, n2 - (17 - n3), n + stringWidth / 2 + 11, n2 + (7 - n3));
            graphics2D.drawLine(n + stringWidth / 2 + 12, n2 - (16 - n3), n + stringWidth / 2 + 12, n2 + (6 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 10, n2 + (7 - n3), n + stringWidth / 2 + 10, n2 + (7 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 10, n2 + (8 - n3), n + stringWidth / 2 + 10, n2 + (8 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 9, n2 + (9 - n3), n + stringWidth / 2 + 9, n2 + (9 - n3));
            graphics2D.setColor(this.colorb2k(b4, 240, 240, 240));
            graphics2D.drawLine(n - stringWidth / 2 - 10, n2 - (17 - n3), n - stringWidth / 2 - 10, n2 + (7 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 11, n2 - (17 - n3), n - stringWidth / 2 - 11, n2 + (7 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 12, n2 - (16 - n3), n - stringWidth / 2 - 12, n2 + (6 - n3));
            if (b4) {
                this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
            }
            graphics2D.setColor(new Color(0, 0, 0));
            graphics2D.drawString(str, n - stringWidth / 2, n2);
        }
        else {
            graphics2D.setColor(this.colorb2k(b4, 210, 210, 210));
            graphics2D.fillRect(n - stringWidth / 2 - 10, n2 - (17 - n3), stringWidth + 20, 25 - n3 * 2);
            graphics2D.setColor(this.colorb2k(b4, 200, 200, 200));
            graphics2D.drawLine(n - stringWidth / 2 - 10, n2 - (17 - n3), n + stringWidth / 2 + 10, n2 - (17 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 10, n2 - (18 - n3), n + stringWidth / 2 + 10, n2 - (18 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 9, n2 - (19 - n3), n + stringWidth / 2 + 9, n2 - (19 - n3));
            graphics2D.drawLine(n + stringWidth / 2 + 10, n2 - (17 - n3), n + stringWidth / 2 + 10, n2 + (7 - n3));
            graphics2D.drawLine(n + stringWidth / 2 + 11, n2 - (17 - n3), n + stringWidth / 2 + 11, n2 + (7 - n3));
            graphics2D.drawLine(n + stringWidth / 2 + 12, n2 - (16 - n3), n + stringWidth / 2 + 12, n2 + (6 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 10, n2 + (7 - n3), n + stringWidth / 2 + 10, n2 + (7 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 10, n2 + (8 - n3), n + stringWidth / 2 + 10, n2 + (8 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 9, n2 + (9 - n3), n + stringWidth / 2 + 9, n2 + (9 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 10, n2 - (17 - n3), n - stringWidth / 2 - 10, n2 + (7 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 11, n2 - (17 - n3), n - stringWidth / 2 - 11, n2 + (7 - n3));
            graphics2D.drawLine(n - stringWidth / 2 - 12, n2 - (16 - n3), n - stringWidth / 2 - 12, n2 + (6 - n3));
            if (b4) {
                this.rdo.setComposite(AlphaComposite.getInstance(3, 1.0f));
            }
            graphics2D.setColor(new Color(0, 0, 0));
            graphics2D.drawString(str, n - stringWidth / 2 + 1, n2);
        }
        return b2;
    }
    
    public Color color2k(final int r, final int g, final int b) {
        final Color color = new Color(r, g, b);
        final float[] hsbvals = new float[3];
        Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), hsbvals);
        hsbvals[0] = 0.13f;
        hsbvals[1] = 0.35f;
        return Color.getHSBColor(hsbvals[0], hsbvals[1], hsbvals[2]);
    }
    
    public Color colorb2k(final boolean b, final int r, final int g, final int b2) {
        final Color color = new Color(r, g, b2);
        Color hsbColor;
        if (!b) {
            final float[] hsbvals = new float[3];
            Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), hsbvals);
            hsbvals[0] = 0.13f;
            hsbvals[1] = 0.35f;
            if (this.darker) {
                final float[] array = hsbvals;
                final int n = 2;
                array[n] *= 0.9f;
            }
            hsbColor = Color.getHSBColor(hsbvals[0], hsbvals[1], hsbvals[2]);
        }
        else {
            hsbColor = new Color((int)(r * 0.9f), (int)(g * 0.9f), (int)(b2 * 0.9f));
        }
        return hsbColor;
    }
    
    public int getvalue(final String s, final int n) {
        int intValue = -1;
        try {
            int index = 0;
            int n2 = 0;
            int n3 = 0;
            String string = "";
            while (index < s.length() && n3 != 2) {
                final String string2 = "" + s.charAt(index);
                if (string2.equals("|")) {
                    ++n2;
                    if (n3 == 1 || n2 > n) {
                        n3 = 2;
                    }
                }
                else if (n2 == n) {
                    string += string2;
                    n3 = 1;
                }
                ++index;
            }
            if (string.equals("")) {
                string = "-1";
            }
            intValue = Integer.valueOf(string);
        }
        catch (final Exception ex) {}
        return intValue;
    }
    
    public String getSvalue(final String s, final int n) {
        String s2 = "";
        try {
            int index = 0;
            int n2 = 0;
            int n3 = 0;
            String string = "";
            while (index < s.length() && n3 != 2) {
                final String string2 = "" + s.charAt(index);
                if (string2.equals("|")) {
                    ++n2;
                    if (n3 == 1 || n2 > n) {
                        n3 = 2;
                    }
                }
                else if (n2 == n) {
                    string += string2;
                    n3 = 1;
                }
                ++index;
            }
            s2 = string;
        }
        catch (final Exception ex) {}
        return s2;
    }
    
    public long getLvalue(final String s, final int n) {
        long longValue = -1L;
        try {
            int index = 0;
            int n2 = 0;
            int n3 = 0;
            String string = "";
            while (index < s.length() && n3 != 2) {
                final String string2 = "" + s.charAt(index);
                if (string2.equals("|")) {
                    ++n2;
                    if (n3 == 1 || n2 > n) {
                        n3 = 2;
                    }
                }
                else if (n2 == n) {
                    string += string2;
                    n3 = 1;
                }
                ++index;
            }
            if (string.equals("")) {
                string = "-1";
            }
            longValue = Long.valueOf(string);
        }
        catch (final Exception ex) {}
        return longValue;
    }
    
    public int getpvalue(final String s, final int n) {
        int intValue = 0;
        try {
            int index = 0;
            int n2 = 0;
            int n3 = 0;
            String string = "";
            while (index < s.length() && n3 != 2) {
                final String string2 = "" + s.charAt(index);
                if (string2.equals("|")) {
                    ++n2;
                    if (n3 == 1 || n2 > n) {
                        n3 = 2;
                    }
                }
                else if (n2 == n) {
                    string += string2;
                    n3 = 1;
                }
                ++index;
            }
            if (string.equals("")) {
                string = "0";
            }
            intValue = Integer.valueOf(string);
        }
        catch (final Exception ex) {}
        return intValue;
    }
    
    public int getfuncvalue(final String s, final String s2, final int n) {
        int n2 = 0;
        String string = "";
        for (int i = s.length() + 1; i < s2.length(); ++i) {
            final String string2 = "" + s2.charAt(i);
            if (string2.equals(",") || string2.equals(")")) {
                ++n2;
                ++i;
            }
            if (n2 == n) {
                string += s2.charAt(i);
            }
        }
        return Float.valueOf(string).intValue();
    }
    
    public String getfuncSvalue(final String s, final String s2, final int n) {
        String string = "";
        for (int n2 = 0, index = s.length() + 1; index < s2.length() && n2 <= n; ++index) {
            final String string2 = "" + s2.charAt(index);
            if (string2.equals(",") || string2.equals(")")) {
                ++n2;
            }
            else if (n2 == n) {
                string += string2;
            }
        }
        return string;
    }
}
