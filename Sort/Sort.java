import java.io.*;
import java.util.*;

public class Sort{

    public static int[] testa = {1,1,2,4,5,5,7,8,9,9,9,11,11,13,14,14,15};
    public static int[] testb = {2,3,3,5,5,5,7,7,8,12,15,17,17,18};
    public static int[] testc = {5,4,478,2,3,5,82,35,8,34,7,34,1,2,3};

    public static int[] merge(int[] a, int[] b){
	int[] output = new int[(a.length)+(b.length)];
	int aCount = 0, bCount = 0;
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

    // public static int[] mergeK(int[]a,int[]b){
    // 	int[]res = new int[a.length+b.length];
    // 	int ia=0,ib=0; //index a
    // 	while(ia<a.length || ib<b.length){
    // 	    if(ia<a.length && (ib>=b.length || a[ia]<b[ib])){
    // 		res[ia+ib]= a[ia];
    // 		ia++;
    // 	    }else{
    // 		res[ia+ib]= b[ib];
    // 		ib++;
    // 	    }
    // 	}
    // 	return res;
    // }

    public static void copy(int[] source, int[] dest, int start){
	for(int i=0;i<dest.length;i++){
	    dest[i] = source[start];
	    start++;
	}
    }

    // public static void copyK(int[]source,int sstart, int[]dest, int dstart, int count){
    // 	for(int i=0;i<count;i++){
    // 	    dest[dstart+i]=source[sstart+i];
    // 	}
    // } //this doesn't make assumptions about inputs

    public static void msort(int[] a){
	if(a.length > 1){
	    int[] ans = new int[a.length];
	    int[] L1 = new int[a.length/2];
	    int[] L2 = new int[a.length-L1.length];
	    copy(a, L1, 0);
	    copy(a, L2, (a.length/2));
	    msort(L1);
	    msort(L2);
	    ans = merge(L1, L2);
	    copy(ans, a, 0);
	}
    }
    
    // public static void msortK(int[ary]){
    // 	//exit when size == 1
    // 	if(ary.length<2)return;
    // 	//make an array to store each half
    // 	int[]halfL,halfR;
    // 	halfL=new int[ary.length/2];
    // 	halfR=new int[(ary.length+1)/2];
    // 	//copy the two halves to smaller arrays
    // 	copy(ary,0           ,halfL,0,halfL.length);
    // 	copy(ary,halfL.length,halfR,0,halfR.length);
    // 	//sort the two halves
    // 	msortK(halfL);
    // 	msortK(halfR);
    // 	//merge the two halves
    // 	int[]res = mergeK(halfL,halfR);
    // 	//copy res of merging to ary
    // 	copy(res,0,ary,0,ary.length);
    // }

    public static void printArray(int[] output){
	String stringout = "";
	for(int j=0;j<output.length;j++){
	    stringout += output[j] + " ";
	}
	System.out.println(stringout);
    }

    public static void main(String[] args) {
	printArray(merge(testa,testb));
	msort(testc);
	printArray(testc);
    }
}