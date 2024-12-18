package javaapplication3;
import java.util.Scanner;

public class JavaApplication3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        // Ask the user how many games they want to play
        System.out.print("How many games do you want to play? ");
        int numberOfGames = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numberOfGames; i++) {
            // Prompt the user for their choice
            System.out.print("Enter your choice (r = rock, p = paper, s = scissors): ");
            char playerChoice = scanner.nextLine().toLowerCase().charAt(0);

            // Generate computer's choice
            int computerRandom = (int) (3 * Math.random());
            char computerChoice;
            if (computerRandom == 0) {
                computerChoice = 'r';
            } else if (computerRandom == 1) {
                computerChoice = 'p';
            } else {
                computerChoice = 's';
            }

            // Display computer's choice
            System.out.println("Computer chose: " + computerChoice);

            // Determine the outcome
            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((playerChoice == 'r' && computerChoice == 's') ||
                       (playerChoice == 'p' && computerChoice == 'r') ||
                       (playerChoice == 's' && computerChoice == 'p')) {
                System.out.println("You win!");
                playerWins++;
            } else if ((playerChoice == 'r' && computerChoice == 'p') ||
                       (playerChoice == 'p' && computerChoice == 's') ||
                       (playerChoice == 's' && computerChoice == 'r')) {
                System.out.println("Computer wins!");
                computerWins++;
            } else {
                System.out.println("Invalid choice! Please enter r, p, or s.");
                i--; // Decrement i to repeat the game for invalid input
            }
        }

        // Output the final score
        System.out.println("Final Score:");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Ties: " + ties);

        scanner.close();
    }
}
