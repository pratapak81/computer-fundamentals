package com.nsc.designpattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * choose this prototype when we need to avoid costly object creation. This design pattern is implemented using
 * Registry. New objects are created using existing objects Eg: Clone
 * new we will use only once
 * Eg: java.lang.Object#clone()
 */
public class Registry {

    private final Map<String, Item> itemMap = new HashMap<>();

    public Registry() {
        loadItems();
    }

    /*
     * Actual prototype implementation
     */
    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) itemMap.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(1000);
        movie.setRuntime("2 hours 50 minutes");
        itemMap.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setPrice(12.2);
        book.setPagesCount(1230);
        itemMap.put("Book", book);
    }
}
