/*A Stack class which contains push( ) and pop( )
methods. Also includes a private method in the class which is called after each
stack operation and prints out the current contents of the stack so you can see it
changing.*/
package lab8;

public class Stack {
	private int maxsize;
	private String[] stackar;
	private int top;
	
	public Stack(int n){
		maxsize = n;
		stackar = new String[maxsize];
		top = -1;
		
		printarray(stackar);
	}
	
	public void push(String s){
		top++;
		stackar[top] = s;
		
		printarray(stackar);
	}
	
	public String pop(){
		String temp = stackar[top];
		top--;
		printarray(stackar);
		return temp;
	}
	
	private void printarray(String ar[]){
		for(int i = maxsize-1;i>-1;i--){
			if(i<=top) System.out.println("|_" + ar[i] + "_|");
			else System.out.println("|___|");
			
		}
		System.out.println();
	}

}
