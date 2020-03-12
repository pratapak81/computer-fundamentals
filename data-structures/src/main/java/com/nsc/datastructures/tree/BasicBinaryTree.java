package com.nsc.datastructures.tree;

/**
 * Allowing duplicates adds complexity
 *
 * @param <T>
 */
public class BasicBinaryTree<T extends Comparable<T>> {

    private Node root;
    private int size;

    public BasicBinaryTree() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(T data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
            size++;
        } else {
            insert(root, node);
        }
    }

    public boolean contains(T element) {
        return getNode(element) != null;
    }

    public boolean delete(T element) {
        boolean deleted = false;
        if (root == null) {
            return false;
        }

        // find the node to delete
        Node currentNode = getNode(element);

        if (currentNode != null) {
            // if the node to delete doesn't have any children, just delete it
            if (currentNode.getLeft() == null && currentNode.getRight() == null) {
                unlink(currentNode, null);
                deleted = true;
            }
            // if the node to delete only has left child, remove it in the hierarchy
            else if (currentNode.getLeft() != null && currentNode.getRight() == null) {
                unlink(currentNode, currentNode.getLeft());
                deleted = true;
            }
            // if the node to delete only has right child, remove it in the hierarchy
            else if (currentNode.getLeft() == null && currentNode.getRight() != null) {
                unlink(currentNode, currentNode.getRight());
                deleted = true;
            }
            // the node has both children, do a node swap to delete
            // replace current node with highest node from left side or lowest node from the ride side
            else {
                // using lowest node from the right side
                Node lowestNode = currentNode.getRight();
                while (lowestNode.getLeft() != null && lowestNode.getRight() != null) {
                    lowestNode = lowestNode.getLeft();
                }

                lowestNode.getParent().setLeft(null);
                //lowestNode.getParent().setLeft(lowestNode.getRight());

                lowestNode.setLeft(currentNode.getLeft());
                lowestNode.setRight(currentNode.getRight());

                unlink(currentNode, lowestNode);
                deleted = true;
            }
        }

        if (deleted) {
            size--;
        }

        return deleted;
    }

    private void unlink(Node currentNode, Node newNode) {
        if (currentNode == root) {
            newNode.setLeft(currentNode.getLeft());
            newNode.setRight(currentNode.getRight());
            this.root = newNode;
        } else if (currentNode.getParent().getRight() == currentNode) {
            currentNode.getParent().setRight(newNode);
        } else {
            currentNode.getParent().setLeft(newNode);
        }
    }

    // non recursive
    private Node getNode(T element) {
        Node currentNode = root;

        while (currentNode != null) {

            int value = element.compareTo(currentNode.getData());
            // see if the node is a match
            if (value == 0) {
                return currentNode;
            }
            // if the val is less than 0 we go to the left side of the tree
            if (value < 0) {
                currentNode = currentNode.getLeft();
            }
            // otherwise we go to the right side
            else {
                currentNode = currentNode.getRight();
            }
        }
        return null;
    }

    private void insert(Node parent, Node child) {
        // check if child is less than parent, if lesser add it to left side
        if (child.getData().compareTo(parent.getData()) < 0) {
            if (parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParent(parent);
                size++;
            } else {
                insert(parent.getLeft(), child);
            }
        }

        // check if child is greater than parent, if it is greater add it to right side
        if (child.getData().compareTo(parent.getData()) > 0) {
            if (parent.getRight() == null) {
                parent.setRight(child);
                child.setParent(parent);
                size++;
            } else {
                insert(parent.getRight(), child);
            }
        }

        // if parent and child data equal then duplicate key, ignore.
        // If we want to allow duplicates best approach is to keep a counter at the node
        // and increase the counter when duplicate element found
    }

    public void print(String order) {
        switch (order) {
            case "PreOrder":
                printPreOrder(root);
                break;
            case "PostOrder":
                printPostOrder(root);
                break;
            default:
                printInOrder(root);
        }
        System.out.println();
    }

    // Left, Root and Right
    public void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.getData() + " ");
        printInOrder(node.right);
    }

    public void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getData() + " ");
        printPreOrder(node.getLeft());
        printPreOrder(node.getRight());
    }

    public void printPostOrder(Node node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.getData() + " ");
    }

    private class Node {
        private Node left;
        private Node right;
        private Node parent;
        private T data;

        public Node(T data) {
            left = right = parent = null;
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
