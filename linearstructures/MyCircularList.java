package linearstructures;

import linearnodes.Node;

public class MyCircularList<T> extends MyLinkedList<T>{
    public Node<T> tail;

    public MyCircularList(){
        super();
        tail = null;
    }

    public void append(T newObj){

        Node<T> newNode = new Node<T>(newObj,length);
        if(head == null)
            head = newNode;
        else{
            tail.next = newNode;
        }

        tail = newNode;
        tail.next = head;
        length++;
    }

    public void traverse(){
        if(tail != null){
            Node<T> pointer = tail.next; //points to first Node
            do{
                System.out.println(pointer.object.toString());
                pointer = pointer.next;
            }while(pointer != tail.next);
        }
    }

    public void traverse(Node<T> start){
        if(tail != null){ //If list is not empty
            Node<T> pointer = start; //points to starting Node
            do{
                System.out.println(pointer.object.toString());
                pointer = pointer.next;
            }while(pointer != start);
        }
    }

    // public AnyClass search(String key){
    //    //n returns pointer to object with matching key
    //    //or null if not found
    //    if(last == null){
    //        return null;
    //    }else{
    //        Node temp = last.next;
    //        do{
    //         if(key.equals(temp.obj.getKey()))
    //             return temp.obj;
    //             temp = temp.next;
    //        }while(temp != last);
    //    } return null; // no obj with matching key found
    // }

    // public void deleteNode(String key){
    //     //deletes node with matching key
    //     boolean found = false;
    //     if(last != null){
    //         Node temp = last.next;
    //         Node prev = last;
    //         do{
    //             if(key.equals(temp.obj.getKey()))
    //                 break;
    //             temp=temp.next;
    //             prev=prev.next;
    //         }while(temp!=last);

    //         if(last.next == temp){
    //             last = temp.next;
    //         }else if(temp == last){
    //             prev.next = last.next;
    //             last = prev;
    //         }else{
    //             prev.next = temp.next;
    //         }
    //     }
    // }
}