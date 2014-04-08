import java.io.*;
import java.util.*;

public class Postfix{

    private class AStack<T>{
	private ArrayList<T> A;

	public AStack(){
	    A = new ArrayList<T>();
	}

	public boolean empty(){
	    return A.size()==0;
	}

	public T peek() throws EmptyStackException{
	    if (empty()){
		throw new EmptyStackException();
	    }
	    return A.get(A.size()-1); //A.get(0);
	}

	public T push(T item){
	    A.add(item); //A.add(item,0);
	    return item;
	}

	public T pop(){
	    T temp = peek();
	    A.remove(A.size()-1); //A.remove(0);
	    return temp;
	}

	public int search(T item){
	    int index = 1;
	    for(int i=0;i<A.size();i++){
		if(A.get(i).equals(item)){
		    return index;
		}
		index ++;
	    }
	    return -1;
	}

	public String toString(){
	    String output = "[";
	    for(int i=A.size()-1;i>=0;i--){
		output = output+A.get(i).toString()+" ";
	    }
	    return output + "]";
	}
    }

    private AStack<Double> a;
    public static Scanner sc;    
    private boolean continU;

    public Postfix(){
	a = new AStack<Double>();
	sc = new Scanner(System.in);
	continU = true;
    }

    public boolean go(){
	return continU;
    }

    public void quit(){
	continU = false;
    }

    public double push(double d){
	return a.push(d);
    }

    public double pop(){
	return a.pop();
    }

    public double peek(){
	return a.peek();
    }

    public static void main (String[] args){
	Postfix p = new Postfix();
	System.out.println("D3V1C3 4CT1V4T3D...");
	while(p.go()){
	    System.out.println("C4LCUZ1LB: PL34S3 1NPUT + - * / quit OR 4 DOUBL3");
	    String input = sc.nextLine();
	    if(input.equals("+")){
		try{ 
		    p.push(p.pop()+p.pop());
		    System.out.println(p.peek());
		} catch (EmptyStackException empty) {
		    System.out.println("Needs two values");
		}
	    }else if(input.equals("-")){
		try{ 
		    p.push((-1.0*p.pop())+p.pop());
		    System.out.println(p.peek());
		} catch (EmptyStackException empty) {
		    System.out.println("Needs two values");
		}
	    }else if(input.equals("*")){
		try{ 
		    p.push(p.pop()*p.pop());
		    System.out.println(p.peek());
		} catch (EmptyStackException empty) {
		    System.out.println("Needs two values");
		}
	    }else if(input.equals("/")){
		try{ 
		    if(p.peek()==0.0){
			System.out.println("Divided by zero: undefined");
		    }else{
			p.push((1/p.pop())*p.pop());
			System.out.println(p.peek());
		    }
		} catch (EmptyStackException empty) {
		    System.out.println("Needs two values");
		}//  catch (ArithmeticException zero) {
		//     System.out.println("Divided by zero: undefined");
		// }
	    }else if(input.equals("quit")){
		p.quit();
	    }else{
		try{
		    double d = Double.parseDouble(input);
		    p.push(d);
		} catch(NumberFormatException nfe){
		    System.out.println("needs double input or operand");
		}
	    }
	}
    }
}