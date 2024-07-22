import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBuffer_demo {
	public static void main(String[] args) throws IOException {
		StringBuffer obj = new StringBuffer("Auslin");
		obj.reverse();
		obj.append(" Jenief");
		System.out.println(obj);
		StringBuffer obj1 = new StringBuffer("Welcome");
		System.out.println(obj1.charAt(2));
		System.out.println(obj1.indexOf("c"));
		System.out.println(obj1.insert(7, " boys"));
		System.out.println(obj1.delete(7, 8));  //length - 1
		System.out.println(obj1.deleteCharAt(6));
		System.out.println(obj1.replace(6, 10, "girls"));
		obj1.setCharAt(0, 'd'); 
		System.out.println(obj1);
		
		StringBuilder sb = new StringBuilder("Apple");
		sb.reverse();
		System.out.println(sb);
		
		
//=================================================================================		
		//BufferedReadr ---> to get input from the user similar to Scanner class
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("What is your name : ");
		String a = br.readLine();
		System.out.println("My name is "+a);
	}

}
