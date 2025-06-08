import java.util.Arrays;

public class Prblm189 {
    // Case 1 :- k = 1
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5,6,7};
    //     rotatearr(arr);
    //     System.out.println(Arrays.toString(arr));
    // }
    // static void rotatearr(int[] arr) {
    //     int temp = arr[arr.length - 1];
    //     for (int i = arr.length - 1; i > 0; i--) {
    //         arr[i] = arr[i - 1];
    //     }
    //     arr[0] = temp;
    // }

    // Case 2 :- k = 3
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        rotatearr(arr, k, n);
        System.out.println(Arrays.toString(arr));
    }
    
    static void rotatearr(int[] arr, int k, int n) {
    if (n == 0)
      return;

    k = k % n;

    if (k > n) // this line is redundant but still added for better understanding.
      return;

    int[] temp = new int[k];
    for (int i = n - k; i < n; i++) {
      temp[i - n + k] = arr[i];
    }
    for (int i = n - k - 1; i >= 0; i--) {
      arr[i + k] = arr[i];
    }
    for (int i = 0; i < k; i++) {
        arr[i] = temp[i];
    }
  }
}
