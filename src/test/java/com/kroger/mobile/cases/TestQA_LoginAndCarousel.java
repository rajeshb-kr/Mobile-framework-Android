package com.kroger.mobile.cases;


import com.kroger.mobile.ui.pages.LoginPage;
import com.kroger.mobile.ui.pages.QAPage;
import com.krogerqa.seleniumcentral.framework.main.BaseTest;
import org.testng.annotations.Test;

public class TestQA_LoginAndCarousel extends BaseTest {
    LoginPage loginPage = new LoginPage();
    QAPage qaPage = new QAPage();
    
    @Test(groups = {"smoke"}, enabled = true)
    public void tc_TestLoginCarousel() throws InterruptedException {
        loginPage.login();
        qaPage.carousel();

    }

}
