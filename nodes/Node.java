package nodes;

import dataobjects.MockObject;

public class Node<T>{
    public Node<T> next;
    public MockObject<T> object;

    public Node(){
        next = null;
        object = null;
    }

    public Node(T o,Integer k){
        next = null;
        object = new MockObject<T>(o,k);
    }

    public void editNode(){
        
    }
}