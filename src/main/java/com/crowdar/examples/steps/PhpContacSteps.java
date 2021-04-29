package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.constants.PhpMobileConstants;
import com.crowdar.examples.pages.PhpContactPage;
import com.crowdar.examples.pages.PhpHomePage;
import io.cucumber.java.en.*;

public class PhpContacSteps extends PageSteps {

    @Given("el usuario se encuentra en la home")
    public void homeVisible() {
        Injector._page(PhpHomePage.class).checkStat();
    }

    @When("el usuario tapea el menu")
    public void elUsuarioTapeaElMenu() {
        Injector._page(PhpHomePage.class).tapMenu();
    }

    @And("el usuario tapea el boton Contac Us")
    public void elUsuarioTapeaElBotonContacUs() {
        Injector._page(PhpHomePage.class).tapContac();
    }

    @And("el usuario ingresa los datos: Name (.*), Email (.*), Subject (.*) y Message (.*)")
    public void elUsuarioIngresaLosDatosNameNameEmailEmailSubjectSubjectYMessageMessage(String name, String email, String subject, String message) {
        Injector._page(PhpContactPage.class).completarFormulario(name, email, subject, message);
    }

    @And("el usuario tapea el boton Final Contac Us")
    public void elUsuarioTapeaElBotonFinalContacUs() {
        Injector._page(PhpContactPage.class).tapFinalContact();
    }

    @Then("el usuario verifica mensaje de confirmacion")
    public void elUsuarioVerificaMensajeDeConfirmacion() {

    }

}
