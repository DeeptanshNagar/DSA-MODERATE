public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 9, 9, 8, 5};
        // System.out.println(linearSearch(arr, 5, 0)); // search from starting
        System.out.println(linearSearch(arr, 9, arr.length-1)); // return the index of closest 9 from last
    }

    // tells whether target is present in array or not.
    /* 
    static boolean linearSearch(int[] arr, int target, int index) {
        if(index == arr.length) {
            return false;
        } else {
            return arr[index] == target || linearSearch(arr, target, index+1);
        }
    }
    */

    // if you want to start searching from the last
    static int linearSearch(int[] arr, int target, int index) {
        if(index == -1) {
            return -1;
        }
        if(arr[index] == target) {
            return index;
        } else {
            return linearSearch(arr, target, index - 1);
        }
        
    }
}
