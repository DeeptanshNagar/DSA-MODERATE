
import java.util.Arrays;

public class testcycle {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr , int i , int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
