import java.util.Arrays;

public class testSM645 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};                                   // output :- [2,3]
        int[] result = findErrorNums(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                return new int[] {arr[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }
    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
