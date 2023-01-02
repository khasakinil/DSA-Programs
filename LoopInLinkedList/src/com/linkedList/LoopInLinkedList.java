package com.linkedList;

import com.linkedList.node.Node;

public class LoopInLinkedList {

	static Node head;
	static Node tail;

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

	private boolean checkForLoopInLinkedList(Node head) {
		Node first = head;
		Node second = head;

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
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;

		if (newNode.getNext() == null) {
			tail = head;
		}
	}

}
