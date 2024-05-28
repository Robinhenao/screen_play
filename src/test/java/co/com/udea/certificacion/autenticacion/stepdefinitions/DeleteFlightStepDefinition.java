package co.com.udea.certificacion.autenticacion.stepdefinitions;


import co.com.udea.certificacion.autenticacion.questions.CancelVerificarQuestion;
import co.com.udea.certificacion.autenticacion.questions.CreateConfirmQuestion;
import co.com.udea.certificacion.autenticacion.tasks.CancelFlight;
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


public class DeleteFlightStepDefinition {

    public Actor admin = Actor.named("admin");

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void setup() {
        admin.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("estoy en la pagina de gestion de vuelos")
    public void estoyEnLaPaginaDeGestionDeVuelos() {
        admin.attemptsTo(OpenThe.browser(new SingapurAirlinesPage()));
        admin.attemptsTo(GoTo.managementPage());
    }
    @When("selecciono la accion de cancelar un vuelo y confirmo la cancelacion")
    public void seleccionoLaAccionDeCancelarUnVueloYConfirmoLaCancelacion() {
        admin.attemptsTo(CancelFlight.cancelFlight());
    }
    @Then("se valida la cancelacion del vuelo")
    public void seValidaLaCancelacionDelVuelo() {
        GivenWhenThen.then(admin).should(GivenWhenThen.seeThat(CancelVerificarQuestion.cancelVerificarQuestion(), Matchers.containsString("True")));

    }


}