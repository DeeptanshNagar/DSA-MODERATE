// https://leetcode.com/problems/missing-number
// Amazon Question - Missing Number. Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

public class MissingNo {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // Case 1 - Search for first missing number.
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index; // ans
            }
        }
        // Case 2 - when the missing number is the last element.
        return arr.length; // otherwise ans
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
