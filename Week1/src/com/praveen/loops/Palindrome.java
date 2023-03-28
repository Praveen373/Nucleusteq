package com.praveen.loops;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num= scanner.nextInt();
		int number=num;
		int reversed_num=0;
		while (num!=0){
			int digit =num%10;
			reversed_num=reversed_num*10+digit;
			num=num/10;
		}
		if (reversed_num == number) {
			System.out.println("given number is palindrome");
		}
			else {
				System.out.println("given number is not a palindrome");
			}
		
		
	}	

}
