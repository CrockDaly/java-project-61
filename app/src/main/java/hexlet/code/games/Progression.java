package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

        public class Progression implements Engine.GameLogic {
            private static final Random random = new Random();

            @Override
                public boolean playGround() {
                    int firstElement = random.nextInt(20) + 1;
                    int progressionIndex = random.nextInt(40) + 1;
                    int arraySize = 10;

                    int[] progressionArray = Engine.generateProgression(arraySize, firstElement, progressionIndex);
                    int randomIndex = random.nextInt(arraySize);
                    int hiddenArrayElement = progressionArray[randomIndex];

                String progressionForUser = "";
                for (int i = 0; i < arraySize; i++) {
                    if (i == randomIndex) {
                        progressionForUser += ".. ";
                    } else {
                        progressionForUser += progressionArray[i] + " ";
                    }
                }

                Engine.printMessage("Question: " + progressionForUser );
                String answer = Engine.readInput("Your answer: ");
                if (!answer.equals(String.valueOf(hiddenArrayElement))) {
                    Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + hiddenArrayElement + "'.");
                    return false;
                }
                Engine.printMessage("Correct!");
                return true;
            }
        }
