package com.linkedList;

import com.linkedList.node.Node;

public class ReverseLinkedListInGroupIterative {

	Node head;

	public void insertInLinkedList(int data) {
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
	}

	public void printLinkedList() {
		Node tempNode = head;
		System.out.println();
		while (tempNode != null) {
			System.out.print(tempNode.getData());
			if (tempNode.getNext() != null) {
				System.out.print(" -> ");
			}
			tempNode = tempNode.getNext();
		}
	}

	public Node reverseLinkedListInGroup(int groupSize) {
		Node prev = null;
		Node current = head;
		Node next = null;
		Node tail = null;
		Node newHead = null;
		Node join = null;

		while (current != null) {

			int count = 0;
			join = current;

			while (current != null && count < groupSize) {
				next = current.getNext();
				current.setNext(prev);
				prev = current;
				current = next;
				count++;
			}

//			if (newHead == null) {
//				newHead = prev;
//			}
//
//			if (tail != null) {
//				tail.setNext(prev);
//			}
//
//			tail = join;
//			head = prev;
		}

		head = prev;

		return prev;
	}

}
