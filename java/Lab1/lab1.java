/*Write a program that figures out how many times you would have to fold a piece
of paper to reach the moon.*/
import java.util.Scanner;

public class lab1{
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double dist = 384400000;
		int count = 0;
		
		System.out.println("Please input the thickness of the paper in metres.");
		double n1 = scan.nextDouble();
		
		for(count = 0; n1<dist; count++){
			n1=n1*2;	
		}
		System.out.println("This piece of paper must be folded " + count + " times to reach the moon.");	
	}
}