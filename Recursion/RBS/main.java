public class main {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 9, 1, 2, 3};
        int ans = rotatedBS(nums, 3, 0, nums.length - 1);
        System.out.println(ans);
    }

    static int rotatedBS(int[] nums, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(nums[mid] == target) {
            return mid;
        }
        if(nums[start] <= nums[mid]) {
            if (nums[start] <= target && target <= nums[mid]) {
                return rotatedBS(nums, target, start, mid - 1);
            } else {
                return rotatedBS(nums, target, mid + 1, end);
            }
        } else {
            if(target >= nums[mid] && target <= nums[end]) {
                return rotatedBS(nums, target, mid + 1, end);
            } else {
                return rotatedBS(nums, target, start, mid - 1);
            }
        }
    }
}
