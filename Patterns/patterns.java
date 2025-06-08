

public class patterns {
    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(4);
        // pattern3();
        // pattern4(5);
        // pattern5(5);
        pattern28(5);
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

    // static void pattern4(int n) {
    //     for (int rows = 1; rows <= n; rows++) {
    //         for (int cols = 1; cols <= rows; cols++) {
    //             System.out.print(cols + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern5(int n) {
    //     for (int row = 1; row < 2*n; row++) {
    //         int totalColsInRow = row > n? 2*n-row:row; // n - (row-n)
    //         for (int col = 1; col <= totalColsInRow; col++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    static void pattern28(int n) {
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row>n? 2*n-row: row;
            int totalNumberOfSpaces = n-totalColsInRow;
            for (int s = 0; s < totalNumberOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
