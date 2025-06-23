public class Factorial {
    public static void main(String[] args) {
        int ans = Factorial(10);
        System.out.println(ans);
    }
    static int Factorial(int n) {
        if(n <= 1) return 1;
        return n * Factorial(n-1);
    }
}
