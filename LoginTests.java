package com.fast.features;

import com.fast.pages.MyAccountPage;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.MyAccountSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.thucydides.core.pages.PageObject;

@RunWith(SerenityRunner.class)
public class LoginTests extends PageObject {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    MyAccountSteps myAccountSteps;

    @Test
    public void validLoginTest(){
       loginSteps.navigateToHomepage();
       loginSteps.goToLogin();
       loginSteps.setUser();
       loginSteps.setPassword();
       loginSteps.submit ();
//       loginSteps.checkLoggedIn();

    }
    @Test
    public void invalidLoginTest(){
        loginSteps.navigateToHomepage();
        loginSteps.goToLogin();
        loginSteps.loginWithInvalidCharacters();
        loginSteps.submit ();

    }


    }


