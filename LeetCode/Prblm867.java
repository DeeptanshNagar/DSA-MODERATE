import java.util.Arrays;

public class Prblm867 {
    public static void main(String[] args) {
        int[][] matrix= {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] result = transpose(matrix);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int[][] transposed = new int[colLen][rowLen];

        for (int row = 0; row < rowLen; row++) {
            for (int col = 0; col < colLen; col++) {
                transposed[col][row] = matrix[row][col];
            }
        }
        return transposed;
    }
}