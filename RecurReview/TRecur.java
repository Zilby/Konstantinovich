import java.io.*;
import java.util.*;

public class TRecur{

    public static String pArray(int[] i) {
	String output = "";
	for(int j = 0;j<i.length;j++){
	    output = output + i[j] + ", ";
	}
	return output;
    }

    public static void hail(int i) {
	if(i == 1){
	    System.out.print(i + "\n");
	}else if(i%2 == 0){
	    System.out.print(i + " ");
	    hail(i/2);
	}else{
	    System.out.print(i + " ");
	    hail((3*i)+1);
	}
    }
	    

    public static void main(String[] args) {
	hail(5);
	// System.out.println("fact(5): " + fact(5));
	// System.out.println("fib(7): " + fib(7));
	// System.out.println("fibIter(7): " + fibIter(7));
    }

}