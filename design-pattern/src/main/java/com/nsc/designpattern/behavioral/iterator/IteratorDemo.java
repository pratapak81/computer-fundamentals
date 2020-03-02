package com.nsc.designpattern.behavioral.iterator;

import java.util.Iterator;

/**
 *  @see <a href="https://www.geeksforgeeks.org/iterator-pattern/">https://www.geeksforgeeks.org/iterator-pattern/</a>
 */
public class IteratorDemo {
    public static void main(String[] args) {
        BikeRepository bikeRepository = new BikeRepository();
        bikeRepository.addBike("Honda");
        bikeRepository.addBike("TVS");
        bikeRepository.addBike("Hero");
        bikeRepository.addBike("Pulsar");

        Iterator<String> iterator = bikeRepository.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*for (String s : bikeRepository) {
            System.out.println(s);
        }*/
    }
}
