
// The inner class is static 
class outerclass
{
	 static class innerclass
	{
	    void display()
		{
			System.out.println("This is an static inner class ");
		}
	}
}
public class InnerClass_static {
	public static void main(String args[]) {
		outerclass oc = new outerclass();
		// creating object for static nested inner class
		outerclass.innerclass obj = new outerclass.innerclass();
		obj.display();
	}

}
