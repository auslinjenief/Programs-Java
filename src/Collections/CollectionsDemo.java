package Collections;
import java.util.*;

public class CollectionsDemo {
	public static void main(String args[]) {
		Collection<Integer> c = new ArrayList<Integer>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(10);
		c.add(10);
		
		while(c.contains(10)) {
			c.remove(10);
		}
		System.out.println(c);
	}

}
