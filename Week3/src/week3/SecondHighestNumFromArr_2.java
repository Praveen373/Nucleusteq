package week3;
import java.util.*;


public class SecondHighestNumFromArr_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] myarray = new int[10];
		for(int i=0;i<10;i++) {
			myarray[i] = s.nextInt();
		}
		int h;
		int sh;
		int a = myarray[0];
		int b = myarray[1];
		
		if(a>b) {
			h = a;
			sh = b;
		}
		else {
			h=b;
			sh=a;
		}
		for(int i=2; i<10;i++) {
			if(myarray[i]>h) {
				sh=h;
				h=myarray[i];
			}
			else if(myarray[i]<h&&myarray[i]>sh){
				sh=myarray[i];
			}
			else {
				{}
			}
			
		}
		System.out.println(Arrays.toString(myarray));
	    System.out.println("second highest number is "+sh);
		
		
	}	

}
