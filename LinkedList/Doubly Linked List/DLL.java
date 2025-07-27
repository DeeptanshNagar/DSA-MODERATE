public class DLL {

    private Node head;
    // Why should you keep a tail?
    // If you keep a tail pointer:
    // You don’t have to traverse the list every time to find the last node.
    // Reverse traversal becomes O(n) → start directly from tail.
    // Adding elements at the end becomes very efficient (O(1) instead of O(n)).

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

    }

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

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(55);

        list.displayReverse();
    }
}
