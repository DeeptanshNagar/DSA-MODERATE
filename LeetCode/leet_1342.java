public class leet_1342{
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper(int n, int count) {
        if(n == 0) {
            return count;
        }

        if(n % 2 == 0) {
            return helper(n / 2, count+1);
        }
        return helper(n - 1, count + 1);
    }
}