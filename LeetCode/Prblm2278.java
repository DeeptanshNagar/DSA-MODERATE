public class Prblm2278 {
    public static void main(String[] args) {
        
    }
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (letter == s.charAt(i)) {
                count++;
            }
        }
        return (count * 100) / s.length();
    }
}
