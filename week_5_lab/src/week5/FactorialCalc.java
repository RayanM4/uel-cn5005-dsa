package week5;

import java.util.Scanner;

public class FactorialCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter a number to calculate its factorial: ");
        num = scanner.nextInt();
        System.out.printf("The factorial of %d is: %d\n", num, getFactorial(num));

        scanner.close();
    }

    static int getFactorial(int num) { // method to calculate factorial
        if (num == 0) { // the factorial of 0 is defined as 1
            return 1;
        }
        int ans = 1;
        for (int i = num; i >= 1; i--) { // loop down to 1
            ans *= i; // n(n-1)(n-2)(...)
        }
        return ans;
    }
}
