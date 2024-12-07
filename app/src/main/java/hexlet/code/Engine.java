package hexlet.code;

import java.util.Scanner;



    public class Engine {
        public interface  GameLogic {
            boolean playGround();
        }

        private static String userName;
        private static final Scanner scanner = new Scanner(System.in);

        public static void welcomeUser (){
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            userName = scanner.nextLine();
            System.out.println("Hello, " + userName + "!");

        }

        public static String getUserName() {
                return userName;
            }

        public static String readInput(String prompt) {
            System.out.print(prompt);
            return scanner.nextLine();
        }

        public static void printMessage(String message) {
            System.out.println(message);
        }

        public static void closeScanner() {
            scanner.close();
        }

        public static void startGame(String gameDescription, GameLogic logic) {
            printMessage(gameDescription);
            for (int i = 0; i < 3; i++) {
                if (!logic.playGround()) {
                  printMessage("Let's try again, " + userName + "!");
                    return;
                }
            }
            printMessage("Congratulations, " + userName + "!");
        }

    }
