import java.util.Arrays;

public class FirstAndLastPositionRecursion {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 3, 4, 5, 6};
        int target = 3;

        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = recursiveSearch(nums, target, 0, nums.length - 1, true);
        if (ans[0] != -1) {
            ans[1] = recursiveSearch(nums, target, 0, nums.length - 1, false);
        }
        return ans;
    }

    static int recursiveSearch(int[] nums, int target, int start, int end, boolean findStart) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (nums[mid] < target) {
            return recursiveSearch(nums, target, mid + 1, end, findStart);
        } else if (nums[mid] > target) {
            return recursiveSearch(nums, target, start, mid - 1, findStart);
        } else {
            // potential answer found
            if (findStart) {
                int leftAns = recursiveSearch(nums, target, start, mid - 1, true);
                return (leftAns != -1) ? leftAns : mid;
            } else {
                int rightAns = recursiveSearch(nums, target, mid + 1, end, false);
                return (rightAns != -1) ? rightAns : mid;
            }
        }
    }
}