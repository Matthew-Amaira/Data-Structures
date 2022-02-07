package nodes;

import dataobjects.MockObject;

public class BinaryNode<T> {
    public BinaryNode<T> left;
    public BinaryNode<T> right;
    public MockObject<T> object;

    public BinaryNode(T o,Integer k){
        left = null;
        right = null;
        object = new MockObject<T>(o,k);
    }
}
