package linearstructures;

import linearnodes.Node;

public class MyStack<T> {
    public Node<T> top;
    public int size;

    public MyStack(){
        top = null;
    }

    public void push(T newObj){
        Node<T> newNode = new Node<T>(newObj,size);
        if(top == null){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;   
        }
        size++;
        
        /* try{
        *  System.out.print("TOP: "+top.object.toString());
        *  System.out.println("\t TOP.NEXT: "+top.next.object.toString());
        *  }catch(Exception e){
        *      System.out.println();
        *  } 
        */
    }

    public Node<T> pop(){
        if(size > 0){
            Node<T> popped = top;  
            top = top.next;
            size--;
            return popped;
        }
        return null;
    }

    public Node<T> peek(){
        return top;
    }
}