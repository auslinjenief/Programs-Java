package ProblemSolving;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the limit :");
		int n = scan.nextInt();
		int sum = 0,a;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the number for "+i+" : ");
			a = scan.nextInt();
			sum  = sum+a;
		}
		System.out.println("The sum is :"+sum);
		System.out.println("The average is :"+sum/n);
	}

}
