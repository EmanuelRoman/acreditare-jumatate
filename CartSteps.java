package com.fast.steps.serenity;

import com.fast.pages.CartPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.StepGroup;
import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps {
    HomePage homePage;
    LoginPage loginPage;
    CartPage cartPage;



    public void clickOnAddToCartButton() {
    }

    public void clickOnQuantityButton() {
    }
    @Step
    public void pushOnUpdateCartButton() {
        cartPage.pushOnUpdateCartButton ();
    }

    public void clickOnProceedToCheckoutButton() {
    }

    public void pushOnAddToCartButton(){

    }
    @Step
    public void clickOnCartLink() {
        cartPage.clickOnCartLink();
    }

}

