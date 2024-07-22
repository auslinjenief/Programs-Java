import java.util.Scanner;
public class GettingInputs {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int a,b,c;
		System.out.println("We can find a^2 + b^2 + 2*a*b");
		System.out.println("Enter the values for a : ");
		a=scan.nextInt();
		System.out.println("Enter the values for b : ");
		b=scan.nextInt();
		c = (a*a)+(b*b)+2*a*b;
		System.out.println(c);
		double d = c;
		System.out.println(d);
		
		
		
	}

}
