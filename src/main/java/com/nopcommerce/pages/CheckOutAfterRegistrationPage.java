package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutAfterRegistrationPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstNameInputBox;

    // By firstNameInputBox = By.xpath("//input[@id='BillingNewAddress_FirstName']"); // value "Micky"

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastNameInputBox;
    //By lastNameInputBox = By.xpath("//input[@id='BillingNewAddress_LastName']"); // value "Mouse"
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement emailInputBox;

    // By emailInputBox = By.xpath("//input[@id='BillingNewAddress_Email']"); // value "mickmouse0000@gmail.com"

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryDropDown;
    //By countryDropDown = By.xpath("//select[@id='BillingNewAddress_CountryId']"); //value "233"

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityInputBox;

    //By cityInputBox = By.xpath("//input[@id='BillingNewAddress_City']"); //value "Glasgow"

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1InputBox;

    //By address1InputBox = By.xpath("//input[@id='BillingNewAddress_Address1']"); //value "10 Paris Street"

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postalCodeInputBox;
    // By postalCodeInputBox = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"); // value "GS10 2FC"

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement billingNewAddressPhoneNumber;
    // By billingNewAddressPhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"); // value "02022039384"

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement buttonContinueFromBillingAddress;
    //By buttonContinueFromBillingAddress = By.xpath("//button[@onclick='Billing.save()']"); //button 1

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement radioButtonNextDayAir;

    // By radioButtonNextDayAir = By.xpath("//input[@id='shippingoption_1']");

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement buttonContinueFromShippingMethod;

    //By buttonContinueFromShippingMethod = By.xpath("//button[@class='button-1 shipping-method-next-step-button']"); // button 2
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement radioButtonCreditCard;

    // By radioButtonCreditCard = By.xpath("//input[@id='paymentmethod_1']");
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement buttonContinueFromPaymentMethod;

    //  By buttonContinueFromPaymentMethod = By.xpath("//button[@class='button-1 payment-method-next-step-button']"); // button 3

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement dropDownSelectCard;
    //By dropDownSelectCard = By.xpath("//select[@id='CreditCardType']"); // value  "MasterCard"

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderNameInputBox;
    //By cardHolderNameInputBox = By.xpath("//input[@id='CardholderName']");// value "Mr Micky"

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberInputBox;
    //By cardNumberInputBox = By.xpath("//input[@id='CardNumber']"); // value "5105105105105100"

    @CacheLookup

    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement dropDownExpiryDateMonth;
    // By dropDownExpiryDateMonth = By.xpath("//select[@id='ExpireMonth']"); // "12"

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement dropDownExpiryDateYear;
    //By dropDownExpiryDateYear = By.xpath("//select[@id='ExpireYear']"); // value "2023"

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeInputBox;
    // By cardCodeInputBox = By.xpath("//input[@id='CardCode']"); // value "203"

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement buttonContinueFromPaymentInformation;
    // By buttonContinueFromPaymentInformation = By.xpath("//button[@class='button-1 payment-info-next-step-button']"); // button 4


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement actualTextOfCardMethod;
    // By actualTextOfCardMethod = By.xpath("//span[contains(text(),'Credit Card')]");

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='2nd Day Air']")
    WebElement actualTextOfShippingMethod;

    //By actualTextOfShippingMethod = By.xpath("//span[normalize-space()='2nd Day Air']");

    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement actualTotalFinalPrice;
    //By actualTotalFinalPrice = By.xpath("//span[@class='product-subtotal']");

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement buttonConfirm;
    // By buttonConfirm = By.xpath("//button[normalize-space()='Confirm']"); // button confirm
    @CacheLookup
    @FindBy(xpath = "(//input[@id='shippingoption_2'])[1]")
    WebElement radioButton2ndDayAir;

    //By radioButton2ndDayAir = By.xpath("(//input[@id='shippingoption_2'])[1]");


    /**
     * List of methods to perform actions using above locators variables
     */

    // Fill the all mandatory field

    public void firstName(String fName) {
        clearValue(firstNameInputBox);
        Reporter.log("Enter FirstName : " + fName + " into " + firstNameInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter FirstName : " + fName + " into " + firstNameInputBox.toString());
        sendTextToElement(firstNameInputBox, fName);
    }




    public void lastName(String lName) {

        clearValue(lastNameInputBox);
        Reporter.log("Enter LastName : " + lName + " into " + lastNameInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter LastName : " + lName + " into " + lastNameInputBox.toString());
        sendTextToElement(lastNameInputBox, lName);
    }

    public void email(String email) {

        clearValue(emailInputBox);
        Reporter.log("Enter LastName : " + email + " into " + emailInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter email : " + email + " into " + emailInputBox.toString());
        sendTextToElement(emailInputBox, email);
    }

    public void selectCountryFromDropDown() {
        Reporter.log("Select country from dropdown  ");
        CustomListeners.test.log(Status.PASS,"Select Country from dropdown" );
        selectByIndexFromDropDown(countryDropDown, 2);
    }
    public void enterCity(String cityName){
        Reporter.log("Enter cityName : " + cityInputBox + " into " + cityInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter city : " + cityName + " into " + cityInputBox.toString());
        sendTextToElement(cityInputBox, cityName);
    }

    public void enterAddress(String address){
        Reporter.log("Enter address : " + address + " into " + address1InputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter address : " + address + " into " + address1InputBox.toString());

        sendTextToElement(address1InputBox,address );
    }

    public void enterPostCode(String postcode){

        Reporter.log("Enter postcode : " + postcode + " into " + postalCodeInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter postcode : " + postcode + " into " + postalCodeInputBox.toString());

        sendTextToElement(postalCodeInputBox, postcode);
    }

    public void enterPhoneNumber(String phoneNumber){
        Reporter.log("Enter PhoneNumber : " + phoneNumber + " into " + billingNewAddressPhoneNumber.toString());
        CustomListeners.test.log(Status.PASS,"Enter PhoneNumber : " + phoneNumber + " into " + billingNewAddressPhoneNumber.toString());

        sendTextToElement(billingNewAddressPhoneNumber, phoneNumber);
    }

    public void clickContinue(){

        Reporter.log("Click on continue button " + buttonContinueFromBillingAddress.toString());
        CustomListeners.test.log(Status.PASS,"Click on continue button" + buttonContinueFromBillingAddress.toString());
        clickOnElement(buttonContinueFromBillingAddress);
    }


    //Click on Radio Button “Next Day Air($0.00)”
    public void clickOnRadioButtonNextDayAir(){
        Reporter.log("Click on radio button next day air " + radioButtonNextDayAir.toString());
        CustomListeners.test.log(Status.PASS,"Click on radio button next day air" + radioButtonNextDayAir.toString());

        clickOnElement(radioButtonNextDayAir);
    }

    //    2.25 Click on “CONTINUE”
    public void clickOnButtonContinueFromShippingMethod(){

        clickOnElement(buttonContinueFromShippingMethod);

    }

    //    2.26 Select Radio Button “Credit Card”
    public void clickOnRadioButtonCreditCard(){
        Reporter.log("Click on continue button " + buttonContinueFromBillingAddress.toString());
        CustomListeners.test.log(Status.PASS,"Click on continue button" + buttonContinueFromBillingAddress.toString());

        clickOnElement(radioButtonCreditCard);
    }

    // click on continue button --> button 2
    public void clickOnButtonContinueFromPaymentMethod(){
        Reporter.log("Click on continue button " + buttonContinueFromBillingAddress.toString());
        CustomListeners.test.log(Status.PASS,"Click on continue button" + buttonContinueFromBillingAddress.toString());

        clickOnElement(buttonContinueFromPaymentMethod);
    }

    //    2.27 Select “Master card” From Select credit card dropdown
    public void clickOnDropDownSelectCard(String visa){
        Reporter.log("Click on continue button " + buttonContinueFromBillingAddress.toString());
        CustomListeners.test.log(Status.PASS,"Click on continue button" + buttonContinueFromBillingAddress.toString());


        selectByValueFromDropDown(dropDownSelectCard, visa);
    }

    //    2.28 Fill all the details
    public void fillInCardHolderNameInputBox(String name){
        Reporter.log("Enter the cardholder name  : " + name + " into " + cardHolderNameInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter the cardholder name : " + name + " into " + cardHolderNameInputBox.toString());
        sendTextToElement(cardHolderNameInputBox, name);
    }

    // fill in card number
    public void fillInCardNumberInputBox(String cardNumber){

        Reporter.log("Enter the card number  : " + cardNumber + " into " + cardNumberInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter the card number : " + cardNumber + " into " + cardNumberInputBox.toString());
        sendTextToElement(cardNumberInputBox, cardNumber);
    }

    // select month
    public void selectDropDownExpiryDateMonth(String month){

        Reporter.log("Select month from drop down ");
        CustomListeners.test.log(Status.PASS,"Select month from drop down");

        selectByValueFromDropDown(dropDownExpiryDateMonth, month);
    }

    // select year
    public void selectDropDownExpiryDateYear(String year){

        Reporter.log("Select year from drop down");
        CustomListeners.test.log(Status.PASS,"Select year from drop down");

        selectByValueFromDropDown(dropDownExpiryDateYear, year);
    }

    // fill in card code
    public void fillInCardCodeInputBox(String cardCode){
        Reporter.log("Enter card code " + cardCodeInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter card code " + cardCodeInputBox.toString());

        sendTextToElement(cardCodeInputBox, cardCode);
    }

    //    2.29 Click on “CONTINUE” --> button 4
    public void clickOnButtonContinueFromPaymentInformation(){

        Reporter.log("Click on continue button " + buttonContinueFromPaymentInformation.toString());
        CustomListeners.test.log(Status.PASS,"Click on continue button" + buttonContinueFromPaymentInformation.toString());

        clickOnElement(buttonContinueFromPaymentInformation);
    }

    //    2.30 Verify “Payment Method” is “Credit Card”
    public String verifyActualTextOfCardMethod(){
        Reporter.log("text displayed on page " + actualTextOfCardMethod.toString());
        CustomListeners.test.log(Status.PASS,"text displayed on page " + actualTextOfCardMethod.toString());
        return getTextFromElement(actualTextOfCardMethod);
    }

    //    2.32 Verify “Shipping Method” is “Next Day Air”
    public String verifyActualTextOfShippingMethod(){
        Reporter.log("Text displayed on page : " + actualTextOfShippingMethod.toString());
        CustomListeners.test.log(Status.PASS,"Text displayed on page :" + actualTextOfShippingMethod.toString());
        return getTextFromElement(actualTextOfShippingMethod);
    }

    //    2.33 Verify Total is “$2,950.00”
    public String verifyActualTotalFinalPrice(){
        Reporter.log("Text displayed on page : " + actualTotalFinalPrice.toString());
        CustomListeners.test.log(Status.PASS,"Text displayed on page :" + actualTotalFinalPrice.toString());

        return getTextFromElement(actualTotalFinalPrice);
    }

    //    2.34 Click on “CONFIRM”
    public void clickOnButtonConfirm(){
        Reporter.log("Click on confirm button " + buttonConfirm.toString());
        CustomListeners.test.log(Status.PASS,"Click on confirm button " + buttonConfirm.toString());
        clickOnElement(buttonConfirm);
    }

    public void clickOnRadioButton2ndDayAir() throws InterruptedException {

        Reporter.log("click on 2nd day air radio button" + radioButton2ndDayAir.toString());
        CustomListeners.test.log(Status.PASS,"click on 2nd day air radio button" + radioButton2ndDayAir.toString());
        clickOnElement(radioButton2ndDayAir);
        Thread.sleep(1000);
    }
}
