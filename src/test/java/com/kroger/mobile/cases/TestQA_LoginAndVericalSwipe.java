package com.kroger.mobile.cases;


import com.kroger.mobile.ui.pages.LoginPage;
import com.kroger.mobile.ui.pages.QAPage;
import com.krogerqa.seleniumcentral.framework.main.BaseTest;
import org.testng.annotations.Test;

public class TestQA_LoginAndVericalSwipe extends BaseTest {
    LoginPage loginPage = new LoginPage();
    QAPage qaPage = new QAPage();
    
    @Test(groups = {"smoke"}, enabled = true)
    public void tc_TestLoginVerticalSwipe() throws InterruptedException {
        loginPage.login();
        qaPage.verticalSwipe();
    }

}
