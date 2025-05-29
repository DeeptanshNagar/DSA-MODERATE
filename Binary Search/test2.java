public class test2 {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 14;
        int ans = ans(arr, target);
        System.out.println(ans);
    }
    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element 
            // int mid = (start + end) / 2;  // might be possible that start + end exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // element found at mid index 
            }
        }
        return -1; // element not found.
    }
}