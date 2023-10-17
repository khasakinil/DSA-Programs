package com.linkedList;

import com.linkedList.node.NodeForLoopingLinkedList;

public class LoopInLinkedList {

	static NodeForLoopingLinkedList head;
	static NodeForLoopingLinkedList tail;

	public static void main(String[] args) {
		LoopInLinkedList lill = new LoopInLinkedList();
		lill.insertInLinkedList(23);
		lill.createLoop(true);
		System.out.println("Loop in Linked List : " + lill.checkForLoopInLinkedList(head));
	}

	private void createLoop(boolean isLoop) {

		if (isLoop) {
			tail.setNext(head);
		}
	}

	private boolean checkForLoopInLinkedList(NodeForLoopingLinkedList head) {
		NodeForLoopingLinkedList first = head;
		NodeForLoopingLinkedList second = head;

		while (second.getNext() != null && second.getNext().getNext() != null) {
			first = first.getNext();
			second = second.getNext().getNext();

			if (first == second) {
				return true;
			}
		}
		return false;
	}

	private void insertInLinkedList(int data) {
		NodeForLoopingLinkedList newNode = new NodeForLoopingLinkedList(data);
		newNode.setNext(head);
		head = newNode;

		if (newNode.getNext() == null) {
			tail = head;
		}
	}

}
