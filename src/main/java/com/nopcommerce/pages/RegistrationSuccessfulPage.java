package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegistrationSuccessfulPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement messageOfSuccessfulRegistration;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement buttonContinue;

  /*  By messageOfSuccessfulRegistration = By.xpath("//div[contains(text(),'Your registration completed')]");
    By buttonContinue = By.xpath("//a[contains(text(),'Continue')]");*/

    public String actualMessageOfSuccessfulRegistration(){
        CustomListeners.test.log(Status.PASS,"MessageOfSuccessfulRegistration"+messageOfSuccessfulRegistration);
        Reporter.log("MessageOfSuccessfulRegistration"+messageOfSuccessfulRegistration.toString());
        return getTextFromElement(messageOfSuccessfulRegistration);
    }

    public void clickOnButtonContinue() throws InterruptedException {
        clickOnElement(buttonContinue);
        CustomListeners.test.log(Status.PASS,"clickButton"+buttonContinue);
        Reporter.log("clickButton"+buttonContinue.toString());

        Thread.sleep(2000);
    }

}
