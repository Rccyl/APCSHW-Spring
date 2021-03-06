public class BSTreeNode<T extends Comparable>{
    
    private T data;
    private BSTreeNode[] children=new BSTreeNode[2];
    //  private int count;

    public BSTreeNode(T data){
	this.data=data;
	//	counter=1;
    }
    public T getData(){
	return data;
    }
    public int hasChildren(){
	return children.length;
    }    
    public BSTreeNode<T> getFirst(){
	return children[0];
    }
    public BSTreeNode<T> getSecond(){
	return children[1];
    }
    public void setData(T data){
	this.data=data;
    }
    public void setFirst(BSTreeNode<T> child){
	children[0]=child;
    }
    public void setSecond(BSTreeNode<T> child){
	children[1]=child;
    }
    public String toString(){
	String result="";
	result+=data;
	return result;
    }
    /* public int getCount(){
	return counter;
    }
    public void incCount(){
	count++;
    }
    */
}
