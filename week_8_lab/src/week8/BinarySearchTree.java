package week8;

public class BinarySearchTree {

    private Node root;

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        // add(8,3,1,6,7,10,14,4)
        tree.insert(8);
        System.out.println("Inserted: 8");
        tree.insert(3);
        System.out.println("Inserted: 3");
        tree.insert(1);
        System.out.println("Inserted: 1");
        tree.insert(6);
        System.out.println("Inserted: 6");
        tree.insert(7);
        System.out.println("Inserted: 7");
        tree.insert(10);
        System.out.println("Inserted: 10");
        tree.insert(14);
        System.out.println("Inserted: 14");
        tree.insert(4);
        System.out.println("Inserted: 4");
        System.out.println();
        // print tree in-order
        System.out.println("Tree elements in-order: ");
        tree.inorder();
        System.out.println();
        // delete 10 from tree
        tree.delete(10);
        System.out.println("Deleted: 10");
        System.out.println();
        // print tree after removing 10
        System.out.println("Tree elements in-order: ");
        tree.inorder();
    }

    private static class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            // left first
            inorderRec(root.left);
            // print value
            System.out.print(root.key + " ");
            // right last
            inorderRec(root.right);
        }
    }

    private Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;

        if (root.key > key)
            return search(root.left, key);

        return search(root.right, key);
    }

    // wrapper method for insert
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        // if tree is empty return new node
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // recur down the tree
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        }

        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        // return the node pointer
        return root;

    }

    // wrapper method for delete
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        // if tree is empty
        if (root == null) {
            return root;
        }
        // recur down tree
        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        }
        // if key = rot key then delete this node
        else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // node with 2 children: get the inorder successor (smallest in the right
            // subtree)
            root.key = minValue(root.right);
            // delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    private int minValue(Node node) {
        Node current = node;
        // loop down to find the leftmost leaf
        while (current.left != null) {
            current = current.left;
        }
        return (current.key);
    }

    private int maxValue(Node node) {
        Node current = node;
        // loop down to find rightmost leaf
        while (current.right != null) {
            current = current.right;
        }
        return (current.key);
    }
}