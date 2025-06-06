public class Comparsion {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal";
        System.out.println(a==b); // True
        // in above method we use string pool which is more effective method and makes our program more optimized.
        String c = a;
        System.out.println(c == b); // True

        // ==
        System.out.println(a == b); // True

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");
        // System.out.println(name1 == name2); // False 
        // we won't get optimized results.
        // System.out.println(name1.equals(name2)); // True - IF YOU ARE WONDERING WHY? BECAUSE IT DOESN'T CARE WHETHER THE REFERENCE VARIABLE ARE POINTING TO SAME OBJECT OR NOT, IT JUST CARES ABOUT THE VALUE IS SIMILAR OR NOT. IF SAME THEN TRUE ELSE FALSE.
        String name3 = new String("Diptansh");
        String name4 = new String("Diptansh");
        System.out.println(name3 == name4); // false
        // System.out.println(name3.equals(name4)); // false, because name4 contains extra spaces which makes name4 a different string from name 3.

        System.out.println(name1.charAt(0));
    }
}
