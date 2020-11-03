package co.com.choucairEmpleos.stepdefinitions;

import co.com.choucairEmpleos.questions.Answer;
import co.com.choucairEmpleos.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Diego wants to find vacancies$")
    public void Diegowantstofindvacancies() throws Exception {
        // Write code here that turns the phrase above into concrete actions

        OnStage.theActorCalled("Diego").wasAbleTo(Openup.thePage(), (Empleos.onThePage()));
    }


    @When("^go to the section (.*)$")
    public void agotothesectionSERCHOUCAIR(String section) throws Exception {
        // Write code here that turns the phrase above into concrete actions

        OnStage.theActorInTheSpotlight().attemptsTo(Sections.the(section));
    }

    @When("^Search by code and location en (.*)$")
    public void SearchbycodeandlocationenEMPLEOSDISPONIBLES(String jobs) throws Exception {
        // Write code here that turns the phrase above into concrete actions

        OnStage.theActorInTheSpotlight().attemptsTo(AvailableJobs.thePage(jobs));
    }


    @When("^select a course (.*)$")
    public void selectacourseINGENIERIADESOFTWARE(String course) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(SelectJob.theSearch(course));

    }

    @Then("^Then find the selected vacancy page with the title (.*)$")
    public void ThenfindtheselectedvacancypagewiththetitleAnalistadePruebas(String question) throws Exception {
        // Write code here that turns the phrase above into concrete actions

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
