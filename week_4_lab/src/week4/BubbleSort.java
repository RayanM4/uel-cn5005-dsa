package week4;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 93, 42, 51, 3, 455, 20, 5, 100, 5487, 87, 96, 21 };
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int arr[]) {
        int n = arr.length;
        int temp; //temporary value
        boolean isSwapped;

        for (int i = 0; i < n; i++) {
            isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1]; //moves next element to current index
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (isSwapped==false) {
                break;
            }
        }
        return arr;

    }
}