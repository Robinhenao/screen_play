package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.udea.certificacion.autenticacion.userinterfaces.SingapurAirlinesPage.BUTTON_SEARCH;
import static co.com.udea.certificacion.autenticacion.userinterfaces.SingapurAirlinesPage.INPUT_FLIGHT_NUMBER;


public class EnterThe implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("vue-123").into(INPUT_FLIGHT_NUMBER).thenHit(Keys.RETURN));
        actor.attemptsTo(Click.on(BUTTON_SEARCH));
    }

    public static EnterThe flightNumber(){
        return Tasks.instrumented(EnterThe.class);
    }

}