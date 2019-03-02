package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;



@DefaultUrl("http://qa3.fasttrackit.org:8008")
public class HomePage extends PageObject {


    private WebElementFacade myAccountButton;

    @FindBy(css = "a[title='Login']")
    private WebElementFacade logInLink;



    public void clicklogInLink(){

        clickOn(logInLink);
    }

    }

