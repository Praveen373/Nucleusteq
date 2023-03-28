package com.praveen.loops;
import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num= scanner.nextInt();
		int reversed_num=0;
		while (num!=0){
			int digit =num%10;
			reversed_num=reversed_num*10+digit;
			num=num/10;
			
		}
		System.out.println("reversed number is "+reversed_num);
		
		
		
	}

}
