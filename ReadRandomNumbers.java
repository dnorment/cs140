import java.util.Scanner;
import java.io.*;

public class ReadRandomNumbers {

	public static void main(String[] args) throws IOException {

		String filename = "RanNums.txt";
		File inFile = new File(filename);
		Scanner kb = new Scanner(inFile);

		int sum = 0;
		int count = 0;


		while(inFile.hasNext()){

			count++;
			int k = inFile.nextInt();
			sum += k;

		}
		inFile.close();

		System.out.println(count);
		System.out.println(sum);

	}

}
