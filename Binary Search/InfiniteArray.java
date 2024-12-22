// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target) {
        // first find the range
        // start with a box of size 2
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while(target > arr[end]) {
            int newStart = end + 1; // this will be the new start
            // double the box value
            // end = previous end index + sizeofbox * 2
            end = end + (end - start + 1) * 2;
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
