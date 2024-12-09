package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int MAX_RANDOM = 100;

    public static boolean run() {
        int number = (int) (Math.random() * MAX_RANDOM) + 1;
        String answer = Engine.readInput("Question: Is this number even? " + number + "\nYour answer: ");

        boolean correctAnswer = (number % 2 == 0);

        if (answer.equals(correctAnswer ? "yes" : "no")) {
            Engine.printMessage("Correct!");
            return true;
        } else {
            Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + (correctAnswer ? "yes" : "no") + "'.");
            return false;
        }
    }
}
