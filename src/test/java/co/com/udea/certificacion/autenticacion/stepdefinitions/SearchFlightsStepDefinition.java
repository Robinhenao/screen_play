package co.com.udea.certificacion.autenticacion.stepdefinitions;

import co.com.udea.certificacion.autenticacion.questions.FlightInformationIs;
import co.com.udea.certificacion.autenticacion.questions.ShownOnThePageThe;
import co.com.udea.certificacion.autenticacion.tasks.GoTo;
import co.com.udea.certificacion.autenticacion.tasks.OpenFormCreate;
import co.com.udea.certificacion.autenticacion.tasks.OpenThe;
import co.com.udea.certificacion.autenticacion.tasks.Search;
import co.com.udea.certificacion.autenticacion.userinterfaces.FrontPage;
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

public class SearchFlightsStepDefinition {
    public Actor admin = Actor.named("admin");

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void setup() {
        admin.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }


    @Given("that I'm on the flight management page")
    public void thatIMOnTheFlightManagementPage() {
        admin.attemptsTo(OpenThe.browser(new SingapurAirlinesPage()));
        admin.attemptsTo(GoTo.managementPage());
    }
    @When("I enter a flight number in the search field and click on search")
    public void iEnterAFlightNumberInTheSearchFieldAndClickOnSearch() {
        admin.attemptsTo(Search.flight());
    }
    @Then("the detailed information of the corresponding flight will be displayed")
    public void theDetailedInformationOfTheCorrespondingFlightWillBeDisplayed() {
        GivenWhenThen.then(admin).should(GivenWhenThen.seeThat(FlightInformationIs.visible(),Matchers.containsString("True")));
    }
}
