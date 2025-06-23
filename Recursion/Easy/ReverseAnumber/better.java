public class better {
    public static void main(String[] args) {
        reverse(120);
        System.out.println(sum);
    }
    // Uses a global (static) variable sum.
    static int sum = 0; // sum is updated recursively and printed after all calls finish.
    static void reverse(int n) {
        if(n == 0) {
            return;
        }

        int remainder = n % 10;
        sum = sum * 10 + remainder;
        reverse(n / 10);
    }
}
