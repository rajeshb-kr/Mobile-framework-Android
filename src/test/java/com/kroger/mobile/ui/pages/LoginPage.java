package com.kroger.mobile.ui.pages;

import com.krogerqa.seleniumcentral.framework.main.MobileCommands;
import com.kroger.mobile.ui.maps.LoginMap;

public class LoginPage{

    MobileCommands mobileCommands = new MobileCommands();
    LoginMap loginMap = new LoginMap();


public void login(){
   mobileCommands.tap(loginMap.loginBtn());
}

public void loginWrongPassword() {
    mobileCommands.enterText(loginMap.passwordField(), "admin123", true);
    mobileCommands.tap(loginMap.loginBtn());
    mobileCommands.assertElementExists(loginMap.errorMessage(), true);
    mobileCommands.tap(loginMap.okButton());
}
public void loginRightPassword() {
    mobileCommands.enterText(loginMap.passwordField(), "admin", true);
    mobileCommands.tap(loginMap.loginBtn());
}

}
