import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},  //rstart
                {5, 6, 7 ,8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} // rEnd
        };
        System.out.println(Arrays.toString(search(arr, 4))); // Output: [0, 3]
        System.out.println(Arrays.toString(search(arr, 6))); // Output: [1, 1]
        System.out.println(Arrays.toString(search(arr, 5))); // Output: [1, 0]
        System.out.println(Arrays.toString(search(arr, 10))); // Output: [2, 1]
    }

    // Search in the row provided between the columns provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return new int[]{-1, -1}; // handle empty matrix
        }

        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        if (cols == 0) {
            return new int[]{-1, -1};
        }
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        } 

        int rStart = 0;
        int rEnd = rows - 1; // 3
        int cMid = (cols-1) / 2;   

        // Run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid + 1;
            } else {
                rEnd = mid;
            }
        }

        // Now we have two rows
        // Check whether the target is in the column of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // Search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // Search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
    
}



// public class SortedMatrix {
//     public static void main(String[] args) {
//         int[][] arr = {
//                 {1, 2, 3, 4},
//                 {5, 6, 7, 8},
//                 {9, 10, 11, 12},
//                 {13, 14, 15, 16}
//         };
//         System.out.println(searchMatrix(arr, 9));   // true
//         System.out.println(searchMatrix(arr, 5));   // true
//         System.out.println(searchMatrix(arr, 10));  // true
//         System.out.println(searchMatrix(arr, 20));  // false
//     }

    // boolean binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
    //     while (cStart <= cEnd) {
    //         int mid = cStart + (cEnd - cStart) / 2;
    //         if (matrix[row][mid] == target) {
    //             return true;
    //         }
    //         if (matrix[row][mid] < target) {
    //             cStart = mid + 1;
    //         } else {
    //             cEnd = mid - 1;
    //         }
    //     }
    //     return false;
    // }

    // boolean searchMatrix(int[][] matrix, int target) {
    //     if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    //         return false;
    //     }

    //     int rows = matrix.length;
    //     int cols = matrix[0].length;

    //     if (rows == 1) {
    //         return binarySearch(matrix, 0, 0, cols - 1, target);
    //     }

    //     int rStart = 0;
    //     int rEnd = rows - 1;
    //     int cMid = cols / 2;

    //     while (rStart < (rEnd - 1)) {
    //         int mid = rStart + (rEnd - rStart) / 2;
    //         if (matrix[mid][cMid] == target) {
    //             return true;
    //         }
    //         if (matrix[mid][cMid] < target) {
    //             rStart = mid;
    //         } else {
    //             rEnd = mid;
    //         }
    //     }

    //     if (matrix[rStart][cMid] == target || matrix[rStart + 1][cMid] == target) {
    //         return true;
    //     }

    //     if (target <= matrix[rStart][cMid - 1]) {
    //         return binarySearch(matrix, rStart, 0, cMid - 1, target);
    //     }
    //     if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
    //         return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
    //     }
    //     if (target <= matrix[rStart + 1][cMid - 1]) {
    //         return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
    //     }
    //     return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
    // }
// }
