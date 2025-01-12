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

        Student[] students = new Student[5];

        Student kunal;
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
class Student {
    int[] rno = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];
}