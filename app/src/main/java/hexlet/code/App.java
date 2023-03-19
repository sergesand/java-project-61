package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit\n"
                + "Your choice: ");

        String str = scanner.nextLine();

        switch (str) {
            case "1":
                Cli.askName();
                break;
            case "2":
                Cli.askName();
                Even.playEven();
                break;
            case "3":
                Cli.askName();
                Calc.playCalc();
            default:
                break;
        }
    }
}
