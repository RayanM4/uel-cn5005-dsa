package week4;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = { 12, 11, 13, 5, 6, 7 }; // initialize array

        sort(arr); // call sort method 

        System.out.print(Arrays.toString(arr)); // convert array to string to print

    }

    static int[] sort(int[] arr) { // wrapper to simplify params
        return mergeSort(arr, 0, arr.length - 1);
    }

    static int[] mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = ((left + right) / 2); // middle index
            mergeSort(arr, left, mid); // recursive calls
            mergeSort(arr, mid + 1, right);

            Merge(arr, left, mid, right); // call merge helper method
        }
        return arr;
    }

    static void Merge(int[] arr, int left, int mid, int right) {
        // find sizes of the subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;
        // create temp arrays
        int l[] = new int[n1];
        int r[] = new int[n2];
        // copy data to temp arrays
        for (int i = 0; i < n1; ++i) {
            l[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            r[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0; // indexes of first and sceond sub-arrays
        int k = left; // index of merged sub-array

        while (i < n1 && j < n2) { // merge temp arrays

            if (l[i] <= r[j]) {
                arr[k] = l[i];
                i++;
            }

            else {
                arr[k] = r[j];
                j++;
            }

            k++;
        }
        // copy remaining elements
        while (i < n1) {
            arr[k] = l[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = r[j];
            j++;
            k++;
        }
    }
}
