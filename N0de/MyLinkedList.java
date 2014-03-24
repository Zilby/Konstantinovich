import java.io.*;
import java.util.*;

public class MyLinkedList<T>{
    
    private Node<T> head;
    private Node<T> tail;
    private int L = 0;
    
    public MyLinkedList(){
	head=new Node<T>();
	tail=head;
    }

    public void add(T s){
	Node<T> temp = new Node<T>(s);
	tail.setNext(temp);
	tail=temp;
	L++;
    }
	

    public void add(T s,int i){
	if(i==L){
	    add(s);
	} else {
	    Node<T> temp = new Node<T>(s);
	    if(i==0){
		if(L!=0){
		    temp.setNext(head.getNext());
		}	
		head.setNext(temp);
	    }else{
		Node<T> current = getNode(i-1);
		temp.setNext(current.getNext());
		current.setNext(temp);
	    }
	    L++;
	}
    }

    public void remove(int i)throws IndexOutOfBoundsException{
	if(i<0||i>L-1){
	    throw new IndexOutOfBoundsException("Index " + (i) + " is out of bounds");
	}
	if(i==0){
	    head.setNext(getNode(i+1));
	}else if(i==L-1){
	    tail=getNode(i-1);
	    tail.setNext(null);
	}else{
	getNode(i-1).setNext(getNode(i+1));
	}
	L--;
    }

    public Node<T> getNode(int position) throws IndexOutOfBoundsException{
	Node<T> temp = new Node<T>();
	if(position<0||position>L-1){
	    throw new IndexOutOfBoundsException("Index " + (position) + " is out of bounds");
	}
	temp.setNext(head.getNext());
	while(position>0){
	    if(temp.getNext()==null){
		throw new IndexOutOfBoundsException("Index " + (position) + " is out of bounds");
	    }else{
		temp.setNext(temp.getNext().getNext());
	    }
	    position--;
	}
	return temp.getNext();
    }

    public T get(int position) throws IndexOutOfBoundsException{
	if(position<0||position>L-1){
	    throw new IndexOutOfBoundsException("Index " + (position) + " is out of bounds");
	}
	return getNode(position).getData();
    }
    

    public void set(int position,T newT) throws IndexOutOfBoundsException{
	if(position<0||position>L-1){
	    throw new IndexOutOfBoundsException("Index " + (position) + " is out of bounds");
	}
    	getNode(position).setData(newT);
    }

    public int find(T s){
	Node<T> temp = new Node<T>();
	int current = 0;
	temp.setNext(head.getNext());
	while(temp.getNext()!=null){
	    if(temp.getNext().getData().equals(s)){
		return current;
	    }
	    temp.setNext(temp.getNext().getNext());
	    current++;
	}
	return -1;
    }

    public int length(){
	return L;
    }

    public int size(){
	return L;
    }

    public String toString(){
	String s="[";
	Node current=getNode(0);
	while(current!=null){
	    if(current.getNext()!=null){
		s+=current.getData()+",";
	    }else{
		s+=current.getData();
	    }
	    current=current.getNext();
	}
	return s+"]";
    }
}