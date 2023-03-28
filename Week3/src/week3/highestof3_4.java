package week3;
import java.util.*;
public class highestof3_4 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=s.nextInt();
		System.out.println("Enter the number");
		int num2=s.nextInt();
		System.out.println("Enter the number");
		int num3=s.nextInt();
		
		if(num1>num2 && num1>num3) {

			System.out.printf("highest number is: %d\n", num1);
			
		}
		else if (num1<num2 && num2>num3) {
			System.out.printf("highest number is: %d\n", num2);
		}
		else {
			System.out.printf("highest number is: %d\n", num3);
		}
		
	}

}
