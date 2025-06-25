public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 9, 8, 5};
        // System.out.println(linearSearch(arr, 5, 0)); // search from starting
        System.out.println(linearSearch(arr, 5, 0));
    }

    // tells whether target is present in array or not.
    static boolean linearSearch(int[] arr, int target, int index) {
        if(index == arr.length) {
            return false;
        } else {
            return arr[index] == target || linearSearch(arr, target, index+1);
        }
    }

    // if 
}
