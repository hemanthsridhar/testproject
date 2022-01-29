package com.test.project.test.moreinfo;

import com.test.project.pages.PageInitializer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShippingPolicyTest extends PageInitializer {

    @Test
    public void verifyShippingPolicyHeading(){
        boolean isShippingHeadingDisplayed = landingPage().clickOnMoreInformation().clickOnShippingPolicy().verifyIfShippingPolicyHeadingIsDisplayed();
        Assert.assertTrue(isShippingHeadingDisplayed,"Shipping policy Heading is not correct or displayed");
    }
}
