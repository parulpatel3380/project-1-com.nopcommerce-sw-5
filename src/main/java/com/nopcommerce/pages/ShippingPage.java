package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShippingPage extends Utility {
    @CacheLookup
    @FindBy(css = "#shippingoption_1")
    WebElement nextDayAirRadioLocator;

    @CacheLookup
    @FindBy(css = ".button-1.shipping-method-next-step-button")
    WebElement continueButtonAfterShippingLocator;


 /*   By nextDayAirRadioLocator = By.cssSelector("#shippingoption_1");
    By continueButtonAfterShippingLocator = By.cssSelector(".button-1.shipping-method-next-step-button");
*/

    public void shippingMethod(){
        clickOnElement(nextDayAirRadioLocator);
        CustomListeners.test.log(Status.PASS,"shippingMethod"+nextDayAirRadioLocator);
        Reporter.log("shippingMethod"+nextDayAirRadioLocator.toString());

    }

    public void shippingMethodContinueButton(){
        clickOnElement(continueButtonAfterShippingLocator);
        CustomListeners.test.log(Status.PASS,"shippingMethodContinueButton"+continueButtonAfterShippingLocator);
        Reporter.log("shippingMethodContinueButton"+continueButtonAfterShippingLocator.toString());



    }
}
