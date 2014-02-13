import java.io.*;
import java.util.*;

public class Hail {

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

    public static void main(String[] args) {
	System.out.print("hail(5): ");
	hail(5);
	System.out.print("hail(6): ");
	hail(6);
	System.out.print("hail(7): ");
	hail(7);
	System.out.print("hailLen(5): " + hailLen(5) + "\n");
	System.out.print("hailLen(6): " + hailLen(6) + "\n");
	System.out.print("hailLen(7): " + hailLen(7) + "\n");
	System.out.print("longestHail(1): " + longestHail(1) + "\n");
	System.out.print("longestHail(2): " + longestHail(2) + "\n");
	System.out.print("longestHail(3): " + longestHail(3) + "\n");
	System.out.print("longestHail(4): " + longestHail(4) + "\n");
	System.out.print("longestHail(5): " + longestHail(5) + "\n");
	System.out.print("longestHail(6): " + longestHail(6) + "\n");
	System.out.print("longestHail(7): " + longestHail(7) + "\n");
    }

}