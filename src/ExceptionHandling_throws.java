class exc
{
	public void owner() throws NullPointerException
	{
		String str = null;
		System.out.println(str.length());
	}
	public void slave()
	{
		try 
		{
			owner();
		}
		catch(NullPointerException e) 
		{
			System.out.println("Excep :"+e);
		}
	}
}
public class ExceptionHandling_throws {
	public static void main(String[] args) throws Exception{
		exc s = new exc();
		s.slave();
	}

}
