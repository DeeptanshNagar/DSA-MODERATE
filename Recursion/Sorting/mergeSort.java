import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr); // changing the original array
        int[] ans = mergeSort(arr);  // creating a new ans array and storing the answer. Hence, its not changing the original array.
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
