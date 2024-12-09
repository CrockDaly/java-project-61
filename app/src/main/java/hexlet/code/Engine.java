package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userName;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MAX_ATTEMPTS = 3;  // Константа для максимального числа попыток

    public static void welcomeUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = SCANNER.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static String readInput(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextLine();
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void closeScanner() {
        SCANNER.close();
    }

    public static void startGame(String gameDescription, GameLogic gameLogic) {
        printMessage(gameDescription);
        int correctAnswersInARow = 0;

        // Используем константу MAX_ATTEMPTS
        while (correctAnswersInARow < MAX_ATTEMPTS) {
            if (gameLogic.run()) {
                correctAnswersInARow++;
            } else {
                printMessage("Let's try again, " + userName + "!");
                return;
            }
        }
        printMessage("Congratulations, " + userName + "!");
    }

    public interface GameLogic {
        boolean run();
    }
}
