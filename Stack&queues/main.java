import java.util.*;
public class main {
    public static void main(String[] args) {
        // Stack - 

        // Stack<Integer> stack = new Stack<>();
        // stack.push(78);
        // stack.push(34);
        // stack.push(45);
        // stack.push(19);
        // stack.push(5);
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop()); // error - hey you are removing from empty stack, is not cool.

        // Queue -
        
        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(3);
        // queue.add(6);
        // queue.add(9);
        // queue.add(12);
        // queue.add(13);
        // System.out.println(queue.peek()); // just prints head element but does'nt removes it.
        // System.out.println(queue.remove()); // removes 3
        // System.out.println(queue.remove()); // removes 6


        // Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.add(32);
        deque.add(43);
        deque.add(23);
        deque.add(99);
        deque.addFirst(3);
        System.out.println(deque.remove());
        System.out.println(deque.remove());
        // etc etc
    }
}