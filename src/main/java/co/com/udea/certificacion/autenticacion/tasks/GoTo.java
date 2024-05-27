package co.com.udea.certificacion.autenticacion.tasks;


import co.com.udea.certificacion.autenticacion.interactions.EnterIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GoTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterIn.singapurAirlinesPage());
    }

    public static GoTo managementPage(){
        return Tasks.instrumented(GoTo.class);
    }
}
