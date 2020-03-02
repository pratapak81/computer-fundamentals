package com.nsc.designpattern.behavioral.iterator;

import java.util.Iterator;

/**
 * we can use our own Iterator interface also
 * The iterator pattern provides a way to access the elements of an aggregate object without exposing its underlying representation
 * <p>
 * Iterator design pattern has following participants
 * 1. Aggregate
 * 2. Concrete Aggregate
 * 3. Iterator
 * 4. Concrete Iterator
 * 5. Client
 * <p>
 * This class is concrete iterator. Iterator is interface based
 */
public class BikeIterator implements Iterator<String> {

    private String[] bikes;
    private int currentIndex;

    public BikeIterator(String[] bikes) {
        this.bikes = bikes;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return this.currentIndex < bikes.length && bikes[currentIndex] != null;
    }

    @Override
    public String next() {
        return bikes[currentIndex++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
