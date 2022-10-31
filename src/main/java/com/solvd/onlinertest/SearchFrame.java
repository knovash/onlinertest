package com.solvd.onlinertest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchFrame extends AbstractPage {

    @FindBy(xpath = "//span[@class='search__closet']")
    private ExtendedWebElement searchClose;

    public SearchFrame(WebDriver driver) {
        super(driver);
    }

    public void clickClose() {
        searchClose.click();
    }

    public ExtendedWebElement getSearchClose() {
        return searchClose;
    }
}
