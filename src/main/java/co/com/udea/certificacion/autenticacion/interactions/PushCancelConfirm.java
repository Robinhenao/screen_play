package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.udea.certificacion.autenticacion.userinterfaces.FlightManagementPage.BUTTON_CANCEL;
import static co.com.udea.certificacion.autenticacion.userinterfaces.FlightManagementPage.BUTTON_CONFIRMAR;
import static co.com.udea.certificacion.autenticacion.userinterfaces.FrontPage.BUTTON_CREAR;
import static co.com.udea.certificacion.autenticacion.userinterfaces.SingapurAirlinesPage.MANAGE_FLIGHTS_BUTTON;

public class PushCancelConfirm implements Interaction {
    public PushCancelConfirm() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_CANCEL));
        actor.attemptsTo(Click.on(BUTTON_CONFIRMAR));
    }

    public static PushCancelConfirm pushCancelConfirm() {
        return Tasks.instrumented(PushCancelConfirm.class);
    }
}
