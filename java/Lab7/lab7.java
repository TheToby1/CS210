/*The goal of the lab is to sort the movies by ratings, using one of the sorting algorithms
above, and save a file which includes one column for movie name and another
column for its average rating, with the best film at the top and the worst film at the
bottom.*/
import java.util.*;

public class lab7 {
	
	public static void main(String args[]){
		
		FileIO read = new FileIO();
		
		String[] movies = read.load("movies.csv");
		String[] ratings = read.load("ratings.csv");
		int[][] answerint = new int[movies.length][2];
		int[][] ratingsort = new int[ratings.length][3];
		
		
		for(int i = 0;i<ratings.length;i++){
			String[] splitter = ratings[i].split("\\s*,\\s*");
			splitter[2] = splitter[2].trim();
			ratingsort[i][0] = Integer.parseInt(splitter[0]);
			ratingsort[i][1] = Integer.parseInt(splitter[1]);
			ratingsort[i][2] = Integer.parseInt(splitter[2]);
		}

		int count = 0, average = 0;
		
		for(int i =0;i<answerint.length;i++){
			answerint[i][0] = i+1;
			answerint[i][1] = 0;
		}
		
		for(int i = 0;i<answerint.length;i++){
			count = 0;
			average = 0;
			for(int j = 0;j<ratingsort.length;j++){
				if(ratingsort[j][1]==i+1){
					count++;
					average = average + ratingsort[j][2];
				}
					
			}
			
			if(count>10){
				average = average/count;
				answerint[i][1] = average;
			}
		}
		
		Arrays.sort(answerint, new Comparator<int[]>() {
	        @Override
	        public int compare(int[] int1, int[] int2)
	        {
	            Integer number1 = int1[1];
	            Integer number2 = int2[1];
	            return number1.compareTo(number2);
	        }
	    });

		int split = 0;
		for(int i =0;i<answerint.length;i++){
			if(answerint[i][1]>0){
				split=i;
				i=answerint.length;
			}
		}
		
		String[] answer = new String[(answerint.length)-split];
		int i =answerint.length-1;
		int j = 0;
		
		while(answerint[i][1]>0){
			String[] splitter = movies[answerint[i][0]].split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
			answer[j] = (answerint[i][0]+1 + ", " + splitter[1] + ", " + answerint[i][1]);
			System.out.println(answer[j]);
			i--;
			j++;
		}
	
		try{
	           read.save("answer1.csv",answer);
	       }catch (Exception e){
	           System.out.println(e.getClass());
	       }
	}
}
