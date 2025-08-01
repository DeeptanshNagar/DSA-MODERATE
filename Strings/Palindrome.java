public class Palindrome {
    public static void main(String[] args) {
        String str = "null";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str) {
        if (str.length() == 0){
            return true;
        } else if(str == null) {
            return true;             // false.
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end) {
                return false;
            }
        }
        return true;
    }
}