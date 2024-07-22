package ProblemSolving;
import java.util.Scanner;
public class SwitchCalculator {
	public static void main(String[] args) {
		int a,b,c,ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your choice : ");
		ch = scan.nextInt();
		System.out.println("Enter 2 numbers : ");
		a=scan.nextInt();
		b=scan.nextInt();
		switch(ch)
		{
		case 1:
			c=a+b;
			System.out.println("Your ans is : "+c);
			break;
		case 2:
			c=a-b;
			System.out.println("Your ans is : "+c);
			break;
		case 3:
			c=a*b;
			System.out.println("Your ans is : "+c);
			break;
		case 4:
			c=a/b;
			System.out.println("Your ans is : "+c);
			break;
			
			default:
				System.out.println("Invalid Input !!!! Plz check");
			break;
		}
	}
}
