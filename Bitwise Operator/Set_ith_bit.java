public class Set_ith_bit {
    public static void main(String[] args) {
        int n = 86;  // binary: 1010110
        int i = 3; // agar 3rd bit 0 hai toh usko change karke 1 kardega or already 1 hai toh 1 hi rhene dega 

        int result = n | (1 << i);
        System.out.println("After setting bit " + i + ": " + result);
    }
}
