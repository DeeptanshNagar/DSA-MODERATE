public class main {
    public static void main(String[] args) {
        skip("" , "bacccadah");

    }
    static void skip(String ans, String s) {
        if(s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        if (ch == 'a') {
            skip(ans, s.substring(1));
        } else {
            skip(ans + ch, s.substring(1));
        }
    }
}
