package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int MIN_OPERATION = 4; // Мы хотим 4 операции, поэтому MIN_OPERATION должно быть 4.

    public static boolean run() {
        int num1 = (int) (Math.random() * MAX_RANDOM_NUMBER);
        int num2 = (int) (Math.random() * MAX_RANDOM_NUMBER);
        int operation = (int) (Math.random() * MIN_OPERATION);

        int correctAnswer;

        switch (operation) {
            case 0:
                correctAnswer = num1 + num2;
                break;
            case 1:
                correctAnswer = num1 - num2;
                break;
            case 2:
                correctAnswer = num1 * num2;
                break;
            case 3:
                if (num2 == 0) {
                    num2 = 1; // Чтобы избежать деления на ноль, можно заменить num2 на 1
                }
                correctAnswer = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }

        Engine.printMessage("Question: " + num1 + " ? " + num2);
        String answer = Engine.readInput("Your answer: ");

        if (Integer.parseInt(answer) == correctAnswer) {
            Engine.printMessage("Correct!");
            return true;
        } else {
            Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }
    }
}
