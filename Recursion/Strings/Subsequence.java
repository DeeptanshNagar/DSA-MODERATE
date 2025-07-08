import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        // subsequence("", "abc");
        // System.out.println(subseq("", "abc"));
        // subseqAscii("", "ab");
        System.out.println((subseqAsciiRet("", "abc")));
    }

    static void subsequence(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsequence(p + ch, up.substring(1));
        subsequence(p, up.substring(1));
    }

    static ArrayList<String> subseq(String p, String up) {
        System.out.println("p: " + p + ", up: " + up);
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);   
            return list;
        }
        char ch = up.charAt(0); 
        ArrayList<String> left = subseq(p + ch, up.substring(1)); 
        ArrayList<String> right = subseq(p, up.substring(1)); 
        left.addAll(right);
        return left;
    }

    static void subseqAscii(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subseqAsciiRet(String p, String up) {
        System.out.println("p: " + p + ", up: " + up);
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);   
            return list;
        }
        char ch = up.charAt(0); 
        ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1)); 
        ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
        ArrayList<String> third = subseqAsciiRet(p + (ch+0), up.substring(1)); 
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
