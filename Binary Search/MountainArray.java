// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/

public class MountainArray {
    public static void main(String[] args) {
        
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

    // can ignore this : just for the sake of compilation error in the main method in the class Solution in Leetcode1095.java and SearchInMountain.java .
    public int get(int mid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    public int length() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'length'");
    }
}