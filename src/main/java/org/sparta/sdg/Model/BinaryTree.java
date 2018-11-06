package org.sparta.sdg.Model;

public interface BinaryTree {

        int getRootElement();

        int getNumberOfElements();

        void addElement(int element);

        void addElements(int[] elements);

        boolean findElement(int value);

        int getLeftChild(int element); //throws ChildNotFoundException;

        int getRightChild(int element);

        int[] getSortedTreeAsc();

        int[] getSortedTreeDesc();
    }


