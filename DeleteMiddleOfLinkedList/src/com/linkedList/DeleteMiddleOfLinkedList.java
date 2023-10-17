package com.linkedList;

import com.linkedList.node.NodeForLoopingLinkedList;

public class DeleteMiddleOfLinkedList {

	NodeForLoopingLinkedList head;

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
		NodeForLoopingLinkedList slowJump = head;
		NodeForLoopingLinkedList fastJump = head;
		while (fastJump != null && fastJump.getNext() != null) {
			fastJump = fastJump.getNext().getNext();
			if (fastJump != null) {
				slowJump = slowJump.getNext();
			}
		}

		slowJump.setNext(slowJump.getNext().getNext());
	}

	private void printLinkedList() {
		NodeForLoopingLinkedList tempNode = head;
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
		NodeForLoopingLinkedList newNode = new NodeForLoopingLinkedList(data);
		newNode.setNext(head);
		head = newNode;
	}

}
