/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */

 class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeakIndexInMountainArray(mountainArr);

        // Try to find the target in the increasing part
        int targetIndex = binarySearch(mountainArr, target, 0, peak, true);
        if (targetIndex != -1) {
            return targetIndex;
        }

        // Try to find the target in the decreasing part
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    private int findPeakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                // You are in the decreasing part of the array
                // This may be the answer, but look at the left
                end = mid;
            } else {
                // You are in the increasing part of the array
                start = mid + 1; // Because we know that mid+1 element > mid element
            }
        }

        // In the end, start == end, pointing to the peak of the mountain
        return start; // or return end as both are equal
    }

    private int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal == target) {
                return mid;
            }

            if (isAsc) {
                if (target < midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Element not found
    }
}
