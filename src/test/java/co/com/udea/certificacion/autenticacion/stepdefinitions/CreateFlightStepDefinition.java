package co.com.udea.certificacion.autenticacion.stepdefinitions;

import co.com.udea.certificacion.autenticacion.tasks.EnterDataFormCreate;
import co.com.udea.certificacion.autenticacion.tasks.OpenFormCreate;
import co.com.udea.certificacion.autenticacion.tasks.OpenThe;
import co.com.udea.certificacion.autenticacion.userinterfaces.FrontPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class CreateFlightStepDefinition {

    public Actor admin= Actor.named("admin");

    @Managed(driver = "chrome", uniqueSession = true)
    public WebDriver theDriver;

    @Before
    public void setup(){
        admin.can(BrowseTheWeb.with(theDriver));
        setTheStage(new OnlineCast());
    }

    @Given("que ingrese a la pagina web y pulse el boton de crear vuelo")
    public void queIngreseALaPaginaWebYPulseElBotonDeCrearVuelo() {
        admin.attemptsTo(OpenThe.browser(new FrontPage()));
        admin.attemptsTo(OpenFormCreate.openFormCreate());
    }

    @When("ingreso la informacion obligatoria requerida en los campos del formulario")
    public void ingresoLaInformacionObligatoriaRequeridaEnLosCamposDelFormulario() {
        admin.attemptsTo(EnterDataFormCreate.enterFormData());
    }

    @Then("el sistema confirma que el vuelo fue creado exitosamente")
    public void elSistemaConfirmaQueElVueloFueCreadoExitosamente() {

    }

}
