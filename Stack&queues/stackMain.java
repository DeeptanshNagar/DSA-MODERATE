public class stackMain {
    public static void main(String[] args)throws stackException {
        customStack stack = new customStack(5);
        stack.push(6);
        stack.push(12);
        stack.push(18);
        stack.push(24);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop()); exception occured
    }
}
