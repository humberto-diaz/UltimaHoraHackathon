package org.ultimaHoraHackathon.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.ultimaHoraHackathon.pageObjects.android.*;
import org.ultimaHoraHackathon.pageObjects.android.browserPages.ChangeSettingsPage;
import org.ultimaHoraHackathon.pageObjects.android.nativePages.LocationAccessPage;
import org.ultimaHoraHackathon.testUtils.AndroidBaseTest;

import static java.lang.Thread.sleep;

public class DocumentValidationTests extends AndroidBaseTest {
    RegionPage regionPage;
    HomePage homePage;
    TellUsPage tellUsPage;
    LocationAccessPage locationAccessPage;
    ChangeSettingsPage changeSettingsPage;

    BrowseDocsPage browseDocsPage;
    TISPage tisPage;
    @Test
    public void firstPage() throws InterruptedException {

        regionPage = new RegionPage(driver);
        homePage = new HomePage(driver);
        tellUsPage = new TellUsPage(driver);
        locationAccessPage = new LocationAccessPage(driver);
        changeSettingsPage = new ChangeSettingsPage(driver);
        browseDocsPage = new BrowseDocsPage(driver);
        tisPage = new TISPage(driver);

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
        browseDocsPage.clickOnTechnicalInformationSheetsCategory();
        tisPage.clickOnInsolationOption();

        sleep(3);
    }
}
