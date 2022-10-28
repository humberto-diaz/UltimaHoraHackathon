package org.ultimaHoraHackathon.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.ultimaHoraHackathon.utils.AndroidActions;

public class AccessoriesVideosPage extends AndroidActions {

    AndroidDriver driver;

    public AccessoriesVideosPage(AndroidDriver driver){

        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locators
    @AndroidFindBy(xpath = "//*[contains(@content-desc,'Pourable')]")
    private WebElement firstVideo;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='01:00']/android.widget.ImageView[2]")
    private WebElement playIcon;

    public void clickOnFirstVideo(){ clickOnButton(firstVideo); }

    public void clickOnPlayIcon(){ clickOnButton(playIcon); }
}
