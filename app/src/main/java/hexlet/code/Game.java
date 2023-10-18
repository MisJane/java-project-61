package hexlet.code;

public interface Game {
    Question generateQuestion();
    boolean checkAnswer(Question question, String answer);
}
