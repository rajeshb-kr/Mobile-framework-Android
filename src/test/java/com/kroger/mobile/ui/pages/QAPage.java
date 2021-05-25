package com.kroger.mobile.ui.pages;

import com.kroger.mobile.ui.maps.QAMap;
import com.krogerqa.seleniumcentral.framework.main.MobileCommands;

import java.util.HashMap;

public class QAPage {

    private MobileCommands mobileCommands = new MobileCommands();
    private QAMap qaMap = new QAMap();
    

    public void nativeView() {
        mobileCommands.tap(qaMap.nativeView());
        mobileCommands.assertElementExists(qaMap.viewOneLabel(),true);
    }

    public void back(){
        mobileCommands.tap(qaMap.back());
    }

    public void scrollDown() {
        mobileCommands.scrollDown();
    }

    public void swipeRight() {
        mobileCommands.swipeRight();
    }

    public void swipeLeft() {
        mobileCommands.swipeLeft();
    }
    public void longPress (){
        mobileCommands.tap(qaMap.longPress());
        mobileCommands.assertElementExists(qaMap.longPressLabel(),true);
        mobileCommands.longTapOnElement(qaMap.longPressBtn());
        mobileCommands.tap(qaMap.okBtn());

    }
    public void loginSuccessLabel() {
        mobileCommands.waitForElementVisibility(qaMap.loginSuccessLabel());
    }

    public void verticalSwipe () {
        mobileCommands.tap(qaMap.verticalSwipeLabel());
        mobileCommands.assertElementExists(qaMap.verticalSwipeLabel(), true);
    }

    public void carousel () {
        mobileCommands.tap(qaMap.carousel());
        mobileCommands.assertElementExists(qaMap.carouselLabel(), true);
    }

}
