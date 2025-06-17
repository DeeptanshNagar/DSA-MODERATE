public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 2, 2, 2, 4, 4, 4, 6};
        System.out.println("The number that appears once is: " + findUnique(arr));
    }

    public static int findUnique(int[] arr) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    sum++;
                }
            }
            if (sum % 3 != 0) {
                result |= (1 << i);
            }
        }
        return result;
    }
}
