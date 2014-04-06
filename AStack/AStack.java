import java.io.*;
import java.util.*;

public class AStack<T>{
    private ArrayList<T> A;

    public AStack(){
	A = new ArrayList<T>();
    }

    public boolean empty(){
	return A.size()==0;
    }

    public T peek() throws EmptyStackException{
	if (empty()){
	    throw new EmptyStackException();
	}
	return A.get(A.size()-1); //A.get(0);
    }

    public T push(T item){
	A.add(item); //A.add(item,0);
	return item;
    }

    public T pop(){
	T temp = peek();
	A.remove(A.size()-1); //A.remove(0);
	return temp;
    }

    public int search(T item){
	int index = 1;
	for(int i=0;i<A.size();i++){
	    if(A.get(i).equals(item)){
		return index;
	    }
	    index ++;
	}
	return -1;
    }

    public String toString(){
	String output = "[";
	for(int i=0;i<A.size();i++){
	    output = output+A.get(i).toString()+" ";
	}
	return output + "]";
    }

    public static void main (String[] args){
	
	AStack<String> a = new AStack<String>();
	System.out.println(a);
	a.push("alpha");	
	System.out.println(a);
	a.push("bravo");
	a.push("charlie");
	a.push("delta");
	System.out.println(a);
	a.pop();
	System.out.println(a);
	System.out.println("a.search(bravo): "+a.search("bravo"));
	System.out.println("a.peek(): "+a.peek());

    }
}
	