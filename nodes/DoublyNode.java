package nodes;

import dataobjects.MockObject;

public class DoublyNode<T> extends Node<T>{
    public DoublyNode<T> prev;
    public DoublyNode<T> next;
    public MockObject<T> object;

    public DoublyNode(T o,Integer k){
        prev = null;
        next = null;
        object = new MockObject<T>(o,k);
    }
}