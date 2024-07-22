
                             //using variable length arguments
class addition
{
 //	int add(int i,int j)
//	{
//		return i+j;	
//	}
//	int add(int i,int j,int k)
//	{
//		return i+j+k;	
//	}
	int sum = 0;
	public int add (int ... i)
	{
		for(int val : i)
		{
			sum = sum+val;
		}
		return sum;
	}
	
}
public class MethodOverloading_2 {
	public static void main(String[] args) {
		addition obj =  new addition();
		int ans = obj.add(5,4,6,8);
		System.out.println(ans);
	}

}
