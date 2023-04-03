package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void playGame() {
        Random rand = new Random();
        int first;
        int second;
        int expectedResult;
        Scanner scan = new Scanner(System.in);
        int userInput;
        int tries = 3;
        int maxBound = 20;

        for (int i = 0; i < tries; i++) {
            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.print("Question: ");
            first = Math.abs(rand.nextInt(maxBound));
            second = Math.abs(rand.nextInt(maxBound));
            System.out.println(first + " " + second);
            expectedResult = getGCD(first, second);

            System.out.println("Your answer: ");

            try {
                userInput = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                break;
            }

            if (userInput == expectedResult) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'" + " is wrong answer ;(. Correct answer was '"
                        + expectedResult + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    private static int getGCD(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
