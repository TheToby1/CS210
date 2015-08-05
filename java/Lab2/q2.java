/*An old woman goes to market and a horse steps on her basket and crushes the
eggs. The rider offers to pay for the damages and asks her how many eggs she had
brought. She does not remember the exact number, but when she had taken them
out two at a time, there was one egg left. The same happened when she picked
them out three, four, five, and six at a time, but when she took them seven at a time
they came out even. Write a program that figures out the smallest number of eggs
she could have had.*/
public class q2 {
	public static void main(String args[]){
		boolean count = true;
		int i = 0;
		while(count==true){
			i=i+7;
			for(int j=i-1;j==i-1;j++){
				if(j%6==0&&j%5==0&&j%4==0&&j%3==0&&j%2==0){
					count = false;
				}
			}
		}
		System.out.println(i);
	}
}