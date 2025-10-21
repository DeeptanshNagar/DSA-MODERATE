import java.util.*;
// As we know :-
// Stack - A data structure that works on the LIFO (Last-In-First-Out) principle

// Queue - A data structure that works on the FIFO (First-In-First-Out) principle
// Elements are added at the end and removed from the front

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addFirst(3); // push
        stack.addFirst(2); // push
        stack.addFirst(69); // push
        stack.removeFirst(); // pop
        // Here, Linked List is acting as a Stack.

        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(1); // Enqueue
        queue.addLast(2); // Enqueue
        queue.addLast(3); // Enqueue
        System.out.println(queue);
        Integer i = queue.removeFirst();
        System.out.println(queue); // Dequeue
        System.out.println(queue.peek()); //getfirst() // front most element in the queue.
        // Here, Linked List is acting as a Queue.

        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(1); // Enqueue
        queue2.add(2); // Enqueue
        queue2.add(3); // Enqueue
        System.out.println(queue2);
        Integer i = queue2.remove();
        System.out.println(queue2); // Dequeue
        System.out.println(queue2.peek()); // front most element in the queue.
    }

}