package com.praveen.operators;
import java.util.*;

public class RootsOfQuadEquation {
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the value of a: ");
		        double a = input.nextDouble();

		        System.out.print("Enter the value of b: ");
		        double b = input.nextDouble();

		        System.out.print("Enter the value of c: ");
		        double c = input.nextDouble();

		        double discriminant = b * b - 4 * a * c;

		        if (discriminant < 0) {
		            System.out.println("The equation has no real roots.");
		        } else if (discriminant == 0) {
		            double root = -b / (2 * a);
		            System.out.printf("The equation has one root: %.2f%n", root);
		        } else {
		            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
		            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
		            System.out.printf("The equation has two roots: %.2f and %.2f%n", root1, root2);
		        }
		    }
		

		
	}


