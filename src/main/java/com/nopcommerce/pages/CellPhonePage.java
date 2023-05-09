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

public class CellPhonePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Cell phones']")
    WebElement cellPhoneTitleLocator;

    // By cellPhoneTitleLocator = By.xpath("//h1[normalize-space()='Cell phones']");
    By ListViewIcon = By.xpath("//a[contains(text(),'List')]");


    public String actualPageTitleTextOfCellPhonePage() {
        CustomListeners.test.log(Status.PASS,"Verify the cell phone title locator"+cellPhoneTitleLocator);
        Reporter.log("Verify the cell phone title locator"+cellPhoneTitleLocator.toString());
        return getTextFromElement(cellPhoneTitleLocator);
    }

    public void clickOnListViewIcon() {
        clickOnElement(ListViewIcon);
        CustomListeners.test.log(Status.PASS,"Verify the cell phone title locator"+cellPhoneTitleLocator);
        Reporter.log(""+cellPhoneTitleLocator.toString());

    }

    public void clickOnProductNokiaLumia1020() {
        List<WebElement> mobileTitlesList = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        for (WebElement element : mobileTitlesList) {
            if (element.getText().contains("Nokia")) {
                element.click();
                break;
            }
        }
    }
}
