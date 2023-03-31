package Sets;

import java.util.*;

public class UniqueElementsSets {
	public static void main(String[] args) {
		Integer[] lis= {1,2,3,1,2,3,3,3,3,3};
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(lis));

		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(lis));
		
		System.out.println("Arraylist is :"+list);
		System.out.println("Set is :"+set);
	
	}

}
