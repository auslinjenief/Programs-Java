import java.util.Scanner;
public class Multi_Array {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int row = scan.nextInt();
		System.out.println("Enter no of columns : ");
		int col = scan.nextInt();
		
		int a[][] = new int[row][col];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter the value for "+i+" "+j);
				a[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
