import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // this is same as after a few steps : "a" + "1" gives output - a1
        // When an integer is concatenated means added with a string, it is converted to its wrapper class integer that will call toString()

        // ADDITIONAL important EXAMPLES -
        System.out.println("Hello" + 5);    // Hello5
        System.out.println(10 + 5 + "abc"); // 15abc
        System.out.println("abc" + 10 + 5); // abc105


        //  ********************************************************

        System.out.println("Kunal" + new ArrayList<>()); // object
        System.out.println("Kunal" + new Integer(56)); // Objects calls toString() method and gets converted to String

        // System.out.println(new Integer(56) + new ArrayList<>()); // will throw an error || operator '+' in java is only defined for primitives and when any one of these values is a String.
        // (new Integer(56) + new ArrayList<>()) is an expression, which can be used only with primitives and the other complex objects as well but only condition is atleast one of these objects should be of type String

        // Now the correct working expression will be as follows;
        String ans = new Integer(56) + "" + new ArrayList<>(); // here among 3 one is string type which is empty no problem
        System.out.println(ans); // Output - 56[]





        System.out.println("a" + 'b');
    }
}
