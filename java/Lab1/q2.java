package lab1;

public class q2 {
	
	public static void main(String args[]){
		
		double count = 1,total=0;
		
		for(int i=0;i<64;i++){
			total=total+count;
			count=count*2;
			
		}
		
		System.out.println(total);
		
	}

}
