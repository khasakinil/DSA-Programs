package com.linkedList;

import com.linkedList.node.NodeForLoopingLinkedList;

public class RemoveDuplicatesFromSortedLinkedList {

	NodeForLoopingLinkedList head;

	public void insertInLinkedList(int data) {
		NodeForLoopingLinkedList newNode = new NodeForLoopingLinkedList(data);
		newNode.setNext(head);
		head = newNode;
	}

	public void printLinkedList() {
		NodeForLoopingLinkedList tmpNode = head;
		while (tmpNode != null) {
			System.out.print(tmpNode.getData());
			if (tmpNode.getNext() != null) {
				System.out.print(" -> ");
			}
			tmpNode = tmpNode.getNext();
		}
	}

	public void removeDuplicatesFromLinkedList() {
		NodeForLoopingLinkedList tmpNode = head;
		while (tmpNode != null) {

			boolean isNext = false;
			if (tmpNode.getNext() != null) {
				NodeForLoopingLinkedList nextNode = tmpNode.getNext();
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
