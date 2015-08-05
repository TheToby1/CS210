/*If a chessboard was to have wheat placed upon each square such that one grain was
* placed on the first square, two on the second, four on the third, and so on (doubling
* the number of grains on each subsequent square), how many grains of wheat would
* be on the chessboard at the finish? Write a program to figure it out
*/
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