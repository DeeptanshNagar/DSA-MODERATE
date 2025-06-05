// https://leetcode.com/problems/set-mismatch

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }

    public static int[] findErrorNums(int[] arr) {
        int i = 0;

        // Step 1: Cyclic sort to place elements at their correct positions
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Step 2: Identify the duplicate and missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                // Returning the duplicate element and the missing number
                return new int[] {arr[index], index + 1};
            }
        }
        
        // Default return if no error is found (shouldn't occur in valid inputs)
        return new int[] {-1, -1};
    }

    // Helper method to swap two elements in the array
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}