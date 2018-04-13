package com.bknieriem;

/*
    Imbalanced, unsorted. I won't worry about satisfying BST or Heap properties. Nodes can have n children.

              C
            / | \
           /  |  \
          E   F   S
         / \     / \
        H   B   P   D

    "C E H B F S P D" - DF

    "C E F S H B P D" - BF

    I'm just going to approached this Linked List style. Given a head, we can navigate the entirety of the tree in
    both depth first and breadth first manner. I was TAing a similar problem recently so this is approach is still fresh
    on my mind, anyway.

    I think my DF is pretty okay. I have some concerns about the double for in the BF and I'm on the right track with
    the visited bool but it's getting late.
 */

public class Main {

    public static void main(String[] args) {
        Tree tree = buildTree();
        System.out.print("(a)\t");          tree.depthFirst();
        System.out.print("\n(b)\t");        tree.breadthFirst();
    }
    //------------------------------------------------------------------------------------------------------------------
    public static Tree buildTree() {
        /*
        I'm just going to use this to emulate the example tree. Basically, we start with our head, then the children,
        then the children's children.

        I'm pretty sure Java has a built in tree DS but I'm just going to write a basic one up manually as a proof of
        concept.
         */
        // Head
        Node c = new Node("C", null);
        c.print();

        // 1. E -> H, B
        Node e = new Node("E", c);
        Node h = new Node("H", e);
        Node b = new Node("B", e);
        e.addChild(h);
        e.addChild(b);

        // 2. F
        Node f = new Node("F", c);

        // 3. S -> P, D
        Node s = new Node("S", c);
        Node p = new Node("P", s);
        Node d = new Node("D", s);
        s.addChild(p);
        s.addChild(d);

        // Head (C) -> E, F, S:
        c.addChild(e);
        c.addChild(f);
        c.addChild(s);

        // Build tree from these linked nodes. This way, Tree can be used to create additional functionality later.
        Tree tree = new Tree(c);

        return tree;
    }
}
