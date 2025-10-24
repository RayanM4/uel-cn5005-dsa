package week3;

import java.util.Scanner;

// implements a simple singly linked list
public class LinkedList {

    // represents single node in list
    private class Node {
        private int data;
        private Node next;

        // constructs new node with given value
        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    // reference to the first node in the list
    private Node head;
    // reference to the last node in the list
    private Node tail;
    // the total number of nodes in the list
    private int size;

    // constructs an empty linked list
    LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // inserts a new node at the beginning of the list
    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = newNode;
        }

        size++;

    }

    // inserts a new node at the end of the list
    public void insertLast(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    // prints all elements in the list in order
    public void printMe() {
        if (size == 0) {
            System.out.println("the list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // prints the element at a specific 1-based index
    public void printAt(int index) {
        if (index < 1 || index > size) {
            System.out.println("invalid position");
            return;
        }

        Node temp = head;
        int count = 1;

        while (temp != null) {
            if (count == index) {
                System.out.println("element at position " + index + " is " + temp.data);
                return;
            }

            temp = temp.next;
            count++;
        }
    }

    // deletes the first node (head) from the list
    private void deleteFirst() {
        if (size == 0) {
            System.out.println("nothing to delete");
            return;
        }

        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
    }

    // deletes the last node (tail) from the list
    private void deleteLast() {
        if (size == 0) {
            System.out.println("nothing to delete");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;

            while (temp.next != tail) {
                temp = temp.next;
            }

            temp.next = null;
            tail = temp;
        }

        size--;
    }

    // main method to test the linked list
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.print("enter number of elements to add: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("enter value " + (i + 1) + ": ");
            int val = sc.nextInt();
            list.insertLast(val);
        }

        System.out.println("\nthe list is:");
        list.printMe();
        System.out.print("\nenter position to display element: ");
        int idx = sc.nextInt();
        list.printAt(idx);
        System.out.print("\ndelete from head (1) or tail (2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            list.deleteFirst();
        } else if (choice == 2) {
            list.deleteLast();
        } else {
            System.out.println("invalid choice");
        }

        System.out.println("\nlist after deletion:");
        list.printMe();
        sc.close();

    }

}