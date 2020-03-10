package com.nsc.datastructures.hash;

/**
 * Hashtable doesn't preserve the insertion order, neither it sorts the inserted data based on keys or values.
 * Which means no matter what keys & values you insert into Hashtable, the result would not be in any particular order
 * <p>
 * Core Java Hashes:
 * Map<K, V>
 * Hashtable<K, V>
 * HashMap<K, V>
 * <p>
 * Read more: hash collisions and rehashing
 * <p>
 * ReHashing:
 * 1. When you rehash and move everything to a new location (bucket etc) then the older elements are also rehashed again
 * and stored in the new bucket according to their new hash codes. The old space which was allocated to store the elements is garbage collected
 * 2. Rehashing is done based on load factor. It is advisable to have a load factor of around 0.75.
 * Load factor is defined as (m/n) where n is the total size of the hash table and m is the preferred number of entries
 * which can be inserted before a increment in size of the underlying data structure is required
 * 3. rehashing is the process of applying a hash function to the entries to move them to another hash table.
 * It is possible to use the hash function which was used earlier or use a new function altogether
 * 4. While rehashing, the linked list for each bucket gets reversed in order.
 * This happens because HashMap doesn't append the new element at the tail instead it appends the new element at the head.
 * So when rehashing occurs, it reads each element and inserts it in the new bucket at the head
 * and then keeps on adding next elements from the old map at the head of the new map resulting in reversal of linked list
 * <p>
 * Collisions:
 * When we put objects into a hashtable, it is possible that different objects (by the equals() method) might have the same hashcode.
 * This is called a collision. To resolve collisions, hashtable uses an array of lists.
 * The pairs mapped to a single bucket (array index) are stored in a list and list reference is stored in array index.
 */
public class BasicHashTableExample {
    public static void main(String[] args) {
        BasicHashTable<String, String> basicHashTable = new BasicHashTable<>(5);

        System.out.println(basicHashTable.size());

        basicHashTable.put("A", "A");
        System.out.println(basicHashTable.size()); // 1

        basicHashTable.put("A", "A");
        System.out.println(basicHashTable.size()); // 1

        basicHashTable.put("B", "B");
        basicHashTable.put("C", "C");
        basicHashTable.put("D", "D");
        basicHashTable.put("E", "E");

        basicHashTable.printAll();

        basicHashTable.put("C", "X");
        basicHashTable.printAll();

        System.out.println("Value of key 'C'= " + basicHashTable.get("C"));

        basicHashTable.delete("C");
        basicHashTable.printAll();

        basicHashTable.put("Z", "Z");
        basicHashTable.printAll();
    }
}
