package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;
    public static void cli() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");

        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

    }
    public static String getName() {
        return name;
    }
}
