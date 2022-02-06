package dataobjects;

public class MockObject<T>{
    private final Integer key;
    private T mockObject;

    public MockObject(T t, Integer k){
        key = k;
        setObject(t);
    }
   
    public void setObject(T t){
        mockObject = t;
    }

    public Integer getKey(){
        return key;
    }

    public T getObject(){
        return mockObject;
    }

    public String toString(){
        if(key < 10){
            return "Key: 0"+key+". Value: "+mockObject;
        }else{
            return "Key: "+key+". Value: "+mockObject;
        }
    } 
}