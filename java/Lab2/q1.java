package Lab2;

import java.util.Scanner;

public class q1 {
	
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many eggs do you have?");
		int n1 = scan.nextInt();
		
		int n2 = n1/144;
		n1 = n1%144;
		int n3 = n1/12;
		n1 = n1%12;
		System.out.println(n2 +" gross, " + n3 + " dozen and " + n1 + " single eggs.");
		
		
	}

}
