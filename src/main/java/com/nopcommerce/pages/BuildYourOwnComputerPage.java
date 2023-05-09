package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerTitleLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_1")
    WebElement processorDropdownLocator;
    @CacheLookup
    @FindBy(css = "#product_attribute_2")
    WebElement ramDropdownLocator;
    @CacheLookup
    @FindBy(css = "#product_attribute_3_7")
    WebElement hddRadioButtonLocator;
    @CacheLookup
    @FindBy(css = "#product_attribute_4_9")
    WebElement osRadioButtonLocator;
    @CacheLookup
    @FindBy(css = "#product_attribute_5_10")
    WebElement msOfficeCheckBoxLocator;
    @CacheLookup
    @FindBy(css = "#product_attribute_5_12")
    WebElement totalCommanderCheckBoxLocator;

    @CacheLookup
    @FindBy(css = "#price-value-1")
    WebElement priceTotalLocator;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton1Locator;
    @CacheLookup
    @FindBy(css = ".content")
    WebElement messageConfirmationLocator;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement crossToCloseLocator;

    /* By buildYourOwnComputerTitleLocator = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");
    By processorDropdownLocator = By.cssSelector("#product_attribute_1");
    By ramDropdownLocator = By.cssSelector("#product_attribute_2");
    By hddRadioButtonLocator = By.cssSelector("#product_attribute_3_7");
    By osRadioButtonLocator = By.cssSelector("#product_attribute_4_9");
    By msOfficeCheckBoxLocator = By.cssSelector("#product_attribute_5_10");
    By totalCommanderCheckBoxLocator = By.cssSelector("#product_attribute_5_12");
    By priceTotalLocator = By.cssSelector("#price-value-1");
    By addToCartButton1Locator = By.xpath("//button[@id='add-to-cart-button-1']");
    By messageConfirmationLocator = By.cssSelector(".content");
    By crossToCloseLocator = By.xpath("//span[@title='Close']");
*/
    public String getTextFromBuildYourOwnComputer() {
        CustomListeners.test.log(Status.PASS,"VerifyText For build your own computer"+buildYourOwnComputerTitleLocator);
        Reporter.log("VerifyText For build your own computer"+buildYourOwnComputerTitleLocator.toString());
        return buildYourOwnComputerTitleLocator.getText();
    }

    public void selectProcessor(){
        selectByIndexFromDropDown(processorDropdownLocator, 1);
        CustomListeners.test.log(Status.PASS,"select processor"+processorDropdownLocator);
        Reporter.log("selectProcessor"+processorDropdownLocator.toString());
    }
    public void selectRAM(){
        selectByIndexFromDropDown(ramDropdownLocator, 3);
        CustomListeners.test.log(Status.PASS,"select RAM"+ramDropdownLocator);
        Reporter.log("select RAM"+ramDropdownLocator.toString());

    }
    public void selectHDD(){
        clickOnElement(hddRadioButtonLocator);
        CustomListeners.test.log(Status.PASS,"select HDD"+hddRadioButtonLocator);
        Reporter.log("select HDD"+hddRadioButtonLocator.toString());

    }

    public void selectOS(){
        clickOnElement(osRadioButtonLocator);
        CustomListeners.test.log(Status.PASS,"select OS"+osRadioButtonLocator);
        Reporter.log("select OS"+osRadioButtonLocator.toString());

    }

    public void selectMicrosoftOffice() {
        WebElement element = msOfficeCheckBoxLocator;
        if (!element.isSelected()) {
            clickOnElement(msOfficeCheckBoxLocator);
        }
        CustomListeners.test.log(Status.PASS,"select MicrosoftOffice"+msOfficeCheckBoxLocator);
        Reporter.log("select MicrosoftOffice"+msOfficeCheckBoxLocator.toString());

    }
    public void selectTotalCommander(){
        clickOnElement(totalCommanderCheckBoxLocator);
        CustomListeners.test.log(Status.PASS,"selectTotalCommander"+totalCommanderCheckBoxLocator);
        Reporter.log("selectTotalCommander"+totalCommanderCheckBoxLocator.toString());

    }

    public String checkTotalPrice(){
        CustomListeners.test.log(Status.PASS,"checkTotalPrice"+priceTotalLocator);
        Reporter.log("clickOnProduct Gear"+priceTotalLocator.toString());
        return priceTotalLocator.getText();
    }

    public void addToCartButtonClick(){
        clickOnElement(addToCartButton1Locator);
        CustomListeners.test.log(Status.PASS,"ClickOnAddToCartButton"+addToCartButton1Locator);
        Reporter.log("ClickOnAddToCartButton"+addToCartButton1Locator.toString());
    }

    public String shoppingCartMessage(){
        CustomListeners.test.log(Status.PASS,"verify the shopping cart message"+messageConfirmationLocator);
        Reporter.log("verify the shopping cart message"+messageConfirmationLocator.toString());
        return messageConfirmationLocator.getText();
    }

    public void crossBarClick(){
        clickOnElement(crossToCloseLocator);
        CustomListeners.test.log(Status.PASS,"ClickONCrossBar"+crossToCloseLocator);
        Reporter.log("clickOnCrossBar"+crossToCloseLocator.toString());

    }
}
