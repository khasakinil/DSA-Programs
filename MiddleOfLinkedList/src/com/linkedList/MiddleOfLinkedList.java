package com.linkedList;

/*
 * Problem Statement : Find the middle of a given linked list
 */

public class MiddleOfLinkedList {
	Node head;

	public static void main(String args[]) {
		MiddleOfLinkedList moll = new MiddleOfLinkedList();
		for (int i = 11; i > 5; i--) {
			moll.insertInLinkedList(i);
			moll.printLinkedList();
			moll.printMiddleOfLinkedList();
		}
	}

	private void printMiddleOfLinkedList() {
		Node slowJump = head;
		Node fastJump = head;
		while (fastJump != null && fastJump.getNext() != null) {
			fastJump = fastJump.getNext().getNext();
			slowJump = slowJump.getNext();
		}

		System.out.println("Middle of Element : " + slowJump.getData());

	}

	private void printLinkedList() {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.getData() + "");
			tempNode = tempNode.getNext();
			if (tempNode != null) {
				System.out.print(" -> ");
			}
		}
		System.out.println();
	}

	private void insertInLinkedList(int data) {
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
	}
}
