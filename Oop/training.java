import java.util.Arrays;
class Student {
    int rno;
    String name;
    float marks;

    // Constructor
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // To print student details properly
    @Override
    public String toString() {
        return "Student{" + "rno=" + rno + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }
}

public class training {
    public static void main(String[] args) {
        // Initialize an array of students
        Student[] students = new Student[2];

        // Creating student objects
        students[0] = new Student(1, "Kunal", 89.5f);
        students[1] = new Student(2, "Alex", 76.2f);

        // Print student array
        System.out.println(Arrays.toString(students));
    }
}