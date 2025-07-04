public class m2{
    public static void main(String[] args) {
        skip("", "bacccadah");
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
}