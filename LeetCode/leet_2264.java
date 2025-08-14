public class leet_2264 {
    public static void main(String[] args) {
        String str = "6777133339";
        String res = largest3digit(str);
        System.out.println(res);
    }
    
    static String largest3digit(String str) {
        String ans = "";
        for (int i = 0; i < str.length() - 3; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);
            char c3 = str.charAt(i + 2);

            if(c1 == c2 && c2 == c3) {
                String candidate = "" + c1 + c2 + c3;
                if(ans.equals("") || candidate.compareTo(ans) > 0) {
                    ans = candidate;
                }
            }
        }
        return ans;
    }
}