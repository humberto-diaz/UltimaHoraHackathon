package org.ultimaHoraHackathon.tests;

import org.testng.annotations.Test;
import org.ultimaHoraHackathon.pageObjects.android.HomePage;
import org.ultimaHoraHackathon.testUtils.AndroidBaseTest;

public class DocumentValidationTests extends AndroidBaseTest {

    @Test
    public void firstPage(){

        HomePage homePage = new HomePage(driver);
        homePage.clickOnNextButton();
    }
}
