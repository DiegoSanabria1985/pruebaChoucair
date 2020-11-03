package co.com.choucairEmpleos.tasks;

import co.com.choucairEmpleos.userinterface.ChoucairJobs;
import co.com.choucairEmpleos.userinterface.ChoucairSections;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AvailableJobs implements Task {
    public static AvailableJobs thePage(String jobs) {
        return Tasks.instrumented(AvailableJobs.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("Analista").into(ChoucairJobs.KEYWORDS),
                Enter.theValue("Medellin").into(ChoucairJobs.LOCATION),
                Click.on(ChoucairJobs.SEARCH));
    }
}
