package co.com.udea.certificacion.autenticacion.tasks;

import co.com.udea.certificacion.autenticacion.interactions.PushButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class OpenFormCreate implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(PushButton.pushButton());
    }

    public static OpenFormCreate openFormCreate(){
        return Tasks.instrumented(OpenFormCreate.class);
    }
}
