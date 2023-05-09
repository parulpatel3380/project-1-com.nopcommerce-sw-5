package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OrderConfirmationPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']//span[2]")
    WebElement paymentMethodTextLocator;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[2]")
    WebElement shippingMethodTextLocator;
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']/td[@class='cart-total-right']/span")
    WebElement totalPriceLocator;
    @CacheLookup
    @FindBy(css = ".button-1.confirm-order-next-step-button")
    WebElement confirmButtonLocator;

   /* By paymentMethodTextLocator = By.xpath("//li[@class='payment-method']//span[2]");
    By shippingMethodTextLocator = By.xpath("//li[@class='shipping-method']//span[2]");
    By totalPriceLocator = By.xpath("//tr[@class='order-total']/td[@class='cart-total-right']/span");
    By confirmButtonLocator = By.cssSelector(".button-1.confirm-order-next-step-button");

*/

    public String getTextFromPaymentMethod() {
        CustomListeners.test.log(Status.PASS,"verify payment message"+paymentMethodTextLocator);
        Reporter.log("verify payment message"+paymentMethodTextLocator.toString());
        return paymentMethodTextLocator.getText();
    }

    public String getTextFromShippingMethod()
    {
        CustomListeners.test.log(Status.PASS,"verify shipping message"+shippingMethodTextLocator);
        Reporter.log("verify shipping message"+shippingMethodTextLocator.toString());
        return shippingMethodTextLocator.getText();
    }

    public String getTextFromTotalPrice() {
        CustomListeners.test.log(Status.PASS,"verify total price"+totalPriceLocator);
        Reporter.log("verify total price message"+totalPriceLocator.toString());
        return totalPriceLocator.getText();
    }

    public void clickConfirmButton() {
        CustomListeners.test.log(Status.PASS,"click on confirmation"+confirmButtonLocator);
        Reporter.log("click on confirmation"+confirmButtonLocator.toString());
        clickOnElement(confirmButtonLocator);

    }
}
