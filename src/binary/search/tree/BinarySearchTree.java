package binary.search.tree;

public class BinarySearchTree {
	private Node node;

	public BinarySearchTree() {
		this.node = null;
	}
	public void insert(int value) {
		this.node = insertNode(this.node, value);
	}
	private Node insertNode(Node curr, int value) {
		if (curr == null) {
			curr = new Node(value);
			return curr;
		}
		if(value < curr.getValue())
			curr.setLeft(insertNode(curr.getLeft(), value));
		if(value > curr.getValue())
			curr.setRight(insertNode(curr.getRight(), value));
		return curr;
	}
	public void print() {
		printNode(this.node);
	}
	private void printNode(Node curr) {
		if(curr != null) {
			printNode(curr.getLeft());
			System.out.printf("%3d", curr.getValue());
			printNode(curr.getRight());
		}
	}
}
