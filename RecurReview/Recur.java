import java.io.*;
import java.util.*;

public class Recur {

    //static so it works with the Driver
    public static long fact(long i){
	if(i==0){
	    return 1;
	} 
	return i*fact(i-1);
    }

    public static int fib(int i){
	if(i==0){
	    return 0;
	} 
	if (i==1){
	    return 1;
	}
	return fib(i-1) + fib(i-2);
    }

    //iterator review*****
    //fib: 0,1,1,2,3,5,8,13,21
    //fib(0)=0, fib(1)=1, fib(4)=3
 
    //need to know two values a and b
    public static int fibHelp(int a, int b, int n){
	if(n==0){ //once it gets to bottom
	    return a+b; //final case covered
	}else{
	    return fibHelp(b,a+b,n-1); //else make a = b (which is a+b)
	                            //and b = a+b again
	}
    }

    public static int fibIter(int n){
	//same as regular fib
	if(n<2){
	    return n;
	}
	//returns helper function that recurs
	return fibHelp(0,1,n-2); //n-2 because first and last cases are covered
    }
    

    public static void main(String[] args) {
	System.out.println("fact(5): " + fact(5));
	System.out.println("fib(7): " + fib(7));
	System.out.println("fibIter(7): " + fibIter(7));
    }

}
	    