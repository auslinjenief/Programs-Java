package ProblemSolving;
import java.util.*;

//find the 3 digit number armstrong number or not
public class ArmstrongNumber1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		int temp = n;
		int digit1, digit2, digit3;
		
		digit3 = temp%10;
		temp = temp/10;
		
		digit2 = temp%10;
		temp = temp/10;
		
		digit1 = temp%10;
		temp = temp/10;
		
		int result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
		if(n==result) {
			System.out.println(n+" is an Armstrong number");
		}
		else {
			System.out.println(n+" is not an Armstrong number");
		}
	}	
}
