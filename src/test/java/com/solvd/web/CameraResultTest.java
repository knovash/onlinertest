package com.solvd.web;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.solvd.onlinertest.HomePage;
import com.solvd.onlinertest.LocationElement;
import com.solvd.onlinertest.SearchBlock;
import com.solvd.onlinertest.ShoppingPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CameraResultTest implements IAbstractTest {

    @Test
    public void test() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        System.out.println();

//        .//*[contains(@class, 'product__title')]

        homePage.getSearchInput().type("samsung");
        System.out.println();
//        SearchBlock searchBlock = homePage.getSearchBlock();
//        searchBlock.typeInSearchInput("samsung");

//        LocationElement locationElement = homePage.getLocationElement();
//        if (locationElement.isUIObjectPresent()) {
//            locationElement.clickDismissButton();
//        }
//
////        homePage.getSearchInput().type("xxx");
//        SearchBlock searchBlock = homePage.getSearchBlock();
//        searchBlock.typeInSearchInput("samsung");
////        searchBlock.clickSearchButton(); // откроется новая страницв ShoppingPage
//        ShoppingPage shoppingPage = searchBlock.clickSearchButton();
//
//        SoftAssert sa = new SoftAssert();
//
//        shoppingPage.getSearchResultBlocks().stream()
//                .peek(searchResultBlock -> System.out.println(searchResultBlock.getDescriptionText()))
//                        .forEach(searchResultBlock -> sa.assertTrue(searchResultBlock.getDescriptionText().toLowerCase().contains("samsung")));
//
//sa.assertAll();
        System.out.println();
    }

}
