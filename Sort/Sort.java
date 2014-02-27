import java.io.*;
import java.util.*;

public class Sort{

    public static int[] a = {1,1,2,4,5,5,7,8,9,9,9,11,11,13,14,14,15};
    public static int[] b = {2,3,3,5,5,5,7,7,8,12,15,17,17,18};

    public static int[] merge(int[] a, int[] b){
	int[] output = new int[(a.length)*(b.length)];
	int counter = 0;
	if(a.length>b.length){
	    int[]  = a;
	else
	    int[]c = b;
	for (int i = 0;i<c.length;i++){
	    if(a[i]>b[i]){
		output[counter] = a[i];
		output[counter+1] = b[i];
	    }else{
		output[counter] = b[i];
		output[counter+1] = a[i];
	    }
	    counter += 2;
	    System.out.println(counter);
	}
	return output;
    }

    public static void main(String[] args) {
	System.out.println(merge(a,b));
    }
}