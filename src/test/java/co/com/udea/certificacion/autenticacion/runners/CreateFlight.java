package co.com.udea.certificacion.autenticacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/create_flight.feature/",
        glue = "co.com.udea.certificacion.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CreateFlight {

}
