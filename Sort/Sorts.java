import java.io.*;
import java.util.*;

public class Sorts{
    
    public static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b){
	ArrayList<String> output = new ArrayList<String>();
	for(int i=0;i<a.size()+b.size();i++){
	    output.add("0");
	}
	int aCount = 0, bCount = 0;
	for(int i=0;i<output.size();i++){
	    if(aCount == a.size()){
		output.set(i,b.get(bCount));
		bCount++;
	    } else if(bCount == b.size()){
		output.set(i,a.get(aCount));
		aCount++;
	    } else {
		if(a.get(aCount).compareTo(b.get(bCount))<0){
		    output.set(i,a.get(aCount));
		    aCount++;
		}else{
		    output.set(i,b.get(bCount));
		    bCount++;
		}
	    }
	}
	return output;
    }

    public static void copy(ArrayList<String> source, ArrayList<String> dest, int start){
	for(int i=0;i<dest.size();i++){
	    dest.set(i,source.get(start));
	    start++;
	}
    }
    
    //use .compartTo() in order to compare, order in greatness
    public static void msort(ArrayList<String> a){ 
	if(a.size() > 1){
	    ArrayList<String> ans = new ArrayList<String>();
	    for(int i=0;i<a.size();i++){
		ans.add(a.get(i));
	    }
	    ArrayList<String> L1 = new ArrayList<String>();
	    for(int i=0;i<a.size()/2;i++){
		L1.add(a.subList(0,a.size()/2).get(i));
	    }
	    ArrayList<String> L2 = new ArrayList<String>();
	    for(int i=0;i<a.size()-L1.size();i++){
		L2.add(a.subList(L1.size(),a.size()).get(i));
	    }
	    //copy(a, L1, 0);
	    //copy(a, L2, (a.size()/2));
	    msort(L1);
	    msort(L2);
	    ans = merge(L1, L2);
	    copy(ans, a, 0);
	}
    }

    public static String name(){
        return "Zilbersher,Alex";
    }

    public static void printArray(ArrayList<String> output){
	String stringout = "";
	for(int j=0;j<output.size();j++){
	    stringout += output.get(j) + " ";
	}
	System.out.println(stringout);
    }
}