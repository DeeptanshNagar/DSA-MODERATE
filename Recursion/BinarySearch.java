public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,17,54,97,99};
        int target = 54;
        int result = binarySearch(arr, target, 0, arr.length-1);
        System.out.println(result);
    }
    
    static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end) {
            return -1;
        }

        int mid = start + (end-start) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        if(arr[mid] < target) {
            return binarySearch(arr, target, mid+1, end);
        }
        return binarySearch(arr, target, start, mid-1);
    }
}