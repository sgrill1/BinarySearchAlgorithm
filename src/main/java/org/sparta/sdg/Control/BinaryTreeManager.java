package org.sparta.sdg.Control;

import org.sparta.sdg.Model.BinaryTree;
import org.sparta.sdg.Model.BinaryTreeImplementation;

public class BinaryTreeManager{

    private BinaryTree binaryTree;

    public void createBinaryTree(){
        binaryTree = new BinaryTreeImplementation(8);
    }

    public void addNodesToTree() {
        binaryTree.addElements (new int[]{3,11,6,9,1});
    }

    public void addNodeToTree(){
        binaryTree.addElement (9);
    }

    public void getLeftChild(){
        binaryTree.getLeftChild (9);
    }

    public void getRightChild(){ binaryTree.getRightChild (3);}

    public void getNumberOfElements(){binaryTree.getNumberOfElements ();}

    public void findElement(){binaryTree.findElement (1);}
}
