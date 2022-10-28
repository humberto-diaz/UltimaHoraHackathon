package org.ultimaHoraHackathon.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.ultimaHoraHackathon.utils.AndroidActions;

public class MoreMenuPage extends AndroidActions {

    AndroidDriver driver;

    public MoreMenuPage(AndroidDriver driver){

        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locators
    @AndroidFindBy(accessibility="Media Center")
    private WebElement mediaCenter;

    public void clickOnMediaCenterOption(){ clickOnButton(mediaCenter);
    }
}
