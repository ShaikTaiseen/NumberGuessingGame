import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generate random number between 1 and 100
        int numberToGuess = rand.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("🎲 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100...");

        // Keep asking until the guess is correct
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            
            // Read user input
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed it in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}

