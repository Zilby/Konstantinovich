import java.io.*;
import java.util.*;

public class MyLinkedList{
    
    private Node head;
    
    public void MyLinkedList(){
	head=null;
    }

    public void add(String s){
	Node temp = new Node(s);
	temp.setNext(head);
	head=temp;
    }

    public void add(String s,int i) throws Exception{
	Node temp = new Node(s);
	if(i==0){
	    temp.setNext(head);
	    head=temp;
	}else{
	    Node current = getNode(i-1);
	    temp.setNext(current.getNext());
	    current.setNext(temp);
	}
    }

    //make it so   head or -1          0        1        2       }len = 3
    //                    [   ] -->  [   ] -->[   ] -->[   ]

    public Node getNode(int position) throws Exception{
	Node temp = new Node("");
	if(position<0){
	    throw new Exception("(-) index out of bounds");
	}
	temp.setNext(head);
	while(position>0){
	    if(temp.getNext()==null){
		throw new Exception("(+) index out of bounds");
	    }else{
		temp.setNext(temp.getNext().getNext());
	    }
	    position--;
	}
	return temp.getNext();
    }

    public String get(int position) throws Exception{
	return getNode(position).getData();
    }
    

    public void set(int position,String newString) throws Exception{
    	getNode(position).setData(newString);
    }

    public int find(String s){
	Node temp = new Node("");
	int current = 0;
	temp.setNext(head);
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
	return lengthHelper(head+1);
    }

    public int lengthHelper(Node n){
	if(n==null){
	    return 0;
	}else{
	    return 1+lengthHelper(n.getNext());
	}
    }

    public String toString(){
	String s="[";
	Node current=head;//getNode(0);
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

    public static void main(String[] args){
    }

}