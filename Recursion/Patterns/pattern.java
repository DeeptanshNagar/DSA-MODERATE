public class pattern {
    public static void main(String[] args) {
        pattern3(5);
    }
    static void pattern3(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n+1-rows; cols++) { // 5
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
