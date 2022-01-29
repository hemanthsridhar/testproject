package com.test.project.base;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();


    public synchronized static WebDriver getDriver() {
        return driver.get();
    }


    @BeforeMethod
    public void before() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeOptions options  = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setJavascriptEnabled(true);
        dc.setPlatform(Platform.ANY);
        driver.set(new RemoteWebDriver(new URL("http://"+System.getProperty("hub")+"/wd/hub"), dc));
        getDriver().get("https://www.thecollective.in");
        getDriver().manage().window().maximize();
    }

    @AfterMethod
    public void after() {
        getDriver().quit();
    }
}
