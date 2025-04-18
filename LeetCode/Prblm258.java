

// https://leetcode.com/problems/add-digits/description/

public class Prblm258 {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num)); // Output: 2
    }

    public static int addDigits(int num)
    {
        if (num == 0) {
            return 0;
        }
        return (num % 9 == 0)?9:num % 9;
    } 
}

