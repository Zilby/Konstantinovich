import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){
	MyLinkedTree Tree = new MyLinkedTree();

	System.out.println(Tree.toString());
	Tree.insert(35);
	System.out.println(Tree.toString());
	Tree.insert(56);
	Tree.insert(23);
	System.out.println(Tree.toString());
	Tree.insert(69);
	System.out.println(Tree.toString());
	Tree.insert(51);
	System.out.println(Tree.toString());
	Tree.insert(18);
	System.out.println(Tree.toString());
	Tree.insert(42);
	System.out.println(Tree.toString());
	Tree.insert(87);
	System.out.println(Tree.toString());
	Tree.remove(34);
	System.out.println(Tree.toString());
	Tree.remove(87);
	System.out.println(Tree.toString());
	Tree.insert(87);
	System.out.println(Tree.toString());
	Tree.remove(23);
	System.out.println(Tree.toString());
	Tree.remove(56);
	System.out.println(Tree.toString());

    }
}