package com.nsc.datastructures.hash;

import java.util.Arrays;

public class BasicHashTable<K, V> {
    private HashEntry<K, V>[] data;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public BasicHashTable(int capacity) {
        this.capacity = capacity;
        data = new HashEntry[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int hash = calculateHash(key);
        if (data[hash] == null) {
            return null;
        }
        return data[hash].getValue();
    }

    // ensure capacity
    public void put(K key, V value) {
        int hash = calculateHash(key);
        if (data[hash] == null) {
            size++;
        }
        data[hash] = new HashEntry<>(key, value);
    }

    public V delete(K key) {
        V value = get(key);

        if (value != null) {
            int hash = calculateHash(key);
            data[hash] = null;
            size--;
            hash = (hash + 1) % capacity;

            // if the next slot isn't empty we should re add it so we can keep the hash algorithms clean
            /*while (data[hash] != null) {
                HashEntry<K, V> hashEntry = data[hash];
                data[hash] = null;
                put(hashEntry.getKey(), hashEntry.getValue());
                // we repositioned the hash item and didn't really add a new one, so back off the size
                size--;
                hash = (hash + 1) % capacity;
            }*/
        }
        return value;
    }

    private int calculateHash(K key) {
        int hash = key.hashCode() % capacity;
        // this is necessary to deal with collisions
        while (data[hash] != null && !data[hash].getKey().equals(key)) {
            hash = (hash + 1) % capacity;
        }
        return hash;
    }

    public void printAll() {
        System.out.println(Arrays.toString(data));
    }

    private class HashEntry<K, V> {
        private K key;
        private V value;

        public HashEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "HashEntry{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}
