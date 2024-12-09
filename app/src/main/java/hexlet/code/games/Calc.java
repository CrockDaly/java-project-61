package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int MIN_OPERATION = 3; // Три операции: +, -, *

    public static boolean run() {
        int num1 = (int) (Math.random() * MAX_RANDOM_NUMBER);
        int num2 = (int) (Math.random() * MAX_RANDOM_NUMBER);
        int operation = (int) (Math.random() * MIN_OPERATION);

        int correctAnswer;
        String operationSymbol;

        switch (operation) {
            case 0:
                correctAnswer = num1 + num2;
                operationSymbol = "+"; // Операция сложения
                break;
            case 1:
                correctAnswer = num1 - num2;
                operationSymbol = "-"; // Операция вычитания
                break;
            case 2:
                correctAnswer = num1 * num2;
                operationSymbol = "*"; // Операция умножения
                break;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }

        // Формируем вопрос с операцией
        Engine.printMessage("Question: " + num1 + " " + operationSymbol + " " + num2);
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

