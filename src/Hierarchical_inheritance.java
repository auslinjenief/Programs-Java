class A
{
	void display()
	{
		System.out.println("Parent");
	}
}

class C1 extends A      //we can't able to access both child classes
{
	void show()
	{
		System.out.println("Child 1");
	}
}

class C2 extends A
{
	void view()
	{
		System.out.println("Child 2");
	}
}

public class Hierarchical_inheritance{
	public static void main(String args[]) {
		C2 c = new C2();
		c.display();
		c.view();
		
	}
}