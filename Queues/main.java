import java.util.LinkedList;
// As we know :-
// Stack - A data structure that works on the LIFO (Last-In-First-Out) principle

// Queue - A data structure that works on the FIFO (First-In-First-Out) principle
// Elements are added at the end and removed from the front

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addFirst(3);
        stack.addFirst(2);
        stack.addFirst(69);
        stack.removeFirst();
        // Here, Linked List is acting as a Stack.

        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        System.out.println(queue);
    }

}