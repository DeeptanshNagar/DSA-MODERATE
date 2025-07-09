import java.util.ArrayList;
import java.util.List;


public class permutations {
    public static void main(String[] args) {
        // permutation("", "abc");

        // List<String> ans = permutationsList("", "abc");
        // System.out.println(ans);

        System.out.println(permutationCounts("", "abc"));
    }
    static void permutation(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }

    static List<String> permutationsList(String p, String up) {
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int permutationCounts(String p, String up) {
        if(up.isEmpty()){
            // System.out.println(p);
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationCounts(f + ch + s, up.substring(1));
        }
        return count;
    }
}
