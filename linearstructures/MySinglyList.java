package linearstructures;

import linearnodes.Node;

public class MySinglyList<T> extends MyLinkedList<T>{
    
    //Operations
    public void traverse(){
        Node<T> pointer = head;
        while(pointer != null){
            System.out.println(pointer.object.toString());
            pointer = pointer.next;
        }
    }
}
