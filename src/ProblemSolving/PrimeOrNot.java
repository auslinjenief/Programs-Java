package ProblemSolving;
import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		int f=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				f++;
			}
		}
		if(f==2) {
			System.out.println("Prime number");
		}
		else if(f>2) {
			System.out.println("Not a prime");
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
