package com.solvd.web;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.onlinertest.*;
import org.testng.annotations.Test;

public class SearchTest implements IAbstractTest {

    @Test
    public void test() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        System.out.println();
        homePage.getSearchInput().type("samsung");
        homePage.clickOnIframe();

    }
}
