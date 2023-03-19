package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void playCalc() {
        int firstOperand;
        int secondOperand;
        String sign;
        int result;
        int userResult;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            firstOperand = rand.nextInt(101);
            secondOperand = rand.nextInt(101);

            sign = switch (rand.nextInt(3)) {
                case 0 -> "+";
                case 1 -> "-";
                case 2 -> "*";
                default -> throw new IllegalStateException("Unexpected value: " + rand.nextInt(3));
            };
            result = getResult(firstOperand, secondOperand, sign);
            System.out.println("What is the result of the expression?");
            System.out.println("Question: " + firstOperand + " " + sign +  " " + secondOperand);
            System.out.println("Your answer: ");
            userResult = Integer.parseInt(scanner.next());

            if (userResult == result) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userResult + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + result + "'");
                System.out.println("Let's try again, " + Cli.getName());
                break;
            }
            System.out.println("Congratulations, " + Cli.getName());
        }



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
