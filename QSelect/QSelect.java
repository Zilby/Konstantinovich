import java.io.*;
import java.util.*;

public class QSelect{

    // public int quickselect(int[]L,int k){
    // 	return quickselect(L,k,0,L.length-1);
    // }

    // public int quickselect(int[]L,int k,int left,int right){
    // }

    public static int partition(int[]L,int left,int right){
	Random r = new Random();
	int p = r.nextInt(right);
	System.out.println(p);
	int[] temp = new int[right+1];
	for(int i=0;i<L.length;i++){
	    if(L[i]>L[p]){
		temp[right]=L[i];
		right--;
	    } else if(i != p) {
		temp[left]=L[i];
		left++;
	    } 
	    if(i == L.length-1){
		temp[left]=L[p];
	    }
	}
	L = temp;
	printArray(L);
	return L[p];
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

	System.out.println(partition(test,0,test.length-1));
    }
}