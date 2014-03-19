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

    // public void add(String s,int position){
    // 	Node temp = new Node(s);
    // 	Node current = temp; 
    // 	current.setNext(head);
    // 	while(position>0){
    // 	    current.setNext(current.getNext().getNext());
    // 	}
    // 	//incomplete
    // }

    public String get(int position){
	Node temp = new Node("");
	temp.setNext(head);
	while(position>0){
	    temp.setNext(temp.getNext().getNext());
	    position--;
	}
	return temp.getNext().getData();
    }

    public void set(int position,String newString){
	Node temp = new Node("");
	temp.setNext(head);
	while(position>0){
	    temp.setNext(temp.getNext().getNext());
	    position--;
	}
	temp.getNext().setData(newString);
    }

    // public void remove(int position){
    // }

    public int find(String s){
	Node temp = new Node("");
	int current = 0;
	temp.setNext(head);
	while(temp.getNext!=null){
	    if(temp.getNext().getData().equals(s)){
		return current;
	    }
	    temp.setNext(temp.getNext().getNext());
	    current++;
	}
	return -1;
    }

    public static void main(String[] args){
    }

}