public class leet_2169 {
    public static void main(String[] args) {
        System.out.println(countOperations(2,3));
    }

    public static int countOperations(int nums1, int nums2) {
        return helper(nums1, nums2, 0);
    }

    public static int helper(int nums1, int nums2, int count) {
        if(nums1 == 0 || nums2 == 0) {
            return count;
        }

        if(nums1 > nums2) {
            return helper(nums1-nums2, nums2, count+1);
        }
        return helper(nums1, nums2-nums1, count+1);
    }
}
