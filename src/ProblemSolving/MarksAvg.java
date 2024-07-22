package ProblemSolving;
import java.util.Scanner;
public class MarksAvg {
	public static void main(String args[])
	{
		float m;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the mark to check the average :");
		m = scan.nextFloat();
		if(m>=90 && m<=100 )
		{
			System.out.println("Grade A");
		}
		else if(m>=70 && m<=89)
		{
			System.out.println("Grade B");
		}
		else if(m>=50 && m<=69)
		{
			System.out.println("Grade C");
		}
		else if(m>=35 && m<=49)
		{
			System.out.println("Grade D");
		}
		else if(m<35)
		{
			System.out.println("Fail ...!");
		}
		else
		{
			System.out.println("Invalid input");
		}
		scan.close();
	}
		
	}
