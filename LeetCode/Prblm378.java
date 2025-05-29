// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/

public class Prblm378 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(kthSmallest(arr, 8)); // Output: 8
    }

    // Brute force approach.
    /*
    static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] oneDimensional = new int[n * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                oneDimensional[index++] = matrix[i][j];
            }
        }
        Arrays.sort(oneDimensional);
        return oneDimensional[k - 1];
    }
    */

    // Optimized approach using binary search.
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int min = matrix[0][0];
        int max = matrix[n-1][n-1];

        while (min != max) {
            int mid = min + (max - min) / 2;
            int count = countLessOrEqual(matrix, mid);
            if (count < k) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }

    public static int countLessOrEqual(int[][] matrix, int mid) {
        int count = 0;
        int column = matrix.length - 1;
        int row = 0;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] <= mid) {
                count += column + 1;
                row++;
            } else {
                column--;
            }
        }
        return count;
    }
}
