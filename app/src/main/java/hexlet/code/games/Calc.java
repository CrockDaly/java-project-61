package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static boolean run() {
        int num1 = (int) (Math.random() * 20) + 1;
        int num2 = (int) (Math.random() * 20) + 1;
        String operator = new String[]{"+", "-", "*"}[(int) (Math.random() * 3)];
        int correctAnswer = 0;

        switch (operator) {
            case "+" -> correctAnswer = num1 + num2;
            case "-" -> correctAnswer = num1 - num2;
            case "*" -> correctAnswer = num1 * num2;
        }

        Engine.printMessage("Question: " + num1 + " " + operator + " " + num2);
        String answer = Engine.readInput("Your answer: ");

        if (answer.equals(String.valueOf(correctAnswer))) {
            Engine.printMessage("Correct!");
            return true;
        } else {
            Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }
    }
}
