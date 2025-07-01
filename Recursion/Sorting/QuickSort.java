public class QuickSort {
    public static void main(String[] args) {
        
    }
    static void quickSort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        
    }
}
