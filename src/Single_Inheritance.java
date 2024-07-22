
class parentt1
{
	int a;
	void display()
	{
		System.out.println("parent");
	}
}

class child1 extends parentt1
{
	int b;
	void view()
	{
		System.out.println("child");
	}
}




public class Single_Inheritance {
	public static void main(String[] args) {
		child1 c = new child1();
		c.a = 10;
		c.b = 20;
		c.display();
		c.view();
		System.out.println(c.a);
		System.out.println(c.b);
	}

}
