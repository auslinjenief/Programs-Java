import java.util.Scanner;
public class DoWhileLopp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n = scan.nextInt();
		int i = 2;
		do 
		{
			System.out.println(i);
			i=i+2;		
		}while(i<=n);
	}

}
