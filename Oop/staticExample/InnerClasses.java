package staticExample;

// outside classes can never be static.
// only inner classes can be static.

/* this test class doesn't depend on any other class */
// class Test { // This class is dependent on outside class 
//     String name;

//     public Test(String name) {
//         this.name = name;
//     }
// }
// public static void main(String[] args) {
//     Test a = new Test("Kunal");
//     Test b = new Test("Rahul");
// }
// class Test { // independent to any class.
//     static String name;

//     public Test(String name) {
//         Test.name = name;
//     }
// } 
public class InnerClasses {
    // class Test { // This class is dependent on outside class 
    //     String name;

    //     public Test(String name) {
    //         this.name = name;
    //     }
    // }
    static class Test { // This class also is dependent on outside class itself but not on its objects.
        String name;

        public Test(String name) {
            this.name = name;
        }
    }
    private String name; // Add a name field to the InnerClasses class

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        System.out.println(a.name);
        Test b = new Test("Rahul");
        System.out.println(a);
        // System.out.println(a.name);
        // System.out.println(b.name);
    }
}


// static class A {
                        // because it itself is not dependent on any other class then how many you put static like this.
// }


/*
# Think of Java Classes like Toy Boxes:
A class in Java is like a toy box.

Inside a toy box, you can keep toys (objects), or even smaller boxes (inner classes).

# Outer Class vs Inner Class:
1. Outer Class (Big Toy Box)
This is the main box. Like public class InnerClasses { ... }

It’s the main thing, so Java says: “You don’t need to put static on it.”

2. Inner Class (Small Toy Box Inside)
This is a class inside another class.

It depends on the outer box. It's like a toy that can’t be used unless the big box is open first.

⚡ Now What Does static Do?
If you say a class is static, you're saying:
"This small toy box doesn't need the big toy box to exist. It can be used on its own."

Example:
A non-static inner class needs the outer class:

You can only play with this toy if the main box is open.

A static inner class can be used by itself:

You can play with this toy without opening the main box. It's like it’s stored somewhere else.

🤯 So Why Can't an Outer Class Be static?
Because it already stands alone, like a big box on its own shelf. Java says:

"Why would you mark it static? It’s already independent!"
*/