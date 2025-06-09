
import java.util.Arrays;

public class leet_283_optimal {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveszero(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveszero(int[] arr) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for (int i = j+1; i < arr.length; i++) {
            if(arr[i] != 0) {
                swap(arr, j, i);
                j++;
            }
        }
    }
    public static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
