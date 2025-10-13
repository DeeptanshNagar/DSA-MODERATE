
import java.util.Arrays;

public class AllPathsOfMaze {
    public static void main(String[] args) {
        // Q1
        boolean[][] maze = {

            {true, true, true},
            {true, true, true},
            {true, true, true}
            // (0,0) (0,1) (0,2)
            // (1,0) (1,1) (1,2)
            // (2,0) (2,1) (2,2)


            
            //rat maze problem
            // {true, false, false, false},
            // {true, true, false, true},
            // {true, true, false, false},
            // {false, true, true, true}
        };
        // mazeStepsRiverBT("", maze, 0, 0);

        
        // Q2
        int[][] path = new int[maze.length][maze.length];
        mazeStepsRiverBTprint("", maze, 0, 0, path, 1);
    }
    static void mazeStepsRiverBT(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        // for finding rocks !
        if(!maze[row][col]) {
            return;
        }

        // i am considering this block in my path
        maze[row][col] = false;

        if(row < maze.length - 1) {
            mazeStepsRiverBT(p + "D", maze, row+1, col);
        }
        if(col < maze[0].length - 1) {
            mazeStepsRiverBT(p + "R", maze, row, col+1);
        }
        if(row > 0) {
            mazeStepsRiverBT(p + "U", maze, row - 1, col);
        }
        if(col > 0) {
            mazeStepsRiverBT(p + "L", maze, row, col - 1);
        }
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[row][col] = true;
    }

    static void mazeStepsRiverBTprint(String p, boolean[][] maze, int row, int col, int[][] path, int step) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        // for finding rocks !
        if(!maze[row][col]) {
            return;
        }

        // i am considering this block in my path
        maze[row][col] = false;
        path[row][col] = step;
        if(row < maze.length - 1) {
            mazeStepsRiverBTprint(p + "D", maze, row+1, col, path, step + 1);
        }
        if(col < maze[0].length - 1) {
            mazeStepsRiverBTprint(p + "R", maze, row, col+1, path, step + 1);
        }
        if(row > 0) {
            mazeStepsRiverBTprint(p + "U", maze, row - 1, col, path, step + 1);
        }
        if(col > 0) {
            mazeStepsRiverBTprint(p + "L", maze, row, col - 1, path, step + 1);
        }
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[row][col] = true;
        path[row][col] = 0;
    }
}

