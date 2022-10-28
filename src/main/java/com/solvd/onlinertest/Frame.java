package com.solvd.onlinertest;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Frame extends AbstractPage {

    @FindBy(xpath = "//div[@class='tag-of-element']")
    private ExtendedWebElement component;

    public Frame(WebDriver driver) {
        super(driver);
    }

    public void click() {
        component.click();
    }
}
