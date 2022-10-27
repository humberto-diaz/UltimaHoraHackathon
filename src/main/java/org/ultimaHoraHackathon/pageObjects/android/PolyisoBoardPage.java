package org.ultimaHoraHackathon.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.ultimaHoraHackathon.utils.AndroidActions;

public class PolyisoBoardPage extends AndroidActions {

    AndroidDriver driver;

    public PolyisoBoardPage(AndroidDriver driver){

        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = ("//android.widget.ImageView"))
    private WebElement tis901AIso95GlDoc;

    public void clickOnTis901aDoc(){
        clickOnButton(tis901AIso95GlDoc);
    }

}
