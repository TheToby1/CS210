/*The goal of the lab is to sort the movies by ratings, using one of the sorting algorithms
above, and save a file which includes one column for movie name and another
column for its average rating, with the best film at the top and the worst film at the
bottom.
This is th FileIO written by our lecturer*/
import java.io.*;

public class FileIO{

  public String[] load(String file) {
    File aFile = new File(file);     
    StringBuffer contents = new StringBuffer();
    BufferedReader input = null;
    try {
      input = new BufferedReader( new FileReader(aFile) );
      String line = null; 
      int i = 0;
      while (( line = input.readLine()) != null){
        contents.append(line);
        i++;
        contents.append(System.getProperty("line.separator"));
      }
    }
    catch (FileNotFoundException ex) {
      System.out.println("Can't find the file - are you sure the file is in this location: "+file);
      ex.printStackTrace();
    }
    catch (IOException ex){
      System.out.println("Input output exception while processing file");
      ex.printStackTrace();
    }
    finally {
      try {
        if (input!= null) {
          input.close();
        }
      }
      catch (IOException ex) {
        System.out.println("Input output exception while processing file");
        ex.printStackTrace();
      }
    }
    String[] array = contents.toString().split("\n");
    for(String s: array){
        s.trim();
    }
    return array;
  }


  public void save(String file, String[] array) throws FileNotFoundException, IOException {

    File aFile = new File(file); 
    Writer output = null;
    try {
      output = new BufferedWriter( new FileWriter(aFile) );
      for(int i=0;i<array.length;i++){
        output.write( array[i] );
        output.write(System.getProperty("line.separator"));
      }
    }
    finally {
      if (output != null) output.close();
    }
  }
}