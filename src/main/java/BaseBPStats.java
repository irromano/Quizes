
// BaseBPStats.java
// The program calculates statistics for a baseball player
import java.util.Scanner;

public class BaseBPStats {
	private String name; // Name of player
	private int AB; // At bats
	private int H; // Hits
	private int twoB; // doubles
	private int threeB; // triples
	private int HR; // Home Runs
	private int R; // Runs
	private int BB; // Walks

	public BaseBPStats() {
	}

	// Getters:
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAB(int aB) {
		this.AB = aB;
	}

	public void setH(int h) {
		this.H = h;
	}

	public void setTwoB(int twoB) {
		this.twoB = twoB;
	}

	public void setThreeB(int threeB) {
		this.threeB = threeB;
	}

	public void setHR(int hR) {
		this.HR = hR;
	}

	public void setR(int r) {
		this.R = r;
	}

	public void setBB(int bB) {
		this.BB = bB;
	}

	public double BA() { // calculates Batting Average
		int h = H;
		int ab = AB;
		double ba = (double) h / ab;
		return ba;
	}

	public double OBP() { // On base percentage
		int h = H;
		int bb = BB;
		int ab = AB;
		double OBP = (double) (h + bb) / (ab + bb);
		return OBP;
	}

	public double SLG() { // Slugging Percentage
		int h = H;
		int twoB = this.twoB;
		int threeB = this.threeB;
		int hr = HR;
		int ab = AB;
		double SLG = (double) (h + 2 * twoB + 3 * threeB + 4 * hr) / ab;

		return SLG;
	}

	public double OBS() { // On base + slugging percentage
		double obp = this.OBP();
		double slg = this.SLG();
		double OBS = obp + slg;

		return OBS;
	}

	public int TB() { // Total bases
		int h = H;
		int twoB = this.twoB;
		int threeB = this.threeB;
		int hr = HR;
		int TB = h + 2 * twoB + 3 * threeB + 4 * hr;
		return TB;
	}

}