package week3;
import java.util.*;

public class RupeesToDollars_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the rupees to conver into dollars");
		double rupees= s.nextDouble();
		double dollars= rupees*82;
		System.out.printf(dollars+"$");
	}

}
