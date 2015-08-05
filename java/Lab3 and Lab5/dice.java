//dice constructor
public class dice {
	private int num;
	
	public dice(){
		num = 0;
	}
	
	public void roll(){
		//num = (int)(Math.ceil(Math.random()*6.0));
		num = (int)((Math.random()*6.0)+1);
	}

	public int getValue(){
		return num;
	}
}