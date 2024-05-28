package co.com.udea.certificacion.autenticacion.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.certificacion.autenticacion.userinterfaces.FlightManagementPage.ALERT_CANCEL;
import static co.com.udea.certificacion.autenticacion.userinterfaces.FrontPage.ALERT_CREATION;

public class CancelVerificarQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        WebElementFacade element = BrowseTheWeb.as(actor).find(ALERT_CANCEL);
        return element.isVisible() ? "True" : "False";
    }

    public static  CancelVerificarQuestion  cancelVerificarQuestion() {
        return new CancelVerificarQuestion();
    }
}
