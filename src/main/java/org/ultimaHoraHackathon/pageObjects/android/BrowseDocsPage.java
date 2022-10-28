package org.ultimaHoraHackathon.pageObjects.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.ultimaHoraHackathon.utils.AndroidActions;

public class BrowseDocsPage extends AndroidActions {

    AndroidDriver driver;

    public BrowseDocsPage(AndroidDriver driver){

        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Locators
    @AndroidFindBy(accessibility="Technical Information Sheets")
    private WebElement technicalInformationSheetsCategory;

    @AndroidFindBy(accessibility="MORE Tab 3 of 3")
    private WebElement moreMenu;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]")
    private WebElement frame;

    public void clickOnTechnicalInformationSheetsCategory(){
        clickOnButton(technicalInformationSheetsCategory);
    }

    public void clickOnMoreMenu(){
        driver.switchTo().frame(frame);


        clickOnButton(moreMenu);

        try {
            driver.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
