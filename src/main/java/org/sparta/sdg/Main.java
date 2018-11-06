package org.sparta.sdg;

import org.sparta.sdg.Control.BinaryTreeManager;

public class Main
{
    public static void main( String[] args ) {
        BinaryTreeManager binaryTreeManager = new BinaryTreeManager ();
        binaryTreeManager.createBinaryTree();
        binaryTreeManager.addNodeToTree();
        binaryTreeManager.addNodesToTree();
        binaryTreeManager.getLeftChild ();
        binaryTreeManager.getRightChild ();
        binaryTreeManager.getNumberOfElements ();
        binaryTreeManager.findElement();

    }
}
