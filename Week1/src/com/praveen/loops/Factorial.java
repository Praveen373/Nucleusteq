package com.praveen.loops;
import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int result=1;
		for(int i=1; i<=num; i++) {
			result=result*i;
		}
		System.out.println("factorial of "+num+" is "+result);
	}

}
