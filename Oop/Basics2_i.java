class Student {
    int rno;
    String name;
    float marks;

    Student(int rno, String name , float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
public class Basics2_i {
    public static void main(String[] args) {
        Student one = new Student(13, "Kunal", 34.3f);
        Student two = one;
        one.name = "Brijesh";
        System.out.println(two.name);
    }
}
