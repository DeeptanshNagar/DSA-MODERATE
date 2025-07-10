import java.util.*;


public class Phonepad {
    public static void main(String[] args) {
        // pad("", "12");
        
        List<String> ans = padList("", "12");
        System.out.println(ans);
    }
    // static void pad(String p, String up) {
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     int digit = up.charAt(0) - '0';
    //     for (int i = (digit-1)*3; i < digit*3; i++) {
    //         char ch = (char) ('a' + i);
    //         pad(p + ch, up.substring(1));

    //     }
    // }

    static List<String> padList(String p, String up) {
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // 49 - 48 = 1
        // str.charAt(0) → '1' (character)
        // '1' has ASCII value 49
        // '0' has ASCII value 48
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padList(p + ch, up.substring(1)));

        }
        return list;
    }
}
