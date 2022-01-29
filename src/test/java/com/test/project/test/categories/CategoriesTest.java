package com.test.project.test.categories;

import com.test.project.pages.PageInitializer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CategoriesTest extends PageInitializer {

    @Test
    public void clickOnACategoryAndVerifyHeading(){
        List<String> allCategories = landingPage().getAllCategories();
        String categoryHeading = landingPage().clickOnSpecificCategory(1).getHeading();
        Assert.assertEquals(allCategories.get(0).toLowerCase(),categoryHeading.toLowerCase(),"Category heading is not matching the category list");
    }

}
