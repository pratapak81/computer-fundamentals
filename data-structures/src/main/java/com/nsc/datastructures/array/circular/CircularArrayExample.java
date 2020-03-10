package com.nsc.datastructures.array.circular;

/**
 * https://www.geeksforgeeks.org/circular-array/
 */
public class CircularArrayExample {

    /*
    1. A simple solution is to create an auxiliary array of size 2*n and store in another array.
       For example for 6 people, we create below auxiliary array.
       A B C D E F A B C D E F
    2. Now for any given index, we simply print n elements starting from it. For example, we print following 6.
       A B C D E F A B C D E F
    3. This approach takes of O(n) time but takes extra space of order O(n)
    */
    public static void printCircularArrayApproach1(char[] array, int fromIndex) {
        int length = array.length;
        char[] temp = new char[length * 2];
        for (int i = 0; i < length; i++) {
            temp[i] = temp[length + i] = array[i];
        }

        System.out.print("[");
        for (int i = fromIndex; i < length + fromIndex; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println("]");
    }

    /*
    after n-th index, the next index always starts from 0 so using mod operator, we can easily access the elements of the circular list,
    if we use (i)%n and run the loop from i-th index to n+i-th index .
    and apply mod we can do the traversal in a circular array within the given array without using any extra space
    */
    public static void printCircularArrayApproach2(char[] array, int fromIndex) {
        int length = array.length;
        System.out.print("[");
        for (int i = fromIndex; i < length + fromIndex; i++) {
            System.out.print(array[i % length] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        char[] circularArray = new char[6];
        circularArray[0] = 'A';
        circularArray[1] = 'B';
        circularArray[2] = 'C';
        circularArray[3] = 'D';
        circularArray[4] = 'E';
        circularArray[5] = 'F';

        // create an auxiliary array of size 2*n and store in another array
        System.out.println("/************** Approach 1 **************");
        printCircularArrayApproach1(circularArray, 3);
        System.out.println("/************** Approach 1 end **************");

        // using the same array and mod
        System.out.println("/************** Approach 2 **************");
        printCircularArrayApproach2(circularArray, 3);
        System.out.println("/************** Approach 2 end **************");
    }
}
