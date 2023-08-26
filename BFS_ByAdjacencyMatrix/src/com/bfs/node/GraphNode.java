package com.bfs.node;

import java.util.ArrayList;

public class GraphNode {
	private String name;
	private int index;
	private ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
	private boolean isVisited = false;
	private GraphNode parent;

	public GraphNode(String name, int index) {
		super();
		this.name = name;
		this.index = index;
	}

	public GraphNode() {
		super();
	}

	public GraphNode(String name, int index, ArrayList<GraphNode> neighbors, boolean isVisited, GraphNode parent) {
		super();
		this.name = name;
		this.index = index;
		this.neighbors = neighbors;
		this.isVisited = isVisited;
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public ArrayList<GraphNode> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(ArrayList<GraphNode> neighbors) {
		this.neighbors = neighbors;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public GraphNode getParent() {
		return parent;
	}

	public void setParent(GraphNode parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "GraphNode [name=" + name + "]";
	}

}
