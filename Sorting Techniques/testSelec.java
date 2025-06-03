
import java.util.Arrays;


public class testSelec {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, last, maxIndex);
        }
    }
    static void swap(int[] arr , int last , int maxIndex) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
    
    static int getMaxIndex(int[] arr, int start, int last)
    {
        int maxIndex = start;
        for (int i = start; i <= last; i++) {
            if(arr[maxIndex]<arr[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
