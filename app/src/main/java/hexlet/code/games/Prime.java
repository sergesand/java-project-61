package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void playGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int tries = 3;
        int maxBound = 150;

        for (int i = 0; i < tries; i++) {
            int number = random.nextInt(maxBound);
            System.out.println("Question: " + number);
            System.out.println("Your answer: ");
            String userInput;
            try {
                userInput = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
                break;
            }
            String expectedResult = isPrime(number);
            if (userInput.equalsIgnoreCase(expectedResult)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'" + " is wrong answer ;(. Correct answer was '"
                        + expectedResult + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        scanner.close();
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    private static String isPrime(int num) {
        if (num <= 1) {
            return "no";
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
