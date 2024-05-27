package co.com.udea.certificacion.autenticacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class FrontPage extends PageObject {

    public static final Target BUTTON_CREAR = Target.the("Text input").locatedBy("//INPUT[@id='no-vuelo']/self::INPUT");



}
