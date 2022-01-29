package com.test.project.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LandingPage extends PageInitializer{

    private final WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS,using = "a[title='Stores']")
    private WebElement storesLink;

    @FindBy(how = How.CSS,using = "ul.TopCategories > li")
    private List<WebElement> categories;

    @FindAll({@FindBy(how = How.CSS, using ="i.iconupdown-bg"),@FindBy(how = How.CSS,using = "div.more-info")})
    private WebElement moreInformation;

    @FindBy(how = How.CSS,using = "a[title='FAQs']")
    private WebElement faqLink;

    @FindBy(how = How.CSS,using = "a[title='Shipping Policy']")
    private WebElement shippingPolicy;


    public StoresPage clickOnStores() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(storesLink));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", storesLink);
        return storesPage();
    }

    public CategoriesPage clickOnSpecificCategory(int category) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfAllElements(categories));
        categories.get(category-1).click();
        return categoriesPage();
    }

    public List<String> getAllCategories() {
        List<String> allCategories = new ArrayList<>();
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfAllElements(categories));
        for(WebElement category : categories){
            allCategories.add(category.getText().trim());
        }
        return allCategories;
    }

    public LandingPage clickOnMoreInformation() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(moreInformation));
        moreInformation.click();
        return this;
    }

    public FAQPage clickOnFAQ() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(faqLink));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", faqLink);
        return faqPage();
    }

    public ShippingPolicyPage clickOnShippingPolicy() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(shippingPolicy));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", shippingPolicy);
        return shippingPolicyPage();
    }
}
