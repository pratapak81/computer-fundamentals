package com.nsc.designpattern.creational.factory_method;

/**
 * When you don't want to expose instantiation logic to client use factory method design pattern.
 * Object created is referenced by a common interface
 * Need to decide Object at Runtime then factory method pattern is suitable
 * Eg: Calendar, ResourceBundle, NumberFormat
 * Note:
 * 1. We can implement Factory pattern either by using abstract class or by using interface
 * 2. Factory pattern is exactly opposite of Singleton pattern
 */
public class WebsiteFactory {

    private WebsiteFactory(){}

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
