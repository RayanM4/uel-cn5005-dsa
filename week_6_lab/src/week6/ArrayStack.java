package week6;

public class ArrayStack {

    private int arr[];
    private int top;
    private int capacity;

    // constructor to initialise stack
    ArrayStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // utility function to add element x in the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public int pop() {
        // check for stack underflow
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated\n");
            System.exit(1);
        }
        System.out.println("Removing " + peek());
        // decrease stack size by 1 and return the popped element
        return arr[top--];
    }

public int peek() {
        if (isEmpty()) { // handle error case
            throw new RuntimeException("Stack is Empty");
        }
        // if not empty, just return the top element
        return arr[top];
    }

    // utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // utility function to check if the stack is empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // utility function to check if the stack is full or not
    public boolean isFull() {
        return size() == capacity;
    }

    public static void main(String[] args) {
        // create array with capacity of 5
        ArrayStack stack = new ArrayStack(5);
        System.out.println("Stack = " + stack);
        stack.push(22);
        System.out.println("Pushed: 22");
        stack.push(87);
        System.out.println("Pushed: 87");
        stack.push(36);
        System.out.println("Pushed: 36");
        stack.push(49);
        System.out.println("Pushed: 49");
        stack.push(71);
        System.out.println("Pushed: 71");

        stack.pop();
        System.out.println("Item removed");

        System.out.println("Top element is: " + stack.peek());
        System.out.println("The stack size is: " + stack.size());


    }
}