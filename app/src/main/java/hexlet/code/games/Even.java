package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int MAX_RANDOM = 100;

    public static boolean run() {
        int number = (int) (Math.random() * MAX_RANDOM) + 1;

        // Выводим только вопрос
        Engine.printMessage("Question: " + number);

        // Запрашиваем ответ пользователя
        String answer = Engine.readInput("Your answer: ");

        boolean correctAnswer = (number % 2 == 0);

        if (answer.equals(correctAnswer ? "yes" : "no")) {
            Engine.printMessage("Correct!");
            return true;
        } else {
            printIncorrectAnswer(answer, correctAnswer);
            return false;
        }
    }

    private static void printIncorrectAnswer(String answer, boolean correctAnswer) {
        String incorrectMessage = "'" + answer + "' is wrong answer ;(. ";
        String correctMessage = "Correct answer was '" + (correctAnswer ? "yes" : "no") + "'.";
        Engine.printMessage(incorrectMessage + correctMessage);
    }
}
