
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha Hello world";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); // Creating a new object and making changes to it
        System.out.println(name); // Original one is still same

        System.out.println(name.indexOf('a'));
        System.out.println("     Kunal    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}