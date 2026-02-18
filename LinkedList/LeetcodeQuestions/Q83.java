public class Q83 {
    Node head;
    Node tail;
    public class Node {
        int value;
        Node next;

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

        if (tail == null) {
            tail = head;
        }
    }
    
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
    }

    public void uniqueList() {
        Node temp = head;
        while(temp != null && temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Q83 list = new Q83();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(5);

        list.display();

        list.uniqueList();
        list.display();
        
    }
}

