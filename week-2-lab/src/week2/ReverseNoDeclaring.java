package week2;

public class ReverseNoDeclaring {
    public static void main(String[] args) {
        // Array to be reversed in-place
        double[] myArray = { 8.1, 4.5, 3.1, 7.7, 7.0, 1.2, 9.0 };

        int n = myArray.length;
        // Swap pairs from ends towards center
        for (int i = 0; i < n / 2; i++) {
            double temp = myArray[i];
            myArray[i] = myArray[n - 1 - i]; // move element from other end
            myArray[n - 1 - i] = temp; // complete the swap
        }
        System.out.println("No Declaring:");
        // Print array reversed in-place
        for (double num : myArray) {
            System.out.print(num + " ");
        }
    }
}
