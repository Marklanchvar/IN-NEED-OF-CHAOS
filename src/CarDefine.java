import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.net.URL;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;

public class CarDefine implements Runnable
{
	Trackers t;
	GameSparker gs;
	ArrayList<ContO> bco;
	Medium m;
	Thread carloader;
	Thread actionloader;
	Thread stageaction;
	ArrayList<int[]> swits = new ArrayList<>();
	ArrayList<float[]> acelf = new ArrayList<>();
	ArrayList<Integer> handb = new ArrayList<>();
	ArrayList<Float> airs = new ArrayList<>();
	ArrayList<Integer> airc = new ArrayList<>();
	ArrayList<Integer> turn = new ArrayList<>();
	ArrayList<Float> grip = new ArrayList<>();
	ArrayList<Float> bounce = new ArrayList<>();
	ArrayList<Float> simag = new ArrayList<>();
	ArrayList<Float> moment = new ArrayList<>();
	ArrayList<Float> comprad = new ArrayList<>();
	ArrayList<Integer> push = new ArrayList<>();
	ArrayList<Integer> revpush = new ArrayList<>();
	ArrayList<Integer> lift = new ArrayList<>();
	ArrayList<Integer> revlift = new ArrayList<>();
	ArrayList<Integer> powerloss = new ArrayList<>();
	ArrayList<Float> flipy = new ArrayList<>();
	ArrayList<Integer> msquash = new ArrayList<>();
	ArrayList<Integer> clrad = new ArrayList<>();
	ArrayList<Float> dammult = new ArrayList<>();
	ArrayList<Integer> maxmag = new ArrayList<>();
	ArrayList<Float> dishandle = new ArrayList<>();
	ArrayList<Float> outdam = new ArrayList<>();
	ArrayList<Integer> cclass = new ArrayList<>();
	ArrayList<String> names = new ArrayList<>();
	ArrayList<Integer> enginsignature = new ArrayList<>();
	int lastload;
	int nlcars;
	int nlocars;
	int xnlocars;
	ArrayList<Boolean> include;
	ArrayList<String> createdby;
	ArrayList<Integer> publish;
	String[] loadnames;
	int nl;
	int action;
	boolean carlon;
	int reco;
	int[] lcardate;
	int haltload;
	int onloadingcar;
	int ac;
	String acname;
	String fails;
	String tnickey;
	String tclan;
	String tclankey;
	int loadlist;
	int[] adds;
	String viewname;
	int staction;
	String onstage;
	int inslot;
	int roundslot;
	String lastcar;
	int msloaded;
	int[] top20adds;

	public CarDefine(final ArrayList<ContO> array, final Medium m, final Trackers t, final GameSparker gs) {
		this.swits = new ArrayList<>();
		this.swits.add(new int[]{50,185,282});
		this.swits.add(new int[]{100,200,310});
		this.swits.add(new int[]{60,180,275});
		this.swits.add(new int[]{76,195,298});
		this.swits.add(new int[]{70,170,275});
		this.swits.add(new int[]{70,202,293});
		this.swits.add(new int[]{60,170,289});
		this.swits.add(new int[]{70,206,291});
		this.swits.add(new int[]{90,210,295});
		this.swits.add(new int[]{90,190,276});
		this.swits.add(new int[]{70,200,295});
		this.swits.add(new int[]{50,160,270});
		this.swits.add(new int[]{90,200,305});
		this.swits.add(new int[]{50,130,210});
		this.swits.add(new int[]{80,200,300});
		this.swits.add(new int[]{70,210,290});

		this.acelf = new ArrayList<>();
		this.acelf.add(new float[]{11.0f,5.0f,3.0f});
		this.acelf.add(new float[]{14.0f,7.0f,5.0f});
		this.acelf.add(new float[]{10.0f,5.0f,3.5f});
		this.acelf.add(new float[]{11.0f,6.0f,3.5f});
		this.acelf.add(new float[]{10.0f,5.0f,3.5f});
		this.acelf.add(new float[]{12.0f,6.0f,3.0f});
		this.acelf.add(new float[]{7.0f,9.0f,4.0f});
		this.acelf.add(new float[]{11.0f,5.0f,3.0f});
		this.acelf.add(new float[]{12.0f,7.0f,4.0f});
		this.acelf.add(new float[]{12.0f,7.0f,3.5f});
		this.acelf.add(new float[]{11.5f,6.5f,3.5f});
		this.acelf.add(new float[]{9.0f,5.0f,3.0f});
		this.acelf.add(new float[]{13.0f,7.0f,4.5f});
		this.acelf.add(new float[]{7.5f,3.5f,3.0f});
		this.acelf.add(new float[]{11.0f,7.5f,4.0f});
		this.acelf.add(new float[]{12.0f,6.0f,3.5f});

		this.handb = new ArrayList<>();
		this.handb.addAll(Arrays.asList(7,10,7,15,12,8,9,10,5,7,8,10,8,12,7,7));

		this.airs = new ArrayList<>();
		this.airs.addAll(Arrays.asList(1.0f,1.2f,0.95f,1.0f,2.2f,1.0f,0.9f,0.8f,1.0f,0.9f,1.15f,0.8f,1.0f,0.3f,1.3f,1.0f));

		this.airc = new ArrayList<>();
		this.airc.addAll(Arrays.asList(70,30,40,40,30,50,40,90,40,50,75,10,50,0,100,60));

		this.turn = new ArrayList<>();
		this.turn.addAll(Arrays.asList(6,9,5,7,8,7,5,5,9,7,7,4,6,5,7,6));

		this.grip = new ArrayList<>();
		this.grip.addAll(Arrays.asList(20.0f,27.0f,18.0f,22.0f,19.0f,20.0f,25.0f,20.0f,19.0f,24.0f,22.5f,25.0f,30.0f,27.0f,25.0f,27.0f));

		this.bounce = new ArrayList<>();
		this.bounce.addAll(Arrays.asList(1.2f,1.05f,1.3f,1.15f,1.3f,1.2f,1.15f,1.1f,1.2f,1.1f,1.15f,0.8f,1.05f,0.8f,1.1f,1.15f));

		this.simag = new ArrayList<>();
		this.simag.addAll(Arrays.asList(0.9f,0.85f,1.05f,0.9f,0.85f,0.9f,1.05f,0.9f,1.0f,1.05f,0.9f,1.1f,0.9f,1.3f,0.9f,1.15f));

		this.moment = new ArrayList<>();
		this.moment.addAll(Arrays.asList(1.3f,0.75f,1.4f,1.2f,1.1f,1.38f,1.43f,1.48f,1.35f,1.7f,1.42f,2.0f,1.26f,3.0f,1.5f,2.0f));

		this.comprad = new ArrayList<>();
		this.comprad.addAll(Arrays.asList(0.5f,0.4f,0.8f,0.5f,0.4f,0.5f,0.5f,0.5f,0.5f,0.8f,0.5f,1.5f,0.5f,0.8f,0.5f,0.8f));

		this.push = new ArrayList<>();
		this.push.addAll(Arrays.asList(2,2,3,3,2,2,2,4,2,2,2,4,2,2,2,2));

		this.revpush = new ArrayList<>();
		this.revpush.addAll(Arrays.asList(2,3,2,2,2,2,2,1,2,1,2,1,2,2,2,1));

		this.lift = new ArrayList<>();
		this.lift.addAll(Arrays.asList(0,30,0,20,0,30,0,0,20,0,0,0,10,0,30,0));

		this.revlift = new ArrayList<>();
		this.revlift.addAll(Arrays.asList(0,0,15,0,0,0,0,0,0,0,0,0,0,0,0,32));

		this.powerloss = new ArrayList<>();
		this.powerloss.addAll(Arrays.asList(2500000,2500000,3500000,2500000,4000000,2500000,3200000,3200000,2750000,5500000,2750000,4500000,3500000,16700000,3000000,5500000));

		this.flipy = new ArrayList<>();
		this.flipy.addAll(Arrays.asList(-50f,-60f,-92f,-44f,-60f,-57f,-54f,-60f,-77f,-57f,-82f,-85f,-28f,-100f,-63f,-127f));

		this.msquash = new ArrayList<>();
		this.msquash.addAll(Arrays.asList(7,4,7,2,8,4,6,4,3,8,4,10,3,20,3,8));

		this.clrad = new ArrayList<>();
		this.clrad.addAll(Arrays.asList(3300,1700,4700,3000,2000,4500,3500,5000,10000,15000,4000,7000,10000,15000,5500,5000));

		this.dammult = new ArrayList<>();
		this.dammult.addAll(Arrays.asList(0.75f,0.8f,0.45f,0.8f,0.42f,0.7f,0.72f,0.6f,0.58f,0.41f,0.67f,0.45f,0.61f,0.25f,0.38f,0.52f));

		this.maxmag = new ArrayList<>();
		this.maxmag.addAll(Arrays.asList(7600,4200,7200,6000,6000,15000,17200,17000,18000,11000,19000,10700,13000,45000,5800,18000));

		this.dishandle = new ArrayList<>();
		this.dishandle.addAll(Arrays.asList(0.65f,0.6f,0.55f,0.77f,0.62f,0.9f,0.6f,0.72f,0.45f,0.8f,0.95f,0.4f,0.87f,0.42f,1.0f,0.95f));

		this.outdam = new ArrayList<>();
		this.outdam.addAll(Arrays.asList(0.68f,0.35f,0.8f,0.5f,0.42f,0.76f,0.82f,0.76f,0.72f,0.62f,0.79f,0.95f,0.77f,1.0f,0.85f,1.0f));

		this.cclass = new ArrayList<>();
		this.cclass.addAll(Arrays.asList(0,0,0,0,0,1,2,2,2,2,3,4,4,4,4,4));

		this.names = new ArrayList<>();
		this.names.addAll(Arrays.asList("Tornado Shark","Formula 7","Wow Caninaro","La Vita Crab","Nimi","MAX Revenge","Lead Oxide","Kool Kat","Drifter X","Sword of Justice","High Rider","EL KING","Mighty Eight","M A S H E E N","Radical One","DR Monstaa"));

		this.enginsignature = new ArrayList<>();
		this.enginsignature.addAll(Arrays.asList(0,1,2,1,0,3,2,2,1,0,3,4,1,4,0,3));
		this.lastload = 0;
		this.nlcars = 0;
		this.nlocars = 0;
		this.xnlocars = 0;
		this.include = new ArrayList<Boolean>();
		this.createdby = new ArrayList<String>();
		this.publish = new ArrayList<Integer>();
		this.loadnames = new String[20];
		this.nl = 0;
		this.action = 0;
		this.carlon = false;
		this.reco = -2;
		this.lcardate = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		this.haltload = 0;
		this.onloadingcar = 0;
		this.ac = -1;
		this.acname = "Radical One";
		this.fails = "";
		this.tnickey = "";
		this.tclan = "";
		this.tclankey = "";
		this.loadlist = 0;
		this.adds = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		this.viewname = "";
		this.staction = 0;
		this.onstage = "";
		this.inslot = -1;
		this.roundslot = 0;
		this.lastcar = "";
		this.msloaded = 0;
		this.top20adds = new int[20];
		this.bco = array;
		this.m = m;
		this.t = t;
		this.gs = gs;
	}
	
