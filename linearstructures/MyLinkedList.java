package linearstructures;
import nodes.Node;

public class MyLinkedList<T> {
    public Node<T> head;
    public int length;
    
    //Constructors
    public MyLinkedList(){
        head = null;
        length = 0;
    }

    //Operations
    public void append(T newObj){

        Node<T> newNode = new Node<T>(newObj,length);
        if(head == null)
            head = newNode;
        else{
            Node<T> pointer = head;
            while(pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = newNode;
        }
        length++;
    }

    public Node<T> search(String key){
        //searches for a node with matching key
        Node<T> temp = head;
        while(temp != null){
            if(key.equals(temp.object.getKey().toString()))
                return temp;
            temp=temp.next;
        }
        return null;
    }
}
