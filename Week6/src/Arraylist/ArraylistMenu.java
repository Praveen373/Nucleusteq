package Arraylist;
import java.util.*;

public class ArraylistMenu {
public static void main(String[] args) {
		
		ArrayList<String> List = new ArrayList<>();
		Scanner s = new Scanner(System.in);

		
		System.out.println("Enter the option");
		System.out.println("Menu");
		System.out.println("1.Add an element");
		System.out.println("2.Remove an element");
		System.out.println("3.Display the list");
		System.out.println("4.Exit");
		
		
		while(true) {
			
			System.out.println("enter option");
			int option = s.nextInt();
			
			switch (option){
				
				case 1:
					System.out.println("Enter the item to add");
					String add = s.next();
					List.add(add);
					break;
				case 2:
					System.out.println("Enter the item to remove");
					String remove =  s.next();
					List.remove(remove);
					break;
				case 3:
					System.out.println("List is "+List);
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("invalid");
						
			}
		}
	}

}
