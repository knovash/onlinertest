package com.solvd.onlinertest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {


//    (xpath = ".//*[contains(@class, 'fast-search__input')]//span[text()]")
//    @FindBy(id = "twotabsearchtextbox")
//    private ExtendedWebElement searchInput;


    @FindBy(xpath = ".//*[contains(@class, 'fast-search__input')]")
    private ExtendedWebElement searchInput;

    @FindBy(id = "nav-search-bar-form")
    private SearchBlock searchBlock;

//    @FindBy(xpath = "//*[@data-toaster-type and .//*[contains(text(), 'Shopping Transition')]]//input[@data-action-type='DISMISS']")
//    private ExtendedWebElement dismissLocationButton;

    @FindBy(xpath = "//*[@data-toaster-type and .//*[contains(text(), 'Shopping Transition')]]")
    private LocationElement locationElement;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("/");
    }

    public SearchBlock getSearchBlock() {
        return searchBlock;
    }

    public LocationElement getLocationElement() {
        return locationElement;
    }

    public ExtendedWebElement getSearchInput() {
        return searchInput;
    }
}
