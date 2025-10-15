public class stackMain {
    public static void main(String[] args)throws stackException {
        DynamicStack stack = new DynamicStack(5);
        // customStack stack = new DynamicStack(5); // also works fine coz parents can take properties of child as well.
        stack.push(6);
        stack.push(12);
        stack.push(18);
        stack.push(24);
        stack.push(30);
        stack.push(36);
        System.out.println(stack.pop()); // 36 
        System.out.println(stack.pop()); // 30
        System.out.println(stack.pop()); // 24
        System.out.println(stack.pop()); // 18
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 6
        // System.out.println(stack.pop()); exception occured - cannot pop from a empty stack.
    }
}
