package org.ultimaHoraHackathon.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.io.File;

public class AppiumUtils {

    public AppiumDriverLocalService service;


    public AppiumDriverLocalService startAppiumServer(String ipAddress, int port, String appiumPath)
    {
        service = new AppiumServiceBuilder().withAppiumJS(new File(appiumPath))
                .withIPAddress(ipAddress).usingPort(port).withArgument(GeneralServerFlag.BASEPATH,"/wd/hub/").build();
        service.start();
        return service;
    }

    public void waitForElementToAppear(WebElement ele, AppiumDriver driver, String atrribute, String value)
    {
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
    }

}
