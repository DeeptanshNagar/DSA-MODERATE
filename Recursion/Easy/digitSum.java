package Easy;
public class digitSum {
    public static void main(String[] args) {
        int ans = digitSum1(1342);
        System.out.println(ans);
    }
    static int digitSum1(int n) {
        if(n == 0) {
            return 0;
        }

        return (n % 10) + digitSum1(n / 10);
    }
}
