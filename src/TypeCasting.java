
public class TypeCasting {
	public static void main(String args[]) 
	{
		//Widening casting (Smaller to bigger datatype)
		int a = 10;
		double b = a;
		System.out.println("Int : "+a);	
		System.out.println("Double : "+b);
		//Narrowing casting (Bigger to smaller datatype)
		double d = 100;
		int i = (int)b;
		System.out.println("Int : "+d);
		System.out.println("Int : "+i);
	}

}
