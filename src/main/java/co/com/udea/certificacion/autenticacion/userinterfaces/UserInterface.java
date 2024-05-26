package co.com.udea.certificacion.autenticacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UserInterface extends PageObject {
    private UserInterface(){}

    public static final Target INPUT_TEXT = Target.the("Text input").located(By.name(""));


}