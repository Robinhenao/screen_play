package co.com.udea.certificacion.autenticacion.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static co.com.udea.certificacion.autenticacion.userinterfaces.SingapurAirlinesPage.FLIGHT_TABLE;

public class ShownOnThePageThe implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        WebElementFacade element= BrowseTheWeb.as(actor).find(FLIGHT_TABLE);
        return element.isVisible() ? "True" : "False";
    }

    public static ShownOnThePageThe flightListing(){
        return new ShownOnThePageThe();
    }
}