package com.kroger.mobile.ui.maps;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginMap {

    public By usernameField() { return MobileBy.AccessibilityId("username");}
    public By passwordField() { return MobileBy.AccessibilityId("password");}
    public By loginBtn() { return MobileBy.AndroidUIAutomator("new UiSelector().text(\"LOG IN\")");}
    public By errorMessage() { return By.id("android:id/message");}
    public By okButton() {return By.id("android:id/button1");}
}

