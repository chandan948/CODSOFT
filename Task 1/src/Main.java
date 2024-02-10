import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int minimum = 1;
        int maximum = 100;
        int generatedNum = minimum + (int)(Math.random() * ((maximum - minimum) + 1));
        int attempts = 0;
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("G the number between " + minimum + " and " + maximum + ": ");
            int G = s.nextInt();
            attempts++;

            if (G == generatedNum) {
                System.out.println("Congratulations! You Ged the number in " + attempts + " attempts.");
                break;
            } else if (G < generatedNum) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        int minimum2 = 1;
        int maximum2 = 100;
        int maxAttempts = 5;
        Random rand1 = new Random();
        Scanner s1 = new Scanner(System.in);
        int totalAttempts = 0;
        int roundsWon = 0;

        while (true) {
            int generatedNum2 = rand1.nextInt((maximum2 - minimum2) + 1) + minimum2;
            int attempts2 = 0;

            while (true) {
                System.out.print("G the number between " + minimum2 + " and " + maximum2 + ": ");
                int G2 = s1.nextInt();
                attempts2++;

                if (G2 == generatedNum2) {
                    System.out.println("Congratulations! You Ged the number in " + attempts2 + " attempts.");
                    totalAttempts += attempts2;
                    roundsWon++;
                    break;
                } else if (G2 < generatedNum2) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            System.out.print("Want to play again? (yes or no): ");
            String playAgain = s1.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing. Your score is " + totalAttempts + " attempts and " + roundsWon + " rounds won. play Again!");
                break;
            }
        }
    }
}

