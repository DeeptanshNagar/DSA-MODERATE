public class CLL {
    Node head;
    Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    private class Node {
        int value;
        Node next;

        public Node (int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void display() {
        Node temp = head;
        if(head != null) {
            do { 
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("HEAD");
        }
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.display();
    }
}
