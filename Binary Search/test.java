public class test {
    public static void main(String[] args) {
        int[] nums = {2,4,5,8,8,8,8,11,13,19};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if(ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean firstOccurrence) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (firstOccurrence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}