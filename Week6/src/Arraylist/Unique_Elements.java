package Arraylist;
import java.util.*;

public class Unique_Elements {
	public static void main(String[] args) {
		 ArrayList<Integer> lis = new ArrayList<Integer>();
		 lis.add(1);
		 lis.add(2);
		 lis.add(1);
		 lis.add(2);
		 lis.add(1);
		 
		 ArrayList<Integer> Uniquelis = new ArrayList<Integer>();
		 
		 for (Integer x : lis) {
			 if (!Uniquelis.contains(x)) {
				 Uniquelis.add(x);
				 
			 }
		 }
		 
		 System.out.println("Original list is "+lis);
		 System.out.println("List without duplicates is "+Uniquelis);
		 
		
	}

}