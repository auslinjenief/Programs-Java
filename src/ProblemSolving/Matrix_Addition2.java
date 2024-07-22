package ProblemSolving;
import java.util.Scanner;
public class Matrix_Addition2 {
	public static  void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of row for 1st matrix :");
		int row1 = scan.nextInt();
		System.out.println("Enter no of col for 1st matrix :");
		int col1 = scan.nextInt();
		
		System.out.println("Enter no of row for 2nd matrix :");
		int row2 = scan.nextInt();
		System.out.println("Enter no of col for 2nd matrix :");
		int col2 = scan.nextInt();
		
		if(row1==row2 && col1==col2)
		{
			int a[][] = new int[row1][col1];
			int b[][] = new int[row2][col2];
			
//			int c[][] = new int[a.length][a[0].length];
			int c[][] = new int[row1][col1];
		
			System.out.println("Enter for matrix 1 :");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.println("Enter value for "+i+" , "+j+" ");
					a[i][j] = scan.nextInt();
				}
			}
			
			System.out.println("Enter for matrix 2 :");
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
				{
					System.out.println("Enter value for "+i+" , "+j+" ");
					b[i][j] = scan.nextInt();
				}
			}
			
		    System.out.println("Resultant matrix :");
		    for(int i=0;i<a.length;i++)
		    {
		    	for(int j=0;j<a[i].length;j++)
		    	{
		    		c[i][j] = a[i][j] + b[i][j];
		    		System.out.print(c[i][j] + " ");
		    	}
		    	System.out.println();
		    }
			
			
			
		}
		else
		{
			System.out.println("Order of matrices should be same");
		}
	}

}
