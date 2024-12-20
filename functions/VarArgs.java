import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(2, 3, 4, 5, 56, 87, 23, 45, 65);
        // fun(); // empty array.

        // multiple(2, 3, "Kunal", "Rahul", "Diptansh");
        demo(2, 3, 4);
        demo("kunal", "diptansh", "rohan cariappa");
        // demo(); // this error is know as ambiguity.

    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }



    static void multiple(int a, int b, String ...v) {

    }


    static void fun(int ...v) {        // internally it is array of integers.
        System.out.println(Arrays.toString(v));
    }
}
