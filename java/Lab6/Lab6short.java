package lab6;

import java.util.Scanner;

public class Lab6short {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number to go to:");
		int length = scan.nextInt();
		long starttime = System.currentTimeMillis();
		
		byte[] nums = new byte[length];
		
		for(int i = 0;i<length;i++){
			nums[i]=1;
		}
		
		System.out.println("2");
		for(int i = 3;i<length;i=i+2){
			if(nums[i]==1){
				System.out.println(i);
				for(int j = i;j<length;j+=i){
					nums[j]=0;
				}
			}
		}
		System.out.println("Total execution time: " + (System.currentTimeMillis() - starttime) + "ms" );
		scan.close();
	}

}
