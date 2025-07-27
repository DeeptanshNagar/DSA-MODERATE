public class DLL {

    private Node head;
    private int size;
    // Why should you keep a tail?
    // If you keep a tail pointer:
    // You don’t have to traverse the list every time to find the last node.
    // Reverse traversal becomes O(n) → start directly from tail.
    // Adding elements at the end becomes very efficient (O(1) instead of O(n)).

    public DLL() {
        this.size = 0;
    }
    private class Node {
        int val;
        Node next;
        Node prev;

        
        public Node(int val) {
            this.val = val;
        }

        
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    // insert at first
    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head != null) {
            head.prev = newNode;
        }
        head = newNode;

        size++;
    }
    
    // insert at last
    public void insertLast(int val) {
        Node newNode = new Node(val);
        Node last = head;

        newNode.next = null; // specification

        if (head == null) { // empty list case
            head = newNode;
            return;
        }

        while(last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;

        size++;
    }

    public void insertAtIndex(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {  // inserting at end
            insertLast(val);
            return;
        }

        Node temp = get(index -1);
        Node newNode = new Node(val, temp.next, temp);
        temp.next.prev = newNode;
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


    public void displayReverse() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("NULL/END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("NULL/START");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(55);
        list.insertAtIndex(67, 3);

        list.displayReverse();
    }
}