	/** Expand all parallel car-stat lists (and bco) so that index n is valid. */
	private void ensureCarSlot(final int n) {
		if (n < 16) {
			return;
		}
		while (this.bco.size() <= n) {
			this.bco.add(null);
		}
		while (this.swits.size() <= n) {
			this.swits.add(new int[]{50, 185, 282});
		}
		while (this.acelf.size() <= n) {
			this.acelf.add(new float[]{11.0f, 5.0f, 3.0f});
		}
		while (this.handb.size() <= n) {
			this.handb.add(7);
		}
		while (this.airs.size() <= n) {
			this.airs.add(1.0f);
		}
		while (this.airc.size() <= n) {
			this.airc.add(70);
		}
		while (this.turn.size() <= n) {
			this.turn.add(6);
		}
		while (this.grip.size() <= n) {
			this.grip.add(20.0f);
		}
		while (this.bounce.size() <= n) {
			this.bounce.add(1.2f);
		}
		while (this.simag.size() <= n) {
			this.simag.add(0.9f);
		}
		while (this.moment.size() <= n) {
			this.moment.add(1.3f);
		}
		while (this.comprad.size() <= n) {
			this.comprad.add(0.5f);
		}
		while (this.push.size() <= n) {
			this.push.add(2);
		}
		while (this.revpush.size() <= n) {
			this.revpush.add(2);
		}
		while (this.lift.size() <= n) {
			this.lift.add(0);
		}
		while (this.revlift.size() <= n) {
			this.revlift.add(0);
		}
		while (this.powerloss.size() <= n) {
			this.powerloss.add(2500000);
		}
		while (this.flipy.size() <= n) {
			this.flipy.add(-50f);
		}
		while (this.msquash.size() <= n) {
			this.msquash.add(7);
		}
		while (this.clrad.size() <= n) {
			this.clrad.add(3300);
		}
		while (this.dammult.size() <= n) {
			this.dammult.add(0.75f);
		}
		while (this.maxmag.size() <= n) {
			this.maxmag.add(7600);
		}
		while (this.dishandle.size() <= n) {
			this.dishandle.add(0.65f);
		}
		while (this.outdam.size() <= n) {
			this.outdam.add(0.68f);
		}
		while (this.cclass.size() <= n) {
			this.cclass.add(0);
		}
		while (this.names.size() <= n) {
			this.names.add("");
		}
		while (this.enginsignature.size() <= n) {
			this.enginsignature.add(0);
		}
		// custom-car-only lists are indexed as (n - 16)
		if (n >= 16) {
			final int c = n - 16;
			while (this.include.size() <= c) {
				this.include.add(false);
			}
			while (this.createdby.size() <= c) {
				this.createdby.add("Unkown User");
			}
			while (this.publish.size() <= c) {
				this.publish.add(0);
			}
		}
	}

