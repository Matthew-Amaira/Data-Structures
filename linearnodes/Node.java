package linearnodes;

import dataobjects.MockObject;

public class Node<T>{
    public Node<T> prev;
    public Node<T> next;
    public MockObject<T> object;

    public Node(T o,Integer k){
        prev = null;
        next = null;
        object = new MockObject<T>(o,k);
    }

    public void editNode(){
        
    }
}