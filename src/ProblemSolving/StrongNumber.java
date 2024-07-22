package ProblemSolving;
import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		int org = n;
		int rem, fact, sum=0;
		while(n>0) {
			rem = n%10;
			fact=1;
			for(int i=1;i<=rem;i++) {
				fact*=i;//fact = fact*i
			}
			sum+=fact;
			n=n/10;
		}
		if(org==sum) {
			System.out.println(org +" is a strong number");
	}
		else {
			System.out.println("Not a strong number");
		}
	
	}

}
