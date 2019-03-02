package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://http://qa3.fasttrackit.org:8008/my-account/")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "login")
    private WebElementFacade loginButton;

    @FindBy(css = ".welcome-msg strong")
    private WebElementFacade welcomeMessageStrong;



    public void setEmailField(){
        waitFor(emailField);
        typeInto(emailField,"gbyea07@gmail.com");
    }

    public void setPasswordField(){
        waitFor(passwordField);
        typeInto(passwordField, "parolaexamen");
    }

    public void invalidCharacters(){
        typeInto (emailField,"asada@sepoate.com");
        typeInto (passwordField, "parol");

    }




    public void login() {
        clickOn(loginButton, "login");

    }

    private void clickOn(WebElementFacade loginButton, String login) {
    }


    public void validAdminCharachters() {
        waitFor (emailField);
        typeInto (emailField, "admin");
        waitFor (passwordField);
        typeInto (passwordField, "parola11");
    }






  //  public boolean checkLoggedIn(){

    //    return welcomeMessageStrong.containsText("Hello gbyea07 (not gbyea07? Log out)");
    }
//}

