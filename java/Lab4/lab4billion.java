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
Second version to complete part 4, also completes 1,2 and 3.
Saves 10 longest sequences up to given number i*/
public class lab4billion {
	final static long startTime = System.currentTimeMillis();
	public static void main(String args[]){
		int count=0;
		long startnum=0,answer=0;
		long[][] highest = new long[10][2];
		
		for(int i=0;i<10;i++){
			highest[i][0] = 0;
			highest[i][1] = 0;
		}
		
		for(long i = 10000000000L; i>2; i--){
			startnum=i;
			count = 1;
			answer = startnum;
			
			while(startnum>1){
				if((startnum & 1) == 0){
					startnum=startnum>>1;
				}
				else{
					startnum = (3*startnum+1)>>1;
					count++;
				}
				count++;
			}
			
			for(int x = 0;x<10;x++){
				if(highest[x][1]<count){
					for(int j =9; j >x;j--){
						highest[j][1]=highest[j-1][1];
						highest[j][0]=highest[j-1][0];
					}
					highest[x][1]=count;
					highest[x][0]=answer;
					x=10;
				}
			}
		}
		
		for(int i = 0;i<10;i++){
			System.out.println((i+1) + " " + highest[i][0] + " has " + highest[i][1]);
		}
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
	}
}