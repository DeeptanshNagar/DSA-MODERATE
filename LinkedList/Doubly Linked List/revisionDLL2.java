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

    public void insertLast(int data) {
        Node newNode = new Node(data);
        Node temp = head;

        if(head == null) {
            head = newNode;
            size++;
            return;
        }

        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;

        size++;
    }

    public void insertAtIndex(int data, int index) {
        Node newNode = new Node(data);

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if(index == 0) {
            insertFirst(data);
            return;
        }

        if(index == size) {
            insertLast(data);
            return;
        }

        Node temp = getNode(index - 1);
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        newNode.prev = temp;

        size++;
    }

    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is already empty!");
        }

        head = head.next;

        size--;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("List is already empty!");
        }
        Node secondLast = head;
        while(secondLast.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.prev.next = null;

        size--;
    }

    public void deleteAtIndex(int index) {
        if(index == 0) {
            deleteFirst();
            return;
        }

        if(index == size - 1) {
            deleteLast();
            return;
        }

        Node prevNode = getNode(index - 1);
        prevNode.next = prevNode.next.next;
        prevNode.next.next.prev = prevNode;

        size--;
    }
    
    public Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(" -> NULL");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        revisionDLL2 list = new revisionDLL2();
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(12);
        list.insertFirst(16);
        list.insertFirst(20);
        list.display();

        list.deleteAtIndex(2);
        list.display();

        // list.insertLast(24);
        // list.display();

        // list.insertAtIndex(28, 3);
        // list.display();

        // list.deleteLast();
        // list.display();

        // System.out.println(list.getSize());
    }
}
