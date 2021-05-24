package com.kroger.mobile.ui.maps;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class QAMap {

    public By nativeView(){ return MobileBy.AndroidUIAutomator("new UiSelector().text(\"Native View\")");}
    public By longPress(){ return MobileBy.AndroidUIAutomator("new UiSelector().text(\"Long Press\")");}
    public By back() { return MobileBy.AndroidUIAutomator("new UiSelector().text(\"Back\")");}
    public By longPressBtn(){ return MobileBy.AccessibilityId("longpress");}
    public By viewOneLabel(){return MobileBy.AndroidUIAutomator("new UiSelector().text(\"Native View Demo\")");}
    public By longPressLabel(){return MobileBy.AndroidUIAutomator("new UiSelector().text(\"Long Press Demo\")");}
    public By okBtn(){return By.id("android:id/button1");}

    public By loginSuccessLabel() {return MobileBy.AndroidUIAutomator("new UiSelector().text(\"Samples List\")");}
    public By verticalSwipeLabel() {return MobileBy.AndroidUIAutomator("new UiSelector().text(\"Vertical swiping\")");}

    public By carousel() {return MobileBy.AndroidUIAutomator("new UiSelector().text(\"Carousel\")");}
    public By carouselLabel() {return MobileBy.AndroidUIAutomator("new UiSelector().text(\"Carousel - Swipe left/right\")");}

}
