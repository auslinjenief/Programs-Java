//innerclass inside the method

class outer2
{
	public void display()
	{
		class inner2
		{
			public void show() 
			{
				System.out.println("This is method inner class");
			}
		}
		
		inner2 in = new inner2();
		in.show();
	}
	
}
public class InnerClass_methodLocal {
	public static void main(String args[]) {
		outer2 ou = new outer2();
		ou.display();
	}

}
