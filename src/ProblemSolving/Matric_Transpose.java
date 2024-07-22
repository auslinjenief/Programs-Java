package ProblemSolving;

public class Matric_Transpose {
	public static void main(String[] args) {
		
		// 2*3 matrix we need change in 3*2 matrix
		int a[][] = {
				{1,2,0},
				{4,5,6}
		};
		int b [][] = new int[a[0].length][a.length];
		
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				b[i][j] = a[j][i];
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}
}
