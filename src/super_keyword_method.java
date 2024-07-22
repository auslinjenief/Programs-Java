
//Super Keyword:-
//1.Achieved by Inheritance Concept
//2 Used to access immediate parent class variables, methods
//and constructors from child class
//Note: Name of Base class and derived class variables, methods
//and constructors should be same.
//Super keyword in constructor is default in first. 


class abc
{
	int a = 10;
	void show()
	{
		System.out.println("In parent class");
	}
}
class cba extends abc
{
	int a = 20;
	void show()
	{
		super.show();
		System.out.println("In child class");
		System.out.println("a = "+a);
		System.out.println("a = "+super.a);
	}
}
public class super_keyword_method {
	public static void main(String[] args) {
		cba c = new cba();
		c.show();
	}

}
