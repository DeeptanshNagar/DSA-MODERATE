// Selection Sorting...

// worst case time complexity - O(n*n);
// best case time complexity - O(n*n);
// tc = 0 + 1 + 2 + 3 ....... + (n-1) 
// (n-1)*(n-1+1)/2 => (n)(n-1)/2 => (n*n - n)/2 => O(n*n) - complexity

// not a stable algorithm.
// performs well on small list/arrays.

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}