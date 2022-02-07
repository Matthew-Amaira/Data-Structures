package nonlinearstructures;

import linearstructures.MyQueue;
import nodes.BinaryNode;

public class MyBinaryTree<T> {
    public BinaryNode<T> root;
    public int totalNodes;

    public MyBinaryTree(){
        root = null;
        totalNodes = 0;
    }

    public void postorderTraversal(BinaryNode<T> parent){
        if(parent != null){
            postorderTraversal(parent.left);
            postorderTraversal(parent.right);
            System.out.println(parent.object.toString());
        }
    }

    public void preorderTraversal(BinaryNode<T> parent){
        if(parent != null){
            System.out.println(parent.object.toString());
            preorderTraversal(parent.left);
            preorderTraversal(parent.right);
        }
    }

    public void inorderTraversal(BinaryNode<T> parent){
        if(parent != null){
            inorderTraversal(parent.left);
            System.out.println(parent.object.toString());
            inorderTraversal(parent.right);
        }
    }


    public void insert(T newObj){
        BinaryNode<T> newNode = new BinaryNode<T>(newObj,totalNodes);
        if(root == null){
            root = newNode;
        }else{
            MyQueue<BinaryNode<T>> queue = new MyQueue<BinaryNode<T>>();
            queue.enqueue(root);
            while(queue.size > 0){
                BinaryNode<T> pointer = queue.front.object.getObject();
                queue.dequeue();

                if(pointer.left == null){
                    pointer.left = newNode;
                    break;
                }else if(pointer.right == null){
                    pointer.right = newNode;
                    break;
                }else{
                    queue.enqueue(pointer.left);
                    queue.enqueue(pointer.right);
                }
            }
        }
        totalNodes++;
    }
}