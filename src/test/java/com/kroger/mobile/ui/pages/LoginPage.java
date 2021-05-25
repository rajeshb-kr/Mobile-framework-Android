package com.kroger.mobile.ui.pages;

import com.krogerqa.seleniumcentral.framework.main.MobileCommands;
import com.kroger.mobile.ui.maps.LoginMap;

public class LoginPage {

    MobileCommands mobileCommands = new MobileCommands();
    LoginMap loginMap = new LoginMap();

    public void login() {
        mobileCommands.tap(loginMap.loginBtn());
    }

    public void enterUsername(String username) {
        mobileCommands.enterText(loginMap.usernameField(), username, true);
    }

    public void enterPassword(String password) {
        mobileCommands.enterText(loginMap.passwordField(), password, true);
    }

    public void validateErrorMessage() {
        mobileCommands.assertElementExists(loginMap.errorMessage(), true);
    }

    public void okButton() {
        mobileCommands.tap(loginMap.okButton());
    }

}
