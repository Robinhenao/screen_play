package co.com.udea.certificacion.autenticacion.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/cancel_flight.feature",
        glue = "co.com.udea.certificacion.autenticacion.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class DeleteFlightPageRunner {}