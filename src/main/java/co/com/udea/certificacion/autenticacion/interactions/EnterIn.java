package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.certificacion.autenticacion.userinterfaces.SingapurAirlinesPage.MANAGE_FLIGHTS_BUTTON;


public class EnterIn implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MANAGE_FLIGHTS_BUTTON));
    }

    public static EnterIn singapurAirlinesPage(){
        return Tasks.instrumented(EnterIn.class);
    }
}