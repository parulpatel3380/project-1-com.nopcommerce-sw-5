package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartTitleLocator;
    @CacheLookup
    @FindBy(css = ".cart-label")
    WebElement qtyFieldLocator ;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartLocator;
    @CacheLookup
    @FindBy(css = ".button-1.cart-button")
    WebElement goToCartButtonLocator;
    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']//td[@class='cart-total-right']/span")
    WebElement totalPriceLocator;
    @CacheLookup
    @FindBy(css = "#termsofservice")
    WebElement termsOfServiceCheckBoxLocator;
    @CacheLookup
    @FindBy(css = "#checkout")
    WebElement checkoutButtonLocator;
    @CacheLookup
    @FindBy(css = "#updatecart")
    WebElement updateShoppingCartButtonLocator;
    @CacheLookup
    @FindBy(className = "qty-input")
    WebElement qtyField1Locator;
    /*
    By shoppingCartTitleLocator = By.xpath("//h1[normalize-space()='Shopping cart']");
    By qtyFieldLocator = By.xpath("//input[@class='qty-input']");
    By shoppingCartLocator = By.cssSelector(".cart-label");
    By goToCartButtonLocator = By.cssSelector(".button-1.cart-button");
    By totalPriceLocator = By.xpath("//tr[@class='order-total']//td[@class='cart-total-right']/span");
    By termsOfServiceCheckBoxLocator = By.cssSelector("#termsofservice");
    By checkoutButtonLocator = By.cssSelector("#checkout");
    By updateShoppingCartButtonLocator = By.cssSelector("#updatecart");
    By qtyField1Locator = By.className("qty-input");
*/
    public String getTextFromShoppingCart(){
        CustomListeners.test.log(Status.PASS,"getTextFromShoppingCart"+shoppingCartTitleLocator);
        Reporter.log("getTextFromShoppingCart"+shoppingCartTitleLocator.toString());
        return shoppingCartTitleLocator.getText();
    }

    public void mouseHoverOnShoppingCart(){
        mouseHoverToElementAndClick(shoppingCartLocator);
        CustomListeners.test.log(Status.PASS,"mouseHoverOnShoppingCart"+shoppingCartLocator);
        Reporter.log("mouseHoverOnShoppingCart"+shoppingCartLocator.toString());

    }

    public void clickOnGoToCart(){
        clickOnElement(goToCartButtonLocator);
        CustomListeners.test.log(Status.PASS,"clickOnGoToCart"+goToCartButtonLocator);
        Reporter.log("clickOnGoToCart"+goToCartButtonLocator.toString());

    }
    public void updateTheQuantity(String qty) {
        qtyField1Locator.clear();
        sendTextToElement(qtyFieldLocator, qty);
        CustomListeners.test.log(Status.PASS,"updateTheQuantity"+qtyField1Locator);
        Reporter.log("updateTheQuantity"+qtyField1Locator.toString());

    }

    public void clickUpdateCartButton(){

        clickOnElement(updateShoppingCartButtonLocator);
        CustomListeners.test.log(Status.PASS,"clickUpdateCartButton"+updateShoppingCartButtonLocator);
        Reporter.log("clickUpdateCartButton"+updateShoppingCartButtonLocator.toString());

    }

    public void clearAnElementFromUpdatedShoppingCart() {
        qtyField1Locator.clear();
        CustomListeners.test.log(Status.PASS,"clearAnElementFromUpdatedShoppingCart"+qtyField1Locator);
        Reporter.log("clearAnElementFromUpdatedShoppingCart"+qtyField1Locator.toString());

    }
    public String getTextFromTotal(){
        CustomListeners.test.log(Status.PASS,"getTextFromTotal"+totalPriceLocator);
        Reporter.log("getTextFromTotal"+totalPriceLocator.toString());
        return totalPriceLocator.getText();

    }
    public void checkBoxClick(){
        clickOnElement(termsOfServiceCheckBoxLocator);
        CustomListeners.test.log(Status.PASS,"checkBoxClick"+termsOfServiceCheckBoxLocator);
        Reporter.log("checkBoxClick"+termsOfServiceCheckBoxLocator.toString());

    }

    public void clickCheckOut(){
        clickOnElement(checkoutButtonLocator);
        CustomListeners.test.log(Status.PASS,"clickCheckOut"+checkoutButtonLocator);
        Reporter.log("clickCheckOut"+checkoutButtonLocator.toString());

    }


    public String verifyQuantity(){
        CustomListeners.test.log(Status.PASS,"verifyQuantity"+qtyField1Locator);
        Reporter.log("verifyQuantity"+qtyField1Locator.toString());
        return qtyField1Locator.getAttribute("value");

    }
}
