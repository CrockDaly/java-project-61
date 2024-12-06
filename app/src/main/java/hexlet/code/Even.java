package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public  void startGame(Scanner scanner, String name) {
        Random random = new Random();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            if (!askQuestion(random, scanner, name)) {
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    private boolean askQuestion(Random random, Scanner scanner, String name) {
        int number = random.nextInt(100) + 1;
        boolean isEven = number % 2 == 0;

        System.out.print("Question: " + number + "\nYour answer: ");
        String answer = scanner.nextLine();


        if ((isEven && answer.equals("no")) || (!isEven && answer.equals("yes"))) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (isEven ? "yes" : "no") + "'.");
            System.out.println("Let's try again, " + name + "!");
            return false;  // Неправильный ответ
        }

        System.out.println("Correct!");
        return true;  // Правильный ответ
    }
}

