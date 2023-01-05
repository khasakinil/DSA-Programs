package com.linkedList;

public class ReverseLinkedListInGroupIterativeMain {

	public static void main(String[] args) {
		ReverseLinkedListInGroupIterative rllgi = new ReverseLinkedListInGroupIterative();
		rllgi.insertInLinkedList(15);
		rllgi.insertInLinkedList(16);
		rllgi.insertInLinkedList(17);
		rllgi.insertInLinkedList(18);
		rllgi.insertInLinkedList(19);
		rllgi.insertInLinkedList(20);
		rllgi.insertInLinkedList(21);
		rllgi.insertInLinkedList(22);
		rllgi.insertInLinkedList(23);
		rllgi.insertInLinkedList(24);
		rllgi.insertInLinkedList(25);

		System.out.println("Linked List before reversing in group : ");
		rllgi.printLinkedList();

		System.out.println("\nLinked List after reversing in group : ");
		rllgi.reverseLinkedListInGroup(3);
		rllgi.printLinkedList();
	}

}
