package hexlet.code.games;

import hexlet.code.Engine;


import java.util.Random;

  public class GCD  implements Engine.GameLogic {
    private final Random random = new Random();

    @Override
      public boolean playGround() {
        int num1 = random.nextInt(100) + 1;
        int num2 = random.nextInt(100) + 1;

        int correctAnswer = Engine.findGDC(num1, num2);

        Engine.printMessage("Question: " + num1 + " " + num2);
        String answer = Engine.readInput("Your answer: ");

        if (!answer.equals(String.valueOf(correctAnswer))) {
            Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }
        Engine.printMessage("Correct!");
        return true;

    }
  }
