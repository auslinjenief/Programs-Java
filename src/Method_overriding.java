
// both method name should be same
//Static and Final keyword shoud not be given
class parentp
{
	void display()
	{
		System.out.println("Parent");
	}
}

class childc extends parentp
{
	void display()
	{
		System.out.println("Child");
	}
}
public class Method_overriding {
	public static void main(String args[]) {
		childc c = new childc();
		c.display();
	}

}
