package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "0 - Exit\n"
                + "Your choice: ");

        String str = scanner.nextLine();

        switch (str) {
            case "1":
                Cli.askName();
                break;
            case "2":
                Cli.askName();
                Even.playGame();
                break;
            case "3":
                Cli.askName();
                Calc.playGame();
            case "4":
                Cli.askName();
                GCD.playGame();
            case "5":
                Cli.askName();
                Progression.playGame();
            default:
                break;
        }
    }
}
