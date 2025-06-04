// Insertion Sort..
// Time complexity - Best Case -> O(n) ////// Worst Case -> O(n*n)
// Why it is used ? 
// Because - 1). Adaptive - steps get reduced if array is sorted. (No of swaps are reduced as compared to bubble sort)
// 2). stable sorting algorithm.
// 3). used for smaller values of N => works good when array is partially sorted.
// 4). That is why it takes part in hybrid sorting algorithms.

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertion(arr); 
        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1); // Call the swap method
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}