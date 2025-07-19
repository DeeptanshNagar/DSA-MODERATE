
import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        // Counting no. of possible ways :-
        // System.out.println(maze(3,3));

        // Printing all possible ways :-
        // mazeSteps("", 3, 3);

        // same but with help of ArrayList :-
        // ArrayList<String> answer = mazeSteps("", 3, 3);
        // System.out.println(answer);

        // Making it more interesting by moving diagonally :- 
        // ArrayList<String> answer = mazeStepsDiagonally("", 3, 3); 
        // System.out.println(answer);

        // Suppose a obstacle river is at index [2,2] and now we are starting from [0,0] index and we have to reach [3,3] index
        // boolean[][] maze = {
        //     {true, true, true},
        //     {true, false, true},
        //     {true, true, true}
        // };
        // mazeStepsRiver("", maze, 0, 0);

        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        mazeStepsRiverBT("", maze, 0, 0);
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



    // static void mazeSteps(String p, int row, int col) {
    //     if(row == 1 && col == 1) {
    //         System.out.println(p);
    //         return;
    //     }
    //     if(row > 1) {
    //         mazeSteps(p + "D", row-1, col);
    //     }
    //     if(col > 1) {
    //         mazeSteps(p + "R", row, col-1);
    //     }
    // }


    static ArrayList<String> mazeSteps(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if (row > 1) {
            ans.addAll(mazeSteps(p + "D", row - 1, col));
        }

        if (col > 1) {
            ans.addAll(mazeSteps(p + "R", row, col - 1));
        }
        return ans;
    }

    static ArrayList<String> mazeStepsDiagonally(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if (row > 1 && col > 1) {
            ans.addAll(mazeStepsDiagonally(p + "D", row - 1, col - 1));
        }

        if (row > 1) {
            ans.addAll(mazeStepsDiagonally(p + "V", row - 1, col));
        }
 
        if (col > 1) {
            ans.addAll(mazeStepsDiagonally(p + "H", row, col - 1));
        }
        return ans;
    }

    static void mazeStepsRiver(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(!maze[row][col]) {
            return;
        }
        if(row < maze.length - 1) {
            mazeStepsRiver(p + "D", maze, row+1, col);
        }
        if(col < maze[0].length - 1) {
            mazeStepsRiver(p + "R", maze, row, col+1);
        }
    }

    static void mazeStepsRiverBT(String p, boolean[][] maze, int row, int col) {
        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

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