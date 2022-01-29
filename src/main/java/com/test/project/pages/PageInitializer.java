package com.test.project.pages;

import com.test.project.base.DriverFactory;

public class PageInitializer extends DriverFactory {

        public LandingPage landingPage() {
            return new LandingPage(getDriver());
        }

    public StoresPage storesPage() {
        return new StoresPage(getDriver());
    }

    public CategoriesPage categoriesPage() {
        return new CategoriesPage(getDriver());
    }

    public FAQPage faqPage() {
        return new FAQPage(getDriver());
    }

    public ShippingPolicyPage shippingPolicyPage() {
        return new ShippingPolicyPage(getDriver());
    }



}
