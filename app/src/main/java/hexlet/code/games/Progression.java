package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.Question;

import java.util.Arrays;

public class Progression implements Game {
    final int MIN_LENGTH = 5;
    final int MAX_LENGTH = 10;
    final int MIN_NUMBER = 1;
    final int MAX_NUMBER = 100;

    @Override
    public Question generateQuestion() {


        int length = generateRandomNumber();
        int hiddenIndex = (int) (Math.random() * (length + 1));
        
        int[] correctAnswer = generateProgression(length, hiddenIndex);
        String question = Arrays.toString(generateProgression(length, hiddenIndex));

        System.out.println("What number is missing in the progression?");

        return new Question(question, Arrays.toString(correctAnswer));
    }

    @Override
    public boolean checkAnswer(Question question, String answer) {
        return answer.equals(question.correctAnswer());
    }

    private int[] generateProgression(int length, int hiddenIndex) {
        int[] progression = new int[length];
        int commonDifference = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);

        for (int i = 0; i < length; i++) {
            progression[i] = commonDifference * i;
        }

        progression[hiddenIndex] = commonDifference * hiddenIndex + commonDifference;

        return progression;
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * (MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH);
    }
}

