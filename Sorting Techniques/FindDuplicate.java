// https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};  // Example array with a duplicate
        FindDuplicate finder = new FindDuplicate();
        int result = finder.findDuplicate(nums);
        System.out.println("Duplicate number is: " + result);
    }

    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if(arr[i] != i + 1) {    
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
    
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
