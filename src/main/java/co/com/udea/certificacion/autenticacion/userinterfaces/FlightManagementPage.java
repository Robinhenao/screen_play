package co.com.udea.certificacion.autenticacion.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightManagementPage {
    public static final Target BUTTON_CANCEL = Target.the("BUTTON CANCEL").located(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[12]/button[3]"));
    public static final Target BUTTON_CONFIRMAR = Target.the("BUTTON CONFIRMAR").located(By.xpath("/html/body/div[2]/div/div/div/form/div/button[2]"));
    public static final Target ALERT_CANCEL = Target.the("ALERT").locatedBy("//DIV[text()='Flight successfully cancelled']/self::DIV");
}