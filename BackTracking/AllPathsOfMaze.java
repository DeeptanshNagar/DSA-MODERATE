public class AllPathsOfMaze {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
            // (0,0) (0,1) (0,2)
            // (1,0) (1,1) (1,2)
            // (2,0) (2,1) (2,2)
        };
        mazeStepsRiverBT("", maze, 0, 0);
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
}
