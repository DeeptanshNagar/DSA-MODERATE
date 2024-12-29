// https://leetcode.com/problems/maximum-population-year/

public class Prblm1854 {
    public static void main(String[] args) {
        int[][] logs = {
                {1993, 1999},
                {2000, 2010}
        };
        System.out.println(maximumPopulation(logs)); // Output: 1993
    }

    static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];

        for (int log[] : logs) {
            int by = log[0];
            int dy = log[1];
            arr[by-1950]++;
            arr[dy-1950]--;
        }

        int max = arr[0];
        int maxYear = 1950;
        for (int i = 1; i<101; i++) {
            arr[i] += arr[i-1];
            if (arr[i] > max) {
                max = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}