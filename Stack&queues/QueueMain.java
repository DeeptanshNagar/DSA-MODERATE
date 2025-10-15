public class QueueMain {
    public static void main(String[] args) throws Exception {
        customQueue queue = new customQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
        queue.display();

        // for adding an item time complexity will be -> O(1)
        // for removing an item time complexity will be -> O(n) ~[performing left shift with each element]

        
    }
}
