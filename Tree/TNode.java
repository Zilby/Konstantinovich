import java.io.*;
import java.util.*;

public class TNode{

    private int data;
    private TNode right,left;
    
    public TNode(){ //special case with constructor, no <T>
    }
    
    public TNode(int data){
this.data=data;
right = null;
left = null;
    }

    public TNode getRight(){
return right;
    }

    public TNode getLeft(){
return left;
    }

    public int getData(){
return data;
    }

    public void setRight(TNode next){
right=next;
    }

    public void setLeft(TNode next){
left=next;
    }

    public void setData(int data){
this.data=data;
    }

    public String toString(){
return ""+data;
    }
}