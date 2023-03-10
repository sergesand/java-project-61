package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void playEven() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String answer = "";
        String expectedInput = "";

        for (int i = 0; i < 3; i++) {
            System.out.println("Question: ");
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
