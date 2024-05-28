package co.com.udea.certificacion.autenticacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.core.pages.WebElementFacade;

import static co.com.udea.certificacion.autenticacion.userinterfaces.FrontPage.ALERT_CREATION;

public class CreateConfirmQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        WebElementFacade element = BrowseTheWeb.as(actor).find(ALERT_CREATION);
        return element.isVisible() ? "True" : "False";
    }

    public static CreateConfirmQuestion withLocator() {
        return new CreateConfirmQuestion();
    }
}