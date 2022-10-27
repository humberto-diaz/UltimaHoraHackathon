package org.ultimaHoraHackathon.testUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.ultimaHoraHackathon.pageObjects.android.HomePage;
import org.ultimaHoraHackathon.utils.AppiumUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class AndroidBaseTest extends AppiumUtils {

    public AndroidDriver driver;
    public AppiumDriverLocalService service;
    public HomePage formPage;

    @BeforeClass(alwaysRun=true)
    public void ConfigureAppium() throws IOException
    {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//org//ultimaHoraHackathon//resources//data.properties");
        prop.load(fis);
        String ipAddress = System.getProperty("ipAddress")!=null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");
        String port = prop.getProperty("port");
        String appiumPath = prop.getProperty("appiumDriverPath");
        System.out.println(ipAddress);

        service = startAppiumServer(ipAddress,Integer.parseInt(port),appiumPath);


        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName(prop.getProperty("androidDeviceName"));
        options.setPlatformVersion(prop.getProperty("platformVersion"));
        options.setAutomationName("UiAutomator2");
        options.setApp(System.getProperty("user.dir")+"//src//test//java//org//ultimaHoraHackathon//resources//Elevate-1.0.apk");
        driver = new AndroidDriver(service.getUrl(), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        formPage= new HomePage(driver);
    }

    @AfterClass(alwaysRun=true)
    public void tearDown()
    {
        driver.quit();
        service.stop();
    }

}
