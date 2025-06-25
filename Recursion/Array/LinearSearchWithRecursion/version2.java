public class version2 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,9,12};
        System.out.println(findIndex(arr, 9, 0));
    }
    // returns index of the target
    static int findIndex(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index+1);
    } 
}
