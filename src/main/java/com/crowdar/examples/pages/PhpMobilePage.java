package com.crowdar.examples.pages;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.core.pageObjects.PageBaseMobile;
import com.crowdar.examples.constants.PhpMobileConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sun.awt.ScrollPaneWheelScroller;

/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class PhpMobilePage extends PageBaseMobile {

    private final String ACTION_BAR_XPATH = "//*[@resource-id='android:id/action_bar']";
    private final String TEXT_VIEW_XPATH = "//android.widget.TextView";

    public PhpMobilePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public String getTitle() {
        return getWebElement(By.xpath(ACTION_BAR_XPATH)).findElement(By.xpath(TEXT_VIEW_XPATH)).getText();
    }

    private WebElement getMenuElement(String menu) {
        return getWebElement(By.xpath("//android.widget.TextView[@content-desc=" + "\"" + menu + "\"" + "]"));
    }

    public void clickMenuElement(String menu) {
        WebElement element = getMenuElement(menu);
        clickElement(By.id(String.valueOf(element)));
    }

    public void checkStat(String locator){
        waitAndCheckElementPresent(By.id(locator));
    }

    public void tapDestiny(String FROM, String COUNTRY) {
        clickElement(By.id(FROM));
        if (FROM == PhpMobileConstants.TO_INPUT_ID){
            clickElement(By.id(PhpMobileConstants.SRCH_BUTN_ID));
            completeField(By.id(PhpMobileConstants.SRCH_BUTN_ID), "Spain");
            clickElement(By.xpath(COUNTRY));
        }else {
            clickElement(By.xpath(COUNTRY));
        }
    }

    public void datosPrivados(String nombre,String apellido,String email,String celular,String notas){
        completeField(By.id(PhpMobileConstants.NAME_INPUT_ID), nombre);
        completeField(By.id(PhpMobileConstants.LNAME_INPUT_ID),apellido);
        completeField(By.id(PhpMobileConstants.EMAIL_INPUT_ID), email);
        completeField(By.id(PhpMobileConstants.PHONE_INPUT_ID), celular);
        completeField(By.id(PhpMobileConstants.DESCR_INPUT_ID), notas);
    }
    public void submitReserva(){
        clickElement(By.id(PhpMobileConstants.CHECK_BUTTON_ID));
    }

}
