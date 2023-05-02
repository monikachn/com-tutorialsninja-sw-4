package com.tutorialsninja.testsuit;
import com.tutorialsninja.pages.MyAccountLoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.MyAccountRegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountLoginPageTest extends BaseTest {
    MyAccountPage myAccountPage = new MyAccountPage();
    MyAccountRegisterPage accountRegisterPage = new MyAccountRegisterPage();
    MyAccountLoginPage accountLoginPage= new MyAccountLoginPage();



@Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //2.1 Clickr on My Account Link.
        myAccountPage.clickOnMyAccountTab();
        // 2.2 Call the method “selectMyAccountOptions” method and pass the parameter "Login"
        myAccountPage.selectMyAccountOptions("Login");
        //2.3 Verify the text “Returning Customer”
        Assert.assertEquals(myAccountPage.getReturningCustomerText(), "Returning Customer", "Returning Customer Text not displayed");
    }
    @Test
    public void  verifyThatUserShouldLoginAndLogoutSuccessfully(){
        //4.1 Clickr on My Account Link
        myAccountPage.clickOnMyAccountTab();
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter "login"
        myAccountPage.selectMyAccountOptions("Login");
        //4.3 Enter Email address
        accountLoginPage.enterEmailAddress();
        //4.5 Enter Password
        accountLoginPage.enterValidPassword();
        //4.6 Click on Login button
        accountLoginPage.clickOnLoginButton();
        //4.7 Verify text “My Account”
        Assert.assertEquals(accountLoginPage.getMyAccountText(),"My Account","Error Message");
        //4.8 Clickr on My Account Link.
        myAccountPage.clickOnMyAccountTab();
        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter "Logout"
        myAccountPage.selectMyAccountOptions("Logout");
        // 4.10 Verify the text “Account Logout”
        Assert.assertEquals(accountRegisterPage.getAccountLogoutText(),"Account Logout","Cannot logout");
        //4.11 Click on Continue button
        accountRegisterPage.clickOnContinueButtonAgain();
    }
}
