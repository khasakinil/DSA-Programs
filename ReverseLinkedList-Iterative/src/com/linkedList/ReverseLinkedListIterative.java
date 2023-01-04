package com.linkedList;

import com.linkedList.node.Node;

public class ReverseLinkedListIterative {

	Node head;

	public void insertInLinkedList(int data) {
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
	}

	public void printLinkedList() {
		System.out.println();
		Node tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.getData());
			if (tempNode.getNext() != null) {
				System.out.print(" -> ");
			}
			tempNode = tempNode.getNext();
		}

	}

	public void reverseLinkedListIterative() {
		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}

}
