package lab9;

public class tester {
	public static void main(String[] args) {
	    FirstLastList theList = new FirstLastList();

	    theList.insertLast("Toby");
	    theList.insertLast("Keryn");
	    theList.insertLast("John");

	    System.out.println(theList);

	    theList.deleteFirst();
	    theList.deleteFirst();

	    System.out.println(theList);
	  }

}
