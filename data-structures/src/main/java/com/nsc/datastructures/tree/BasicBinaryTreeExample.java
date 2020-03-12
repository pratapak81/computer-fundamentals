package com.nsc.datastructures.tree;

/**
 * Trees:
 * Unlike Arrays, Linked Lists, Stack and queues, which are linear data structures, trees are hierarchical data structures.
 * <p>
 * Tree Vocabulary:
 * The topmost node is called root of the tree. The elements that are directly under an element are called its children.
 * The element directly above something is called its parent
 * <p>
 * Why Trees?
 * 1. One reason to use trees might be because you want to store information that naturally forms a hierarchy.
 * Eg: file system, menu items, family relationships, Organization charts etc..
 * 2. Trees (with some ordering e.g., BST) provide moderate access/search
 * 3. Trees provide moderate insertion/deletion (quicker than Arrays and slower than Unordered Linked Lists).
 * 4. Like Linked Lists and unlike Arrays, Trees don’t have an upper limit on number of nodes as nodes are linked using pointers
 * <p>
 * Binary Tree: A tree whose elements have at most 2 children is called a binary tree.
 * Since each element in a binary tree can have only 2 children, we typically name them the left and right child
 * <p>
 * Core Java Trees:
 * TreeMap<K, V> - red black tree
 */
public class BasicBinaryTreeExample {
    public static void main(String[] args) {
        BasicBinaryTree<String> basicBinaryTree = new BasicBinaryTree<>();
        System.out.println("Size is " + basicBinaryTree.size());

        basicBinaryTree.add("D");
        basicBinaryTree.add("C");
        basicBinaryTree.add("F");
        basicBinaryTree.add("A");
        basicBinaryTree.add("G");
        basicBinaryTree.add("B");

        System.out.println("Size is " + basicBinaryTree.size());

        System.out.println("Is A exist? " + basicBinaryTree.contains("A"));
        System.out.println("Is Z exist? " + basicBinaryTree.contains("Z"));

        System.out.println("Delete F " + basicBinaryTree.delete("F"));

        System.out.println("Size is " + basicBinaryTree.size());

        basicBinaryTree.print("InOrder");
        basicBinaryTree.print("PreOrder");
        basicBinaryTree.print("PostOrder");
    }
}
