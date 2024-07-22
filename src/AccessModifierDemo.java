/*
               ->  public and default only allowed in class
               ->  protected and private are allowed in inner class
*/
//class outera
//{
//	protected class innera
//	{
//		public void display()
//		{
//			System.out.println("Inside the display....!!");
//		}
//		
//	}
//}
//public class AccessModifierDemo {
//	public static void main(String[] args) {
//		outera o = new outera();
//		outera.innera in = o.new innera();
//		in.display();
//	}
//
//}

public class AccessModifierDemo{
	public static void main(String[] args) {
		out o = new out();
		o.method();
	}
	        public void show()
	        {
	        	System.out.println("Inside the show...!");
	        }
}
class out extends AccessModifierDemo
{
	void method()
	{
		out o = new out();
		o.show();
	}
}
class outside
{
	public void outmethod()
	{
		AccessModifierDemo amd = new AccessModifierDemo();
		amd.show();
	}
	
}


