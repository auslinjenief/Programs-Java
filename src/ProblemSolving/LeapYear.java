package ProblemSolving;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year to check leap year or not : ");
		year=scan.nextInt();
		if(year%4==0 || (year%100==0 && year%400==0))
		{
			System.out.println("The year is leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}

}
