package com.crowdar.examples.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.core.pageObjects.CucumberPageBase;
import com.crowdar.core.pageObjects.PageBaseMobile;
import com.crowdar.examples.constants.PhpMobileConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.Driver;


public class PhpMobileService extends MobileActionManager {

    public static void isViewLoaded() {
        //Assert.assertTrue(MobileActionManager.isVisible(PhpMobileConstants.LOGO_ICON_ID), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void tapVisaButton(){
        click(PhpMobileConstants.VISA_BUTTON_ACCESSIBILITY_ID);
    }


}
