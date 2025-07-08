import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
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
    }
}
// tc = o(n*2^n)
// sc = o(n*2^n)