package Lab3;

public class Lab5manytimes {
	
	final static long startTime = System.currentTimeMillis();
	
	public static void main(String args[]){
		
		byte x = 0;
		int n = 1, dicen = 6, times = 10000, dicea = dicen*n;
		double sum = 0, count = 0;
		int[] total = new int[dicen];
		dice d = new dice();
		
		
		while(n<11){
			
			dicea = dicen*n;
			sum = 0;
		
			for(int i = 0;i<=times;i++){
				count = 0;
				x = 0;
				while(x<1){
					count++;
					for(int j = 0;j<dicea;j++){
						if(total[0]<=n&&total[1]<=n&&total[2]<=n&&total[3]<=n&&total[4]<=n&&total[5]<=n){
							d.roll();
							total[d.getValue()-1]++;
						}
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
			n++;
			
			System.out.println("Total execution time: " + (System.currentTimeMillis() - startTime) );
			
		}
	}

}
