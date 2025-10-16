// Custom exception class
class StackException extends Exception {
    public StackException(String message) {
        super(message);
    }
}

public class CustomStack {
    private int[] data;
    private static final int INITIAL_SIZE = 10;

    private int ptr = -1;

    // Default constructor
    public CustomStack() {
        this(INITIAL_SIZE);
    }

    // Parameterized constructor
    public CustomStack(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be greater than 0!");
        }
        this.data = new int[size];
    }

    // Push operation
    public boolean push(int item) throws StackException {
        if (isFull()) {
            throw new StackException("Stack is full, can't push further!");
        }
        data[++ptr] = item;
        return true;
    }

    // Pop operation
    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty, can't pop!");
        }
        return data[ptr--];
    }

    // Peek operation
    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty, can't peek!");
        }
        return data[ptr];
    }

    // Check if stack is full
    public boolean isFull() {
        return ptr == data.length - 1;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return ptr == -1;
    }

    // Return size
    public int size() {
        return ptr + 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = ptr; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        try {
            CustomStack stack = new CustomStack();
            stack.push(6);
            stack.push(4);
            stack.push(76);
            stack.push(7);
            stack.push(36);

            stack.display();

            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());

            stack.display();

        } catch (StackException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
