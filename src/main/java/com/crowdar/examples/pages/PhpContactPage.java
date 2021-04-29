package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class PhpContactPage extends PageBaseMobile {
    public final String NAME_INPUT_ID = "com.phptravelsnative:id/input_name";
    public final String EMAIL_INPUT_ID = "com.phptravelsnative:id/input_email";
    public final String SUBJECT_INPUT_ID = "com.phptravelsnative:id/input_subject";
    public final String MESSAGE_INPUT_ID = "com.phptravelsnative:id/input_message";
    public final String CONTAC_BTN_ID = "com.phptravelsnative:id/btn_signup";

    public PhpContactPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void completarFormulario(String name, String email, String subject, String message){
        completeField(By.id(NAME_INPUT_ID), name);
        completeField(By.id(EMAIL_INPUT_ID), email);
        completeField(By.id(SUBJECT_INPUT_ID), subject);
        completeField(By.id(MESSAGE_INPUT_ID), message);
    }

    public void tapFinalContact(){
        clickElement(By.id(CONTAC_BTN_ID));
    }

}
