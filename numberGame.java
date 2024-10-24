import java.util.Random;
import java.util.Scanner;

public class numberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean restart = true;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 3;

            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You have "+maxAttempts+" attempts to guess it");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("Game over! The number was " + targetNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            restart = response.equals("yes");

        }while (restart);

        System.out.println("Game over! Your score: " + score);

        scanner.close();
    }
}