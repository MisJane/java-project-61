package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Question;
import org.jetbrains.annotations.NotNull;

public class Calc implements Game {

    public Question generateQuestion() {
        int number1 = generateRandomNumber();
        int number2 = generateRandomNumber();
        char operator = generateRandomOperator();

        System.out.println("What is the result of the expression?");

        String question = number1 + " " + operator + " " + number2;
        int correctAnswer = calculateAnswer(number1, number2, operator);

        return new Question(question, String.valueOf(correctAnswer));
    }

    public boolean checkAnswer(@NotNull Question question, @NotNull String answer) {
        return answer.equals(question.correctAnswer());
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * 100);
    }

    private char generateRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = (int) (Math.random() * operators.length);
        return operators[randomIndex];
    }

    private int calculateAnswer(int number1, int number2, char operator) {
        int answer = 0;

        switch (operator) {
            case '+':
                answer = number1 + number2;
                break;
            case '-':
                answer = number1 - number2;
                break;
            case '*':
                answer = number1 * number2;
                break;
        }

        return answer;
    }
}
