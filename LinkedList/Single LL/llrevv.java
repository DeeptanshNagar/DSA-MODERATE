// ORIGINAL CODE ANALYSIS
// Issues found:
// 1. No null check for empty list when index > 0
// 2. No bounds checking for invalid indices
// 3. Potential NullPointerException when node.next is accessed

public class llrevv {
    private Node head;
    private int size;
    
    // Node class
    private class Node {
        int data;
        Node next;
        
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    
    // ORIGINAL METHOD KunalKushwaha (with issues)
    public void insertRec(int value, int index) {
        head = insertRec(value, index, head);
    }
    
    private Node insertRec(int value, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(value, node);
            size++;
            return newNode;
        }
        
        // PROBLEM: What if node is null here?
        node.next = insertRec(value, index - 1, node.next);
        return node;
    }
    
    // DEBUGGED VERSION WITH FIXES
    public void insertRecFixed(int value, int index) {
        // Add bounds checking
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        head = insertRecHelper(value, index, head);
    }
    
    private Node insertRecHelper(int value, int index, Node node) {
        // Base case: insert at current position
        if (index == 0) {
            Node newNode = new Node(value, node);
            size++;
            return newNode;
        }
        
        // FIXED: Handle null node case
        if (node == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        
        // Recursive case: move to next position
        node.next = insertRecHelper(value, index - 1, node.next);
        return node;
    }
    
    // STEP-BY-STEP TRACE EXAMPLE
    /*
    Let's trace insertRec(5, 2) on list: [1, 2, 3]
    
    Initial call: insertRec(5, 2, head pointing to 1)
    
    Step 1: insertRec(5, 2, Node(1))
    - index != 0, so go to recursive case
    - Call: insertRec(5, 1, Node(1).next) which is Node(2)
    
    Step 2: insertRec(5, 1, Node(2))
    - index != 0, so go to recursive case  
    - Call: insertRec(5, 0, Node(2).next) which is Node(3)
    
    Step 3: insertRec(5, 0, Node(3))
    - index == 0, BASE CASE!
    - Create newNode(5, Node(3))
    - size++
    - Return newNode(5) -> Node(3)
    
    Step 4: Back to Step 2
    - Node(2).next = newNode(5) -> Node(3)
    - Return Node(2)
    
    Step 5: Back to Step 1
    - Node(1).next = Node(2) (unchanged)
    - Return Node(1)
    
    Final result: [1, 2, 5, 3]
    */
    
    // Test method to demonstrate
    public void printList() {
        Node current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(", ");
            current = current.next;
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        llrevv list = new llrevv();
        // Assume we have some initial nodes...
        // This is just for demonstration of the debugging process
        list.insertRecFixed(1, 0);
        list.insertRecFixed(22, 1);
        list.insertRecFixed(333, 2);
        list.insertRecFixed(4444, 3);
        list.insertRecFixed(45, 3);

        list.printList();
    }
}