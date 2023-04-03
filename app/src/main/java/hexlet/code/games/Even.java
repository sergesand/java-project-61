package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void playGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String answer;
        String expectedInput;
        final int tries = 3;

        for (int i = 0; i < tries; i++) {
            System.out.print("Question: ");
            int number = random.nextInt();

            System.out.println(number);

            expectedInput = switch (Math.abs(number) % 2) {
                case 0 -> "yes";
                case 1 -> "no";
                default -> throw new IllegalStateException("Unexpected value: " + number + " is not a number");
            };

            answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(expectedInput)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + expectedInput + ".");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
