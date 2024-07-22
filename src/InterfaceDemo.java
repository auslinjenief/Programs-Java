
interface Aa
{
	int age = 23; // static and final
	public abstract void display();//public abstract is default
	void show();
}

class B implements Aa
{
	@Override
	public void display()
	{
		System.out.println("In Display....");
	}

	@Override
	public void show() 
	{
	System.out.println("In Show........");		
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		B imp = new B();
		imp.display();
		imp.show();
		int val = Aa.age;
		System.out.println(val);
	}

}
