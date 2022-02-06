package linearstructures;

public class MyCircularQueue<T> extends MyQueue<T>{
    public int capacity;

    public MyCircularQueue(int length) {
        super();
        capacity = length;
    }

    public void enqueue(T newObj){
        if(!isFull()){
            super.enqueue(newObj);
            if(size == capacity){
                rear.next = front;
            }
        }
    }
    
    public boolean isFull(){
        return size == capacity;
    }
}
