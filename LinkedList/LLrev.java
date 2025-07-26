public class LLrev {
    private Node head;
    private Node tail;
    private int size;

    public LLrev() {
        this.size = 0;
    }

    class Node {
        private int value;
        private Node next;

        private Node(int value){
            this.value = value;
        }
        private Node(int value, Node next){
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

        size++;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }

        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void insertAtIndex(int val, int index) {
        if(index == 0) {
            insertFirst(val);
        }
        if(index == size - 1) {
            insertLast(val);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(val, temp.next);
        temp.next = newNode;

        size++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LLrev list = new LLrev();
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(12);
        list.insertFirst(16);
        list.insertFirst(20);
        list.insertLast(24);
        list.print();
    }
}