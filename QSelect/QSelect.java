import java.io.*;
import java.util.*;

public class QSelect{

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

    public static void randArray(int[] A, int param){
	Random r = new Random();
	for(int i=0;i<A.length;i++){
	    A[i]=r.nextInt(param);
	}
    }

    public static void main(String[]args){

	int[] test = {1,9,7,4,3,5,-1};
	int[] test2 = new int[100];
	//QSELECT TESTS
	// System.out.println(quickSelect(test,1));
	// System.out.println(quickSelect(test,2));
	// System.out.println(quickSelect(test,3));
	// System.out.println(quickSelect(test,4));
	// System.out.println(quickSelect(test,5));
	// System.out.println(quickSelect(test,6));
	// System.out.println(quickSelect(test,7));
	
	//QSORT TEST 1
	quickSort(test);
	printArray(test);

	//QSORT TEST 2
	randArray(test2,10);
	printArray(test2);
	quickSort(test2);
	printArray(test2);

	//OLD PARTITION TESTS
	// System.out.println("\n"+partition(test2,0,test2.length-1));
	// printArray(test2);
	// System.out.println(partition(test2,5,test2.length-7));
	// printArray(test2);
	// System.out.println(partition(test2,3,test2.length-11));
	// printArray(test2);
    }
}

//PREVIOUS VERSIONS

    // public static int partition(int[]L,int left,int right){
    // 	if(left != right){
    // 	    Random r = new Random();
    // 	    int p = left + r.nextInt(right-left+1);
    // 	    int[] temp = new int[L.length];
    // 	    int boundsL = left;
    // 	    int boundsR = right;
    // 	    for(int i=boundsL;i<=boundsR;i++){
    // 		if(L[i]>L[p]){
    // 		    temp[right]=L[i];
    // 		    right--;
    // 		} else if(i != p) {
    // 		    temp[left]=L[i];
    // 		    left++;
    // 		} 
    // 		if(i == boundsR){
    // 		    temp[left]=L[p];
    // 		}
    // 	    }
    // 	    for(int j=boundsL;j<=boundsR;j++){
    // 		L[j]=temp[j];
    // 	    }
    // 	    return left;
    // 	} else {
    // 	    return left;
    // 	}
    // }


// public static void quickSort(int[]A,int left,int right){
//     if(right-left>1){
// 	int pindex = partition(A,left,right);
// 	quickSort(A,left,pindex-1);
// 	quickSort(A,pindex+1,right);
//     } else {
// 	if (right>left){
// 	    int pindex = partition(A,left,right);
// 	}
//     }
// }