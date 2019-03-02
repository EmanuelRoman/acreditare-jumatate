package com.fast.features;

import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.LoginSteps;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class  CartTests extends PageObject {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    LoginSteps loginSteps;

    @Steps
    CartSteps cartSteps;

    @Test
    public void UpdateCart() {
        loginSteps.login();
        cartSteps.clickOnCartLink();
        cartSteps.pushOnUpdateCartButton ();
        cartSteps.clickOnProceedToCheckoutButton ();
        cartSteps.clickOnAddToCartButton ();
        cartSteps.pushOnAddToCartButton();
    }

}
