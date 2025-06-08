import java.util.ArrayList;
import java.util.Arrays;

public class leet_283bruteforce {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int n = arr.length;
        movezeros(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] movezeros(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        int sz = temp.size();

        for (int i = 0; i < sz; i++) {
            arr[i] = temp.get(i);
        }
        for (int i = sz; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }
}
