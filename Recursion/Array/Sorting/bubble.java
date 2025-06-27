import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2};
        int[] ans = bubbleSort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(ans));
    }
    static int[] bubbleSort(int[] arr, int row, int col) {
        if(row == 0) {
            return arr;
        }
        if(col < row) {
            if(arr[col] > arr[col+1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col+1] = temp;
            }
            bubbleSort(arr, row, col + 1);
        } else {
            bubbleSort(arr, row - 1, 0);
        }
        return arr;
    }
}
