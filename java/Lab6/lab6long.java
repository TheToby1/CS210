/*Given a number n find that prime. eg n = 5 prime is 11 because 5th prime is 11
Precomputes a seive up to a certain number limited by available memory
attempts to use a 2d array for faster look up, fails and horrible code*/
import java.util.Scanner;

public class lab7long {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int m, length = 20000;
		long prime, count=0, starttime;
		byte[][] nums = new byte[length>>1][length>>1];
		
		starttime = System.currentTimeMillis();
		
		for(int k =0;k<length>>1;k++){
			for(int i = 0;i<length>>1;i++){
				nums[i][k]=1;
			}
		}
		
		for(int k =0;k<length>>1;k++){
			for(int i = 0;i<length>>1;i++){
				if(k==0&&(i==0||i==1))i=2;
				if(nums[i][k]==1){
					m=0;
					for(int j = (i+((length>>1)*k))+(i+((length>>1)*k));m<length>>1;j=j+(i+((length>>1)*k))){
						while(j>=(length>>1)){
							j=(j-(length>>1));
							m++;
						}
						if(m>(length>>1)-1) break;
						nums[j][m]=0;
					}
				}
			}
		}
		System.out.println("Total execution time: " + (System.currentTimeMillis() - starttime) + "ms" );
		
		while(true){
			System.out.println("Please enter prime to find:");
			prime = scan.nextInt();
			count=0;
			starttime = System.currentTimeMillis();
			for(int k =0;k<length>>1;k++){
				for(int i = 0;i<length>>1;i++){
					count++;
					if(k==0&&(i==0||i==1)){
						i=2;
						count+=2;
					}
					
					if(nums[i][k]==1){
						prime--;
						if(prime==0){
							System.out.println("The prime is " + (count-1));
							i=length;
							k=length;
						}
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