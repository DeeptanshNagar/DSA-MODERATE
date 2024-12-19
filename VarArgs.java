package functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(2, 3, 4, 5, 56, 87, 23, 45, 65);
        // fun(); // empty array.

        multiple(2, 3, "Kunal", "Rahul", "Diptansh");
    }


    static void multiple(int a, int b, String ...v) {
        
    }


    static void fun(int ...v) {        // internally it is array of integers.
        System.out.println(Arrays.toString(v));
    }
}
