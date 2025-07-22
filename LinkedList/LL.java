public class LL { // Declares a public class named LL. The public keyword means this class can be accessed from other packages.


    private Node head; // Declares a private instance variable head of type Node. This points to the first node in the linked list. It's private so it can only be accessed within this class.


    private Node tail; // Declares a private instance variable tail of type Node. This points to the last node in the linked list, making it efficient to add elements at the end.


    private int size; // Declares a private integer variable size to keep track of how many elements are currently in the linked list.

    
    public LL() { // Declares the constructor for the LL class. This is called when you create a new linked list object.
        this.size = 0; // Inside the constructor, initializes the size to 0 since a new linked list starts empty. Note: head and tail are automatically initialized to null by Java.
    }


    private class Node { // Declares a private inner class named Node. Being private means only the LL class can use this Node class. Inner classes have access to the outer class's variables.
        private int value; // Declares a private integer field value inside the Node class. This stores the actual data for each node.
        private Node next; // Declares a private Node reference called next. This points to the next node in the linked list, creating the "link" in the linked list.



        // First constructor for Node class. Takes an integer parameter value. This constructor creates a node with just a value.
        public Node(int value) {
            this.value = value; // // Sets the node's value field to the parameter passed in. The this.value refers to the instance variable, while value refers to the parameter.
        }


        public Node(int value, Node next) { // Second constructor for Node class. Takes two parameters: an integer value and a Node reference next. This creates a node and immediately connects it to another node.

            this.value = value; //  Sets the node's value field to the parameter.
            
            this.next = next; // Sets the node's next field to point to the Node passed as a parameter, creating the link to the next node.
        }
    }
}