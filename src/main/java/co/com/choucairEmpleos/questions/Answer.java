package co.com.choucairEmpleos.questions;

import co.com.choucairEmpleos.userinterface.ChoucairJobPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameJob= Text.of(ChoucairJobPage.NAME_JOB).viewedBy(actor).asString();
        if(question.equals(nameJob)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
