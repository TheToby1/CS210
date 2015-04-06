package Lab3;

public class method1{
	
	final static long startTime = System.currentTimeMillis();
	
	public static void main(String args[]){
		
		dice[] d = new dice[5];
		int[] total = new int[31];
		int add = 0;

		for(int j = 0;j<5;j++){
			d[j] = new dice();
		}
		
		for(int i = 0;i<=1000000;i++){
			for(int j = 0;j<5;j++){
				d[j].roll();
				add = add + d[j].getValue();
			}
			
			total[add]++;
			add=0;
			
			
		}
		
		for(int i = 0; i<31;i++){
			System.out.println(total[i]);
			
		}
		
		System.out.println("Total execution time: " + (System.currentTimeMillis() - startTime) );
	}

}
