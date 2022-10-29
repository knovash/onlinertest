package com.solvd.onlinertest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//*[@type='text' and @class='auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full']")
    private ExtendedWebElement nameInput;

    @FindBy(xpath = "//*[@type='password' and @class='auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full']")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//*[@type='submit' and @class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']")
    private ExtendedWebElement submitButton;

    @FindBy(xpath = "//iframe[@title='reCAPTCHA']")
    private ExtendedWebElement iframe;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void typeInNameInput(String text) {
        nameInput.type(text);
    }

    public void typeInPasswordInput(String text) {
        passwordInput.type(text);
    }


    public ExtendedWebElement getSubmitButton() {
        return submitButton;
    }

    public ExtendedWebElement getIframe() {
        return iframe;
    }
}
