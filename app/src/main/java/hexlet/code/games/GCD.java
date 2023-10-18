package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Question;


public class GCD implements Game {


    @Override
    public Question generateQuestion() {

        int number1 = generateRandomNumber();
        int number2 = generateRandomNumber();
        int correctAnswer = gcd(number1, number2);
        String question = " " + number1 + " " + number2;

        System.out.println("Find the greatest common divisor of given numbers.");

        return new Question(question, String.valueOf(correctAnswer));
    }

    @Override
    public boolean checkAnswer(Question question, String answer) {
        return answer.equals(question.correctAnswer());
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * 100);
    }

    private int gcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }

        return number1;
    }
}