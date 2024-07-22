package ProblemSolving;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value :");
		int n = scan.nextInt();
		int sum = 0, org=n;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum +=i;
			}
		}
		if(sum==org) {
			System.out.println("Perfect number...!!");
		}
		else {
			System.out.println("Not a perfect number...!!");
		}
	}

}
