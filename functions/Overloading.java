package functions;
public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Kunal Kushwaha");
        int ans = sum(3,4);
        int sol = sum(3,4,76);
        System.out.println(ans);
        System.out.println(sol);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("second one");
        System.out.println(name);
    }
}
