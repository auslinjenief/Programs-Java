package ProblemSolving;


//Write a program to find the armstrong number from 100 to 999
public class ArmstrongNumber2 {
	public static void main(String args[]) {
		int a,b,c,temp;
		for(int i = 100;i<=999;i++)
		{
			temp = i;
			c = temp%10;
			temp = temp/10;
			
			b = temp%10;
			temp = temp/10;
			
			a = temp%10;
			
			int result =(a*a*a)+(b*b*b)+(c*c*c);
			
			if(i == result)
			{
				System.out.println(i+" is a armstrong number");
			}
		}
	}

}
