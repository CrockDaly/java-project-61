package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

public class App {
    public static void main(String[] args) {

      while (true) {
          Engine.printMessage("""
                    Please enter the game number and press Enter:
                    1 - Greet
                    2 - Even
                    3 - Calc
                    4 - GCD
                    0 - Exit
                    """);
          String choice = Engine.readInput("Your choice: ");
          switch (choice) {
              case "1" -> {
                  Engine.welcomeUser();
                  return;
              }
              case "2" -> {
                  Engine.welcomeUser();
                  Engine.startGame("Answer 'yes' if the number is even, otherwise answer 'no'.", new Even());
                  return;
              }
              case "3" -> {
                  Engine.welcomeUser();
                  Engine.startGame("What is the result of the expression?", new Calc());
                  return;
              }
              case "4" -> {
                  Engine.welcomeUser();
                  Engine.startGame("Find the greatest common divisor of given numbers.", new GCD());
                  return;
              }
                  case "0" -> {
                  Engine.closeScanner();
                  return;
              }
              default -> {
                  Engine.printMessage("");
                  Engine.closeScanner();
                  return;
              }
          }
      }
    }

}

