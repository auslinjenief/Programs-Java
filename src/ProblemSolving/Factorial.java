package ProblemSolving;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the number to find the factorial");
		 int n = scan.nextInt();
		 int temp = 1;
		 for(int i=1;i<=n;i++)
		 {
			 temp = temp * i; 
		 }
		 System.out.println(temp);
	}

}
