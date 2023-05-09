package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement logInLink;
    @CacheLookup
    @FindBy(css = "#Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(css = "#Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(css = ".button-1.login-button")
    WebElement loginButton;

    /*By logInLink = By.linkText("Log in");
    By emailField = By.cssSelector("#Email");
    By passwordField = By.cssSelector("#Password");
    By loginButton = By.cssSelector(".button-1.login-button");*/

    public void loginLink() {
        clickOnElement(logInLink);
        CustomListeners.test.log(Status.PASS,"clickonlogin"+logInLink);
        Reporter.log("clickonlogin"+logInLink.toString());

    }

    public void emailField(String email) {
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS,"enter email"+emailField);
        Reporter.log("enter email"+emailField.toString());

    }

    public void passwordField(String password) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS,"enter password"+passwordField);
        Reporter.log("enter password"+passwordField.toString());

    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"click on login button"+loginButton);
        Reporter.log("click on login button"+loginButton.toString());

    }
}
