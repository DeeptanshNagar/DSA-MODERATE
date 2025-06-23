package Easy;
public class concept {
    public static void main(String[] args) {
        func(5);
    }
    static void func(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        // func(n--);            // stack overFlow error because it will pass 5 to the parameter first and then decrease its value whenever the function is getting to over.

        func(--n);               // subtract first then pass the value of n to the parameter
    }
}
