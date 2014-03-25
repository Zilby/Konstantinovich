import java.io.*;
import java.util.*;

public class MyLLIterator<T> implements Iterator<T>{
    
    public Node<T> start;

    public MyLLIterator(Node<T> start){
	this.start = start; 
    }

    public boolean hasNext(){
	// if(start.getNext()==null){
	//     return false;
	// }else{
	//     return true;
	// }
	return start.getNext()!=null;
    }

    public T next() throws NoSuchElementException{
	if(!hasNext()){
	    throw new NoSuchElementException("no more elements in list");    
	}
	start = start.getNext();
	return start.getData();
    }

    public void remove() throws UnsupportedOperationException{
	//implement
	throw new UnsupportedOperationException("remove method is not supported for this iterator");
    }

}