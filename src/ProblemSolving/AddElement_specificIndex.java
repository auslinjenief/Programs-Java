package ProblemSolving;
import java.util.*;
public class AddElement_specificIndex {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no.of values :");
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value of "+i);
			a[i] = scan.nextInt();
		}
		System.out.println("The values are : "+Arrays.toString(a));
		
		System.out.println("Enter the index value to want to change : ");
		int index = scan.nextInt();
		System.out.println("Enter the value to change : ");
		int value = scan.nextInt();
		
		for(int i=a.length-1;i>index;i--) {
			a[i] = a[i-1];
		}
		a[index] = value;
		System.out.println(Arrays.toString(a));
	}

}
