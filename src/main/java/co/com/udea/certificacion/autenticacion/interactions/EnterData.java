package co.com.udea.certificacion.autenticacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.udea.certificacion.autenticacion.userinterfaces.FrontPage.*;

public class EnterData  implements Interaction {
    public EnterData(){}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("ASB-123").into(CREATE_NUMERO_VUELO));
        actor.attemptsTo(Enter.theValue("Internacional").into(CREATE_TIPO_VUELO));
        actor.attemptsTo(Enter.theValue("1").into(CREATE_AEROPUERTO_ORIGEN));
        actor.attemptsTo(Enter.theValue("2").into(CREATE_AEROPUERTO_DESTINO));
        actor.attemptsTo(Enter.theValue("2").into(CREATE_TIPO_AVION));
        actor.attemptsTo(Enter.theValue("2024-05-27T15:30").into(CREATE_FECHAS_SALIDA));
        actor.attemptsTo(Enter.theValue("2024-05-28T15:30").into(CREATE_FECHAS_LLEGADA));
        actor.attemptsTo(Enter.theValue("20000").into(CREATE_PRECIO));
        actor.attemptsTo(Enter.theValue("120").into(CREATE_PASAJEROS));
        actor.attemptsTo(Enter.theValue("5.2").into(CREATE_SOBRETASA));
        actor.attemptsTo(Enter.theValue("10.5").into(CREATE_IMPUESTO));
        actor.attemptsTo(Click.on(BUTTON_GUARDAR));
    }

    public static EnterData enterData(){
        return Tasks.instrumented(EnterData.class);
    }
}
