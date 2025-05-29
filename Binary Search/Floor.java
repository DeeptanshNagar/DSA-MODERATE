public class Floor {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    // return the index of greatest number <= target.
    static int floor(int[] arr, int target) {

        if (target < arr[0]) {
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

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
        return end; // element not found.
    }
}
