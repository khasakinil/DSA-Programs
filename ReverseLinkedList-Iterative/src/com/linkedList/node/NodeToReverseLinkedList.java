package com.linkedList.node;

public class NodeToReverseLinkedList {
	private int data;
	private NodeToReverseLinkedList next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeToReverseLinkedList getNext() {
		return next;
	}

	public void setNext(NodeToReverseLinkedList next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

	public NodeToReverseLinkedList(int data) {
		super();
		this.data = data;
		this.next = null;
	}

}
