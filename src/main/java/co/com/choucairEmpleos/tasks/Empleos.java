package co.com.choucairEmpleos.tasks;

import co.com.choucairEmpleos.userinterface.ChoucairEnterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Empleos implements Task {

    public static Empleos onThePage(){
        return Tasks.instrumented(Empleos.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChoucairEnterPage.ENTER_PAGE));
    }
}
