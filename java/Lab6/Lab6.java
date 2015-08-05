/*Given a number n find that prime. eg n = 5 prime is 11 because 5th prime is 11
Basic seive not very fast*/
import java.util.Scanner;
import static java.lang.Math.*;

public class Lab6 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int prime, length;
		long starttime;
		
		while(true){
			System.out.println("Please enter prime to find:");
			prime = scan.nextInt();
			starttime = System.currentTimeMillis();
			switch(prime){
				case 1: System.out.println("The prime is 2");
						break;
				default:length = (int)(1.2*prime*(log(prime))+3);
						prime--;
						byte[] nums = new byte[length];
		
						for(int i = 3;i<length;i++){
							nums[i]=1;
						}
		
						for(int i = 3;prime>0;i=i+2){
							if(nums[i]==1){
								prime--;
								if(prime==0){
									System.out.println("The prime is " + i);
									i=length;
								}
								
								for(int j = i;j<length;j=j+i){
									nums[j]=0;
								}
							}
						}
						break;
			}
			System.out.println("Total execution time: " + (System.currentTimeMillis() - starttime) + "ms" );
			System.out.println("Press any number to continue or 1 to quit.");
			if(scan.nextInt()==1) break;
		}
		scan.close();
	}
}