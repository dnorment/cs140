/**
 * @author Norment, Daniel
 * Project: Extra #1
 * Due: 12/9/16
 * Course: cs14002-f16
 *
 * Description:
 * Given a filename, displays lowest, highest, total, and average of numbers using an array.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberAnalyzer{
    private ArrayList<Double> numArray = new ArrayList<Double>();
    
    public NumberAnalyzer(String filename) throws IOException{
        Scanner input = new Scanner(new File(filename));
        
        while (input.hasNext()){
            numArray.add(input.nextDouble());
        }
        input.close();
    }
    
    public double lowest(){
        double low = numArray.get(0);
        for (int i = 0; i < numArray.size(); i++){
            if (numArray.get(i) < low){
                low = numArray.get(i);
            }
        }
        return low;
    }
    
    public double highest(){
        double high = numArray.get(0);
        for (int i = 0; i < numArray.size(); i++){
            if (numArray.get(i) > high){
                high = numArray.get(i);
            }
        }
        return high;
    }
    
    public double total(){
        double total = 0;
        for (int i = 0; i < numArray.size(); i++){
            total += numArray.get(i);
        }
        return total;
    }
    
    public double average(){
        return total() / numArray.size();
    }
    
    public static void main(String[] args) throws IOException{
        NumberAnalyzer na = new NumberAnalyzer("Numbers.txt");
        System.out.println("Lowest: " + na.lowest());
        System.out.println("Highest: " + na.highest());
        System.out.println("Total: " + na.total());
        System.out.println("Average: " + na.average());
    }
}