public class LL {
    private Node head;
    private Node tail;
    private int size;
    
    public LL() {
        this.size = 0;
    }
    
    private class Node {
        private int value;
        private Node next;
        
        public Node(int value) {
            this.value = value;
        }
        
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    
    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        
        if(tail == null) { 
            tail = head;
        }
        
        size += 1;
    }
    
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}