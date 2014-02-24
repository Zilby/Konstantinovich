import java.io.*;
import java.util.*;

public class recursion {

    public String lastName(){
	/*Alexander Zilbersher*/
	return "Zilbersher!!!!";
    }

    public String firstName(){
	/*Alexander Zilbersher*/
	return "Alexander!!!!";
    }

    public static void hail(int i){
	if(i==1){
	    System.out.print(i + "\n");
	}else if (i%2 == 0){
	    System.out.print(i + ", ");
	    hail(i/2);
	}else{
	    System.out.print(i + ", ");
	    hail((i*3)+1);
	}
    }

    public static int hailLen(int i){
	if(i==1){
	    return 1;
	}else if (i%2 == 0){
	    return 1 + hailLen(i/2);
	}else{
	    return 1 + hailLen((i*3)+1);
	}
    }
    
    public static int longestHail(int i){
	return longHelp(i,1);
    }

    public static int longHelp(int i, int j){
	if(i==1){
	    return j;
	} else if (hailLen(i)>hailLen(j)){
	    return longHelp(i-1, i);
	} else {
	    return longHelp(i-1, j);
	}
    }

    public static int fibItr(int n){
	if(n<2){
	    return n;
	}
	return fibHelp(0,1,n-2);
    }

    public static int fibHelp(int a, int b, int n){
	if(n==0){
	    return a+b;
	}else{
	    return fibHelp(b,a+b,n-1); 	                           
	}
    }

    public recursion(){
        /*leave alone*/
    }
}