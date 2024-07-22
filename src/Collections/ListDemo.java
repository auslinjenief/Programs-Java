package Collections;

import java.util.*;

public class ListDemo {
	public static void main(String args[]) {
		ArrayList<Integer> c = new ArrayList<Integer>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(10);
		c.add(10);
		c.add(1, 50);//insert value using index value
		int a = c.remove(c.indexOf(20));
		System.out.println(c);
		System.out.println(c.get(2));
		System.out.println(c.size());
		
	}
}
