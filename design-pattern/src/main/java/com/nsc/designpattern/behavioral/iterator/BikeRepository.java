package com.nsc.designpattern.behavioral.iterator;

import java.util.Iterator;

/**
 * Concrete Aggregate - used to store elements. Iterable interface is Aggregate
 * we can use our own interface also
 */
public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository() {
        this.bikes = new String[10];
        this.index = 0;
    }

    public void addBike(String bike) {
        if (index == bikes.length) {
            String[] extendedArray = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, extendedArray, 0, bikes.length);
            bikes = extendedArray;
        }
        bikes[index++] = bike;
    }

    @Override
    public Iterator<String> iterator() {
        return new BikeIterator(bikes);
    }
}
