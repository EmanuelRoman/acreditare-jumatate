package com.fast.features;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class RegisterTests extends PageObject {

    @Managed(uniqueSession = true)
    private WebDriver driver;


}
