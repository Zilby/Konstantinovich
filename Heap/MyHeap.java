import java.io.*;
import java.util.*;

public class MyHeap{
    
    /*HEAPSORT STEPS
    1) heapify (needs push up)(y)
    2) put in order (needs push down)*/

    public static void heapSort(int[] a){
	int L=a.length;
	for(int i=1;i<L;i++){
	    pushUp(a,i);
	}
	for(int j=L-1;j>=0;j--){
	    int temp = a[0];
	    a[0]=a[j];
	    a[j]=temp;
	    pushDown(a,0,j);
	}
    }

    public static void pushUp(int[] a,int i){
	int parent = (i-1)/2;
	if(a[parent]<a[i]){
	    int temp = a[parent];
	    a[parent] = a[i];
	    a[i] = temp;
	    pushUp(a,parent);
	}
    }

    public static void pushDown(int[] a,int i,int len){
	int c1 = (2*i)+1;
	int c2 = c1+1;
	int c3 = 0;
	if(c1<len){
	    c3=c1;
	    if(c2<len){
		if(a[c1]<a[c2])
		    c3=c2;	
	    }
	    if(a[c3]>a[i]){
		int temp = a[c3];
		a[c3] = a[i];
		a[i] = temp;
		pushDown(a,c3,len);
	    }
	}
    }

    public static String aString(int[] a){
	String output = "[";
	for(int i=0;i<a.length;i++){
	    if(i!=0)
		output+=", ";
	    output+=a[i];
	}
	return output+"]";
    }

    public static void main(String[] args){
        int[] a = {4,3,7,2,67,9,15};
	heapSort(a);
	System.out.println(aString(a));
	int[] b = {6,2,-5,-8,0,5,-4,2,5,5,2};
	heapSort(b);
	System.out.println(aString(b));
	int[] c = {234,634,31,564,978,123,567};
	heapSort(c);
	System.out.println(aString(c));
    }
}