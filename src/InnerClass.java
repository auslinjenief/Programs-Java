

class outer
{
	class inner
	{
		public void show()
		{
			System.out.println("This is a inner class ");
		}
	}
}
public class InnerClass {
	public static void main(String[] args) {
		outer o = new outer();
		//object creation for nested inner class
		outer.inner obj = o.new inner();
		obj.show();
	}

}
