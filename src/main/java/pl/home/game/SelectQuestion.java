package pl.home.game;

import lombok.Data;

@Data
public class SelectQuestion {

    private String questionValue;
    private String question;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String correctAnswer;

    @Override
    public String toString() {
        return "Question for" + questionValue +
                "Question: " + question + '\'' +
                "Answer A: " + answerA + '\'' +
                "Answer B: " + answerB + '\'' +
                "Answer C: " + answerC + '\'' +
                "Answer D: " + answerD;
    }

}
