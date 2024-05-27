package co.com.udea.certificacion.autenticacion.tasks;

import co.com.udea.certificacion.autenticacion.interactions.EnterData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EnterDataFormCreate implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterData.enterData());
    }

    public static EnterDataFormCreate enterFormData(){
        return Tasks.instrumented(EnterDataFormCreate.class);
    }
}
