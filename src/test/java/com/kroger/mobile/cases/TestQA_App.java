package com.kroger.mobile.cases;

import com.kroger.mobile.ui.pages.QAPage;
import com.kroger.mobile.ui.pages.LoginPage;
import com.krogerqa.seleniumcentral.framework.main.BaseTest;
import org.testng.annotations.Test;

public class TestQA_App extends BaseTest {
    LoginPage loginPage = new LoginPage();
    QAPage qaPage = new QAPage();

    @Test(groups = {"smoke"}, enabled = true)
    public void tc_TestInvalidCredentials() {
        loginPage.enterPassword("admin123");
        loginPage.login();
        loginPage.validateErrorMessage();
        loginPage.okButton();
    }

    @Test(groups = {"smoke"}, enabled = true)
    public void tc_Test() {
        loginPage.login();
        qaPage.nativeView();
        qaPage.back();
        qaPage.longPress();
        qaPage.back();
    }

    @Test(groups = {"smoke"}, enabled = true)
    public void tc_TestLoginVerticalSwipe() {
        loginPage.login();
        qaPage.loginSuccessLabel();
        qaPage.verticalSwipe();
        qaPage.scrollDown();
        qaPage.back();
    }

    @Test(groups = {"smoke"}, enabled = true)
    public void tc_TestLoginCarousel() {
        loginPage.login();
        qaPage.loginSuccessLabel();
        qaPage.scrollDown();
        qaPage.carousel();
        qaPage.swipeRight();
        qaPage.swipeRight();
        qaPage.swipeLeft();
        qaPage.back();
    }

}