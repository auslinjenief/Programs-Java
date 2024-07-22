package ProblemSolving;
import java.util.Scanner;
public class Largest_in_array {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter Array values : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = scan.nextInt();
		}
		int max = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("The maximum number is : "+ max);
		
	}

}
