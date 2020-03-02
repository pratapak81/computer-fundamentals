package com.nsc.designpattern.creational.factory_method;

public class FactoryDemo {
    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        assert blog != null;
        System.out.println(blog.getPageList());

        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        assert shop != null;
        System.out.println(shop.getPageList());
    }
}
