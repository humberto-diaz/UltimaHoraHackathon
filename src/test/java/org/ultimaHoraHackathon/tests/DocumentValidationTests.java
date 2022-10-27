package org.ultimaHoraHackathon.tests;

import org.testng.annotations.Test;
import org.ultimaHoraHackathon.pageObjects.android.HomePage;
import org.ultimaHoraHackathon.pageObjects.android.RegionPage;
import org.ultimaHoraHackathon.testUtils.AndroidBaseTest;

import static java.lang.Thread.sleep;

public class DocumentValidationTests extends AndroidBaseTest {
    RegionPage regionPage;
    HomePage homePage;
    @Test
    public void firstPage() throws InterruptedException {

        regionPage = new RegionPage(driver);
        homePage = new HomePage(driver);
        homePage.clickOnNextButton();
        regionPage.clickOnAmericasOption();
        //regionPage.clickOnReturnIcon();
        regionPage.clickOnUnitedStatesOption();
        regionPage.clickOnSelectRegionButton();
        regionPage.clickOnSelectRegionButton();
        sleep(3);

    }
}
