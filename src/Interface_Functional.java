
@FunctionalInterface   //---only one method 
interface Inter
{
	void display();
}
//class myinter implements Inter
//{
//	public void display()
//	{
//		System.out.println("In display");
//	}
//}
public class Interface_Functional {
	public static void main(String args[]) {
		Inter m = new Inter()
				{
			public void display()                     //Anonymous inner class
			{
				System.out.println("In display");
			}
				};
		m.display();
	}
}
