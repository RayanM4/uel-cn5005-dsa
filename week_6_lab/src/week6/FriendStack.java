package week6;

import java.util.Stack;

public class FriendStack {
    public static void main(String[] args) {
        // create stack
        Stack<String> myFriends = new Stack<>();
        // display empty stack
        System.out.printf("Stack = %s\n\n", myFriends);
        // push new items to stack
        myFriends.push("Zain");
        System.out.println("Pushed: Zain");
        myFriends.push("Veer");
        System.out.println("Pushed: Veer");
        myFriends.push("Abdulai");
        System.out.println("Pushed: Abdulai");
        myFriends.push("Jaden");
        System.out.println("Pushed: Jaden");
        myFriends.push("Seth");
        System.out.println("Pushed: Seth\n");
        // display stack with 5 items
        System.out.printf("Stack = %s\n\n", myFriends);

        // pop item from stack
        String friendAtTop = myFriends.pop();
        System.out.printf("Popped: %s\n\n", friendAtTop);
        // display stack after item removed
        System.out.printf("Stack = %s\n", myFriends);
    }
}
