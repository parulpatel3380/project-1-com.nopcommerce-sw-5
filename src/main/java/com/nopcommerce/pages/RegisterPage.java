package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.Random;

public class RegisterPage extends Utility {
    public static String generatedEmail;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement titleTextOfRegisterPage;
    // By titleTextOfRegisterPage = By.xpath("//h1[contains(text(),'Register')]");

    @CacheLookup
    @FindBy(xpath ="//input[@id='FirstName']")
    WebElement firstNameInputBox;

    // By firstNameInputBox = By.xpath("//input[@id='FirstName']");

    @CacheLookup
    @FindBy(xpath ="//input[@id='LastName']")
    WebElement lastNameInputBox;
    // By lastNameInputBox = By.xpath("//input[@id='LastName']");

    @CacheLookup
    @FindBy(xpath ="//input[@id='Email']")
    WebElement emailInputBox;
    // By lastNameInputBox = By.xpath("//input[@id='LastName']");
    // By emailInputBox = By.xpath("//input[@id='Email']");


    @CacheLookup
    @FindBy(xpath ="//input[@id='Password']")
    WebElement passwordInputBox;
    // By passwordInputBox = By.xpath("//input[@id='Password']");


    @CacheLookup
    @FindBy(xpath ="//input[@id='ConfirmPassword']")
    WebElement confirmPasswordInputBox;

    //By confirmPasswordInputBox = By.xpath("//input[@id='ConfirmPassword']");

    @CacheLookup
    @FindBy(css = ".button-1.register-next-step-button")
    WebElement buttonRegister;

    //By buttonRegister = By.cssSelector(".button-1.register-next-step-button");


    public void fillInFirstName(String fName){

        Reporter.log("Enter First Name " + fName + "into" + firstNameInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter First name " + fName + "into" + firstNameInputBox.toString());

        sendTextToElement(firstNameInputBox, fName);
    }

    public void fillInLastName(String lName){

        Reporter.log("Enter Last Name " + lName + "into" + lastNameInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter First name " + lName + "into" + lastNameInputBox.toString());

        sendTextToElement(lastNameInputBox, lName);
    }

    public void fillInEmail(){
        Random randomPartOfEmailGenerator = new Random(5000);
        int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
        //random string generator - to use in email
        RandomString randomString = new RandomString(5);
        String randomStringInEmailGenerator = randomString.nextString();
        generatedEmail = "mocky" + randomNumberInEmail + randomStringInEmailGenerator + "mouse@gmail.com";

        Reporter.log("Enter email  " + generatedEmail + "into" + emailInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter First name " + generatedEmail + "into" + emailInputBox.toString());

        sendTextToElement(emailInputBox, generatedEmail);
    }
    public void fillInPassword(String password){
        Reporter.log("Enter password " + password + "into" + passwordInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter password " + password + "into" + passwordInputBox.toString());


        sendTextToElement(passwordInputBox, password);
    }

    public void fillInConfirmPassword(String confirmPassword){
        Reporter.log("Enter confirm password " + confirmPassword + "into" + confirmPasswordInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter confirm password " + confirmPassword + "into" + confirmPasswordInputBox.toString());


        sendTextToElement(confirmPasswordInputBox, confirmPassword);
    }

    public void clickOnButtonRegisterNextStep() throws InterruptedException {
        Reporter.log("Click on register button : " + buttonRegister.toString());
        CustomListeners.test.log(Status.PASS,"Click on register button : " + buttonRegister.toString());
        clickOnElement(buttonRegister);
        Thread.sleep(2000);
    }

    public String actualTitleTextOfRegisterPage() {
        Reporter.log("Verify the text displayed on page");
        CustomListeners.test.log(Status.PASS, "Verify the text displayed on page");
        return getTextFromElement(titleTextOfRegisterPage);
    }

}
