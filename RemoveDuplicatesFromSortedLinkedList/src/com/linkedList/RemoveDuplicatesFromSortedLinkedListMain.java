package com.linkedList;

public class RemoveDuplicatesFromSortedLinkedListMain {

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedLinkedList rdfll = new RemoveDuplicatesFromSortedLinkedList();
		rdfll.insertInLinkedList(23);
		rdfll.insertInLinkedList(23);
		rdfll.insertInLinkedList(24);
		rdfll.insertInLinkedList(24);
		rdfll.insertInLinkedList(25);
		rdfll.insertInLinkedList(26);
		rdfll.insertInLinkedList(26);
		System.out.println("Linked List before removing duplicates");
		rdfll.printLinkedList();
		rdfll.removeDuplicatesFromLinkedList();
		System.out.println("\nLinked List after removing duplicates");
		rdfll.printLinkedList();
	}

}
