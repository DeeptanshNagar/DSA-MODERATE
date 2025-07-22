public class apLL {
    Node head;
    Node tail;
    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add on first position
    public void addFirst(String data) {
        Node newNode = new Node(data);


        if(head == null) { // if there is no node present in the list
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add on last position
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode; // or newNode ka next toh null hi hoga because of line 10
    }

    // print
    public void printList() {
        if(head == null) {
            System.out.println("list is empty !");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        apLL list = new apLL();
        list.addFirst("tiger");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("the");

        list.printList();
    }
}
