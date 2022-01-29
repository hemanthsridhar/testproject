package com.test.project.test.stores;

import com.test.project.pages.PageInitializer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoresPageTest extends PageInitializer {

    @Test
    public void verifyStorePageheading(){
        String storePageHeading = landingPage().clickOnStores().getHeading();
        Assert.assertEquals(storePageHeading,"FIND A STORE","store page heading is wrong");
    }
}
