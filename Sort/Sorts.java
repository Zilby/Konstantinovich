import java.io.*;
import java.util.*;

public class Sorts{

    public static String[] test = {"potato","wubjub","humuna","wiki","jujube","gawd","jojo","fuacate"};
    
     public static void copy(String[] source, String[] dest, int start){
	for(int i=0;i<dest.length;i++){
	    dest[i] = source[start];
	    start++;
	}
    }
    
    //use .compartTo() in order to compare, order in greatness
    public static void msort(ArrayList<String> L){ 
    }

    public static String name(){
        return "Zilbersher,Alex";
    }
}