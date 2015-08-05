/*This time the objective is to check whether the word is a palindrome or not. */
import java.util.Scanner;

public class Lab8q2 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter word to reverse:");
		String word = scan.nextLine();
		word = word.toLowerCase();
		
		Stack stack1 = new Stack(word.length());
		
		for(int i = 0;i<word.length();i++){
			stack1.push(String.valueOf(word.charAt(i)));
		}
		
		String backwards = "";
		for(int i = 0;i<word.length();i++){
			backwards = backwards + stack1.pop();
		}
		System.out.println("Reversed: " + backwards);
		
		if(word.equals(backwards)) System.out.println(word + " is a palindrome.");
		else System.out.println(word + " is not a palindrome.");
		scan.close();
	}
}