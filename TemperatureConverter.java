/**
 * @author Norment, Daniel
 * Project: 1
 * Due: 10/12/2016
 * Course: cs14002-f16
 *
 * Description:
 * TemperatureConverter prompts the user to enter an integer for temperature in Fahrenheit, and prints the equivalent temperature in Celsius.
 */

import java.util.Scanner;

public class TemperatureConverter
{
    public static void main (String[] args)
    {
        System.out.println("D. Norment's Temperature Converter");
        System.out.println("");
        System.out.print("Enter the temperature in Fahrenheit: ");

        int tempf;
        int tempc;

        Scanner kb = new Scanner(System.in);

        tempf = kb.nextInt();
        tempc = (tempf - 32) * 5 / 9;

        System.out.println(tempf + " Fahrenheit equals " + tempc + " in Celsius");
    }
}
