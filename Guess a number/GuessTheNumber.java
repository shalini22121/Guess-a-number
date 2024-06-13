import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(101) + 100; // Random number between 100 and 200
        int numberOfTries = 0;
        int maxTries = 6;
        int guess = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have selected a number between 100 and 200.");
        System.out.println("Can you guess what it is? You have 6 attempts.");

        while (numberOfTries < maxTries && !hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < 100 || guess > 200) {
                System.out.println("Please enter a number between 100 and 200.");
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
            }
        }

        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've used all 6 attempts. The number was " + numberToGuess + ".");
        }

        scanner.close();
    }
}