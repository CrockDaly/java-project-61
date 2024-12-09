package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


    public class Prime implements Engine.GameLogic {
        private static final Random random = new Random();

        @Override
            public boolean playGround() {
            int num = random.nextInt(100) + 1;
            int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

            Engine.printMessage("Question: " + num);
            String answer = Engine.readInput("Your answer: ");

            String correctAnswer = Engine.isPrime(num, primes) ? "yes" : "no";

            if (!answer.equals(correctAnswer)) {
                Engine.printMessage("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                return false;
            }
            Engine.printMessage("Correct!");
            return true;
        }
    }
