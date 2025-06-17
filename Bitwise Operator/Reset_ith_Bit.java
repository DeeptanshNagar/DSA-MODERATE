public class Reset_ith_Bit {
    public static void main(String[] args) {
        int n = 86; // binary: 1010110
        int i = 5;                            // agar 5th bit 0 hai toh 0 hi rhene dega or agar 1 hai toh zero kardega means reset to zero.

        int result = n & ~(1 << i);
        System.out.println("After resetting bit " + i + ": " + result);
    }
}
