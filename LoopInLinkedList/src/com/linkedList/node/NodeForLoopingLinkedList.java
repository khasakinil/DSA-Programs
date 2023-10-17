package com.linkedList.node;

public class NodeForLoopingLinkedList{
	private int data;
	private NodeForLoopingLinkedList next;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeForLoopingLinkedList getNext() {
		return next;
	}

	public void setNext(NodeForLoopingLinkedList head) {
		this.next = head;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

	public NodeForLoopingLinkedList(int data) {
		super();
		this.data = data;
		this.next = null;
	}

}
