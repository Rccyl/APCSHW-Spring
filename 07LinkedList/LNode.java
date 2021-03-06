public class LNode<T>{
    
    private T data;
    private LNode<T> next;
    
    public LNode(T data){
	setData(data);
    }

    public T getData(){
	return data;
    }
    public LNode<T> getNext(){
	return next;
    }

    public void setData(T data){
	this.data=data;
    }
    public void setNext(LNode<T> next){
	this.next=next;
    }

}
