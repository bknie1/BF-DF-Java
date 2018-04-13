package com.bknieriem;

public class Tree {

    private Node head;
    //------------------------------------------------------------------------------------------------------------------
    Tree(Node head) {
        this.head = head;
    }
    //------------------------------------------------------------------------------------------------------------------
    public Node getHead() {
        return head;
    }
    //------------------------------------------------------------------------------------------------------------------
    public void breadthFirst() {
        System.out.print(head.print() + " ");
        bfTraversal(head);
    }
    //------------------------------------------------------------------------------------------------------------------
    private Node bfTraversal(Node current) {
        if(!current.visited)  {
            current.visited = true;

            if(current.getChildren().size() > 0) {
                for (Node child : current.getChildren()) {
                    System.out.print(child.print() + " ");
                }

                for (Node child : current.getChildren()) {
                    bfTraversal(child);
                }
            }
        }
        return current;
    }
    //------------------------------------------------------------------------------------------------------------------
    public void depthFirst() {
        dfTraversal(head);
    }
    //------------------------------------------------------------------------------------------------------------------
    private Node dfTraversal(Node current) {
        System.out.print(current.print() + " ");
        if(current.getChildren().size() > 0) {
            for (Node child : current.getChildren()) { dfTraversal(child); }
        }
        return current;
    }
    //------------------------------------------------------------------------------------------------------------------
    private void sort() {
        // TODO
    }
    //------------------------------------------------------------------------------------------------------------------
    public void print() {
        System.out.println(head.print());
        if(head.getChildren().size() > 0) {
            for (Node child : head.getChildren()) {
                System.out.println(child.print());
            }
        }
    }
}