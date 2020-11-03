package co.com.choucairEmpleos.tasks;

import co.com.choucairEmpleos.userinterface.ChoucairEnterPage;
import co.com.choucairEmpleos.userinterface.ChoucairSections;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Sections implements Task {
    public static Sections the(String section) {
        return Tasks.instrumented(Sections.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChoucairSections.SECTION_CHOUCAIR));

    }
}
