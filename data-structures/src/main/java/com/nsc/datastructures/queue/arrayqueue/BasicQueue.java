package com.nsc.datastructures.queue.arrayqueue;

import java.util.StringJoiner;

public class BasicQueue<T> {
    private T[] data;
    private int front;
    private int end;

    public BasicQueue() {
        this(100);
    }

    @SuppressWarnings("unchecked")
    public BasicQueue(int size) {
        data = (T[]) new Object[size];
        front = end = -1;
    }

    public int size() {
        if (front == -1 && end == -1) {
            return 0;
        }
        return end - front + 1;
    }

    // ensure capacity before adding
    public void enQueue(T element) {
        if ((end + 1) % data.length == front) {
            throw new IndexOutOfBoundsException("Queue is full");
        }

        if (size() == 0) {
            front++;
            end++;
            data[end] = element;
        } else {
            end++;
            data[end] = element;
        }
    }

    // set the removed element null so that it will be eligible for Garbage Collection. Same as PriorityQueue in Java
    public T deQueue() {
        T element = null;
        if (size() == 0) {
            throw new UnsupportedOperationException("Queue is empty");
        } else if (end == front) {
            element = data[front];
            data[front] = null;
            front = -1;
            end = -1;
        } else {
            element = data[front];
            data[front] = null;
            front++;
        }
        return element;
    }

    public boolean contains(T element) {
        if (size() == 0) {
            return false;
        }
        for (int i = front; i <= end; i++) {
            if (data[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public T access(int index) {
        if (size() == 0 || index > size()) {
            throw new RuntimeException("No item in the Queue or index out of bound");
        }

        int trueIndex = 0;
        for (int i = front; i <= end; i++) {
            if (trueIndex == index) {
                return data[i];
            }
            trueIndex++;
        }
        throw new RuntimeException("can't get item at the given position");
    }

    // dummy method to print all the elements
    public void printAll() {
        System.out.print("[");
        StringJoiner stringJoiner = new StringJoiner(", ");
        for (int i = front; i <= end; i++) {
            stringJoiner.add((String) data[i]);
        }
        System.out.print(stringJoiner.toString());
        System.out.println("]");
    }
}
