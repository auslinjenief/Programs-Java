package ProblemSolving;
import java.util.Scanner;
public class nestedIf {
	public static void main(String[] args) {
		
		
		/*
		 A company insures its drivers in the following cases :
		 	a.If the driver is married.
		 	b.If the driver is unmarried, male & above 30 years of age.
		 	c.If the driver is unmarried, female & above 25 years of age.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a marital status M/U");
		char marital = scan.next().charAt(0);
		if(marital == 'u' || marital == 'U')
		{
			System.out.println("Enter your age M/F :");
			char gender = scan.next().charAt(0);
			System.out.println("Enter your age :");
			int age = scan.nextInt();
			if((gender =='m' || gender =='M') && age>=30)
			{
				System.out.println("You are eligible for Insurance !");
			}
			else if((gender =='f' || gender =='F') && age>=25)
			{
				System.out.println("You are eligible for Insurance !");
			}
			else
			{
				System.out.println("You are not eligible for Insurance ...");
			}
			
		}
		else if(marital=='m' || marital=='M')
		{
			System.out.println("You are eligible for Insurance");
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
		
		
	}

}
