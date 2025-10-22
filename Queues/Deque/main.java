import java.util.*;

public class main {
    public static void main(String[] args) {
        // double-ended queue
        // allows insertion and removal of elements from both ends
        // versatile than regular queues and stacks because they support all the operations of both
        Deque<Integer> deque1 = new ArrayDeque<>(); // faster iteration due to contigous memory allocation, low memory, no null allowed // behaves like ArrayList
        // circular, head and tail
        // no need to shift elements, just shift head and tail
        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        System.out.println(deque1); // [5 10 20 25]
        System.out.println("first Element: " + deque1.getFirst()); // 5
        System.out.println("Last Element: " + deque1.getLast()); // 25
        // deque1.removeFirst(); // Removes: 5
        // deque1.pollLast(); // Removes: 25
        System.out.println("Removing First: " + deque1.removeFirst());
        System.out.println("Removing Last: " + deque1.pollLast());
        System.out.println(deque1);




        Deque<Integer> deque2 = new LinkedList<>(); // use this if you want to insert and delete at middle otherwise use ArrayDeque only because it's faster.
        // deque2.remove();
    }
}