package week5;

public class RecursiveBinarySearch {
    public static void main(String[] args) {

        int[] array = { 3, 4, 5, 6, 7, 8, 9 };
        int element = 8;
        int index = find(array, element);

        if (index != -1) { // only output if eleement is in the list
            System.out.printf("Element %d found at index: %d\n", element, index);
        } else {
            System.out.printf("Element %d not found in array!\n", element);
        }
    }

    static int find(int[] array, int element) { // wrapper method to simplify params
        return findRecursive(array, element, 0, array.length - 1);
    }

    static int findRecursive(int[] array, int element, int low, int high) {
        if (low > high) { // if element is not in the array
            return -1;
        }

        int mid = low + (high - low) / 2; // middle index

        if (array[mid] == element) {
            return mid;
        }

        else if (element < array[mid]) {
            return findRecursive(array, element, low, mid - 1); // lists elements in lower half
        }

        else {
            return findRecursive(array, element, mid + 1, high); // lists elements in upper half
        }
    }
}
