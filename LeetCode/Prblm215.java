public class Prblm215 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int result = findKthLargest(nums, k);
        System.out.println(result); // Print the sorted array
    }
    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1); // Call the swap method
                } else {
                    break;
                }
            }
        }
        return n-k;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
