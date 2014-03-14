import java.io.*;
import java.util.*;

public class QSelect{

    public static int partition(int[]L,int left,int right){
	if(left != right){
	    Random r = new Random();
	    int p = left + r.nextInt(right-left+1);
	    int[] temp = new int[L.length];
	    int boundsL = left;
	    int boundsR = right;
	    for(int i=boundsL;i<=boundsR;i++){
		if(L[i]>L[p]){
		    temp[right]=L[i];
		    right--;
		} else if(i != p) {
		    temp[left]=L[i];
		    left++;
		} 
		if(i == boundsR){
		    temp[left]=L[p];
		}
	    }
	    for(int j=boundsL;j<=boundsR;j++){
		L[j]=temp[j];
	    }
	    return left;
	} else {
	    return left;
	}
    }

    public static int partition2(int[]L,int left,int right){
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
	    } else if(L[i]==p){
		repeat++;
	    }
	}
	int t = L[left];
	L[left] = L[right];
	L[right] = t;
	
    }

    public static int quickSelect(int[]A, int k){
	if(k<1||k>A.length){
	    return A[k-1];
	}
	return quickSelect(A,k-1,0,A.length-1);
    }

    public static int quickSelect(int[]A,int k,int left,int right){
	int pindex = partition(A,left,right);
	if(k == pindex){
	    return A[pindex];
	}
	if(k < pindex){
	    return quickSelect(A,k,left,pindex-1);
	} else {
	    return quickSelect(A,k,pindex+1,right);
	}
    }
    
    public static void quickSort(int[]A){
	quickSort(A,0,A.length-1);
    }

    public static void quickSort(int[]A,int left,int right){
	//less efficient

	// if(right-left>1){
	//     int pindex = partition(A,left,right);
	//     quickSort(A,left,pindex-1);
	//     quickSort(A,pindex+1,right);
	// } else {
	//     if (right>left){
	// 	int pindex = partition(A,left,right);
	//     }
	// }
	
	if(right-left<1){
	    return;
	}
	int pindex = partition(A,left,right);
	quickSort(A,left,pindex-1);
	quickSort(A,pindex+1,right);
	
    }
	

    public static void printArray(int[] output){
	String stringout = "";
	for(int j=0;j<output.length;j++){
	    stringout += output[j] + " ";
	}
	System.out.println(stringout);
    }

    public static void main(String[]args){

	int[] test = {1,9,7,4,3,5,-1};
	
	// System.out.println(quickSelect(test,1));
	// System.out.println(quickSelect(test,2));
	// System.out.println(quickSelect(test,3));
	// System.out.println(quickSelect(test,4));
	// System.out.println(quickSelect(test,5));
	// System.out.println(quickSelect(test,6));
	// System.out.println(quickSelect(test,7));
	quickSort(test);
	printArray(test);
    }
}