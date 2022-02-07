package linearstructures;

import nodes.DoublyNode;

public class MyDoublyList<T> extends MyLinkedList<T> {
    public static final int FORWARD  =  1;
    public static final int BACKWARD = -1;

    //Properties
    public DoublyNode<T> head;
    public DoublyNode<T> last;

    //Constructors
    public MyDoublyList(){
        head = null;
        last = null;
        length = 0;
    }

    //Operations
    public void append(T newObj){

        DoublyNode<T> newNode = new DoublyNode<T>(newObj,length);
        if(head == null){
            head = newNode;
            last = head;
        }else{
            DoublyNode<T> temp = (DoublyNode<T>)head;
            while(temp.next != null){
                temp = (DoublyNode<T>)temp.next;
            }
            temp.next = newNode;
            temp.next.prev = temp;
            last = temp.next;
        }
        length++;
    }

    public void traverseFromHead(){
        DoublyNode<T> pointer = head;
        while(pointer != null){
            System.out.println(pointer.object.toString());
            pointer = pointer.next;
        }
    }

    public void traverseFromEnd(){
        DoublyNode<T> pointer = last;
        while(pointer != null){
            System.out.println(pointer.object.toString());
            pointer = pointer.prev;
        }
    }

    public void traverse(DoublyNode<T> start, int direction){
        DoublyNode<T> pointer = start;
        while(pointer != null){
            System.out.println(pointer.object.toString());
            pointer = direction > 0? pointer.next:pointer.prev;
        }
    }



    /* public DoublyNode<T> getEndNode(){
    *     DoublyNode<T> pointer = head;
    *     while(pointer.next != null){
    *         pointer = pointer.next;
    *     }
    *     return pointer;
    *  }
    */
}
