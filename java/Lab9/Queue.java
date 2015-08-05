/*contructor for queue using double-ended
singly-linked list*/
public class Queue {
	private FirstLastList thelist;
    private int size,length;

    public Queue(int sizein){
    	size=sizein;
    	thelist = new FirstLastList();
    }

    public void insert(String name){
    	thelist.insertLast(name);
    	length++;
    	System.out.println(thelist);
    }

    public String remove(){
    	length--;
    	String temp = thelist.deleteFirst();
    	System.out.println(thelist);
        return (temp);
    }

    public boolean isEmpty(){
           return (size==0);
    }

    public int getSize(){
           return length;
    }
}