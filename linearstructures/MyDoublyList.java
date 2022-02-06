package linearstructures;

import linearnodes.Node;

public class MyDoublyList<T> extends MyLinkedList<T> {
    public static final int FORWARD  =  1;
    public static final int BACKWARD = -1;

    //Properties
    public Node<T> last;

    //Constructors
    public MyDoublyList(){
        super();
        last = null;
    }

    //Operations
    public void append(T newObj){

        Node<T> newNode = new Node<T>(newObj,length);
        if(head == null){
            head = newNode;
            last = head;
        }else{
            Node<T> temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            temp.next.prev = temp;
            last = temp.next;
        }
        length++;
    }

    public void traverseFromHead(){
        Node<T> pointer = head;
        while(pointer != null){
            System.out.println(pointer.object.toString());
            pointer = pointer.next;
        }
    }

    public void traverseFromEnd(){
        Node<T> pointer = last;
        while(pointer != null){
            System.out.println(pointer.object.toString());
            pointer = pointer.prev;
        }
    }

    public void traverse(Node<T> start, int direction){
        Node<T> pointer = start;
        while(pointer != null){
            System.out.println(pointer.object.toString());
            pointer = direction > 0? pointer.next:pointer.prev;
        }
    }



    /* public Node<T> getEndNode(){
    *     Node<T> pointer = head;
    *     while(pointer.next != null){
    *         pointer = pointer.next;
    *     }
    *     return pointer;
    *  }
    */
}
