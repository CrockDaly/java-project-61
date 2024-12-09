package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
  public static boolean run() {
    int num1 = (int) (Math.random() * 100) + 1;
    int num2 = (int) (Math.random() * 100) + 1;
    int correctAnswer = findGCD(num1, num2);

    Engine.printMessage("Question: " + num1 + " " + num2);
    String answer = Engine.readInput("Your answer: ");

    if (answer.equals(String.valueOf(correctAnswer))) {
      Engine.printMessage("Correct!");
      return true;
    } else {
      Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
      return false;
    }
  }

  public static int findGCD(int num1, int num2) {
    while (num2 != 0) {
      int temp = num2;
      num2 = num1 % num2;
      num1 = temp;
    }
    return num1;
  }
}
