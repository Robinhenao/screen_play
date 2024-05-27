package co.com.udea.certificacion.autenticacion.stepdefinitions;


import co.com.udea.certificacion.autenticacion.questions.ShownOnThePageThe;
import co.com.udea.certificacion.autenticacion.tasks.GoTo;
import co.com.udea.certificacion.autenticacion.tasks.OpenThe;
import co.com.udea.certificacion.autenticacion.userinterfaces.SingapurAirlinesPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class ViewExistingFlightsStepDefinition {
    public final Actor admin = Actor.named("John Doe");

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void setup(){
        admin.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }


    @Given("I am on the airline's web site")
    public void iAmOnTheAirlineSWebSite() {
        // Task
        admin.attemptsTo(OpenThe.browser(new SingapurAirlinesPage()));

    }
    @When("I go to the flight management page")
    public void iGoToTheFlightManagementPage() {
        // Task
        admin.attemptsTo(GoTo.managementPage());
    }
    @Then("I can see the list of existing flights")
    public void iCanSeeTheListOfExistingFlights() {
        // Question
        GivenWhenThen.then(admin).should(GivenWhenThen.seeThat(ShownOnThePageThe.flightListing(), Matchers.containsString("asb-123")));
    }


}
