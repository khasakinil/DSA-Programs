package com.linkedList;

public class ReverseLinkedListIterativeMain {
	public static void main(String args[]) {
		ReverseLinkedListIterative rlli = new ReverseLinkedListIterative();
		rlli.insertInLinkedList(23);
		rlli.insertInLinkedList(24);
		rlli.insertInLinkedList(25);
		rlli.insertInLinkedList(26);
		rlli.insertInLinkedList(27);
		rlli.insertInLinkedList(28);
		rlli.insertInLinkedList(20);
		rlli.insertInLinkedList(30);
		System.out.println("Linked List Before reverse : ");
		rlli.printLinkedList();
		rlli.reverseLinkedListIterative();
		System.out.println("\nLinked List After reverse : ");
		rlli.printLinkedList();
	}
}
