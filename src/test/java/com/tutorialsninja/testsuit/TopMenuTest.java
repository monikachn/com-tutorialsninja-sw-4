package com.tutorialsninja.testsuit;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.utilities.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends Utility {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverAndClickDesktops();
        //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        homePage.selectMenu("Show AllDesktops");
        //1.3 Verify the text ‘Desktops’
        Assert.assertEquals(homePage.getDesktopText(),"Desktops","Desktops text not found");
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverAndClickLaptopsAndNotebooks();
        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        homePage.selectMenu("Show AllLaptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        Assert.assertEquals(homePage.getLaptopsNotebooksText(),"Laptops & Notebooks","Laptops and Notebooks text not found");

    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //3.1 Mouse hover on “Components” Tab and click
        homePage.mouseHoverAndClickComponents();
        //3.2 call selectMenu method and pass the menu = “Show AllComponents”
        homePage.selectMenu("Show AllComponents");
        //3.3 Verify the text ‘Components’
        Assert.assertEquals(homePage.getComponents(),"Components","Components not found");
    }
}
