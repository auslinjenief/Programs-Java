
import java.util.Scanner;
public class WhileLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n=scan.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
	
}
