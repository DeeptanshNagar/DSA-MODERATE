public class Basics {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // Student[] students = new Student[5];

        // just declaring
        // Student kunal;

        // System.out.println(Arrays.toString(students));

        // Student student1;  // declaration
        // student1 = new Student();  // here 'new' dynamically allocates memory and returns a reference to it which was later stored in student1 variable.

        //  Student student1 = new Student();
        //  {---compile- --}   {---Runtime--}         
        // compile time = program is checking whether their are errors line by line.
        // Runtime = means when everything is finished happening, all the checks are happened, all the code has been converted, runtime as the name suggests means the program is now running or application will running that is the time when is memory will be allocated that is known as dynamic memory allocation.

        // Here, you can use now student1, mimicking it like as if was the object but its not the object, it is the reference variable which is pointing to the object
        // In reality, internally maybe it will be holding like some memory address of original object that is in the heap but we can't access the memory address because in java it is not allowed.(security purposes)

        Student[] students = new Student[5];
        // The line Student[] students = new Student[5]; initializes an array of size 5, capable of holding references to Student objects, but it does not instantiate the individual Student objects themselves.
        // new keyword in Java is used to create an instance of a class, also known as an object. It is used to allocate memory for an object and call the constructor of the class to initialize the object's state.
        Student kunal = new Student(15, "Kunal Kushwaha", 98.2f);
        Student Rahul = new Student();
        // This demonstrates that the Student() in Student kunal = new Student(); is a constructor initializing the object kunal.
        // Constructor is a special function, that runs where you create an object and it allocates some variables.
        // Student() ,here is the default constructor of the Student class (if no constructor is explicitly defined, Java provides a default no-argument constructor).
        // When this line of code is executed, memory is allocated for a new Student object, and kunal refers to that object in heap from stack memory.

        // kunal.rno = 13;
        // kunal.name = "Kunal Kushwaha";
        // kunal.marks = 88.65f;              // making constructor instead


        // kunal.changeName("Shoe Lover");
        // kunal.greeting();


        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student random = new Student(kunal);
        System.out.println(random.name);
    }
}
// create a class 
// class is just a name group of properties and functions
// class is a logical construct
// object is physical reality // this is something which is actually occupying some space in the memory
// class is an template of an object
// object is an instance of a class 
// class creates a dataType that you can used to create objects, when you declare an object of a class, you are creating an instance of that class
// objects are categorized in three essential properties - 
// 1. State of the Object - IT'S VALUE FROM ITS DATA TYPE
// 2. Identity of the Object - WHETHER ONE OBJ IS DIFFERENT FROM OTHER
// 3. Behaviour of the Object

// For every single student
class Student {
    int rno;
    String name;
    float marks;

    // we need a way to add the values of the above properties object by object.
    // we need one word to access every object.
    // constructor inside the class body
    Student () {
        this.rno = 13;
        this.name = "Kunal Kushwaha";
        this.marks = 88.65f;
    }
    // Student arpita = new Student(17, "Arpita", 89.4f);
    // here, this will be replaced with Arpita
    Student (int rno, String name, float marks) {
        this.rno = rno;     // this.rno = roll; // this will also work.
        this.name = name;
        this.marks = marks;
    }
    Student (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    void changeName(String name) {
        this.name = name;       // name = newName;
    }
    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }
}
