public class Set_ith_bit {
    public static void main(String[] args) {
        int n = 86;  // binary: 1010110
        int i = 3;

        int result = n | (1 << i);
        System.out.println("After setting bit " + i + ": " + result);
    }
}
