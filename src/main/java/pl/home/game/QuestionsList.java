package pl.home.game;

import lombok.Data;
import java.util.List;

@Data
public class QuestionsList {

    private List<SelectQuestion> questions;

    public QuestionsList(List<SelectQuestion> questions) {
        this.questions = questions;
    }

}
