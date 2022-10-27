package org.ultimaHoraHackathon.pageObjects.android.nativePages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.ultimaHoraHackathon.utils.AndroidActions;

public class LocationAccessPage extends AndroidActions {

    AndroidDriver driver;

    public LocationAccessPage(AndroidDriver driver){

        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_one_time_button")
    private WebElement onlyThisTimeOption;

    public void clickOnOnlyThisTimeOption(){
        clickOnButton(onlyThisTimeOption);
    }
}
