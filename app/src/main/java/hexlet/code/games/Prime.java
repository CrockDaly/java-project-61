package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final int MAX_RANDOM = 100;

    public static boolean run() {
        int number = (int) (Math.random() * MAX_RANDOM) + 1;

        // Общий вопрос
        Engine.printMessage("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        // Вопрос с числом
        Engine.printMessage("Question: " + number);

        // Запрашиваем ответ пользователя
        String answer = Engine.readInput("Your answer: ");

        boolean correctAnswer = isPrime(number);

        if (answer.equals(correctAnswer ? "yes" : "no")) {
            Engine.printMessage("Correct!");
            return true;
        } else {
            Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + (correctAnswer ? "yes" : "no") + "'.");
            return false;
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
