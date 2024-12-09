package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static boolean run() {
        int number = (int) (Math.random() * 100) + 1;
        String correctAnswer = isPrime(number) ? "yes" : "no";

        Engine.printMessage("Question: " + number);
        String answer = Engine.readInput("Your answer: ");

        if (answer.equals(correctAnswer)) {
            Engine.printMessage("Correct!");
            return true;
        } else {
            Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
