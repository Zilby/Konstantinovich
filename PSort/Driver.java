import java.util.*;
public class Driver{
    public static void main(String[]args){
	ArrayList<Person> L= new ArrayList<Person>();
	L.add(new Person("Ben"));
	L.add(new Person("Dave"));
	L.add(new Person("Amy"));
	L.add(new Person("Liz"));
	L.add(new Person("Portnoy"));
	L.add(new Person("Wolf"));
	L.add(new Person("Zed"));
	L.add(new Person("Xin"));
	L.add(new Person("Smith"));
	L.add(new Person("Will"));
	L.add(new Person("Ed"));
	L.add(new Person("Eddie"));
	L.add(new Person("Aaron"));
	L.add(new Person("Cary"));
	Sorts.msort(L);
	System.out.println(L);
    }
}