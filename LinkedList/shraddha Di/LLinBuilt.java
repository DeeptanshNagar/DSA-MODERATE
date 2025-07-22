import java.util.LinkedList;

public class LLinBuilt {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Batman");
        list.addFirst("Thor");
        System.out.println(list);

        list.addLast("Tarzan");         // add and addLast do the same work
        System.out.println(list);

        System.out.println(list.size());
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");
        System.out.println();

        list.removeFirst();
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        list.removeLast();
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");
    }
}
