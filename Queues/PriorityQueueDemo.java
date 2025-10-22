import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of the Queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customized ordering 
        // sirf head se matlab hai isko
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        // {5 10 15 30}
        // System.out.println(pq.remove()); // 5
        // System.out.println(pq.peek()); // 10
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}