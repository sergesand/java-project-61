package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void playGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");

        final int tries = 3;

        for (int i = 0; i < tries; i++) {
            System.out.print("Question: ");
            int[] arr = generateArray();
            int obfuscatedItem = random.nextInt(arr.length - 1);

            for (int j = 0; j < arr.length; j++) {
                if (j == obfuscatedItem) {
                    System.out.print(".. ");
                    continue;
                }
                System.out.print(arr[j] + " ");
            }

            System.out.println("\nYour answer: ");
            int userInput;

            try {
                userInput = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }

            if (userInput == arr[obfuscatedItem]) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userInput + "'" + " is wrong answer ;(. Correct answer was '"
                        + arr[obfuscatedItem] + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }

        scanner.close();
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }

    private static int[] generateArray() {
        Random random = new Random();
        final int minBoundArray = 5;
        final int maxBoundArray = 11;
        final int maxBound = 21;
        final int maxBoundStep = 6;

        int arrayLength = random.nextInt(minBoundArray, maxBoundArray);
        int firstItem = random.nextInt(maxBound);
        int step = random.nextInt(1, maxBoundStep);
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = firstItem + (step * i);
        }
        return array;
    }
}
