package linearstructures;

import linearnodes.Node;

public class MyQueue<T>{
    public Node<T> front;
    public Node<T> rear;
    
    protected int size;

    //Constructor
    public MyQueue(){
        front = null;
        rear = null;
    }

    //Operations
    public void enqueue(T newObj){
        Node<T> newNode = new Node<T>(newObj,size);
            if(isEmpty()){
                rear  = newNode;
                front = rear;
            }else{
                rear.next = newNode;
                rear = rear.next;
            }
            size++;
    }

    public Node<T> dequeue(){
        if(!isEmpty()){
            Node<T> served = front;

            if(size > 1)
            front = front.next;
            else //if(size == 1)
            front = null;

            size--;
            return served;
        }
        return null; //Queue is empty
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
