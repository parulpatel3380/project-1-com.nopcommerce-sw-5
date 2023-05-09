package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OrderCompletionPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouTitleLocator;

    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successfullMessageLocator;

    @CacheLookup
    @FindBy(css = ".button-1.order-completed-continue-button")
    WebElement continueButtonCompletedOrderLocator;

    /*By thankYouTitleLocator = By.xpath("//h1[normalize-space()='Thank you']");
    By successfullMessageLocator = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueButtonCompletedOrderLocator = By.cssSelector(".button-1.order-completed-continue-button");
*/


    public String getTextFromThankYouTitle()
    {
        CustomListeners.test.log(Status.PASS,"verify thank you message"+thankYouTitleLocator);
        Reporter.log("verify thank you message"+thankYouTitleLocator.toString());
        return thankYouTitleLocator.getText();
    }
    public String getTextFromOrderSuccessMessage()
    {
        CustomListeners.test.log(Status.PASS,"verify order success message"+successfullMessageLocator);
        Reporter.log("verify order success message "+successfullMessageLocator.toString());
        return successfullMessageLocator.getText();
    }

    public void clickOnContinueOrderCompletionButton()
    {
        clickOnElement(continueButtonCompletedOrderLocator);
        CustomListeners.test.log(Status.PASS,"click on continue order complete button"+continueButtonCompletedOrderLocator);
        Reporter.log("click on continue order complete button"+continueButtonCompletedOrderLocator.toString());

    }
}
