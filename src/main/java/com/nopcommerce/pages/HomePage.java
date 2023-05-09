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

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeToStoreLocator;
    @CacheLookup
    @FindBy(linkText = "Electronics")
    WebElement electronicMenuLocator;
    @CacheLookup
    @FindBy(linkText = "Cell phones")
    WebElement cellPhonesSubMenuLocator;

/*    By welcomeToStoreLocator = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By electronicMenuLocator = By.linkText("Electronics");
    By cellPhonesSubMenuLocator = By.linkText("Cell phones");*/

    public void selectMenu(String menu) {
        List<WebElement> listOfMenuElements = driver.findElements(By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a"));
        for (WebElement element : listOfMenuElements) {
            System.out.println(element.getText());

            if (element.getText().trim().equalsIgnoreCase(menu)) {
                element.click();
                break;
            }

        }
        CustomListeners.test.log(Status.PASS,"Select menu");
        Reporter.log("selectMenu"+toString());

    }


    public String getTextFromWelcomeStore() {
        CustomListeners.test.log(Status.PASS,"Verify welcomeStore"+welcomeToStoreLocator);
        Reporter.log("verify welcomestore"+welcomeToStoreLocator.toString());
        return getTextFromElement(welcomeToStoreLocator);

    }

    public void mouseHoverOnElectronics() {
        mouseHoverToElement(electronicMenuLocator);
        CustomListeners.test.log(Status.PASS,"mousehoverOnElectronics"+electronicMenuLocator);
        Reporter.log("mousehoveronelectronics"+electronicMenuLocator.toString());

    }

    public void mouseHoverAndClickOnCellPhone() {
        mouseHoverToElementAndClick(cellPhonesSubMenuLocator);
        CustomListeners.test.log(Status.PASS,"clickoncellphone"+cellPhonesSubMenuLocator);
        Reporter.log("clickoncellphone"+cellPhonesSubMenuLocator.toString());

    }


}
