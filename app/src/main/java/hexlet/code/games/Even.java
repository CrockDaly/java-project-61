package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public  class Even implements Engine.GameLogic {
    private static final Random random = new Random();

    @Override
    public boolean playGround() {
        int number = random.nextInt(100) + 1;
        boolean isEven = number % 2 == 0;

        Engine.printMessage("Question: " + number);
        String answer = Engine.readInput("Your answer: ");

        boolean correct = (isEven && "yes".equals(answer)) || (!isEven && "no".equals(answer));
        if (!correct) {
            Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + (isEven ? "yes" : "no") + "'.");
            return false;
        }

        Engine.printMessage("Correct!");
        return true;
    }
}

