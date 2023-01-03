package com.linkedList;

import com.linkedList.node.Node;

public class RemoveDuplicatesFromSortedLinkedList {

	Node head;

	public void insertInLinkedList(int data) {
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
	}

	public void printLinkedList() {
		Node tmpNode = head;
		while (tmpNode != null) {
			System.out.print(tmpNode.getData());
			if (tmpNode.getNext() != null) {
				System.out.print(" -> ");
			}
			tmpNode = tmpNode.getNext();
		}
	}

	public void removeDuplicatesFromLinkedList() {
		Node tmpNode = head;
		while (tmpNode != null) {

			boolean isNext = false;
			if (tmpNode.getNext() != null) {
				Node nextNode = tmpNode.getNext();
				if (tmpNode.getData() == nextNode.getData()) {
					tmpNode.setNext(tmpNode.getNext().getNext());
					isNext = true;
				}
			}

			if (!isNext) {
				tmpNode = tmpNode.getNext();
			}
		}
	}

}
