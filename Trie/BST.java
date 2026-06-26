public class BST {
	public class Node {
		private int value;
		private int height;
		private Node left;
		private Node right;

		public Node(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}
	private Node root; // root ----> 50

	public BST() {
		// When you write
		// BST tree = new BST();
		// Java creates an empty tree.
		// Initially : root = null
		// Nothing exists : (empty)
	}

	public int height(Node node) {
		if (node == null) {
			return -1;
		}
		return node.height;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void insert(int value) {
		root = insert(value, root);
	}

	public Node insert(int value, Node node) {
		// base case
		if(node == null) {
			return new Node(value);
		}

		if (value < node.value) {
			node.left = insert(value, node.left);
		} else if (value > node.value) {
			node.right = insert(value, node.right);
		}

		node.height = Math.max(height(node.left), height(node.right)) + 1;

		return node;
	}

	public void populate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			this.insert(nums[i]);
		}
	}

	public boolean balaanced() {
		return balanced(root);
	}

	private boolean balanced(Node node) {
		if (node == null) {
			return true;
		}
		return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
	}

	public void display() {
		display(root, "Root Node: ");
	}

	public void display(Node node, String details) {
		if(node == null) { 
			return;
		}
		System.out.println(details + node.getValue());

		display(node.left, "Left child of " + node.getValue() + " : ");
		display(node.right , "Right child of " + node.getValue() + " : ");
	}

	public static void main(String[] args) {
		BST tree = new BST();
		int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
		tree.populate(nums);
		tree.display();
	}

}
