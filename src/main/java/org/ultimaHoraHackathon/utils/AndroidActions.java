package org.ultimaHoraHackathon.utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import sun.misc.BASE64Decoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class AndroidActions extends AppiumUtils{

    AndroidDriver driver;

    public AndroidActions(AndroidDriver driver)
    {

        this.driver = driver;
    }

    public void scrollToText(String text)
    {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
    }

    public void clickOnButton(WebElement element)
    {
        element.click();
    }

    public void swipeAction(WebElement ele,String direction, Float percent)
    {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement)ele).getId(),

                "direction", direction,
                "percent", percent
        ));
    }

    public void getScreenshotPath(String testCaseName, AppiumDriver driver, String path) throws IOException
    {
        String source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
        String destinationFile = System.getProperty("user.dir")+ path + testCaseName+".png";
        // Code
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] decodedBytes = decoder.decodeBuffer(source);

        File file = new File(destinationFile);;
        FileOutputStream fop = new FileOutputStream(file);

        fop.write(decodedBytes);
        fop.flush();
        fop.close();
        //FileUtils.copyFile(source, new File("image.png"));
        //1. capture and place in folder //2. extent report pick file and attach to report
    }


}
