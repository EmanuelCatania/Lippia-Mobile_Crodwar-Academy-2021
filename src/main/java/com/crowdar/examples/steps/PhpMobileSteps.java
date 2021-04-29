package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.core.pageObjects.PageBase;
import com.crowdar.examples.constants.PhpMobileConstants;
import com.crowdar.examples.pages.PhpMobilePage;
import com.crowdar.examples.services.PhpMobileService;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class PhpMobileSteps extends PageSteps {

    @Given("el usuario se encuentra en la home de la app")
    public void isHomePageVisible() {
        Injector._page(PhpMobilePage.class).checkStat(PhpMobileConstants.LOGO_ICON_ID);
    }

    @When("el usuario tapea el icono VISA")
    public void iniciarReserva() {
        PhpMobileService.tapVisaButton();
    }

    @And("el usuario completa los datos desde <salida> hasta <llegada>")
    public  void  destinySelect(){
        Injector._page(PhpMobilePage.class).tapDestiny(PhpMobileConstants.FROM_INPUT_ID, PhpMobileConstants.ARG_VALUE_XPATH);
        Injector._page(PhpMobilePage.class).tapDestiny(PhpMobileConstants.TO_INPUT_ID, PhpMobileConstants.SPN_VALUE_XPATH);
    }

    @And("el usuario completa el campo nombre: (.*), apellido (.*), email (.*), celular (.*), notas (.*)")
    public void  datosPersonales(String nombre, String apellido, String email, String celular, String notas){
        Injector._page(PhpMobilePage.class).datosPrivados(nombre, apellido, email, celular, notas);
    }

    @And("el usuario tapea el boton SUMBIT")
    public void submitBtn(){
        Injector._page(PhpMobilePage.class).submitReserva();
    }

    @Then("el usuario verifica que se realizo correctamente la reserva")
    public void verificarReserva(){
        Injector._page(PhpMobilePage.class).checkStat(PhpMobileConstants.CHECK_OK_IMAGE_ID);
    }

}
