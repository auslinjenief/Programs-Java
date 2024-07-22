
public class Foreach_loop {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		
		for(int ans : a)
		{
			System.out.println(ans);
		}
		
		int b[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int temp[] : b)
		{
			for(int answer : temp)
			{
				System.out.print(answer + " ");
			}
			System.out.println();
		}
	}

}
