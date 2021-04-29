package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseMobile;
import org.aspectj.bridge.IMessage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

/**
 * This class is based in the old format of Page objects. See the package services in the new format.
 */
public class PhpHomePage extends PageBaseMobile {

    private final String ACTION_BAR_XPATH = "//*[@resource-id='android:id/action_bar']";
    private final String LOGO_ICON_ID = "com.phptravelsnative:id/main_logo";
    private final String MENU_BTN_ID = "com.phptravelsnative:id/naviIcon";
    private final String CONTACT_BTN_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]";

    public PhpHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    public void checkStat(){
        waitAndCheckElementPresent(By.id(LOGO_ICON_ID));
        Assert.assertTrue(isElementPresent(By.id(LOGO_ICON_ID)),"no se encuentra el home");
    }

    public void tapMenu(){
        clickElement(By.id(MENU_BTN_ID));

    }

    public void tapContac(){
        clickElement(By.xpath(CONTACT_BTN_XPATH));
    }



}
