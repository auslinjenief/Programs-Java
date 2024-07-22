package ProblemSolving;

import java.util.Scanner;

public class GroupSwitchProgram {
	public static void main(String[] args) {
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any letter (a-z) to check Vowel or not : ");
		char v = scan.next().charAt(0);
		switch(v)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Vowel letter.........");
				break;
				default:
					System.out.println("Not a Vowel..........");
					break;
		}
	}

	}

}
