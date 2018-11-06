package org.sparta.sdg.Model;

public class BinaryTreeImplementation implements BinaryTree {

    private Node rootNode;
    private int numberOfElements = 1;
    private int[] nodesAscendingOrder;

    public BinaryTreeImplementation(final int element) {
        rootNode = new Node (element);
    }

    public BinaryTreeImplementation(final int[] elements){
        rootNode = new Node(elements[0]);
        for(int i =1; i<elements.length; i++){
            addElement (elements[i]);
        }
    }

    public int getRootElement() {
        return rootNode.getValue ();
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void addElement(int element) {
        Node node = rootNode;
        boolean exitCriteria = true;
        while (exitCriteria) {
            if (element < node.getValue()) {
                if (node.getLeftChild () != null){
                    node = node.getLeftChild ();
                } else {
                    node.setLeftChild (new Node (element));
                    numberOfElements++;
                    exitCriteria = false;
                }
            } else if (element > node.getValue ()) {
                if (node.getRightChild () != null){
                    node = node.getRightChild ();
                } else {
                    node.setRightChild (new Node (element));
                    numberOfElements++;
                    exitCriteria = false;
                }
            }
        }
    }

    public void addElements(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            addElement(elements[i]);
        }
    }

    public boolean findElement(int value) {

        Node focusNode = rootNode;

        while (focusNode != null) {
            if (focusNode.getValue () == value)
                return true;

            if (focusNode.getValue () > value) {
                focusNode = focusNode.getLeftChild ();

            } else if (focusNode.getValue () < value) {
                focusNode = focusNode.getRightChild ();
            }
        }
        return false;
    }


    public int getLeftChild(int element) /*throws ChildNotFoundException*/ {
        Node focusNode = rootNode;
        if (focusNode.getValue () == rootNode.getValue ()) {
            return focusNode.getLeftChild ().getValue ();
        }
        while(focusNode.getValue () != element) {
            if (focusNode.getValue () > element) {
                focusNode = focusNode.getLeftChild ();

            } else if (focusNode.getValue () < element) {
                focusNode = focusNode.getRightChild ();
            }
        }
        return focusNode.getLeftChild().getValue ();


}

    public int getRightChild(int element) /*throws ChildNotFoundException*/ {
        Node focusNode = rootNode;
        if (focusNode.getValue () == rootNode.getValue ()) {
            return focusNode.getRightChild ().getValue ();
        }
        while(focusNode.getValue () != element) {
            if (focusNode.getValue () > element) {
                focusNode = focusNode.getLeftChild ();

            } else if (focusNode.getValue () < element) {
                focusNode = focusNode.getRightChild ();
            }
        }
        return focusNode.getRightChild().getValue ();


    }

    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    public int[] getSortedTreeDesc() {
        return new int[0];
    }

//    public int[] getSortedTreeAsc() {
//        //populate an array from the left most node and work up
//        Node focusNode
//        if (focusNode)
//        return nodesAscendingOrder;
//    }
//
//    public int[] getSortedTreeDesc() {
//        return new int[0];
    }
//}
