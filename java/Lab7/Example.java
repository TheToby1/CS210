package lab7;

public class Example{

    public static void main(String args[]){
        
        FileIO reader = new FileIO();

        String[] inputs = reader.load("movies.csv");   //Reading the File as a String array
        
        for(int i=0;i<inputs.length;i++){
            System.out.println(inputs[i]);
        }
        
        try{
            reader.save("somefile.csv",inputs);
        }catch (Exception e){
            System.out.println(e.getClass());
        }

    }
}