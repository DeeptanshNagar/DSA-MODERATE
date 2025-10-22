import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockQueue {
    public static void main(String[] args) {
        // Create a Queue of Integers using LinkedList implementation
        // Queue<Integer> queue1 = new LinkedList<>();

        // queue1.add(5);
        // queue1.add(10);
        // queue1.add(15);
        // queue1.add(20);
        // System.out.println(queue1.size());

        // Removes and returns the head of the queue
        // Throws NoSuchElementException if the queue is empty
        // System.out.println(queue1.remove());

        // Removes and returns the head of the queue
        // Returns null instead of throwing an exception if the queue is empty
        // System.out.println(queue1.poll());

        // Retrieves, but does not remove, the head of the queue
        // Throws NoSuchElementException if the queue is empty
        // System.out.println(queue1.element());

        // Retrieves, but does not remove, the head of the queue
        // Returns null if the queue is empty
        // System.out.println(queue1.peek());

        // -----------------------------------------------------------------

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1));
        System.out.println(queue2.offer(2));
        System.out.println(queue2.offer(3)); // returns false instead of illegalStateException
        // System.out.println(queue2.add(4)); // throws illegalStateException
        System.out.println(queue2);
    }
}