	public void loadstat(final byte[] buf, final String s, final float maxR, final float roofat, final int n3, final int n4) {

		this.ensureCarSlot(n4);
		
		while (this.names.size() <= n4) {
			this.names.add("");
			this.swits.add(new int[3]);
			this.acelf.add(new float[3]);
			// … same for every other parallel list …
		}
		while (this.publish.size() <= n4-16) {
			this.publish.add(0);
			this.createdby.add("Unknown User");
			this.include.add(false);
		}
		this.names.set(n4, s);
		boolean b = false;
		boolean b2 = false;
		final int[] array = { 128, 128, 128, 128, 128 };
		int n5 = 640;
		final int[] array2 = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
		final int[] array3 = { 50, 50, 50 };
		this.enginsignature.set(n4, 0);
		float n6 = 0.0f;
		this.publish.set(n4 - 16, 0);
		this.createdby.set(n4 - 16, "Unkown User");
		try {
			final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(buf));
			String line;
			while ((line = dataInputStream.readLine()) != null) {
				final String trim = line.trim();
				if (trim.startsWith("stat(")) {
					try {
						n5 = 0;
						for (int i = 0; i < 5; ++i) {
							array[i] = this.getvalue("stat", trim, i);
							if (array[i] > 200) {
								array[i] = 200;
							}
							if (array[i] < 16) {
								array[i] = 16;
							}
							n5 += array[i];
						}
						b = true;
					}
					catch (final Exception ex) {
						b = false;
					}
				}
				if (trim.startsWith("physics(")) {
					try {
						for (int j = 0; j < 11; ++j) {
							array2[j] = this.getvalue("physics", trim, j);
							if (array2[j] > 100) {
								array2[j] = 100;
							}
							if (array2[j] < 0) {
								array2[j] = 0;
							}
						}
						for (int k = 0; k < 3; ++k) {
							array3[k] = this.getvalue("physics", trim, k + 11);
							if (k != 0 && array3[k] > 100) {
								array3[k] = 100;
							}
							if (array3[k] < 0) {
								array3[k] = 0;
							}
						}
						this.enginsignature.set(n4, this.getvalue("physics", trim, 14));
						if (this.enginsignature.get(n4) > 4) {
							this.enginsignature.set(n4, 4);
						}
						if (this.enginsignature.get(n4) < 0) {
							this.enginsignature.set(n4, 0);
						}
						n6 = (float)this.getvalue("physics", trim, 15);
						if (n6 > 0.0f) {
							b2 = true;
						}
					}
					catch (final Exception ex2) {
						b2 = false;
					}
				}
				if (trim.startsWith("handling(")) {
					try {
						int getvalue = this.getvalue("handling", trim, 0);
						if (getvalue > 200) {
							getvalue = 200;
						}
						if (getvalue < 50) {
							getvalue = 50;
						}
						this.dishandle.set(n4, getvalue / 200.0f);
					}
					catch (final Exception ex3) {}
				}
				if (trim.startsWith("carmaker(")) {
					this.createdby.set(n4 - 16, this.getSvalue("carmaker", trim, 0));
				}
				if (trim.startsWith("publish(")) {
					this.publish.set(n4 - 16, this.getvalue("publish", trim, 0));
				}
			}
			dataInputStream.close();
		}
		catch (final Exception obj) {
			System.out.println("Error Loading Car Stat: " + obj);
		}
		if (b && b2) {
			int l = 0;
			if (n5 > 680) {
				l = 680 - n5;
			}
			if (n5 > 640 && n5 < 680) {
				l = 640 - n5;
			}
			if (n5 > 600 && n5 < 640) {
				l = 600 - n5;
			}
			if (n5 > 560 && n5 < 600) {
				l = 560 - n5;
			}
			if (n5 > 520 && n5 < 560) {
				l = 520 - n5;
			}
			if (n5 < 520) {
				l = 520 - n5;
			}
			while (l != 0) {
				for (int n7 = 0; n7 < 5; ++n7) {
					if (l > 0 && array[n7] < 200) {
						final int[] array4 = array;
						final int n8 = n7;
						++array4[n8];
						--l;
					}
					if (l < 0 && array[n7] > 16) {
						final int[] array5 = array;
						final int n9 = n7;
						--array5[n9];
						++l;
					}
				}
			}
			int n10 = 0;
			for (int n11 = 0; n11 < 5; ++n11) {
				n10 += array[n11];
			}
			if (n10 == 520) {
				this.cclass.set(n4, 0);
			}
			if (n10 == 560) {
				this.cclass.set(n4, 1);
			}
			if (n10 == 600) {
				this.cclass.set(n4, 2);
			}
			if (n10 == 640) {
				this.cclass.set(n4, 3);
			}
			if (n10 == 680) {
				this.cclass.set(n4, 4);
			}
			int n12 = 0;
			int n13 = 0;
			float n14 = 0.5f;
			if (array[0] == 200) {
				n12 = 1;
				n13 = 1;
			}
			if (array[0] > 192 && array[0] < 200) {
				n12 = 12;
				n13 = 1;
				n14 = (array[0] - 192) / 8.0f;
			}
			if (array[0] == 192) {
				n12 = 12;
				n13 = 12;
			}
			if (array[0] > 148 && array[0] < 192) {
				n12 = 14;
				n13 = 12;
				n14 = (array[0] - 148) / 44.0f;
			}
			if (array[0] == 148) {
				n12 = 14;
				n13 = 14;
			}
			if (array[0] > 133 && array[0] < 148) {
				n12 = 10;
				n13 = 14;
				n14 = (array[0] - 133) / 15.0f;
			}
			if (array[0] == 133) {
				n12 = 10;
				n13 = 10;
			}
			if (array[0] > 112 && array[0] < 133) {
				n12 = 15;
				n13 = 10;
				n14 = (array[0] - 112) / 21.0f;
			}
			if (array[0] == 112) {
				n12 = 15;
				n13 = 15;
			}
			if (array[0] > 107 && array[0] < 112) {
				n12 = 11;
				n13 = 15;
				n14 = (array[0] - 107) / 5.0f;
			}
			if (array[0] == 107) {
				n12 = 11;
				n13 = 11;
			}
			if (array[0] > 88 && array[0] < 107) {
				n12 = 13;
				n13 = 11;
				n14 = (array[0] - 88) / 19.0f;
			}
			if (array[0] == 88) {
				n12 = 13;
				n13 = 13;
			}
			if (array[0] > 88) {
				this.swits.get(n4)[0] = (int)((this.swits.get(n13)[0] - this.swits.get(n12)[0]) * n14 + this.swits.get(n12)[0]);
				this.swits.get(n4)[1] = (int)((this.swits.get(n13)[1] - this.swits.get(n12)[1]) * n14 + this.swits.get(n12)[1]);
				this.swits.get(n4)[2] = (int)((this.swits.get(n13)[2] - this.swits.get(n12)[2]) * n14 + this.swits.get(n12)[2]);
			}
			else {
				float n15 = array[0] / 88.0f;
				if (n15 < 0.76) {
					n15 = 0.76f;
				}
				this.swits.get(n4)[0] = (int)(50.0f * n15);
				this.swits.get(n4)[1] = (int)(130.0f * n15);
				this.swits.get(n4)[2] = (int)(210.0f * n15);
			}
			int n16 = 0;
			int n17 = 0;
			float n18 = 0.5f;
			if (array[1] == 200) {
				n16 = 1;
				n17 = 1;
			}
			if (array[1] > 150 && array[1] < 200) {
				n16 = 14;
				n17 = 1;
				n18 = (array[1] - 150) / 50.0f;
			}
			if (array[1] == 150) {
				n16 = 14;
				n17 = 14;
			}
			if (array[1] > 144 && array[1] < 150) {
				n16 = 9;
				n17 = 14;
				n18 = (array[1] - 144) / 6.0f;
			}
			if (array[1] == 144) {
				n16 = 9;
				n17 = 9;
			}
			if (array[1] > 139 && array[1] < 144) {
				n16 = 6;
				n17 = 9;
				n18 = (array[1] - 139) / 5.0f;
			}
			if (array[1] == 139) {
				n16 = 6;
				n17 = 6;
			}
			if (array[1] > 128 && array[1] < 139) {
				n16 = 15;
				n17 = 6;
				n18 = (array[1] - 128) / 11.0f;
			}
			if (array[1] == 128) {
				n16 = 15;
				n17 = 15;
			}
			if (array[1] > 122 && array[1] < 128) {
				n16 = 10;
				n17 = 15;
				n18 = (array[1] - 122) / 6.0f;
			}
			if (array[1] == 122) {
				n16 = 10;
				n17 = 10;
			}
			if (array[1] > 119 && array[1] < 122) {
				n16 = 3;
				n17 = 10;
				n18 = (array[1] - 119) / 3.0f;
			}
			if (array[1] == 119) {
				n16 = 3;
				n17 = 3;
			}
			if (array[1] > 98 && array[1] < 119) {
				n16 = 5;
				n17 = 3;
				n18 = (array[1] - 98) / 21.0f;
			}
			if (array[1] == 98) {
				n16 = 5;
				n17 = 5;
			}
			if (array[1] > 81 && array[1] < 98) {
				n16 = 0;
				n17 = 5;
				n18 = (array[1] - 81) / 17.0f;
			}
			if (array[1] == 81) {
				n16 = 0;
				n17 = 0;
			}
			if (array[1] <= 80) {
				n16 = 2;
				n17 = 2;
			}
			if (array[0] <= 88) {
				n16 = 13;
				n17 = 13;
			}
			this.acelf.get(n4)[0] = (this.acelf.get(n17)[0] - this.acelf.get(n16)[0]) * n18 + this.acelf.get(n16)[0];
			this.acelf.get(n4)[1] = (this.acelf.get(n17)[1] - this.acelf.get(n16)[1]) * n18 + this.acelf.get(n16)[1];
			this.acelf.get(n4)[2] = (this.acelf.get(n17)[2] - this.acelf.get(n16)[2]) * n18 + this.acelf.get(n16)[2];
			if (array[1] <= 70 && array[0] > 88) {
				this.acelf.get(n4)[0] = 9.0f;
				this.acelf.get(n4)[1] = 4.0f;
				this.acelf.get(n4)[2] = 3.0f;
			}
			float n19 = (array[2] - 88) / 109.0f;
			if (n19 > 1.0f) {
				n19 = 1.0f;
			}
			if (n19 < -0.55) {
				n19 = -0.55f;
			}
			this.airs.set(n4 ,0.55f + 0.45f * n19 + 0.4f * (array2[9] / 100.0f));
			if (this.airs.get(n4) < 0.3) {
				this.airs.set(n4, 0.3f);
			}
			this.airc.set(n4, (int)(10.0f + 70.0f * n19 + 30.0f * (array2[10] / 100.0f)));
			if (this.airc.get(n4) < 0) {
				this.airc.set(n4, 0);
			}
			int n20 = (int)(670.0f - (array2[9] + array2[10]) / 200.0f * 420.0f);
			if (array[0] <= 88) {
				n20 = (int)(1670.0f - (array2[9] + array2[10]) / 200.0f * 1420.0f);
			}
			if (array[2] > 190 && n20 < 300) {
				n20 = 300;
			}
			this.powerloss.set(n4, n20 * 10000);
			this.moment.set(n4, 0.7f + (array[3] - 16) / 184.0f * 1.0f);
			if (array[0] < 110) {
				this.moment.set(n4, 0.75f + (array[3] - 16) / 184.0f * 1.25f);
			}
			if (array[3] == 200 && array[4] == 200 && array[0] <= 88) {
				this.moment.set(n4, 3.0f);
			}
			float n21 = 0.9f + (array[4] - 90) * 0.01f;
			if (n21 < 0.6) {
				n21 = 0.6f;
			}
			if (array[4] == 200 && array[0] <= 88) {
				n21 = 3.0f;
			}
			this.maxmag.set(n4, (int)(n6 * n21));
			this.outdam.set(n4, 0.35f + (n21 - 0.6f) * 0.5f);
			if (this.outdam.get(n4) < 0.35) {
				this.outdam.set(n4, 0.35f);
			}
			if (this.outdam.get(n4) > 1.0f) {
				this.outdam.set(n4, 1.0f);
			}
			this.clrad.set(n4, (int)(array3[0] * array3[0] * 1.5));
			if (this.clrad.get(n4) < 1000) {
				this.clrad.set(n4, 1000);
			}
			this.dammult.set(n4, 0.3f + array3[1] * 0.005f);
			this.msquash.set(n4, (int)(2.0 + (float)array3[2] / 7.6));
			this.flipy.set(n4, roofat);
			this.handb.set(n4, (int)(7.0f + array2[0] / 100.0f * 8.0f));
			this.turn.set(n4, (int)(4.0f + array2[1] / 100.0f * 6.0f));
			this.grip.set(n4, 16.0f + array2[2] / 100.0f * 14.0f);
			if (this.grip.get(n4) < 21.0f) {
				final int[] array6 = this.swits.get(n4);
				final int n22 = 0;
				array6[n22] += (int)(40.0f * ((21.0f - this.grip.get(n4)) / 5.0f));
				if (this.swits.get(n4)[0] > 100) {
					this.swits.get(n4)[0] = 100;
				}
			}
			this.bounce.set(n4, 0.8f + array2[3] / 100.0f * 0.6f);
			if (array2[3] > 67) {
				final ArrayList<Float> airs = this.airs;
				airs.set(n4, airs.get(n4) * (0.76f + (1.0f - array2[3] / 100.0f) * 0.24f));
				final ArrayList<Integer> airc = this.airc;
				airc.set(n4, airc.get(n4) * (int)(0.76f + (1.0f - array2[3] / 100.0f) * 0.24f));
			}
			this.lift.set(n4, (int)(array2[5] * (float)array2[5] / 10000.0f * 30.0f));
			this.revlift.set(n4, (int)(array2[6] / 100.0f * 32.0f));
			this.push.set(n4, (int)(2.0f + array2[7] / 100.0f * 2.0f * ((30 - this.lift.get(n4)) / 30)));
			this.revpush.set(n4, (int)(1.0f + array2[8] / 100.0f * 2.0f));
			this.comprad.set(n4, maxR / 400.0f + (array[3] - 16) / 184.0f * 0.2f);
			if (this.comprad.get(n4) < 0.4) {
				this.comprad.set(n4, 0.4f);
			}
			this.simag.set(n4, (n3 - 17) * 0.0167f + 0.85f);
		}
		else {
			this.names.set(n4, "");
		}
	}

	public int getvalue(final String s, final String s2, final int n) {
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

	public String getSvalue(final String s, final String s2, final int n) {
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

	public int servervalue(final String s, final int n) {
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

	public String serverSvalue(final String s, final int n) {
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

	public void loadready() {
		this.m.csky[0] = 170;
		this.m.csky[1] = 220;
		this.m.csky[2] = 255;
		this.m.cfade[0] = 255;
		this.m.cfade[1] = 220;
		this.m.cfade[2] = 220;
		this.m.snap[0] = 0;
		this.m.snap[1] = 0;
		this.m.snap[2] = 0;
		this.fails = "";
		for (int i = 0; i < 20; ++i) {
			this.loadnames[i] = "";
		}
		this.nl = 0;
		this.action = 0;
	}

	public void sparkactionloader() {
		(this.actionloader = new Thread(this)).start();
	}

	public void sparkcarloader() {
		if (!this.carlon) {
			(this.carloader = new Thread(this)).start();
			this.carlon = true;
		}
	}

	public void sparkstageaction() {
		(this.stageaction = new Thread(this)).start();
	}

	public void stopallnow() {
		this.staction = 0;
		this.action = 0;
		if (this.carloader != null) {
			this.carloader.stop();
			this.carloader = null;
		}
		if (this.actionloader != null) {
			this.actionloader.stop();
			this.actionloader = null;
		}
		if (this.stageaction != null) {
			this.stageaction.stop();
			this.stageaction = null;
		}
	}

	@Override
	public void run() {
		if (Thread.currentThread() == this.actionloader) {
			if (this.action == 10) {
				int servervalue = -1;
				try {
					final Socket socket = new Socket("multiplayer.needformadness.com", 7061);
					final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					final PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
					printWriter.println("9|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.names.get(this.ac) + "|");
					final String line = bufferedReader.readLine();
					if (line != null) {
						servervalue = this.servervalue(line, 0);
					}
					socket.close();
					bufferedReader.close();
					printWriter.close();
				}
				catch (final Exception ex) {
					servervalue = -1;
				}
				if (servervalue == 0) {
					this.action = 3;
				}
				else {
					this.action = -10;
				}
				System.gc();
			}
			if (this.action == 1) {
				this.reco = -1;
				try {
					final Socket socket2 = new Socket("multiplayer.needformadness.com", 7061);
					final BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
					final PrintWriter printWriter2 = new PrintWriter(socket2.getOutputStream(), true);
					printWriter2.println("1|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|");
					final String line2 = bufferedReader2.readLine();
					if (line2 != null) {
						this.reco = this.servervalue(line2, 0);
						if (this.reco == 0 || this.reco == 3 || this.reco > 10) {
							this.tnickey = this.serverSvalue(line2, 1);
							if (this.reco != -167) {
								this.tclan = this.serverSvalue(line2, 2);
								this.tclankey = this.serverSvalue(line2, 3);
							}
							else {
								this.tclan = "";
								this.tclankey = "";
							}
						}
					}
					socket2.close();
					bufferedReader2.close();
					printWriter2.close();
				}
				catch (final Exception ex2) {
					this.reco = -1;
				}
				if (this.reco == 0 || this.reco == 3 || this.reco > 10) {
					this.action = 2;
				}
				else {
					this.action = 0;
				}
				System.gc();
			}
			while (this.action == 2) {}
			if (this.action == 3) {
				final String[] array = new String[700];
				this.nl = 0;
				try {
					final DataInputStream dataInputStream = new DataInputStream(new URL("http://multiplayer.needformadness.com/cars/lists/" + this.gs.tnick.getText() + ".txt?reqlo=" + (int)(Math.random() * 1000.0) + "").openStream());
					String line3;
					while ((line3 = dataInputStream.readLine()) != null) {
						final String string = "" + line3.trim();
						if (string.startsWith("mycars")) {
							int n = 1;
							while (n != 0 && this.nl < 700) {
								array[this.nl] = this.getSvalue("mycars", string, this.nl);
								if (array[this.nl].equals("")) {
									n = 0;
								}
								else {
									++this.nl;
								}
							}
						}
					}
					if (this.nl > 0) {
						this.action = 4;
					}
					else {
						this.action = -1;
					}
					dataInputStream.close();
				}
				catch (final Exception obj) {
					if (("" + obj).indexOf("FileNotFound") != -1) {
						this.action = -1;
					}
					else {
						this.action = -2;
					}
				}
				if (this.action == 4) {
					this.gs.mcars.hide();
					this.gs.mcars.removeAll();
					for (int i = 0; i < this.nl; ++i) {
						this.gs.mcars.add(this.gs.rd, array[i]);
					}
					if (this.lastcar.equals("")) {
						this.gs.mcars.select(0);
					}
					else {
						this.gs.mcars.select(this.lastcar);
						this.lastcar = "";
					}
					for (int j = 0; j < this.include.size(); ++j) {
						this.include.set(j, false);
					}
					this.roundslot = 16;
					this.nlocars = 16;
				}
			}
			if (this.action == 4) {
				this.m.csky[0] = 170;
				this.m.csky[1] = 220;
				this.m.csky[2] = 255;
				this.m.cfade[0] = 255;
				this.m.cfade[1] = 220;
				this.m.cfade[2] = 220;
				this.m.snap[0] = 0;
				this.m.snap[1] = 0;
				this.m.snap[2] = 0;
				if (this.loadonlinecar(this.gs.mcars.getSelectedItem(), this.roundslot) == this.roundslot) {
					this.inslot = this.roundslot;
					++this.roundslot;
					if (this.roundslot == 36) {
						this.roundslot = 16;
					}
					if (this.nlocars < 36) {
						++this.nlocars;
					}
					this.lastload = 2;
					this.action = 5;
				}
				else {
					if (this.lastload == 2) {
						this.lastload = 0;
					}
					this.action = -1;
				}
				System.gc();
			}
			if (this.action == 6) {
				int servervalue2 = -1;
				try {
					if (this.ac != -1) {
						this.acname = this.names.get(this.ac);
					}
					final Socket socket3 = new Socket("multiplayer.needformadness.com", 7061);
					final BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(socket3.getInputStream()));
					final PrintWriter printWriter3 = new PrintWriter(socket3.getOutputStream(), true);
					printWriter3.println("8|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.acname + "|");
					final String line4 = bufferedReader3.readLine();
					if (line4 != null) {
						servervalue2 = this.servervalue(line4, 0);
					}
					socket3.close();
					bufferedReader3.close();
					printWriter3.close();
				}
				catch (final Exception ex3) {
					servervalue2 = -1;
				}
				if (servervalue2 == 0) {
					if (this.lastload == 2) {
						this.lastload = -2;
						this.lastcar = this.gs.mcars.getSelectedItem();
					}
					this.action = 7;
				}
				if (servervalue2 == 3) {
					this.action = -7;
				}
				if (servervalue2 == 4) {
					this.action = -8;
				}
				if (this.action == 6) {
					this.action = -9;
				}
				System.gc();
			}
			if (this.action == 11) {
				this.nl = 0;
				try {
					String str = "all";
					if (this.loadlist == 1) {
						str = "Wall";
					}
					if (this.loadlist == 2) {
						str = "WA";
					}
					if (this.loadlist == 3) {
						str = "WAB";
					}
					if (this.loadlist == 4) {
						str = "WB";
					}
					if (this.loadlist == 5) {
						str = "WBC";
					}
					if (this.loadlist == 6) {
						str = "WC";
					}
					if (this.loadlist == 7) {
						str = "Mall";
					}
					if (this.loadlist == 8) {
						str = "MA";
					}
					if (this.loadlist == 9) {
						str = "MAB";
					}
					if (this.loadlist == 10) {
						str = "MB";
					}
					if (this.loadlist == 11) {
						str = "MBC";
					}
					if (this.loadlist == 12) {
						str = "MC";
					}
					if (this.loadlist == 13) {
						str = "Sall";
					}
					if (this.loadlist == 14) {
						str = "SA";
					}
					if (this.loadlist == 15) {
						str = "SAB";
					}
					if (this.loadlist == 16) {
						str = "SB";
					}
					if (this.loadlist == 17) {
						str = "SBC";
					}
					if (this.loadlist == 18) {
						str = "SC";
					}
					if (this.loadlist == 19) {
						str = "Aall";
					}
					if (this.loadlist == 20) {
						str = "AA";
					}
					if (this.loadlist == 21) {
						str = "AAB";
					}
					if (this.loadlist == 22) {
						str = "AB";
					}
					if (this.loadlist == 23) {
						str = "ABC";
					}
					if (this.loadlist == 24) {
						str = "AC";
					}
					final DataInputStream dataInputStream2 = new DataInputStream(new URL("http://multiplayer.needformadness.com/cars/top20/" + str + ".txt").openStream());
					String line5;
					while ((line5 = dataInputStream2.readLine()) != null) {
						final String string2 = "" + line5.trim();
						if (string2.startsWith("cars")) {
							int n2 = 1;
							while (n2 != 0 && this.nl < 20) {
								this.loadnames[this.nl] = this.getSvalue("cars", string2, this.nl);
								if (this.loadnames[this.nl].equals("")) {
									n2 = 0;
								}
								else {
									++this.nl;
								}
							}
						}
						if (string2.startsWith("adds")) {
							for (int k = 0; k < this.nl; ++k) {
								this.adds[k] = this.getvalue("adds", string2, k);
							}
						}
					}
					if (this.nl > 0) {
						this.action = 12;
					}
					else {
						this.action = -1;
					}
					dataInputStream2.close();
				}
				catch (final Exception ex4) {
					this.action = -1;
				}
				System.gc();
			}
			if (this.action == 12) {
				this.m.csky[0] = 170;
				this.m.csky[1] = 220;
				this.m.csky[2] = 255;
				this.m.cfade[0] = 255;
				this.m.cfade[1] = 220;
				this.m.cfade[2] = 220;
				this.m.snap[0] = 0;
				this.m.snap[1] = 0;
				this.m.snap[2] = 0;
				this.xnlocars = 36;
				final int nl = this.nl;
				this.nl = 0;
				while (this.nl < nl) {
					if (this.xnlocars < 56 && this.loadonlinecar(this.loadnames[this.nl], this.xnlocars) == this.xnlocars) {
						++this.xnlocars;
					}
					++this.nl;
				}
				this.nl = 0;
				if (this.xnlocars > 36) {
					this.action = 13;
				}
				else {
					this.action = -1;
				}
				System.gc();
			}
			if (this.action == 101) {
				this.nl = 0;
				try {
					final DataInputStream dataInputStream3 = new DataInputStream(new URL("http://multiplayer.needformadness.com/cars/lists/" + this.viewname + ".txt?reqlo=" + (int)(Math.random() * 1000.0) + "").openStream());
					String line6;
					while ((line6 = dataInputStream3.readLine()) != null) {
						final String string3 = "" + line6.trim();
						if (string3.startsWith("mycars")) {
							int n3 = 1;
							while (n3 != 0 && this.nl < 20) {
								this.loadnames[this.nl] = this.getSvalue("mycars", string3, this.nl);
								if (this.loadnames[this.nl].equals("")) {
									n3 = 0;
								}
								else {
									++this.nl;
								}
							}
						}
					}
					if (this.nl > 0) {
						this.action = 102;
					}
					else {
						this.action = -2;
					}
					dataInputStream3.close();
				}
				catch (final Exception obj2) {
					if (("" + obj2).indexOf("FileNotFound") != -1) {
						this.action = -2;
					}
					else {
						this.action = -1;
					}
				}
				System.gc();
			}
			if (this.action == 102) {
				this.m.csky[0] = 170;
				this.m.csky[1] = 220;
				this.m.csky[2] = 255;
				this.m.cfade[0] = 255;
				this.m.cfade[1] = 220;
				this.m.cfade[2] = 220;
				this.m.snap[0] = 0;
				this.m.snap[1] = 0;
				this.m.snap[2] = 0;
				for (int j = 0; j < this.include.size(); ++j) {
					this.include.set(j, false);
				}
				this.xnlocars = 36;
				final int nl2 = this.nl;
				this.nl = 0;
				while (this.nl < nl2) {
					if (this.xnlocars < 56 && this.loadonlinecar(this.loadnames[this.nl], this.xnlocars) == this.xnlocars) {
						++this.xnlocars;
					}
					++this.nl;
				}
				this.nl = 0;
				if (this.xnlocars > 36) {
					this.action = 103;
				}
				else {
					this.action = -1;
				}
				System.gc();
			}
			this.actionloader = null;
		}
		if (Thread.currentThread() == this.carloader) {
			while (this.nl > 0) {
				int n4 = 0;
				for (int n5 = 16; n5 < 56; ++n5) {
					if (this.loadnames[this.nl - 1].equals(this.names.get(n5))) {
						n4 = -1;
					}
				}
				if (this.fails.indexOf("|" + this.loadnames[this.nl - 1] + "|") != -1) {
					n4 = -1;
				}
				if (n4 != -1) {
					int n6 = this.lcardate[0];
					int n7 = 36;
					if (this.haltload > 0) {
						n7 = 36 + this.haltload;
						n6 = this.lcardate[this.haltload];
					}
					int n8 = n7;
					for (int n9 = n7; n9 < 56; ++n9) {
						if (this.lcardate[n9 - 36] < n6) {
							n6 = this.lcardate[n9 - 36];
							n8 = n9;
						}
					}
					this.onloadingcar = n8 - 35;
					if (this.loadonlinecar(this.loadnames[this.nl - 1], n8) == -1) {
						this.fails = this.fails + "|" + this.loadnames[this.nl - 1] + "|";
					}
					else {
						final int[] lcardate = this.lcardate;
						final int n10 = n8 - 36;
						++lcardate[n10];
					}
					this.onloadingcar = 0;
				}
				--this.nl;
				try {
					final Thread carloader = this.carloader;
					Thread.sleep(20L);
				}
				catch (final InterruptedException ex5) {}
			}
			this.carlon = false;
			this.carloader = null;
		}
		if (Thread.currentThread() == this.stageaction) {
			if (this.staction == 1) {
				int servervalue3 = -1;
				try {
					final Socket socket4 = new Socket("multiplayer.needformadness.com", 7061);
					final BufferedReader bufferedReader4 = new BufferedReader(new InputStreamReader(socket4.getInputStream()));
					final PrintWriter printWriter4 = new PrintWriter(socket4.getOutputStream(), true);
					printWriter4.println("19|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.onstage + "|");
					final String line7 = bufferedReader4.readLine();
					if (line7 != null) {
						servervalue3 = this.servervalue(line7, 0);
					}
					socket4.close();
					bufferedReader4.close();
					printWriter4.close();
				}
				catch (final Exception ex6) {
					servervalue3 = -1;
				}
				if (servervalue3 == 0) {
					try {
						this.gs.mstgs.remove(this.onstage);
					}
					catch (final Exception ex7) {}
					this.gs.mstgs.select(0);
					this.staction = 0;
				}
				else {
					this.staction = -1;
				}
			}
			if (this.staction == 4) {
				this.reco = -1;
				try {
					final Socket socket5 = new Socket("multiplayer.needformadness.com", 7061);
					final BufferedReader bufferedReader5 = new BufferedReader(new InputStreamReader(socket5.getInputStream()));
					final PrintWriter printWriter5 = new PrintWriter(socket5.getOutputStream(), true);
					printWriter5.println("1|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|");
					final String line8 = bufferedReader5.readLine();
					if (line8 != null) {
						this.reco = this.servervalue(line8, 0);
						if (this.reco == 0 || this.reco == 3 || this.reco > 10) {
							this.tnickey = this.serverSvalue(line8, 1);
							if (this.reco != -167) {
								this.tclan = this.serverSvalue(line8, 2);
								this.tclankey = this.serverSvalue(line8, 3);
							}
							else {
								this.tclan = "";
								this.tclankey = "";
							}
						}
					}
					socket5.close();
					bufferedReader5.close();
					printWriter5.close();
				}
				catch (final Exception ex8) {
					this.reco = -1;
				}
				if (this.reco == 0 || this.reco == 3 || this.reco > 10) {
					this.staction = 5;
				}
				else {
					this.staction = 3;
				}
				System.gc();
				while (this.staction == 5) {}
			}
			if (this.staction == 2) {
				int servervalue4 = -1;
				if (this.msloaded == 1) {
					for (int n11 = 1; n11 < this.gs.mstgs.getItemCount(); ++n11) {
						if (this.gs.mstgs.getItem(n11).equals(this.onstage)) {
							servervalue4 = 3;
						}
					}
				}
				if (servervalue4 == -1) {
					try {
						final Socket socket6 = new Socket("multiplayer.needformadness.com", 7061);
						final BufferedReader bufferedReader6 = new BufferedReader(new InputStreamReader(socket6.getInputStream()));
						final PrintWriter printWriter6 = new PrintWriter(socket6.getOutputStream(), true);
						printWriter6.println("18|" + this.gs.tnick.getText() + "|" + this.gs.tpass.getText() + "|" + this.onstage + "|");
						final String line9 = bufferedReader6.readLine();
						if (line9 != null) {
							servervalue4 = this.servervalue(line9, 0);
						}
						socket6.close();
						bufferedReader6.close();
						printWriter6.close();
					}
					catch (final Exception ex9) {
						servervalue4 = -1;
					}
				}
				this.staction = -1;
				if (servervalue4 == 0) {
					this.staction = 0;
					if (this.msloaded == 1) {
						this.gs.mstgs.addstg(this.onstage);
					}
				}
				if (servervalue4 == 3) {
					this.staction = -2;
				}
				if (servervalue4 == 4) {
					this.staction = -3;
				}
			}
			this.stageaction = null;
		}
	}

	public int loadonlinecar(final String str, int n) {
		try {
			final URL url = new URL(("http://multiplayer.needformadness.com/cars/" + str + ".radq").replace(' ', '_'));
			final int contentLength = url.openConnection().getContentLength();
			final DataInputStream dataInputStream = new DataInputStream(url.openStream());
			final byte[] array = new byte[contentLength];
			dataInputStream.readFully(array);
			ZipInputStream zipInputStream;
			if (array[0] == 80 && array[1] == 75 && array[2] == 3) {
				zipInputStream = new ZipInputStream(new ByteArrayInputStream(array));
			}
			else {
				final byte[] buf = new byte[contentLength - 40];
				for (int i = 0; i < contentLength - 40; ++i) {
					int n2 = 20;
					if (i >= 500) {
						n2 = 40;
					}
					buf[i] = array[i + n2];
				}
				zipInputStream = new ZipInputStream(new ByteArrayInputStream(buf));
			}
			final ZipEntry nextEntry = zipInputStream.getNextEntry();
			if (nextEntry != null) {
				int j = Integer.valueOf(nextEntry.getName());
				final byte[] b = new byte[j];
				int off = 0;
				while (j > 0) {
					final int read = zipInputStream.read(b, off, j);
					off += read;
					j -= read;
				}
				this.m.loadnew = false;
				this.ensureCarSlot(n);
				this.bco.set(n, new ContO(b, this.m, this.t));
				if (this.bco.get(n).errd || this.bco.get(n).npl <= 60 || this.bco.get(n).maxR < 120) {
					n = -1;
				}
				if (n != -1) {
					this.bco.get(n).shadow = true;
					this.bco.get(n).noline = false;
					this.bco.get(n).decor = false;
					this.bco.get(n).tnt = 0;
					this.bco.get(n).disp = 0;
					this.bco.get(n).disline = 7;
					this.bco.get(n).grounded = 1.0f;
					boolean b2 = true;
					if (this.bco.get(n).keyy[0] < 0 || this.bco.get(n).keyx[0] > 0) {
						b2 = false;
					}
					if (this.bco.get(n).keyy[1] < 0 || this.bco.get(n).keyx[1] < 0) {
						b2 = false;
					}
					if (this.bco.get(n).keyy[2] > 0 || this.bco.get(n).keyx[2] > 0) {
						b2 = false;
					}
					if (this.bco.get(n).keyy[3] > 0 || this.bco.get(n).keyx[3] < 0) {
						b2 = false;
					}
					if (!b2) {
						n = -1;
					}
				}
				if (n != -1) {
					this.loadstat(b, str, this.bco.get(n).maxR, this.bco.get(n).roofat, this.bco.get(n).wh, n);
					if (this.names.get(n).equals("")) {
						n = -1;
					}
				}
				this.m.loadnew = false;
				dataInputStream.close();
				zipInputStream.close();
			}
			else {
				n = -1;
			}
		}
		catch (final Exception ex) {
			n = -1;
		}
		System.gc();
		return n;
	}

	public void loadmystages(final CheckPoints checkPoints) {
		final String[] array = new String[700];
		int n = 0;
		try {
			final DataInputStream dataInputStream = new DataInputStream(new URL("http://multiplayer.needformadness.com/tracks/lists/" + this.gs.tnick.getText() + ".txt?reqlo=" + (int)(Math.random() * 1000.0) + "").openStream());
			String line;
			while ((line = dataInputStream.readLine()) != null) {
				final String string = "" + line.trim();
				if (string.startsWith("mystages")) {
					int n2 = 1;
					while (n2 != 0 && n < 700) {
						array[n] = this.getSvalue("mystages", string, n);
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
				this.msloaded = 1;
			}
			else {
				this.msloaded = -2;
			}
			dataInputStream.close();
		}
		catch (final Exception obj) {
			if (("" + obj).indexOf("FileNotFound") != -1) {
				this.msloaded = -2;
			}
			else {
				this.msloaded = -1;
			}
		}
		if (this.msloaded == 1) {
			this.gs.mstgs.hide();
			this.gs.mstgs.removeAll();
			this.gs.mstgs.add(this.gs.rd, "Select Stage");
			int n3 = 0;
			for (int i = 0; i < n; ++i) {
				this.gs.mstgs.add(this.gs.rd, array[i]);
				if (checkPoints.name.equals(array[i])) {
					n3 = i + 1;
					checkPoints.top20 = 0;
				}
			}
			this.gs.mstgs.select(n3);
			this.gs.mstgs.show();
		}
		if (this.msloaded == -2) {
			this.gs.mstgs.hide();
			this.gs.mstgs.removeAll();
			this.gs.mstgs.add(this.gs.rd, "You have not published or added any stages...");
			this.gs.mstgs.select(0);
			this.gs.mstgs.show();
		}
		if (this.msloaded == -1) {
			this.gs.mstgs.hide();
			this.gs.mstgs.removeAll();
			this.gs.mstgs.add(this.gs.rd, "Failed to load stages, please try again later.");
			this.gs.mstgs.select(0);
			this.gs.mstgs.show();
		}
		System.gc();
	}

	public void loadtop20(final int msloaded) {
		final String[] array = new String[20];
		int n = 0;
		try {
			String str = "A";
			if (msloaded == 3) {
				str = "W";
			}
			if (msloaded == 4) {
				str = "M";
			}
			final DataInputStream dataInputStream = new DataInputStream(new URL("http://multiplayer.needformadness.com/tracks/top20/" + str + ".txt").openStream());
			String line;
			while ((line = dataInputStream.readLine()) != null) {
				final String string = "" + line.trim();
				if (string.startsWith("stages")) {
					int n2 = 1;
					while (n2 != 0 && n < 20) {
						array[n] = this.getSvalue("stages", string, n);
						if (array[n].equals("")) {
							n2 = 0;
						}
						else {
							++n;
						}
					}
				}
				if (string.startsWith("adds")) {
					for (int i = 0; i < n; ++i) {
						this.top20adds[i] = this.getvalue("adds", string, i);
					}
				}
			}
			if (n > 0) {
				this.msloaded = msloaded;
			}
			else {
				this.msloaded = -2;
			}
			dataInputStream.close();
		}
		catch (final Exception obj) {
			if (("" + obj).indexOf("FileNotFound") != -1) {
				this.msloaded = -2;
			}
			else {
				this.msloaded = -1;
			}
		}
		if (this.msloaded == msloaded) {
			this.gs.mstgs.hide();
			this.gs.mstgs.removeAll();
			this.gs.mstgs.add(this.gs.rd, "Select Stage");
			for (int j = 0; j < n; ++j) {
				this.gs.mstgs.add(this.gs.rd, "N#" + (j + 1) + " " + array[j]);
			}
			this.gs.mstgs.select(0);
			this.gs.mstgs.show();
		}
		if (this.msloaded == -1 || this.msloaded == -2) {
			this.gs.mstgs.hide();
			this.gs.mstgs.removeAll();
			this.gs.mstgs.add(this.gs.rd, "Failed to load Top20 list, please try again later.");
			this.gs.mstgs.select(0);
			this.gs.mstgs.show();
		}
		System.gc();
	}

	public void loadclanstages(final String str) {
		if (!str.equals("")) {
			final String[] array = new String[700];
			int n = 0;
			try {
				DataInputStream dataInputStream;
				String line;
				for (dataInputStream = new DataInputStream(new URL("http://multiplayer.needformadness.com/clans/" + str + "/stages.txt").openStream()); (line = dataInputStream.readLine()) != null && n < 700; ++n) {
					array[n] = line;
				}
				if (n > 0) {
					this.msloaded = 7;
				}
				else {
					this.msloaded = -2;
				}
				dataInputStream.close();
			}
			catch (final Exception obj) {
				if (("" + obj).indexOf("FileNotFound") != -1) {
					this.msloaded = -2;
				}
				else {
					this.msloaded = -1;
				}
			}
			if (this.msloaded == 7) {
				this.gs.mstgs.hide();
				this.gs.mstgs.removeAll();
				this.gs.mstgs.add(this.gs.rd, "Select Stage");
				for (int i = 0; i < n; ++i) {
					this.gs.mstgs.add(this.gs.rd, array[i]);
				}
				this.gs.mstgs.select(0);
				this.gs.mstgs.show();
			}
			if (this.msloaded == -1) {
				this.gs.mstgs.hide();
				this.gs.mstgs.removeAll();
				this.gs.mstgs.add(this.gs.rd, "Failed to load clan stages, please try again later.");
				this.gs.mstgs.select(0);
				this.gs.mstgs.show();
			}
			if (this.msloaded == -2) {
				this.gs.mstgs.hide();
				this.gs.mstgs.removeAll();
				this.gs.mstgs.add(this.gs.rd, "No stages have been added to your clan yet.");
				this.gs.mstgs.select(0);
				this.gs.mstgs.show();
			}
			System.gc();
		}
		else {
			this.msloaded = -2;
			this.gs.mstgs.hide();
			this.gs.mstgs.removeAll();
			this.gs.mstgs.add(this.gs.rd, "You are not a member of any clan yet.");
			this.gs.mstgs.select(0);
			this.gs.mstgs.show();
		}
	}

	public void loadstagemaker() {
		this.gs.mstgs.hide();
		this.gs.mstgs.removeAll();
		this.gs.mstgs.add(this.gs.rd, "Select Stage");
		int n = 0;
		if (new File("" + Madness.fpath + "mystages/").exists()) {
			final String[] list = new File("" + Madness.fpath + "mystages/").list();
			for (int i = 0; i < list.length; ++i) {
				if (list[i].toLowerCase().endsWith(".txt") && n < 200) {
					this.gs.mstgs.add(this.gs.rd, list[i].substring(0, list[i].length() - 4));
					++n;
				}
			}
		}
		if (n != 0) {
			this.msloaded = 2;
		}
		else {
			this.gs.mstgs.add(this.gs.rd, "No stages where found in your 'mystages' folder.");
			this.msloaded = -1;
		}
		this.gs.mstgs.select(0);
		this.gs.mstgs.show();
	}

	public void loadcarmaker() {
		this.m.csky[0] = 170;
		this.m.csky[1] = 220;
		this.m.csky[2] = 255;
		this.m.cfade[0] = 255;
		this.m.cfade[1] = 220;
		this.m.cfade[2] = 220;
		this.m.snap[0] = 0;
		this.m.snap[1] = 0;
		this.m.snap[2] = 0;
		for (int j = 0; j < this.include.size(); ++j) {
			this.include.set(j, false);
		}
		this.nlcars = 16;
		if (new File("" + Madness.fpath + "mycars/").exists()) {
			final String[] list = new File("" + Madness.fpath + "mycars/").list();
			for (int j = 0; j < list.length; ++j) {
				if (list[j].toLowerCase().endsWith(".rad") && this.loadcar(list[j].substring(0, list[j].length() - 4), this.nlcars) == this.nlcars) {
					++this.nlcars;
				}
			}
		}
		System.gc();
		if (this.nlcars > 16) {
			this.lastload = 1;
		}
	}

	public int loadcar(final String str, int n) {
		try {
			final File file = new File("" + Madness.fpath + "mycars/" + str + ".rad");
			if (file.exists()) {
				String string = "";
				final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					string = string + "" + line + "\n";
				}
				bufferedReader.close();
				this.m.loadnew = false;
				this.ensureCarSlot(n);
				this.bco.set(n, new ContO(string.getBytes(), this.m, this.t));
				if (this.bco.get(n).errd || this.bco.get(n).npl <= 60) {
					n = -1;
				}
				if (n != -1) {
					this.bco.get(n).shadow = true;
					this.bco.get(n).noline = false;
					this.bco.get(n).decor = false;
					this.bco.get(n).tnt = 0;
					this.bco.get(n).disp = 0;
					this.bco.get(n).disline = 7;
					this.bco.get(n).grounded = 1.0f;
					boolean b = true;
					if (this.bco.get(n).keyy[0] < 0 || this.bco.get(n).keyx[0] > 0) {
						b = false;
					}
					if (this.bco.get(n).keyy[1] < 0 || this.bco.get(n).keyx[1] < 0) {
						b = false;
					}
					if (this.bco.get(n).keyy[2] > 0 || this.bco.get(n).keyx[2] > 0) {
						b = false;
					}
					if (this.bco.get(n).keyy[3] > 0 || this.bco.get(n).keyx[3] < 0) {
						b = false;
					}
					if (!b) {
						n = -1;
					}
				}
				if (n != -1) {
					this.loadstat(string.getBytes(), str, this.bco.get(n).maxR, this.bco.get(n).roofat, this.bco.get(n).wh, n);
					if (this.names.get(n).equals("")) {
						n = -1;
					}
				}
				this.m.loadnew = false;
			}
			else {
				n = -1;
			}
		}
		catch (final Exception obj) {
			n = -1;
			System.out.println("Error Loading Car: " + obj);
		}
		System.gc();
		return n;
	}
}
