package com.test.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FAQPage extends PageInitializer{

    private final WebDriver driver;

    public FAQPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = "//h3[text()='FREQUENTLY ASKED QUESTIONS']")
    private WebElement heading;

    public boolean verifyIfFAQHeadingIsDisplayed() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(heading));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
