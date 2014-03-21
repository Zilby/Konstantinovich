import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){
	MyLinkedList<String> LL = new MyLinkedList<String>();
	// Node l = new Node("alpha");
	// Node m = new Node("bravo");
	// Node n = new Node("charlie");
	// Node o = new Node("delta");
	// Node p = new Node("echo");

	LL.add("alpha",0);
	System.out.println(LL.toString());
	LL.add("bravo",0);
	System.out.println(LL.toString());
	LL.add("charlie",1);
	System.out.println(LL.toString());
	LL.remove(2);	
	System.out.println(LL.toString());
	LL.add("delta",2);
	System.out.println(LL.toString());
	System.out.println("get(1): "+LL.get(2)+"\nfind(delta): "+LL.find("delta")+"\nlength(): "+LL.length());
	LL.set(1,"echo");
	System.out.println(LL.toString());
	LL.add("alpha",3);
	System.out.println(LL.toString());
	LL.add("charlie",3);
	System.out.println(LL.toString());
	LL.remove(0);
	System.out.println(LL.toString());
	LL.remove(3);
	System.out.println(LL.toString());
    }
}