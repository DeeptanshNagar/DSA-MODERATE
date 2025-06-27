import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        recursiveSelection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void recursiveSelection(int[] arr, int row, int col, int maxIndex) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] > arr[maxIndex]) {
                recursiveSelection(arr, row, col + 1, col);
            } else {
                recursiveSelection(arr, row, col + 1, maxIndex);
            }
        } else {
            // Swap the max element to the end of the current unsorted part
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[row - 1];
            arr[row - 1] = temp;

            // Move to next recursive row (1 less element)
            recursiveSelection(arr, row - 1, 0, 0);
        }
    }
}
