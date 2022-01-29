package com.test.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShippingPolicyPage extends PageInitializer{

    private final WebDriver driver;

    public ShippingPolicyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = "//h3[text()='SHIPPING POLICY']")
    private WebElement heading;

    public boolean verifyIfShippingPolicyHeadingIsDisplayed() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(heading));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
