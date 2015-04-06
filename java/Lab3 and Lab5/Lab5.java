package Lab3;
import java.util.Scanner;
public class Lab5 {
	
	public static void main(String args[]){
		
		byte x = 0;
		int dicen = 6, times = 1000000;
		double sum = 0, count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int n = scan.nextInt();
		
		int dicea = dicen*n;
		
		final long startTime = System.currentTimeMillis();
		
		dice[] d = new dice[dicea];
		int[] total = new int[dicen];

		for(int j = 0;j<dicea;j++){
			d[j] = new dice();
		}
		
		for(int i = 0;i<=times;i++){
			count = 0;
			x = 0;
			while(x<1){
				count++;
				for(int j = 0;j<dicea;j++){
					d[j].roll();
					total[d[j].getValue()-1]++;
				}

				if(n==total[0]&&n==total[1]&&n==total[2]&&n==total[3]&&n==total[4]&&n==total[5]){
					x = 1;
				}	
			
				for (int k = 0;k<dicen;k++){
					total[k]=0;
				}
			
			}
			sum = count + sum;
		}
		System.out.println(sum/times);
		scan.close();
		
		System.out.println("Total execution time: " + (System.currentTimeMillis() - startTime) );
		
	}

}