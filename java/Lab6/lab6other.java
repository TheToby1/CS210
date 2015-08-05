/*Given a number n find that prime. eg n = 5 prime is 11 because 5th prime is 11
Precomputes a seive up to a certain number limited by available memory
look up time is then O(n) could be optimised if primes were put in seperate array*/
import java.util.Scanner;

public class lab6other {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int prime, length = 715653102;
		long starttime;
		byte[] nums = new byte[length];
		
		starttime = System.currentTimeMillis();
		
		for(int i = 3;i<length;i++){
			nums[i]=1;
		}
		for(int i = 3;i<=length>>14;i=i+2){
			if(nums[i]==1){	
				for(int j = i+i;j<length;j=j+i){
					nums[j]=0;
				}
			}
		}
		System.out.println("Total execution time: " + (System.currentTimeMillis() - starttime) + "ms" );
		
		while(true){
			System.out.println("Please enter prime to find:");
			prime = scan.nextInt();
			starttime = System.currentTimeMillis();
			if (prime > 37020970) System.out.println("This prime is out of range");
			else if (prime == 1)System.out.println("The prime is 2");
			else{
				prime--;
				for(int i = 3;prime>0;i=i+2){
					if(nums[i]==1){
						prime--;
						if(prime==0)System.out.println("The prime is " + i);
					}
				}
			}
			
			System.out.println("Total execution time: " + (System.currentTimeMillis() - starttime) + "ms" );
			System.out.println("Press any number to continue or 1 to quit.");
			if(scan.nextInt()==1) break;
		}
		scan.close();
	}
}