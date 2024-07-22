
//Super Keyword:-
//1.Achieved by Inheritance Concept
//2 Used to access immediate parent class variables, methods
//and constructors from child class
//Note: Name of Base class and derived class variables, methods
//and constructors should be same.
//Super keyword in constructor is default in first. 
class demo1
{
	demo1()
	{
		System.out.println("parent class");
	}
	
	demo1(int val)
	{
		System.out.println("In parent : "+val);
	}
}

class demo2 extends demo1
{
	demo2()
	{
		System.out.println("Child class");
	}

	public demo2(int i) 
	{
		super(10);
		System.out.println(i);
	}
}
public class Super_keyword_constructor {
	public static void main(String[] args) {
		demo2 d2 = new demo2(10);
	}

}
