package staticExample;

public class main {
    public static void main(String[] args) {
        Human kunal = new Human(30, "kunal", 12000, true);
        Human rahul = new Human(24, "rahul", 34000, false);
        Human arpita = new Human(22, "arpita", 345000, false);
        System.out.println(rahul.population);
        System.out.println(kunal.population);
        System.out.println(arpita.population);
    }
}





// no need to import human class if the class is in same package.
// cd "C:\Users\HP\OneDrive\Desktop\DSA-MODERATE\Oop"

