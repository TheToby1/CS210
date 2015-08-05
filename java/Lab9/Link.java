/*constructor for links*/
public class Link {
	  public String iData;
	  public Link next;

	  public Link(String id) {
	    iData = id;
	  }

	  public String toString() {
	    return "{" + iData + "} ";
	  }
}