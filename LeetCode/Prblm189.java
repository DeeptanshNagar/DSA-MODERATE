import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/description/

public class Prblm189 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotatearr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rotatearr(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}
