import java.io.*;
import java.util.*;

public class MyLinkedTree{
    
    private TNode head;
    private TNode temp;
    
    public MyLinkedTree(){
    }

    public TNode find(int target){
	if(temp==null){
	    temp=head;
	    return null;
	}
	if(target>temp.getData()){
	    temp=temp.getRight();
	    return find(target);
	}else if(target<temp.getData()){
	    temp=temp.getLeft();
	    return find(target);
	}
	TNode t = temp;
	temp = head;
	return t;
    }

    public void insert(int i){
	if(head==null){
	    head = new TNode(i);
	    temp = head;
	}else{
	    TNode t = new TNode(i);
	    if(temp.getData()<i){
		if(temp.getRight()==null){
		    temp.setRight(t);
		    temp=head;
		}else{
		    temp=temp.getRight();
		    insert(i);
		}
	    }else{
		if(temp.getLeft()==null){
		    temp.setLeft(t);
		    temp=head;
		}else{
		    temp=temp.getLeft();
		    insert(i);
		}
	    }
	}
    }

    public boolean remove(int target){
	//replace with largest element of smaller side 
	//(unless leaf, then just remove)
	//if only one child, then just skip that node in the tree
	TNode t = find(target);
	if(t==null){
	    return false;
	}
	boolean R,L;
	R=L=false;
	if(t.getLeft()!=null){
	    L=true;
	}
	if(t.getRight()!=null){
	    R=true;
	}
	TNode n = findP(target);
	if(!L&&!R){
	    if(target==n.getRight().getData()){
		n.setRight(null);
	    }else{
		n.setLeft(null);
	    }
	}
	else if((L&&!R)||(!L&&R)){
	    if(L){
		n.setLeft(t.getLeft());
	    }else{
		n.setRight(t.getRight());
	    }
	}else{
	    TNode r = t.getLeft();
	    boolean notFirst = false;
	    while(r.getRight()!=null){
		r=r.getRight();
		notFirst = true;
	    }
	    TNode l = findP(r.getData());
	    if(notFirst){
		l.setRight(null);
	    }
	    r.setRight(t.getRight());
	    if(n.getRight().equals(t)){
		n.setRight(r);
	    }else{ 
		n.setLeft(r);
	    }
	}
	return true;
    }
    
    public TNode findP(int target){
	TNode t = temp;
	if(target==temp.getRight().getData()||target==temp.getLeft().getData()){
	    t = temp;
	    temp=head;
	    return t;
	}else if(target>temp.getData()){
	    temp=temp.getRight();
	    return findP(target);
	}else{
	    temp=temp.getLeft();
	    return findP(target);
	}
    }
	

    public String toString(){
	if(head==null){
	    return "empty";
	}
	return toStringHelper(head);
    }

    public String toStringHelper(TNode t){
	String output = "";
	boolean R,L;
	R=L=false;
	if(t.getLeft()!=null){
	    output+=t.getLeft().getData()+"<";
	    L=true;
	}
	output+=t.getData();
	if(t.getRight()!=null){
	    output+=">"+t.getRight().getData();
	    R=true;
	}
	output+="\n";
	if(L&&R){
	    return output+toStringHelper(t.getLeft())+toStringHelper(t.getRight());
	}else if(L){
	    return output+toStringHelper(t.getLeft());
	}else if(R){
	    return output+toStringHelper(t.getRight());
	}else{
	    return "";
	}
    }
}