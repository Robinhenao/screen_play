package co.com.udea.certificacion.autenticacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class FrontPage extends PageObject {

    public static final Target BUTTON_CREAR = Target.the("BUTTON").locatedBy("//BUTTON[@class='rounded-full bg-gray-700 px-8 py-2.5 leading-5 text-white transition-colors duration-300 hover:bg-gray-600 focus:bg-gray-600 focus:outline-none'][text()='Crear vuelo']/self::BUTTON");

    public static final Target CREATE_NUMERO_VUELO = Target.the("INPUT TEXT").locatedBy("//INPUT[@id='numeroVuelo']/self::INPUT");
    public static final Target CREATE_TIPO_VUELO = Target.the("INPUT TEXT").locatedBy("//INPUT[@id='tipoVuelo']/self::INPUT");
    public static final Target CREATE_AEROPUERTO_ORIGEN = Target.the("INPUT TEXT").locatedBy("//INPUT[@id='idAeropuertoOrigen']/self::INPUT");
    public static final Target CREATE_AEROPUERTO_DESTINO = Target.the("INPUT TEXT").locatedBy("//INPUT[@id='idAeropuertoDestino']/self::INPUT");
    public static final Target CREATE_TIPO_AVION = Target.the("INPUT TEXT").locatedBy("//INPUT[@id='idTipoAvion']/self::INPUT");
    public static final Target CREATE_FECHAS_SALIDA = Target.the("INPUT DATETIME").locatedBy("//INPUT[@id='fechaSalida']/self::INPUT");
    public static final Target CREATE_FECHAS_LLEGADA = Target.the("INPUT DATETIME").locatedBy("//INPUT[@id='fechaLlegada']/self::INPUT");
    public static final Target CREATE_PRECIO = Target.the("INPUT TEXT").locatedBy("//INPUT[@id='precio']/self::INPUT");
    public static final Target CREATE_PASAJEROS = Target.the("INPUT TEXT").locatedBy("//INPUT[@id='cantidadPasajeros']/self::INPUT");
    public static final Target CREATE_SOBRETASA = Target.the("INPUT TEXT").locatedBy("//INPUT[@id='sobretasa']/self::INPUT");
    public static final Target CREATE_IMPUESTO = Target.the("INPUT TEXT").locatedBy("//INPUT[@id='porcentajeImpuestos']/self::INPUT");


    public static final Target BUTTON_GUARDAR = Target.the("BUTTON").locatedBy("//BUTTON[@type='submit'][text()='Guardar']/self::BUTTON");

    public static final Target ALERT_CREATION = Target.the("ALERT").locatedBy("//DIV[text()='Flight created successfully']/self::DIV");



}
