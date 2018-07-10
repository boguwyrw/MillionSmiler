package pl.home.game;

import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        QuestionsList qs = new GsonBuilder().create().fromJson(new FileReader("C:\\SDA\\MyTask\\Game\\MillionSmiler\\questions.txt"), QuestionsList.class);
        Scanner scanner = new Scanner(System.in);

        int correctAnswer = 0;

        for (SelectQuestion q : qs.getQuestions()) {
            System.out.println(q.getQuestionValue());
            System.out.println(q.getQuestion());
            System.out.println("A: "+q.getAnswerA());
            System.out.println("B: "+q.getAnswerB());
            System.out.println("C: "+q.getAnswerC());
            System.out.println("D: "+q.getAnswerD());
            System.out.println("Twoja odpowiedź: ");
            String playerAnswer = scanner.nextLine();
            if ((playerAnswer.toUpperCase()).equals(q.getCorrectAnswer())) {
                System.out.println("Gratulacje. Prawidłowa odpowiedz");
                correctAnswer++;
            } else {
                System.out.println("Niestety bledna odpowiedz");
                break;
            }
        }
        RewardSelector rewardSelector = new RewardSelector();
        rewardSelector.selector(correctAnswer);

    }
}
