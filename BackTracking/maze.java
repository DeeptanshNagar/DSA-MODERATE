
import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
        // Counting no. of possible ways :-
        // System.out.println(maze(3,3));

        // Printing all possible ways :-
        // mazeSteps("", 3, 3);

        // same but with help of ArrayList :-
        ArrayList<String> answer = mazeSteps("", 3, 3);
        System.out.println(answer);

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
}
