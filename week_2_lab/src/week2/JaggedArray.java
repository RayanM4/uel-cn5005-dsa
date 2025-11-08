package week2;

public class JaggedArray {
    public static void main(String[] args) {
        // Create a jagged matrix of integers with 10 rows increasing column with each
        // row
        int[][] X = new int[10][];

        // For row i, allocate an array of length i+1
        for (int i = 0; i < X.length; i++) {
            X[i] = new int[i + 1];
        }

        // Fill jagged array with sequential integers starting from 1
        int p = 1;

        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                X[i][j] = p++; // assign and increment counter
            }
        }

        // Print each row on its own line
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                System.out.print(X[i][j] + " "); // print number with space
            }
            System.out.println(); // new line after each row
        }
    }
}
