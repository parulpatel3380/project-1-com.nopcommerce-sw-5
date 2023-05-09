package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumia1020Page extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement TitleTextOfProductNokiaLumia1020Page;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement PriceOfProductNokiaLumia1020;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20'])[1]")
    WebElement QtyProductNokiaLumia1020;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20'])[1]")
    WebElement ButtonAddToCartFromPageNokiaLumia1020;
    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement MessageOfProductBeingInShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement CrossFromMessage;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement ShoppingCartLinkFromNokiaLumia1020Page;

    /*By TitleTextOfProductNokiaLumia1020Page = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By PriceOfProductNokiaLumia1020 = By.xpath("//span[@id='price-value-20']");
    By QtyProductNokiaLumia1020 = By.xpath("(//input[@id='product_enteredQuantity_20'])[1]");
    By ButtonAddToCartFromPageNokiaLumia1020 = By.xpath("(//button[@id='add-to-cart-button-20'])[1]");
    By MessageOfProductBeingInShoppingCart = By.xpath("//p[@class='content']");
    By CrossFromMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By ShoppingCartLinkFromNokiaLumia1020Page = By.xpath("//span[contains(text(),'Shopping cart')]");

*/
    public String actualTitleTextOfProductNokiaLumia1020Page() {
        CustomListeners.test.log(Status.PASS,"verify the product nokiaLumiaPage"+TitleTextOfProductNokiaLumia1020Page);
        Reporter.log("verify the product nokia lumia page"+TitleTextOfProductNokiaLumia1020Page.toString());
        return getTextFromElement(TitleTextOfProductNokiaLumia1020Page);
    }

    public String actualPriceOfProductNokiaLumia1020() {
        CustomListeners.test.log(Status.PASS,"verify the price product Nokia lumia"+ PriceOfProductNokiaLumia1020);
        Reporter.log("verify nokia lumia product"+PriceOfProductNokiaLumia1020.toString());
        return getTextFromElement(PriceOfProductNokiaLumia1020);
    }

  /*  public void clearAnElementBeforeEnteringQty() {
        QtyProductNokiaLumia1020.clear();
    }*/

    public void updateTheQuantity(String qty) {
        QtyProductNokiaLumia1020.clear();
        sendTextToElement(QtyProductNokiaLumia1020, qty);
        CustomListeners.test.log(Status.PASS,"update quantity"+QtyProductNokiaLumia1020);
        Reporter.log("update the quantity"+QtyProductNokiaLumia1020.toString());

    }

    public void clickOnButtonAddToCartFromPageNokiaLumia1020() throws InterruptedException {
        clickOnElement(ButtonAddToCartFromPageNokiaLumia1020);
        CustomListeners.test.log(Status.PASS,"click on cart button"+ButtonAddToCartFromPageNokiaLumia1020);
        Reporter.log("click on cart button"+ButtonAddToCartFromPageNokiaLumia1020.toString());

        Thread.sleep(1000);
    }

    public String actualMessageOfProductBeingInShoppingCart() throws InterruptedException {
        CustomListeners.test.log(Status.PASS,"verify actual message"+MessageOfProductBeingInShoppingCart);
        Reporter.log("Verify actual message"+MessageOfProductBeingInShoppingCart.toString());
        return getTextFromElement(MessageOfProductBeingInShoppingCart);
    }

    public void clickOnCrossFromMessage() throws InterruptedException {
        clickOnElement(CrossFromMessage);
        CustomListeners.test.log(Status.PASS,"click on cross button"+CrossFromMessage);
        Reporter.log("click on cross button"+ CrossFromMessage.toString());
        Thread.sleep(1000);
    }

    public void hoverToShoppingCartAndClickOnAddToCart() throws InterruptedException {
        mouseHoverToElementAndClick(ShoppingCartLinkFromNokiaLumia1020Page);
        CustomListeners.test.log(Status.PASS,"click on Add to cart"+ShoppingCartLinkFromNokiaLumia1020Page);
        Reporter.log("click on Add to cart"+ShoppingCartLinkFromNokiaLumia1020Page.toString());
        Thread.sleep(2000);
    }
}
