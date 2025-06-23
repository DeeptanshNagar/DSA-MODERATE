public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(2442));
    }

    static boolean palindrome(int n) {
        return n == reverse(n);
    }

    public static int reverse(int n) {
        // sometimes you might need some additional variables in the arguement 
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    public static int helper(int n, int digits) {
        if(n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digits-1) + helper(n/10, digits - 1)); // 2 * 1000 + helper(143, 3)
    }
}
