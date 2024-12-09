package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        boolean isRunning = true;

        do {
            Engine.printMessage("""
                    Please enter the game number and press Enter:
                    1 - Greet
                    2 - Even
                    3 - Calc
                    4 - GCD
                    5 - Progression
                    6 - Prime
                    0 - Exit
                    """);

            String choice = Engine.readInput("Your choice: ");

            switch (choice) {
                case "1" -> {
                    Engine.welcomeUser();
                    isRunning = false;
                }
                case "2" -> {
                    Engine.welcomeUser();
                    Engine.startGame("Answer 'yes' if the number is even, otherwise answer 'no'.", Even::run);
                    isRunning = false;
                }
                case "3" -> {
                    Engine.welcomeUser();
                    Engine.startGame("What is the result of the expression?", Calc::run);
                    isRunning = false;
                }
                case "4" -> {
                    Engine.welcomeUser();
                    Engine.startGame("Find the greatest common divisor of given numbers.", GCD::run);
                    isRunning = false;
                }
                case "5" -> {
                    Engine.welcomeUser();
                    Engine.startGame("What number is missing in the progression?", Progression::run);
                    isRunning = false;
                }
                case "6" -> {
                    Engine.welcomeUser();
                    Engine.startGame("Answer 'yes' if given number is prime. Otherwise answer 'no'.", Prime::run);
                    isRunning = false;
                }
                case "0" -> {
                    Engine.closeScanner();
                    isRunning = false;
                }
                default -> Engine.printMessage("");
            }

        } while (isRunning);
    }
}

