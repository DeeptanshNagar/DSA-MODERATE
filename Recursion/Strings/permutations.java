import java.util.ArrayList;
import java.util.List;


public class permutations {
    public static void main(String[] args) {
        // combinations("", "abc");
        List<String> ans = combinationsList("", "abc");
        System.out.println(ans);
    }
    static void combinations(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            combinations(f + ch + s, up.substring(1));
        }
    }

    static List<String> combinationsList(String p, String up) {
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
            ans.addAll(combinationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}
