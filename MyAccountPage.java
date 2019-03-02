package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class MyAccountPage extends PageObject {


    @FindBy(css = ".welcome-msg strong")
    private WebElementFacade welcomeMessageStrong;


    public boolean checkLoggedIn(){

        boolean b = welcomeMessageStrong.containsText ("Hello gbyea07 (not gbyea07? Log out)");
        return b;
    }

    @FindBy (css = "menupop with-avatar")
    private WebElementFacade HowdyAdminLink;

    @FindBy (css = "My account")
    private WebElementFacade MyAccountButton;

    public void clickOnMyAccountButton(){

        clickOn (MyAccountButton, "My account");
    }

    private void clickOn(WebElementFacade myAccountButton, String my_account) {
    }
}

