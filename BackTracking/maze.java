public class maze {
    public static void main(String[] args) {
        System.out.println(maze(3,3));
    }
    static int maze(int row, int col) {
        if(row == 1 || col == 1) {
            return 1;
        }
        int left = maze(row, col - 1);
        int right = maze(row-1, col);

        return left + right;

    }
// maze(3,3)
// ├── maze(3,2)
// │   ├── maze(3,1) → 1
// │   └── maze(2,2)
// │       ├── maze(2,1) → 1
// │       └── maze(1,2) → 1
// │       → returns 2
// │   → returns 3
// └── maze(2,3)
//     ├── maze(2,2) → 2 (from earlier)
//     └── maze(1,3) → 1
//     → returns 3

// Final answer: 3 + 3 = 6

}
