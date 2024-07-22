                    
/*
 -->Note that the private inner class can only be accessed 
 within the scope of the outer class.
 -->Outside the OuterClass, the private inner class is not accessible.
 */
class outer1
{
	private class inner
	{
		public void display()
		{
			System.out.println("This is an private inner class ");
		}
	}
	public void getaccess()
	{
		inner in = new inner();
		in.display();
	}
}
public class InnerClass_private {
	public static void main(String args[]) {
		outer1 ou = new outer1();
		ou.getaccess();
	}

}
