package com.solvd.web;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.onlinertest.HomePage;
import com.solvd.onlinertest.LoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest implements IAbstractTest {

    @Test
    public void test() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        LoginPage loginPage = homePage.clickLoginButton();
        loginPage.typeInNameInput("name1");
        loginPage.typeInPasswordInput("pwd1");
        System.out.println();
        loginPage.getSubmitButton().click();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(loginPage.getSubmitButton().isElementPresent(), "Submit button not aviable");
//        iAmNotARobotPage.getReCaptchaCheckBox();
//        sa.assertTrue(iAmNotARobotPage.getReCaptchaCheckBox().isElementPresent(), "checkbox not aviable");
        System.out.println();
//        assert iAmNotARobotPage.getReCaptcha().isElementPresent();
//        SoftAssert sa = new SoftAssert();
//        sa.assertTrue(iAmNotARobotPage.getReCaptcha().isElementPresent());
        sa.assertAll();
        System.out.println();
    }
}
