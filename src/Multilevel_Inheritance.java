
class grandparent
{
	int a;
	void display()
	{
		System.out.println("grandparent");
	}
}
class parent extends grandparent
{
	int b;
	void show()
	{
		System.out.println("parent");
	}
}
class child extends parent
{
	int c;
	void view()
	{
		System.out.println("Child");
	}
}
public class Multilevel_Inheritance {
	public static void main(String args[]) {
		child c = new child();
		c.a = 25;
		c.b = 10;
		c.c = 85;
		c.display();
		c.show();
		c.view();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
	}
	
}
