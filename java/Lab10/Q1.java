package lab10;
import java.util.*;

public class Q1 {
	public static String[] list;
	public static int count = 0;
	
	public static void main(String args[]){
			Scanner scan = new Scanner(System.in);
			int length = 0;
			while(length<=0){
				System.out.println("Please enter the number of strings.");
				length = scan.nextInt();
				list = new String[length];
				for(int i=0;i<length;i++){
					System.out.println("Please enter the next string.");
					list[i]=scan.next();
				}
			}
			
			System.out.println("The concatenated string is: " + concat(list[0]));
			
			scan.close();
			
			System.out.println(1-(birthday(22)));
	}
	
	public static String concat(String st){
		count++;
		if(count>list.length-1){
			return list[list.length-1];
		}
		else{
			return st + concat(list[count]);
		}
	}
	
	public static double birthday(double people){
		if(people == 1 ) return 1;
		else return ((366-people)/365) * birthday(people-1);
	}

}