package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountLoginPage extends Utility {
    By emailAddress = By.id("input-email");
    By enterPassword = By.name("password");

    By loginButton = By.xpath("//input[@value='Login']");
    By myAccountText = By.xpath("//h2[contains(text(),'My Account')]");



    public void enterEmailAddress(){
        sendTextToElement(emailAddress,"MariaSmith123@gmail.com");

    }
    public void enterValidPassword(){
        sendTextToElement(enterPassword,"Abc@123");
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getMyAccountText(){
        return getTextFromElement(myAccountText);
    }
}

