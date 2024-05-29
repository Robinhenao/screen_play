package co.com.udea.certificacion.autenticacion.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.certificacion.autenticacion.userinterfaces.SingapurAirlinesPage.FLIGHT_TABLE;
import static co.com.udea.certificacion.autenticacion.userinterfaces.SingapurAirlinesPage.MODAL_TITLE;

public class FlightInformationIs implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        WebElementFacade element= BrowseTheWeb.as(actor).find(MODAL_TITLE);
        return element.isVisible() ? "True" : "False";

    }

    public static FlightInformationIs visible(){
        return new FlightInformationIs();
    }


}
