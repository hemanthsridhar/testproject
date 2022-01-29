package com.test.project.test.moreinfo;

import com.test.project.pages.PageInitializer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoreInformationTest extends PageInitializer {

    @Test
    public void verifyFAQHeading(){
        boolean isFAQHeadingDisplayed = landingPage().clickOnMoreInformation().clickOnFAQ().verifyIfFAQHeadingIsDisplayed();
        Assert.assertTrue(isFAQHeadingDisplayed,"FAQ Heading is not correct or displayed");
    }
}
