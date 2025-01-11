public class StringPerformance {
    public static void main(String[] args) {
        // String series = ""; // series is intended to store a sequence of characters, although in this specific program, it is not actually used further to concatenate or store any values. Instead, the program prints characters directly using System.out.print(ch);
        // for (int i = 0; i < 26; i++) {
        //     char ch = (char)('a' + i);
        //     System.out.print(ch);
        // }

        // If the purpose was to build a string by concatenating characters, series could be used like this inside the loop:
        String series = "";   
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series += ch; // This adds each character to the series string.
        }
        System.out.print(series);
    }
}
