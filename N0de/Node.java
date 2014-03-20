import java.io.*;
import java.util.*;

public class Node{

    private String data;
    private Node next;
    private Node head;
    
    public Node(String data){
	this.data=data;
	if(head==null){
	    head.setNext(this);
	}
    }

    public Node getNext(){
	return next;
    }

    public Node getHead(){
	return head;
    }

    public String getData(){
	return data;
    }

    public void setNext(Node next){
	this.next=next;
    }

    public void setHead(Node head){
	this.head=head;
    }

    public void setData(String data){
	this.data=data;
    }

    public String toString(){
	return "Data: " + data;
    }
}