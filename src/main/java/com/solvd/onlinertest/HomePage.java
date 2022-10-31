package com.solvd.onlinertest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {


    @FindBy(xpath = "//*[contains(@class, 'fast-search__input')]")
    private ExtendedWebElement searchInput;

    @FindBy(xpath = "//*[@class='auth-bar__item auth-bar__item--text']")
    private ExtendedWebElement loginButton;


//    @FindBy(xpath = "//iframe[@class='modal-iframe']")

    @FindBy(xpath = "//iframe[@class='modal-iframe']")
    private ExtendedWebElement searchiframe;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("/");
    }

    public ExtendedWebElement getSearchInput() {
        return searchInput;
    }

    public ExtendedWebElement getLoginButton() {
        return loginButton;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return new LoginPage(getDriver());
    }

    public void clickOnIframe() {
        SearchFrame searchFrame = new SearchFrame(driver);
        driver.switchTo().frame(searchiframe.getElement());
        searchFrame.clickClose();
        getDriver().switchTo().defaultContent();
    }

    public SearchFrame getIframe() {
        SearchFrame searchFrame = new SearchFrame(driver);
        driver.switchTo().frame(searchiframe.getElement());
        return searchFrame;
    }

}
