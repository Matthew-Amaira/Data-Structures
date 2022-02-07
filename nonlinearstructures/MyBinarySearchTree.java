package nonlinearstructures;

import nodes.BinaryNode;

public class MyBinarySearchTree<T extends Comparable<T>> extends MyBinaryTree<T> {
    //Constructor
    public MyBinarySearchTree(){
        super();
    }

    public void insert(T newObj){
        BinaryNode<T> newNode = new BinaryNode<T>(newObj,totalNodes);
        if(root == null){
            totalNodes++;
            root = newNode;
        }else{
            BinaryNode<T> pointer = root;
            while(pointer != null){
                if(newObj.compareTo(pointer.object.getObject()) < 0){
                    if(pointer.left == null){
                        totalNodes++;
                        pointer.left = newNode;
                        return;
                    }else{
                        pointer = pointer.left;
                    }
                    
                }else if(newObj.compareTo(pointer.object.getObject()) > 0){
                    if(pointer.right == null){
                        totalNodes++;
                        pointer.right = newNode;
                        return;
                    }else{
                        pointer = pointer.right;
                    }
                }else{
                    //Duplicate Object
                    return;
                }
            } 
        }
    }
}
