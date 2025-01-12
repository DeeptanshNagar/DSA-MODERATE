

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
        //  {---compile- --}   {---Runtime---}         
        // compile time = program is checking whether their are errors line by line.
        // Runtime = means when everything is finished happening, all the checks are happened, all the code has been converted, runtime as the name suggests means the program is now running or application will running that is the time when is memory will be allocated that is known as dynamic memory allocation.

        // Here, you can use now student1, mimicking it like as if was the object but its not the object, it is the reference variable which is pointing to the object
        // In reality, internally maybe it will be holding like some memory address of original object that is in the heap but we can't access the memory address because in java it is not allowed.(security purposes)

        Student[] students = new Student[5];
        Student kunal = new Student();

        kunal.rno = 13;

        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
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
}