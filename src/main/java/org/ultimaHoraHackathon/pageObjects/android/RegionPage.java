package org.ultimaHoraHackathon.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.ultimaHoraHackathon.utils.AndroidActions;

public class RegionPage extends AndroidActions {

    AndroidDriver driver;

    public RegionPage(AndroidDriver driver){

        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locators
    @AndroidFindBy(accessibility="Americas")
    private WebElement americasOption;

    @AndroidFindBy(accessibility ="EMEA")
    private WebElement emeaOption;

    @AndroidFindBy(xpath = "//android.widget.Button")
    private WebElement returnIcon;

    @AndroidFindBy(accessibility = "United States")
    private WebElement unitedStatesOption;

    @AndroidFindBy(accessibility = "SELECT REGION")
    private WebElement selectRegionButton;

    //Actions
    public void clickOnAmericasOption(){
        clickOnButton(americasOption);
    }

    public void clickOnAmeaOption(){
        clickOnButton(emeaOption);
    }

    public void clickOnReturnIcon(){
        clickOnButton(returnIcon);
    }

    public void clickOnUnitedStatesOption(){
        clickOnButton(unitedStatesOption);
    }

    public void clickOnSelectRegionButton(){
        clickOnButton(selectRegionButton);
    }


}
