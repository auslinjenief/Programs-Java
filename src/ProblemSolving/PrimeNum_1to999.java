package ProblemSolving;
import java.util.Scanner;
public class PrimeNum_1to999 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int f =0;
		for(int n=1;n<=20;n++) {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					f++;
				}
			}
			if(f==2) {
				System.out.println(n+" is a prime number");
			}	
			f=0;
		}
		
	}

}
