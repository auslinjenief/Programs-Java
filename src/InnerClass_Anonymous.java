//Anonymous innerclass// we can use this instead of overriding
class Test
{
	public void test()
	{
		System.out.println("This is test 1");
	}
}
//class NewTest
//{
//	public void test()
//	{
//		System.out.println("This is new test");
//	}
//}
public class InnerClass_Anonymous {	
	public static void main(String args[]) {
		Test t = new Test()
				{
					public void test()
					{
						System.out.println("This is new test");
					}
				};
		t.test();
	}

}
