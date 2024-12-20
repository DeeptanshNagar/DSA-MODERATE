package functions;

// shadowing in java is basically a practice of using two variables with the same name within the scope that overlaps.
public class shadowing {
    static int x = 90;                    // this will be shadowed at line 9.     // x is available to everything which is present in the block - public class shadowing.
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x;                 // Declared but not initialized.
        // System.out.println(x);     // error (scope will begin when value is initialized.)
        x = 40;                // the class variable at line 5 is shadowed after the intialization of x.
        System.out.println(x); // 40 // lower level is overriding the upper level.
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
