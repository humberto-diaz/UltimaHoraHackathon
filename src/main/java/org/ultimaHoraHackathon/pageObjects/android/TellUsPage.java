package org.ultimaHoraHackathon.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.ultimaHoraHackathon.utils.AndroidActions;

public class TellUsPage extends AndroidActions {

    AndroidDriver driver;

    public TellUsPage(AndroidDriver driver){

        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.Button")
    private WebElement returnIcon;

    @AndroidFindBy(accessibility ="Architect")
    private WebElement profileOption;

    @AndroidFindBy(accessibility ="START USING THE APP")
    private WebElement startUsingTheAppButton;


    public void clickOnReturnIcon(){
        clickOnButton(returnIcon);
    }

    public void clickOnArchitectProfile(){
        clickOnButton(profileOption);
    }

    public void clickOnStartTheAppButton(){
        clickOnButton(startUsingTheAppButton);
    }

}
