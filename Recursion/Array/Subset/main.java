import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class main {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        // List<List<Integer>> ans = subset(arr);
        List<List<Integer>> ans = subsetDuplicates(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        // outer = { [ ] }
        for(int num : arr) { // 2
            int n = outer.size(); // n = 2 {[],[1]}
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                // outer[0] = []
                // make a copy -> []

                internal.add(num); // add 1 -> [1] (lets suppose copy me 1 add kia)
                outer.add(internal);
            }
            // outer = {[], [1], [2], [1,2]} // after iteration
        }
        return outer;
        // tc = o(n*2^n)
        // sc = o(n*2^n)
    }

    static List<List<Integer>> subsetDuplicates(int[] arr) {
        Arrays.sort(arr); // [1,2,2]
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < arr.length; i++) { 
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            for (int j = start; j <= end; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
                // i = 0 : 1st iteration = [[], [1]]
                // i = 1 : 2nd iteration = [[], [1], [2], [1,2]]
                // i = 2 : 3rd iteration = [[], [1], [2], [1,2]]

            }
        }
        return outer;
    }
}