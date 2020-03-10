package com.nsc.datastructures.queue.circularqueue;

import java.util.Arrays;

public class CircularQueue<T> {
    private T[] data;
    private int front;
    private int end;
    private int size;

    @SuppressWarnings("unchecked")
    public CircularQueue() {
        data = (T[]) new Object[6];
        size = 0;
        front = end = -1;
    }

    public int size() {
        return size;
    }

    public void enQueue(T element) {
        if (size() == data.length) {
            throw new RuntimeException("Queue is full");
        }
        end = (end + 1) % data.length;
        data[end] = element;
        if (front == -1) {
            front = end;
        }
        size++;
    }

    public T deQueue() {
        if (size() == 0) {
            throw new RuntimeException("Empty queue");
        }
        T element = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return element;
    }

    public void printAll() {
        System.out.println(Arrays.toString(data));
    }
}
