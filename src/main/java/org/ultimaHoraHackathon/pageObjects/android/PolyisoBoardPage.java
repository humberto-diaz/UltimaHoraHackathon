package org.ultimaHoraHackathon.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.ultimaHoraHackathon.utils.AndroidActions;

import java.io.IOException;
import java.time.Duration;

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

    public void pageScreenshot() throws IOException, TesseractException {

        waitForElementToAppear(tis901AIso95GlDoc, driver, "displayed", "true");
        getScreenshotPath("FirstPage",driver, "//pageScreenshots/");
    }

}
