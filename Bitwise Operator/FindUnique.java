public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,3,4,5,2,5,2,6};
        System.out.println(findUni(arr));
    }
    static int findUni(int[] arr){
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        return xor;
    }
}
