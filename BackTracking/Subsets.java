import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        List<Integer> ans = new ArrayList<>();
        printSubsets(arr, ans, 0);
    }
    public static void printSubsets(List<Integer> arr, List<Integer> ans, int i) {
        if (i == arr.size()) {
            for (int val : ans) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        // Include current element
        ans.add(arr.get(i));
        printSubsets(arr, ans, i + 1);

        // Backtrack
        ans.remove(ans.size() - 1);

        // Exclude current element
        printSubsets(arr, ans, i + 1);
    }
}
// Time complexity - O(2^n * n)
