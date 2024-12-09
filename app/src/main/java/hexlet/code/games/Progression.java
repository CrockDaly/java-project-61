package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static boolean run() {
        int start = (int) (Math.random() * 50) + 1;
        int step = (int) (Math.random() * 10) + 1;
        int hiddenIndex = (int) (Math.random() * 10);

        int[] progression = new int[10];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = start + i * step;
        }
        int correctAnswer = progression[hiddenIndex];
        progression[hiddenIndex] = -1; // Заменяем скрытый элемент на -1

        StringBuilder progressionString = new StringBuilder("Question: ");
        for (int i : progression) {
            if (i == -1) {
                progressionString.append(".. ");  // Заменяем скрытое значение на "..."
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
