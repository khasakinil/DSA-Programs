package com.linkedList.node;

public class NodeToRemoveDuplicatesFromLinkedList {
	private int data;
	private NodeToRemoveDuplicatesFromLinkedList next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeToRemoveDuplicatesFromLinkedList getNext() {
		return next;
	}

	public void setNext(NodeToRemoveDuplicatesFromLinkedList next) {
		this.next = next;
	}

	public NodeToRemoveDuplicatesFromLinkedList(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

}
