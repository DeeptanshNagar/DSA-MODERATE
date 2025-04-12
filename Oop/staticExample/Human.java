package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello World");
        // System.out.println(this.age); // this keyword represents the object and you are in static and static itself is not dependent on any object then how can you use something that is dependent on the object.
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}