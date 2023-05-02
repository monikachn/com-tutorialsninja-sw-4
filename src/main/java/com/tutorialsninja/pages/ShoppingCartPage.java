package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCartClick = By.xpath("//a[contains(text(),'shopping cart')]");
    By currencyTabClick = By.xpath("//span[contains(text(),'Currency')]");

    By poundSterlingClick = By.xpath("//button[contains(text(),'£Pound Sterling')]");

    //2.10 Click on link “shopping cart” display into success message
    public void shoppingCartClick() {
        clickOnElement(shoppingCartClick);
    }

    //currency tab click
    public void clickOnCurrencyTab() {
        clickOnElement(currencyTabClick);
    }

    public void clickOnPoundSterling() {
        clickOnElement(poundSterlingClick);
    }



}
