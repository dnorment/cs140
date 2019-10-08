/**
 * @author Norment, Daniel
 * Project: #3
 * Due: 11/9/16
 * Course: cs14002-f16
 *
 * Description:
 * BabylonianSquareRoot computes the square root of numbers from 1.0 to 10.0 using the Babylonian
 * square root algorithm. It runs 8 iterations and compares the Babylonian square root to the actual
 * square root of the numbers, then prints the table to a file bsqrt5.txt.
 */ 

import java.io.*;

public class BabylonianSquareRoot
{
    public static void main(String[] args) throws IOException {
        
		PrintWriter outFile = new PrintWriter("bsqrt5.txt");
		
		int iterations = 8;
        int range = 10;
        
        outFile.println("BABYLONIAN SQUARE ROOT by Daniel Norment");
        outFile.println();
        outFile.printf("Iterations: %d%n", iterations);
        outFile.println();
        outFile.println("  x\t" + "  sqrt(x)\t" + "  bsqrt(x)\t" + "  delta");
        outFile.println("----\t" + "----------\t" + "----------\t" + "----------\t");
        
        for (double i = 1; i<= range; i++) {
            outFile.printf("%4.1f\t" + "%.8f\t" + "%.8f\t" + "%.8f%n", i, Math.sqrt(i), bsqrt(i, iterations), Math.abs(bsqrt(i, iterations) - Math.sqrt(i)));
        }
		
		outFile.close();
    }
    
    public static double bsqrt(double x, int iterations) {
        double guess = 2;
        double r = 0;
        
        for (int i = iterations; i >= 1; i--) {
            r = x/guess;
            guess = (guess + r)/2;           
        }
        
        return r;
    }
}