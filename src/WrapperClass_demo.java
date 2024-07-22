
public class WrapperClass_demo {
	public static void main(String args[]) {
		//boxing
		int i = 5;
		Integer a = new Integer(5);
		System.out.println(a);
		
		//auto-boxing
		Integer a1 = i;
		System.out.println(a1);
		
		//Unboxing
		int val = a1.intValue();
		System.out.println(val);
		
		//auto-unboxing
		int val1 = a1;
		System.out.println(val1);
	}

}
