import java.util.*;

public class m2 {
    public static void main(String[] args) {
        // Create a Queue of Integers using LinkedList implementation
        Queue<Integer> list = new LinkedList<>();

        list.add(5);
        
        System.out.println(list.size());

        // Removes and returns the head of the queue
        // Throws NoSuchElementException if the queue is empty
        // System.out.println(list.remove());

        // Removes and returns the head of the queue
        // Returns null instead of throwing an exception if the queue is empty
        // System.out.println(list.poll());
    }
}
