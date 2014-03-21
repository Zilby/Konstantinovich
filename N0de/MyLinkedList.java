import java.io.*;
import java.util.*;

public class MyLinkedList{
    
    private Node head=new Node("head");
    private int L = 0;
    
    public void MyLinkedList(){
    }

    public void add(String s,int i){
	Node temp = new Node(s);
	if(i==0){
	    if(L!=0){
		temp.setNext(head.getNext());
	    }	
	    head.setNext(temp);
	}else{
	    Node current = getNode(i-1);
	    temp.setNext(current.getNext());
	    current.setNext(temp);
	}
	L++;
    }

    public void remove(int i)throws IndexOutOfBoundsException{
	if(i<0||i>L-1){
	    throw new IndexOutOfBoundsException("Index " + (i) + " is out of bounds");
	}
	if(i==0){
	    head.setNext(getNode(i+1));
	}else if(i==L-1){
	    getNode(i-1).setNext(null);
	}else{
	getNode(i-1).setNext(getNode(i+1));
	}
	L--;
    }

    //make it so   head or -1          0        1        2       }len = 3
    //                    [   ] -->  [   ] -->[   ] -->[   ]

    public Node getNode(int position) throws IndexOutOfBoundsException{
	Node temp = new Node("");
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

    public String get(int position) throws IndexOutOfBoundsException{
	if(position<0||position>L-1){
	    throw new IndexOutOfBoundsException("Index " + (position) + " is out of bounds");
	}
	return getNode(position).getData();
    }
    

    public void set(int position,String newString) throws IndexOutOfBoundsException{
	if(position<0||position>L-1){
	    throw new IndexOutOfBoundsException("Index " + (position) + " is out of bounds");
	}
    	getNode(position).setData(newString);
    }

    public int find(String s){
	Node temp = new Node("");
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