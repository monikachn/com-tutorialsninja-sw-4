package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {
    By clickOnShowAllLaptopsandNoteBooks = By.linkText("Show AllLaptops & Notebooks");
    By sortByPrice = By.id("input-sort");
    By macbookClick = By.linkText("MacBook");
    By macbookText = By.xpath("//h1[contains(text(),'MacBook')]");
    By successText = By.xpath("//div[@class = 'alert alert-success alert-dismissible']");
    By cartButton = By.xpath("//button[@id='button-cart']");
    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCartText = By.xpath("//div[@id='content']//h1");
    By macbooknameText =By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By clearQty = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    By changeQty = By.xpath("//input[contains(@name, 'quantity')]");
    By updatetab = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By modifiedSuccessText = By.xpath("//div[@id='checkout-cart']/div[1]");
    By totalText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By checkoutLink = By.xpath("//a[contains(text(),'Checkout')]");
    By checkoutText =By.xpath("//h1[contains(text(),'Checkout')]");
    By newCustomerText =By.xpath("//h2[contains(text(),'New Customer')]");
    By guestCheckoutButton = By.xpath("//input[@value='guest']");
    By continueLink = By.xpath("//input[@id='button-account']");

    //1.2 Click on “Show AllLaptops & Notebooks”
    public void clickOnShowAllLaptopAndNoteBooks() {
        clickOnElement(clickOnShowAllLaptopsandNoteBooks);
    }

    // Get all the products price and stored into array list
    public void originalProductPrice() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
    }

    //1.3 Select Sort By "Price (High > Low)"

    public void sortByPriceHightoLow() {
        selectByVisibleTextFromDropDown(sortByPrice, "Price (High > Low)");
    }

    // After filter Price (High > Low) Get all the products price and stored into array list
    public void afterSortByPrice() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
    }
    public void clickOnMacbook() {
        clickOnElement(macbookClick);
    }
    public String getMacbooktext() {
        return getTextFromElement(macbookText);
    }
    public void addToCart() {
        clickOnElement(cartButton);
    }
    public String getSuccesstext() {
        return getTextFromElement(successText);
    }
    public void clickShoppingCart(){
        clickOnElement(shoppingCartLink);
    }
    public String getShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }
    public String getMacbookNameText() {
        return getTextFromElement(macbooknameText);
    }
    public void clearQty(){
        driver.findElement(clearQty).clear();
    }
    public void changeQty(){
        sendTextToElement(changeQty,"2");
    }
    public void clickUpdateTab(){
        clickOnElement(updatetab);
    }
    public String getModifiedSuccessText(){
        return getTextFromElement(modifiedSuccessText);
    }
    public String getTotaltext(){
        return getTextFromElement(totalText);
    }
    public void clickCheckout(){
        clickOnElement(checkoutLink);
    }
    public String getCheckoutText(){
        return getTextFromElement(checkoutText);
    }
    public String getNewCustomerText(){
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckoutButton(){
        clickOnElement(guestCheckoutButton);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueLink);
    }

}
