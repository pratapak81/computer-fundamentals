package com.nsc.datastructures.array.twodimensional;

public class TwoDimensionalArrayExample {
    public static void main(String[] args) {
        String[][] names = new String[2][2];

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                names[i][j] = i + String.valueOf(j);
            }
        }

        for (String[] name : names) {
            for (String s : name) {
                System.out.println(s);
            }
        }
    }
}
