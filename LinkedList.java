public class LinkedList {

	class Node {

		public String value;
		public Node next;

		public Node() {
			value = null;
			next = null;
		}

		public Node(String val) {
			value = val;
		}

		public void addNode(Node n) {
			next = n;
		}
	}

	public Node head;

	public LinkedList() {
		head = new Node();
	}

	public void addNode(String value) {
		Node curNode = head;
		while(curNode.next != null) {
			curNode = curNode.next;
		}

		curNode.next = new Node(value);
	}

	public void printList() {
		Node curNode = head.next;
		while(curNode != null) {
			System.out.println(curNode.value);
			curNode = curNode.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		for(int i = 0;i<args.length;i++) {
			list.addNode(args[i]);
		}

		list.printList();
	}
}