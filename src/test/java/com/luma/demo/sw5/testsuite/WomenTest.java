package com.luma.demo.sw5.testsuite;

import com.luma.demo.sw5.customlisterners.CustomListerners;
import com.luma.demo.sw5.pages.HomePage;
import com.luma.demo.sw5.pages.WomenPage;
import com.luma.demo.sw5.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(CustomListerners.class)
public class WomenTest extends BaseTest {

    HomePage homepage;
    WomenPage womenPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homepage=new HomePage();
        womenPage=new WomenPage();
    }
    @Test(groups = {"sanity", "regression"})
    public void verifyTheSortByProductNameFilter(){

        //* Mouse Hover on Women Menu
        homepage.mouseHoverToWomenMenu();
        //* Mouse Hover on Tops
        homepage.mouseHoverToWomenTops();
        //* Click on Jackets
        homepage.clickOnJackets();
        //* Select Sort By filter “Product Name”
        womenPage.selectSortByFilterProductName();
        //* Verify the products name display in alphabetical order
        womenPage.verifyProductsNameAlphabeticalOrder();
    }
    @Test(groups = {"smoke", "regression"})
    public void verifyTheSortByPriceFilter(){

        //* Mouse Hover on Women Menu
        homepage.mouseHoverToWomenMenu();
        //* Mouse Hover on Tops
        homepage.mouseHoverToWomenTops();
        //* Click on Jackets
        homepage.clickOnJackets();
        //* Select Sort By filter “Price”
        womenPage.selectSortByFilterPrice();
        //* Verify the products price display in Low to High
        womenPage.verifyProductsPriceLowToHigh();
    }
}
