public class testbubble {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4};
        bubble(arr);
        System.out.println(arr);
    }
    static int bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
        }
        if(!boolean) {
            
        }
    }
}
