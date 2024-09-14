import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int totalRounds = 0;
            int totalScore = 0;
            
            while (true) {
                totalRounds++;
                System.out.println("\nRound " + totalRounds + ":");
                int score = playRound(scanner);
                totalScore += score;
                
                System.out.print("Do you want to play another round? (yes/no): ");
                String playAgain = scanner.next().trim().toLowerCase();
                if (!playAgain.equals("yes")) {
                    break;
                }
            }
            
            System.out.println("\nGame Over! You played " + totalRounds + " rounds with a total score of " + totalScore + " attempts.");
            System.out.println("Thanks for playing!");
        }
    }

    private static int playRound(Scanner scanner) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int attempts = 0;
        int maxAttempts = 7;

        System.out.println("Guess the number between 1 and 100. You have up to 7 attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the correct number " + numberToGuess + " in " + attempts + " attempts.");
                return attempts;
            }
        }

        System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + numberToGuess + ".");
        return maxAttempts;
    }
}
