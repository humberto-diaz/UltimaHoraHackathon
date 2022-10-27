package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;

public class Driver {

    public static AppiumDriver<MobileElement> driver;


    @BeforeTest
    public void setup(){

        try {

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "motorola one fusion");
            caps.setCapability(MobileCapabilityType.UDID, "ZE222CCJ9N");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            caps.setCapability(MobileCapabilityType.APP, "/Users/julianavelasquez/Documents/GitHub/UltimaHoraHackathon/src/test/resources/apps/Elevate-1.0.apk");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new AppiumDriver<MobileElement>(url, caps);

        } catch (Exception exp) {
            System.out.println("Cause is: " + exp.getCause());
            System.out.println("Message is: " + exp.getMessage());
            exp.printStackTrace();
        }

    }
    @Test
    public void sampleTest(){
        System.out.println("Just checking...");
    }

   @AfterSuite
    public void teardown(){
        driver.close();
        driver.quit();
    }

}
