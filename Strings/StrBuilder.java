// can't name {public class Stringbuilder} as it is already a name of class

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);     // mutable
        }
        System.out.println(builder);
        System.out.println(builder.toString());

        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}
