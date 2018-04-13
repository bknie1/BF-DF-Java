package com.bknieriem;

    /*
    Preemptive creation of some functionality in case it comes up later.
     */

import java.util.ArrayList;

public class Node {
    private String data;                // Nodes contain a single letter.
    private Node parent;                // Nodes can only have one parent.
    private ArrayList<Node> children;   // Nodes can have any number of children. Left --> Right
    protected Boolean visited;
    //------------------------------------------------------------------------------------------------------------------
    Node(String data, Node parent) {
        children = new ArrayList<>();
        this.data = data;
        this.parent = parent;
        visited = false;
    }
    //------------------------------------------------------------------------------------------------------------------
    // Getters
    protected Node getParent () { return parent; }
    protected ArrayList<Node> getChildren () { return children; }
    //------------------------------------------------------------------------------------------------------------------
    // Setters
    protected void setData(String newData) { this.data = newData; }
    protected void setParent(Node newParent) { this.parent = newParent; }
    protected void setChildren(ArrayList<Node> newChildren) { this.children = newChildren; }
    //------------------------------------------------------------------------------------------------------------------
    // Node Functionality
    public void addChild(Node newChild) {
        children.add(newChild);
    }
    //------------------------------------------------------------------------------------------------------------------
    // Reporting
    protected String print() {
        return data.toString();
    }
    //------------------------------------------------------------------------------------------------------------------
    protected void printChildren() {
        if(children.size() > 0) {
            System.out.println(data + "'s Children");
            for (Node child : children) {
            System.out.println(child.print());
            }
        }
    }
    //------------------------------------------------------------------------------------------------------------------
}