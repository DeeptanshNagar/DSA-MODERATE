public class Prblm283 {
    public static void main(String[] args) {
        
    }
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                swap(nums, j, i);
                i++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i]; 
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
