package week2;

public class ReverseByDeclaring {
    public static void main(String[] args) {
        // Original array to be reversed
        double[] myArray = { 8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0 };

        // Create a new array to hold the reversed values
        double[] reverseArray = new double[myArray.length];

        // Copy elements and reverse the order
        for (int i = 0; i < myArray.length; i++) {
            // element at position i in reverseArray comes from the symmetric end of myArray
            reverseArray[i] = myArray[myArray.length - 1 - i];
        }

        // Print the reversed array
        for (double num : reverseArray) {
            System.out.print(num + " ");
        }
    }
}
