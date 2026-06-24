import java.util.Scanner;

public class BinaryTree {

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Populate Tree
    public void populate(Scanner scanner) {
        System.out.print("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {

        System.out.print("Do you want to enter left of " + node.value + "? (1 = Yes, 0 = No): ");
        int left = scanner.nextInt();

        if (left == 1) {
            System.out.print("Enter the value of the left of " + node.value + ": ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.print("Do you want to enter right of " + node.value + "? (1 = Yes, 0 = No): ");
        int right = scanner.nextInt();

        if (right == 1) {
            System.out.print("Enter the value of the right of " + node.value + ": ");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    // Pretty Display Wrapper
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    // Pretty Display Method
    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------> " + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);

        System.out.println("\nBinary Tree:");
        tree.prettyDisplay();

        scanner.close();
    }
}