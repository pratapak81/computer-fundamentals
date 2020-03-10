package com.nsc.datastructures.array.linear;

import java.util.Arrays;

public class LinearArrayExample {
    public static void main(String[] args) {
        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            names[i] = String.valueOf(i);
        }

        System.out.println(Arrays.toString(names));
    }
}
