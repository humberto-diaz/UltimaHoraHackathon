package org.ultimaHoraHackathon.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.ultimaHoraHackathon.utils.AndroidActions;

public class MediaCenterPage extends AndroidActions {
    AndroidDriver driver;
    public MediaCenterPage(AndroidDriver driver){

        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locators
    @AndroidFindBy(xpath = "//*[contains(@content-desc,'ACCESSORIES')]")
    private WebElement accessoriesVideos;

    public void clickOnAccessoriesVideosOption(){ clickOnButton(accessoriesVideos); }

}
