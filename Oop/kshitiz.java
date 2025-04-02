public class kshitiz {
    public static void main(String[] args) {
        int p = 1;
        int q = 1;

        for (int i = 1; i <= n; i = i * 2) { // Loop 1
            p++;
        }

        for (int j = 1; j <= p; j = j * 2) { // Loop 2
            q++;
        }
    }
}


// Time Complexity:
// First Loop (over i):

// i starts at 1 and doubles (i = i * 2) each iteration until i > n.

// The loop runs approximately log₂(n) times.

// Second Loop (over j):

// The loop runs until j > p, doubling j each time.

// Since p is incremented log₂(n) times, we can approximate p ≈ log₂(n).

// The second loop runs log₂(p) ≈ log₂(log₂(n)) times.

// Overall Complexity:
// First loop: O(log n)

// Second loop: O(log log n)

// Thus, the total time complexity of the program is O(log n + log log n) ≈ O(log n).