package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Question;


public class Prime implements Game {

    @Override
    public Question generateQuestion() {
        int number = generateNumber();
       // System.out.println("Question: " + number);
        System.out.print("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n");
        String question = " " + number;
        String correctAnswer = isPrime(number) ? "yes" : "no";

        return new Question(question, correctAnswer);
    }

    @Override
    public boolean checkAnswer(Question question, String answer) {
        return answer.equals(question.correctAnswer());
    }

    private int generateNumber() {
        int MIN_NUMBER = 1;
        int MAX_NUMBER = 200;
        return (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
