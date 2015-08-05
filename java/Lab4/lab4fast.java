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
Faster version for doing 1,2 and 3*/
public class lab4fast {
	final static long startTime = System.currentTimeMillis();
	
	public static void main(String args[]){
		int count=0,highest =0;
		long startnum=0,answer=0;
		
		for(long i = 5L; i >= 2; i--){
			startnum=i;
			count = 1;
			
			while(startnum>1){
				if((startnum & 1) == 0){
					startnum = startnum >> 1;
//					long tz = Long.numberOfTrailingZeros(startnum);
//					count+= tz;
//					startnum >>= tz;
				}
				else {
					startnum = (3*startnum+1) >> 1;
					count++;
				}
				count++;
			}
			
			if(highest<count){
				highest=count;
				answer=i;
			}
		}
		System.out.println(answer + " sequence contains " + highest + " numbers.");
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
	}
}