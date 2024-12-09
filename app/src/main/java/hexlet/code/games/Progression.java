package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int MAX_RANDOM_START = 50;
    private static final int MAX_STEP = 10;
    private static final int PROGRESSION_LENGTH = 10;

    public static boolean run() {
        int start = (int) (Math.random() * MAX_RANDOM_START) + 1;
        int step = (int) (Math.random() * MAX_STEP) + 1;
        int hiddenIndex = (int) (Math.random() * PROGRESSION_LENGTH);

        int[] progression = new int[PROGRESSION_LENGTH];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = start + i * step;
        }
        int correctAnswer = progression[hiddenIndex];
        progression[hiddenIndex] = -1; // Скрытый элемент

        StringBuilder progressionString = new StringBuilder("Question: ");
        for (int i : progression) {
            if (i == -1) {
                progressionString.append(".. ");
            } else {
                progressionString.append(i).append(" ");
            }
        }

        Engine.printMessage(progressionString.toString());
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
