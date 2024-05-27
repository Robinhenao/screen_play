package co.com.udea.certificacion.autenticacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static co.com.udea.certificacion.autenticacion.userinterfaces.SingapurAirlinesPage.FLIGHT_NUMBER;

public class ShownOnThePageThe implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        String msg = BrowseTheWeb.as(actor).find(FLIGHT_NUMBER).getText();
        return msg;
    }

    public static ShownOnThePageThe flightListing(){
        return new ShownOnThePageThe();
    }
}