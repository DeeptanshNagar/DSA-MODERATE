
import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 3, 4, 5, 6};
        int target = 3;

        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // check for first occurrence of target first
        // int start = search(nums, target, true);
        // int end = search(nums, target, false);

        // ans[0] = start;
        // ans[1] = end;

        // More optimized way to do
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    // this function just returns the index value of the target element
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}