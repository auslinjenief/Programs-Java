package ProblemSolving;
import java.util.Scanner;
public class Tables {
	public static void main(String args[]) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter the table :");
		int t = scan.nextInt();
		System.out.println("Enter the limit :");
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i+" X "+t+" = "+(t*i));
		}
	}

}
