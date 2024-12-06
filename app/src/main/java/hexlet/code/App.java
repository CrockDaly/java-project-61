package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                """);
        String  number = scanner.nextLine();
        System.out.println("Your choice: " + number);

        if (number.equals("1")) {
            Cli.cli();
        } else if (number.equals("2")) {
            Cli.cli();
            Even even = new Even();
            even.startGame(scanner, Cli.getName());
        }
        scanner.close();
    }
}

