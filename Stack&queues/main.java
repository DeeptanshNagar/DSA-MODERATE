import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(78);
        stk.push(34);
        stk.push(45);
        stk.push(19);
        stk.push(5);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }
}