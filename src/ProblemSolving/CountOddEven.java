package ProblemSolving;
import java.util.Scanner;
public class CountOddEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit :");
		int n = scan.nextInt();
		int a[] = new int[n];
		int e=0,o=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value of "+i);
			a[i] = scan.nextInt();
		}
		for(int val : a) {
			if(val%2==0) {
				e++;
			}
			else {
				o++;
			}
		}
		System.out.println("Total odd no : "+o);
		System.out.println("Total even no : "+e);
	}

}
