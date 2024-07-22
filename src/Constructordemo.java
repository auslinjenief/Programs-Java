// Default and parameterized constructor


class abcd 
	{
		int num1;
		int num2;
		int num3;
		int result;
		
		abcd(int a,int b)
		{
			num1 = a;
			num2 = b;
		}
		abcd(int a,double b)
		{
			num1 = a;
			num2 = (int) b;
		}
		abcd()
		{
			System.out.println("Default constructor");
		}
		void display()
		{
			result = num1 + num2;
			System.out.println("Result : "+ result);
		}
	}

public class Constructordemo {
	public static void main(String[] args) {
		abcd obj = new abcd(10,15);
		abcd obj2 = new abcd(25,2.0);
		abcd obj1 = new abcd();
		obj.display();
		obj2.display();
	}

}
