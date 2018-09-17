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
		return ((double) (this.H) / this.AB);
	}
	public double OBP() { // On base percentage
		return ((double) (this.H + this.BB) / (this.AB + this.BB));
	}
	public double SLG() { // Slugging Percentage
		return ((double) (this.H + 2 * this.twoB + 3 * this.threeB + 4 * this.HR) / this.AB);
	}
	public double OBS() { // On base + slugging percentage
		return (this.OBP() + this.SLG());
	}
	public int TB() { // Total bases
		return (this.H + 2 * this.twoB + 3 * this.threeB + 4 * this.HR);
	}

	

}