public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;


    int ptr = -1;
    // When you don’t know or don’t care about size, this constructor uses the default (10). It internally calls the other constructor — a technique called constructor chaining.
    public customStack() {
        this(DEFAULT_SIZE);
    }

    public customStack(int size) {
        this.data = new int[size];
    }
    // conclusion - You get flexibility — default behavior for lazy people, and customization for those who need it.
    public boolean push(int item) {
        if(isFull()){
            System.out.println("Stack is full...!");
        }
        ptr++;
        data[ptr] = item;
        return true;
    } 

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int pop() throws stackException{
        if(isEmpty()) {
            throw new stackException("Cannot pop from an empty stack!!");
        }
        // int removed = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }

    public int peek() throws stackException{
        if(isEmpty()) {
            throw new stackException("Cannot peak from an empty stack!!");
        }
        return data[ptr];

    }
    public static void main(String[] args) {
        
    }
}