public class revisionDLL2 {
    Node head;
    int size;

    public revisionDLL2() {
        this.size = 0;
    }

    public class Node{
        int data;
        Node next;
        Node prev;

        private Node(int data) {
            this.data = data;
        }

        private Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if(head != null) {
            head.prev = newNode;
        }
        head = newNode;

        size++;
    }

    public void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> "); // imp
            // if (temp.next != null) {
            //     System.out.print(" -> ");
            // }
            temp = temp.next;
        }
        System.out.println("NULL"); 
    }

    public static void main(String[] args) {
        revisionDLL2 list = new revisionDLL2();
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(12);
        list.insertFirst(16);
        list.insertFirst(20);
        list.display();

    }
}
