import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class BufferedReaderdemo {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter the NUM or string");
//		String ans = br.readLine();
		int i = Integer.parseInt(br.readLine());
		System.out.println("Your des is : "+i*i);
	}

}
