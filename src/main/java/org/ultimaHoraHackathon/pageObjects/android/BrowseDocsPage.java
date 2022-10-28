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

    @AndroidFindBy(xpath = "//*[contains(@content-desc,'MORE')]")
    private WebElement moreMenu;

    public void clickOnTechnicalInformationSheetsCategory(){
        clickOnButton(technicalInformationSheetsCategory);
    }

    public void clickOnMoreMenu(){ clickOnButton(moreMenu);  }

}
