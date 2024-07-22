package ProblemSolving;
import java.util.*;
public class reverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to reverse : ");
		int n = scan.nextInt();
		int reverse=0 , rem;
		while(n!=0)
		{
			rem = n%10;
			reverse = (reverse*10)+rem;
			n=n/10;
		}
		System.out.println(reverse);
	}

}

