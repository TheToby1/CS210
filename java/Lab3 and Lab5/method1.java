/*Lab3 Create an array of Dice objects with space for 5 Dice. Fill the
array with 5 new Dice objects.
The idea is to roll the 5 dice and see what totals you get.
Create a loop which runs a million times (i.e. a Monte Carlo simulation).
After the loop has run a million times print out all of the results. Graph the results
in excel in a bar-chart and you should see a normal distribution centered on 17.5.*/
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