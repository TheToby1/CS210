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
Attempt at doing it recursively, not very good*/
public class recursivelab4 {
	final static long startTime = System.currentTimeMillis();
	private static int count = 0;
	
	public static void main(String args[]){
		int highest = 0;
		long answer = 0;
	
		for(long i = 1; i<10000001L; i++){
			count = 0;
			dothemaths(i);
			
			if(highest<count){
				highest=count;
				answer=i;
			}
		}
		System.out.println(answer + " sequence contains " + highest + " numbers.");
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
	}
	
	public static int dothemaths(long a){
		count++;
		if(a==1){
			return (1);
		}
		else if(a%2==0){
			a = dothemaths(a/2);
		}
		else if(a%2==1){
			a = dothemaths((a*3)+1);
		}
		return count;
	}
}