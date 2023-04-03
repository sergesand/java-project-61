package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void playGame() {
        int firstOperand;
        int secondOperand;
        String sign;
        int result;
        int userResult;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        //3 tries
        int tries = 3; //3 tries
        int maxBound = 20;
        int numberOfsigns = 3;

        for (int i = 0; i < tries; i++) {
            firstOperand = rand.nextInt(maxBound);
            secondOperand = rand.nextInt(maxBound);

            sign = switch (rand.nextInt(numberOfsigns)) {
                case 0 -> "+";
                case 1 -> "-";
                case 2 -> "*";
                default -> throw new IllegalStateException("Unexpected value: " + rand.nextInt(numberOfsigns));
            };
            result = getResult(firstOperand, secondOperand, sign);
            System.out.println("What is the result of the expression?");
            System.out.println("Question: " + firstOperand + " " + sign +  " " + secondOperand);
            System.out.println("Your answer: ");

            try {
                userResult = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                break;
                // Handle the error or prompt the user to enter a valid input again
            }

            if (userResult == result) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userResult + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + result + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    private static int getResult(int first, int second, String sign) {
        if (sign.equals("+")) {
            return first + second;
        }
        if (sign.equals("-")) {
            return first - second;
        }
        if (sign.equals("*")) {
            return first * second;
        }
        return 0;
    }
}
