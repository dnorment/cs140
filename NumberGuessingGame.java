/**
 * @author Norment, Daniel
 * Project: #2
 * Due: 10/26/2016
 * Course: cs14002-f16
 *
 * Description:
 * NumberGuessingGame generates a random number for the user to guess. It returns "too high" 
 * or "too low" when comparing the secret number and user input.
 * Entering 0 ends the guessing and gives the user the secret number. Guessing correctly 
 * returns the number of tries it took the user.
 */ 

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        
        Scanner kb = new Scanner(System.in);
        Random randNum = new Random();
        int secretNum = randNum.nextInt(100) + 1;
        
        System.out.println("D. Norment's Number Guessing Game");
        System.out.println();
        System.out.println("A secret number has been generated...");
        System.out.println();
        
        int guess = -1;
        int tries = 0;
        
        while(guess != 0 && guess != secretNum){
            System.out.print("Enter your guess? ");
            guess = kb.nextInt();
            if (guess > secretNum && guess != 0){
                System.out.println("Too high, try again.");
            } else if (guess < secretNum && guess != 0){
                System.out.println("Too low, try again.");
            }
            tries++;
        }
        if (guess == 0){
            System.out.println("The secret number is " + secretNum + ".");
        } else if (guess == secretNum){
            System.out.println("Correct in " + tries + " guesses.");
        }
    }
}
