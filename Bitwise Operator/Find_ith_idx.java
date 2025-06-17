public class Find_ith_idx {
    public static void main(String[] args) {
        int n = 182; // binary: 10110110
        int i = 5;   // 0-based index

        int mask = 1 << i;
        int result = (n & mask) >> i;         // 100000 >> 5 means it will eat 5 zeros from right to left.

        System.out.println("Bit at index " + i + " is: " + result);
    }
}