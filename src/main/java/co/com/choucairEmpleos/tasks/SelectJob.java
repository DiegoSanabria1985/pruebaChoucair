package co.com.choucairEmpleos.tasks;

import co.com.choucairEmpleos.userinterface.ChoucairJobPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectJob implements Task {
    public static SelectJob theSearch(String course) {
        return Tasks.instrumented(SelectJob.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChoucairJobPage.SELECT_JOB));

    }
}
