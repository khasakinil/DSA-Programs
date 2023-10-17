package com.linkedList.node;

public class Node {
	int data;
	NodeForLoopingLinkedList next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeForLoopingLinkedList getNext() {
		return next;
	}

	public void setNext(NodeForLoopingLinkedList next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

	public Node(int data) {
		super();
		this.data = data;
		next = null;
	}

}
