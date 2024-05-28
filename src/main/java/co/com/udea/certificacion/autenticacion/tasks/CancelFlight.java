package co.com.udea.certificacion.autenticacion.tasks;

import co.com.udea.certificacion.autenticacion.interactions.PushCancelConfirm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CancelFlight implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(PushCancelConfirm.pushCancelConfirm());
    }

    public static CancelFlight cancelFlight(){
        return Tasks.instrumented(CancelFlight.class);
    }
}
