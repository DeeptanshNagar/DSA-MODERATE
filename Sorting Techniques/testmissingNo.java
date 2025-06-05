public class testmissingNo {
    public static void main(String[] args) {
        int[] nums = {4,0,2,1};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i , correctIndex);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index; // ans
            }
        }
        return nums.length;
    }

    
    static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}