// https://leetcode.com/problems/find-in-mountain-array/

public class SearchInMountain {
    public static void main(String[] args) {
        
    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]) {
                // you are in decreasing part of the array
                // this may be the ans, but look at the left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in the increasing part of the array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above.
        // start and end are always trying to find the maximum element in the above 2 checks.
        // hence, when they are pointing to just one element, that is the maximum one because that is what the checks say.
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time.
        return start; // or return end as both are equal.
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            // find the middle element 
            // int mid = (start + end) / 2;  // might be possible that start + end exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else if(target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else if(target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1; // element not found.
    }
}