package com.linkedList;

public class ReverseLinkedListInGroupIterative {

	static class Node {
		int data;
		Node next;
	}

	public static Node insertInLinkedList(Node head, int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		return head;
	}

	public static void printLinkedList(Node head) {
		Node tempNode = head;
		System.out.println();
		while (tempNode != null) {
			System.out.print(tempNode.data);
			if (tempNode.next != null) {
				System.out.print(" -> ");
			}
			tempNode = tempNode.next;
		}
	}

	public static Node reverseLinkedListInGroup(Node head, int k) {
		Node prev = null;
		Node curr = head;
		Node temp = null;
		Node tail = null;
		Node newHead = null;
		Node join = null;
		int t = 0;

		while (curr != null) {
			t = k;
			join = curr;
			prev = null;

			while (curr != null && t-- != 0) {
				temp = curr.next;
				curr.next = prev;
				prev = curr;
				curr = temp;
			}

			if ((newHead == null)) {
				newHead = prev;
			}

			if (tail != null) {
				tail.next = prev;
			}

			tail = join;
		}

		return newHead;
	}

	public static void main(String args[]) {

		Node head = null;

		head = insertInLinkedList(head, 11);
		head = insertInLinkedList(head, 22);
		head = insertInLinkedList(head, 33);
		head = insertInLinkedList(head, 44);
		head = insertInLinkedList(head, 55);
		head = insertInLinkedList(head, 66);
		head = insertInLinkedList(head, 77);
		head = insertInLinkedList(head, 88);
		head = insertInLinkedList(head, 99);

		int k = 3;

		System.out.print("Linked List before reverse\n");
		printLinkedList(head);
		head = reverseLinkedListInGroup(head, k);

		System.out.print("\nLinked list after reverse in group \n");
		printLinkedList(head);
	}

}
