/*The following iterative sequence is defined for the set of positive integers:
n → n/2 (n is even)
n → 3n + 1 (n is odd)
Using this rule and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
The sequence contains 10 terms before it ends on a 1, which ends the sequence.
1) Find a starting number whose sequence does not finish at 1
2) Prove that there is no such starting number
3) Find the starting number under 10 million with the longest sequence
4) The first person to email me the starting number under 10 billion with the
10th longest sequence will earn an extra 1% CA
First version takes in and fins the sequence*/
import java.util.Scanner;
public class lab4 {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		long startnum;
		int test=0,count=1;
		
		System.out.println("Please input a starting number.");
		startnum = scan.nextLong();
		
		do{
			if(startnum==1){
				test++;
			}
			else if(startnum%2==0){
				startnum=startnum/2;
				count++;
				System.out.println(startnum);
			}
			else if(startnum%2==1){
				startnum = (3*(startnum))+1;
				count++;
				System.out.println(startnum);
			}
			
			
		}while(test==0);
		System.out.println("Sequence contains " + count + " numbers.");
		
		scan.close();
	}
	

}
