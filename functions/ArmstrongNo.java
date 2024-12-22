import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        // System.out.println(isArmstrong(n));

        // printing all three digit armstrong numbers
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // print all the 3 digits armstrong numbers
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n>0) {
            int rem = n % 10;
            n = n/10;
            sum += rem*rem*rem;
        }

        if (sum == original) {
            return true;
        }
        return false;
    }
}
