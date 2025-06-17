public class Reset_ith_Bit {
    public static void main(String[] args) {
        int n = 86; // binary: 1010110
        int i = 5;

        int result = n & ~(1 << i);
        System.out.println("After resetting bit " + i + ": " + result);
    }
}
