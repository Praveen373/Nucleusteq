package week3;
import java.util.*;

public class SimpleAndCompoundInterest_1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the principle amount");
		double principle=s.nextDouble();
		System.out.println("enter the interst rate");
		double IR = s.nextDouble();
		System.out.print("enter the tenure\n");
		double tenure = s.nextDouble();
		
		double SimpleInterest= (principle*IR*tenure)/100;
		System.out.println("simpleInterst is "+SimpleInterest);
		
		double CompoundInterest = principle*(Math.pow((1+IR),tenure)) - principle;
		System.out.println("compoundInterest is "+ CompoundInterest);
		
	}

}
