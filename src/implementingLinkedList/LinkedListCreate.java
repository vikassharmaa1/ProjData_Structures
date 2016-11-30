package implementingLinkedList;

public class LinkedListCreate {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		LinkedListCreate list = new LinkedListCreate();
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		list.head.next = second;
		second.next = third;
		third.next = fourth;

		list.printList();

	}
}
