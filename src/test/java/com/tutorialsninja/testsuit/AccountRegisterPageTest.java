package com.tutorialsninja.testsuit;

import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.MyAccountRegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountRegisterPageTest extends BaseTest {
    MyAccountPage myAccountPage = new MyAccountPage();
    MyAccountRegisterPage accountRegisterPage = new MyAccountRegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //1.1 Clickr on My Account Link.
        myAccountPage.clickOnMyAccountTab();
        // 1.2 Call the method “selectMyAccountOptions” method and pass the parameter Register
        myAccountPage.selectMyAccountOptions("Register");
        //1.3 Verify the text “Register Account”
        Assert.assertEquals(myAccountPage.getRegisterAccountText(), "Register Account", "Register Account not displayed");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        //3.1 Clickr on My Account Link.
        myAccountPage.clickOnMyAccountTab();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter Register
        myAccountPage.selectMyAccountOptions("Register");
        //3.3 Enter First Name
        accountRegisterPage.enterFirstName();
        //3.4 Enter Last Name
        accountRegisterPage.enterLastName();
        //3.5 Enter Email
        accountRegisterPage.enterEmail();
        //3.6 Enter Telephone
        accountRegisterPage.enterTelephone();
        //3.7 Enter Password
        accountRegisterPage.enterPassword();
        //3.8 Enter Password Confirm
        accountRegisterPage.enterConfirmPassword();
        //3.9 Select Subscribe Yes radio button
        accountRegisterPage.selectSubscribeYesRadioButton();
        //3.10 Click on Privacy Policy check box
        accountRegisterPage.clickPrivacyPolicyCheckbox();
        //3.11 Click on Continue button
        accountRegisterPage.clickOnContinueButton();
        //3.12 Verify the message “Your Account Has Been Created!”
        Assert.assertEquals(accountRegisterPage.getAccountHasBeenCreatedText(), "Your Account Has Been Created!", "Cannot create account");
        // 3.13 Click on Continue button
        accountRegisterPage.clickOnContinueButtonAgain();
        //3.14 Clickr on My Account Link.
        accountRegisterPage.clickOnMyAccountLink();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter "Logout"
        myAccountPage.selectMyAccountOptions("Logout");
        //3.16 Verify the text “Account Logout”
        Assert.assertEquals(accountRegisterPage.getAccountLogoutText(), "Account Logout", "Cannot logout");
        //3.17 Click on Continue button
        accountRegisterPage.clickOnContinueButtonAgain();
    }
}
