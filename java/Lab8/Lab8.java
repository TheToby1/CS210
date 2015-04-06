package lab8;

import java.util.*;

public class Lab8 {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter word to reverse:");
		String word = scan.nextLine();
		
		Stack stack1 = new Stack(word.length());
		
		for(int i = 0;i<word.length();i++){
			stack1.push(String.valueOf(word.charAt(i)));
		}
		
		String backwards = "";
		for(int i = 0;i<word.length();i++){
			backwards += stack1.pop();
		}
		System.out.println("Reversed: " + backwards);
		
		scan.close();
	}

}
