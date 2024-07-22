package ProblemSolving;

import java.util.Scanner;

public class Smallest_in_array {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter the array values :");
		for(int i=0;i<a.length;i++)
		{
			a[i] = scan.nextInt();
		}
		int min = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
			
		}
		System.out.println("The smallest num is :" +min);
	}

}
