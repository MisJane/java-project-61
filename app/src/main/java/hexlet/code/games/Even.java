package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Question;
import org.jetbrains.annotations.NotNull;


public class Even implements Game {

    public Question generateQuestion() {
        int number = generateRandomNumber();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String correctAnswer = isEven(number) ? "yes" : "no";
        String question = " " + number;

        return new Question(question, correctAnswer);
    }

    public boolean checkAnswer(@NotNull Question question, @NotNull String answer) {
        return answer.equals(question.correctAnswer());
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * 100);
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}