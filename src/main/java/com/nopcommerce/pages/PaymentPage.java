package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PaymentPage extends Utility {
    @CacheLookup
    @FindBy(css = "#paymentmethod_1")
    WebElement creditCartRadioLocator;
    @CacheLookup
    @FindBy(css = ".button-1.payment-method-next-step-button")
    WebElement continueButtonPaymentMethodLocator;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement creditCardDropdownLocator;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameFieldLocator;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumberFieldLocator;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonthDropdownLocator;
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYearDropdownLocator;
    @CacheLookup
    @FindBy(xpath = "//input[@data-val-regex-pattern='^[0-9]{3,4}$']")
    WebElement cardCodeFieldLocator;
    @CacheLookup
    @FindBy(css = ".button-1.payment-info-next-step-button")
    WebElement continueButtonAfterCreditCardInfoLocator;


    /* By creditCartRadioLocator = By.cssSelector("#paymentmethod_1");
    By continueButtonPaymentMethodLocator = By.cssSelector(".button-1.payment-method-next-step-button");
    By creditCardDropdownLocator = By.id("CreditCardType");
    By cardHolderNameFieldLocator = By.id("CardholderName");
    By cardNumberFieldLocator = By.id("CardNumber");
    By expireMonthDropdownLocator = By.id("ExpireMonth");
    By expireYearDropdownLocator = By.id("ExpireYear");
    By cardCodeFieldLocator = By.xpath("//input[@data-val-regex-pattern='^[0-9]{3,4}$']");
    By continueButtonAfterCreditCardInfoLocator = By.cssSelector(".button-1.payment-info-next-step-button");
*/
    public void selectCreditCardRadioButton() {
        clickOnElement(creditCartRadioLocator);
        CustomListeners.test.log(Status.PASS,"selectCreditCardRadioButton"+creditCartRadioLocator);
        Reporter.log("selectCreditCardRadioButton"+creditCartRadioLocator.toString());

    }

    public void continuePaymentButton() {
        clickOnElement(continueButtonPaymentMethodLocator);
        CustomListeners.test.log(Status.PASS,"continuePaymentButton"+continueButtonPaymentMethodLocator);
        Reporter.log("continuePaymentButton"+continueButtonPaymentMethodLocator.toString());

    }

    public void selectCreditCard(int index) {
        selectByIndexFromDropDown(creditCardDropdownLocator, index);
        CustomListeners.test.log(Status.PASS,"selectCreditCard"+creditCardDropdownLocator);
        Reporter.log("selectCreditCard"+creditCardDropdownLocator.toString());

    }

    public void cardHolderName(String name) {
        sendTextToElement(cardHolderNameFieldLocator, name);
        CustomListeners.test.log(Status.PASS,"cardHolderName"+cardHolderNameFieldLocator);
        Reporter.log("cardHolderName"+cardHolderNameFieldLocator.toString());

    }

    public void cardNumber(String cardNumber) {
        sendTextToElement(cardNumberFieldLocator, cardNumber);
        CustomListeners.test.log(Status.PASS,"update quantity"+cardNumberFieldLocator);
        Reporter.log("update the quantity"+cardNumberFieldLocator.toString());
    }

    public void selectExpiryMonth(int index) {
        selectByIndexFromDropDown(expireMonthDropdownLocator, index);
        CustomListeners.test.log(Status.PASS,"selectExpiryMonth"+expireMonthDropdownLocator);
        Reporter.log("selectExpiryMonth"+expireMonthDropdownLocator.toString());
    }

    public void selectExpiryYear(int index) {
        selectByIndexFromDropDown(expireYearDropdownLocator, index);
        CustomListeners.test.log(Status.PASS,"selectExpiryYear"+expireYearDropdownLocator);
        Reporter.log("selectExpiryYear"+expireYearDropdownLocator.toString());
    }

    public void enterCardCode(String cardNumber) {
        sendTextToElement(cardCodeFieldLocator, cardNumber);
        CustomListeners.test.log(Status.PASS,"enterCardCode"+cardCodeFieldLocator);
        Reporter.log("enterCardCode"+cardCodeFieldLocator.toString());

    }

    public void paymentContinueButton(){
        clickOnElement(continueButtonAfterCreditCardInfoLocator);
        CustomListeners.test.log(Status.PASS,"paymentContinueButton"+continueButtonAfterCreditCardInfoLocator);
        Reporter.log("paymentContinueButton"+continueButtonAfterCreditCardInfoLocator.toString());

    }

}
