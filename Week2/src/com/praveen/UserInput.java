package com.praveen;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your 1st integer");
		int a = scanner.nextInt();
		System.out.println("enter your 2nd integer");
		int b = scanner.nextInt();
		int product = a*b;
		System.out.println(product);
	}

}
