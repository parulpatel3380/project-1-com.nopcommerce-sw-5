package com.nopcommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktop;

    // By desktop = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
    // By sortDesktopsPage = By.xpath("//select[@id='products-orderby']");
    public void desktopClick() {
        clickOnElement(desktop);
        CustomListeners.test.log(Status.PASS,"ClickOnDesktop"+desktop);
        Reporter.log("ClickOnDesktop"+desktop.toString());

    }

}
