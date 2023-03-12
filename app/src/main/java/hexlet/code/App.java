package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit\n"
                + "Your choice: ");

        String str = scanner.nextLine();
        if (str.equalsIgnoreCase("1")) {
            Cli.askName();
        }
        if (str.equalsIgnoreCase("2")) {
            Cli.askName();
            Even.playEven();
        }
    }
}
