package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByPosition;
    /* @CacheLookup
     @FindBy(xpath = "//h2[@class='product-title']")
     WebElement productArrangement;*/
    @CacheLookup
    @FindBy(xpath = "//div[@class='details']//button[@type='button']")
    WebElement addToCart;



    //  By sortByPosition = By.xpath("//select[@id='products-orderby']");
    By productArrangement = By.xpath("//h2[@class='product-title']/a");
    //   By addToCart = By.xpath("//div[@class='details']//button[@type='button']");

    public void selectSortByPosition(String value) {
        selectByValueFromDropDown(sortByPosition, value);
        CustomListeners.test.log(Status.PASS,"Select value Position"+sortByPosition);
        Reporter.log("selectPosition"+sortByPosition.toString());

    }


    public List<WebElement> returnListOfProductNamesElementsLocator() {
        List<WebElement> listOfElement = driver.findElements(productArrangement);
        CustomListeners.test.log(Status.PASS,"ListOfProductNameElement"+productArrangement);
        Reporter.log("ListOfProductNameElement"+productArrangement.toString());

        return listOfElement;
    }


    public void addToCartClick() {
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS,"ClickOnAddToCart"+addToCart);
        Reporter.log("ClickOnAddToCart"+addToCart.toString());

    }
}
