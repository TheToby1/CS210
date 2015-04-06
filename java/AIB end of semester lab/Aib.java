package AIB;

import AIB.FileIO;

public class Aib {
	
	public static void main(String args[]) {
        FileIO reader = new FileIO();
        String[] OrigRatings = reader.load("Ratings.csv");
        String[] OrigGuess = reader.load("Test.csv");
        for(int i =0;i<OrigGuess.length;i++){
        	System.out.println(OrigGuess[i]);
        }

        String commasep = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";
        int ratingRows = OrigRatings.length;
        int guessRows = OrigGuess.length;
        int ratingsColumns = OrigRatings[0].split(commasep).length;
        int guessColumns = 2;
        int filmRows = 1683;
        
        
        //save 2d
        String[][] ratings = new String[ratingRows][ratingsColumns];
        String[][] guess = new String[guessRows][guessColumns];

        for(int i = 0; i < ratingRows; i++) {
        		String[] tokens = OrigRatings[i].split(",");
                for(int j = 0; j < ratingsColumns ; j++) {
                	ratings[i][j] = tokens[j];
                }
        }
        for(int i = 0; i < guessRows; i++) {
        	String[] tokens = OrigGuess[i].split("\\s");
            for(int j = 0; j < guessColumns; j++) {
                    guess[i][j] = tokens[j];
            }
        }

        //average the ratings per film
        int[][] sorter = new int[filmRows][2]; // sum, size(amount of ratings)

        int x = 0;
        int count =0;
        while(count<ratingRows){
                x = Integer.parseInt(ratings[count][1]) - 1;
                String[] tok = ratings[count][2].split("[\\r\\n]+");
                sorter[x][0] += Integer.parseInt(tok[0]);
                sorter[x][1]++;
                count++;
        }
        
        for(int i=0;i<filmRows;i++){
        	if(sorter[i][1]>0) sorter[i][0]=(sorter[i][0]/sorter[i][1]);
        	System.out.println(i+1 + " ");
        	System.out.println(sorter[i][0]);
        }
        
        //Match films to be guessed with average
        
        String[] answers = new String[guessRows];
        for(int i = 0;i<guessRows;i++){
        	answers[i] = (sorter[Integer.parseInt(guess[i][1])][0] + "");
        }

        


       try {
                reader.save("answers.txt", answers);
                System.out.println("SAVED");
        } catch(Exception e) {
                System.out.println(e.getClass());
        }
        
	}

}
