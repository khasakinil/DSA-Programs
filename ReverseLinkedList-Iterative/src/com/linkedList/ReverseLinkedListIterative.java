package com.linkedList;

import com.linkedList.node.NodeForLoopingLinkedList;

public class ReverseLinkedListIterative {

	NodeForLoopingLinkedList head;

	public void insertInLinkedList(int data) {
		NodeForLoopingLinkedList newNode = new NodeForLoopingLinkedList(data);
		newNode.setNext(head);
		head = newNode;
	}

	public void printLinkedList() {
		System.out.println();
		NodeForLoopingLinkedList tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.getData());
			if (tempNode.getNext() != null) {
				System.out.print(" -> ");
			}
			tempNode = tempNode.getNext();
		}

	}

	public void reverseLinkedListIterative() {
		NodeForLoopingLinkedList prev = null;
		NodeForLoopingLinkedList current = head;
		NodeForLoopingLinkedList next = null;

		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}

}
