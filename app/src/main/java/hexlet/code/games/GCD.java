package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
  private static final int MAX_RANDOM = 100;

  public static boolean run() {
    int num1 = (int) (Math.random() * MAX_RANDOM) + 1;
    int num2 = (int) (Math.random() * MAX_RANDOM) + 1;

    String question = "Question: Find the greatest common divisor of " + num1 + " and " + num2 + "\nYour answer: ";
    int correctAnswer = findGCD(num1, num2);

    String answer = Engine.readInput(question);

    if (answer.equals(String.valueOf(correctAnswer))) {
      Engine.printMessage("Correct!");
      return true;
    } else {
      Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
      return false;
    }
  }

  private static int findGCD(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}
