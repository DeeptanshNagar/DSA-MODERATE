public class Output {
    public static void main(String[] args) {
        // System.out.println(56);
        Integer num = new Integer(56); // wrapper class // treating integer as an object provides various methods which we can perform on variable num
        System.out.println(num.toString());
        System.out.println(num); // .toString is not neccessary to mention as it (num) will be by default refering to .valueOf and .valueOf is refering to .toString
        // System.out.println("Kunal");
        // System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5}));

        String name = null;
        System.out.println(name);
    }
}