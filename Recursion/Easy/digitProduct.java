package Easy;
public class digitProduct {
    public static void main(String[] args) {
        int ans = digitProduct1(505);
        System.out.println(ans);
    }
    static int digitProduct1(int n) {
        if(n%10 == n) {
            return n;
        }

        return (n % 10) * digitProduct1(n / 10);
    }
}
