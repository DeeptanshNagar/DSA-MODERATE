public class LL { // Declares a public class named LL. The public keyword means this class can be accessed from other packages.
    private Node head; // Declares a private instance variable head of type Node. This points to the first node in the linked list. It's private so it can only be accessed within this class.
    private Node tail; // Declares a private instance variable tail of type Node. This points to the last node in the linked list, making it efficient to add elements at the end.

    private int size; // Declares a private integer variable size to keep track of how many elements are currently in the linked list.

    public LL() { // Declares the constructor for the LL class. This is called when you create a new linked list object
        this.size = 0; // Inside the constructor, initializes the size to 0 since a new linked list starts empty. Note: head and tail are automatically initialized to null by Java.
    }
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
}