import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	recursion a = new recursion();
	System.out.print("hail(5): ");
	a.hail(5);
	System.out.print("hail(6): ");
	a.hail(6);
	System.out.print("hail(7): ");
	a.hail(7);
	System.out.print("hailLen(5): " + a.hailLen(5) + "\n");
	System.out.print("hailLen(6): " + a.hailLen(6) + "\n");
	System.out.print("hailLen(7): " + a.hailLen(7) + "\n");
	System.out.print("longestHail(1): " + a.longestHail(1) + "\n");
	System.out.print("longestHail(2): " + a.longestHail(2) + "\n");
	System.out.print("longestHail(3): " + a.longestHail(3) + "\n");
	System.out.print("longestHail(4): " + a.longestHail(4) + "\n");
	System.out.print("longestHail(5): " + a.longestHail(5) + "\n");
	System.out.print("longestHail(6): " + a.longestHail(6) + "\n");
	System.out.print("longestHail(7): " + a.longestHail(7) + "\n");
	System.out.println("fibIter(7): " + a.fibItr(7));
	System.out.println("\n" + "\n");
	System.out.println(a.fibItr(5));
        System.out.println(a.hailLen(5));
        System.out.println(a.longestHail(5));
    }
}