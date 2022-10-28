package org.ultimaHoraHackathon.tests;

import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.ultimaHoraHackathon.pageObjects.android.*;
import org.ultimaHoraHackathon.pageObjects.android.browserPages.ChangeSettingsPage;
import org.ultimaHoraHackathon.pageObjects.android.nativePages.LocationAccessPage;
import org.ultimaHoraHackathon.testUtils.AndroidBaseTest;

import java.time.Duration;

public class VideoValidationTests extends AndroidBaseTest {

    RegionPage regionPage;
    HomePage homePage;
    TellUsPage tellUsPage;
    LocationAccessPage locationAccessPage;
    ChangeSettingsPage changeSettingsPage;

    BrowseDocsPage browseDocsPage;
    TISPage tisPage;
    InsulationPage insulationPage;
    PolyisoBoardPage polyisoBoardPage;

    MoreMenuPage moreMenuPage;

    @Test
    public void VideoValidationTests() throws InterruptedException {

        regionPage = new RegionPage(driver);
        homePage = new HomePage(driver);
        tellUsPage = new TellUsPage(driver);
        locationAccessPage = new LocationAccessPage(driver);
        changeSettingsPage = new ChangeSettingsPage(driver);
        browseDocsPage = new BrowseDocsPage(driver);
        tisPage = new TISPage(driver);
        insulationPage = new InsulationPage(driver);
        polyisoBoardPage = new PolyisoBoardPage(driver);
        moreMenuPage = new MoreMenuPage(driver);

        homePage.clickOnNextButton();
        regionPage.clickOnAmericasOption();
        regionPage.clickOnUnitedStatesOption();
        regionPage.clickOnSelectRegionButton();
        tellUsPage.clickOnArchitectProfile();
        tellUsPage.clickOnStartTheAppButton();
        locationAccessPage.clickOnOnlyThisTimeOption();
        Assert.assertEquals(changeSettingsPage.getFocusableAttribute(),true);
        changeSettingsPage.swapChangeSettingsModal();
        Assert.assertEquals(changeSettingsPage.getFocusableAttribute(),false);
        //browseDocsPage.clickOnMoreMenu();
        //moreMenuPage.clickOnMediaCenterOption();







    }
}
