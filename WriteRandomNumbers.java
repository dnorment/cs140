import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class WriteRandomNumbers {

	public static void main(String[] args) throws IOException {

		String filename = "RanNums.txt";
		PrintWriter outFile = new PrintWriter(filename);
		Random rng = new Random();
		Scanner kb = new Scanner(System.in);

		System.out.print("How many numbers to write? ");
		int n = kb.nextInt();

		for (int i = 0; i < n; i++){

			outFile.print(rng.nextInt(100)+1 + " ");

		}
		outFile.close();

	}

}
