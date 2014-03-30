import java.io.*;
import java.util.*;

public class Sorts{

    public static String name(){
        return "Zilbersher,Alex";
    }

    public static int partition(int[]L,int left,int right){
	Random r = new Random();
	int pindex = left + r.nextInt(right-left+1);
	int p = L[pindex];
	L[pindex] = L[right];
	L[right] = p;
	int repeat = 0;
	for(int i=left;i<right;i++){
	    if(L[i]<p){
		int t = L[left];
		L[left] = L[i];
		L[i] = t;
		left++;
	    }else if(L[i]==p){
		repeat++;
	    }
	}
	for(int j=left;j<right;j++){
	    if(L[j]==p){
		int t = L[left];
		L[left] = L[j];
		L[j] = t;
		left++;
	    }
	}
	int t = L[left];
	L[left] = L[right];
	L[right] = t;
	return left-(repeat/2);
    }

    public static int quickselect(int[]A, int k){
	if(k<1||k>A.length){
	    return A[k-1];
	}
	return quickselect(A,k-1,0,A.length-1);
    }

    public static int quickselect(int[]A,int k,int left,int right){
	int pindex = partition(A,left,right);
	if(k == pindex){
	    return A[pindex];
	}
	if(k < pindex){
	    return quickselect(A,k,left,pindex-1);
	} else {
	    return quickselect(A,k,pindex+1,right);
	}
    }
    
    public static void quicksort(int[]A){
	quicksort(A,0,A.length-1);
    }

    public static void quicksort(int[]A,int left,int right){
	if(right-left<1){
	    return;
	}
	int pindex = partition(A,left,right);
	quicksort(A,left,pindex-1);
	quicksort(A,pindex+1,right);
	
    }
	

    // public static void printArray(int[] output){
    // 	String stringout = "";
    // 	for(int j=0;j<output.length;j++){
    // 	    stringout += output[j] + " ";
    // 	}
    // 	System.out.println(stringout);
    // }

    // public static void randArray(int[] A, int param){
    // 	Random r = new Random();
    // 	for(int i=0;i<A.length;i++){
    // 	    A[i]=r.nextInt(param);
    // 	}
    // }

    // public static void main(String[]args){

    // 	int[] test = {1,9,7,4,3,5,-1};
    // 	int[] test2 = new int[100];

    // 	//QSORT TEST 1
    // 	quicksort(test);
    // 	printArray(test);

    // 	//QSORT TEST 2
    // 	randArray(test2,10);
    // 	printArray(test2);
    // 	quicksort(test2);
    // 	printArray(test2);
    // }
}