public class IsSortedd {
    public static void main(String[] args) {
        int[] arr = {2,2,4,7,9,12,15};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index) {
        if(index == arr.length-1) {
            return true;
        }
        return arr[index] <= arr[index+1] && isSorted(arr, index+1);
    }
}
