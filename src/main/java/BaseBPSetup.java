import java.util.Scanner;

public class BaseBPSetup {

	// Requests inputs from the user
	public static void main(String[] args) {
		// Creates a Scanner for user inputs
		Scanner input = new Scanner(System.in);

		BaseBPStats newPlayer = new BaseBPStats();

		System.out.println("Please enter player name: \n"); // input
		newPlayer.setName(input.next()); // reads name from user

		System.out.println("Please enter At bats: \n"); // input
		newPlayer.setH(input.nextInt()); // reads Hits

		System.out.println("Please enter Hits: \n"); // input
		newPlayer.setAB(input.nextInt()); // reads At bats

		System.out.println("Please enter doubles: \n"); // input
		newPlayer.setTwoB(input.nextInt()); // reads doubles

		System.out.println("Please enter triples: \n"); // input
		newPlayer.setThreeB(input.nextInt()); // reads triples

		System.out.println("Please enter Home Runs: \n"); // input
		newPlayer.setHR(input.nextInt()); // reads Home Runs

		System.out.println("Please enter Runs: \n"); // input
		newPlayer.setR(input.nextInt()); // reads Runs

		System.out.println("Please enter Walks: \n"); // input
		newPlayer.setBB(input.nextInt()); // reads Walks

		// Prints Player Stats
		System.out.println("%s's Baseball Stats: " + newPlayer.getName());
		System.out.println("Batting Average: " + newPlayer.BA());
		System.out.println("On base percentage: " + newPlayer.OBP());
		System.out.println("Slugging percentage: " + newPlayer.SLG());
		System.out.println("On Base and Slugging percentage: " + newPlayer.OBS());
		System.out.println("Total Bases: " + newPlayer.TB());
	}
}
