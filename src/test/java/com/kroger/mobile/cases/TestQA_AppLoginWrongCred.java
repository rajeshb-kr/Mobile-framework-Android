package com.kroger.mobile.cases;


import com.kroger.mobile.ui.pages.LoginPage;
import com.kroger.mobile.ui.pages.QAPage;
import com.krogerqa.seleniumcentral.framework.main.BaseTest;
import org.testng.annotations.Test;

public class TestQA_AppLoginWrongCred extends BaseTest {
    LoginPage loginPage = new LoginPage();
    QAPage qaPage = new QAPage();
    
    @Test(groups = {"smoke"}, enabled = true)
    public void tc_TestInvalidCredentials() throws InterruptedException {
          loginPage.loginWrongPassword();
          loginPage.loginRightPassword();
    }

}
