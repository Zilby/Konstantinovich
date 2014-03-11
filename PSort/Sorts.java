public class Sorts{

    public static <T extends Comparable<T>> void msort(ArrayList<T> L){
	if(L.size()<2)return;
	ArrayList<T> Left,Right;
	Left=new ArrayList<T>(L.size()/2);
	Right=new ArrayList<T>((L.size()+1)/2);
	split(L,Left,Right);

	msort(Left);
	msort(Right);
	
	merge(Left,Right);
    }        
    private static <T extends Comparable<T>> void merge(ArrayList<T>L,ArrayList<T>Left,ArrayList<T>Right){
	while(left//add here)
	      )
	    }
}