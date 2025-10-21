import java.util.*;

public class m2 {
    public static void main(String[] args) {
        // Create a Queue of Integers using Linkedqueue1 implementation
        Queue<Integer> queue1 = new Linkedqueue1<>();

        queue1.add(5);
        queue1.add(10);
        queue1.add(15);
        queue1.add(20);
        System.out.println(queue1.size());

        // Removes and returns the head of the queue
        // Throws NoSuchElementException if the queue is empty
        // System.out.println(queue1.remove());

        // Removes and returns the head of the queue
        // Returns null instead of throwing an exception if the queue is empty
        // System.out.println(queue1.poll());

        // Retrieves, but does not remove, the head of the queue
        // Throws NoSuchElementException if the queue is empty
        System.out.println(queue1.element());

        // Retrieves, but does not remove, the head of the queue
        // Returns null if the queue is empty
        System.out.println(queue1.peek());


        Queue<Integer>

    }
}
