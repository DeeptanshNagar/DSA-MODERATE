import java.io.*;
import java.util.*;

public class sumgame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temp;
            }

            long[] prefix = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                prefix[i] = prefix[i - 1] + arr[i - 1];
            }

            long totalSum = prefix[n];
            long best = Long.MIN_VALUE;

            for (int i = 0; i <= k; i++) {
                int geta = Math.min(i + x, n);
                long sumAliceRemoved = prefix[i];
                long sumBobFlips = prefix[geta] - prefix[i];
                long current = totalSum - 2 * sumBobFlips;
                best = Math.max(best, current);
            }

            out.println(best);
        }
        out.flush();
    }
}