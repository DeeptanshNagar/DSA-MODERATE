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

    public static void main(String[] args) {
        apLL list = new apLL();
        list.addFirst("boy");
        list.addFirst("super");
        list.addFirst("am");
        list.addFirst("i");
        list.addLast(".");

        list.printList();
    }
}



// public class apLL {

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
//         apLL list = new apLL();
//         list.firstPos("A");
//         list.firstPos("B");
//         list.lastPos("C");
//         list.print();
//     }
// }

