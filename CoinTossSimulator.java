import java.util.Random;
import java.util.Scanner;

public class CoinTossSimulator {
	public static void main(String[] args) {

		System.out.println("Coin Toss Simulator by D. Norment");
		System.out.println();
		System.out.print("Enter the number of times to toss? ");
		Scanner kb = new Scanner(System.in);
		int runs = kb.nextInt();
		int totalRuns = runs;
		System.out.println();
		Random rng = new Random();
		float totalHeads = 0;
		float totalTails = 0;
		while (runs > 0) {
			int randNum = rng.nextInt(2);
			if (randNum == 0) {
				totalHeads++;
			} else if (randNum == 1) {	//don't need second if
				totalTails++;
			}
			runs--;
		}

		float ratio = totalHeads / totalRuns;

		System.out.println("Heads: " + totalHeads);
		System.out.println("Tails: " + totalTails);
		System.out.println("Ratio: " + ratio);

	}
}
