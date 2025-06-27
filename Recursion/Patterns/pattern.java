public class pattern {
    public static void main(String[] args) {
        reverseTriangle(4, 0);
        Triangle(4, 0);
    }

    static void reverseTriangle(int row, int col) {
        if(row == 0) {
            return;
        }
        if(col < row) {
            System.out.print("* ");
            reverseTriangle(row, col + 1);
        } else {
            System.out.println();
            reverseTriangle(row - 1, 0);
        }
    }
    static void Triangle(int row, int col) {
        if(row == 0) {
            return;
        }
        if(col < row) {
            Triangle(row, col + 1);
            System.out.print("* ");
        } else {
            Triangle(row - 1, 0);
            System.out.println();
        }
    }
}
