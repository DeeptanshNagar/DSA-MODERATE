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

    public int deleteFirst() {
        if(tail == null) {
            System.out.println("List is empty already! Please insert first.");
            return -1; 
        }
        int val = head.value;
        head = head.next;
        size--;

        return val;
    }

    public int deleteLast() {
        if(size == 0) {
            System.out.println("List is Empty");
            return -1;
        }

        if(size == 1) {
            return deleteFirst();
        }

        
        Node secondLast = head;
        while(secondLast.next != tail) {
            secondLast = secondLast.next;
        }
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    public int deleteAtIndex(int index) {
        if(index == 0) {
            return deleteFirst();
        }

        if(index == size - 1) {
            return deleteLast();
        }

    
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        
        return val;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        Node temp = head;
        System.out.print("HEAD -> ");
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


        list.insertAtIndex(45, 4);
        list.print();

        list.deleteAtIndex(4);
        list.print();

        System.out.println(list.getSize());
    }
}