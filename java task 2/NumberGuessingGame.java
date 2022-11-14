package out;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Atharv Phulwade
 * @IDE visual studio
 * 
 * @features
 *           Limited number of guesses
 *           Random number generator
 *           User input
 *           Points system
 */

public class NumberGuessingGame {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random rand = new Random(); // random object
            int number = rand.nextInt(100) + 1; // random number between 1 and 100

            int guess = 0;

            int tries = 0;

            System.out.println("Try to guess the number between 1 and 100 :) ");

            // Driver logic
            while (guess != number) {
                System.out.print("\nYour guess: ");
                guess = input.nextInt(); // taking users input
                tries++; // incrementing the number of tries

                if (tries >= 10) {
                    System.out.println("You have reached the maximum number of tries");
                    break;

                } 
                else if (guess > number) 
                {
                    System.out.println("Your guess is too high");
                    System.out.println("You have " + (10 - tries) + " tries left");
                } 
                else if (guess < number)
                 {
                    System.out.println("Your guess is too low");
                    System.out.println("You have " + (10 - tries) + " tries left");
                }
                 else
                 {
                    System.out.println("You guessed the number in " + tries + " tries");
                    System.out.println("You have earned " + (100 - (tries * 10)) + " points");
                }
            }
        }
    }
}