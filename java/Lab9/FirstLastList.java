/*Constructor and methods for double-ended
singly-linked list */
public class FirstLastList {
	private Link first;
	private Link last;

	public FirstLastList() {
	first = null;
	last = null;
	}

	public boolean isEmpty() {
	return first == null;
	}

	public void insertLast(String name) {
	Link newLink = new Link(name);

	if (isEmpty())
	  first = newLink;
	else
	  last.next = newLink;
	last = newLink;
	}

	public String deleteFirst() {
	String temp = first.iData;
	if (first.next == null)
	  last = null;
	first = first.next;
	return temp;
	}

	public String toString() {
	String str = "";
	Link current = first;
	while (current != null) {
	  str += current.toString();
	  current = current.next;
	}
	return str;
	}

}
