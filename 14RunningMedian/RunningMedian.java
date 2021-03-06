import java.util.*;
import java.util.NoSuchElementException;

public class RunningMedian{
    
    private MyHeap max;
    private MyHeap min;
    private int size;

    public RunningMedian(){
	max=new MyHeap();
	min=new MyHeap(false);
	size=0;
    }
    
    public double getMedian(){
	if(size==0){
	    throw new NoSuchElementException();
	}
	if(max.size()==min.size()){
	    return ((max.peek()+min.peek())/2);
	}
	if(max.size()>min.size()){
	    return max.peek();
	}
	return min.peek();
    }
    
    public void add(int val){
	if(max.size()==min.size()){
	    max.add(val);
	}else if(val>getMedian()){
	    min.add(val);
	}else{
	    min.add(max.remove());
		max.add(val);
	}
	size++;
    }

    public String toString(){
	return max.toString()+"\n"+min.toString();
    }

    public static void main(String[]args){
	RunningMedian f = new RunningMedian();
	Random r=new Random();
	for(int i=0;i<4;i++){
	    f.add(r.nextInt(9)+1);
	}
	System.out.println("Median: "+f.getMedian());
	System.out.println(f.toString());
    }
}