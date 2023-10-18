package hexlet.code;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Engine {

    public void playGame(@NotNull Game game) {
        Cli.welcomePack();

        int round = 1;
        int correctAnswers = 0;

        while (correctAnswers < 3) {
            System.out.println("Round " + round);


            Question question = game.generateQuestion();
            System.out.println("Question: " + question.question());

            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);

            if (game.checkAnswer(question, answer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + question.correctAnswer() +
                        "'. Let's try again, " + Cli.getUserName() + "!");
                break;
            }

            round++;
        }

        if (correctAnswers == 3) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }
}
