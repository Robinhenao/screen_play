package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.udea.certificacion.autenticacion.userinterfaces.FrontPage.BUTTON_CREAR;

public class EnterThe implements Interaction {
    public EnterThe(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("hola funciona").into(BUTTON_CREAR).thenHit(Keys.RETURN));
    }

    public static EnterThe worldToFind(){
        return Tasks.instrumented(EnterThe.class);
    }
}