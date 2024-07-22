import java.util.Scanner;
public class ifStatement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		System.out.println("Enter your age : ");
		age = scan.nextInt();
		if(age>=18)
		{
			System.out.println("You are Eligible for vote");
		}
		else
		{
			System.out.println("You are not Eligible for vote");
		}
	}

}
