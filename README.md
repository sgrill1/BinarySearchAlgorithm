# Binary Search Algorithm
My fourth Java project, writing a binary search algorithm.

## Project Aims 
To continue with my introduction to working with Java and sorting algorithms. This was an mvc style project using the maven quick-start archtype. This was the fourth preliminary project to the Sort Manager project that can be found on at https://github.com/sgrill1/SortManager.  

## How It Works
The Binary Tree Algorithm uses a "divide and conquer" design to order a collection of numbers. It compares values of the nodes that are added to the tree, against a *root node*. If the new node is greater than the root, it reads down the RHS of the tree. If the new node is less than the root then it reads down the LHS. If there are existing nodes, it compares against each node splitting left or right until there are no nodes below it. At this point the new node is added to the tree. 

Once all nodes have been added the algorithm locates minimum value node and reads back up the tree. In this project I have implemented an interface with all the methods neccessary to construct the binary tree and return a binary tree in ascending order.
