public class LL {
    Node head;
    Node tail;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
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

        // size += 1;
    }

    // add on last position
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
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
        while(currNode != null) { // kyuki end wala element bi print karna hai
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first position
    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last position
    public void deleteLast() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;

        if(head.next == null) {
            head = null;
            return;
        }
        
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        System.out.println("Inserting from start");
        list.addFirst("1");
        list.printList();
        list.addFirst("2");
        list.printList();
        list.addFirst("3");
        list.printList();

        System.out.println();

        System.out.println("Inserting from end");
        list.addLast("4");
        list.printList();
        list.addLast("5");
        list.printList();

        System.out.println();

        // for sake of understanding
        System.out.println("Original list");
        list.printList();

        System.out.println();

        System.out.println("Deleting from start");
        list.deleteFirst();
        list.printList();

        System.out.println();

        System.out.println("Deleting from end");
        list.deleteLast();
        list.printList();

        System.out.println();
        System.out.println("Size of Remaining List");
        System.out.println(list.getSize());
    }
}



// public class LL {

//     Node head;
//     Node tail;

//     class Node{
//         String data;
//         Node next;

//         Node(String data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     // inserting at first posi
//         public void firstPos(String data) {
//             Node newNode = new Node(data);
//             if(head == null) {
//                 head = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head = newNode;
//         }

//         // inserting at last posi
//         public void lastPos(String data) {
//             Node newNode = new Node(data);
//             if(head == null) {
//                 head = tail = newNode;
//                 return;
//             }

//             Node currNode = head;
//             while(currNode.next != null) {
//                 currNode = currNode.next;
//             }
//             currNode.next = newNode;
//         }

//         // print
//         public void print() {
//             Node currNode = head;
//             while(currNode != null) {
//                 System.out.print(currNode.data + " -> ");
//                 currNode = currNode.next;
//             }
//             System.out.println("NULL");
//         }
//     public static void main(String[] args) {
//         LL list = new LL();
//         list.firstPos("A");
//         list.firstPos("B");
//         list.lastPos("C");
//         list.print();
//     }
// }

