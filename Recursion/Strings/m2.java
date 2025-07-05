public class m2{
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bacappccadah"));
        System.out.println(skipAppNotApple("bacappleccadah"));
    }
    
    static void skip(String ans, String s) {
        if(s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0); //b
        if(ch == 'a') {
            skip(ans, s.substring(1));
            // b, cccadah
            // bccc, dah
            // bcccd, h
        } else {
            skip(ans + ch, s.substring(1));
            // "" + b = b , acccadah
            // b + c = bc , ccadah
            // bc + c = bcc , cadah
            // bcc + c = bccc , adah
            // bccc + d = bcccd , ah
            // bcccd + h = bcccdh, ""
            // now string is empty so it will simply print(sout) ans.
            // output --> bcccdh
        }
    }
    

    
    static String skip(String str) {
        if(str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a') {
            return skip(str.substring(1));
        } else {
            return ch + skip(str.substring(1));
        }
    }
    

    static String skipApple(String str) {
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    static String skipAppNotApple(String str) {
        if(str.isEmpty()) {
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        } else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
}