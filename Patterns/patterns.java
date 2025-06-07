

public class patterns {
    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(4);
        // pattern3();
        pattern4(5);
    }
    // static void pattern1(int n) {
    //     for (int rows = 1; rows <= n; rows++) {
    //         for (int cols = 1; cols <= n; cols++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern2(int n) {
    //     for (int rows = 1; rows <= n; rows++) {
    //         for (int cols = 1; cols <= rows; cols++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern3(int n) {
    //     for (int rows = 1; rows <= n; rows++) {
    //         for (int cols = 1; cols <= n+1-rows; cols++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    static void pattern4(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
