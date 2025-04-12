package staticExample;

// this is a demo to show initialisation of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once , when the first obj is created i.e. when the class is loaded for the first time 
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}

// Static blocks are run only once, and only when the class is loaded into memory for the first time.

// When the Java Virtual Machine (JVM) loads your StaticBlock class (which happens the first time the class is used, like creating an object or referencing a static variable), it:

// 1. Initializes all static variables.

// 2. Executes the static block(s).

// So, when the line -
// StaticBlock obj = new StaticBlock();
// runs, the class StaticBlock is loaded for the first time, and the static block runs. Hence, "I am in static block" is printed.

// When you create obj2, the class is already loaded, so the static block does not run again.

