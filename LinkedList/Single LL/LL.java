public class LL {
    // pointers
    private Node head;
    private Node tail;
    private int size;

    // size of list
    public LL() {
        this.size = 0;
    }

    // node creation
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

    // inserting at 0th index
    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    // inserting via recursion
    public void insertRec(int value, int index) {
        head = insertRec(value, index, head);
    }
    private Node insertRec(int value, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(value, node);
            size++;
            return newNode;
        }

        node.next = insertRec(value, index - 1 , node.next);
        return node;
    }

    // inserting at size - 1 index
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;

        size++;
    }

    // inserting at any index
    public void insertAtIndex(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;

        size++;
    }

    // Delete the first index
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // Delete the last index
    public int deleteLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return -1;
        }
        if (size == 1) {
            return deleteFirst();
        }

        Node secondLast = head;
        while (secondLast.next != tail) {
            secondLast = secondLast.next;
        }

        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;

        return val;
    }

    // Delete at any index
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

    // I will pass the value you gimme the position of node
    private Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null; // if u are unable to find node, please return not found or null
    }

    // Helper method to get node at a specific index
    private Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(12);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(5);
        list.insertFirst(3);
        list.insertLast(18);
        list.insertAtIndex(7, 3);
        list.display();  // Output: 3 -> 5 -> 9 -> 7 -> 8 -> 12 -> 18 -> NULL
        // System.out.println("Size: " + list.getSize()); // Output: Size: 7


        list.deleteFirst();
        // System.out.println(list.deleteFirst());
        list.display();  // 5 -> 9 -> 7 -> 8 -> 12 -> 18 -> NULL
        // list.deleteLast();
        System.out.println(list.deleteLast());
        list.display();

        list.deleteAtIndex(3); // works works
        list.display();

        list.insertRec(45, 3);
        list.display();

        // Node foundNode = list.find(9);
        // if (foundNode != null) {
        //     System.out.println("Found node with value: " + foundNode.value);
        // } else {
        //     System.out.println("Value not found in list");
        // }
    }
}
