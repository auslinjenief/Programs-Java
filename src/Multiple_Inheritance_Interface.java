interface ParentA
{
	void display();
}
interface ParentB
{
	void show();
}

class myclass
{
	public void sample()
	{
		System.out.println("In sample");
	}
}

class ChildA extends myclass implements ParentA,ParentB
{
	public void display()
	{
		System.out.println("In display");
	}
	public void show()
	{
		System.out.println("In show");
	}
}

public class Multiple_Inheritance_Interface{
	public static void main(String[] args) {
		ChildA c = new ChildA();
		c.display();
		c.show();
		c.sample();
	}
}
