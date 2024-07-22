package ProblemSolving;
import java.util.Scanner;
public class RemoveWhiteSpacesInString {
	public static void main(String args[]) {
		String input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string that you want to remove all white spaces : ");
		input = scan.nextLine();
		String ans = input.replaceAll("\\s", "");
		System.out.println(ans);
	}

}