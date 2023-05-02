package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    By mouseHoverDesktop = By.linkText("Desktops");
    By clickDesktop = By.linkText("Show AllDesktops");
    By selectSortZToA = By.id("input-sort");
    By selectSortAToZ = By.id("input-sort");
    By selectProduct = By.xpath("//a[contains(text(),'HP LP3065')]");
    //By enterQty = By.name("quantity");
    By addToCartClick = By.id("button-cart");
    By hpText = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By successText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingcartText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By hpProductText = By.xpath("//a[contains(text(),'HP LP3065')])[2]");
    By product21Text = By.xpath("//td[normalize-space()='Product 21']");
    By totalcostText = By.xpath("(//td[@class='text-right'][normalize-space()='£74.73'])[4]");

    By deliveryDateText = By.xpath("//small[normalize-space()='Delivery Date:2023-11-30']");


    public void selectSortByAToZ (){
        selectByVisibleTextFromDropDown(selectSortAToZ,"Name (A - Z");
    }
    public void mouseHoverAndClickDesktops(){
        mouseHoverToElementAndClick(mouseHoverDesktop);
    }
    public void clickOnShowAllDeskTops(){
        clickOnElement(clickDesktop);
    }
    public void selectSortByZToA(){
        selectByVisibleTextFromDropDown(selectSortZToA, "Name (Z - A)");
    }
    public void selectProduct() {
        clickOnElement(selectProduct);
    }
    public void addToCart() {
        clickOnElement(addToCartClick);
    }

    public String getHPText(){
        return getTextFromElement(hpText);
    }
    public String getSuccessMessageText(){
        return getTextFromElement(successText);
    }

    public String getShoppingcartText(){
        return getTextFromElement(shoppingcartText);
    }

    public String getHPProdcutText(){
        return getTextFromElement(hpProductText);
    }
    public String getProdcut21Text(){
        return getTextFromElement(product21Text);
    }
    public String getTotalCostText(){
        return getTextFromElement(totalcostText);
    }
    public String getdeliveryDateText(){
        return getTextFromElement(deliveryDateText);
    }
    public void verifyProductArrangeInDescendingOrder(){
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e:products
             ) { originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // sort by reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
    }
    public void selectDeliveryDate(){
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }
    }


