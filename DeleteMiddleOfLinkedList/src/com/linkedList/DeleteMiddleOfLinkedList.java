package com.linkedList;

import com.linkedList.node.Node;

public class DeleteMiddleOfLinkedList {

	Node head;

	public static void main(String args[]) {
		DeleteMiddleOfLinkedList moll = new DeleteMiddleOfLinkedList();
		for (int i = 11; i > 5; i--) {
			moll.insertInLinkedList(i);
		}

		System.out.println("Before Deleting middle of Linked List");
		moll.printLinkedList();
		moll.removeMiddleOfLinkedList();
		System.out.println("After Deleting middle of Linked List");
		moll.printLinkedList();
	}

	private void removeMiddleOfLinkedList() {
		Node slowJump = head;
		Node fastJump = head;
		while (fastJump != null && fastJump.getNext() != null) {
			fastJump = fastJump.getNext().getNext();
			if (fastJump != null) {
				slowJump = slowJump.getNext();
			}
		}

		slowJump.setNext(slowJump.getNext().getNext());
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
