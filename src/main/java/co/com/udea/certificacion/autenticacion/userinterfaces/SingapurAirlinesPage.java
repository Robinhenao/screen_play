package co.com.udea.certificacion.autenticacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SingapurAirlinesPage extends PageObject {
    public static final Target MANAGE_FLIGHTS_BUTTON = Target.the("MANAGE FLIGHTS BUTTON").locatedBy("/html/body/section/div/div/a");
    public static final Target FLIGHT_NUMBER = Target.the("FLIGHT NUMBER").locatedBy("/html/body/div[2]/table/tbody/tr[1]/td[1]");


}