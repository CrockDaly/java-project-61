package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static boolean run() {
        int number = (int) (Math.random() * 100);
        Engine.printMessage("Question: " + number);
        String answer = Engine.readInput("Your answer: ");
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";

        if (answer.equals(correctAnswer)) {
            Engine.printMessage("Correct!");
            return true;
        } else {
            Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }
    }
}
