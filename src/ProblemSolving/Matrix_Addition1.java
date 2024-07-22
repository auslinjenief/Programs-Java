package ProblemSolving;

public class Matrix_Addition1 {
	public static void main(String args[]) {
		int a[][] = {
				{1,2},
				{4,5}
		};
		int b[][]= {
				{6,7},
				{8,9}
		};
		int c[][] = new int[a.length][b[0].length];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
			    c[i][j] = a[i][j] + b[i][j];
			    System.out.print(c[i][j] + " ");

			}
			System.out.println();
			
		}
	}

}
	
