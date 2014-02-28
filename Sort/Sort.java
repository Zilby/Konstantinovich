import java.io.*;
import java.util.*;

public class Sort{

    public static int[] testa = {1,1,2,4,5,5,7,8,9,9,9,11,11,13,14,14,15};
    public static int[] testb = {2,3,3,5,5,5,7,7,8,12,15,17,17,18};

    public static int[] merge(int[] a, int[] b){
	int[] output = new int[(a.length)+(b.length)];
	int aCount = 0;
	int bCount = 0;
	for(int i=0;i<output.length;i++){
	    if(aCount == a.length){
		output[i]=b[bCount];
		bCount++;
	    } else if(bCount == b.length){
		output[i]=a[aCount];
		aCount++;
	    } else {
		if(a[aCount]<b[bCount]){
		    output[i]=a[aCount];
		    aCount++;
		}else{
		    output[i]=b[bCount];
		    bCount++;
		}
	    }
	}
	return output;
    }

    public static void printArray(int[] output){
	String stringout = "";
	for(int j=0;j<output.length;j++){
	    stringout += output[j] + " ";
	}
	System.out.println(stringout);
    }

    public static void main(String[] args) {
	printArray(merge(testa,testb));
    }
}