package org.ultimaHoraHackathon.pageObjects.android.browserPages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.ultimaHoraHackathon.utils.AndroidActions;

public class ChangeSettingsPage extends AndroidActions {

    AndroidDriver driver;

    public ChangeSettingsPage(AndroidDriver driver){

        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = ("(//android.view.View)[7]"))
    private WebElement changeSettingsModal;

    public void swapChangeSettingsModal(){
        swipeAction(changeSettingsModal, "down", 0.9f);
    }

    @AndroidFindBy(accessibility = "CONTINUE")
    private WebElement continueText;

    public void clickOnContinue(){
        clickOnButton(continueText);
    }

    @AndroidFindBy(accessibility = "SKIP")
    private WebElement skipButton;

    public void clickOnSkip(){
        clickOnButton(skipButton);
    }

    public boolean getFocusableAttribute(){

        Boolean status = Boolean.valueOf(changeSettingsModal.getAttribute("focusable"));
        return status;
    }
}
