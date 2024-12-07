package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc implements Engine.GameLogic {
    private static final Random RANDOM = new Random();
    private static final String[] OPERATORS = {"+", "-", "*"};

    @Override
    public boolean playGround() {
        int num1 = RANDOM.nextInt(20) + 1;
        int num2 = RANDOM.nextInt(20) + 1;
        String operator = OPERATORS[RANDOM.nextInt(OPERATORS.length)];

        int correctAnswer = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };

        Engine.printMessage("Question: " + num1 + " " + operator + " " + num2);
        String answer = Engine.readInput("Your answer: ");

        if (!answer.equals(String.valueOf(correctAnswer))) {
            Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }

        Engine.printMessage("Correct!");
        return true;
    }
}